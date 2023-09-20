package br.com.sartori.customers.adapters.out;

import br.com.sartori.customers.infrastructure.database.mapper.CustomerEntityMapper;
import br.com.sartori.customers.infrastructure.database.repository.CustomerRepository;
import br.com.sartori.customers.application.core.domain.Customer;
import br.com.sartori.customers.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Optional<Customer> findById(String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(CustomerEntityMapper.INSTANCE::toCustomer);
    }
}
