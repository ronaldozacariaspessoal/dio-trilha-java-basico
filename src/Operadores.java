public class Operadores {
    public static void main (String[] args){
//classe Operadores.java
        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);
        System.out.println(soma);
        System.out.println(subtração);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(modulo);
        System.out.println(resultado);

        String nomeCompleto = "LINGUAGEM" + "JAVA";

//qual o resultado das expressoes abaixo?

        String concatenacao ="?";
        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        int numero = 5;
        numero = -numero;
        System.out.println(numero);

        numero = +numero;
        System.out.println(numero);

        numero = numero * -1;
        System.out.println(numero);

        numero++;
        System.out.println(numero);
        System.out.println(++numero);
        System.out.println(--numero);
        System.out.println(numero);
        int a,b;
        a = 6;
        b = 5;
        int resultado2 = a == b ? 1 : 0;
        System.out.println(resultado2);

        b = 6;
        String resultado3 = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado3);

//        operadores lógicos
        System.out.println(" ---- operadores lógicos ------");
        boolean condicao1=true;
        boolean condicao2=true;

        if(condicao1 && condicao2){
            System.out.println("as duas condições são verdadeiras");
        }
        if (condicao1 || condicao2){
            System.out.println("pelo menos uma das condições é verdadeira");
        }

        System.out.println("fim");



    }
}
