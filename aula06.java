import java.util.Scanner;

public class aula06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = scanner.nextFloat();
        
        System.out.format("a nota de %s é %.1f", nome, nota);

        // numero para string
        int idade = 20;
        String idadeString = Integer.toString(idade);

        // string para numero
        String valor = "30";
        int numero = Integer.parseInt(valor);

        // string para float
        String valorf = "9.5";
        float idadef = Float.parseFloat(valorf);
    }
}
