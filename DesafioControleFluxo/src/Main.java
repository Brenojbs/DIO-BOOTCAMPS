import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParametrosInvalidosExeption {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int parametro1 = Integer.parseInt(scanner.next());

        System.out.print("Digite o segundo valor: ");
        int parametro2 = Integer.parseInt(scanner.next());

        try {
            Contador contador = new Contador();
            contador.analise(parametro1, parametro2);
        }catch (ParametrosInvalidosExeption exception) {
            throw exception;
        } finally {
            scanner.close();
            System.out.print("Fim do Contador!");
        }
    }
}