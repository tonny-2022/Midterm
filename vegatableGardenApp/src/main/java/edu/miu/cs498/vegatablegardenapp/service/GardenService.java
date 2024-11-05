package edu.miu.cs498.vegatablegardenapp.service;

import edu.miu.cs498.vegatablegardenapp.model.Garden;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface GardenService {

    public Optional<Garden> addNewGarden(Garden garden);
    public Optional<Garden> updateGardenById(Integer Id,Garden garden);

    public void deleleteGardenById(Integer Id);

    public List<Garden> getAllGardens();

}
