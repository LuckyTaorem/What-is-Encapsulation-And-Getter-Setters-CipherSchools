public class Getter_Setter {
    public static void main(String[] args) {
        Amazon Customer = new Amazon();
        float payableAmount = Customer.Transaction(1000);
        System.out.println("Total Payable "+payableAmount);    
    }
}
class Amazon{
    float Transaction(float amt){
        GPay gpayObj = new GPay();
        gpayObj.setTxnCharge(0.07f);
        float totalAmount = amt+(amt*gpayObj.getTxnCharge());
        return totalAmount;
    }
}
class GPay{
    private float txnCharge=0.05f;
    public void setTxnCharge(float newCharge){
        if(newCharge<=0.05f){
            System.out.println("Invalid TxnCharge");
        }
        txnCharge=newCharge;
    }
    public float getTxnCharge(){
        return txnCharge;
    }
}
