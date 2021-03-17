package br.com.visionnaire.desafio.rest;

import br.com.visionnaire.desafio.entities.Apolice;
import br.com.visionnaire.desafio.service.ApoliceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/apolice")
@CrossOrigin("*")
public class ApoliceRest {

    @Autowired
    private ApoliceService service;

    @GetMapping
//    @CrossOrigin("*")
    public List<Apolice> listarTodos(){
        return service.listarTodos();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Apolice> buscarPorNumero(@PathVariable Long id){
        return new ResponseEntity(service.buscarPorNumero(id), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity inserir(@RequestBody Apolice apolice){
        return new ResponseEntity(service.inserir(apolice), HttpStatus.CREATED);
    }
    @PutMapping
    public ResponseEntity alterar(@RequestBody Apolice apolice){
        Apolice apoliceAlterada = service.alterar(apolice);
        return new ResponseEntity(apoliceAlterada, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deletar(@PathVariable Long id){
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
