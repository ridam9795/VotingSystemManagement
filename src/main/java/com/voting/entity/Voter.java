package com.voting.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Voter {
    private String voterId;
    private String voterName;
    public VotingBooth votingBooth;

    public Voter(String voterId, String voterName) {
        this.voterId = voterId;
        this.voterName = voterName;
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
