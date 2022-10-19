package com.exception4;

//Class ItemBought it will have itemid, itemqty.
public class ItemBought {
	private static String itemid;
	private static String itemqty;

	public static String getItemid() {
		return itemid;
	}

	public static void setItemid(String itemid) {
		ItemBought.itemid = itemid;
	}

	public static String getItemqty() {
		return itemqty;
	}

	public static void setItemqty(String itemqty) {
		ItemBought.itemqty = itemqty;
	}

}
