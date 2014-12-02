public class Emina {
	public static int[] Binarno(int n)
	{
		int[] niz=new int[8];
		
		for(int j=0; j<niz.length; j++)
			niz[j]=0;
		int i=0;
		while(n!=0)
		{
			niz[i]=n%2;
			n/=2;
			i++;
		}
	
			
		return niz;
	}
	public static void main(String[] args) {
		int i;
		System.out.println("Unesite broj: ");
		int broj=TextIO.getInt();
		for(i=7; i>=0; i--)
		System.out.println(Binarno(i));
	}

}