package com.example.CustomCarsToOrder.Controller;

import com.example.CustomCarsToOrder.Dto.Suppliers;
import com.example.CustomCarsToOrder.Service.SuppliersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.function.Supplier;

@RestController
public class SuppliersController {
    @Autowired //will link variable to controller
    private SuppliersService service;//service layer will interact with DAO, which will interact with DB



    @RequestMapping(value="/suppliers", method=RequestMethod.GET)
    public List<Suppliers> getAllSuppliers() {
        return service.getAllSuppliers();
    }

    @RequestMapping(value="/suppliers", method= RequestMethod.POST)
    public Suppliers addSupplier(@RequestBody @Valid Suppliers supplier) {
        return service.addSupplier(supplier);
    }

    @RequestMapping(value="/suppliers/{id}", method=RequestMethod.GET)
    public Suppliers getSupplierById(@PathVariable int id) {
        return (Suppliers) service.getSupplierById(id);
    }

    //meets requirement of updating supplier
    @RequestMapping(value="/suppliers/{id}", method=RequestMethod.PUT)
    public void updateSupplier(@RequestBody @Valid Suppliers supplier, @PathVariable int id) {
        service.updateSupplier(supplier, id);
    }
}
//
//    @RequestMapping(value="/suppliers/{id}", method=RequestMethod.DELETE)
//    public void deleteSupplier(@PathVariable int id) {
//        service.deleteSupplier(id);
//    }
//
//    @RequestMapping(value="/suppliersByName/{name}", method=RequestMethod.GET)
//    public List<Suppliers> findSuppliersByName(@PathVariable String name) {
//        return service.findSuppliersByName(name);
//    }
//
//    @RequestMapping(value="/suppliersByEmail/{email}", method=RequestMethod.GET)
//    public List<Suppliers> findSuppliersByEmail(@PathVariable String email) {
//        return service.findSuppliersByEmail(email);
//    }
//
//    @RequestMapping(value="/suppliersByPhone/{phone}", method=RequestMethod.GET)
//    public List<Suppliers> findSuppliersByPhone(@PathVariable String phone) {
//        return service.findSuppliersByPhone(phone);


