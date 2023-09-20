package br.com.sartori.customers.adapters.out;

import br.com.sartori.customers.adapters.out.database.repository.CustomerRepository;
import br.com.sartori.customers.application.ports.out.DeleteCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdAdapter implements DeleteCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }
}
