package br.com.projetos.calculadora.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.projetos.calculadora.dto.Soma;

@RestController
@RequestMapping(value="/api/soma")
public class SomaController {

	@PostMapping
	public ResponseEntity<Float> calcularSoma(@RequestBody Soma soma){
		float resultadoSoma = soma.getNum1() + soma.getNum2();
		return ResponseEntity.ok().body(resultadoSoma);
		}
}
