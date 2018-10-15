public class Test {

public static void main(String[] args) throws Exception {
boolean threeFlag = false;
boolean fiveFlag = false;
boolean bothFlag = false;
String numberStr = "";

for(int number=1; number<=100; number++){
numberStr = number+"";
if(number%3 == 0 || numberStr.contains("3")){
threeFlag = true;
}
if(number%5 == 0|| numberStr.contains("5")){
fiveFlag = true;
}
if(threeFlag && fiveFlag){
bothFlag = true;
}
if(bothFlag){
System.out.println("FizzBuzz");
}else if(threeFlag){
System.out.println("Fizz");
}else if(fiveFlag){
System.out.println("Buzz");
}else{
System.out.println(number);
}
threeFlag = false;
fiveFlag = false;
bothFlag = false;
}
}

}