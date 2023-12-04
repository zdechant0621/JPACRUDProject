package com.skilldistillery.fiftystatesfootball.data;

import java.util.List;

import org.springframework.stereotype.Service;

import com.skilldistillery.fiftystatesfootball.entities.FiftyStatesFootball;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Service
@Transactional
public class FiftyStatesFootballDAOImpl implements FiftyStatesFootballDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	
	
	public FiftyStatesFootballDAOImpl() {
	}

	@Override
	public FiftyStatesFootball findById(int footballId) {
		return em.find(FiftyStatesFootball.class, footballId);
		
	}

	@Override
	public List<FiftyStatesFootball> findAll() {
		String jpql = "SELECT allteams FROM FiftyStatesFootball allteams";
		return em.createQuery(jpql, FiftyStatesFootball.class).getResultList();
	}

	@Override
	public FiftyStatesFootball create(FiftyStatesFootball team) {	
		em.persist(team);
		return team;
	}

	@Override
	public FiftyStatesFootball update(int footballId, FiftyStatesFootball team) {
		FiftyStatesFootball teamFound = em.find(FiftyStatesFootball.class, footballId);
		if (teamFound != null) {
			teamFound.setId(teamFound.getId());;
			teamFound.setName(teamFound.getName());
			teamFound.setCapitalCity(teamFound.getCapitalCity());
			teamFound.setStadiumName(teamFound.getStadiumName());
			teamFound.setYearAdmitted(teamFound.getYearAdmitted());
			teamFound.setHeadCoachName(teamFound.getHeadCoachName());
		}	
		return teamFound;
	}

	@Override
	public boolean deleteById(int footballId) {
		FiftyStatesFootball deletedTeam = em.find(FiftyStatesFootball.class, footballId);
		boolean successfullDeletedTeam = false;
		if (deletedTeam != null) {
			em.remove(deletedTeam);
			successfullDeletedTeam =!em.contains(deletedTeam);
		}
		return successfullDeletedTeam;
	}

}
