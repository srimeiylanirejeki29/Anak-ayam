import java.util.Scanner;

public class ANAKAYAM {
	public static void main(String[] args) {
		String lagi = "Y";
		while(lagi.equals("Y"))
		{
			Scanner ayam = new Scanner(System.in);
			int i;
			System.out.print("Anak ayam turun = ");
			i=ayam.nextInt();

			while(i>1){
				System.out.println("Anak ayam turun "  + i +  " mati satu tinggal " + (i-1));
				i--;
			}

			System.out.println("Anak ayam turun 1 mati satu tinggal induknya");
			Scanner x = new Scanner(System.in);
			lagi = x.nextLine().toUpperCase();
		}
	}
}
