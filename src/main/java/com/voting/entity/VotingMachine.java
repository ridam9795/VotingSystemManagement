package com.voting.entity;

import lombok.Getter;

@Getter
public class VotingMachine {
    private String votingMachineId;
    private VotingBooth votingBooth;

    public VotingMachine(String votingMachineId) {
        this.votingMachineId = votingMachineId;
    }

    public VotingBooth getVotingBooth() {
        return votingBooth;
    }

    public void setVotingBooth(VotingBooth votingBooth) {
        this.votingBooth = votingBooth;
    }

    @Override
    public String toString() {
        return "VotingMachine{" +
                "votingMachineId='" + votingMachineId + '\'' +
                ", votingBooth=" + votingBooth +
                '}';
    }
}
