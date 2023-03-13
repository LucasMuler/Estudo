package TratandoArquivos.ExercicioProposto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import TratandoArquivos.ExercicioProposto.Entities.Produto;
import TratandoArquivos.ExercicioProposto.Entities.pedido;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String path = "c:\\temp";
		String scrPath = "c:\\temp\\out\\summary.csv";
		List<String> linhasEntradaItens = new ArrayList<String>();
		List<pedido> listaDeProdutos = new ArrayList<pedido>();
		
		boolean sucess = new File(path + "\\out").mkdir();
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(scrPath,true))){
			
			Locale.setDefault(Locale.US);
			
			System.out.println("digite quantos produtos serao registrados");
			int quantidadeDeRegistros = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Digite a descrição do produto seguindo este padrao");
			System.out.println("nome/Descricao produto, preco, quantidade");
			for (int i = 0; i < quantidadeDeRegistros; i++) {
				linhasEntradaItens.add(sc.nextLine());
			}
			
			for (String line : linhasEntradaItens) {
				String[] vect = line.split(",");
				String nomeProduto = vect[0];
				double preco = Double.parseDouble(vect[1]);
				Produto produto = new Produto(nomeProduto, preco);
				pedido pedido = new pedido(produto, Integer.parseInt(vect[2]));
				listaDeProdutos.add(pedido);
			}
			
			for (pedido pedido : listaDeProdutos) {
				bw.write(pedido.toString());
				bw.newLine();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		sc.close();
	}

}
