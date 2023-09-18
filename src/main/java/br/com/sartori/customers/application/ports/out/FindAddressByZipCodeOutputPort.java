package br.com.sartori.customers.application.ports.out;

import br.com.sartori.customers.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(final String zipCode);

}
