package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ItensDeConsumo {
    private LocalDate dataDeConsumo;
    private Funcionario funcionarioQueVendeu;
    private Acomodacao acomodacaoDoConsumo;
    private ArrayList<ItensDeConsumo> itensConsumidos;

    private double preco;

    public double getPreco(){
        return this.preco;
    }

    
}
