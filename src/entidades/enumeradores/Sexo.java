package entidades.enumeradores;

public enum Sexo {
    MASCULINO(1, "Masculino"),
    FEMININO(2, "Feminino");

    private Integer indice;
    private String valor;

    Sexo(Integer indice, String valor) {
        this.indice = indice;
        this.valor = valor;
    }

    public Integer getIndice() {
        return indice;
    }

    public String getValor() {
        return valor;
    }
}
