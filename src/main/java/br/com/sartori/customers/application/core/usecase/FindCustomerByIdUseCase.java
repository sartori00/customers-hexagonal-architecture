package br.com.sartori.customers.application.core.usecase;

import br.com.sartori.customers.application.core.exceptions.EntityNotFoundException;
import br.com.sartori.customers.application.core.domain.Customer;
import br.com.sartori.customers.application.ports.in.FindCustomerByIdInputPort;
import br.com.sartori.customers.application.ports.out.FindCustomerByIdOutputPort;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    @Override
    public Customer findById(String id){
        return findCustomerByIdOutputPort.findById(id).orElseThrow(() -> new EntityNotFoundException("Customer Not Found"));
    }
}
