package com.example.demo.repository;


        import com.example.demo.entity.Book;
        import com.example.demo.entity.Inventory;
        import org.springframework.data.repository.CrudRepository;
        import org.springframework.stereotype.Repository;

/**
 * But that’s what makes Spring Data JPA so powerful: You don’t have to write an implementation of the repository interface.
 * Spring Data JPA creates an implementation on the fly when you run the application
 * Ref: https://spring.io/guides/gs/accessing-data-jpa/
 */

@Repository
public interface InventoryRepository extends CrudRepository<Inventory, Integer> {

    // you may or may not want to have specialized methods
    Inventory findBySiteId( Integer SiteId);


}
