package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.Contato;

public class Programa {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        List<Contato> contatos = new ArrayList<>(4);

        int op = 0;
        int i = 0;

        do {

            System.out.println("                 *** Informe a opção desejada ***");
            System.out.println("(1)Cadastrar contatos, (2)Exibir contatos cadastrados, (3)Localizar contato por código, (4)Localizar contato por nome, (0)Sair");
            op = ler.nextInt();
                    
            switch (op) {
                case 1: //Cadastrar contatos
                    ler.nextLine();
                    System.out.println("================================");
                    System.out.print("Informe o nome: ");
                    String nomePessoa = ler.nextLine();
                    System.out.print("Informe o telefone: ");
                    String telefone = ler.nextLine();
                    System.out.println("================================");
                    contatos.add(new Contato(nomePessoa, telefone, i));                    
                    i++;
                    break;
    
                case 2: //Exibir contatos cadastrados
                    for (Contato contato : contatos) { // para cada contato dentro da coleção contatos, faça
                        System.out.println("================================");
                        System.out.println("Código..: " + contato.getCodigo());
                        System.out.println("Nome....: " + contato.getNome());
                        System.out.println("Telefone: " + contato.getTelefone());
                        System.out.println("");
                    }
                  
                    break;

                case 3: //Localizar contato por código
                    ler.nextLine();
                    System.out.print("Informe o código: ");
                    int i2 = ler.nextInt();
                    System.out.println("================================");
                    System.out.println("Código..: " + contatos.get(i2).getCodigo());
                    System.out.println("Nome....: " + contatos.get(i2).getNome());
                    System.out.println("Telefone: " + contatos.get(i2).getTelefone());
                    break;

    
                case 4: //Localizar contato por nome
                    ler.nextLine();
                    int i3 = 0;
                    System.out.print("Informe o nome: ");
                    String nome = ler.nextLine();

                    for (int j = 0; j < contatos.size() ; j++) {                       
                        if(contatos.get(j).getNome().equals(nome)) {
                            i3 = j;
                        }
                    }
                    System.out.println("================================");
                    System.out.println("Código..: " + contatos.get(i3).getCodigo());
                    System.out.println("Nome....: " + contatos.get(i3).getNome());
                    System.out.println("Telefone: " + contatos.get(i3).getTelefone());
                    break;
    
                case 0:
                    ler.close();
                    System.exit(-1);
                    break;
            
                default:
                    System.out.print("Opção inválida, tente novamente!");
                    break;
            }

        } while(op != 0);


    }
    
}
