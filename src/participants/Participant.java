package participants;

abstract class Participant {
    String name;
    int maxLengthRun;
    int maxHeightJump;
    boolean disqualification;


    public boolean run(int distance) {
        if (distance <= maxLengthRun) {
            System.out.println(name + " passed the distance " + distance + " meters. ");
            return true;
        } else {
            disqualification = true;
            System.out.println(name + " could not passed the distance " + distance + " meters. ");
            return false;
        }
    }
    public boolean jump( int height){
        if(height <= maxHeightJump){
            System.out.println(name + " jumped high " + height + " meters. ");
            return true;
        } else {
            disqualification = true;
            System.out.println(name + " could not jump high " + height + " meters. ");
            return false;
        }
    }
    public void overcomeObstacle(Obstacle obstacle){
        obstacle.overcome(this);

    }
    public Participant(String name, int maxLengthRun,
                       int maxHeightJump, boolean disqualification) {
        this.name = name;
        this.maxLengthRun = maxLengthRun;
        this.maxHeightJump = maxHeightJump;
        this.disqualification = false;
    }
}
