package yarensaatoglu.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import yarensaatoglu.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{

}
