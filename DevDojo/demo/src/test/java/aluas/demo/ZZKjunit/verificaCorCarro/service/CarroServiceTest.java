package aluas.demo.ZZKjunit.verificaCorCarro.service;

import aluas.demo.ZZKjunit.verificaCorCarro.dominio.Carro;
import aluas.demo.ZZKjunit.verificaCorCarro.dominio.Cor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarroServiceTest {

    private Carro carroVermelho;
    private Carro carroAzul;
    private Cor vermelho;
    private Cor azul;
    private CarroService carroService;

    @BeforeEach
    public void setUp(){
        vermelho = Cor.VERMELHO;
        azul = Cor.AZUL;
        carroAzul = new Carro(azul);
        carroVermelho = new Carro(vermelho);
        carroService = new CarroService();
    }

    @Test
    @DisplayName("Deve Retornar se a cor coincide com a de entrada de cor vermelho")
    void verificaCor_returnTrue_IfTheCollorIsEqualsVermelho(){
        Assertions.assertTrue(carroService.verifySameColor(carroVermelho,vermelho));
    }

    @Test
    @DisplayName("Deve Retornar se a cor coincide com a de entrada de cor azul")
    void verificaCor_returnTrue_IfTheCollorIsEqualsAzul(){
        Assertions.assertTrue(carroService.verifySameColor(carroAzul,azul));
    }

    @Test
    @DisplayName("Deve Retornar falso pois a entrada é carro vermelho e cor azul")
    void verificaCor_returnFalse_IfTheCollorIsEqualAzul(){
        Assertions.assertFalse(carroService.verifySameColor(carroVermelho,azul));
    }

    @Test
    @DisplayName("Deve Retornar falso pois a entrada é carro azul e cor vermelho")
    void verificaCor_returnFalse_IfTheCollorIsEqualVermelho(){
        Assertions.assertFalse(carroService.verifySameColor(carroAzul,vermelho));
    }

    @Test
    @DisplayName("Deve Retornar uma exception pois não tem entrada de carro")
    void verifyCarroNull_returnException_IfTheCarIsNull(){
        Assertions.assertThrows(NullPointerException.class, () -> carroService.verifySameColor(null,vermelho));
    }

    @Test
    @DisplayName("Deve Retornar uma exception pois não tem entrada de cor")
    void verifyCorNull_returnException_IfTheColorIsNull(){
        Assertions.assertThrows(NullPointerException.class, () -> carroService.verifySameColor(carroAzul,null));
    }
}