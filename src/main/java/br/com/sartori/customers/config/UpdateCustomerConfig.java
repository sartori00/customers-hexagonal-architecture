package br.com.sartori.customers.config;

import br.com.sartori.customers.adapters.out.FindAddressByZipCodeAdapter;
import br.com.sartori.customers.adapters.out.UpdateCustomerAdapter;
import br.com.sartori.customers.application.core.usecase.FindCustomerByIdUseCase;
import br.com.sartori.customers.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(FindCustomerByIdUseCase findCustomerByIdUseCase,
                                                       FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
                                                       UpdateCustomerAdapter updateCustomerAdapter) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);
    }
}
