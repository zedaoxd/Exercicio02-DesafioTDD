package com.devsuperior.bds02.services;

import com.devsuperior.bds02.dto.EventDTO;
import com.devsuperior.bds02.entities.City;
import com.devsuperior.bds02.entities.Event;
import com.devsuperior.bds02.reposiroties.EventRepository;
import com.devsuperior.bds02.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.time.LocalDate;

@Service
public class EventService {

    @Autowired
    private EventRepository repository;

    @Transactional
    public EventDTO update(Long id, EventDTO dto) {
        try {
            Event entity = repository.getOne(id);
            entity.setId(id);
            entity.setCity(new City(dto.getCityId(), null));
            entity.setDate(LocalDate.from(dto.getDate()));
            entity.setName(dto.getName());
            entity.setUrl(dto.getUrl());
            entity = repository.save(entity);
            return new EventDTO(entity);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException("Id not found: " + id);
        }
    }
}
