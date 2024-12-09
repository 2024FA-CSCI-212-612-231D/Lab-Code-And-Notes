package labsolutions.lab21;

import java.security.KeyStore.Builder;

public class Computer {
	private final String processor; 
	private final int ram; 
	private final int storage; 
	private final boolean graphicsCard;
	private final boolean bluetooth;
	
	// private constructor that takes a Builder 
	private Computer(Builder builder) {
		this.processor = builder.processor; 
		this.ram = builder.ram;
		this.storage = builder.storage;
		this.graphicsCard = builder.graphicsCard;
		this.bluetooth = builder.bluetooth;
	}
	
	// Static Builder class
	public static class Builder{
		// required parameters
		private final String processor;
		private final int ram; 
		
		// optional parameters initialized to default values 
		private int storage = 256; 
		private boolean graphicsCard = false;
		private boolean bluetooth = false;
		
		// Builder constructor with required parameters 
		public Builder(String processor, int ram) {
			this.processor = processor;
			this.ram = ram;
		}
		
		// setter-like methods for optional parameters 
		public Builder storage(int val) {
			this.storage = val;
			return this; // for method chaining 
		}
		
		public Builder graphicsCard(boolean val) {
			this.graphicsCard = val;
			return this;
		}
		
		public Builder bluetooth(boolean val) {
			this.bluetooth = val;
			return this;
		}
		
		// Build method to return an instance of Computer 
		public Computer build() {
			// 'this' refers to the current instance of the Builder class 
			// since the COmputer constructor is designed to take a 
			// Builder object as its argument 
			return new Computer(this); 
		}
	} // end of Builder class
	
	@Override 
	public String toString() {
		return "Computer Specs:" +
				"\nProcessor: " + processor +
				"\nRam: " + ram + "GB" + 
				"\nStorage: " + storage + "GB" + 
				"\nGraphics Card: " + (graphicsCard ? "Yes" : "No") + 
				"\nBluetooth: " + (bluetooth ? "Yes" : "No");
	} 
} // end of Computer class 
