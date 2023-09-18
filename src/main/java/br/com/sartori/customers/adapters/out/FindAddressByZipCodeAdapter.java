package br.com.sartori.customers.adapters.out;

import br.com.sartori.customers.adapters.out.client.FindAddressByZipCodeClient;
import br.com.sartori.customers.adapters.out.mapper.AddressResponseMapper;
import br.com.sartori.customers.application.core.domain.Address;
import br.com.sartori.customers.application.ports.out.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return AddressResponseMapper.INSTANCE.toAddress(addressResponse);
    }
}
