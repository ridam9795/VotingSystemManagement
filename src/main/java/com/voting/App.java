package com.voting;

import com.voting.entity.Candidate;
import com.voting.entity.Voter;
import com.voting.entity.VotingComponent;
import com.voting.entity.VotingBooth;
import com.voting.serviceImpl.VotingComponentService;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        VotingComponentService votingComponentService=new VotingComponentService();

        VotingComponent sarnath=new VotingBooth("Sarnath");
        VotingComponent rajghat=new VotingBooth("Rajghat");
        VotingComponent dlw=new VotingBooth("DLW");
        votingComponentService.addAllVotingComponents(Arrays.asList(sarnath,rajghat,dlw));


        VotingComponent arun=new Voter("1","arun");
        VotingComponent varun=new Voter("2","varun");
        VotingComponent tarun=new Voter("3","tarun");
        VotingComponent karan=new Voter("4","karan");
        VotingComponent akhil=new Voter("5","akhil");
        VotingComponent ram=new Voter("6","ram");
        VotingComponent modi=new Voter("7","Modi");
        VotingComponent yogi=new Voter("8","Yogi");
        VotingComponent akhilesh=new Voter("9","Akhilesh");

        ((Voter) arun).setVotingBooth((VotingBooth) sarnath);
        ((Voter) varun).setVotingBooth((VotingBooth) sarnath);
        ((Voter) tarun).setVotingBooth((VotingBooth) rajghat);
        ((Voter) karan).setVotingBooth((VotingBooth) rajghat);
        ((Voter) akhil).setVotingBooth((VotingBooth) rajghat);
        ((Voter) ram).setVotingBooth((VotingBooth) dlw);
        ((Voter) modi).setVotingBooth((VotingBooth) sarnath);
        ((Voter) yogi).setVotingBooth((VotingBooth) rajghat);
        ((Voter) akhilesh).setVotingBooth((VotingBooth) dlw);

        List<VotingComponent> votersList=Arrays.asList(akhilesh,modi,yogi,arun,varun,tarun,karan,akhil,ram);
        votingComponentService.addAllVotingComponents(votersList);


        VotingComponent candidateModi=new Candidate((Voter) modi,"c-modi");
        VotingComponent candidateYogi=new Candidate((Voter) yogi,"c-yogi");
        VotingComponent candidateAkhilesh=new Candidate((Voter) akhilesh,"c-akhilesh");
        List<VotingComponent> candidateList=Arrays.asList(candidateModi,candidateYogi,candidateAkhilesh);
        votingComponentService.addAllVotingComponents(candidateList);

        System.out.println("--------------------------- Voting components -----------------------");
        votingComponentService.showDetails();
        System.out.println("Voting List :"+votingComponentService.fetchList(Voter.class));
        System.out.println("Candidate List :"+votingComponentService.fetchList(Candidate.class));
        System.out.println("Voting Booth List :"+votingComponentService.fetchList(VotingBooth.class));



        //-------------------------------------------------------------------------------
//        VotingBoothManagerService votingBoothManagerService=new VotingBoothManagerService();
//        VotingBooth sarnath=new VotingBooth("Sarnath");
//        VotingBooth rajghat=new VotingBooth("Rajghat");
//        VotingBooth dlw=new VotingBooth("DLW");
//        votingBoothManagerService.addAllVotingBooth(Arrays.asList(sarnath,rajghat,dlw));
//
//        //VoterManger
//        VoterManagerService voterManagerService=new VoterManagerService();
//        Voter arun=new Voter("1","arun");
//        Voter varun=new Voter("2","varun");
//        arun.setVotingBooth(sarnath);
//        varun.setVotingBooth(sarnath);
//
//        Voter tarun=new Voter("3","tarun");
//        Voter karan=new Voter("4","karan");
//        Voter akhil=new Voter("5","akhil");
//        tarun.setVotingBooth(rajghat);
//        karan.setVotingBooth(rajghat);
//        akhil.setVotingBooth(rajghat);
//
//
//        Voter ram=new Voter("6","ram");
//        ram.setVotingBooth(dlw);
//
//        Voter modi=new Voter("7","Modi");
//        Voter yogi=new Voter("8","Yogi");
//        Voter akhilesh=new Voter("9","Akhilesh");
//        modi.setVotingBooth(sarnath);
//        yogi.setVotingBooth(rajghat);
//        akhilesh.setVotingBooth(dlw);
//
//        List<Voter> voters=Arrays.asList(akhilesh,modi,yogi,arun,varun,tarun,karan,akhil,ram);
//        voterManagerService.addAllVoters(voters);
//
//
//      CandidateManagerService candidateManagerService=new CandidateManagerService();
//        Candidate candidateModi=new Candidate(modi,"c-modi");
//        Candidate candidateYogi=new Candidate(yogi,"c-yogi");
//        Candidate candidateAkhilesh=new Candidate(akhilesh,"c-akhilesh");
//
//        candidateManagerService.addAllCandidate(Arrays.asList(candidateModi,candidateYogi,candidateAkhilesh));
//
//
//
//        System.out.println("All Votings booths "+votingBoothManagerService.getVotingBoothList());
//        System.out.println("All Candidates  "+candidateManagerService.getCandidateList());
//        System.out.println("All Voters "+voterManagerService.getVoterList());
//-------------------------------------------------------------------------------------------










    }
}
