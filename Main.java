//package revisao;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Pessoa p1 = new Pessoa();
		Agenda agenda = new Agenda();
		String resp, nomeRemover;
		int opc;
	
		do{
			System.out.print("Nome: ");
			p1.setNome(input.nextLine());
			System.out.print("Altura: ");
			p1.setAltura(input.nextFloat());
			input.nextLine();
			System.out.print("Data de nascimento (dd/mm/aaaa): ");
			p1.setNascimento(input.nextLine());
			agenda.armazenaPessoa(p1.getNome(), p1.calculoIdade(p1.getNascimento()), p1.getAltura());

			System.out.println("1. Remover Pessoa");
			System.out.println("2. Imprimir Agenda");
			System.out.print("Opção: ");
			opc = input.nextInt();
	
			switch(opc){
				case 1: 
					System.out.println("Informe o nome para remover: ");
					nomeRemover = input.nextLine();
					agenda.removePessoa(nomeRemover);
					break;
				case 2:
					agenda.imprimeAgenda();
					break;
				default: System.out.println("Opção Inválida.");
	
			}
			System.out.print("Novamente? (s/n): ");
			resp = input.nextLine();
			input.nextLine();
		} while(resp.equals("s") || resp.equals("S"));
		//p1.imprimir();

	}
}