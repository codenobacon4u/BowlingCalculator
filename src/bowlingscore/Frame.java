package bowlingscore;

public class Frame {
	public int[] scores = new int[3];
	private int[] lastFrame = new int[3];
	public boolean isStrike = false;
	public boolean isSpare = false;
	public int total;
	
	public Frame() {}
	
	public void setScore(int score1, int score2) {
		scores[0] = score1;
		scores[1] = score2;
		if (scores[0] == 10) {
			isStrike = true;
		} else if (scores[0] + scores[1] == 10) {
			isSpare = true;
		}
		scores[2] = scores[0] + scores[1];
		total = scores[2];
	}
	
	public void addScore(int score1, int score2) {
		scores[0] = score1;
		scores[1] = score2;
		scores[2] = scores[0] + scores[1];
		total = scores[2];
	}
	
	public void addScore(int[] scores) {
		this.scores[0] = scores[0];
		this.scores[1] = scores[1];
		scores[2] = scores[0] + scores[1];
		total = scores[2];
	}
	
	public void setLastFrame(int score1, int score2, int score3) {
		lastFrame[0] = score1;
		lastFrame[1] = score2;
		lastFrame[2] = score3;
		total = lastFrame[0] + lastFrame[1] + lastFrame[2];
	}
	
	public Frame getFrame() {
		return this;
	}
	
	public String toString() {
		return total+"";
	}
}
