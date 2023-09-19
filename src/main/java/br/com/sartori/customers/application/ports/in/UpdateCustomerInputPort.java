package br.com.sartori.customers.application.ports.in;

import br.com.sartori.customers.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);
}
