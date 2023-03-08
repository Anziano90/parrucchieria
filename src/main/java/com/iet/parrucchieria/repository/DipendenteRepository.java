package com.iet.parrucchieria.repository;

import com.iet.parrucchieria.entity.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface DipendenteRepository extends JpaRepository<Dipendente, Long> {

    @Query("select d from Dipendente d where d.id = ?1")
    Optional<Dipendente> findByID(Long id);

    @Query("select d from Dipendente d")
    List<Dipendente> findAll();

    @Query("select d from Dipendente d where d.cf like ?1")
    List<Dipendente> findAllByCf(String cf);

    @Query("select d from Dipendente d where d.nome like ?1 and d.cognome like ?2 order by d.cognome, d.nome")
    List<Dipendente> findByNomeAndCognome(String nome, String cognome);

}