package com.voting.service;

import com.voting.entity.Candidate;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class CandidateManagerService {
    private List<Candidate> candidateList;

    public CandidateManagerService() {
        this.candidateList = new ArrayList<>();
    }
    public void addCandidate(Candidate candidate){
        candidateList.add(candidate);
    }
    public void addAllCandidate(List<Candidate> candidates){
        candidateList.addAll(candidates);
    }
    public void removeCandidate(Candidate candidate){
        candidateList.remove(candidate);
    }
}
