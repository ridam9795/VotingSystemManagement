package com.voting.service;

import com.voting.entity.Voter;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class VoterManagerService {
    private List<Voter> voterList;


    public VoterManagerService() {
        voterList=new ArrayList<>();
    }
    public void addVoter(Voter voter){
        voterList.add(voter);
    }
    public void addAllVoters(List<Voter> voters){
        voterList.addAll(voters);
    }
    public void removeVoter(Voter voter){
        voterList.remove(voter);
    }
}
