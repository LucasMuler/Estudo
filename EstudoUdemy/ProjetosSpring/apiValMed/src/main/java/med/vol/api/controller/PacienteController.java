package med.vol.api.controller;

import med.vol.api.entitie.paciente.DadosCadastropaciente;
import med.vol.api.entitie.paciente.Paciente;
import med.vol.api.entitie.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("paciente")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @PostMapping
    public void cadastroPaciente(@RequestBody DadosCadastropaciente dados){
        repository.save(new Paciente(dados));
    }
}
