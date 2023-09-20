package br.com.sartori.customers.adapters.out;

import br.com.sartori.customers.infrastructure.database.mapper.CustomerEntityMapper;
import br.com.sartori.customers.infrastructure.database.repository.CustomerRepository;
import br.com.sartori.customers.application.core.domain.Customer;
import br.com.sartori.customers.application.ports.out.UpdateCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerAdapter implements UpdateCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void update(Customer customer) {
        var customerEntity = CustomerEntityMapper.INSTANCE.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
