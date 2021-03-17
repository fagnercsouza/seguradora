package br.com.visionnaire.desafio.rest;


import br.com.visionnaire.desafio.entities.Cliente;
import br.com.visionnaire.desafio.service.ApoliceService;
import br.com.visionnaire.desafio.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cliente")
@CrossOrigin("*")
public class ClienteRest {

    @Autowired
    private ClienteService service;

    @GetMapping
    public List<Cliente> listarTodos(){
        return service.listarTodos();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorNumero(@PathVariable Long id){
        return new ResponseEntity(service.buscarPorId(id), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity cadastrarApolice(@RequestBody Cliente cliente){
        return new ResponseEntity(service.inserir(cliente), HttpStatus.CREATED);
    }
    @PutMapping
    public ResponseEntity alterar(@RequestBody Cliente cliente){
        Cliente clienteAlterado = service.alterar(cliente);
        return new ResponseEntity(clienteAlterado, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deletar(@PathVariable Long id){
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
