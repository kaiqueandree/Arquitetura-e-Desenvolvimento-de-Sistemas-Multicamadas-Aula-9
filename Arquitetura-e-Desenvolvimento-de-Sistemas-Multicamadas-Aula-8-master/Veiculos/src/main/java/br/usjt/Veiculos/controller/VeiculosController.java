package br.usjt.Veiculos.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.Veiculos.model.bean.Veiculos;
import br.usjt.Veiculos.model.repository.VeiculosRepository;


@Controller
public class VeiculosController {
	@Autowired
	private VeiculosRepository veiculosRepo;
	
	@GetMapping ("/veiculos")
	public ModelAndView listarVeiculos () {
	
	ModelAndView mv = new ModelAndView ("lista_veiculos");
	List <Veiculos> veiculos = veiculosRepo.findAll();
	
	mv.addObject("v",  new Veiculos());
	mv.addObject("veiculos", veiculos);
	
	return mv;
	}
	
	@PostMapping ("/veiculos")
	
	public String salvar (Veiculos veiculos) {
	veiculosRepo.save(veiculos);
	return "redirect:/veiculos";
	} 
}
