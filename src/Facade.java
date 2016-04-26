
public class Facade {
	private Tuner tuner;
	private CdPlayer cdPlayer;
	private Amplifier amplifier;
	private DvdPlayer dvdPlayer;
	private Projector projector;
	private Lights lights;

	public Facade() {
		this.setTuner(new Tuner());
		this.setCdPlayer(new CdPlayer());
		this.setAmplifier(new Amplifier());
		this.dvdPlayer = new DvdPlayer();
		this.setProjector(new Projector());
		this.setLights(new Lights());
	}

	public void example() {
		dvdPlayer.stop();
	}

	public CdPlayer getCdPlayer() {
		return cdPlayer;
	}

	public void setCdPlayer(CdPlayer cdPlayer) {
		this.cdPlayer = cdPlayer;
	}

	public Amplifier getAmplifier() {
		return amplifier;
	}

	public void setAmplifier(Amplifier amplifier) {
		this.amplifier = amplifier;
	}

	public Tuner getTuner() {
		return tuner;
	}

	public void setTuner(Tuner tuner) {
		this.tuner = tuner;
	}

	public Projector getProjector() {
		return projector;
	}

	public void setProjector(Projector projector) {
		this.projector = projector;
	}

	public Lights getLights() {
		return lights;
	}

	public void setLights(Lights lights) {
		this.lights = lights;
	}

}
