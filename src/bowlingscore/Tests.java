package bowlingscore;

public class Tests {
	public static void main(String[] args) {
		Game game1 = new Game();
		game1.setFrame(0, 10, 0);// 7 /
		game1.setFrame(1, 10, 0);// 3 3
		game1.setFrame(2, 10, 0);// 2 3
		game1.setFrame(3, 10, 0);// 2 /
		game1.setFrame(4, 10, 0);// 2 5
		game1.printScoreboard();
		game1.setFrame(5, 10, 0);// 2 3
		game1.setFrame(6, 10, 0);// 7 /
		game1.setFrame(7, 10, 0);// 7 /
		game1.setFrame(8, 10, 0);// 7 /
		game1.setFrame(9, 10, 10);// 2 3 0
		game1.setLastBall(10);
		game1.printScores();
		//game1.printScoreboard();
		System.out.println("\nScore: " + game1.totalPoints());
		System.out.println("========================================");
		Game game2 = new Game();
		game2.setFrame(0, 7, 3);// 7 /
		game2.setFrame(1, 7, 3);// 7 /
		game2.setFrame(2, 7, 3);// 7 /
		game2.setFrame(3, 7, 3);// 7 /
		game2.setFrame(4, 7, 3);// 7 /
		game2.printScoreboard();
		game2.setFrame(5, 7, 3);// 7 /
		game2.setFrame(6, 7, 3);// 7 /
		game2.setFrame(7, 7, 3);// 7 /
		game2.setFrame(8, 7, 3);// 7 /
		game2.setFrame(9, 7, 3);// 7 /
		game2.setLastBall(7);
		game2.printScores();
		System.out.println("\nScore: " + game2.totalPoints());
		System.out.println("========================================");
		Game game3 = new Game();
		game3.setFrame(0, 10, 0);//  2 5
		game3.setFrame(1, 7, 3);//  6 3
		game3.setFrame(2, 9, 0);// x
		game3.setFrame(3, 10, 0);//  2 3
		game3.setFrame(4, 0, 8);//  5 3
		game3.setFrame(5, 8, 2);//  9 /
		game3.setFrame(6, 0, 6);//  5 3
		game3.printScoreboard();
		game3.setFrame(7, 10, 0);//  2 4
		game3.setFrame(8, 10, 0);//  9 0
		game3.setFrame(9, 10, 8);//  4 3
		game3.setLastBall(1);
		game3.printScores();
		System.out.println("\nScore: " + game3.totalPoints());
		System.out.println("========================================");
		Game game4 = new Game();
		game4.setFrame(0, 10, 0);//  2 5
		game4.setFrame(1, 7, 3);//  6 3
		game4.setFrame(2, 9, 0);// x
		game4.setFrame(3, 10, 0);//  2 3
		game4.setFrame(4, 0, 8);//  5 3
		game4.setFrame(5, 8, 2);//  9 /
		game4.setFrame(6, 0, 6);//  5 3
		game4.setFrame(7, 10, 0);//  2 4
		game4.setFrame(8, 10, 0);//  9 0
		game4.setFrame(9, 7, 2);//  4 3
		game4.setLastBall(1);
		game4.printScores();
		game4.printScoreboard();
		System.out.println("\nScore: " + game4.totalPoints());
		System.out.println("========================================");
	}
}
