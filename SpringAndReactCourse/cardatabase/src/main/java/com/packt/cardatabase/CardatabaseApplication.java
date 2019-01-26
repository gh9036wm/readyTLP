package com.packt.cardatabase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.packt.cardatabase.domain.CarRepository;
import com.packt.cardatabase.domain.OwnerRepository;
import com.packt.cardatabase.domain.User;
import com.packt.cardatabase.domain.UserRepository;
import com.packt.cardatabase.entity.Car;
import com.packt.cardatabase.entity.Owner;

@SpringBootApplication
public class CardatabaseApplication {
	@Autowired
	private CarRepository repository;
	@Autowired 
    private OwnerRepository orepository;
	@Autowired 
	private UserRepository urepository;
  private static final Logger logger = LoggerFactory.getLogger(CardatabaseApplication.class);
  public static void main(String[] args) {
    SpringApplication.run(CardatabaseApplication.class, args);
   // logger.info("Hello Spring Boot From James Tran");
  }
  
  @Bean
  CommandLineRunner runner(){
      return args -> {
    	// Add owner objects and save these to db
          Owner owner1 = new Owner("John" , "Johnson");
          Owner owner2 = new Owner("Mary" , "Robinson");
          orepository.save(owner1);
          orepository.save(owner2);
        // save demo data into database
    	  Car car1 = new Car("Ford", "Mustang", "Red",
    	             "ADF-1121", 2017, 59000,owner1);
    	  Car car2 = new Car("Nissan", "Leaf", "White",
    	             "SSJ-3002", 2014, 29000,owner2);
    	  Car car3 = new Car ("Toyota", "Prius", "Silver",
    	             "KKO-0212", 2018, 39000,owner2);
    	  repository.save(car1);
    	  repository.save(car2);
    	  repository.save(car3);
    	 logger.info("Find All");
    	 for (Car car: repository.findAll()) {
        	  logger.info(car.toString());
          }
    	 logger.info("--------------------------------");
    	 logger.info("Find car by color");
    	 for(Car car: repository.findByColor("Silver")) {
    		 logger.info(car.toString());
    	 }
    	 
    	// username: user password: user
         urepository.save(new User("user",
         "$2a$10$UuP3wc2/Ixesn0de34ZO0.pB3uDm/.wU3XSvwbbQU.6sDWARizaG6",
         "USER"));
         // username: admin password: admin
         urepository.save(new User("admin",
         "$2a$10$C4LA4S4wntPF/raDH4QLMuhLaX.w9le880NmNmefFbEowUCk056QG", 
         "ADMIN"));
      
      
      };
      
    } 
}