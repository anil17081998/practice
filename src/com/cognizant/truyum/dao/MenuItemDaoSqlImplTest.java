package com.cognizant.truyum.dao;

import java.text.ParseException;
import java.util.List;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

public class MenuItemDaoSqlImplTest {

	public static void main(String[] args) throws ClassNotFoundException, ParseException {
		//testGetCustomerItemId();
		testGetMenuItem();
		testGetCustomerItem() ;
		testModifyMenuItem() ;
		testGetMenuItem();
	}



	public static void testGetMenuItem() throws ClassNotFoundException {

		// TODO Auto-generated method stub

		MenuItemDaoSqlImpl menu=new MenuItemDaoSqlImpl();

		List<MenuItem>L=menu.getMenuItemListAdmin();

	
		for(MenuItem m : L){

			System.out.println(m);

		}

	}
	public static void testGetCustomerItem() throws ClassNotFoundException {


		MenuItemDaoSqlImpl menu=new MenuItemDaoSqlImpl();

		List<MenuItem>L=menu.getMenuItemListCustomer();

		

		

		for(MenuItem m : L){

			System.out.println(m);

		}

	}
	

	public static void testModifyMenuItem() throws ParseException {

		MenuItemDaoSqlImpl menu=new MenuItemDaoSqlImpl();
		MenuItem menuItem = new MenuItem(2, "Cake", 129.00f, true,

				DateUtil.convertToDate("11/12/2019"), "Main Course", false);


		

		menu.modifyMenuItem(menuItem);

	}
}
