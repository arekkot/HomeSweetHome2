
public class Projector implements Device {

	private DvdPlayer dvdPlayer;

	public Projector() {
		this.setDvdPlayer(new DvdPlayer());
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub

	}

	@Override
	public void off() {
		// TODO Auto-generated method stub

	}

	public void wideScreenMode() {
	}

	public void tvMode() {
	}

	public DvdPlayer getDvdPlayer() {
		return dvdPlayer;
	}

	public void setDvdPlayer(DvdPlayer dvdPlayer) {
		this.dvdPlayer = dvdPlayer;
	}
}
