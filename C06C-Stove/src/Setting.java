
public enum Setting {
	OFF ("---"), LOW ("--+"), MEDIUM ("-++"), HIGH ("+++");
	
	String setting = "";
	
	private Setting(String s) {
		this.setting = s;
		
	}
	
	public String toString() {
		return "[" + this.setting + "]";
	}
}
