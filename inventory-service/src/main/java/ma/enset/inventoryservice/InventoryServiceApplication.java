package ma.enset.inventoryservice;

import ma.enset.inventoryservice.entities.Product;
import ma.enset.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository){
        return args -> {
            productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("Computer").price(12240).quantity(11).build());
            productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("SmartPhone").price(6000).quantity(18).build());
            productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("SmartWatch").price(5000).quantity(12).build());
        };
    }
}
