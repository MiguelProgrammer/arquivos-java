package arquivos.programa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import arquivos.entidades.Funcionario;

public class FileEBufferedReader {

public static void main(String[] args) {
	
		
		List<Funcionario> func = new ArrayList<>();
		
		String caminho = "C:\\Projetos Java\\ws-sts\\arquivos\\auxiliar.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			
			String linha = br.readLine();
			
			while(linha != null) {
				String[] dadosFuncionarios = linha.split(",");
				func.add(new Funcionario(dadosFuncionarios[0],Integer.parseInt(dadosFuncionarios[1]),Double.parseDouble(dadosFuncionarios[2])));
				linha = br.readLine();
			}
			
			Collections.sort(func);

			for (Funcionario colaborador : func) {
				System.out.println(colaborador.toString());
			}
			
		} catch(IOException e) {
			/*
			 * Erro C:\Projetos Java\-sts\arquivos\auxiliar.txt (O sistema não pode encontrar o caminho especificado)
			 */
			System.out.println("Erro " + e.getMessage());
			
		} 
	}
}
