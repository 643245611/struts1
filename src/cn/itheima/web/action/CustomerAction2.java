package cn.itheima.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.itheima.domain.Customer;
import cn.itheima.service.CustomerService;
import cn.itheima.service.impl.CustomerServiceImpl;

public class CustomerAction2 extends ActionSupport implements ModelDriven<Customer> {
	private CustomerService cs = new CustomerServiceImpl();
	private Customer customer = new Customer();
    
	

	public String add() throws Exception {
		// TODO Auto-generated method stub
		cs.save(customer);
		
		return "toList";
	}


	@Override
	public Customer getModel() {
		// TODO Auto-generated method stub
		return customer;
	}

}
