package com.cg.lab2.exc1;


public abstract  class Items {
	
	
	private String itemName;
	private int itemNo,noOfCopies;
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemNo() {
		return itemNo;
	}
	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}
	public int getNoOfCopies() {
		return noOfCopies;
	}
	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	public Items() {
		super();
	
	}
	public Items(String itemName, int itemNo, int noOfCopies) {
		super();
		this.itemName = itemName;
		this.itemNo = itemNo;
		this.noOfCopies = noOfCopies;
	}
	
	public String toString()
	{
		
		return "Idenfication num"+itemNo+" name of book is"+itemName+" no of copies are"+noOfCopies;
		
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Items other = (Items) obj;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		if (itemNo != other.itemNo)
			return false;
		if (noOfCopies != other.noOfCopies)
			return false;
		return true;
	}
     public void print()
     {
    	 
    	 System.out.println("id is"+"   "+itemNo+"\n"+"itemName is "+"   "+itemName+"\n"+"no of copies"+"  "+noOfCopies+"\n");
    	 
     }
	abstract public void checkIn();
	abstract public void checkOut();
	
	
	
	
}