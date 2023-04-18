package med.vol.api.controller;

import jakarta.validation.Valid;
import med.vol.api.entitie.medico.DadosCadastroMedico;
import med.vol.api.entitie.medico.MedicoRepository;
import med.vol.api.entitie.medico.dadosListagemMedico;
import med.vol.api.entitie.medico.medico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados){
        repository.save(new medico(dados));
    }

    @GetMapping
    public List<dadosListagemMedico> listar(){
        return repository.findAll().stream().map(dadosListagemMedico::new).toList();
    }

}
