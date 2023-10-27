package com.onlineshopping;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OnlineShoppingApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private ProductRepository productRepository;
	
	@Test
	void isProductExistsById(){
	Product product=new Product(1,"paneer","veg",200);
	productRepository.save(product);

	Boolean actualResult=productRepository.isProductExistsById(1);

	assertThat(actualResult).isTrue();
	}

	@AfterEach
	void tearDown(){
	prodcutRepository.deleteAll();
	System.out.println("Tearing down");
	}

	
	@BeforeEach
	void setUp(){
	System.out.println("Setting up");
	}
	
	
}
