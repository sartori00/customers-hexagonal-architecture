package br.com.sartori.customers.application.ports.in;

import br.com.sartori.customers.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);
}
