package com.voting.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Voter implements VotingComponent{
    private String voterId;
    private String voterName;
    public VotingBooth votingBooth;

    public Voter(String voterId, String voterName,VotingBooth votingBooth) {
        this.voterId = voterId;
        this.voterName = voterName;
        this.votingBooth=votingBooth;
    }

    @Override
    public String toString() {
        return "Voter{" +
                "voterId='" + voterId + '\'' +
                ", voterName='" + voterName + '\'' +
                ", votingBooth=" + votingBooth +
                '}';
    }

    @Override
    public void showDetails() {
        System.out.println("Voter: "+this);
    }
}
