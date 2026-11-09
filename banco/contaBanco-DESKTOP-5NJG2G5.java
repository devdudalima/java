package banco;

public class contaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public contaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public void estadoAtual() {
        System.out.println("conta: " + this.getNumConta());
        System.out.println("tipo: " + this.getTipo());
        System.out.println("dono: " + this.getDono());
        System.out.println("saldo: " + this.getSaldo());
        System.out.println("status: " + this.getStatus());
        System.out.println("-------------------------------");

    }

    public void abrirConta(String tipoConta){
        this.setTipo(tipoConta);
        this.setStatus(true);

        System.out.println("a conta de " + this.getDono() + " foi aberta com sucesso!");

        if (this.tipo == "cc") {
            this.setSaldo(50);
        } else if (this.tipo == "cp") {
            this.setSaldo(150);
        } 
    }
    public void fecharConta(){
        if ( this.getSaldo() > 0){
            System.out.println("sua conta nao pode ser fechada porque ainda ha saldo disponivel!");
        } else {
            this.setStatus(false);
            System.out.println("conta encerrada com sucesso");
        }
    }
    public void depositar(float valor){
        if ( this.getStatus()){

            this.setSaldo(this.getSaldo() + valor);

            System.out.println("voce depositou " + valor);
        } else {
            System.out.println("impossivel depositar!");
        }

    }
    public void sacar(float valor){
        if ( this.getStatus() && this.saldo >= valor){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("voce sacou " + valor);
        } else {
            System.out.println("impossivel sacar!");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "cc"){
            v = 12;
        } else if (this.getTipo() == "cp"){
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("mensalidade paga com sucesso!");
        } else {
            System.out.println("impossivel pagar a mensalidade");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
