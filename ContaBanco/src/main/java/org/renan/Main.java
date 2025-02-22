package org.renan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //programa deve solicitar ao usuario digitar o numero da agencia e deepois dar enter
        System.out.println("Digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número da conta: ");
        String conta = scanner.nextLine();

        System.out.println("Digite o nome do titular: ");
        String titular = scanner.nextLine();

        System.out.println("Olá " + titular + ", obrigado por criar uma conta em nosso banco, sua agencia é "
                + agencia + " e sua conta é " + conta + " e seu saldo 0,00 já está disponível para saque.");

    }
}