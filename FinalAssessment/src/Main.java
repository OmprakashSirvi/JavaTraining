import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<ArrayList<String>> accounts = new ArrayList<>();

		System.out.println("Number of inputs");
		Scanner sc = new Scanner(System.in);

		if (!sc.hasNextInt()) {
			System.out.println("Error!! Enter a number");
			sc.close();
			return;
		}
			
		int len = sc.nextInt();
		
		if (len < 0) {
			System.out.println("Invalid input");
			sc.close();
			return;
		}
		
		String accountNum;

		while (len > 0) {
			System.out.println("Account number : ");
			accountNum = sc.next();

			if (accountNum.startsWith("-") || accountNum.length() != 6) {
				System.out.println("Invalid account number");
				sc.close();
				return;
			}

			ArrayList<String> details = new ArrayList<>();
			details.add(accountNum.substring(0, 3));
			details.add(accountNum.substring(3, 6));

			accounts.add(details);

			len--;
		}

		System.out.println("Branch Code");
		String branchCode = sc.next();

		if (branchCode.startsWith("-") || branchCode.length() != 3 || Integer.parseInt(branchCode) < 100) {
			System.out.println("Invalid branch code");
			sc.close();
			return;
		}


		for (ArrayList<String> account : accounts) {
			if (account.get(0).equals(branchCode)) {
				
				System.out.println(account.get(1));
			}
		}
		
		sc.close();
	}

}
