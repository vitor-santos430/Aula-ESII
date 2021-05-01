package circunferenciasRetangulos;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opcao = 999;
		double base, altura,raio,respostaArea,respostaPerimetro;
		
		while(opcao != 0) {
			System.out.println("Menu - Escolha um número do cálculo que deseja verificar");
			System.out.println("0. Sair");
			System.out.println("1. Retangulo");
			System.out.println("2. Circunferencia");
			System.out.print("> ");
			opcao = scan.nextInt();
			scan.nextLine();
			switch(opcao) {
				case 1:
					//Verificação dos valores de base e altura
					System.out.println("** Retangulo **");
					System.out.print("Digite o valor da base: ");
					base = scan.nextDouble();
					scan.nextLine();
					System.out.print("Digite o valor da altura: ");
					altura = scan.nextDouble();
					
					//Verificando respostas
					System.out.print("Digite o resultado da área: ");
					respostaArea = scan.nextDouble();
					System.out.print("Digite o resultado do perímetro: ");
					respostaPerimetro = scan.nextDouble();
					
					//Verificação do retângulo
					VerificarRetangulo retangulo = new VerificarRetangulo(base, altura);
					for (int i = 0; i < 30; ++i) System.out.print("*");
					System.out.println("\nSua resposta da área está: "+retangulo.getRespostaArea(respostaArea));
					System.out.println("\nSua resposta do perímetro está: "+retangulo.getRespostaPerimetro(respostaPerimetro));
					System.out.println("\nÁrea: "+retangulo.getArea());
					System.out.println("Perímetro: "+retangulo.getPerimetro());
					pauseEnter("Pressione qualquer tecla para continuar...", System.out);
					
					break;
				case 2:
					//Verificação do raio da cricunferência
					System.out.println("** Circunferência **");
					System.out.print("Digite o valor do raio: ");
					raio = scan.nextDouble();
					
					//Verificando respostas
					System.out.print("Digite o resultado da área: ");
					respostaArea = scan.nextDouble();
					System.out.print("Digite o resultado do perímetro: ");
					respostaPerimetro = scan.nextDouble();
					
					//Verificação da circunferência
					verificarCircunferencia circunferencia = new verificarCircunferencia(raio);
					for (int i = 0; i < 30; ++i) System.out.print("*");
					System.out.println("\nSua resposta da área está: "+circunferencia.getRespostaArea(respostaArea));
					System.out.println("\nSua resposta do perímetro está: "+circunferencia.getRespostaPerimetro(respostaPerimetro));
					System.out.println("\nÁrea: "+circunferencia.getArea());
					System.out.println("Perímetro: "+circunferencia.getPerimetro());
					pauseEnter("Pressione qualquer tecla para continuar...", System.out);
					break;
				case 0:
					System.out.println("Saindo ...");
					break;
				default:
					System.out.println("Nenhuma opção válida selecionada");
					pauseEnter("Pressione qualquer tecla para continuar...", System.out);
					break;
			}
		}
		scan.close();
	}
	
	public static void pauseEnter(String message, PrintStream printStream) {
        printStream.print(message);
        try {
            BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
            stdin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
