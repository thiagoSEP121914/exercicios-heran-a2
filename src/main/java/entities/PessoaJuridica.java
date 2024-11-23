package entities;

public class PessoaJuridica extends PagadorImposto {

    private Integer numeroFuncionarios;

    public PessoaJuridica () {
        super();
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }


    @Override
    public Double calcularImposto () {

        if (getNumeroFuncionarios() > 10) {
            return this.getRendaAnual() * 0.14;
        }
        return this.getRendaAnual() * 0.16;
    }

}
