package com.iet.parrucchieria.dto;

import lombok.Data;

@Data
public class ServizioClienteDTO {

    private String nomeCliente;
    private String nomeDipendente;
    private Integer durataServizio;
    private Double prezzo;
}
