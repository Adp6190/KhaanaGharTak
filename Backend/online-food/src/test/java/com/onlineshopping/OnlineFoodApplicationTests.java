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
	void findProductById(int id);
	Product product=new Product(1,"paneer","veg","200");
	productRepository.save(product);

	Boolean actualResult=productRepository.findProductById(1);

	assertThat(actualResult).isTrue();
	
	
}
