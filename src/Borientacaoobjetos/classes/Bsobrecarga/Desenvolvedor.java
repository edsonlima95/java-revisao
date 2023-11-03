package Borientacaoobjetos.classes.Bsobrecarga;

public class Desenvolvedor {

	private String nome;
	private String cargo;
	private double salario;
	
	/**
	 * CONCEITO - POLIMORFISMO DE SOBRECARGA
	 *
	 * Sobrecarga e quando dois metodos tem o mesmo nome, porém com parametros ou quantidade
	 * diferentes. 
	 **/
	
	public void init(String nome, String cargo) {
		this.nome = nome;
		this.cargo = cargo;
		System.out.print("Nome: " + this.nome + " " + "Cargo: " + this.cargo);
	}
	
	public void init(String nome, String cargo, double salario) {
		this.init(nome, cargo);
		this.salario = salario;
		System.out.println(" Salario " + this.salario);
	}

}
