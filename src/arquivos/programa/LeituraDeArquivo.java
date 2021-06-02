package arquivos.programa;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LeituraDeArquivo {

	public static void main(String[] args) {
		
		File arquivo = new File("C:\\Projetos Java\\ws-sts\\arquivos\\auxiliar.txt");
		Scanner input = null;
		
		try { 
			input = new Scanner(arquivo);
			
			while(input.hasNextLine()) {
				System.out.println(input.nextLine());
			}
			
		} catch(IOException e) {
			e.getMessage();
		} finally {
			if(!input.hasNext()) {
				input.close();
			}
		}
		
		
	}
}
