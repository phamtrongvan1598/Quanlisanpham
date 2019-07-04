package com.codegym.service;

import com.codegym.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private static Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "IphoneX", 12000000,2,"Iphone",1));
        customers.put(2, new Customer(2, "IphoneXSmax", 32000000,6,"Iphone",1));
        customers.put(3, new Customer(3,"IphoneXR",22000000,7,"Iphone",1));
        customers.put(4,new Customer(4,"SamSung note8",18000000,3,"SamSung",2));
        customers.put(5,new Customer(5,"SamSung Galaxy note9",22000000,7,"SamSung",2));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }
    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }
    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }
    @Override
    public void update(int id,Customer customer){
        customers.put(id,customer);
    }
    @Override
    public void remove(int id){
        customers.remove(id);
    }
    @Override
    public void updateCategory(int idCategory,Customer customer){
        customers.put(idCategory,customer);
    }
    @Override
    public void removeCategory(int idCategory){
    customers.remove(idCategory);
    }
}