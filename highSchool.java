class highSchool{

public String runLength(String str){
	int counter = 1;
	String str2="";
	String str1= "";
	for(int i=0;i<str.length()-1;i++){
		
	if(str.charAt(i)==str.charAt(i+1)){
		counter++;
	
	}
	if(str.charAt(i)!=(str.charAt(i+1))){
		str1+=String.valueOf(counter) + String.valueOf(str.charAt(i));
		//str2 = String.valueOf(str1);
		counter=1;
					// counter+i?
	}
	
}
return str1;
}

//public String runLengthChecker(String str1, String str2){
//}
public static void main (String[] args){
	highSchool tester = new highSchool();
	
	String testOne = tester.runLength("aaaaBBB");
	
	System.out.println(testOne);
	
	String testTwo = tester.runLength("aaaaBBBCCCCC");
	
}

}