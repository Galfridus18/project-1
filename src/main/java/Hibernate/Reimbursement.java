package Hibernate;

import jakarta.persistence.*;

@Entity
public class Reimbursement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int transactionId;
    double amount;
    String status;
    Employee employee;

    public Reimbursement() {
    }

    public Reimbursement(int transactionId, double amount, String status, Employee employee) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.status = status;
        this.employee = employee;
    }

    public Reimbursement(double amount, String status, Employee employee) {
        this.amount = amount;
        this.status = status;
        this.employee = employee;
    }

    public void approveReimbursement(double amount){
        if (amount>0) {
            employee.setReimbursementStatus("Approved");
            employee.setReimbursement(amount);
        }
    }

    public void denyReimbursement(){
        employee.setReimbursementStatus("Denied");
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
