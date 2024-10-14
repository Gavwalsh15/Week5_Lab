package ie.atu.week5.customerapp;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CustomerRepository extends MongoRepository<Customer, String> {
    public Optional<Customer> findByEmail(String email);
}
