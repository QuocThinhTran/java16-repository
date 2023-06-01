package com.springmvc.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static com.springmvc.common.Application.*;
import com.springmvc.entity.Customer;
import com.springmvc.service.CustomerService;

@Controller
@RequestMapping("customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	// Hiển thị toàn bộ danh sách
	@GetMapping()
	public String listCustomers(ModelMap modelMap) {
		modelMap.addAttribute("customers", customerService.getAllCustomers());
		return LIST_CUSTOMER;
	}

	// Tìm kiếm theo tên và địa chỉ
	@GetMapping("/search")
	public String searchCustomers(@RequestParam("keyword") String keyword, Model model) {
	    List<Customer> customers = customerService.searchCustomersByName(keyword);
	    model.addAttribute("customers", customers);
	    return SEARCH_CUSTOMER;
	}
	
	@GetMapping("/add")
	public String add(ModelMap modelMap) {
		modelMap.addAttribute("customer", new Customer());
		return ADD_CUSTOMER;
	}
	
	@PostMapping("/save")
	public String saveCustomers(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult, ModelMap modelMap) {
		if (bindingResult.hasErrors()) {
	        return ADD_CUSTOMER;
	    }
		customerService.addCustomer(customer);
		return REDIRECT_CUSTOMER;
	}
	
	@GetMapping("/edit")
	public String editCustomerForm(@RequestParam int id, ModelMap modelMap)  {
		Customer customer = customerService.getCustomerById(id);
		modelMap.addAttribute("customer", customer);
		return EDIT_CUSTOMER;
		
	}
	
	@PostMapping("/edit")
	public String editCustomer(@ModelAttribute("customer") Customer customer) {
	    customerService.updateCustomer(customer);

	    return REDIRECT_CUSTOMER;
	}

	@GetMapping("/delete")
	public String delete(ModelMap modelMap, @RequestParam("id") int id) {
		customerService.deleteCustomer(id);
		return REDIRECT_CUSTOMER;
	}
}
