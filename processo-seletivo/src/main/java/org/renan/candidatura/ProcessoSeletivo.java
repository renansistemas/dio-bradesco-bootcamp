package org.renan.candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {

        String[] candidatos = {"Felipe", "Marcio", "Renan", "João", "Paulo"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
        //selecaoCandidatos();
        //imprimirSelecionados();
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1; // Simula a chance de atender o telefone de 1 em 3
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso!");
            }
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
        } else {
            System.out.println("Não conseguimos contato com " + candidato + ", número máximo de tentativas " + tentativasRealizadas + " realizadas");
        }
    }


    static void imprimirSelecionados() {
        String[] candidatos = {"Felipe", "Marcio", "Renan", "João", "Paulo"};
        System.out.println("Imprimindo a  lista de candidatos informando o índice do elemento");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O Candidato de nº: " + (indice + 1) + " é o " + candidatos[indice]);
        }

        for (String candidato : candidatos) {
            System.out.println("O Candidato selecionado foi: " + candidato);
        }
    }

    static void selecaoCandidatos() {

        String[] candidatos = {"Felipe", "Marcio", "Renan", "João", "Paulo"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000;

        while (candidatosSelecionados < 3 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " Solicitou este salario: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga!");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato!");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta!");
        } else {
            System.out.println("Aguardando resultado dos demais candidatos!");
        }
    }

}