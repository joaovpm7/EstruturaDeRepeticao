package com.company;

import java.util.Scanner;

public class Exerc2 {

    public static void main (String[] args){

        Scanner Scan = new Scanner(System.in);

        System.out.println("Faça seu cadastro!");
        System.out.println("Seu usuario: ");
        String User = Scan.next();
        System.out.println("Sua senha: ");
        String Senha = Scan.next();


        while (User.equals(Senha)){
            System.out.println("ERRO: o usuario não pode ser igual a senha, tente novamente!");
            System.out.println("Seu usuario: ");
            User = Scan.next();
            System.out.println("Sua senha: ");
            Senha = Scan.next();
        }
        System.out.println("Cadastro efetuado com sucesso!");







    }
}
