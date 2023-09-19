package br.com.sartori.customers.adapters.out;

import br.com.sartori.customers.adapters.out.database.mapper.CustomerEntityMapper;
import br.com.sartori.customers.adapters.out.database.repository.CustomerRepository;
import br.com.sartori.customers.application.core.domain.Customer;
import br.com.sartori.customers.application.ports.out.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void insert(Customer customer) {
        var customerEntity = CustomerEntityMapper.INSTANCE.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
