package org.jsp.ams_backend.repository;

import org.jsp.ams_backend.model.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentRepository  extends JpaRepository<Assignment, Long> {
}
