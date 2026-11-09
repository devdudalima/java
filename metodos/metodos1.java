package metodos;

public class metodos1 {
    public static void main(String[] args) {
        caneta c1 = new caneta("bic", "amarelo", 0.5f);
        c1.setModelo("bic");
        c1.setPonta(0.5f);
        c1.status();

        System.out.println("tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());

        caneta c2 = new caneta("faber castel", "rosa", 0.7f );
        c2.status();

    }
}
