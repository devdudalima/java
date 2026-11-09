public class FirstProgram {
    public static void main (String[] arguments) {
        System.out.println("ola, mundo, estou escrevendo em java!");

        int idade = 20;
        boolean casado = false;
        String nome = "duda";
        float nota = 9.5f;

        //sout 
        System.out.println("minha idade é: " + idade);
        System.out.println("meu nome é: " + nome);
        System.out.println("estou casado: " + casado);
        
        System.out.printf("a nota de %s formatada é: %.2f", nome, nota);
        //printf formata a nota para duas casas decimais
    }
}