package fruit;

public class Fruit implements CountSeeds{
	
	private String hasSkin;
	
	private String hasSeed;
	
	private String hasColor;
	
	
	public Fruit() {
		
	}
	
	public void CountSeeds(){
		
	}
	
	CountSeeds count = new CountSeeds() {
			
	};
	
	
	
	public String getHasSkin() {
		return hasSkin;
	}
	public void setHasSkin(String hasSkin) {
		this.hasSkin = hasSkin;
	}
	public String getHasSeed() {
		return hasSeed;
	}
	public void setHasSeed(String hasSeed) {
		this.hasSeed = hasSeed;
	}
	public String getHasColor() {
		return hasColor;
	}
	public void setHasColor(String hasColor) {
		this.hasColor = hasColor;
	} 
	

}
