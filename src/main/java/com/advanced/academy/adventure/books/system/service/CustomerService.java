package com.advanced.academy.adventure.books.system.service;

import com.advanced.academy.adventure.books.system.model.Customer;
import com.advanced.academy.adventure.books.system.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }




    public String addCustomer(Customer customer){
        return customer.getUsername();
    }

    public Customer getCustomer(Integer customerId) {

        Optional<Customer> customer = customerRepository.findById(customerId);
        if(!customer.isPresent()){
            throw new RuntimeException("Customer not found!");
        }
        return customer.get();
    }

    public void createOrUpdateCustomer(Customer customer) {
        if (null == customer.getId()) {
            createCustomer(customer);
            return;
        }
        updateCustomer(customer);
    }

    private void createCustomer(Customer customer){
        customerRepository.save(customer);
    }

    private void updateCustomer(Customer customer){
        customerRepository.save(customer);
    }

    private void deleteCustomer(Integer customerId){
        customerRepository.deactivateCustomer(customerId);
    }
}
