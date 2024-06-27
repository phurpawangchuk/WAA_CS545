package com.example.Assignment2.controller;

import com.example.Assignment2.entity.Category;
import com.example.Assignment2.entity.Product;
import com.example.Assignment2.entity.User;
import com.example.Assignment2.service.ProductService;
import com.example.Assignment2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService prodcuctService;

    @PostMapping
    public String create(@RequestBody Product prodcuct){
        prodcuctService.create(prodcuct);
        return "Prodcuct created.";
    }

    @GetMapping
    public List<Product> getAll(){
        return prodcuctService.getAll();
    }

    @GetMapping("/{prodcuctId}")
    public Product getProduct(@PathVariable Long prodcuctId){

        return prodcuctService.getProduct(prodcuctId);
    }

    @PutMapping("/{prodcuctId}")
    public String update(@PathVariable Long prodcuctId, @RequestBody Product prodcuct){
        prodcuctService.update(prodcuctId, prodcuct);
        return "Product updated.";
    }

    @DeleteMapping("/{prodcuctId}")
    public String delete(@PathVariable Long prodcuctId){
        prodcuctService.delete(prodcuctId);
        return "Prodcuct Deleted.";
    }

    @GetMapping("/minprice/{price}")
    public List<Product> productWithMinPrice(@PathVariable Long price){
        return prodcuctService.findProductByPriceGreaterThan(price);
    }

    @GetMapping("/{category}/maxprice/{price}")
    public List<Product> productWithMinPrice(@PathVariable Category category, @PathVariable Long price){
        return prodcuctService.findProductByCatAndMaxPrice(category, price);
    }

    @GetMapping("/{word}/search")
    public List<Product> searchProduct(@PathVariable String word){
        return prodcuctService.findProductWithKeyword(word);
    }


}