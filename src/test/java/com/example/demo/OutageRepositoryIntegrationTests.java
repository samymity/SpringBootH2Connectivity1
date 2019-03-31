
  package com.example.demo;
  
  import com.example.demo.entity.FisFuelOutageBO; import
  com.example.demo.repository.OutageRepository;
  
  import org.junit.Test; import org.junit.runner.RunWith; import
  org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.boot.test.context.SpringBootTest; import
  org.springframework.test.context.junit4.SpringRunner;
  
  import java.util.List;
  
  import static org.junit.Assert.*;
  
 /**
	 * SpringBootTest provides test features to load the beans into Application.
	 * This is documented
	 * https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-testing.html
	 * The repository does not wire up because the test class has no way to find the
	 * bean for it. This annotation helps get the bean implementation in the test
	 * class.
	 */
		  @RunWith(SpringRunner.class)
		  
		  @SpringBootTest public class OutageRepositoryIntegrationTests {
		  
		  @Autowired OutageRepository repository;
		  
		  @Test public void testAllBooks() throws Exception { List<FisFuelOutageBO>
		  books = (List<FisFuelOutageBO>) repository.findAll();
		  
		  System.out.println("Books are " + books.get(0));
		  assertFalse(books.isEmpty()); assertEquals(2, books.size()); }
		  
		  @Test public void testFindByName() throws Exception { FisFuelOutageBO b1 =
		  repository.findBysNo(1); assertNotNull(b1); // assertEquals("A1",
		//  b1.getAuthor());
		  } }
		 