package med.vol.api.controller;

import jakarta.validation.Valid;
import med.vol.api.entitie.paciente.DadosCadastropaciente;
import med.vol.api.entitie.paciente.Paciente;
import med.vol.api.entitie.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @PostMapping
    @Transactional
    public void cadastroPaciente(@RequestBody @Valid DadosCadastropaciente dados){
        repository.save(new Paciente(dados));
    }
}
