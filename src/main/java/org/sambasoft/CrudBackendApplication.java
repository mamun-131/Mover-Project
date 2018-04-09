package org.sambasoft;

import org.sambasoft.entities.Bills;
import org.sambasoft.entities.Customer;
import org.sambasoft.entities.Orders;
import org.sambasoft.entities.User;
import org.sambasoft.repositories.BillsRepository;
import org.sambasoft.repositories.CustomerRepository;
import org.sambasoft.repositories.OrderRepository;
import org.sambasoft.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudBackendApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private BillsRepository billsRepository;

	public static void main(String[] args) {
		SpringApplication.run(CrudBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("one", "one"));
		userRepository.save(new User("two", "one"));
		userRepository.save(new User("three", "one"));

		customerRepository.save(new Customer("Mamun","Rahman","232323","mamun@h.com","Toronto","Toronto"));
		customerRepository.save(new Customer("Ollekssi","Ollekssi","232323","olekssi@h.com","Toronto","Toronto"));
		customerRepository.save(new Customer("Chandan","Chandan","232323","mamun@h.com","Toronto","Toronto"));
		customerRepository.save(new Customer("Artem","Artem","232323","mamun@h.com","Toronto","Toronto"));

		orderRepository.save(new Orders("mmm","ddd","ddd","dd", (long) 1,"sss","ddd","ddd"));
		billsRepository.save(new Bills((long)1,(long) 1,"erer","wrwr",(double) 11,(double)11,(double)11,(double)11));

	}
}
