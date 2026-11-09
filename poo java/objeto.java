public class objeto {

    public static void main(String[] args) {
        carro carro1 = new carro();
        
        carro1.modelo = "civic";
        carro1.ano = 2009;
        carro1.temGasolina = false;
        carro1.cor = "preto";

        carro1.consultar();
        carro1.tanque();
        carro1.abastecer();
        carro1.dirigir();
    }
}