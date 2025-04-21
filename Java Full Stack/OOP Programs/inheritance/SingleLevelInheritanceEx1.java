package inheritance;

class Country {
	private String name;
	private String language;
	private int countryCode;
	private String president;
	private String primeMinister;
	private long population;
	private String currency;
	private int states;
	
	public Country() {
		super();
	}
	
	public Country(String name, String language, String president, int countryCode, String primeMinister, 
			long population, String currency, int states) {
		super();
		this.name = name;
		this.language = language;
		this.countryCode = countryCode;
		this.president = president;
		this.primeMinister = primeMinister;
		this.population = population;
		this.currency = currency;
		this.states = states;
	}
	
	public void displayCountry() {
		System.out.println("Name : "+name);
		System.out.println("Language : "+language);
		System.out.println("President : "+president);
		System.out.println("Prime Minister : "+primeMinister);
		System.out.println("Currency : "+currency);
		System.out.println("Country Code : "+countryCode);
		System.out.println("States : "+states);
		System.out.println("Population : "+population);
	}
}

class State extends Country{
	private String name;
	private String cm;
	private String language;
	private long pop;
	private int districts;
	private double area;
	
	public State() {
		super();
	}
	
	public State(String name1, String language1, String president, int countryCode, 
			String primeMinister, long population, String currency, int states, String name, String cm, String language,
			long pop, int districts, double area) {
		super(name1, language1, president, countryCode, primeMinister, population, currency, states);
		this.name = name;
		this.cm = cm;
		this.language = language;
		this.pop = pop;
		this.area = area;
		this.districts = districts;		
	}
	
	public void displayState() {
		System.out.println("Name : "+name);
		System.out.println("Language : "+language);
		System.out.println("CM : "+cm);
		System.out.println("Districts : "+districts);
		System.out.println("Area : "+area);
		System.out.println("Population : "+pop);
	}
}

class SingleLevelInheritanceEx1{
	public static void main(String[] args) {
		State obj = new State("India","Hindi","Murmu",91,"Modi",
				9898594484l,"Rupees",29,"Maharashtra","Devendra","Marathi",9860017548l,36,353453);
		obj.displayCountry();
		System.out.println();
		obj.displayState();
	}
}







