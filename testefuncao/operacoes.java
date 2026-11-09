package testefuncao;

public class operacoes {
    
    public static String contador (int inicio, int fim) {
        String s = "";
        for (int c = inicio; c <= fim; c++){
            s += c + " ";
        }
        return s;
    }
}
