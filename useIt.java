class Xamples{
	
	public String ShowYours() 
	{
		return "ShowYours without params";
	}
	
	public String ShowMine() 
	{
		return "ShowMine without params";
	}
	
	public int ShowYours(String C) 
	{
		return 10;
	}
	
	public int ShowMine(String D) 
	{
		return 40;
	}
	
	public double ShowYours(int C) 
	{
		 return 60.01;
	}
	
	public double ShowMine(int D) 
	{
		return 7.77;
	}

}
class useIt{
	
	Xamples iWill = new Xamples();
	
	int saveInt = 0;
	String SaveString = "testing";
	double SaveDouble = 42.42;
	int secondInt = 2;
	
	
	
	String ShowMine2=iWill.ShowMine();
	
	String ShowYours2=iWill.ShowYours();
	
	int StrMinewith=iWill.ShowMine("i'm telling mom");
	
	int strYourswith=iWill.ShowYours("ok");
	
	double ShowMinenum = iWill.ShowMine(42);
	
	double ShowYoursnum = iWill.ShowYours(24);
	
	public static void main(String args[]){
	
	System.out.println();
	}

}