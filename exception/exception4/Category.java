package com.exception4;

//Class Category it has catid, and categoryname. 
public class Category {
	private static String catid;
	private static String categoryname;

	public static String getCatid() {
		return catid;
	}

	public static void setCatid(String catid) {
		Category.catid = catid;
	}

	public static String getCategoryname() {
		return categoryname;
	}

	public static void setCategoryname(String categoryname) {
		Category.categoryname = categoryname;
	}

}
