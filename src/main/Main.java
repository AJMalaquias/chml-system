package main;

import entidades.dominios.Pessoa;
import entidades.enumeradores.Sexo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        var pessoa = new Pessoa("Anselmo João Malaquias", LocalDate.of(1992, 3, 20), Sexo.MASCULINO);
        System.out.println(pessoa);
    }
}
