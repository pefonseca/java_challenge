package com.exec.banco;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite seu número de Conta: ");
        Integer account = scanner.nextInt();

        System.out.print("Por favor, digite o número da Agencia: ");
        String agency = scanner.nextLine();

        System.out.print("Por favor, digite seu nome: ");
        String name = scanner.nextLine();

        System.out.print("Por favor, digite seu saldo: ");
        double balance = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d conta %d e seu saldo %.2f já está disponível para saque%n", name, agency, account, balance);
    }
}