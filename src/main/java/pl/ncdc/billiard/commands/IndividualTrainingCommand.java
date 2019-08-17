package pl.ncdc.billiard.commands;

import java.util.List;

import org.opencv.core.Point;

public class IndividualTrainingCommand {

		private Long id;
		
		private String difficultyLvl;
		
		private String positionOfWhiteBall;
		private String positionOfWhiteBallX;
		private String positionOfWhiteBallY;
		
		private String positionOfSelectedBall;
		private String positionOfSelectedBallX;
		private String positionOfSelectedBallY;
		
		private String positionsOfDisturbBalls;
		private String positionsOfDisturbBallsX;
		private String positionsOfDisturbBallsY;
		
		private String positionOfRectangle;
		private String positionOfRectangleX;
		private String positionOfRectangleY;
		
		private int idPocket;
		
		public IndividualTrainingCommand(){
			
		}
		
		public IndividualTrainingCommand(Long id, String difficultyLvl, String positionOfWhiteBallX,
				String positionOfWhiteBallY, String positionOfSelectedBallX, String positionOfSelectedBallY,
				String positionsOfDisturbBallsX, String positionsOfDisturbBallsY, String positionOfRectangleX,
				String positionOfRectangleY, int idPocket) {
			super();
			this.id = id;
			this.difficultyLvl = difficultyLvl;
			this.positionOfWhiteBallX = positionOfWhiteBallX;
			this.positionOfWhiteBallY = positionOfWhiteBallY;
			this.positionOfSelectedBallX = positionOfSelectedBallX;
			this.positionOfSelectedBallY = positionOfSelectedBallY;
			this.positionsOfDisturbBallsX = positionsOfDisturbBallsX;
			this.positionsOfDisturbBallsY = positionsOfDisturbBallsY;
			this.positionOfRectangleX = positionOfRectangleX;
			this.positionOfRectangleY = positionOfRectangleY;
			this.idPocket = idPocket;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getDifficultyLvl() {
			return difficultyLvl;
		}
		public void setDifficultyLvl(String difficultyLvl) {
			this.difficultyLvl = difficultyLvl;
		}
		public String getPositionOfWhiteBallX() {
			return positionOfWhiteBallX;
		}
		public void setPositionOfWhiteBallX(String positionOfWhiteBallX) {
			this.positionOfWhiteBallX = positionOfWhiteBallX;
		}
		public String getPositionOfWhiteBallY() {
			return positionOfWhiteBallY;
		}
		public void setPositionOfWhiteBallY(String positionOfWhiteBallY) {
			this.positionOfWhiteBallY = positionOfWhiteBallY;
		}
		public String getPositionOfSelectedBallX() {
			return positionOfSelectedBallX;
		}
		public void setPositionOfSelectedBallX(String positionOfSelectedBallX) {
			this.positionOfSelectedBallX = positionOfSelectedBallX;
		}
		public String getPositionOfSelectedBallY() {
			return positionOfSelectedBallY;
		}
		public void setPositionOfSelectedBallY(String positionOfSelectedBallY) {
			this.positionOfSelectedBallY = positionOfSelectedBallY;
		}
		public String getPositionsOfDisturbBallsX() {
			return positionsOfDisturbBallsX;
		}
		public void setPositionsOfDisturbBallsX(String positionsOfDisturbBallsX) {
			this.positionsOfDisturbBallsX = positionsOfDisturbBallsX;
		}
		public String getPositionsOfDisturbBallsY() {
			return positionsOfDisturbBallsY;
		}
		public void setPositionsOfDisturbBallsY(String positionsOfDisturbBallsY) {
			this.positionsOfDisturbBallsY = positionsOfDisturbBallsY;
		}
		public String getPositionOfRectangleX() {
			return positionOfRectangleX;
		}
		public void setPositionOfRectangleX(String positionOfRectangleX) {
			this.positionOfRectangleX = positionOfRectangleX;
		}
		public String getPositionOfRectangleY() {
			return positionOfRectangleY;
		}
		public void setPositionOfRectangleY(String positionOfRectangleY) {
			this.positionOfRectangleY = positionOfRectangleY;
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



