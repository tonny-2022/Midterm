package edu.miu.cs498.vegatablegardenapp.service.impl;

import edu.miu.cs498.vegatablegardenapp.model.Garden;
import edu.miu.cs498.vegatablegardenapp.repository.GardenRepository;
import edu.miu.cs498.vegatablegardenapp.service.GardenService;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
public class GardenServiceImpl  implements GardenService {
    public final GardenRepository gardenRepository;
    @Override
    public Optional<Garden> addNewGarden(Garden garden) {
        return Optional.of(gardenRepository.save(garden));
    }

    @Override
    public Optional<Garden> updateGardenById(Integer Id,Garden garden) {

        Optional<Garden> gardenToUpdate= gardenRepository.findById(Id);
        if(gardenToUpdate.isPresent()){
            gardenToUpdate.get().setName(garden.getName());
            gardenToUpdate.get().setSize(garden.getSize());
        }

        return gardenToUpdate;
    }

    @Override
    public void deleleteGardenById(Integer Id) {
        gardenRepository.deleteById(Id);
    }

    @Override
    public List<Garden> getAllGardens() {
        return gardenRepository.findAll();
    }
}
