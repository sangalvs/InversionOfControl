package ioc.example;

public class GameService {
	Score score = DependencyInjection.getScore();
	
	public void playTheGame(String clientGesture) {
		if (clientGesture.equals("scissors") || clientGesture.equals("Scissors")) {
			score.win = true;
		}
		if (clientGesture.equals("paper") || clientGesture.equals("Paper")) {
			score.tie = true;
		}
		if (clientGesture.equals("rock") || clientGesture.equals("Rock") ) {
			score.loss = true;
		}
	}
}

