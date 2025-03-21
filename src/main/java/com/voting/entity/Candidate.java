package com.voting.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Candidate implements VotingComponent{
    private String voterId;
    private String candidateId;
    private String candidateName;
    private VotingBooth votingBooth;

    public Candidate(Voter voter, String candidateId) {
        this.candidateId=candidateId;
        this.candidateName = voter.getVoterName();
        this.voterId=voter.getVoterId();
        this.votingBooth=voter.getVotingBooth();
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "voterId='" + voterId + '\'' +
                ", candidateId='" + candidateId + '\'' +
                ", candidateName='" + candidateName + '\'' +
                ", votingBooth=" + votingBooth +
                '}';
    }

    @Override
    public void showDetails() {
        System.out.println("Candidates: "+this);
    }
}
