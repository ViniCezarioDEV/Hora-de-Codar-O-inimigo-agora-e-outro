import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);
        //HORA DE CODAR 7 - O inimigo agora é outro
        // EX 1

        String planeta = "Plutão";
        System.out.println(planeta);

        // EX 2

        System.out.println("Digite seu nome: ");
        String text = entradaDados.next();
        System.out.println(" Olá " + text );

        // EX 3
        System.out.println("Digite sua idade: ");
        int idade = entradaDados.nextInt();
        System.out.printf("Olá, %s, sua idade é %d", text, idade);

        // EX 4
        // retangulo
        System.out.println("Digite a base: ");
        int base = entradaDados.nextInt();
        System.out.println("Digite a altura: ");
        int altura = entradaDados.nextInt();
        System.out.println(" O resultado é " + base*altura );

        // quadrado
        System.out.println("Digite a lado: ");
        int lado = entradaDados.nextInt();
        System.out.println("o valor é: " + lado*lado);

        // trapezio
        System.out.println("digite o base maior: ");
        int baseMaior = entradaDados.nextInt();
        System.out.println("digite o valor da base menor: ");
        int baseMenor = entradaDados.nextInt();
        System.out.println("digite o valor da altura: ");
        int altura2 = entradaDados.nextInt();
        System.out.println("o valor é: " + (baseMaior+baseMenor)*altura2/2);

        // losango
        System.out.println("Digite a diagonal Maior: ");
        int diagonalMaior = entradaDados.nextInt();
        System.out.println("Digite a diagonal menor: ");
        int diagonalMenor = entradaDados.nextInt();
        System.out.println(" O resultado é " + diagonalMaior*diagonalMenor / 2);

        // parelelograma
        System.out.println("Digite a base: ");
        int base4 = entradaDados.nextInt();
        System.out.println("Digite a altura: ");
        int altura4 = entradaDados.nextInt();
        System.out.println(" O resultado é " + base4*altura4 );

        // circulo
        System.out.println("Digite o raio do circulo: ");
        int raio = entradaDados.nextInt();
        System.out.println("o valor da círculo é " + raio * raio * 3.14f);

        // triangulo
        System.out.println("Digite a base: ");
        int base5 = entradaDados.nextInt();
        System.out.println("Digite a altura: ");
        int altura5 = entradaDados.nextInt();
        System.out.println(" O resultado é " + base5*altura5 / 2);

        // EX 5
        System.out.println("Digite um valor");
        int valor = entradaDados.nextInt();
        if (valor > 0){
            System.out.println("o valor é positivo");
        } else if (valor < 0){
            System.out.println("o valor é negativo");
        } else {
            System.out.println("o valor é neutro");
        }

        // EX 6

        ArrayList<Integer> valores = new ArrayList<Integer>(); //criando o array
        int novoValor = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("digite um valor");
            novoValor = entradaDados.nextInt();
            valores.add(novoValor); //adicionando itens no array
        }
        valores.sort(null);
        System.out.println(valores.get(valores.size() - 1));


    // EX 6.1

        ArrayList<Integer> valores = new ArrayList<Integer>(); //criando o array
        int novoValor = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("digite um valor");
            novoValor = entradaDados.nextInt();
            valores.add(novoValor); //adicionando itens no array
        }
        valores.sort(null);
        System.out.println(valores.get(valores.size() - 1));

        //EX 7

        ArrayList<Integer> valores = new ArrayList<Integer>(); //criando o array
        int novoValor = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("digite um valor");
            novoValor = entradaDados.nextInt();
            valores.add(novoValor); //adicionando itens no array
        }
        valores.sort(null);
        int n1 = valores.get(valores.size() - 1);
        int n2 = valores.get(valores.size() - 2);
        System.out.println("A soma dos dois maiores números são: " + (n1 + n2));



    //EX 7.1

        ArrayList<Integer> valores = new ArrayList<Integer>(); //criando o array
        int novoValor = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("digite um valor");
            novoValor = entradaDados.nextInt();
            valores.add(novoValor); //adicionando itens no array
        }
        valores.sort(null);
        int n1 = valores.get(valores.size() - 1);
        int n2 = valores.get(valores.size() - 2);
        System.out.println("A soma dos dois maiores números são: " + (n1 + n2));


        // EX 8

        System.out.println("digite um valor");
        int valor1 = entradaDados.nextInt();

        System.out.println("digite outro valor");
        int valor2 = entradaDados.nextInt();

        while (valor2 == 0){
            System.out.println("o valor não pode ser neutro, digite novamente");
            valor2 = entradaDados.nextInt();
        }
        System.out.println("a divião desses valores são" + valor1 / valor2);



        //EX 9

        double soma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("digite um valor");
            double novoValor = entradaDados.nextDouble();
            soma += novoValor;
        }
        System.out.println("a média desses valores são: " + soma / 10);



        //EX 10

        double soma = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("digite a nota do aluno");
            double novoValor = entradaDados.nextDouble();
            soma += novoValor;
        }
        double media = soma / 4;
        if (media >= 6.0){
            System.out.println("PARABÉNS! Você foi aprovado!");
        } else {
            System.out.println("Você foi REPROVADO!");
        }



        //EX 11

        for (int i = 30; i >= 0 ; i--) {
            System.out.println(i);
        }
        System.out.println("EXPLOSÃO");



        //EX 12

        for (int i = 10; i >= 1 ; i--) {
            System.out.println(i);
        }



        // EX 13

        System.out.println("informe o menor valor");
        int menorValor = entradaDados.nextInt();
        System.out.println("informe o maior valor");
        int maiorValor = entradaDados.nextInt();

        int soma = 0;
        int count = 0;
        for (int i = menorValor; i < maiorValor; i++) {
            soma += i;
            count++;
        }

        double media = (double) soma / count; //(double) para transformar int em double
        System.out.println(media);



        //EX 14

        double nota;
        char resp = 's';

        do {
            double media = 0;
            double soma = 0;

            for (int i = 1; i <= 6; i++) {
                System.out.println("Qual a " + i + " nota?");
                nota = entradaDados.nextDouble();
                soma += nota;
            }

            media = soma / 6;

            if (media >= 6.5) {
                System.out.println("Aluno Aprovado!");
            } else {
                System.out.println("Aluno Reprovado!");
            }

            System.out.println("Deseja continuar?\n[s | n]");
            resp = entradaDados.next().charAt(0);
        } while(resp=='s');


        // EX 15

        double alturaAnacleto = 1.50;
        double alturaFelisberto = 1.10;
        double crescimentoAnacleto = 0.02; // 2 cm/ano em metros
        double crescimentoFelisberto = 0.03; // 3 cm/ano em metros
        int anos = 0;
        while (alturaFelisberto <= alturaAnacleto) {
            alturaAnacleto += crescimentoAnacleto;
            alturaFelisberto += crescimentoFelisberto;
            anos++;
        }
        System.out.println("Felisberto será mais alto que Anacleto em " + anos + " anos.");

    }
}