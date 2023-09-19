package br.com.sartori.customers.application.ports.out;

import br.com.sartori.customers.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> findById(String id);
}
