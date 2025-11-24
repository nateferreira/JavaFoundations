package variaveis;

public class VariaveisRegras {
    public static void main (String[] args) {
        // Informar o tipo de valor que será armazenado
        // nome = "Manoel"; Não pode, tem que indicar o tipo
        String nome = "Manoel"; // <<< a forma correta é indicando o tipo "String"...

        // Não pode atribuir valores inadequados a um tipo de variável
        // String pessoa = 10; pois o 10 é um valor númerico...
        String pessoa = "10"; // <<< essa forma com as aspas, indica que o 10 é texto.

        // Não podemos atribuir o mesmo para duas variaveis.
        String nome2 = "Diego";

        // Nomes de variaveis não podem começar com números
        // String 3nome = "Diego"; <<< dá erro pois a váriavel começa com um número
        String nome3 = "Diego"; // <<< o modo correto de se fazer.

        // CONVENÇÃO:
        // * camelCase
        String nomeCompleto = "Nathan Ferreira";

        // * snake-case
        String nome_completo= "Nathan Paiva";

        System.out.println(nome_completo);

        // Não podemos usar palavras reservadas como variáveis.
        String valor = "Sistema";




    }
}
