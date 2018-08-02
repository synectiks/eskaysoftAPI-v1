package com.rest.eskaysoftAPI.serviceImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.eskaysoftAPI.dao.ProductDao;
import com.rest.eskaysoftAPI.entity.Product;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.model.ProductDto;
import com.rest.eskaysoftAPI.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductDao productDao;

	@Autowired
	public void setproductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public List<ProductDto> listAllProduct() {
		List<ProductDto> productList = new ArrayList<>();
		productDao.findAll().forEach(product ->{
			ProductDto productModel = new ProductDto();	
			BeanUtils.copyProperties(product, productModel);
			productList.add(productModel);
		});
		Collections.sort(productList);
		return productList;
	}
	

	@Override
	public Product getProductById(Long id) {
		System.out.println("****************" + id);
		return productDao.findById(id)
				.orElseThrow(() -> new NotFoundException(String.format("product %d not found", id)));
	}

	@Override
	public Product saveProduct(Product product) {
		return productDao.save(product);
	}

	@Override
	public boolean deleteProduct(Long id) {
		boolean status = false;
		Product product = getProductById(id);
		if (product != null) {
			productDao.delete(product);
			status = true;
		}
		return status;
	}

	@Override
	public Product create(Product product) {

		return productDao.save(product);
	}



}
