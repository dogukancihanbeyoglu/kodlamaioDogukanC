package homework;

public class UserManager {

	public void insert(Users user) {
		
		System.out.println("Sisteme Ho�geldiniz! Say�n " + user.getName() + 
							" Yetkilerinizi belirleyebilmek i�in kullan�c� tipinizi se�iniz!");
	}
	public void beInstructor(Users user) {
		System.out.println("Sevgili Hocam�z ho�geldiniz! Yetkilerinizi g�rebilmek i�in men�ye bak�n�z.");
		}
	
	public void beStudent(Users user) {
		System.out.println("Sevgili ��rencimiz ho�geldin! Ders takibini sol men�den yapabilirsin!");
	}
	
	
}
