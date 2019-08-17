package pl.ncdc.billiard.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class IndividualTraining {
	@Id
	private long id;
	
	private String difficultyLvl;
	
	private String positionOfWhiteBall;
	
	private String positionOfSelectedBall;
	
	private String positionsOfDisturbBalls;
	
	private String positionOfRectangle;
	
	private int idPocket;


	public IndividualTraining( String difficultyLvl, String positionOfWhiteBall, String positionOfSelectedBall,
			String positionsOfDisturbBalls, String positionOfRectangle, int idPocket) {
		this.difficultyLvl = difficultyLvl;
		this.positionOfWhiteBall = positionOfWhiteBall;
		this.positionOfSelectedBall = positionOfSelectedBall;
		this.positionsOfDisturbBalls = positionsOfDisturbBalls;
		this.positionOfRectangle = positionOfRectangle;
		this.idPocket = idPocket;
	}
	
	public IndividualTraining() {

	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDifficultyLvl() {
		return difficultyLvl;
	}

	public void setDifficultyLvl(String difficultyLvl) {
		this.difficultyLvl = difficultyLvl;
	}

	public String getPositionOfWhiteBall() {
		return positionOfWhiteBall;
	}

	public void setPositionOfWhiteBall(String positionOfWhiteBall) {
		this.positionOfWhiteBall = positionOfWhiteBall;
	}

	public String getPositionOfSelectedBall() {
		return positionOfSelectedBall;
	}

	public void setPositionOfSelectedBall(String positionOfSelectedBall) {
		this.positionOfSelectedBall = positionOfSelectedBall;
	}

	public String getPositionsOfDisturbBalls() {
		return positionsOfDisturbBalls;
	}

	public void setPositionsOfDisturbBalls(String positionsOfDisturbBalls) {
		this.positionsOfDisturbBalls = positionsOfDisturbBalls;
	}

	public String getPositionOfRectangle() {
		return positionOfRectangle;
	}

	public void setPositionOfRectangle(String positionOfRectangle) {
		this.positionOfRectangle = positionOfRectangle;
	}

	public int getIdPocket() {
		return idPocket;
	}

	public void setIdPocket(int idPocket) {
		this.idPocket = idPocket;
	}
	
	
	
	
}
