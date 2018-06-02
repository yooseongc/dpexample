package com.yooseongc.dpexample.factorymehtod.idcard;

import java.util.ArrayList;
import java.util.List;

import com.yooseongc.dpexample.factorymethod.framework.Factory;
import com.yooseongc.dpexample.factorymethod.framework.Product;

public class IDCardFactory extends Factory {

	private List<String> owners = new ArrayList<String>();
	
	public List<String> getOwners() {
		return owners;
	}
	
	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product product) {
		owners.add(((IDCard) product).getOwner());
	}

}
