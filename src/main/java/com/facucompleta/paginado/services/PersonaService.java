package com.facucompleta.paginado.services;


import com.facucompleta.paginado.entities.Persona;
import com.facucompleta.paginado.repositories.BaseRepository;
import com.facucompleta.paginado.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PersonaService extends BaseService<Persona,Long> {
    List<Persona> search(String filtro) throws Exception;

    Page<Persona> search(String filtro, Pageable pageable) throws Exception;
}