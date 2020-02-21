package com.bhole.talash;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductDao {

	



	public Product getBrand(String brandName) {
		Scanner sc = new Scanner(new FileConnection().getConnection());
		while (sc.hasNext()) {
			String data = sc.nextLine();
			String[] details = data.split(",");
			if (details[0].contains(brandName)) {

				return prepareResponse(details);
			}
		}
		return null;
	}

	public Products getBrands(String brandName) {
		Scanner sc = new Scanner(new FileConnection().getConnection());
		ArrayList<Product> productList = new ArrayList<>();
		while (sc.hasNext()) {
			String data = sc.nextLine();
			String[] details = data.split(",");
			System.out.println(details.length);
			if (details[0].contains(brandName)) {
				productList.add(prepareResponse(details));
			}
		}
		return prepareResponses(productList);
	}

	public Products getPrice(String price) {
		Scanner sc = new Scanner(new FileConnection().getConnection());
		ArrayList<Product> productList = new ArrayList<>();
		while (sc.hasNext()) {
			String data = sc.nextLine();
			String[] details = data.split(",");
			if (details[1].contains(price)) {
				productList.add(prepareResponse(details));
			}
		}
		return prepareResponses(productList);
	}

	public Products getColor(String color) {
		Scanner sc = new Scanner(new FileConnection().getConnection());
		ArrayList<Product> productList = new ArrayList<>();
		while (sc.hasNext()) {
			String data = sc.nextLine();
			String[] details = data.split(",");
			if (details[2].contains(color)) {
				productList.add(prepareResponse(details));
			}
		}
		return prepareResponses(productList);
	}

	public Products getSize(String size) {
		Scanner sc = new Scanner(new FileConnection().getConnection());
		ArrayList<Product> productList = new ArrayList<>();
		while (sc.hasNext()) {
			String data = sc.nextLine();
			String[] details = data.split(",");
			if (details[3].contains(size)) {
				productList.add(prepareResponse(details));
			}
		}
		return prepareResponses(productList);
	}
	
	private Product prepareResponse(String[] details) {

		Product product = new Product();
		product.setBrand(details[0]);
		product.setPrice(Double.parseDouble(details[1]));
		product.setColor(details[2]);
		product.setSize(details[3]);
		return product;
	}

	private Products prepareResponses(ArrayList<Product> productList) {

		Products products = new Products();
		products.setProductList(productList);
		return products;
	}

}
