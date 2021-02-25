public class Datamatik{

static Teacher teacher = new Teacher("Jesper", 30, false);
static Student studentMe = new Student("Leo", 24, false,"team B");
static Student stundenOther = new Student("vincent", 23, false,"team B");

public static void main(String[] args) {
	System.out.println(teacher.name);
	System.out.println(studentMe.name + ", " + studentOther.name+".");
	System.out.println(studentMe.datamatikkerTeam);
}

}