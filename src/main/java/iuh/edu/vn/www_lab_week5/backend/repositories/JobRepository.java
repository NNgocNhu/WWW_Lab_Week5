package iuh.edu.vn.www_lab_week5.backend.repositories;

import iuh.edu.vn.www_lab_week5.backend.models.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}