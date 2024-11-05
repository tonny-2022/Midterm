package edu.miu.cs498.vegatablegardenapp.service.impl;

import edu.miu.cs498.vegatablegardenapp.model.Plant;
import edu.miu.cs498.vegatablegardenapp.repository.PlantRepository;
import edu.miu.cs498.vegatablegardenapp.service.PlantService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class PlantServiceImpl  implements PlantService {
    PlantRepository plantRepository;
    @Override
    public List<Plant> getAllPlants() {
        return plantRepository.findAll();
    }

    @Override
    public Optional<Plant> saveNewPlant(Plant plant) {
        return Optional.of(plantRepository.save(plant));
    }

    @Override
    public Optional<Plant> updatePlantById(Integer Id,Plant plant) {
        Optional<Plant> plantToUpdate=plantRepository.findById(Id);
        if(plantToUpdate.isPresent()){
            plantToUpdate.get().setName(plant.getName());
            plantToUpdate.get().setType(plant.getType());
            plantToUpdate.get().setPlantDate(plant.getPlantDate());

        }
        return plantToUpdate;
    }

    @Override
    public void deletePlantById(Integer Id) {
        plantRepository.deleteById(Id);
    }

    @Override
    public List<Plant> getAllByOrderByName() {
        return plantRepository.getAllByOrderByName();
    }

    @Override
    public List<Plant> getAllOrderByDate() {
        return plantRepository.getAllByOrderByPlantDate()
                ;
    }


}
