
public class VersionInfoExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime.Version version = Runtime.version();
		System.out.println("CV="+version);
		
		System.out.println("MjV="+version.major());
		System.out.println("MnV="+version.minor());
		System.out.println("SV="+version.security());
		System.out.println("PV="+version.pre());
		System.out.println("BV="+version.build());
	}

}
