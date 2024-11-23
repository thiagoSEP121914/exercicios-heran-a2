package entities;

public class PessoaFisica extends PagadorImposto {

    private Double gastoSaude;

    public PessoaFisica () {
        super();
    }

    public PessoaFisica (String nome, Double rendaAnual,Double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public Double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }


    @Override
    public Double calcularImposto() {
        double totalApagar = 0.0;


        if (getRendaAnual() < 20000.0) {
            totalApagar = getRendaAnual() * 0.15;
        } else {
            totalApagar = getRendaAnual() * 0.25;
        }
        totalApagar -=(getGastoSaude() * 0.5);

        return totalApagar;
    }

}
