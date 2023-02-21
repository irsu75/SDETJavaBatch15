package Review8;

public  abstract class Insurance {

    public String policyNumber;
    protected String policyHolder;

    public Insurance(String policyNumber,String policyHolder){
        this.policyNumber=policyNumber;
        this.policyHolder=policyHolder;
    }
    public void getInsurance(){
        System.out.println("We need to get insurance");
    }
}
