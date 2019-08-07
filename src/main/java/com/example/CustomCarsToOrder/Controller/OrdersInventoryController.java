//package com.example.CustomCarsToOrder.Controller;
//
//import com.example.CustomCarsToOrder.Dto.OrdersInventory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//import java.util.List;
//
//
//@RestController
//public class OrdersInventoryController {
//    @Autowired //will link variable to controller
//    private OrdersInventoryService service;//service layer will interact with DAO, which will interact with DB
//
//
////    @RequestMapping(value="/orders_inventory/{id}", method=RequestMethod.PUT)
////    public void updateOrdersInventory(@RequestBody @Valid OrdersInventory orderInvt, @PathVariable int id) {
////        service.updateOrdersInventory(OrdersInventory, id);
////    }
////
////    @RequestMapping(value="/orders_inventory", method= RequestMethod.GET)
////    public List<OrdersInventory> getAllOrdersInventory() {
////        return service.getAllOrdersInventory();
////    }
////
////    @RequestMapping(value="/orders_inventory/{id}", method=RequestMethod.GET)
////    public OrdersInventory getOrdersInventoryById(@PathVariable int id) {
////        return service.getOrdersInventoryById(id);
////    }
//}
