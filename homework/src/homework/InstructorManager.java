package homework;

public class InstructorManager {
	
	public void insert(Instructor instructor) {
		System.out.println("Sevgili Hocamýz, "+ instructor.getName()+ " sisteme kayýt oldunuz. Hoþgeldiniz!");
			
	}

	public void addToLecture(Instructor instructor) {
		System.out.println("Ders oluþturuldu! Baþarýlý bir dönem dileriz! Sayýn "+ instructor.getName() + " Hocam!!" );
		
	}
	
	public void checkAttandance(Instructor instructor) {
		System.out.println("Yoklama tarafýnýzca onaylandý. Teþekkürler");
	}
	
	public void uploadHomework (Instructor instructor) {
		System.out.println("Ödev görevlendirmesi baþarýlý!");
	}
	
	public void uploadVideo (Instructor instructor) {
		System.out.println("Ders videosu yüklenmiþtir. Teþekkür ederiz!");
	}
}
