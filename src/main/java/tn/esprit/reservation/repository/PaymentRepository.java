package tn.esprit.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.reservation.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Long> {
}
