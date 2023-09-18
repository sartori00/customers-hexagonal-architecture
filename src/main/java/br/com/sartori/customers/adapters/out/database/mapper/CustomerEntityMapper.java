package br.com.sartori.customers.adapters.out.database.mapper;

import br.com.sartori.customers.adapters.out.database.CustomerEntity;
import br.com.sartori.customers.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerEntityMapper {

    CustomerEntityMapper INSTANCE = Mappers.getMapper( CustomerEntityMapper.class );

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);
}
