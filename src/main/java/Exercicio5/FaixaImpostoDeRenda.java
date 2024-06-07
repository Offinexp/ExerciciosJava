package Exercicio5;

public class FaixaImpostoDeRenda {
    public int faixaImpostoRenda;
    public double faixaSalarial;

    public FaixaImpostoDeRenda(double faixaSalarial) {

        this.faixaSalarial = faixaSalarial;
    }

    public int getFaixaImpostoRenda() {
        if(faixaImpostoRenda <= 2112) {
            return 1;
        } else if (faixaImpostoRenda <= 2826.66) {
            return 2;
        } else if (faixaImpostoRenda <= 3751.06) {
            return 3;
        } else if (faixaImpostoRenda <= 4664.68) {
            return 4;
        } else if (faixaImpostoRenda > 4664.68) {
            return 5;
        }else{
            return 0;
        }
    }
}
