// java
package com.naveen.crm.candidate_crm.service;

import com.naveen.crm.candidate_crm.candidate.Candidate;
import java.util.List;

public interface CandidateService {

    Candidate saveCandidate(Candidate candidate);
    List<Candidate> getAllCandidates();
    Candidate getCandidateById(Long id);
    void deleteCandidate(Long id);
    List<Candidate> getCandidatesByStatus(String status);
    Candidate updateCandidateStatus(Long id, String newStatus);
    boolean existsByEmail(String email);
    boolean existsByPhone(String phone);

}