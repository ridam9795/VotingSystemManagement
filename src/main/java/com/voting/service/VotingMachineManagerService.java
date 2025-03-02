package com.voting.service;

import com.voting.entity.Voter;
import com.voting.entity.VotingMachine;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class VotingMachineManagerService {
    private List<VotingMachine> votingMachineList;

    public VotingMachineManagerService() {
        votingMachineList=new ArrayList<>();
    }
    public void addVotingMachine(VotingMachine votingMachine){
        votingMachineList.add(votingMachine);
    }
    public void removeVotingMachine(VotingMachine votingMachine){
        votingMachineList.remove(votingMachine);
    }
}
