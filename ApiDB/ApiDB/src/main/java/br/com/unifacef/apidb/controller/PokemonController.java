package br.com.unifacef.apidb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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

	// vamos fazer o clássico do Spring
	// criar uma injeção de dependência
	@Autowired
	PokemonRepository injecao;
	
	@GetMapping("/pokemon")
	@CrossOrigin(origins="*")
	public List<Pokemon> get(){
		// select * from pokemon
		return injecao.findAll();
	}
	
	@PostMapping("/pokemon")
	@CrossOrigin(origins="*")
	public Pokemon save(@RequestBody Pokemon pokemon) {
		// insert into pokemon values ...
		Pokemon novo = injecao.save(pokemon);
		return novo;
		
	}
	
	@DeleteMapping("/pokemon/{id}")
	@CrossOrigin(origins="*")
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
	@CrossOrigin(origins="*")
	public Pokemon update(@RequestBody Pokemon pokemon) {
		Pokemon novo = injecao.save(pokemon);
		return novo;
	}
}
