package br.com.sartori.customers.application.core.usecase;

import br.com.sartori.customers.application.core.EntityNotFoundException;
import br.com.sartori.customers.application.core.domain.Customer;
import br.com.sartori.customers.application.ports.out.FindCustomerByIdOutputPort;

public class FindCustomerByIdUseCase {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    public Customer find(String id){
        return findCustomerByIdOutputPort.findById(id).orElseThrow(() -> new EntityNotFoundException("Customer Not Found"));
    }
}
