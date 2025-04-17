package principlesOfOops;

public class Sim {
	String serviceProvider;
	String networkType;
	String type;
	long simNo;
	
	public Sim() {
		
	}
	
	Sim(String sp, String networkType, String type, long simNo){
		serviceProvider = sp;
		this.networkType = networkType;
		this.type = type;
		this.simNo = simNo;
	}
	
	public void displaySim() {
		System.out.println(serviceProvider);
		System.out.println(networkType);
		System.out.println(type);
		System.out.println(simNo);
	}
}
