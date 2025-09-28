package java.com.bartoszkorec.microservices.inventory;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Import;
import org.testcontainers.utility.TestcontainersConfiguration;

@Import(TestcontainersConfiguration.class)
@TestConfiguration(proxyBeanMethods = false)
public class TestInventoryServiceApplication {

    @Test
    void contextLoads() {
    }
}
