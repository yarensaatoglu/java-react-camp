package yarensaatoglu.northwind.business.abstracts;

import java.util.List;

import yarensaatoglu.northwind.core.utilities.results.DataResult;
import yarensaatoglu.northwind.core.utilities.results.Result;
import yarensaatoglu.northwind.entities.concretes.Product;

public interface ProductService {
	DataResult<List<Product>> getAll();	
	Result add(Product product);
}
