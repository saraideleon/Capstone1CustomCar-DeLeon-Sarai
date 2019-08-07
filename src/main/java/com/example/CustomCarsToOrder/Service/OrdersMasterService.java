//package com.example.CustomCarsToOrder.Service;
//
//import com.example.CustomCarsToOrder.Dao.OrdersMasterRepository;
//import com.example.CustomCarsToOrder.Dto.IndividualParts;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//
//@Component
//public class OrdersMasterService {
//    @Autowired
//    private OrdersMasterRepository ordersMasterRepo;
//
//    public OrdersMaster addNewOrder(OrdersMaster ordersMaster) {//meets requirement to add new order w/start & completion dates
//        ordersMasterRepo.save(ordersMaster);
//        return ordersMaster;
//    }
//
//    public void deleteOrder(Integer id) { //meets requirement to delete order
//        if (OrdersMaster.getOrdersMasterId() != id) {
//            throw new IllegalArgumentException("Order Id must match an existing order to delete.");
//        }
//        ordersMasterRepo.deleteOrder(id);
//    }
//
//    public void updateIndividualParts(IndividualParts individualPart, Integer id) { //meets requirement to update part price and quantity in stock
//        if (individualPart.getIndividualPartId() != id) {
//            throw new IllegalArgumentException("Individual Part Id must match an existing Id in the inventory.");
//        }
//        individualPartsRepo.save(individualPart);
//    }
//
//    public void deleteIndividualPart(Integer id) {
//        individualPartsRepo.deleteIndividualPart(id);
//    }
//
////HELP!!
////    public IndividualParts getIndividualPartsBelow50(IndividualParts individualPart, String prt_status) {
////        if (individualPart.getIndividualPartStatus() != "available")
////    }
//}
//
