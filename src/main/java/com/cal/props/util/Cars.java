package com.cal.props.util;

/**
 * @author Murat Çelik 16:06:35 22 Nis 2021
 *
 */
public class Cars {

	public Cars() {
		System.out.println("CALL");
	}

	public int id;
	public String title;
	public int price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
