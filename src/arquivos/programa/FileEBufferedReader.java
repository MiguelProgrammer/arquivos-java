package arquivos.programa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileEBufferedReader {

	public static void main(String[] args) {
		
		String caminho = "C:\\Projetos Java\\ws-sts\\arquivos\\auxiliar.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			
			String linha = br.readLine();
			
			while(linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}
			
		} catch(IOException e) {
			/*
			 * Erro C:\Projetos Java\-sts\arquivos\auxiliar.txt (O sistema não pode encontrar o caminho especificado)
			 */
			System.out.println("Erro " + e.getMessage());
			
		} 
	}
}
