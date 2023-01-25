import java.util.*;



class Practice {
  public static void print(){
    System.out.println("This is a practice program");
  }

  public static void equation(String problem){
    String distribute = problem.substring(problem.indexOf('(') + 1, problem.indexOf(')'));
    int regNum = 0;
    int coeff= 0;
    int multiply = 1;
    int value = 0;

    for(int i = 0; i < problem.length(); i++){
      if(problem.indexOf('=') > i){
        if(!(problem.indexOf('(') < i && i < problem.indexOf(')'))){
        if(Character.isDigit(problem.charAt(i))){
          if(problem.indexOf(problem.charAt(i)) == 0 || problem.charAt(i - 1) != '-') {
            
            //Finds the number to distribute
            if(i < problem.length() - 1 && problem.charAt(i + 1) == '(') {
              multiply = Integer.parseInt(Character.toString(problem.charAt(i)));       
            } 


            //Finds the numbers that are not the distributive and that would be positive
            if( i < problem.length() - 1 && problem.charAt(i + 1) != '('){
              if(Character.isLetter(problem.charAt(i + 1))) {
                coeff += Integer.parseInt(Character.toString(problem.charAt(i)));
              }
              if(!(Character.isLetter(problem.charAt(i + 1)))){
                regNum += Integer.parseInt(Character.toString(problem.charAt(i)));
              } 
            }
          } else {
             //Checks for numbers that would be negative
            if(i < problem.length() - 1 && problem.charAt(i + 1) == '(') {
              multiply = - 1 * Integer.parseInt(Character.toString(problem.charAt(i)));       
            }
            
            if( i < problem.length() - 1 && problem.charAt(i + 1) != '('){
              if(Character.isLetter(problem.charAt(i + 1))) {
                coeff += -1 * Integer.parseInt(Character.toString(problem.charAt(i)));
              }
              if(!(Character.isLetter(problem.charAt(i + 1)))){
                regNum += -1 * Integer.parseInt(Character.toString(problem.charAt(i)));
              } 
            }
          }
        
        }
      }
      } else if(i > problem.indexOf('=')){
        if(Character.isDigit(problem.charAt(i))){
          if(problem.charAt(i - 1) != '-') {
            value = Integer.parseInt(Character.toString(problem.charAt(i)));
          } else {
            value = -1 * Integer.parseInt(Character.toString(problem.charAt(i)));
          }
        }
      }
    }


    //Distrubutes the numbers
    for(int j = 0; j < distribute.length(); j++){
      if(Character.isDigit(distribute.charAt(j))){
        if(distribute.indexOf(distribute.charAt(j)) == 0 || distribute.charAt(j - 1) != '-'){
            if( j < distribute.length() - 1){
              if(Character.isLetter(distribute.charAt(j + 1))) {
                coeff += multiply * Integer.parseInt(Character.toString(distribute.charAt(j)));
              }
              if(!(Character.isLetter(distribute.charAt(j + 1)))){
                regNum += multiply * Integer.parseInt(Character.toString(distribute.charAt(j)));
              }
            } else if(j == distribute.length() - 1){
              regNum += multiply * Integer.parseInt(Character.toString(distribute.charAt(j)));
            }
        } else {
          if( j < distribute.length() - 1){
              if(Character.isLetter(distribute.charAt(j + 1))) {
                coeff += -1 * multiply * Integer.parseInt(Character.toString(distribute.charAt(j)));
              }
              if(!(Character.isLetter(distribute.charAt(j + 1)))){
                regNum += -1 * multiply * Integer.parseInt(Character.toString(distribute.charAt(j)));
              }
            } else if(j == distribute.length() - 1){
              regNum += -1 * multiply * Integer.parseInt(Character.toString(distribute.charAt(j)));
            }
        }
      }
    }

    value = (value + (-1 * regNum))/coeff;
    System.out.println(value);
  }

  public static void encap1(){
    System.out.println("This is my name");
  }

  public static void encap2(){
    encap1();
  }
}


class Class2 extends Practice {
  public static void encap1(){}  
}


class Main{
  public static void main(String args[]) {
    Class2 test = new Class2();
    test.print();
    test.equation("1(2y)+2=10");
    test.encap2(); 
  }
}

