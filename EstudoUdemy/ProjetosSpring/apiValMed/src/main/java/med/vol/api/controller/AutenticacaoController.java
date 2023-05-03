package med.vol.api.controller;

import jakarta.validation.Valid;
import med.vol.api.domain.usuario.DadosAutenticacao;
import med.vol.api.domain.usuario.Usuario;
import med.vol.api.infra.security.TokenService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacaoController {

    @Autowired
    private AuthenticationManager manager;

    @Autowired
    private TokenService tokenService;

    /**
     * Recebe uma requisição do tipo post na URL acima, será direcionado para este bloco, que é responsavel
     * por efetuar o login, o mesmo recebe em seu corpo um arquivo Json que é utilizado para criar um DTO do
     * proprio Spring Security, o mesmo a partir da minha classe SecurityConfigurations irá relizar a autenticação
     * @param dados
     * @return
     */
    @PostMapping
    public ResponseEntity efetuarLogin(@RequestBody @Valid DadosAutenticacao dados){
        var token = new UsernamePasswordAuthenticationToken(dados.login(),dados.senha());
        var authentication = manager.authenticate(token);

        return ResponseEntity.ok(tokenService.gerarToken((Usuario) authentication.getPrincipal()));
    }

}
