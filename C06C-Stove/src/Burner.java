
public class Burner {
	
	public enum Temperature{
		COLD, WARM, HOT, BLAZING;
	}
	
	Temperature myTemperature;
	Setting mySetting;
	
	int settingIndex = 0;
	int tempIndex = 0;
	
	int timer = 0;
	public static final int TIME_DURATION = 2;
	
	public Burner() {
		this.mySetting = Setting.OFF;
		this.myTemperature = Temperature.COLD;
		
	}
	
	public void plusButton() {
		switch(mySetting) {
		case OFF:		mySetting = Setting.LOW;
						settingIndex = 0;
						break;
		case LOW:		mySetting = Setting.MEDIUM;
						settingIndex = 1;
						break;
		case MEDIUM:	mySetting = Setting.HIGH;
						settingIndex = 2;	
						break;
		case HIGH:		settingIndex = 3;
						break;
			
		}
		timer = TIME_DURATION;
	}
	public void minusButton() {
		switch(mySetting) {
		case OFF:		settingIndex = 0;
						break;
		case LOW:		mySetting = Setting.OFF;
						settingIndex = 1;
						break;
		case MEDIUM:	mySetting = Setting.LOW;
						settingIndex = 2;
						break;
		case HIGH:		mySetting = Setting.MEDIUM;
						settingIndex = 3;
						break;
			
		}
		timer = TIME_DURATION;
	}
		
	public void updateTemperature() {
		
		if (tempIndex != settingIndex) {
			
			if (tempIndex < settingIndex) {
				tempIndex++;
				myTemperature = Temperature.values()[tempIndex];
			} 
			else {
				tempIndex--;
				myTemperature = Temperature.values()[tempIndex];
			}
			
			timer = TIME_DURATION;
			
		}
		
	}
	
	
	public Temperature getTemp() {
		return myTemperature;
	}
	
	public void display() {
		switch(myTemperature) {
		case COLD: System.out.println(mySetting.toString() + ".....cooool");
				   break;
		case WARM: System.out.println(mySetting.toString() + ".....warm");
				   break;
		case HOT: System.out.println(mySetting.toString() + ".....CAREFUL");
				   break;
		case BLAZING: System.out.println(mySetting.toString() + ".....VERY HOT! DON'T TOUCH");
					  break;
		}
	}
	
}
