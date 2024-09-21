/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Atividade3 {

    /**
     * @param args
     */
    
    public static void main(String[] args) {
        //informações
        try (Scanner scanner = new Scanner(System.in)) {
            
            String meuNome = "Clara"; 
            int minhaIdade = 16; 
            double meuPeso = 55; 
            double minhaAltura = 1.55; 
            String minhaSerieFavorita = "Garota Conhece o mundo";
            String minhaMusicaFavorita = " Smile - lily Allen"; 
            String meuJogoFavorito = "The Sims"; 
            
            // Leitura dos dados da outra pessoa
            System.out.print("Digite seu nome: ");
            String nomePessoa = scanner.nextLine();
            
            System.out.print("Digite sua idade: ");
            int idadePessoa = scanner.nextInt();
            
            System.out.print("Digite seu peso (em kg): ");
            double pesoPessoa = scanner.nextDouble();
            
            System.out.print("Digite sua altura (em metros): ");
            double alturaPessoa = scanner.nextDouble();
            scanner.nextLine(); 
            
            System.out.print("Digite sua série favorita: ");
            String serieFavoritaPessoa = scanner.nextLine();
            
            System.out.print("Digite sua música favorita: ");
            String musicaFavoritaPessoa = scanner.nextLine();
            
            System.out.print("Digite seu jogo favorito: ");
            String jogoFavoritoPessoa = scanner.nextLine();
            
            //  informações
            int caracteristicasIguais = 0;
            
            //  nome
            if (nomePessoa.equals(meuNome)) {
                System.out.println("Pessoa com nome igual");
                caracteristicasIguais++;
            } else {
                System.out.println("Pessoa com o nome diferente");
            }
            
            // idade
            if (idadePessoa == minhaIdade) {
                System.out.println("Idade igual");
                caracteristicasIguais++;
            } else {
                System.out.println("Idade diferente");
            }
            
            //  peso
            if (pesoPessoa == meuPeso) {
                System.out.println("Peso igual");
                caracteristicasIguais++;
            } else {
                System.out.println("Peso diferente");
            }
            
            //  altura
            if (alturaPessoa == minhaAltura) {
                System.out.println("Altura igual");
                caracteristicasIguais++;
            } else {
                System.out.println("Altura diferente");
            }
            
            // série favorita
            if (serieFavoritaPessoa.equals(minhaSerieFavorita)) {
                System.out.println("Série favorita igual");
                caracteristicasIguais++;
            } else {
                System.out.println("Série favorita diferente");
            }
            
            // musica
            if (musicaFavoritaPessoa.equals(minhaMusicaFavorita)) {
                System.out.println("Música favorita igual");
                caracteristicasIguais++;
            } else {
                System.out.println("Música favorita diferente");
            }
            
            // jogo favorito
            if (jogoFavoritoPessoa.equals(meuJogoFavorito)) {
                System.out.println("Jogo favorito igual");
                caracteristicasIguais++;
            } else {
                System.out.println("Jogo favorito diferente");
            }
            
       //final 
            if (caracteristicasIguais >= 3) {
                System.out.println("Esta pessoa é bem parecida comigo!");
            } else {
                System.out.println("Esta pessoa não se parece comigo.");
            }
        } 
    }
}


            
            
    }
    
}
    

