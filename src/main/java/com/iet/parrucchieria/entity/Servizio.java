package com.iet.parrucchieria.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Servizio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Basic
    @Column(name = "prezzo", nullable = false)
    private Double prezzo;

    @Basic
    @Column(name = "durata", nullable = false)
    private Integer durata;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_dipendente", nullable = false)
    private Dipendente dipendente;

    @CreatedDate
    @Column
    private Timestamp dataCreazione;
    @LastModifiedDate
    @Column
    private Timestamp dataUltimaModifica;
    @Version
    @Column
    private int versione;

}
