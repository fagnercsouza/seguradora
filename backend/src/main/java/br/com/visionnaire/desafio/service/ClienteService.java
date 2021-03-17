package br.com.visionnaire.desafio.service;

import br.com.visionnaire.desafio.entities.Apolice;
import br.com.visionnaire.desafio.entities.Cliente;
import br.com.visionnaire.desafio.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public Cliente inserir(Cliente cliente){
        return repository.save(cliente);
    }
    public List<Cliente> listarTodos(){
        return repository.findAll();
    }
    public Optional<Cliente> buscarPorId(Long id){
        return repository.findById(id);
    }
    public void deletar(Long id){
        repository.deleteById(id);
    }
    public Cliente alterar(Cliente cliente){
        return repository.save(cliente);
    }
}
