package br.com.sartori.customers.config;

import br.com.sartori.customers.adapters.out.FindAddressByZipCodeAdapter;
import br.com.sartori.customers.adapters.out.InsertCustomerAdapter;
import br.com.sartori.customers.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
                                                       InsertCustomerAdapter insertCustomerAdapter){
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter);
    }
}
