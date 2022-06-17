package entidades.dominios;

import entidades.enumeradores.Sexo;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private LocalDate dataDeNascimento;
    private Integer idade;
    private Sexo sexo;

    public Pessoa(String nome, Sexo sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public Pessoa(String nome, LocalDate dataDeNascimento, Sexo sexo) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Integer getIdade() {
        var dataActual = LocalDate.now();

        Integer mesNascimento = dataDeNascimento.getMonthValue();
        Integer mesActual = dataActual.getMonthValue();
        Integer diaNascimento = dataDeNascimento.getDayOfMonth();
        Integer diaActual = dataActual.getDayOfMonth();

        if (dataDeNascimento.getYear() > dataActual.getYear()) {
            if (mesNascimento > mesActual) {
                if (diaNascimento > diaActual)
                    throw new IllegalArgumentException("Data inválida!\nA data de nascimento não pode ser uma data futura.");
            }
        }

        if (mesNascimento >= mesActual) {
            if (diaNascimento < diaActual) {
                idade = (dataActual.getYear() - dataDeNascimento.getYear()) - 1;
                return idade;
            }
        }
        idade = dataActual.getYear() - dataDeNascimento.getYear();
        return idade;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() +
                "\nData de nascimento: " + getDataDeNascimento() +
                "\nIdade: " + getIdade() + (getIdade() == 1 ? " ano" : " anos") +
                "\nSexo: " + getSexo().getValor();
    }
}
