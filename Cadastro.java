package Computador;

import java.util.Scanner;

public class Cadastro {

    private static String fabricante;
    private static String marca;
    private static String modelo;
    private static double preco;


    public static void cadastraItens(){
        Scanner scan = new Scanner(System.in);

        System.out.print("FABRICANTE: ");
        fabricante = scan.nextLine().trim();

        System.out.print("MARCA: ");
        marca = scan.nextLine().trim();

        System.out.print("MODELO: ");
        modelo = scan.nextLine().trim();

        System.out.print("PRECO: ");
        String precoString = scan.nextLine().trim();
        preco = Double.parseDouble(precoString);

        scan.close();
    }

    public static String getFabricante() {
        return fabricante;
    }

    public static void setFabricante(String fabricante) {
        Cadastro.fabricante = fabricante;
    }

    public static String getMarca() {
        return marca;
    }

    public  static void setMarca(String marca) {
        Cadastro.marca = marca;
    }

    public static String getModelo() {
        return modelo;
    }

    public static void setModelo(String modelo) {
        Cadastro.modelo = modelo;
    }

    public static  double getPreco() {
        return preco;
    }

    public static void setPreco(double preco) {
        Cadastro.preco = preco;
    }
}
