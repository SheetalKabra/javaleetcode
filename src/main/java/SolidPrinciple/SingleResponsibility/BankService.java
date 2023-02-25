package SolidPrinciple.SingleResponsibility;
//Single Responsibility states that every java class must perform single functionality.
//Implementation of multiple functionality in a single class mashup the code.
//Here, in the bankService class have functionality
//1. Print passbook
//2. amount deposits
//3. amount withdraw
//4. sendOtp
//5. getLoanInterestInfo
//So this class has a multiple reasons to change.
//To follow the SRP, we will break it into multiple classes so that every single class will have single responsibilty
//1. PrinterService
//2. LoanService
//3. NotificationService
//etc
public class BankService {
    public void printPassbook(){
        //update transation info in passbook
    }

    public long deposits(long amount, String accountNo){
        //deposit amount;
        return 0;
    }

    public long withdraw(long amount, String accountNo){
        //withdraw amount;
        return 0;
    }

    public void sendOtp(String medium){
        //write email related logic
    }

    public void getLoanInterestInfo(String loanType){
        if(loanType.equals("homeLoan") ){
            // do some job
        }
        if(loanType.equals("personlaLoan") ){
            // do some job
        }
        if(loanType.equals("carLoan") ){
            // do some job
        }
    }
}
