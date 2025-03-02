package com.voting.service;

import com.voting.entity.VotingBooth;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class VotingBoothManagerService {
    List<VotingBooth> votingBoothList;

    public VotingBoothManagerService() {
        votingBoothList=new ArrayList<>();
    }
    public void addVotingBooth(VotingBooth votingBooth){
        votingBoothList.add(votingBooth);
    }
    public void addAllVotingBooth(List<VotingBooth> votingBooths){
        votingBoothList.addAll(votingBooths);
    }
    public void removeVotingBooth(VotingBooth votingBooth){
        votingBoothList.remove(votingBooth);
    }
}
