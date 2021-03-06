package day19;

public class Removetags {

	public static void main(String[] args) {
		/*
		 * String str="<div>TestLeaf<div>";
		 * 
		 * String str2="<a>Java Learning<a>"; String
		 * str3="<body>Selenium Automation <body>";
		 * 
		 * String newstr = str.replaceAll("\\<.*?\\>", ""); String newstr1 =
		 * str2.replaceAll("\\<.*?\\>", ""); String newstr2=
		 * str3.replaceAll("\\<.*?\\>",""); //str.replaceAll(., replacement)
		 * System.out.println(newstr); System.out.println(newstr1);
		 * System.out.println(newstr2);
		 */
		 
		 String str="<div>TestLeaf<div> <a>Java Learning<a> <body>Selenium Automation <body>";
		 String newstr = str.replaceAll("\\<.*?\\>", "");
		 System.out.println(newstr);

	}
	

}
