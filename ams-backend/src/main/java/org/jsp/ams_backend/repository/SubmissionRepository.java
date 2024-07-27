package org.jsp.ams_backend.repository;

import org.jsp.ams_backend.model.Submission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubmissionRepository extends JpaRepository<Submission, Long> {
}
