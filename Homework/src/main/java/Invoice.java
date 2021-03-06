// An invoice blueprint with some functionalities.

import java.text.DecimalFormat;

public class Invoice {

    //data members
    private String partNumber;
    private String partDesc;
    private int quantityPurchased;
    private double pricePerUnit;

    public Invoice(String initPartNumber, String initPartDesc, int initQuantityPurchased, double initPricePerUnit){
        if (initPartNumber != null && !initPartNumber.isEmpty()){
            partNumber = initPartNumber;
        }else {
            partNumber = "Not specified";
        }
        if (initPartDesc != null && !initPartDesc.isEmpty()){
            partDesc = initPartDesc;
        }else {
            partDesc = "Not specified";
        }
        //the default value for int is 0 so we don't need to specify it in our control structure
        if (initQuantityPurchased > 0){
            quantityPurchased = initQuantityPurchased;
        }
        //the default value for double is 0.0 so we don't need to specify it in our control structure
        if (initPricePerUnit > 0){
            pricePerUnit = initPricePerUnit;
        }
    }

    public String getPartNumber() {
        return partNumber;
    }

    //if the new part number doesn't contain any info the old one will be kept
    public void setPartNumber(String partNumber) {
        if (partNumber != null && !partNumber.isEmpty()) {
            this.partNumber = partNumber;
        }
    }

    public String getPartDesc() {
        return partDesc;
    }

    //if the new part description doesn't contain any info the old one will be kept
    public void setPartDesc(String partDesc) {
        if (partDesc != null && !partDesc.isEmpty()) {
            this.partDesc = partDesc;
        }
    }

    public int getQuantityPurchased() {
        return quantityPurchased;
    }

    public void setQuantityPurchased(int quantityPurchased) {
        if (quantityPurchased > 0) {
            this.quantityPurchased = quantityPurchased;
        }else {
            this.quantityPurchased = 0;
        }
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        if (pricePerUnit > 0) {
            this.pricePerUnit = pricePerUnit;
        }else {
            this.pricePerUnit = 0;
        }
    }

    public double getInvoiceAmount(){
        return (double) (quantityPurchased) * pricePerUnit;
    }

    @Override
    public String toString(){
        DecimalFormat myFormatter = new DecimalFormat("0.00");
        String result;
        result = "Part number: " + this.getPartNumber() + "; \n";
        result += "Part description: " + this.getPartDesc() + "; \n";
        result += "Quantity purchased: " + this.getQuantityPurchased() + "; \n";
        result += "Price per unit: " + myFormatter.format(this.getPricePerUnit()) + ";\n";
        result += "Total cost: " + myFormatter.format(this.getInvoiceAmount()) +".";
        return result;
    }
}
