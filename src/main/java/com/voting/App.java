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
        String key="UP"+"-"+"Varanasi";
        VotingComponentService varanasiVotingService=new VotingComponentService(key);

        VotingBooth sarnath=new VotingBooth("Sarnath");
        VotingBooth rajghat=new VotingBooth("Rajghat");
        VotingBooth dlw=new VotingBooth("DLW");
        varanasiVotingService.addAllVotingComponents(Arrays.asList(sarnath,rajghat,dlw));


        Voter arun=new Voter("1","arun");
        Voter varun=new Voter("2","varun");
        Voter tarun=new Voter("3","tarun");
        Voter karan=new Voter("4","karan");
        Voter akhil=new Voter("5","akhil");
        Voter ram=new Voter("6","ram");
        Voter modi=new Voter("7","Modi");
        Voter yogi=new Voter("8","Yogi");
        Voter akhilesh=new Voter("9","Akhilesh");

        arun.setVotingBooth(sarnath);
        varun.setVotingBooth(sarnath);
        tarun.setVotingBooth(rajghat);
        karan.setVotingBooth(rajghat);
        akhil.setVotingBooth(rajghat);
        ram.setVotingBooth(dlw);
        modi.setVotingBooth(sarnath);
        yogi.setVotingBooth(rajghat);
        akhilesh.setVotingBooth(dlw);

        List<VotingComponent> votersList=Arrays.asList(akhilesh,modi,yogi,arun,varun,tarun,karan,akhil,ram);
        varanasiVotingService.addAllVotingComponents(votersList);


        Candidate candidateModi=new Candidate(modi,"c-modi");
        Candidate candidateYogi=new Candidate( yogi,"c-yogi");
        Candidate candidateAkhilesh=new Candidate(akhilesh,"c-akhilesh");
        List<VotingComponent> candidateList=Arrays.asList(candidateModi,candidateYogi,candidateAkhilesh);
        varanasiVotingService.addAllVotingComponents(candidateList);

        System.out.println("--------------------------- Voting components -----------------------");
        System.out.println("Voting place "+varanasiVotingService.getVotingPlaceId());
        varanasiVotingService.showDetails();
        System.out.println("Voting List :"+varanasiVotingService.fetchList(Voter.class));
        System.out.println("Candidate List :"+varanasiVotingService.fetchList(Candidate.class));
        System.out.println("Voting Booth List :"+varanasiVotingService.fetchList(VotingBooth.class));



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
