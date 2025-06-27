import java.util.ArrayList;

public class PolicyManager {
    private ArrayList<Policy> policies = new ArrayList<>();


    public void addPolicy(Policy policy) {
        policies.add(policy);
        System.out.println("Policy added successfully.");
    }


    public void removePolicy(int policyNumber) {
        boolean removed = policies.removeIf(p -> p.getPolicyNumber() == policyNumber);
        if (removed) {
            System.out.println("Policy removed successfully.");
        } else {
            System.out.println("Policy not found.");
        }
    }


    public void updatePolicy(int policyNumber, String newName, String newType, double newAmount) {
        for (Policy p : policies) {
            if (p.getPolicyNumber() == policyNumber) {
                p.setPolicyHolderName(newName);
                p.setInsuranceType(newType);
                p.setCoverageAmount(newAmount);
                System.out.println("Policy updated successfully.");
                return;
            }
        }
        System.out.println("Policy not found.");
    }


    public void listPoliciesByType(String type) {
        boolean found = false;
        for (Policy p : policies) {
            if (p.getInsuranceType().equalsIgnoreCase(type)) {
                System.out.println(p);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No policies found for type: " + type);
        }
    }


    public void listAllPolicies() {
        if (policies.isEmpty()) {
            System.out.println("No policies available.");
        } else {
            for (Policy p : policies) {
                System.out.println(p);
            }
        }
    }
}
