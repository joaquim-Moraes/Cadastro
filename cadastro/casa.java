package cadastro;
/*Faça uma pesquisa de busca ativa sobre a utilização da Classe equals( ) no Java e como aplicar.
Em seguida crie um programa em Java que apresente:
Um menu ao usuário com as opçoes para entrada de usuário e senha
Valide a entrada deste usuário, se o usuário e a senha forem igual, exibir uma mensagem "Usuário válido!", senão, " Usuário ou senha inválidos!".
*/
import java.util.Scanner;
public class casa {
public static void main(String[] args) {
    String senha,usu,usuco,senhao;
    usu = "Joaquim";
    senha = "123";
    Scanner ler = new Scanner(System.in);
    System.out.println("Por favor digite o nome de usuário: ");
    usuco = ler.nextLine();
    if (usu.equals(usuco)) {
        System.out.println("Digite a senha do usuário: ");
        senhao = ler.nextLine();
        if (senha.equals(senhao)) {
            System.out.println("Usuario Valido !");
        }else{
            System.out.println("Usuário ou senha inválidos!");
        }
    }else{
        System.out.println("Usuário ou senha inválidos!");
    }
    

}
}
