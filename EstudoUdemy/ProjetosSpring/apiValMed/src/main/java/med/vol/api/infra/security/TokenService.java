package med.vol.api.infra.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import med.vol.api.domain.usuario.Usuario;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

@Service
public class TokenService {

    @Value("${api.security.token.secret}")
    private String secret;

    /**
     * Metodo que cria token utilizando o algoritimo do HMAC256, este token identifica o usuario, mostra quem o gera, pega o id
     * e gera uma data de expiracao a partir do metodo abaixo
     * @param usuario
     * @return
     */
    public String gerarToken(Usuario usuario){
        try {
            var algoritimo = Algorithm.HMAC256(secret);//criando um algoritimo utilizado, foi utilizado um algoritimo mais simples HMAC256 e o mesmo usa uma senha
            return JWT.create()
                    .withIssuer("API Voll.med") // indentificacao de quem está gerando o token
                    .withSubject(usuario.getLogin()) // apresenta quem e o dono deste token
                    .withClaim("id", usuario.getLogin()) // caso queira guardar mais informacoes pode usar este metodo (pode chamar varias vezes )
                    .withExpiresAt(dataExpiracao())
                    .sign(algoritimo);// reusable verifier instance
        } catch (JWTVerificationException exception){
            throw new RuntimeException("erro ao gerar token jwt", exception);
        }
    }

    public String getSubject(String tokenJWT){
        try {
            var algoritimo = Algorithm.HMAC256(secret);
            return JWT.require(algoritimo)
                    .withIssuer("API Voll.med")
                    .build()
                    .verify(tokenJWT)
                    .getSubject();
        } catch (JWTVerificationException exception){
            throw new RuntimeException("Token JWT inválido ou expirado!");
        }
    }


    /**
     * Cria um tempo de expiração que é de duas horas, o mesmo é calculado pegando o valor do tempo agora e adicionando dois, depoois convertendo
     * para a nossa região a partir do ZoneOffset
     * @return
     */
    private Instant dataExpiracao() {
        return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-03:00"));
    }

}
