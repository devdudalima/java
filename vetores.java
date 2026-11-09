import java.util.Arrays;

public class vetores {
    public static void main(String[] args) {

        int num[] = {3,6,7,2,1};
        Arrays.sort(num);
        for(int valor: num) {
            System.out.println(valor);
        }


        int vet[] = {10, 5, 1, 8};
        Arrays.sort(vet);
        int p = Arrays.binarySearch(vet, 1);

        System.out.println("o numero esta na posicao: " + p);

    }
}
