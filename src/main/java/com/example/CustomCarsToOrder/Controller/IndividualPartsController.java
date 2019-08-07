package com.example.CustomCarsToOrder.Controller;

import com.example.CustomCarsToOrder.Dto.IndividualParts;
import com.example.CustomCarsToOrder.Dto.InventoryDisplay;
import com.example.CustomCarsToOrder.Service.IndividualPartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;


@RestController
public class IndividualPartsController {
    @Autowired //will link variable to controller
    private IndividualPartsService service;//service layer will interact with DAO, which will interact with DB

    @RequestMapping(value="/individual_parts", method= RequestMethod.POST)
    public IndividualParts addIndividualPart(@RequestBody @Valid IndividualParts individualParts) {
        service.addIndividualPart(individualParts);
        return individualParts;
    }

    @RequestMapping(value="/individual_parts/{id}", method = RequestMethod.PUT)
    public void updateIndividualPart(@RequestBody @Valid IndividualParts individualParts, @PathVariable int id) {
        service.updateIndividualParts(individualParts, id);
    }



    @RequestMapping(value = "/individual_parts", method = RequestMethod.GET)
    public List<IndividualParts> getAllIndividualParts() {
        return service.getAllIndividualParts();
    }

    @RequestMapping(value = "/individual_parts/{id}", method = RequestMethod.GET)
    public IndividualParts getIndividualPartByIndPrtId(@PathVariable int id) {
        return service.getIndividualPartById(id);
    }

    @RequestMapping(value = "/individual_parts_display", method = RequestMethod.GET)
    public List<InventoryDisplay> getInventoryDisplay() {
        return service.getInventoryDisplay();
    }

//    @RequestMapping(value = "/individual_parts/{prtId}", method = RequestMethod.GET)
//    public IndividualParts getIndividualPartByPrtId(@PathVariable int prtId) {
//        return service.getIndividualPartByPrtId(prtId);
//    }

   /* @RequestMapping(value = "/individual_parts/prtId{prtId}", method = RequestMethod.GET)
    public List<IndividualParts> getIndividualPartByPrtId(@PathVariable int prtId) {
        return service.findIndividualPartByPrtId(prtId);
    }

    @RequestMapping(value = "/individual_parts/{serialNo}", method = RequestMethod.GET)
    public IndividualParts getIndividualPartBySerialNo(@PathVariable String serialNo) {
        return service.getIndividualPartBySerialNo(serialNo);
    }

    @RequestMapping(value = "/individual_parts/{prt_status}", method = RequestMethod.GET)
    public List<IndividualParts> getIndividualPartsByPrtStatus(@PathVariable String prtStatus) {
        return service.findIndividualPartsByPrtStatus(prtStatus);
    }

    @RequestMapping(value = "/individual_parts/{prtPrice}", method = RequestMethod.GET)
    public List<IndividualParts> getIndividualPartsByPrtPrice(@PathVariable Double prtPrice) {
        return service.findIndividualPartsByPrtPrice(prtPrice);
    }
*/
    @RequestMapping(value = "/individual_parts/{id}", method = RequestMethod.DELETE)
    public void deleteIndividualPart(@PathVariable int id) {
        service.deleteIndividualPart(id);
    }
}
