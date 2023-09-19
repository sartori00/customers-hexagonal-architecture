package br.com.sartori.customers.adapters.in.controller.mapper;

import br.com.sartori.customers.adapters.in.controller.dto.CustomerRequest;
import br.com.sartori.customers.adapters.in.controller.dto.CustomerResponse;
import br.com.sartori.customers.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper( CustomerMapper.class );

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

}
