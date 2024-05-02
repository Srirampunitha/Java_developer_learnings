package com.Sriram.RestApi.WareHouseStore.product;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	private ProductService service;
	
	public ProductController(ProductService service) {
		this.service = service;
	}

	@GetMapping("/products")
	public ResponseEntity<Object> findAll(){
		List<Product> products = service.findAll();
		if(products.isEmpty()) {
			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		}else {
		return new ResponseEntity<Object>(products,HttpStatus.OK);
		}
	}
	
	@GetMapping("/products/{id}")
	public ResponseEntity<Object> findById(@PathVariable Integer id){
		Product product = service.findById(id);
		if(product!=null) {
			return new ResponseEntity<Object>(product,HttpStatus.OK);
		}else {
		return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);	
		}
	}
	
	@GetMapping("/products/name")
	public ResponseEntity<Object> findByName(@RequestParam String name){
		List<Product> products = service.findByName(name);
		if(products!=null) {
			return new ResponseEntity<Object>(products,HttpStatus.OK);
		}else {
		return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);	
		}	
		
	}
	@PostMapping("/products")
	public ResponseEntity<Object> AddProduct(@RequestBody Product product){
		Product savedproduct = service.addProduct(product);
		if(savedproduct!=null) {
			return new ResponseEntity<Object>(HttpStatus.OK);
		}else {
		return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		}
	}
    
	@PutMapping("/products/{id}")
	public ResponseEntity<Object> updateProduct(@PathVariable Integer id , @RequestBody Product product){
		return service.updateproduct(id,product);
	}
	
	@DeleteMapping("/products/{id}")
	public ResponseEntity<Object> deleteByID(@PathVariable Integer id){
		return service.deleteByID(id);	
	}
	
	@PatchMapping("/products/{id}/{Description}")
	public ResponseEntity<Object> updateDescription(@PathVariable int id ,@PathVariable String Description){
		return service.updateDescription(id,Description);
	}
}
