package com.voting.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VotingMachine implements VotingComponent{
    private String votingMachineId;
    private VotingBooth votingBooth;

    public VotingMachine(String votingMachineId) {
        this.votingMachineId = votingMachineId;
    }

    @Override
    public String toString() {
        return "VotingMachine{" +
                "votingMachineId='" + votingMachineId + '\'' +
                ", votingBooth=" + votingBooth +
                '}';
    }
    @Override
    public void showDetails() {
        System.out.println("VotingMachine: "+this);
    }

}
