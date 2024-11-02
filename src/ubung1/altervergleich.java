package ubung1;

public class altervergleich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int min_alter ;
		int max_alter ;
		int[] alter = {26, 40, 28, 26, 28, 29, 31, 33, 29, 27};
		min_alter = alter[0] ;
		max_alter = alter[0] ;
		
		for (int i = 1; i < alter.length; i++) {
			if (alter[i] < min_alter) {
				min_alter = alter[i];
			}
			if (alter[i] > max_alter) {
				max_alter = alter[i];
			}
			
			
		}
		int count = 0;
		for (int i=0 ; i<alter.length ; i++) {
			if (alter[i] == min_alter) {
				count++;
			}
		}
		System.out.println("Der Min Alter ist: " + min_alter);
        System.out.println("Der Max Alter ist: " + max_alter);
        System.out.println("Der  min ALter kommt: " + count);
        }

}
