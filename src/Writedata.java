import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Writedata {
	public static void main(String[]args) throws IOException {
	Employee e=new Employee();
	e.id=007;
	e.name="Pragati";
	e.profile="SDET";
	e.salary=70000;
	e.dept="testing";
	e.phone=123456789;
	FileOutputStream fos = new FileOutputStream("alia.txt");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(e);
	fos.close();
	oos.close();
	System.out.println("App End");
	
	}
}
