package com.packt.cardatabase;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
// org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.packt.cardatabase.domain.CarRepository;
import com.packt.cardatabase.entity.Car;
import com.packt.cardatabase.entity.Owner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CarRepositoryTest {
	//@Autowired
	// private TestEntityManager entityManager;
	  
	  @Autowired
	  private CarRepository repository;
	  @Test
	  public void saveCar() {
		  Owner own1 = new Owner("James", "Tran");
		  Owner own2 = new Owner("Thao", "Tran");
		  Car car1 = new Car("Tesla", "Model X", "White",
			        "ABC-1234", 2017, 86000,own1);
		  Car car2 = new Car("Mini", "Cooper", "Yellow",
			        "BWS-3007", 2015, 24500,own2);
		  repository.save(car1);
		   repository.save(car2);
	    
	  
	    repository.deleteAll();
	    assertThat(repository.findAll()).isEmpty();
	  }

}
