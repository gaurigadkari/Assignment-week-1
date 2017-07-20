
public class IntegerToRoman {
	public String intToRoman(int a) {
	    StringBuilder roman = new StringBuilder("");
	    while (a >= 1000) {
			roman.append("M");
			a -= 1000;
		}
		while (a >= 900) {
			roman.append("CM");
			a -= 900;
		}
		while (a >= 500) {
			roman.append("D");
			a -= 500;
		}
		while (a >= 400) {
			roman.append("CD");
			a -= 400;
		}
		while (a >= 100) {
			roman.append("C");
			a -= 100;
		}
		while (a >= 90) {
			roman.append("XC");
			a -= 90;
		}
		while (a >= 50) {
			roman.append("L");
			a -= 50;
		}
		while (a >= 40) {
			roman.append("XL");
			a -= 40;
		}
		while (a >= 10) {
			roman.append("X");
			a -= 10;
		}
		while (a >= 9) {
			roman.append("IX");
			a -= 9;
		}
		while (a >= 5) {
			roman.append("V");
			a -= 5;
		}
		while (a >= 4) {
			roman.append("IV");
			a -= 4;
		}
		while (a >= 1) {
			roman.append("I");
			a -= 1;
		}
        return roman.toString();
	}
}

