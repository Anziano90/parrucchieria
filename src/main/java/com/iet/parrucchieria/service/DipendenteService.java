package com.iet.parrucchieria.service;

import com.iet.parrucchieria.entity.Dipendente;
import com.iet.parrucchieria.repository.DipendenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DipendenteService {

    @Autowired
    DipendenteRepository dipendenteRepository;

    public List<Dipendente> findAll() {
        return dipendenteRepository.findAll();
    }

    public Dipendente insertDipendente(Dipendente dipendente) {
        return dipendenteRepository.save(dipendente);
    }

    public Optional<Dipendente> findById(Long id) {
        return dipendenteRepository.findById(id);
    }

    public Dipendente save(Dipendente dipendente) {
        return dipendenteRepository.save(dipendente);
    }

    public void delete(Dipendente dipendente) {
        dipendenteRepository.delete(dipendente);
    }
}