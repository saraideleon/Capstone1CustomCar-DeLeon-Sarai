package com.example.CustomCarsToOrder.Service;

import com.example.CustomCarsToOrder.Dao.IndividualPartsRepository;
import com.example.CustomCarsToOrder.Dto.IndividualParts;
import com.example.CustomCarsToOrder.Dto.InventoryDisplay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Component
public class IndividualPartsService{
    @Autowired
    private IndividualPartsRepository individualPartsRepo;

    public IndividualParts addIndividualPart(IndividualParts individualPart) {//meets requirement to add new individual item to inventory
        individualPartsRepo.save(individualPart);
        return individualPart;
    }

    public void updateIndividualParts(IndividualParts individualPart, Integer id) { //meets requirement to update part price and quantity in stock
        Optional<IndividualParts> ips = individualPartsRepo.findById(id);
        if (id != ips.get().getIndPrtId()) {
            throw new IllegalArgumentException("Individual Part Id must match an existing Id in the inventory.");
        }
        individualPartsRepo.save(individualPart);
    }

    public List<IndividualParts> getAllIndividualParts() {
        getInventoryDisplay();
        return individualPartsRepo.findAll();
    }

    public void deleteIndividualPart(Integer id) {
       /* if (IndividualParts.get() != id) {
            throw new IllegalArgumentException("Ind. Prt. Id must match an existing individual part to delete.");
        }*/
        Optional<IndividualParts> ips = individualPartsRepo.findById(id);
        individualPartsRepo.delete(ips.get());
    }

    public List<InventoryDisplay> getInventoryDisplay() {
        Object[] obj =  individualPartsRepo.countavailableParts();
        List<InventoryDisplay> listOfInventoryDisplay = new ArrayList<>();
        for(int i=0;i<obj.length; i++){
            System.out.println(obj[i]);
            Object[] list= (Object[] )obj[i];
            InventoryDisplay inventoryDisplay = new InventoryDisplay();
            inventoryDisplay.setPrtId((Integer) list[0]);
            inventoryDisplay.setPrtName(list[1].toString());
            inventoryDisplay.setCount(Integer.parseInt(list[2].toString()));

            listOfInventoryDisplay.add(inventoryDisplay);
        }
        return listOfInventoryDisplay;
    }

    public IndividualParts getIndividualPartById(Integer id){
        return individualPartsRepo.findById(id).get();
    }

//HELP!!
//    public IndividualParts getIndividualPartsBelow50(IndividualParts individualPart, String prt_status) {
//        if (individualPart.getIndividualPartStatus() != "available")
//    }
}



//    @RequestMapping(value="/individual_parts/prt_status/{prt_status1}/{prt_status2}", method = RequestMethod.GET)
//    public List<IndividualParts> getIndividualPartsBelow50(@PathVariable String prt_status1, @PathVariable String prt_status2) {
//            List<IndividualParts> individualPartsBelow50 = new ArrayList<>();
//
//            for (IndividualParts individualParts : individualPartsList) {
//                if (individualParts.getIndividualPartStatus == "available" && individualParts.getIndividualPartStatus == "unused" && individualParts.getIndividualPartId >= 50)
//                    individualPartsBelow50.add(individualParts);
//
//            }
//
//            return individualPartsBelow50;
//        return service.findIndividualPartsByEitherPrtStatus(prt_status1, prt_status2);
//    }
//
//
//}
//
//        for(City city : cityList) {
//            if (city.getState().equalsIgnoreCase(state))
//                stateCities.add(city);
//        }
//
//        return stateCities;
//    }

