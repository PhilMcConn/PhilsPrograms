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
		str1+=String.valueOf(counter) + (str.charAt(i));
		//str2 = String.valueOf(str1);
		counter=1;
					// counter+i?
	}
	}
		str1+=String.valueOf(counter)+(str.charAt(str.length()-1));
		return str1;
}

public String runLengthChecker(String str1, String str2){
	if(str2.equals(runLength(str1))){
		return "true";
	}
	return runLength(str1);

}
public static void main (String[] args){
	highSchool tester = new highSchool();
	
	String testOne = tester.runLength("aaaaBBB");
	
	System.out.println(testOne);
	
	String testTwo = tester.runLengthChecker("aaaaBBBCCCCC","4a3B5C");
	
	System.out.println(testTwo);
}

}