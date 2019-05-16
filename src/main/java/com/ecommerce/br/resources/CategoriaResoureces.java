package com.ecommerce.br.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.br.model.Categoria;

@RestController
@RequestMapping(value = "/categoria")
public class CategoriaResoureces {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> lista(){
		
		Categoria cat1 = new Categoria(1,"Imobiliaria");
		Categoria cat2 = new Categoria(2,"Escritório");
		Categoria cat3 = new Categoria(2,"Imovél");
		
		List<Categoria> listar = new ArrayList<Categoria>();
		
		listar.add(cat1);
		listar.add(cat2);
		listar.add(cat3);
		
		return listar;
	}

}
