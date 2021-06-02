package arquivos.programa;

import java.io.File;
import java.util.Scanner;

public class InformacoesDoCaminho {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entre com o caminho do arquivo: ");
		String strCaminho = input.nextLine();
		
		File caminho = new File(strCaminho);
		
		System.out.println("getName: " + caminho.getName() + "\n\n"
				+ "getParent: " + caminho.getParent() + "\n\n"
						+ "getPath: " + caminho.getPath());
		
		input.close();
	}
}
