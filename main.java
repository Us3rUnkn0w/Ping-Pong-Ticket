package com.pongping;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Apresentação
        System.out.println("############################\n#  Sistema de Autorização  #\n############################");
        // Receber o nome do Funcionário
        System.out.println("Digite seu nome para pegar a autorização\nPara jogar Ping-Pong: ");
        Scanner sc = new Scanner(System.in);
        String nomedoFuncionario = sc.nextLine();
        // imprimir ele com a declaração
        System.out.println("Gerando autorização...\n\nCarregando...\n");
        System.out.println("#############################################\n# Emissão de autorização para jogar Ping-Pong\n# "+nomedoFuncionario+"\n#############################################");
    }
}