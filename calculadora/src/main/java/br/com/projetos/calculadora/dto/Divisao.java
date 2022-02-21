package br.com.projetos.calculadora.dto;

public class Divisao {
	private Float num1;
	private Float num2;
	
	public Divisao(Float num1, Float num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public Float getNum1() {
		return num1;
	}
	public void setNum1(Float num1) {
		this.num1 = num1;
	}
	public Float getNum2() {
		return num2;
	}
	public void setNum2(Float num2) {
		this.num2 = num2;
	}

	
	
}
