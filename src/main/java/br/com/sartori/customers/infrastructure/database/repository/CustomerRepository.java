package br.com.sartori.customers.infrastructure.database.repository;

import br.com.sartori.customers.infrastructure.database.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
}
