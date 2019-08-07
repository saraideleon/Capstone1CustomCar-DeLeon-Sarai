package com.example.CustomCarsToOrder.Service;

import com.example.CustomCarsToOrder.Dao.PartsTypeRepository;
import com.example.CustomCarsToOrder.Dto.PartsType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class PartsTypeService {
    @Autowired
    private PartsTypeRepository partsTypeRepo;

    public PartsType addPartType(PartsType partType) {//meets requirement to add new part type
        partsTypeRepo.save(partType);
        return partType;
    }
    public void updatePartsType(PartsType partType, int id) { //meets requirement to update part name and associated vendor
        PartsType pt = partsTypeRepo.findById(id).get();
        if (pt.getPrtId() != id) {
            throw new IllegalArgumentException("Part Id must match an Id in your inventory.");
        }
        pt.setPrtName(partType.getPrtName());
        pt.setSupplierId(partType.getSupplierId());
        partsTypeRepo.save(partType);
    }
    public List<PartsType> getAllPartsType() {
        return partsTypeRepo.findAll();
    }
    public PartsType getPartTypeById(int id) {
        return partsTypeRepo.getOne(id);
    }
}
