package iuh.edu.vn.www_lab_week5.backend.repositories;

import iuh.edu.vn.www_lab_week5.backend.ids.CandidateSkillID;
import iuh.edu.vn.www_lab_week5.backend.models.Candidate_Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Candidate_SkillRepository extends JpaRepository<Candidate_Skill, CandidateSkillID> {
}