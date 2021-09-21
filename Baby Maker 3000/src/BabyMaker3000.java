
public class BabyMaker3000
	{

		public static void main(String[] args)
			{
				
				Baby myBaby1 = new Baby ("Poe", 10.4, 0);
				
				System.out.println("I just birthed a child during AP Comp Sci, their name is " + myBaby1.name + ".");
				
				if (myBaby1.weight >= 10)
					{
						System.out.println("Das a big baby");
					}
				else if (myBaby1.weight <= 5)
					{
						System.out.println("Girl feed your god damn baby.");
					}
				
				Baby.piss();
				Baby.shit();
				

			}

	}
