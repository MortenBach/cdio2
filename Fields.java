
public class Fields 
{
	public int FieldNumber(int Number)
	{
	        switch (Number) 
	        {
	            case 2: System.out.println("Du er nu i sikkerhed da 2 beskyttelsest�rne er i n�rheden");
	            		return 250;
	                   
	            case 3: System.out.println("Du er faldet ned i et krater");
	            		return -100;
	                   
	            case 4: System.out.println("Du er nu i n�rheden af paladsets porte og f�r derfor beskyttelse!"); 
	            		return 100;
	                    
	            case 5: System.out.println("Du er faret vild i snestormen i den kolde vildmark"); 
	            		return -20;
	                   
	            case 6: System.out.println("Du er nu i sikkerhed bag byens h�je murer"); 
	            		return 180;
	                   
	            case 7: System.out.println("Du er nu p� helligjord i klosteret"); 
	            		return 0;
	                   
	            case 8: System.out.println("Du s�ger ly i en sort hule med finder ud af hulen tilh�rer en bj�rn"); 
	            		return-70;
	                     
	            case 9: System.out.println("Efter en lang tur op af bjergene finder du ly i nogle forladte hytter"); 
	            		return 60;
	                   
	            case 10:System.out.println("Du er nu n�et til en k�mpe mur der tilh�rer vareulvene og er tvunget til at skynde dig v�k!");  
	            		return -80;
	              
	            case 11:System.out.println("Du sidder fast i en kl�ft og er nu dehydreret"); 
	            		return -50;
	          
	            case 12:System.out.println("Du har fundet guld i bjergene og s�lger det for 650, du er rig!"); 
	            		return 650;
	            default: 
	                 	 return 0;
	        }
	}
}
