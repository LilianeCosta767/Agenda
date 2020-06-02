
//package revisao;
import java.sql.Date;
import java.time.Year;
import java.util.Calendar;

import javax.xml.crypto.Data;


public class Pessoa {
	
	private String nome;
	private float altura;
    private String nascimento;
    private int idade;
	
	public String getNome() {
		return nome;
	}
	public float getAltura() {
		return altura;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
	
	public int calculoIdade (String dn) {
		String date [] = new String [3];
        date = dn.split("/");
		int dia = Integer.parseInt(date[0]);
		int mes = Integer.parseInt(date[1]);
        int ano = Integer.parseInt(date[2]);
        System.out.println("teste ... " + date[0]);
		int idade = 0;
		
		Calendar c = Calendar.getInstance();
		if(c.get(Calendar.MONTH) + 1 > mes)
			idade = c.get(Calendar.YEAR) - ano;
		else if (c.get(Calendar.MONTH) + 1 == mes && c.get(Calendar.DAY_OF_MONTH) < dia)
			idade = ((c.get(Calendar.YEAR) - ano) -1);
		else
			idade = c.get(Calendar.YEAR) - ano;
		return idade;
	}
	
	public void imprimir() {
		System.out.println("SOBRE A PESSOA");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Altura: " + this.getAltura());
		System.out.println("Idade: " + calculoIdade(this.getNascimento()) + "anos.");
	}
}