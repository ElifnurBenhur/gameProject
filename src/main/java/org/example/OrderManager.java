package org.example;

import java.util.List;

public class OrderManager {
    List<Order> orders;

    public OrderManager(List<Order> orders) {
        this.orders = orders;
    }

    void create(Order order){
        orders.add(order);
    }
    void update(Order order){
        for (Order o:orders
             ) {
            if(o.getId()==order.getId())
            {
                o.setDate(order.getDate());
                o.setBuyables(order.getBuyables());
                o.setGamer(order.getGamer());
                o.setTotalCost(order.getTotalCost());

            }

        }

    }
    void delete(int id){
        for (Order order:orders
             ) {
            if(order.getId()==id)
            {
                order.setDeleted(true);
            }
        }

    }
}
