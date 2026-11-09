import java.util.Arrays;

public class aula14 {
    public static void main(String[] args) {

    int num[] = {3,6,9,1,2};

    Arrays.sort(num);

    for (int valor: num) {
        System.out.println(valor);
    }

    Arrays.binarySearch(num, 1);

    }
}

