package ProjetoContratoEmpresa2.Entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Installment {

    private LocalDate dueDate;
    private double amount;

    public Installment(LocalDate dueDate, double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return dueDate + " - " + amount;
    }
}
