/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
    package br.com.cadastrocliente.dao;
    import br.com.cadastrocliente.domain.Cliente;
    import java.util.Collection;
    import java.util.HashMap;
    import java.util.Map;


public class ClienteMapDAO implements IClienteDAO {
    private Map<String, Cliente> map;

    public ClienteMapDAO() {
        this.map = new HashMap<>();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        if (map.containsKey(cliente.getCpf())) {
            return false;
        }
        map.put(cliente.getCpf(), cliente);
        return true;
    }
    
    @Override
public Boolean excluir(String cpf) {
    if (map.containsKey(cpf)) {
        map.remove(cpf);
        return true;
    }
    return false;
}

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.map.values();
    }

    @Override
    public Cliente consultar(String cpf) {
        return this.map.get(cpf);
    }
}