import java.util.Scanner;

public class condição_ternaria {
    public static void main(String[] args) {

        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.println("Desconto: " + desconto);

        // Se não usar o Scanner, remova a linha abaixo e o import
        // sc.close();
    }
}