import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            // idade 21
            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();
            if (idade > 21) {
                System.out.println("A pessoa tem mais de 21 anos.");
            } else {
                System.out.println("A pessoa não tem mais de 21 anos.");
            }
            
            // salário
            System.out.print("Digite seu salário: ");
            double salario = scanner.nextDouble();
            double salarioMinimo = 1412.00; 
            if (salario > 5 * salarioMinimo) {
                System.out.println("O salário é maior que 5 vezes o salário mínimo.");
            } else {
                System.out.println("O salário não é maior que 5 vezes o salário mínimo.");
            }
            
            // altura
            System.out.print("Digite sua altura (em metros): ");
            double altura = scanner.nextDouble();
            if (altura > 1.75) {
                System.out.println("A altura é maior que 1,75 m.");
            } else {
                System.out.println("A altura não é maior que 1,75 m.");
            }
            
            //  peso
            System.out.print("Digite seu peso (em kg): ");
            double peso = scanner.nextDouble();
            if (peso > 70) {
                System.out.println("O peso é maior que 70 kg.");
            } else {
                System.out.println("O peso não é maior que 70 kg.");
            }
            
            // sobrenome
            scanner.nextLine(); 
            System.out.print("Digite seu sobrenome: ");
            String sobrenome = scanner.nextLine();
            String meuSobrenome = "Nogueira";
            if (!sobrenome.equals(meuSobrenome)) {
                System.out.println("O sobrenome é diferente do seu.");
            } else {
                System.out.println("O sobrenome é igual ao seu.");
            }
            
            // gênero
            System.out.print("Digite seu gênero (f/m): ");
            char genero = scanner.next().charAt(0);
            if (genero == 'f') {
                System.out.println("O gênero é feminino.");
            } else {
                System.out.println("O gênero não é feminino.");
            }
        }
    }
}
