public class Policy {

     private int policyNumber;
     private String policyHolderName;
     private String insuranceType;
     private double coverageAmount;

    public Policy() {
    }

    public Policy(int policyNumber, String policyHolderName, String insuranceType, double coverageAmount) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.insuranceType = insuranceType;
        this.coverageAmount = coverageAmount;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getPolicyHolderName() {
        return policyHolderName;
    }

    public void setPolicyHolderName(String policyHolderName) {
        this.policyHolderName = policyHolderName;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public double getCoverageAmount() {
        return coverageAmount;
    }

    public void setCoverageAmount(double coverageAmount) {
        this.coverageAmount = coverageAmount;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyNumber=" + policyNumber +
                ", policyHolderName='" + policyHolderName + '\'' +
                ", insuranceType='" + insuranceType + '\'' +
                ", coverageAmount=" + coverageAmount +
                '}';
    }
}
