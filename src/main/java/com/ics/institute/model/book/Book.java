package com.ics.institute.model.book;

import lombok.Data;

@Data
public class Book {
	private String IBN;
	private String title;
	private String description;
	private int bookAvl;
	private int bookIssued;
	private int bookLost;
}
