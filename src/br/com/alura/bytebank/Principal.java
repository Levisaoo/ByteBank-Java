package br.com.alura.bytebank;

import java.time.LocalDate;

public class Principal {
// codigo implementado no package
    public static void main(String[] args) {
        Funcionario Joao = new Funcionario("Joao", 1, LocalDate.of(1990, 2, 12));
        System.out.println(Joao);

    }

}
