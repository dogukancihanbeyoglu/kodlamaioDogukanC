package homework;

public class InstructorManager {
	
	public void insert(Instructor instructor) {
		System.out.println("Sevgili Hocam�z, "+ instructor.getName()+ " sisteme kay�t oldunuz. Ho�geldiniz!");
			
	}

	public void addToLecture(Instructor instructor) {
		System.out.println("Ders olu�turuldu! Ba�ar�l� bir d�nem dileriz! Say�n "+ instructor.getName() + " Hocam!!" );
		
	}
	
	public void checkAttandance(Instructor instructor) {
		System.out.println("Yoklama taraf�n�zca onayland�. Te�ekk�rler");
	}
	
	public void uploadHomework (Instructor instructor) {
		System.out.println("�dev g�revlendirmesi ba�ar�l�!");
	}
	
	public void uploadVideo (Instructor instructor) {
		System.out.println("Ders videosu y�klenmi�tir. Te�ekk�r ederiz!");
	}
}
