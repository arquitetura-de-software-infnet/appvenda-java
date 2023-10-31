package br.edu.infnet.appvenda;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appvenda.model.domain.Lanche;
import br.edu.infnet.appvenda.model.domain.Vendedor;
import br.edu.infnet.appvenda.model.service.LancheService;

@Order(3)
@Component
public class LancheLoader implements ApplicationRunner {
	
	@Autowired
	private LancheService lancheService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		FileReader file = new FileReader("files/lanche.txt");		
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();

		String[] campos = null;
				
		while(linha != null) {
			
			campos = linha.split(";");
			Vendedor vendedor = new Vendedor();
			
			Lanche lanche = new Lanche();

			lanche.setCodigo(Integer.valueOf(campos[0]));
			lanche.setDescricao(campos[1]);
			lanche.setPreco(Float.valueOf(campos[2]));
			lanche.setEstoque(Boolean.valueOf(campos[3]));
			lanche.setVegetariano(Boolean.valueOf(campos[4]));
			lanche.setTipo(campos[5]);
			
			vendedor.setId(Integer.valueOf(campos[6]));
			
			lanche.setVendedor(vendedor);
			
			lancheService.incluir(lanche);
			
			linha = leitura.readLine();
		}

		for(Lanche lanche: lancheService.obterLista()) {
			System.out.println("[Lanche] " + lanche);			
		}

		leitura.close();
	}

}
