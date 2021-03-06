package day20;

import java.util.Stack;

public class Balancedparentheses {

	public static void main(String[] args) {
		String str= "{Th[is {is }an( te)s[]t";
		boolean flag=false;
		Stack<Character> input= new Stack<Character>();
for (int i = 0;(i <str.length()); i++) {
if(str.charAt(i)=='{'||str.charAt(i)=='('||str.charAt(i)=='[')
	input.push(str.charAt(i));

	else if(str.charAt(i)==']')
	{
		if(input.pop()=='[') {
			flag=true;
			continue;
		}
		else {
			
			flag=false;
			break;
		}}
		else if(str.charAt(i)=='}')
		{
			if(input.pop()=='{') {
				flag=true;
				continue;
			}
			else {
				flag=false;
				break;
			}}
			else if(str.charAt(i)==')')
			{
				if(input.pop()=='(') {
					flag=true;
					continue;
				}
				else {
					flag=false;
					break;
				}
	}}

	if(flag=true)

		System.out.println("Balanced expression");

	else 
		System.out.println("Inavlid expression");
		}
	}

