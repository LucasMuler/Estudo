package aluas.demo.ZZKjunit.verificaCorCarro.service;

import aluas.demo.ZZKjunit.verificaCorCarro.dominio.Carro;
import aluas.demo.ZZKjunit.verificaCorCarro.dominio.Cor;

public class CarroService {

    public boolean verifySameColor(Carro carro, Cor cor){
        if(carro == null){
            throw new NullPointerException();
        } else if (cor == null) {
            throw new NullPointerException();
        }
        return carro.getColor() == cor;
    }

}
