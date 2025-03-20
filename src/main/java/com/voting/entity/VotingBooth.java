package com.voting.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VotingBooth implements VotingComponent {
    private String votingBoothId;

    public VotingBooth(String votingBoothId) {
        this.votingBoothId = votingBoothId;

    }

    @Override
    public String toString() {
        return "VotingBooth{" +
                "votingBoothId='" + votingBoothId + '\'' +
                '}';
    }
    @Override
    public void showDetails() {
        System.out.println("VotingBooth: "+this);
    }
}
