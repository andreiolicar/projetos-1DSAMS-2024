/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pj_1207;

import java.util.Scanner;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Pj_1207 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        //Lê o nome da pessoa.
        
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        //Lê a idade da pessoa.
        
        scanner.nextLine();

        System.out.print("Digite o sexo (M/F): ");
        char sexo = scanner.nextLine().charAt(0);
        //Lê o sexo da pessoa.

        System.out.print("Digite a altura (em centímetros): ");
        double altura = scanner.nextDouble();
        //Lê a altura da pessoa em centímetros.

        scanner.nextLine();

        System.out.print("Digite o endereço: ");
        String endereco = scanner.nextLine();
        //Lê o endereço da pessoa.

        System.out.print("Digite as observações (até 80 caracteres): ");
        String observacoes = scanner.nextLine();
        //Observações referente à pessoa, como alergias e medicamentos.

        System.out.print("Digite o peso (em kg): ");
        double peso = scanner.nextDouble();
        //Lê o peso da pessoa.

        System.out.println("Dados da pessoa:");
        System.out.println("Nome: " + nome); // nome completo
        System.out.println("Idade: " + idade); // idade em anos
                if (sexo == 'M') {
            System.out.println("Sexo: Masculino");
        } else if (sexo == 'F') {
            System.out.println("Sexo: Feminino");
        } else {
            System.out.println("Sexo inválido"); // Opcional: caso o valor não seja 'M' nem 'F'
        }
        System.out.println("Altura: " + altura); // altura em centímetros
        System.out.println("Endereço: " + endereco); // nome da rua e número
        System.out.println("Observações: " + observacoes);
        System.out.println("Peso: " + peso); // peso em kg

        double imc = peso / (altura * altura); // calculo do imc do aluno

        System.out.println("IMC: " + imc);
    }
}
