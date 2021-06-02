package arquivos.programa;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastasComFile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com o caminho da pasta: ");
		String strCaminho = input.nextLine();
		
		File caminho = new File(strCaminho);
		
		File[] pastas = caminho.listFiles(File::isDirectory);
		System.out.println("Pastas: ");
		for (File pasta : pastas) {
			System.out.println(pasta);
		}
		
		File[] arquivos = caminho.listFiles(File::isFile);
		
		System.out.println("Arquivos: ");
		for (File arquivo : arquivos) {
			System.out.println(arquivo);
		}
		
		boolean sucesso = new File(strCaminho + "\\novaPasta").mkdir();
		System.out.println("Novo diretório criado ? " + sucesso);
		
		input.close();
	}
}
