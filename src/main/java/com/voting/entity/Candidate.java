package com.voting.entity;

import lombok.Getter;

@Getter
public class Candidate{
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
}
