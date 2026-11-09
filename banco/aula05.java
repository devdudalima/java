package banco;

public class aula05 {
    public static void main(String[] args) {
        contaBanco p1 = new contaBanco();
        p1.setNumConta(1111);
        p1.setDono("jubinha");
        p1.abrirConta("cc"); 

        contaBanco p2 = new contaBanco();
        p2.setNumConta(2222);
        p2.setDono("duda");
        p2.abrirConta("cp");

        p1.estadoAtual();
        p2.estadoAtual();
    }
}
