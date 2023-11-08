package iuh.edu.vn.www_lab_week5.backend.ids;

import iuh.edu.vn.www_lab_week5.backend.models.Candidate;
import iuh.edu.vn.www_lab_week5.backend.models.Skill;

import java.io.Serializable;
import java.util.Objects;

public class CandidateSkillID implements Serializable {
    private Skill skill;
    private Candidate candidate;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CandidateSkillID that = (CandidateSkillID) o;

        if (!skill.equals(that.skill)) return false;
        return candidate.equals(that.candidate);
    }

    @Override
    public int hashCode() {
        int result = skill.hashCode();
        result = 31 * result + candidate.hashCode();
        return result;
    }
}
