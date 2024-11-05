package edu.miu.cs498.vegatablegardenapp.repository;

import edu.miu.cs498.vegatablegardenapp.model.Garden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface GardenRepository extends JpaRepository<Garden,Integer> {
}
