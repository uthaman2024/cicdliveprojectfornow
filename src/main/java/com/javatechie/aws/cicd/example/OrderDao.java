package com.javatechie.aws.cicd.example;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class OrderDao {


    public List<Order> getOrders() {
        return Stream.of(
                new Order(101, "Mobile", 1, 30000),
                new Order(58, "Book", 4, 2000),
                new Order(205, "Laptop", 1, 150000),
                new Order(809, "headset", 1, 1799),
                new Order(829, "USB", 3, 1799),
                new Order(810, "Microphone", 1, 1799),
                new Order(111, "Car", 1, 200000),
                new Order(111, "HDD", 1, 5000),
                new Order(111, "IPAD", 1, 4000))
                .collect(Collectors.toList());
    }
}
