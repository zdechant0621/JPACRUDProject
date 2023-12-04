package com.skilldistillery.fiftystatesfootball.data;

import java.util.List;

import com.skilldistillery.fiftystatesfootball.entities.FiftyStatesFootball;

public interface FiftyStatesFootballDAO {

	FiftyStatesFootball findById(int footballId);
	List<FiftyStatesFootball> findAll();
	FiftyStatesFootball create (FiftyStatesFootball team);
	FiftyStatesFootball update (int footballId, FiftyStatesFootball team);
	boolean deleteById(int footballId);

}
