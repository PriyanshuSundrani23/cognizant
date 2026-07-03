package exercise11.DependencyInjectionExample;

public class DependencyInjectionDemo {

    public static void main(String[] args) {

        CustomerRepository repository =
                new CustomerRepositoryImpl();

        CustomerService service =
                new CustomerService(repository);

        service.getCustomer(101);
    }
}