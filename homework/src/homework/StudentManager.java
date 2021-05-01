package homework;

public class StudentManager {
	
	public void insert(Student student) {
		System.out.println("Merhaba " + student.getName() + " sisteme kayýt oldunuz. Öðrencimiz olarak hoþgeldiniz!" );
	}
	public void joinLesson(Student student) {
		System.out.println("Derse katýlýmýnýz gerçekleþmiþtir! Baþarýlar dileriz!");
	}
	public void signAttandance(Student student) {
		System.out.println("Yoklamanýz kaydedilmiþtir. Teþekkürler");
	}
	public void watchVideo(Student student) {
		System.out.println("Ders videosunu buradan izleyebilirsiniz!");
	}
	public void uplodhomework (Student student) {
		System.out.println("Ödeviniz gönderilmiþtir. Elinize saðlýk!");
	}
}
