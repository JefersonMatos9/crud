package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private int idade;
    private List<Cliente> clientes;

    public Cliente() {
        clientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void inserirCliente(String nome, int idade) {
        Cliente novoCliente = new Cliente();
        novoCliente.setNome(nome);
        novoCliente.setIdade(idade);
        clientes.add(novoCliente);
    }

    public void excluirNome(String nomeExcluir) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nomeExcluir)) {
                clientes.remove(cliente);
                break;
            }
        }
    }

    public boolean editarCliente(String nomeAtual, String novoNome, int novaIdade) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nomeAtual)) {
                cliente.setNome(novoNome);
                cliente.setIdade(novaIdade);
                return true;
            }
        }
        return false;
    }

    public void exibirLista() {
        for (Cliente cliente : clientes) {
            System.out.println("Nomes:" + cliente.getNome() + ",idade:" + cliente.getIdade());
        }
    }

    public Cliente consultarClientePorNome(String consultaNome) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nome)) {
                System.out.println("Cliente encontrado: " + cliente.getNome());
                return cliente;

            }
        }
        return null;
    }
}
