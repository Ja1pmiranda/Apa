public class Main {

    // Função iterativa para calcular o MDC
    /*Iterativa (fi): A função mdcIterativo usa um loop while para continuar dividindo a 
    por b até que b se torne zero. O valor de a naquele ponto será o MDC. */
    public static int mdcIterativo(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Função recursiva para calcular o MDC
    /*Recursiva (fr): A função mdcRecursivo chama a si mesma, reduzindo o problema a 
    subproblemas menores, até que b seja igual a zero. O valor de a será o MDC. */
    public static int mdcRecursivo(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mdcRecursivo(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println("Trabalho DE APA - Cálculo do MDC");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int[] resultadoIterativo = new int[n];
        int[] resultadoRecursivo = new int[n];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            resultadoIterativo[i] = mdcIterativo(a, b);
            resultadoRecursivo[i] = mdcRecursivo(a, b);           
            
        }

        for (int i = 0; i < n; i++){
            System.out.println(resultadoIterativo[i] + " " + resultadoRecursivo[i]);
        }

        sc.close();
    }
    
}
