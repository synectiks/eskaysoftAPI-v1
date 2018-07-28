package com.rest.eskaysoftAPI.resource;

import javax.annotation.Resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.rest.eskaysoftAPI.entity.Product;
import com.rest.eskaysoftAPI.service.ProductService;

@Resource(name = "product")
@Path("/product")
public class ProductResource {

	@Autowired
    ProductService productService;

	@GET
	@Produces("application/json")
    public Iterable<Product> findAll(){
        return productService.listAllProduct();
    }
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Product findOne(@PathParam("id") long id){
        return productService.getProductById(id);

    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Product create(@RequestBody Product product){
        return productService.create(product);
    }

    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    public Product update(@RequestBody Product product){
        return productService.saveProduct(product);
    }


    @DELETE
    @Path("/{id}")
    @Produces("application/json")
    public boolean delete(@PathParam("id") long id)
    {
        return productService.deleteProduct(id);
    }


}