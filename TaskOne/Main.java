
public class Main {

public static void main(String[] args) {
	
	emptyLine();
	printString("Print this!");
	nameAge("Leo", 24);

}

static void emptyLine() {
	System.out.println("");
}

static void printString(String a) {
	System.out.println(a);
}
static void nameAge(String name, int age){
	System.out.println("my name is "+name+", I am "+age+" years old.");
}
}