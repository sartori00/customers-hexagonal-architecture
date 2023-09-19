package br.com.sartori.customers.application.core.usecase;

import br.com.sartori.customers.application.core.domain.Customer;
import br.com.sartori.customers.application.ports.in.FindCustomerByIdInputPort;
import br.com.sartori.customers.application.ports.in.UpdateCustomerInputPort;
import br.com.sartori.customers.application.ports.out.FindAddressByZipCodeOutputPort;
import br.com.sartori.customers.application.ports.out.UpdateCustomerOutputPort;

public class UpdateCustomerUseCase implements UpdateCustomerInputPort {

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final UpdateCustomerOutputPort updateCustomerOutputPort;

    public UpdateCustomerUseCase(FindCustomerByIdInputPort findCustomerByIdInputPort,
                                 FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
                                 UpdateCustomerOutputPort updateCustomerOutputPort) {

        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.updateCustomerOutputPort = updateCustomerOutputPort;
    }

    @Override
    public void update(Customer customer, String zipCode){
        findCustomerByIdInputPort.findById(customer.getId());
        var address = findAddressByZipCodeOutputPort.find(zipCode);

        customer.setAddress(address);
        updateCustomerOutputPort.update(customer);
    }
}
