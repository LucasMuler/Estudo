package rh.src.br.com.alura.rh.service;

import rh.src.br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class ReajusteService {

    public BigDecimal reajusteDeSalario(Funcionario funcionario,BigDecimal aumento){
        BigDecimal salario = funcionario.getSalario();
        BigDecimal percentualReajuste = aumento.divide(salario, RoundingMode.HALF_UP);
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new br.com.alura.rh.ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
        }
        return salario.add(aumento);
    }

}
