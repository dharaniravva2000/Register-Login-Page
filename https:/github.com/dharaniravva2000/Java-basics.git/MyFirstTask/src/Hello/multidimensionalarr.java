package Hello;

public class multidimensionalarr {
	public static void main(String[] args) {
	
	int numb[][]= new int[4][5];
	
	for(int i=0;i<4;i++) {
		for(int j=0;j<5;j++) {
			numb[i][j]= (int)(Math.random()*9);
		}
			
		}
	
	for(int i=0;i<4;i++) {
		for(int j=0;j<5;j++) {
			System.out.print(numb[i][j]+"  ");
		}
		System.out.println();
	}
	
	
}
}