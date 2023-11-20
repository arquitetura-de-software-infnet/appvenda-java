package br.edu.infnet.appvenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appvenda.model.service.BebidaService;
import br.edu.infnet.appvenda.model.service.LancheService;
import br.edu.infnet.appvenda.model.service.ProdutoService;
import br.edu.infnet.appvenda.model.service.InformacaoService;
import br.edu.infnet.appvenda.model.service.VendedorService;

@Controller
public class AppController {

	@Autowired
	private VendedorService vendedorService;
	@Autowired
	private ProdutoService produtoService;
	@Autowired
	private BebidaService bebidaService;
	@Autowired
	private LancheService lancheService;
	@Autowired
	private InformacaoService informacaoService;
	
	@GetMapping(value = "/")
	public String showHome(Model model) {
		
		model.addAttribute("informacoes", informacaoService.ObterLista());
		
		model.addAttribute("qtdeVendedor", vendedorService.obterQtde());
		model.addAttribute("qtdeProduto", produtoService.obterQtde());
		model.addAttribute("qtdeBebida", bebidaService.obterQtde());
		model.addAttribute("qtdeLanche", lancheService.obterQtde());

		return "home";
	}
	
		
	@GetMapping(value = "/produto/lista")
	public String obterListaProduto(Model model) {
		
		model.addAttribute("titulo", "Produtos:");
		model.addAttribute("listagem", produtoService.obterLista());
		
		return showHome(model);
	}
	
	@GetMapping(value = "/bebida/lista")
	public String obterListaBebida(Model model) {
		
		model.addAttribute("titulo", "Bebidas:");
		model.addAttribute("listagem", bebidaService.obterLista());
		
		return showHome(model);
	}
	
	@GetMapping(value = "/lanche/lista")
	public String obterListaLanche(Model model) {
		
		model.addAttribute("titulo", "Lanches:");
		model.addAttribute("listagem", lancheService.obterLista());
		
		return showHome(model);
	}
}
