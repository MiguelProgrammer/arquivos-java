package arquivos.programa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileEBufferedWriter {

	public static void main(String[] args) {

		String[] linhas = new String[] { "Ol� mundo!", "Codando com Java", "Aprender � muito divertido" };

		String caminho = "C:\\Projetos Java\\ws-sts\\arquivos\\novoArquivo.txt";
																	/*
																	 * True, Escreve no mesmo arquivo 
																	 * sem apagar conte�do anterior
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
