package homework;

public class StudentManager {
	
	public void insert(Student student) {
		System.out.println("Merhaba " + student.getName() + " sisteme kay�t oldunuz. ��rencimiz olarak ho�geldiniz!" );
	}
	public void joinLesson(Student student) {
		System.out.println("Derse kat�l�m�n�z ger�ekle�mi�tir! Ba�ar�lar dileriz!");
	}
	public void signAttandance(Student student) {
		System.out.println("Yoklaman�z kaydedilmi�tir. Te�ekk�rler");
	}
	public void watchVideo(Student student) {
		System.out.println("Ders videosunu buradan izleyebilirsiniz!");
	}
	public void uplodhomework (Student student) {
		System.out.println("�deviniz g�nderilmi�tir. Elinize sa�l�k!");
	}
}
