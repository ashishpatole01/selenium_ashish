import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmpolyeeReadData {
	public static void main(String[]args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("alia.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object o = ois.readObject();
		if (o instanceof Employee) {
			Employee e = (Employee) o;
			System.out.println(e.name + " " + e.id + " " + e.dept + " " +e.profile + " " + e.salary + " " + e.phone + " " );
			
			}
		fis.close();
		ois.close();
		
	}
	

}
