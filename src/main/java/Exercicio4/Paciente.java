package Exercicio4;

public class Paciente {
    private String nome;
    private double altura;
    private double peso;

    public Paciente(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String diagnostico() {
        double IMC = this.calcularIMC();
        if (IMC < 16) {
            return ("Baixo peso muito grave = IMC abaixo de 16 kg/m²");
        } else if (IMC <= 16.99) {
            return ("Baixo peso grave = IMC entre 16 e 16,99 kg/m²");
        } else if (IMC <= 18.49) {
            return ("Baixo peso = IMC entre 17 e 18,49 kg/m²");
        } else if (IMC <= 24.99) {
            return ("Peso normal = IMC entre 18,50 e 24,99 kg/m²");
        } else if (IMC <= 29.99) {
            return ("Sobrepeso = IMC entre 25 e 29,99 kg/m²");
        } else if (IMC <= 34.99) {
            return ("Obesidade grau I = IMC entre 30 e 34,99 kg/m²");
        } else if (IMC <= 39.99) {
            return ("Obesidade grau II = IMC entre 35 e 39,99 kg/m²");
        } else if (IMC >= 40) {
            return ("Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²");
        }else{
            return ("Erro");
        }
    }
}