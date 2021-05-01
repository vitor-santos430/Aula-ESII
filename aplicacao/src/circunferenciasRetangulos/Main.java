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
		double base, altura,respostaArea,respostaPerimetro;
		
		while(opcao != 0) {
	
			for (int i = 0; i < 50; ++i) System.out.println();
			
			System.out.println("Menu - Escolha um n�mero do c�lculo que deseja verificar");
			System.out.println("0. Sair");
			System.out.println("1. Retangulo");
			System.out.println("2. Circunferencia");
			System.out.print("> ");
			opcao = scan.nextInt();
			scan.nextLine();
			switch(opcao) {
				case 1:
					//Verifica��o dos valores de base e altura
					System.out.println("** Retangulo **");
					System.out.print("Digite o valor da base: ");
					base = scan.nextDouble();
					scan.nextLine();
					System.out.print("Digite o valor da altura: ");
					altura = scan.nextDouble();
					
					//Verificando respostas
					System.out.print("Digite o resultado da �rea: ");
					respostaArea = scan.nextDouble();
					System.out.print("Digite o resultado do per�metro: ");
					respostaPerimetro = scan.nextDouble();
					
					//Verifica��o do ret�ngulo
					VerificarRetangulo retangulo = new VerificarRetangulo(base, altura);
					for (int i = 0; i < 30; ++i) System.out.print("*");
					System.out.println("\nSua resposta da �rea est�: "+retangulo.getRespostaArea(respostaArea));
					System.out.println("\nSua resposta do per�metro est�: "+retangulo.getRespostaPerimetro(respostaPerimetro));
					System.out.println("\n�rea: "+retangulo.getAreaRetangulo());
					System.out.println("Per�metro: "+retangulo.getPerimetroRetangulo());
					pauseEnter("Pressione qualquer tecla para continuar...", System.out);
					
					break;
				case 2:
					System.out.println("** Circunferencia **");
					
					pauseEnter("Pressione qualquer tecla para continuar...", System.out);
					break;
				case 0:
					System.out.println("Saindo ...");
					break;
				default:
					System.out.println("Nenhuma op��o v�lida selecionada");
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
