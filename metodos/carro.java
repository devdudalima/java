package metodos;

public class carro {
    String modelo;
    String cor;
    int ano;
    boolean temGasolina;

    public carro(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.temGasolina = false;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isTemGasolina() {
        return temGasolina;
    }

    public void setTemGasolina(boolean temGasolina) {
        this.temGasolina = temGasolina;
    }
}
