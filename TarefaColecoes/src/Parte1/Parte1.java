package Parte1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Parte1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String nomesDasPessoas = "";
        List<String> listaPessoa = new ArrayList<>();

        System.out.println("Ola, digite o nome das pessoas separado por virgula: Exemplo,Exemplo ");

        nomesDasPessoas = scan.nextLine();
        listaPessoa = Arrays.asList(nomesDasPessoas.split(",")) ;

        listaPessoa.sort(String::compareTo);

        System.out.println(listaPessoa);
    }
}
