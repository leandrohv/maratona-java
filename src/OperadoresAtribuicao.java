public class OperadoresAtribuicao {
    public static void main(String[] args) {
        // =, -=, +=, *=, /=, %=
        int salario = 1800;
        int numero = 11;

        // salario = salario + 1000;
        salario += 1000;
        salario -= 1000;
        salario *= 0.1;
        salario = numero %= 2;

        System.out.println(salario);

    }
}
