package pe.edu.upc.helpyou.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.helpyou.dtos.CounselingByUserDTO;
import pe.edu.upc.helpyou.dtos.CounselingDTO;
import pe.edu.upc.helpyou.entities.Counseling;
import pe.edu.upc.helpyou.servicesinterfaces.ICounselingService;

import java.util.ArrayList;
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

    @GetMapping("/citas-por-usuario")
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public List<CounselingByUserDTO> counselingByUser() {
        List<String[]> filalista = cS.CounselingByUser();
        List<CounselingByUserDTO> dtolista = new ArrayList<>();

        for (String[] columna : filalista) {
            CounselingByUserDTO dto = new CounselingByUserDTO();
            dto.setUsuario((String) columna[0]);
                dto.setCantidad(Integer.parseInt(columna[1]));
            dtolista.add(dto);
        }
        return dtolista;
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

    @PutMapping("/{id}")
    public ResponseEntity<CounselingDTO> update(@PathVariable("id") Integer id, @RequestBody CounselingDTO counselingDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Counseling counseling = cS.listId(id);
        if (counseling != null) {
            Counseling updatedCounseling = modelMapper.map(counselingDTO, Counseling.class);
            updatedCounseling.setIdCounseling(id);
            cS.update(updatedCounseling);
            CounselingDTO responseDto = modelMapper.map(updatedCounseling, CounselingDTO.class);
            return ResponseEntity.ok(responseDto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
