package br.com.unifacef.apidb.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unifacef.apidb.model.Pokemon;

public interface PokemonRepository extends JpaRepository<Pokemon, Long>{
	
	// esta interface vai herdar todos os métodos
	// de operação em banco de dados 
	// CRUD 
	// Create (insert)
	// Retrieve (select) - recuperar
	// Update (update)
	// Delete (delete)
	
	
}
