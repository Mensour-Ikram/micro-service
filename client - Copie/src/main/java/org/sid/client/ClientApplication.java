package org.sid.client;

import org.sid.client.entities.Customer;
import org.sid.client.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class ClientApplication {

    public static void main(String[] args) {

        SpringApplication.run(
                ClientApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CustomerRepository customerRepository, RepositoryRestConfiguration restConfiguration){
        restConfiguration.exposeIdsFor(Customer.class);
        return args -> {
            customerRepository.save(new Customer(null,"Moha","mo@gmail.com"));
            customerRepository.save(new Customer(null,"Ikram","Ikram@gmail.com"));
            customerRepository.save(new Customer(null,"Salima","Salima@gmail.com"));
            customerRepository.findAll().forEach(c->{
                System.out.println(c.toString());

            });
        };
    }

}
