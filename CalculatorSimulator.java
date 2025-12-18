import java.util.*;
class CountryNotValidException extends Exception{
  public String getMessage(){
    return "The employee should be an indian citizen for calculating tax";
  }
}
class TaxNotEligibleException extends Exception{
public String getMessage(){
    return "The employee does not need to pay tax";
}

}
class EmployeeNameInvalidException extends Exception{
  public String getMessage(){
    return "The employee name cant be empty";
  }
}
class TaxCalculator{
 double calculateTax(String empname,boolean isIndian,double empSal)throws CountryNotValidException , TaxNotEligibleException,EmployeeNameInvalidException{
        double taxAmount=0;
        if(empname==null||empname.equals(" ")){
            throw new EmployeeNameInvalidException();
        }
        else if(isIndian==false){
          throw new CountryNotValidException();
        }
    else if(empSal>100000){
        taxAmount=empSal*8/100; 
       }
       else if(empSal>50000&&empSal<=100000){
    taxAmount=empSal*6/100; 
   }
   else if(empSal>=30000&&empSal<50000){
    taxAmount=empSal*5/100; 
   }
   else if(empSal>10000&&empSal<30000){
    taxAmount=empSal*4/100; 
   }
   else{
    throw new TaxNotEligibleException();
   }
        return taxAmount;

    }
}
public class CalculatorSimulator {
    public static void main(String[] args) {
        
    TaxCalculator tc=new TaxCalculator();
    try{
        double tax=tc.calculateTax(" ",true,30000);
        System.out.println("the tax amount is "+tax);
    }
    catch(CountryNotValidException e){
        e.printStackTrace();
     }
     catch(TaxNotEligibleException e){
        e.printStackTrace();
     }
     catch(EmployeeNameInvalidException e){
        e.printStackTrace();
     }
    }
}
