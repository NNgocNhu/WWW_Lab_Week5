package iuh.edu.vn.www_lab_week5.backend.repositories;

import iuh.edu.vn.www_lab_week5.backend.models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long> {
}