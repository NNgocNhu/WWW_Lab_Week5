package iuh.edu.vn.www_lab_week5.backend.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
@Table(name = "experience")
public class Experience {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exp_id")
    private long id;
    @Column(name = "company",nullable = false, length = 120)
    private String companyName;
    @Column(name = "from_date",nullable = false)
    private LocalDate fromDate;
    @Column(name = "to_date",nullable = false)
    private LocalDate toDate;
    @Column(name = "role",nullable = false, length = 100)
    private String role;
    @Column(name = "work_desc",nullable = false, length = 400)
    private String workDescription;
    @ManyToOne(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "can_id")
    private Candidate candidate;

    public Experience(String companyName, LocalDate fromDate, LocalDate toDate, String role, String workDescription, Candidate candidate) {
        this.companyName = companyName;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.role = role;
        this.workDescription = workDescription;
        this.candidate = candidate;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                ", role='" + role + '\'' +
                ", workDescription='" + workDescription + '\'' +
                ", candidate=" + candidate +
                '}';
    }
}
