

public class A4_howITurn extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(200, 0, 0);
        plane.move(100);
        plane.turn(120);
        plane.setColor(0, 200, 0);
        plane.move(100);
        plane.turn(120);
        plane.setColor(255, 200, 180);
        plane.move(100);
        plane.turn(60);
        plane.setColor(5, 200, 150);
        plane.startingAngle(360);
        plane.isTrail = false;
        plane.move(300);
        plane.isTrail = true;
        plane.move(100);
        plane.turn(72);
        plane.move(100);
        plane.turn(72);
        plane.move(100);
        plane.turn(72);
        plane.move(100);
        plane.turn(72);
        plane.move(100);
        plane.turn(72);
        plane.isTrail = false;
        plane.startingAngle(90);
        plane.move(300);
        plane.isTrail= true;
        plane.setColor(90, 150, 200);
        plane.move(100);
        plane.turn(60);
        plane.move(100);
        plane.turn(60);
        plane.move(100);
        plane.turn(60);
        plane.move(100);
        plane.turn(60);
        plane.move(100);
        plane.turn(60);
        plane.move(100);







    }


}
