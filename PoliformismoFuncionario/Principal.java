package PoliformismoFuncionario;

public class Principal {

	public static void main(String[] args) {
		Jornada jornada = new Jornada(1,"Isabely","168934923",2039,"Centro");
		System.out.println("JORNADA:");
		System.out.println("Id:"+jornada.getId());
		System.out.println("Nome:"+jornada.getNome());
		System.out.println("Telefone:"+jornada.getTelefone());
		System.out.println("Matricula:"+jornada.getNome());
		System.out.println("Endereco:"+jornada.getEndereco());
		System.out.println(jornada.calcularSalario(100, 20));
		
		Horista horista = new Horista(2,"Fernanda","168934923",2039,"Centro");
		System.out.println("HORISTA:");
		System.out.println("Id:"+horista.getId());
		System.out.println("Nome:"+horista.getNome());
		System.out.println("Telefone:"+horista.getTelefone());
		System.out.println("Matricula:"+horista.getNome());
		System.out.println("Endereco:"+horista.getEndereco());
		System.out.println(horista.calcularSalario(100, 20));
		
		
		PessoaJuridica pessoaJ = new PessoaJuridica(3,"Almeida","168934923",2039,"Centro");
		System.out.println("PESSOA JURIDICA:");
		System.out.println("Id:"+pessoaJ.getId());
		System.out.println("Nome:"+pessoaJ.getNome());
		System.out.println("Telefone:"+pessoaJ.getTelefone());
		System.out.println("Matricula:"+pessoaJ.getNome());
		System.out.println("Endereco:"+pessoaJ.getEndereco());
		System.out.println(pessoaJ.calcularSalario(100, 20));
	}

}
