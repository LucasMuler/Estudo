package med.vol.api.controller;

import med.vol.api.entitie.medico.DadosCadastroMedico;
import med.vol.api.entitie.medico.MedicoRepository;
import med.vol.api.entitie.medico.medico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedico dados){
        repository.save(new medico(dados));
    }

}
