package br.com.sartori.customers.application.ports.in;

import br.com.sartori.customers.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer findById(String id);
}
