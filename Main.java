package Computador;

import java.util.Scanner;

public class Main {



    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("============================================");
        System.out.println("             CADASTRO DE ITENS              ");
        System.out.println("============================================");

        System.out.println("Qual peça deseja cadastrar?\n");
        System.out.println("[1]PLACA MÃE");
        System.out.println("[2]PROCESSADOR");
        System.out.println("[3]PLACA DE VÍDEO");
        System.out.println("[4]ARMAZENAMENTO");
        System.out.println("[5]MEMORIA RAM\n");
        System.out.print("Digite o número correspondete a opção desejada: ");

        int opcao = Integer.parseInt(scan.nextLine().trim());



        switch(opcao){
            case 1 :
                Cadastro.cadastraItens();
                break;
            case 2:
                Cadastro.cadastraItens();
                break;
            case 3:
                Cadastro.cadastraItens();
                break;
            case 4:
                Cadastro.cadastraItens();
                break;
            case 5:
                Cadastro.cadastraItens();
                break;
            default:
                System.out.println("Digite um valor válido!");
        }

        try{
            PlacaMae placaMae = new PlacaMae(Cadastro.getFabricante(), Cadastro.getMarca(), Cadastro.getModelo(), Cadastro.getPreco());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println();
        scan.close();

    }
}
