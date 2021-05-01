package homework;

public class Main {

	public static void main(String[] args) {
		
		Student dogukan = new Student();
			dogukan.setId(1);
			dogukan.setName("Doðukan");
			dogukan.setSurname("Cihanbeyoðlu");
			dogukan.setSex("Erkek");
			dogukan.setBirtdayYear(1995);
			dogukan.setLevelOfEducation("Yüksek Lisans");
			dogukan.setLessons("Java");
			dogukan.setStatus("Çalýþýyor");
		System.out.println(dogukan.getAge());
		
		Instructor engin = new Instructor();
			engin.setId(2);
			engin.setName("Engin");
			engin.setSurname("Demiroð");
			engin.setSex("Erkek");
			engin.setBirtdayYear(1980);
			engin.setProfession("Yazýlýmcý");
			engin.setTitle("PhD");
			engin.setLectures("Java");
		System.out.println(engin.getAge());
		System.out.println("----------USER CLASS YETKÝ KULLANIMI------------------");
		UserManager userManager = new UserManager();
		userManager.beInstructor(engin);
		userManager.beStudent(dogukan);
		System.out.println("----------STUDENTMANAGER YETKÝ KULLANIMI------------------");
		StudentManager studentManager = new StudentManager();
			studentManager.insert(dogukan);
			studentManager.joinLesson(dogukan);
			studentManager.signAttandance(dogukan);
			studentManager.watchVideo(dogukan);
			studentManager.uplodhomework(dogukan);
		System.out.println("---------ÖÐRETÝCÝ YETKÝ KULLANIMI-------------------");
		InstructorManager instructorManager = new InstructorManager();
			instructorManager.insert(engin);
			instructorManager.addToLecture(engin);
			instructorManager.checkAttandance(engin);
			instructorManager.uploadHomework(engin);
			instructorManager.uploadVideo(engin);
		System.out.println("-----------------------------");	
		
	}

}
