package br.com.visionnaire.desafio.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_cliente")
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clienteGerador")
    @SequenceGenerator(name = "clienteGerador", sequenceName = "cliente_seq", allocationSize = 1)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false, unique = true)
    @CPF
    private String cpf;
    @Column(nullable = false)
    private String cidade;
    @Column(nullable = false)
    private String uf;

}
