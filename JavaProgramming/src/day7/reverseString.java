package day7;

public class reverseString {

	public static void main(String[] args) {
			
				String astr= "priya", newstr = "";
				char c;
				System.out.println("Original word: priya ");
				System.out.println(astr.length());
				
				for(int i=0;i< astr.length();i++) 
				{
					c =astr.charAt(i);
					newstr = c+newstr;
				}
				
				System.out.println("Reversed word: "+ newstr);
				
				System.out.println(astr.equals(newstr));
				
				if (astr.equals(newstr))
				
					System.out.println("Sting is palindrome");
					
				else
					System.out.println("Sting isn't palindrome");
					
				
				
				String s1="pri", s2="verma";
				System.out.println(s1+" "+s2);

				
				s1 = s1 + s2; 
				// s1= priverma
				
				s2 = s1.substring(0, (s1.length() - s2.length()));    
				
		        //EXTRACT str1 from index length(str2) till end using substring function.  
		        s1 = s1.substring(s2.length());    
				
			
				System.out.println(s1+" "+s2);
				
				
		     
		     
	}

}
