package com.cau.issuemanagement.issuestation.Repository;

import com.cau.issuemanagement.issuestation.Entity.IssueEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository<IssueEntity, Integer> {
}
