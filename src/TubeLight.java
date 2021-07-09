public class TubeLight implements light {

	@Override
	public String giveLight() {
		return "Tubelight";
	}

	public static void main(String[] args) {
		TubeLight t = new TubeLight();
		String res = t.giveLight();
		System.out.println(res);
	}
}
