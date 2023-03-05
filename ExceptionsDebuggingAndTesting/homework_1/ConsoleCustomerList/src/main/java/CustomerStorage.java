import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class CustomerStorage {
    private final Map<String, Customer> storage;

    public CustomerStorage() {
        storage = new HashMap<>();
    }

    private static final Logger logger = LogManager.getLogger(CustomerStorage.class);
    private static final Logger queriesLogger = LogManager.getLogger("QueriesLogger"); // Логгер для запросов
    private static final Logger errorsLogger = LogManager.getLogger("ErrorsLogger"); // Логгер для ошибок


    public void addCustomer(String data) {
        final int INDEX_NAME = 0;
        final int INDEX_SURNAME = 1;
        final int INDEX_EMAIL = 2;
        final int INDEX_PHONE = 3;

        String[] components = data.split("\\s+");
        if (components.length < 4  || components.length > 4) {
            throw new IllegalArgumentException("Incorrect number of components");
        }
        String name = components[INDEX_NAME] + " " + components[INDEX_SURNAME];
        String phonePattern = "^\\+\\d{11}$"; // паттерн для номера телефона
        if (!components[INDEX_PHONE].matches(phonePattern)) {
            throw new IllegalArgumentException("Incorrect phone format");
        }
        storage.put(name, new Customer(name, components[INDEX_PHONE], components[INDEX_EMAIL]));
        String emailPattern = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$"; // паттерн для e-mail
        if (!components[INDEX_EMAIL].matches(emailPattern)) {
            throw new IllegalArgumentException("Incorrect email format");
        }

        try {
            storage.put(name, new Customer(name, components[INDEX_PHONE], components[INDEX_EMAIL]));
        } catch (Exception e) {
            logger.error("Failed to add customer: " + e.getMessage());
            System.out.println("Failed to add customer: " + e.getMessage());
        }
    }

    public void listCustomers() {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) {
        storage.remove(name);
    }

    public Customer getCustomer(String name) {
        return storage.get(name);
    }

    public int getCount() {
        return storage.size();
    }
}