package br.com.sartori.customers.adapters.out.database.repository;

import br.com.sartori.customers.adapters.out.database.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
}
