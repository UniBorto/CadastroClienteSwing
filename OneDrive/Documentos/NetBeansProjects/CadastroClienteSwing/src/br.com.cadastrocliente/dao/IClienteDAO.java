/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Borto
 */

package br.com.cadastrocliente.dao;

import br.com.cadastrocliente.domain.Cliente;
import java.util.Collection;

public interface IClienteDAO {
    Boolean cadastrar(Cliente cliente);
    Collection<Cliente> buscarTodos();
    Cliente consultar(String cpf);
    Boolean excluir(String cpf);
}