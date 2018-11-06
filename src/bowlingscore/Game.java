package bowlingscore;

import java.util.ArrayList;
import java.util.List;

public class Game {
	private List<Frame> frames;
	private int lastBall;

	public Game() {
		frames = new ArrayList<Frame>(10);
	}

	public int[] getScore(int index) {
		return frames.get(index).scores;
	}

	public void setFrame(int index, int roll1, int roll2) {
		Frame curr = new Frame();
		frames.add(curr);
		curr.setScore(roll1, roll2);
		if (index == 9) {
			curr.setScore(roll1, roll2);
			if (curr.isSpare || curr.isStrike) {
				curr.setLastFrame(roll1, roll2, lastBall);
			}
		}
		update();

	}

	public void update() {
		for (int i = 1; i < frames.size(); i++) {
			calculateBonuses(i);
		}
	}

	private void calculateBonuses(int i) {
		Frame curr = frames.get(i);
		Frame prev = frames.get(i - 1);
		// if last frame was a strike
		if (prev.isStrike) {
			// add this score and next score to last score
			int score1 = curr.scores[1] + curr.scores[0];
			prev.addScore(10, score1);
			if (i > 1 && frames.get(i - 2).isStrike) {
				// add this score and next score to last score
				Frame prev2 = frames.get(i - 2);
				int score3 = curr.isSpare ? 10 + curr.scores[1] : 10 + curr.scores[0];
				prev2.addScore(10, score3);
				// if last frame was a spare
			}
			// if last frame was a spare
		} else if (prev.isSpare) {
			prev.addScore(curr.scores[0], 10);
			if (i > 1 && frames.get(i - 2).isStrike) {
				// add this score and next score to last score
				Frame prev2 = frames.get(i - 2);
				int score3 = curr.isSpare ? 10 + curr.scores[1] : 10 + curr.scores[0];
				if (i - 2 == 0)
					score3 -= curr.scores[0];
				prev2.addScore(10, score3);
				// if last frame was a spare
			}
		}
	}

	public int totalPoints() {
		int total = 0;
		for (int i = 0; i < frames.size(); i++) {
			total += frames.get(i).total;
		}
		return total;
	}

	public void printScoreboard() {
		for (int i = 0; i < frames.size(); i++) {
			if (frames.get(i).isStrike) {
				if (i < frames.size() - 1 && frames.get(i + 1).scores[1] == 0) {
					System.out.print("[ ]");
					continue;
				} else if (frames.get(i).scores[1] == 0) {
					System.out.print("[ ]");
					continue;
				}
			} else if (frames.get(i).isSpare && i == frames.size()-1) {
				System.out.print("[ ]");
				continue;
			}
			System.out.print("[" + scoreFromRange(i) + "]");
			
		}
		System.out.println();
	}

	private int scoreFromRange(int index) {
		int sum = 0;
		for (int i = 0; i <= frames.indexOf(frames.get(index)); i++) {
			sum += frames.get(i).total;
		}
		return sum;
	}

	public void printScores() {
		for (int i = 0; i < frames.size(); i++) {
			System.out.print("[" + frames.get(i).total + "]");
		}
		System.out.println();
	}

	public void setLastBall(int score) {
		lastBall = score;
		int score1 = frames.get(9).scores[0];
		int score2 = frames.get(9).scores[1];
		if (frames.get(9).isSpare || frames.get(9).isStrike)
			frames.get(9).setLastFrame(score1, score2, score);

		update();
	}
}
