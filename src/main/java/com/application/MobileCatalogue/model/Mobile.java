package com.application.MobileCatalogue.model;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

@Document
public class Mobile {
	@Id
	@NotNull
	private String id;
	
	@NotNull
	private String ItemName;
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", ItemName=" + ItemName + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ItemName == null) ? 0 : ItemName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + price;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mobile other = (Mobile) obj;
		if (ItemName == null) {
			if (other.ItemName != null)
				return false;
		} else if (!ItemName.equals(other.ItemName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	public Mobile(@NotNull String id, @NotNull String itemName, @NotNull int price) {
		super();
		this.id = id;
		ItemName = itemName;
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@NotNull
	private int price;
}