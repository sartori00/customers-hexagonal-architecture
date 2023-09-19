package br.com.sartori.customers.adapters.in.controller;

import br.com.sartori.customers.adapters.in.controller.dto.CustomerRequest;
import br.com.sartori.customers.adapters.in.controller.mapper.CustomerMapper;
import br.com.sartori.customers.application.ports.in.InsertCustomerInputPort;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    InsertCustomerInputPort insertCustomerInputPort;

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody @Valid CustomerRequest request){
        insertCustomerInputPort.insert(CustomerMapper.INSTANCE.toCustomer(request), request.zipCode());
        return ResponseEntity.ok().build();
    }
}
