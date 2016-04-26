
public class Amplifier implements Device{
	
	private Tuner tuner;
	private CdPlayer cdPlayer;
	private DvdPlayer dvdPlayer;
	
	public Amplifier(){
		this.tuner = new Tuner();
		this.cdPlayer = new CdPlayer();
		this.dvdPlayer = new DvdPlayer();
	}
	

	@Override
	public void on() {
		// TODO Auto-generated method stub	
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub		
	}
	public void setStereoSound(){}
	public void setVolume(int level){}
	public void setTuner(Tuner t){}
	public void setDvd(DvdPlayer dvd){}
	public void setCd(CdPlayer cd){}
}
