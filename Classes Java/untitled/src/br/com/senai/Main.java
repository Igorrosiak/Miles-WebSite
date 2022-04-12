package br.com.senai;

import br.com.senai.model.Usuario;

public class Main {

    public static void main(String[] args) {

        Usuario igor = new Usuario("Igor Luiz Belter Rosiak", "Igorluizbelterrosiak@gmail.com", "48-988425374", "Servidaojnf", "4532525");
        igor.setPagamento("Boleto", 400);
        System.out.println(igor);
    }
}
