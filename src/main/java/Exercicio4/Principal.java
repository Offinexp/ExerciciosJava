package Exercicio4;

public class Principal {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente(1.76, 87);
        paciente1.setNome("Roberto Silva");

        Paciente paciente2 = new Paciente(1.60, 53);
        paciente2.setNome("Fernanda Vieira");

        Paciente paciente3 = new Paciente(1.67, 187);
        paciente3.setNome("Carlos Ribeiro");

        System.out.println("O diagnóstico do paciente " + paciente1.getNome() + (" ") + paciente1.diagnostico());
        System.out.println("O diagnóstico do paciente " + paciente2.getNome() + (" ") + paciente2.diagnostico());
        System.out.println("O diagnóstico do paciente " + paciente3.getNome() + (" ") + paciente3.diagnostico());
    }
}
