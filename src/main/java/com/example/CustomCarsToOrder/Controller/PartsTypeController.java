package com.example.CustomCarsToOrder.Controller;

import com.example.CustomCarsToOrder.Dto.PartsType;
import com.example.CustomCarsToOrder.Service.PartsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
public class PartsTypeController {//this relates to the part type...i.e. tire, brake, etc.
    @Autowired //will link variable to controller
    private PartsTypeService service;//service layer will interact with DAO, which will interact with DB

    @RequestMapping(value="/parts_type", method= RequestMethod.POST)//meets requirement to add new part type
    public PartsType addPartType(@RequestBody @Valid PartsType partType) {
        return service.addPartType(partType);
    }

    @RequestMapping(value="/parts_type/{id}", method= RequestMethod.PUT) //meets requirement to update part name and associated vendor
    public void updatePartsType(@RequestBody @Valid PartsType partType, @PathVariable int id) {
        service.updatePartsType(partType, id);
    }

    @RequestMapping(value="/parts_type", method=RequestMethod.GET)
    public List<PartsType> getAllPartsType() {
        return service.getAllPartsType();
    }

    @RequestMapping(value="/parts_type/{id}", method=RequestMethod.GET)
    public PartsType getPartTypeById(@PathVariable int id) {
        return service.getPartTypeById(id);
    }
}
//
//    @RequestMapping(value="/parts/{id}", method=RequestMethod.DELETE)
//    public void deletePart(@PathVariable int id) {
//        service.deletePart(id);
