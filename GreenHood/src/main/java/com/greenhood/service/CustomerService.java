package com.greenhood.service;


import com.greenhood.exception.AuthorizationException;
import com.greenhood.exception.CustomerException;
import com.greenhood.exception.PlantException;
import com.greenhood.exception.PlanterException;
import com.greenhood.exception.SeedException;
import com.greenhood.model.Cart;
import com.greenhood.model.Customer;

	public interface CustomerService {
  
	    public Customer registerCustomer(Customer customer) throws CustomerException;
	    public Customer updateCustomer(Customer customer,String key) throws CustomerException, AuthorizationException;
	    public Customer deleteCustomer(Integer customerId,String key) throws CustomerException, AuthorizationException;
	    public Customer getCustomerById(Integer customerId,String key) throws CustomerException, AuthorizationException;
	    
	    public Cart addPlantToCart(Integer cartId,Integer plantId,String key) throws CustomerException, AuthorizationException,PlantException;
	    public Cart addPlanterToCart(Integer cartId, Integer planterId, String key) throws CustomerException, AuthorizationException,PlanterException;
	    public Cart addSeedsToCart(Integer cartId, Integer seedsId,String key) throws CustomerException, AuthorizationException,SeedException;
	    
	    public Cart removeSeedsFromCart(Integer cartId, Integer seedsId,String key) throws CustomerException, AuthorizationException,SeedException;
	    public Cart removePlantFromCart(Integer cartId, Integer plantId,String key) throws CustomerException, AuthorizationException,PlantException;
	    public Cart removePlanterFromCart(Integer cartId, Integer planterId,String key) throws CustomerException, AuthorizationException,PlanterException;

	}


