package br.com.franca.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.franca.cursomc.domain.Categoria;
import br.com.franca.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repositoryCategoria;
	
	public Categoria buscarPorId(Integer id) {
		
		Optional<Categoria> categoriaObj = repositoryCategoria.findById(id);
		return categoriaObj.orElse(null);
	}

}
