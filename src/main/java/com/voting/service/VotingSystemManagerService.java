package com.voting.service;

import com.voting.entity.Candidate;
import com.voting.entity.Voter;
import com.voting.entity.VotingBooth;
import lombok.Getter;

import java.util.List;
@Getter
public class VotingSystemManagerService {
   private VotingBoothManagerService votingBoothManagerService;
   private VoterManagerService voterManagerService;
   private CandidateManagerService candidateManagerService;

    public VotingSystemManagerService(VotingBoothManagerService votingBoothManagerService, VoterManagerService voterManagerService, CandidateManagerService candidateManagerService) {
        this.votingBoothManagerService = votingBoothManagerService;
        this.voterManagerService = voterManagerService;
        this.candidateManagerService = candidateManagerService;
    }

    public List<Voter> getAllVoters(){
       return voterManagerService.getVoterList();
   }
   public List<Candidate> getAllCandidates(){
       return candidateManagerService.getCandidateList();
   }
   public List<VotingBooth> getAllVotingBooths(){
       return votingBoothManagerService.getVotingBoothList();
   }

}
