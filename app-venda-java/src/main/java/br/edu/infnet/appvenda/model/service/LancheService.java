package br.edu.infnet.appvenda.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appvenda.model.domain.Lanche;

@Service
public class LancheService {

	private Map<Integer, Lanche> mapaLanche = new HashMap<Integer, Lanche>();

	public void incluir(Lanche lanche) {
		mapaLanche.put(lanche.getCodigo(), lanche);
	}
	
	public Collection<Lanche> obterLista(){	
		return mapaLanche.values();
	}
}
