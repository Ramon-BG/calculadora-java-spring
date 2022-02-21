package br.com.projetos.calculadora.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetos.calculadora.dto.Divisao;

@RestController
@RequestMapping(value="/api/divisao")
public class DivisaoController {

	@PostMapping
	public ResponseEntity<Float> calcularDivisao(@RequestBody Divisao divisao){
		float resultadoDivisao = divisao.getNum1() / divisao.getNum2();
		return ResponseEntity.ok().body(resultadoDivisao);
	}
}
