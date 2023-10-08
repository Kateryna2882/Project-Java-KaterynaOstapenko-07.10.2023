package participants;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = {
                new Human(" Den ", 150, 1, true),
                new Cat(" Tom ", 200, 2, true),
                new Robot(" Verter ", 300, 3, true)
        };
        Obstacle[] obstacles = {
                new Racetrack(100),
                new Wall(1),
                new Racetrack(200),
                new Wall(2),
        };
        for (Obstacle obstacle : obstacles) {
            for (Participant participant : participants) {
                participant.overcomeObstacle(obstacle);
            }
        }
    }
}

