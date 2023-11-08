package iuh.edu.vn.www_lab_week5.backend.models;

import iuh.edu.vn.www_lab_week5.backend.enums.SkillLevel;
import iuh.edu.vn.www_lab_week5.backend.ids.CandidateSkillID;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "candidate_skill")
@Data
@NoArgsConstructor
@AllArgsConstructor
@IdClass(CandidateSkillID.class)
public class Candidate_Skill {
    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;

    @Id
    @ManyToOne
    @JoinColumn(name = "can_id")
    private Candidate candidate;

    @Column(name = "skill_level", nullable = false)
    private SkillLevel skillLevel;
    @Column(name = "more_infos", length = 1000)
    private String moreInfo;

}
