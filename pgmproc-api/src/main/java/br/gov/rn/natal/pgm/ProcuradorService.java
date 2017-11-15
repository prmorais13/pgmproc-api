package br.gov.rn.natal.pgm;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.rn.natal.pgm.model.Procurador;
import br.gov.rn.natal.pgm.repository.ProcuradorRepository;

@Service
public class ProcuradorService {

	@Autowired
	private ProcuradorRepository procuradorRepository;
	
	public List<Procurador> buscarTodos() {
		return this.procuradorRepository.findAll();
	}
	
	public Procurador buscarPorId(Long id) {
		return this.procuradorRepository.findOne(id);
	}
	
	public Procurador salvar(Procurador procurador) {
		return this.procuradorRepository.save(procurador);
	}
	
	public Procurador editar(Procurador procurador) {
		Procurador procAtualizado = this.buscarPorId(procurador.getId());
		
		if (procAtualizado == null) {
			return null;
		
		} else {
			BeanUtils.copyProperties(procurador, procAtualizado);
			return this.procuradorRepository.save(procAtualizado);
		}
	}
}
