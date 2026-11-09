public class carro {
    
        String modelo;
        String cor;
        int ano;
        boolean temGasolina;

        void tanque() {
            System.out.print("o tanque do " + this.modelo + " está ");
            if (temGasolina == true) {
                System.out.print("cheio!");
            } else {
                System.out.println("vazio!");
            }
        }

        void dirigir() {
            if (temGasolina == true) {
                System.out.println("voce dirigiu o " + this.modelo);
            } else {
                System.out.println("voce nao pode dirigir com o tanque vazio!");
            }
        }

        void abastecer(){
            temGasolina = true;
            System.out.println(this.modelo + " abastecido com sucesso!");
        }

        void consultar(){
            System.out.println("o seu carro é um " + this.modelo + " " + this.ano + " de cor " + this.cor);
        }
}
