import java.util.*;
//am facut un profil de instagram privat, adica pentru a lasa pe cineva sa te urmareasca trebuie sa confirmi
//in caz contrar sa refuzi
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Follower follower1 = new Follower("Adi", 19);
		Follower follower2 = new Follower("Andreea", 20);
		Follower follower3 = new Follower("Iulia", 20);
		Follower follower4 = new Follower("Marius", 21);
		
		InstagramAccount profile = new InstagramAccount("Andra", 20, new ArrayList<>());
		
		List<Follower> listaAsteptare = new ArrayList();
		listaAsteptare.add(follower1);
		listaAsteptare.add(follower2);
		listaAsteptare.add(follower3);
		listaAsteptare.add(follower4);
		
		String confirma;
		
		for(Follower f: listaAsteptare) {
			while(true) {
				confirma = input.nextLine();
				if(confirma.equals("Confirma"))
				{
					profile.addFollower(f);
					break;
				}
				else if(confirma.equals("Refuza"))
				{
					break;
				}
				System.out.println("Introduceti din nou operatiunea:");
				
			}
		}
		profile.afisare();
		
		//profile.blockFollower(follower1);
		
		
	}

}
