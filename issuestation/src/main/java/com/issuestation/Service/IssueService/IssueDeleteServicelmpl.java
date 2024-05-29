package com.issuestation.Service.IssueService;

import com.issuestation.Entity.Issue;
import com.issuestation.Repository.IssueRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class IssueDeleteServicelmpl implements IssueDeleteService {

    private final IssueRepository issueRepository;

    @Override
    @Transactional
    public void deleteIssue(long issueId) {
        Issue issue = issueRepository.findById(issueId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid issue ID"));
        issueRepository.delete(issue);
    }
}