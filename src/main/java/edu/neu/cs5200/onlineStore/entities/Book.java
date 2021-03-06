package edu.neu.cs5200.onlineStore.entities;



import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String title;
	private double price;
	private String category;
	private String image;
	
	@Column(columnDefinition="text")
	private String description;
	
	@OneToMany(mappedBy="book")
	@JsonIgnore
	private List<BookToCartItem> bookToCartItems; 

	
	
	
	
	public List<BookToCartItem> getBookToCartItems() {
		return bookToCartItems;
	}

	public void setBookToCartItems(List<BookToCartItem> bookToCartItems) {
		this.bookToCartItems = bookToCartItems;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
