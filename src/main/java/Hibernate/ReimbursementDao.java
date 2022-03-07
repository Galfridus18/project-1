package Hibernate;

import java.util.List;

public interface ReimbursementDao {
    void addReimbursement(Reimbursement reimbursement);
    void updateReimbursement(Reimbursement reimbursement);
    void deleteReimbursement(int id);
    List<Reimbursement> getEmployees();
    Reimbursement getReimbursementById(int id);
}
