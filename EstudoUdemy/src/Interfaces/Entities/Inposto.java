package Interfaces.Entities;

public class Inposto {

    private EstadiaCarro estadiaCarro;

    public Inposto(EstadiaCarro estadiaCarro) {
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
