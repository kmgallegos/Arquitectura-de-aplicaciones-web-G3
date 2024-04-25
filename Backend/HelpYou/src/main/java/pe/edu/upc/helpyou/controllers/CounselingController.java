package pe.edu.upc.helpyou.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.helpyou.dtos.CounselingDTO;
import pe.edu.upc.helpyou.entities.Counseling;
import pe.edu.upc.helpyou.servicesinterfaces.ICounselingService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/counselings")
public class CounselingController {
    @Autowired
    private ICounselingService cS;

    @PostMapping
    public void registrar(@RequestBody CounselingDTO counselingDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Counseling counseling = modelMapper.map(counselingDTO, Counseling.class);
        cS.insert(counseling);
    }

    @GetMapping
    public List<CounselingDTO> list() {
        return cS.list().stream()
                .map(counseling -> {
                    ModelMapper modelMapper = new ModelMapper();
                    return modelMapper.map(counseling, CounselingDTO.class);
                }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        cS.delete(id);
    }

    @GetMapping("/{id}")
    public CounselingDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper modelMapper = new ModelMapper();
        CounselingDTO dto = modelMapper.map(cS.listId(id), CounselingDTO.class);
        return dto;
    }
}
