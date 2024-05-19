package streamapi;

public class Mobile implements Comparable<Mobile>{
	public Brand  Brand;
	public String model;
	public int memory;
	public int price;
	public int megapixel;
	public double displaysize;
	public String cololr;
	
  
	public Brand getBrand() {
		return Brand;
	}


	public String getModel() {
		return model;
	}


	public int getMemory() {
		return memory;
	}


	public int getPrice() {
		return price;
	}


	public int getMegapixel() {
		return megapixel;
	}


	public double getDisplaysize() {
		return displaysize;
	}


	public String getCololr() {
		return cololr;
	}


	public Mobile(streamapi.Mobile.Brand brand, String model, int memory, int price, int megapixel, double displaysize,
			String cololr) {
		super();
		Brand = brand;
		this.model = model;
		this.memory = memory;
		this.price = price;
		this.megapixel = megapixel;
		this.displaysize = displaysize;
		this.cololr = cololr;
	}


	public enum Brand{
		apple,samsung,vivo,redmi,moto,nokia;
	}


	@Override
	public int compareTo(Mobile mobile2) {
		if(this.getPrice() >  mobile2.getPrice()) {
			return  1;
		}else if(this.getPrice()<mobile2.getPrice()){
			return -1;
		}else
		return 0;
	}
	

}
