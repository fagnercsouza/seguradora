package br.com.visionnaire.desafio.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_apolice")
public class Apolice implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "apoliceGerador")
    @SequenceGenerator(name = "apoliceGerador", sequenceName = "apolice_seq", allocationSize = 1)
    private Long numeroApolice;
    @Column(nullable = false)
    private LocalDateTime inicioContrato;
    @Column(nullable = false)
    private LocalDateTime fimContrato;
    @Column(nullable = false)
    private String placaVeiculo;
    @Column(nullable = false)
    private Double valorApolice;
//    @ManyToOne
//    @JoinColumn(name = "id_cliente")
//    @JsonIgnore
//    private Cliente cliente;

    @PrePersist
    private void setCriacao(){
        this.inicioContrato =  LocalDateTime.now();
    }

}
