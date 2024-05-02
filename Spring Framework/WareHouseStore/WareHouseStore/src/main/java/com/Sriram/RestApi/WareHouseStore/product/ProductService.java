package com.Sriram.RestApi.WareHouseStore.product;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
        
	private ProductRepo repo ;
	
	 public ProductService(ProductRepo repo) {
		super();
		this.repo = repo;
	}

	public List<Product> findAll() {
		return repo.findAll();
	}

	public Product findById(int id) {
	    Optional<Product> optionalproduct = repo.findById(id);	
	    if(optionalproduct.isEmpty()) {
	    	return null;
	    }else {
	    Product product =optionalproduct.get();
	    	return product ;
	    }
	    
	}

	public List<Product> findByName(String name) {
		List<Product> products = repo.findAll();
		Predicate<Product> predicate = product -> product.getName().equalsIgnoreCase(name);
		List<Product> prod = products.stream().filter(predicate).toList();
		if(prod.isEmpty()) {
			return null;
		}else {
			return prod;
		}
	}

	public Product addProduct(Product product) {
		return repo.save(product);
	}

	public ResponseEntity<Object> updateproduct(int id, Product product) {
		Optional<Product> Optionalprod = repo.findById(id);
		if(Optionalprod.isEmpty()) {
			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		}else {
			Product savedProduct  = Optionalprod.get();
			savedProduct.setDescription(product.getDescription());
			savedProduct.setName(product.getName());
			savedProduct.setId(id);
			repo.save(savedProduct);
			return new ResponseEntity<Object>(HttpStatus.OK);
		}
	}

	public ResponseEntity<Object> deleteByID(int id) {
		Optional<Product> opProduct = repo.findById(id);
		if(opProduct.isEmpty()) {
			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		}else {
			repo.deleteById(id);
			return new ResponseEntity<Object>(HttpStatus.OK);
		}
	}

	public ResponseEntity<Object> updateDescription(int id, String description) {
		Optional<Product> opProduct = repo.findById(id);
		if(opProduct.isEmpty()) {
			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		}else {
			Product prod = opProduct.get();
			prod.setId(id);
			prod.setDescription(description);
			repo.save(prod);
			return new ResponseEntity<Object>(HttpStatus.OK);
		}
	}

}
