public class Contador {

    public Contador() {}

    public static void analise(int inicio, int fim) throws ParametrosInvalidosExeption {
        if (inicio > fim) {
            throw new ParametrosInvalidosExeption("O segundo parâmetro deve ser maior que o primeiro");
        }

        for (int index = 1; index <= fim - inicio; index++) {
            System.out.println("Imprimindo o número " + index);
        }
    }
}
