/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tratandovarwhile;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jotal
 */
public class TratandoVarWhile {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int soma1 = 0, soma2 = 0;

        while (true) {
            try {
                System.out.println("Digite o primeiro valor: ");
                soma1 = ler.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido! Digite apenas números inteiros.");
                ler.nextLine();
            }
        }

        while (true) {
            try {
                System.out.println("Digite o segundo valor: ");
                soma2 = ler.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido! Digite apenas números inteiros.");
                ler.nextLine();
            }
        }

        int soma = soma1 + soma2;
        System.out.println("A soma dos valores é: " + soma);

    }
}
