package participants;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    void overcome(Participant participant) {
        if (!participant.disqualification) {
            if (participant.jump(2)) {
                System.out.println(participant.name + " jumped over the wall in height "
                        + height + " meters. ");
            } else {
                System.out.println(participant.name + " could not jumped over the wall in height "
                        + height + " meters. Passed: " + participant.maxHeightJump);
            }
        }
    }

}
