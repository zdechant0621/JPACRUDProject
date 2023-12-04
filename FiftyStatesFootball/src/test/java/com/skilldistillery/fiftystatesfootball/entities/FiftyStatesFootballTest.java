package com.skilldistillery.fiftystatesfootball.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

class FiftyStatesFootballTest {
	private static EntityManagerFactory emf;
	private static EntityManager em;
	private FiftyStatesFootball fsf;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("FiftyStatesFootball");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		fsf = em.find(FiftyStatesFootball.class, 1);

	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		fsf = null;
	}

	@Test
	void test_FiftyStatesFootball_basic_mappings() {
		assertNotNull(fsf);
		assertEquals("Alaska Igloos", fsf.getName());
		assertEquals("Juneau", fsf.getCapitalCity());
		assertEquals("Tundra Field", fsf.getStadiumName());
		assertEquals(1959, fsf.getYearAdmitted());
		assertEquals("Ethan Smith", fsf.getHeadCoachName());

	}
}
