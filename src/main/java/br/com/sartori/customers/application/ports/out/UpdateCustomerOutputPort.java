package br.com.sartori.customers.application.ports.out;

import br.com.sartori.customers.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {

    void update(Customer customer);
}
