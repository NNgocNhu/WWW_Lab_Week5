package iuh.edu.vn.www_lab_week5.backend.repositories;

import iuh.edu.vn.www_lab_week5.backend.ids.JobSkillID;
import iuh.edu.vn.www_lab_week5.backend.models.JobSkill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSkillRepository extends JpaRepository<JobSkill, JobSkillID> {
}