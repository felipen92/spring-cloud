package com.felipebarros.microservices.produtos;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutosController {
	
	@GetMapping
	public String findAll(){
		return "PRODUTOS!!";
	}

}
