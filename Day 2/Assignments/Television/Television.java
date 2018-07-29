//Class Television that has basic television operations
public class Television {

	private boolean state;
	private int currentVolume;
	private int currentChannel;
	public Television(){
		state = false;
		currentVolume = 30;
		currentChannel = 100;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {	
		this.state = state;
	}
	public int getCurrentVolume() {
		return currentVolume;
	}
	//Method to change current volume 
	public void setCurrentVolume(int currentVolume) {
		if(currentVolume >= 0 && currentVolume <= 100)
			this.currentVolume = currentVolume;
	}
	//Method to change current channel 
	public void setCurrentChannel(int currentChannel) {
		if(currentChannel >= 100 && currentChannel <= 999)
			this.currentChannel = currentChannel;
	}
	public int getCurrentChannel() {
		return currentChannel;
	}
	public void increaseVolume() {
		currentVolume+=5;
	}
	public void decreaseVolume() {
		currentVolume-=5;
	}
	@Override
	public String toString() {
		return "Television [isState() "+ isState() +" currentVolume=" + currentVolume + ", currentChannel=" + currentChannel
				+ ", getCurrentVolume()=" + getCurrentVolume() + ", getCurrentChannel()=" + getCurrentChannel() + "]";
	}
	
	
}
