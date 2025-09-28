package java.com.bartoszkorec.microservices.inventory;

import com.bartoszkorec.microservices.inventory.InventoryServiceApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.utility.TestcontainersConfiguration;

@SpringBootTest
class InventoryServiceApplicationTests {

    public static void main(String[] args) {
        SpringApplication.from(InventoryServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
    }
}
