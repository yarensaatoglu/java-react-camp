package yarensaatoglu.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yarensaatoglu.northwind.business.abstracts.ProductService;
import yarensaatoglu.northwind.core.utilities.results.DataResult;
import yarensaatoglu.northwind.core.utilities.results.Result;
import yarensaatoglu.northwind.core.utilities.results.SuccessDataResult;
import yarensaatoglu.northwind.core.utilities.results.SuccessResult;
import yarensaatoglu.northwind.dataAccess.abstracts.ProductDao;
import yarensaatoglu.northwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService {
	private ProductDao productDao;
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<Product>> getAll() {
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(),"Data listelendi");
	}

	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Ürün eklendi");
	}

}
