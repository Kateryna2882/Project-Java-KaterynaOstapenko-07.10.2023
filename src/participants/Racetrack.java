package participants;

public class Racetrack extends Obstacle {
    private int length;

    public Racetrack(int length) {
        this.length = length;
    }

    @Override
    void overcome(Participant participant) {
        if (!participant.disqualification) {
            if (participant.run(200)) {
                System.out.println(participant.name + " completed the treadmill at the distance "
                        + length + "meters");
            } else {
                System.out.println(participant.name + " could not completed the treadmill at the distance "
                        + length + " meters. Passed: " + participant.maxLengthRun);
            }
        }
    }
}
