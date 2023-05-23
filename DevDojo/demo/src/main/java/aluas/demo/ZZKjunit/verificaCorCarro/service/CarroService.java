package aluas.demo.ZZKjunit.verificaCorCarro.service;

import aluas.demo.ZZKjunit.verificaCorCarro.dominio.Carro;
import aluas.demo.ZZKjunit.verificaCorCarro.dominio.Cor;

public class CarroService {

    public boolean sameColor(Carro carro, Cor cor){
        return carro.getColor() == cor;
    }

}
