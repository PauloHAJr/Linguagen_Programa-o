package br.com.newton.ExemploIO;

import java.io.IOException;

public class PrincipalArquivo {
    public static void main(String[] args)throws IOException {
        String path = "C:/Users/12116312/Documents/teste.txt";

        ManipuladorArquivo.escritor(path);
        ManipuladorArquivo.leitor(path);

    }

}
