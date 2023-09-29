package com.ikm.assessment.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ikm.assessment.contract.CitizenDTO;
import com.ikm.assessment.model.Citizen;
import com.ikm.assessment.repository.CitizenRepository;

@Service
public class CitizenService {

    @Autowired
    private CitizenRepository citizenRepository;

    @Autowired
    private ModelMapper modelMapper;

    public Citizen createCitizen(CitizenDTO citizenDTO) {
        try {
            Citizen citizen = MapDTOToModel(citizenDTO);
            return citizenRepository.save(citizen);
        } catch (Exception e) {
            throw new RuntimeException("Failed to create Citizen", e);
        }

    }

    public Citizen MapDTOToModel(CitizenDTO citizenDTO) {
        try {
            return modelMapper.map(citizenDTO, Citizen.class);
        } catch (Exception e) {
            throw new RuntimeException("Mapping DTO to Model failed", e);
        }

    }
}