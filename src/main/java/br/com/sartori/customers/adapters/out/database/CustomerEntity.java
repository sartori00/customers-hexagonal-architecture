package br.com.sartori.customers.adapters.out.database;

import br.com.sartori.customers.adapters.out.database.entity.AddressEntity;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "customers")
public class CustomerEntity {

    @Id
    private String id;

    private String name;

    private String cpf;

    private AddressEntity address;

    private Boolean isValidCpf;
}
