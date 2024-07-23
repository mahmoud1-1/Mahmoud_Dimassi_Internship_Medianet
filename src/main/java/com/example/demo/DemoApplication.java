package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@GetMapping("/")
	public String greet(){
		return "Hello ";
	}

	/*@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.example.demo.config"))
				.paths(PathSelectors.any())
				.build();
	}*/


	/*private final CustomerRepository customerRepository;

    public DemoApplication(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


	public List<Customer> getCustomers() {
		return 	customerRepository.findAll();
	}*/

/*	record NewCustomerRequest() {
		  String name;
		  String email;
		  Integer age;
	}
	@PostMapping
	public void addCustomer(@RequestBody NewCustomerRequest request) {
		Customer customer = new Customer();
		Customer.setName(request.name);
		Customer.setEmail(request.email);
		Customer.setAge(request.age);
		customerRepository.saveAll(customer);
	}*/

	// Update an existing customer
	/*@PutMapping("/customers/{customerId}")
	public void updateCustomer(@PathVariable("customerId") Integer id, @RequestBody NewCustomerRequest request) {
		Optional<Customer> optionalCustomer = customerRepository.findById(id);
		if (optionalCustomer.isPresent()) {
			Customer customer = optionalCustomer.get();
			customer.setName(request.name());
			customer.setEmail(request.email());
			customer.setAge(request.age());
			customerRepository.save(customer);
		}
	}*/


	/* @DeleteMapping("customerId")
	public void deleteCustomeer(@PathVariable("customerId") Integer id) {
		customerRepository.deleteById(id);
	}*/


}



