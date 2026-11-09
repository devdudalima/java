package metodos;

public class caneta {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public caneta(String m, String c, float p) { // metodo construtor
        setModelo(m);
        this.cor = c;
        this.ponta = p;
        this.tampar();
    }

    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }
    public void setPonta(float p) {
        this.ponta = p;
    }

    public void status() {
        System.out.println("SOBRE A CANETA:");
        System.out.println("modelo: " + this.modelo);
        System.out.println("ponta: " + this.ponta);
        System.out.println("cor: " + this.cor);
        System.out.println("tampada: " + this.tampada);
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

}
