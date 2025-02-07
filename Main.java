// PARTNER NAME: Sage Yosick
// PARTNER NAME:
// CS111 SECTION #:
// DATE: 2/6/2025

public class Main
{
	public static void main(String[] args)
	{
		//DECLARATION + INITIALIZATION SECTION
		String surname, givenName, category, cardNum, birthCountry, birthMonth, termsandConditions;
		char sex;
		int uscisNum1, uscisNum2, uscisNum3, birthDay, birthYear, validDay, validMonth, validYear, expireMonth, expireDay, expireYear; 

		//INPUT SECTION
		surname = "SPECIMEN";
		givenName = "TEST V";
		category = "C09";
		cardNum = "SRC0000000725";
		birthCountry = "Ethopia";
		termsandConditions = "None";
		sex = 'M';
		birthMonth = "JAN";
		uscisNum1 = 000;
		uscisNum2 = 000;
		uscisNum3 = 725;
		birthDay = 01;
		birthYear = 1920;
		validDay = 01;
		validMonth = 01;
		validYear = 80;
		expireDay = 05;
		expireMonth = 10;
		expireYear = 11;



		
		//CALCULATION SECTION
		
		//OUTPUT SECTION
		System.out.println("╔══════════════════════════════════════════════════════════════════════");
		System.out.println("║         UNITED STATES OF AMERICA");
		System.out.println("║                                  EMPLOYMENT AUTHORIZATION CARD");
		System.out.println("║                       Surname");
		System.out.println("║                       " + surname + " ");
		System.out.println("║  .----.    .----.     Given Name");
		System.out.println("║ (   ^  \\  /  ^   )    " + givenName + " ");
		System.out.println("║        |  |           USCIS#         Category   Card#");
		System.out.println("║       _/  \\_          " + uscisNum1 + "-" + uscisNum2 + "-" + uscisNum3 + "        " + category + "        " + cardNum + "");
		System.out.println("║      (_    _)         Country of Birth");
		System.out.println("║   ,    `--`    ,      " + birthCountry + " ");
		System.out.println("║   \\'-.______.-'/      Terms and Conditions");
		System.out.println("║    \\          /       " + termsandConditions + " ");
		System.out.println("║     '.--..--.'        Date of Birth   Sex");
		System.out.println("║       `\"\"\"\"\"`         " + birthDay + " " + birthMonth + "  " + birthYear + "     " + sex + "");
		System.out.println("║                       Valid From:     " + validMonth + "/" + validDay + "/" + validYear + "");
		System.out.println("║                       Card Expires:   " + expireDay + "/" + expireMonth + "/" + expireYear + "");
		System.out.println("║ ascii art by: jgs     NOT VALID FOR REENTRY TO U.S.");
		System.out.println("╚══════════════════════════════════════════════════════════════════════");
		//ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
	}
}