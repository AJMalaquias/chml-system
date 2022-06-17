package main;

import entidades.dominios.Pessoa;
import entidades.enumeradores.Sexo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        var pessoa = new Pessoa("Adroaldo Oseias da Conceicao Malaquias", LocalDate.of(2020, 6, 17), Sexo.MASCULINO);
        System.out.println(pessoa);
    }
}
