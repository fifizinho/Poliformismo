package PoliformismoFuncionario;

public class Funcionario {
	private long id;
	private String nome;
	private String telefone;
	private int matricula;
	private String endereco;
	public Funcionario(long id, String nome, String telefone, int matricula, String endereco) {
		
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.matricula = matricula;
		this.endereco = endereco;
	}
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double calcularSalario(double salarioHora, double horasTrabalhadas) {
		System.out.println("Calculando salario");
		return 0;
	}
}
