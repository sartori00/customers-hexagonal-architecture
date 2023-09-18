package br.com.sartori.customers.adapters.out.mapper;

import br.com.sartori.customers.adapters.out.client.dto.AddressResponse;
import br.com.sartori.customers.application.core.domain.Address;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AddressResponseMapper {

    AddressResponseMapper INSTANCE = Mappers.getMapper( AddressResponseMapper.class );

    Address toAddress(AddressResponse addressResponse);

}