package desafios;

import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {

        //Desafio 5: Validação de Login e Senha
        //Peça ao usuário um login e uma senha. Valide se:
        //O login contém pelo menos 5 caracteres.
        //A senha tem pelo menos 8 caracteres.
        //Exiba uma saída mostrando se o Login e a Senha são validos.

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o login: ");
        String login = sc.nextLine();
        System.out.print("Digite a senha: ");
        String senha = sc.nextLine().trim();

        if (login.length() >= 5 && senha.length() >= 8) {
            System.out.println("Usuário e senha válidas");
        }  else {
            System.out.println("Usuário ou senha inválida");
        }

        sc.close();
    }
}