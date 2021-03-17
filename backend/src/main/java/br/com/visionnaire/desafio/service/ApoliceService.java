package br.com.visionnaire.desafio.service;

import br.com.visionnaire.desafio.entities.Apolice;
import br.com.visionnaire.desafio.repository.ApoliceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ApoliceService {

    @Autowired
    private ApoliceRepository repository;

    public Apolice inserir(Apolice apolice){
        return repository.save(apolice);
    }
    public List<Apolice> listarTodos(){
        return repository.findAll();
    }
    public Optional<Apolice> buscarPorNumero(Long numeroApolice){
        return repository.findById(numeroApolice);
    }
    public void deletar(Long numeroApolice){
        repository.deleteById(numeroApolice);
    }
    public Apolice alterar(Apolice apolice){
        return repository.save(apolice);
    }
}
