package br.com.unifacef.apidb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.unifacef.apidb.model.Pokemon;
import br.com.unifacef.apidb.model.repositories.PokemonRepository;

@RestController
public class PokemonController {

	// vamos fazer o clássico String
	// criar uma injeção de dependência
	// criar um objeto do tipo de uma classe interface
	// este objeto pode executar métodos sem precisar ser instanciado
	@Autowired //dizer que é uma injeção de dependência
	PokemonRepository injecao;
	
	@GetMapping("/pokemon")
	public List<Pokemon> get(){
		// mesma coisa que: select * from pokemon
		return injecao.findAll();
	}
	
	@PostMapping("/pokemon")
	public Pokemon save(@RequestBody Pokemon pokemon) {
		Pokemon novo = injecao.save(pokemon);
		return novo;
	}
		
	@DeleteMapping("/pokemon/{id}")
	public String delete(@PathVariable Long id) {
		try {
			injecao.deleteById(id);
			return "Remoção realizada com sucesso";
		}
		catch(Exception e) {
			return "Nenhum pokemon encontrado";
		}	
	}
	
	@PutMapping("/pokemon")
	public Pokemon update(@RequestBody Pokemon pokemon) {
		Pokemon novo = injecao.save(pokemon);
		return novo;
	}
}
