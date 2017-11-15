package br.gov.rn.natal.pgm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.rn.natal.pgm.ProcuradorService;
import br.gov.rn.natal.pgm.model.Procurador;

@RestController
@RequestMapping("/procuradores")
@CrossOrigin("${origem-permitida}")
public class ProcuradorController {

	@Autowired
	private ProcuradorService procuradorService;
	
	@GetMapping
	public List<Procurador> todos() {
		return this.procuradorService.buscarTodos();
	}
	
	@GetMapping("/{id}")
	public Procurador porId(@PathVariable Long id) {
		return this.procuradorService.buscarPorId(id);
	}
	
	@PostMapping
	public Procurador salvar(@RequestBody Procurador procurador) {
		return this.procuradorService.salvar(procurador);
	}
	
	@PutMapping
	public Procurador editar(@RequestBody Procurador procurador) {
		return this.procuradorService.editar(procurador);
	}
}
