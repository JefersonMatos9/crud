package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente crud = new Cliente();

        crud.inserirCliente("Deco", 30);
        crud.inserirCliente("Miguel", 5);
        crud.inserirCliente("Marly", 5);
        crud.inserirCliente("Gelcir", 5);

        crud.exibirLista();

        crud.excluirNome("Rlx");
        System.out.println("==================================================");
        crud.editarCliente("Deco", "Jeferson", 30);
        crud.excluirNome("Gelcir");
        crud.exibirLista();

        crud.consultarClientePorNome("Jeferson");

    }
}