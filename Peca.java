package Computador;

public class Peca {

    private String fabricante;
    private String marca;
    private String modelo;
    private double preco;

    public Peca(String fabricante, String marca, String modelo, double preco) throws Exception {
        setFabricante(validaString(fabricante));
        setMarca(validaString(marca));
        setModelo(validaString(modelo));
        setPreco(validaPreco(preco));
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String validaString(String string) throws Exception {
        if(string == null || string.isBlank()){
            throw new Exception("O campo não pode ser vazio");
        }
        return string;
    }

    public double validaPreco(double preco) throws Exception {
        if(preco < 0){
            throw new Exception(" O valor deve ser positivo.");
        }

        return preco;
    }
    public void exibeDados(){
        System.out.printf("%s %s %s %.2f \n", fabricante, marca, modelo, preco);
    }


}
