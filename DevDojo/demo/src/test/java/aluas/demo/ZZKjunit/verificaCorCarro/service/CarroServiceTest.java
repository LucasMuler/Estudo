package aluas.demo.ZZKjunit.verificaCorCarro.service;

import aluas.demo.ZZKjunit.verificaCorCarro.dominio.Carro;
import aluas.demo.ZZKjunit.verificaCorCarro.dominio.Cor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        Assertions.assertTrue(carroService.sameColor(carroVermelho,vermelho));
    }

    @Test
    @DisplayName("Deve Retornar se a cor coincide com a de entrada de cor azul")
    void verificaCor_returnTrue_IfTheCollorIsEqualsAzul(){
        Assertions.assertTrue(carroService.sameColor(carroAzul,azul));
    }

    @Test
    @DisplayName("Deve Retornar falso pois a entrada é carro vermelho e cor azul")
    void verificaCor_returnFalse_IfTheCollorIsEqualAzul(){
        Assertions.assertFalse(carroService.sameColor(carroVermelho,azul));
    }

    @Test
    @DisplayName("Deve Retornar falso pois a entrada é carro azul e cor vermelho")
    void verificaCor_returnFalse_IfTheCollorIsEqualVermelho(){
        Assertions.assertFalse(carroService.sameColor(carroAzul,vermelho));
    }

}