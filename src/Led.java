
public class Led {
	public static void main(String[] args) {
		light l = new light() {

			@Override
			public String giveLght() {
				return "LED";
			}
		};
		String res = l.giveLght();
		System.out.println(res);
	}

}
