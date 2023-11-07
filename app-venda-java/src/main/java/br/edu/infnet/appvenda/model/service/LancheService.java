package br.edu.infnet.appvenda.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appvenda.model.domain.Lanche;
import br.edu.infnet.appvenda.model.repository.LancheRepository;

@Service
public class LancheService {

	@Autowired
	private LancheRepository lancheRepository;

	public void incluir(Lanche lanche) {
		lancheRepository.save(lanche);
	}
	
	public Collection<Lanche> obterLista(){	
		return (Collection<Lanche>) lancheRepository.findAll();
	}
	
	public long obterQtde() {
		return lancheRepository.count();
	}
}
