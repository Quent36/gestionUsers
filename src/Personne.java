
public class Personne {

	private int age;
	private String nom;
	private String prenom;
	public Personne() {
		super();
	}
	public Personne(int age, String nom, String prenom) {
		super();
		this.age = age;
		this.nom = nom;
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getnomm2() {
		return nom;
	}
	public void setnomm2(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	@Override
	public String toString() {
		return "Personne [age=" + age + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
	
}
