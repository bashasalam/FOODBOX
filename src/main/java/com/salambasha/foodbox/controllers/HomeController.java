package com.salambasha.foodbox.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/FOODBOX")
public class HomeController {
//	
//	@Autowired
//	ProductService productService;
//	
//	@Autowired
//	CategoryRepository cateRepo;

    @GetMapping("/")
	public String showHome(Model model) {
    	long categoryId = 1;
    	int isActive = 1;
   // 	List<Product> products = productService.getProducts(categoryId,isActive);
  //  	List<Category> categories = cateRepo.findAll(); 
		//	model.addAttribute("categoryList", categories);
		//	model.addAttribute("productList", products);
			//System.out.print(products);
		return "pages/home";
	}
    
@RequestMapping("home/showFoodItems")
public String showMadicines(@RequestParam("category_id") long categoryId,Model model) {
	
	//categoryId = (long)categoryId;
	////System.out.println(categoryId);
	
	//long category_id = 2;
	int isActive = 1;
	//List<Product> products = productService.getProducts(categoryId,isActive);
	
	//System.out.print(products);
	
//	model.addAttribute("productList", products);
	
	//return 
	
	//exit(0);
	
	return "pages/selected";
	
	
}




}


