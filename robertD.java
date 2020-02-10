class robertD{
	
	Moneys[] pocketChange;
	
	enum Moneys{
		penny, nickel, dime, quarter, halfdollar, dollar;
	}

	public double getd(Moneys coin){
		//int value = 0;
		double d=0;
		
		
		
		
		switch (coin){
			case penny:
				d = .01;
				break;
			case nickel:
				d = .05;
				break;
			case dime:
				d = .10;
				break;
			case quarter:
				d = .25;
				break;
			case halfdollar:
				d = .50;
				break;
			case dollar:
				d = 1.00;
				break;
		}

		return d;
	}
}

class dinero{
	public static void main(String... v){
		robertD Duckets = new robertD();
		int i; 
		double sum=0;
		Duckets.pocketChange = new robertD.Moneys[20];
		for (i = 0; i < 20; i++) {  
		Duckets.pocketChange[i]=robertD.Moneys.penny;
			if(i>=0&&i<3){
				System.out.println(robertD.Moneys.penny);
			}
			if(i>=3&&i<6){
				Duckets.pocketChange[i]=robertD.Moneys.nickel;
				System.out.println(robertD.Moneys.nickel);
			}
				if(i>=6&&i<9){
					Duckets.pocketChange[i]=robertD.Moneys.dime;
					System.out.println(robertD.Moneys.dime);
				}
					if(i>=9&&i<12){
						Duckets.pocketChange[i]=robertD.Moneys.quarter;
						System.out.println(robertD.Moneys.quarter);
					}
						if(i>=12&&i<15){
							Duckets.pocketChange[i]=robertD.Moneys.halfdollar;
							System.out.println(robertD.Moneys.halfdollar);
						}
							if(i>=15){
								Duckets.pocketChange[i]=robertD.Moneys.dollar;
								System.out.println(robertD.Moneys.dollar);
							}
							sum+=Duckets.getd(Duckets.pocketChange[i]);
							System.out.println(Duckets.getd(Duckets.pocketChange[i]));
							
							
		}
		
		System.out.println("sum is $"+sum);
		
		// give each of the coins a value
		//for(robertD.Moneys coin: Duckets.pocketChange){ //might need different for loop
			//System.out.println(Duckets.getValue(coin) );
			//coin = robertD.Moneys.nickel;
			//System.out.println(Duckets.getValue(coin) );
			//Duckets.pocketChange[0] = coin;
		
		
		
		//Show me the coins in your pocketChange.
		}	
		
		//Give me the sum of those coins.
		}
		
	

