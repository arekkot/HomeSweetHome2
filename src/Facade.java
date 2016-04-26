
public class Facade {
	private Tuner tuner;
	private CdPlayer cdPlayer;
	private Amplifier amplifier;
	private DvdPlayer dvdPlayer;
	private Projector  projector;
	private Lights  lights;
	
	public Facade() {
		this.tuner = new Tuner();
		this.cdPlayer = new CdPlayer();
		this.amplifier = new Amplifier();
		this.dvdPlayer = new DvdPlayer();
		this.projector = new Projector();
		this.lights = new Lights();
	}

	public void example() {
		dvdPlayer.stop();	
	}
	
	

}
