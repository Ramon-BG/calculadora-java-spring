package br.com.projetos.calculadora.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.projetos.calculadora.dto.Multiplicacao;

@RestController
@RequestMapping(value="/api/multiplicacao")
public class MultiplicacaoController {

	@PostMapping
	public ResponseEntity<Float> calcularMultiplicacao (@RequestBody Multiplicacao multiplicacao){
		float resultadoMultiplicacao = multiplicacao.getNum1() * multiplicacao.getNum2();
		return ResponseEntity.ok().body(resultadoMultiplicacao);
	}
	
}

