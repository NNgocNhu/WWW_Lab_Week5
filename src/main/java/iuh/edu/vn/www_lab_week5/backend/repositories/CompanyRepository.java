package iuh.edu.vn.www_lab_week5.backend.repositories;

import iuh.edu.vn.www_lab_week5.backend.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}