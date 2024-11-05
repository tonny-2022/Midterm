package edu.miu.cs498.vegatablegardenapp;

import edu.miu.cs498.vegatablegardenapp.model.Garden;
import edu.miu.cs498.vegatablegardenapp.model.Plant;
import edu.miu.cs498.vegatablegardenapp.service.GardenService;
import edu.miu.cs498.vegatablegardenapp.service.PlantService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class VegatableGardenAppApplication  implements CommandLineRunner {

    public  final GardenService gardenService;
    public final PlantService plantService;

    public static void main(String[] args) {
        SpringApplication.run(VegatableGardenAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Garden garden1= new Garden("Vegetable Patch",50.0);
        Garden garden2= new Garden("Herb Garden",20.0);

        gardenService.addNewGarden(garden1);
        gardenService.addNewGarden(garden2);

        Plant plant1= new Plant("Tomato","Vegatable","2024-03-10");
        Plant plant2=  new Plant("Carrot","Vegatbale","2024-02-20");
        Plant plant3 = new Plant("Basil","Herb","2024-04-05");

        garden1.setPlantList(List.of(plant1,plant2));
        garden2.setPlantList(List.of(plant3));




        plantService.saveNewPlant(plant1);
        plantService.saveNewPlant(plant2);
        plantService.saveNewPlant(plant3);
        //get all gardens
        List<Garden> gardens = gardenService.getAllGardens();

        for(Garden g:gardens){
            System.out.println("Garden name:"+ g.getName()+" size: "+g.getSize());
        }

    List<Plant> plantListbyname=plantService.getAllByOrderByName();

        for (Plant p: plantListbyname){

            System.out.println("Name:" +plantListbyname.get(0).getName()+" type:"+plantListbyname.get(0).getType()+" "+plantListbyname.get(0).getPlantDate()+" "+plantListbyname.get(0).getGarden());
        }

        List<Plant> plantListbydate=plantService.getAllOrderByDate();

        for(Plant p :plantListbydate){

            System.out.println(plantListbydate.get(0).getName()+" "+plantListbydate.get(0).getType()+" "+plantListbydate.get(0).getPlantDate()+" "+plantListbydate.get(0).getGarden());

        }




    }








}
