package homework;

public class UserManager {

	public void insert(Users user) {
		
		System.out.println("Sisteme Hoþgeldiniz! Sayýn " + user.getName() + 
							" Yetkilerinizi belirleyebilmek için kullanýcý tipinizi seçiniz!");
	}
	public void beInstructor(Users user) {
		System.out.println("Sevgili Hocamýz hoþgeldiniz! Yetkilerinizi görebilmek için menüye bakýnýz.");
		}
	
	public void beStudent(Users user) {
		System.out.println("Sevgili öðrencimiz hoþgeldin! Ders takibini sol menüden yapabilirsin!");
	}
	
	
}
