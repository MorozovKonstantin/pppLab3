package pppLab3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class main {

	public static String changeNumber(String s){
		String newS;
			newS=s.substring(0,1)+"1"+"("+s.substring(2,5)+")"+s.substring(5,8)+"-"+s.substring(8,10)+"-"+s.substring(10,12);
		return newS;
	}
	public static void main(String[] args) {
		Pattern p = Pattern.compile("(\\+[0-9]{11})");
		String s;
		String s1 = "";
		Matcher m =p.matcher("номер телефон +79000000000 +79991112222 +81110002233");
		while(m.find()){
			s = changeNumber(m.group());
			s1 = m.replaceFirst(s);
			m.reset(s1);
		}
		System.out.println(s1);
	}

}
