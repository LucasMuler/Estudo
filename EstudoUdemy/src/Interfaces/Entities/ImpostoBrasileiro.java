package Interfaces.Entities;

import Interfaces.interfaces.Taixas;

public class ImpostoBrasileiro implements Taixas {

    private EstadiaCarro estadiaCarro;

    public ImpostoBrasileiro(EstadiaCarro estadiaCarro) {
        this.estadiaCarro = estadiaCarro;
    }

    public EstadiaCarro getEstadiaCarro() {
        return estadiaCarro;
    }

    public double calcTax(){

        if(estadiaCarro.getTotal() <= 100){
            return estadiaCarro.getTotal() * 0.2;
        } else{
            return  estadiaCarro.getTotal() * 0.15;
        }
    }
}
