package ioc.example;

public class DependencyInjection {
	public static Score getScore() {
		return new Score();
	}
	
	public static GameService getGameService() {
		return new GameService();
	}

}
