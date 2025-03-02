package com.voting.entity;

import lombok.Getter;

@Getter
public class Voter {
    private String voterId;
    private String voterName;
    public VotingBooth votingBooth;

    public Voter(String voterId, String voterName) {
        this.voterId = voterId;
        this.voterName = voterName;
    }

    public VotingBooth getVotingBooth() {
        return votingBooth;
    }

    public void setVotingBooth(VotingBooth votingBooth) {
        this.votingBooth = votingBooth;
    }

    @Override
    public String toString() {
        return "Voter{" +
                "voterId='" + voterId + '\'' +
                ", voterName='" + voterName + '\'' +
                ", votingBooth=" + votingBooth +
                '}';
    }
}
