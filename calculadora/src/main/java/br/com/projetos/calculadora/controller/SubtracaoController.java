package br.com.projetos.calculadora.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.projetos.calculadora.dto.Subtracao;

@RestController
@RequestMapping(value = "api/subtracao")
public class SubtracaoController {
	
	@PostMapping
	public ResponseEntity<Float> calcularSubtracao (@RequestBody Subtracao subtracao){
		float resultadoSubtracao = subtracao.getNum1() - subtracao.getNum2();
		return ResponseEntity.ok().body(resultadoSubtracao);
	}
}
