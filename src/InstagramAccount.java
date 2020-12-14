import java.util.*;

public class InstagramAccount {
	private String nume;
	private int varsta;
	private List<Follower> urmaritori = new ArrayList();
	
	public InstagramAccount(String nume, int varsta, List<Follower> urmaritori) {
		this.nume = nume;
		this.urmaritori = urmaritori;
		this.varsta = varsta;
	}
	
	public void addFollower(Follower follower1) {
		this.urmaritori.add(follower1);
	}
	
	public void removeFollower(Follower follower2) {
		this.urmaritori.remove(follower2);
	}
	
	public void blockFollower(Follower follower3) {
		for(Follower f : urmaritori) {
			if(f.getNume().equals(follower3.getNume())) {
				this.urmaritori.remove(follower3);
			}
		}
		System.out.println("Acest utilizator este blocat.");
	}
	
	public void searchFollower(int varsta) {
		List<Follower> urmaritoriGasiti = new ArrayList();
		for(Follower u: urmaritori) {
			if(u.getVarsta() == varsta) {
				urmaritoriGasiti.add(u);
			}
		}
	}
	
	public void afisare() {
		for(Follower f: urmaritori) {
			System.out.println(f.getNume()+" "+ f.getVarsta());
			System.out.println();
		}
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public List<Follower> getUrmaritori() {
		return urmaritori;
	}

	public void setUrmaritori(List<Follower> urmaritori) {
		this.urmaritori = urmaritori;
	}

}
