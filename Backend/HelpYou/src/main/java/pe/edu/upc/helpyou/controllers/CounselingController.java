package pe.edu.upc.helpyou.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.helpyou.dtos.CounselingByUserDTO;
=======
import org.springframework.web.bind.annotation.*;
>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4
import pe.edu.upc.helpyou.dtos.CounselingDTO;
import pe.edu.upc.helpyou.entities.Counseling;
import pe.edu.upc.helpyou.servicesinterfaces.ICounselingService;

<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4
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

<<<<<<< HEAD
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




=======
>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4
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
<<<<<<< HEAD

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
=======
>>>>>>> d78e6a716b12648eb1b9dd204ce477dc0b2853b4
}
