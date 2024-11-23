package entities;

public abstract class PagadorImposto {

    private String nome;

    private Double rendaAnual;


    public PagadorImposto () {
    }

    public PagadorImposto (String nome, Double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    //metodos abstratos nao podem ter um corpo
    public abstract Double calcularImposto ();

    public String toString () {
        StringBuilder sb = new StringBuilder();

        sb.append("CONTRIBUINTES:");
        sb.append(getNome() + ": " + " $" + this.calcularImposto() + "\n");

        return sb.toString();
    }
}
