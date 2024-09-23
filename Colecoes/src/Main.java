import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nomesDasPessoas = "";
        List<String> listaPessoa = new ArrayList<>();

        ListaPessoas listadetalhada = new ListaPessoas();

        System.out.println("Ola, dijite o nome das pessoas separado por virgula, Exemplo,Exemplo ");

        nomesDasPessoas = scan.nextLine();
        listaPessoa = Arrays.asList(nomesDasPessoas.split(","));

        listaPessoa.sort(String::compareTo);


        for(String pessoa : listaPessoa ){
             String[] nomesGeneros = pessoa.split("-");
             
             listadetalhada.adicionarPessoa(nomesGeneros[0], nomesGeneros[1])
        };

        
        listadetalhada.filtraPessoas();
    }
}