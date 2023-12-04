package com.skilldistillery.fiftystatesfootball.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.fiftystatesfootball.data.FiftyStatesFootballDAO;
import com.skilldistillery.fiftystatesfootball.entities.FiftyStatesFootball;

@Controller
public class FiftyStatesController {

	@Autowired
	private FiftyStatesFootballDAO fsfDAO;

	@RequestMapping("/")
	public String index(Model model) {
		List<FiftyStatesFootball> teamList = fsfDAO.findAll();
		model.addAttribute("teams", teamList);
		return "home";
	}

	@RequestMapping("/getTeam.do")
	public String getTeamById(@RequestParam("teamId") int teamId, Model model) {
		FiftyStatesFootball team = fsfDAO.findById(teamId);
		model.addAttribute("team", team);
		return "team/showTeams";
	}

	@RequestMapping("create.do")
	public String createPage() {
		return "create";
	}

	@RequestMapping("/createTeam.do")
	public String createTeam(@RequestParam("name") String name, @RequestParam("capitalCity") String capitalCity,
			@RequestParam("stadiumName") String stadiumName, @RequestParam("yearAdmitted") int yearAdmitted,
			@RequestParam("headCoachName") String headCoachName, Model model) {
		FiftyStatesFootball newTeam = new FiftyStatesFootball(name, capitalCity, stadiumName, yearAdmitted,
				headCoachName);
		model.addAttribute("team", fsfDAO.create(newTeam));
		model.addAttribute("teams", fsfDAO.findAll());
		return "home";
	}

	@RequestMapping("/update.do")
	public String updatePage(@RequestParam("teamId") int teamId, Model model) {
		FiftyStatesFootball team = fsfDAO.findById(teamId);
		model.addAttribute("team", team);
		return "update";
	}

	@RequestMapping("/updateTeam.do")
	public String showUpdateForm(@RequestParam("teamId") int teamId, @RequestParam("name") String name, @RequestParam("capitalCity") String capitalCity,
			@RequestParam("stadiumName") String stadiumName, @RequestParam("yearAdmitted") int yearAdmitted,
			@RequestParam("headCoachName") String headCoachName, Model model) {
		FiftyStatesFootball updatedTeam = new FiftyStatesFootball(name, capitalCity, stadiumName, yearAdmitted,
				headCoachName);
		fsfDAO.update(teamId, updatedTeam);
		model.addAttribute("teams", fsfDAO.findAll());
		return "redirect:/";
	}

	@RequestMapping("/deleteTeam.do")
	public String deleteTeam(@RequestParam("delete") int teamId, Model model) {
		fsfDAO.deleteById(teamId);
		model.addAttribute("teams", fsfDAO.findAll());
		return "home"; 
	}

}