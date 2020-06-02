import java.util.Scanner;

public class Agenda{
    Scanner input = new Scanner(System.in);
    Pessoa pessoas [] = new Pessoa[10]; //cria o array 
    int contador = 0;

    public void armazenaPessoa(String nome, int idade, float altura){
        if(contador < 10){
            Pessoa aux = new Pessoa();
            aux.setNome(nome);
            aux.setIdade(idade);
            aux.setAltura(altura);
            this.pessoas[contador] = aux;
            contador++;
        }
        else{
            System.out.println("Número máximo de pessoas atingido.");
        }
    }

    public void removePessoa(String nomeRemover){
        if(contador <= 10){
            System.out.print("Informe o nome: ");
            nomeRemover = input.nextLine();
            for(int i=0; i<contador; i++){
                if((pessoas[i].getNome()).equals(nomeRemover)){
                    if(i == contador){
                        contador--; //caso seja a ultima posição decrementa o cont
                        System.out.println("Removido com sucesso.");
                    }
                    else{
                        for(int j=i; j<contador; j++){
                            pessoas[j] = pessoas[j+1]; 
                        }
                        contador--;
                    }
                }
            }
        }
    }

    public void imprimeAgenda(){
        System.out.println("Agenda");
        if(contador > 0){
            for (int i=0; i<contador; i++){
                System.out.println("Nome:" + this.pessoas[i].getNome());
                System.out.println("Altura: " + this.pessoas[i].getAltura());
                System.out.println("Idade: " + this.pessoas[i].getIdade());
            }
        }
        else{
            System.out.println("Agenda vazia.");
        }
    }
}