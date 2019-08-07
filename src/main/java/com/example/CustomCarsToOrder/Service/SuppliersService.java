package com.example.CustomCarsToOrder.Service;

import com.example.CustomCarsToOrder.Dao.SupplierRepository;
import com.example.CustomCarsToOrder.Dto.Suppliers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Supplier;


@Component
public class SuppliersService {
    @Autowired
    private SupplierRepository supplierRepo;

    public Suppliers addSupplier(Suppliers supplier) {
        supplierRepo.save(supplier);
       return supplier;
    }

    public List<Suppliers> getAllSuppliers() {
        return supplierRepo.findAll();
    }

    public Suppliers getSupplierById(int id) {
        return supplierRepo.getOne(id);
    }

    public void updateSupplier(Suppliers supplier, int id) {

        Suppliers supplier1 = supplierRepo.findById(id).get();
        supplier1.setSuppEmail(supplier.getSuppEmail());
        supplier1.setSuppName(supplier.getSuppName());
        supplier1.setSuppPhone(supplier.getSuppPhone());

        supplierRepo.save(supplier1);
    }
}
//    public void deleteSupplier(int id) {
//        supplierRepo.deleteById(id);
//    }
//
//    public List<Suppliers> findSuppliersByName(String name) {
//        return supplierRepo.findByName(name);
//    }
