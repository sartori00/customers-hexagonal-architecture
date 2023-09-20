package br.com.sartori.customers.adapters.in.consumer.mapper;

import br.com.sartori.customers.adapters.in.consumer.message.CustomerMessage;
import br.com.sartori.customers.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMessageMapper {

    CustomerMessageMapper INSTANCE = Mappers.getMapper( CustomerMessageMapper.class );

    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);


}
