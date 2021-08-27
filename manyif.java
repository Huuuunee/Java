public class manyif{
	public static void main(String[] args) {
		int row = 2;
		do {
			int culume = 1;	
			do {
				System.out.printf("%4d",row * culume);
				culume++;
			}while(culume < 10);
			System.out.println();
			row++;
		}while (row < 10);
	}
}