package br.com.sartori.customers.adapters.in.consumer;

import br.com.sartori.customers.adapters.in.consumer.mapper.CustomerMessageMapper;
import br.com.sartori.customers.adapters.in.consumer.message.CustomerMessage;
import br.com.sartori.customers.application.ports.in.UpdateCustomerInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;

public class ReceiveValidatedCpfConsumer {

    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "sartori")
    public void receive(CustomerMessage customerMessage){
        var customer = CustomerMessageMapper.INSTANCE.toCustomer(customerMessage);
        updateCustomerInputPort.update(customer, customerMessage.getZipCode());
    }
}
