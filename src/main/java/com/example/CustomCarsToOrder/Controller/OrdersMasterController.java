//package com.example.CustomCarsToOrder.Controller;
//
//import com.example.CustomCarsToOrder.Dto.Orders;
//import com.example.CustomCarsToOrder.Service.OrdersMasterService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//import java.util.List;
//
//
//@RestController
//public class OrdersMasterController {
//    @Autowired //will link variable to controller
//    private OrdersMasterService service;//service layer will interact with DAO, which will interact with DB
//
//
//    @RequestMapping//creates route
//    (value="/orders", method= RequestMethod.POST) //helps meet requirement to mark individual parts as "used" when a new order is placed
//    public Orders addOrder(@RequestBody @Valid Orders order) {
//        return service.addOrder(order);
//    }
//
//    @RequestMapping(value="/orders/{id}", method=RequestMethod.DELETE) //meets requirement to delete orders
//    public void deleteOrder(@PathVariable int id) {
//        service.deleteOrder(id);
//    }
//
//    @RequestMapping(value="/orders", method= RequestMethod.GET)
//    public List<Orders> getAllOrders() {
//        return service.getAllOrders();
//    }
//
////    @RequestMapping(value="/orders/{id}", method=RequestMethod.GET)
////    public Orders getOrdersById(@PathVariable int id) {
////        return service.getOrdersById(id);
////    }
////
////    @RequestMapping(value="/suppliers/{id}", method=RequestMethod.PUT)
////    public void updateSupplier(@RequestBody @Valid Suppliers supplier, @PathVariable int id) {
////        service.updateSupplier(supplier, id);
////    }
////
////    @RequestMapping(value="/suppliersByName/{name}", method=RequestMethod.GET)
////    public List<Suppliers> findSuppliersByName(@PathVariable String name) {
////        return service.findSuppliersByName(name);
////    }
////
////    @RequestMapping(value="/suppliersByEmail/{email}", method=RequestMethod.GET)
////    public List<Suppliers> findSuppliersByEmail(@PathVariable String email) {
////        return service.findSuppliersByEmail(email);
////    }
////
////    @RequestMapping(value="/suppliersByPhone/{phone}", method=RequestMethod.GET)
////    public List<Suppliers> findSuppliersByPhone(@PathVariable String phone) {
////        return service.findSuppliersByPhone(phone);
//}
