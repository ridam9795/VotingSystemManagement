package com.voting.serviceImpl;

import com.voting.entity.VotingComponent;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VotingComponentService implements VotingComponent {
    String votingPlaceId;
    List<VotingComponent> votingComponentList;

    public VotingComponentService(String votingPlaceId) {
        this.votingComponentList = new ArrayList<>();
        this.votingPlaceId=votingPlaceId;

    }

    public void addVotingComponent(VotingComponent votingComponent){
        votingComponentList.add(votingComponent);
    }
    public void addAllVotingComponents(List<VotingComponent> votingComponents){
        votingComponentList.addAll(votingComponents);
    }

    @Override
    public void showDetails() {
        for(VotingComponent votingComponent:votingComponentList){
            votingComponent.showDetails();
        }
    }

    public List<VotingComponent> fetchList(Class<?> votingComponentClass) {
        return votingComponentList.stream().filter(votingComponentClass::isInstance)
                .collect(Collectors.toList());
    }
}
