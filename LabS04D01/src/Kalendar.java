import java.util.concurrent.BrokenBarrierException;


public class Kalendar {
    public static void main(String[] args) {
    int godina=2014;
    
    int[] brDanaPoMjesecima = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
    if(godinaJePrestupna(godina)){
    	brDanaPoMjesecima[1]=29;
    }
    
	System.out.println(ispisiMjesec("Neki mjesec",30,4,7));
    }
    
    public static boolean godinaJePrestupna(int godina){
    	if(godina%400 == 0 ){
    		return true;
    	}
    	if(godina%100 == 0){
    		return false;
    	}
    	
    	if(godina % 4 == 0){
    		return true;
    	}
    	return false;
    	    	
    }
    public static String ispisiMjesec( String nazivMjeseca,int brDanaUMjesec,int prviDanUMjesecu, int prviDan, String...dani){
    	if(dani.length != 7){
    		dani=new String[] {"pon", "uto", "sri", "cet", "pet", "sub", "ned"};
    	}
    	String str = String.format("%28s",nazivMjeseca) +"\n";
    	int idx = prviDan-1;
    	
    	do{
    	
    		str += String.format("%4s", dani[idx]);
    		idx++;
    	idx%=7;   		
    		
    	}while(idx != prviDan-1);
    	str +="\n";
    	int slobodnihMjesta = (prviDanUMjesecu-prviDan+7)%7;
    	
    	for(idx=0; idx<slobodnihMjesta; idx++){
    		str += String.format("%4s", "");
    	}
    	while(idx<brDanaUMjesec){
    		str += String.format("%4d",(idx-slobodnihMjesta+1));
    		idx++;
    		if(idx % 7 ==0){
    			str +="\n";
    			
    		}
    	}
    	return str;
    }
    
    public static int vratiPrviDanUMjesecu(int mjesec, int gprviDanUGodini, int [] brojDanaPoMjesecima){
    	
    	int prviDanUMjesecu=0;
    	for (int i=0;i<mjesec;i++){
    		prviDanUMjesecu+=brojDanaPoMjesecima[i];
    		
    	}
    	    	return prviDanUMjesecu;

    }
}
