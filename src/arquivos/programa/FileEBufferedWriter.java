package arquivos.programa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileEBufferedWriter {

	public static void main(String[] args) {

		String[] linhas = new String[] { "Olá mundo!", "Codando com Java", "Aprender é muito divertido" };

		String caminho = "C:\\Projetos Java\\ws-sts\\arquivos\\novoArquivo.txt";
																	/*
																	 * True, Escreve no mesmo arquivo 
																	 * sem apagar conteúdo anterior
																	 */
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true))) {
			for (String linha : linhas) {
				bw.write(linha);
				bw.newLine();
			}
		} catch (IOException e) {
			e.getStackTrace();
		}

	}
}
