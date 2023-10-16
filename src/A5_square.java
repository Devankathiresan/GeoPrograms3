public class A5_square extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {


        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.pausetime = 2;
        plane.setColor(200, 0, 0);

        plane.startingAngle(90);
        square();
        plane.teleport(500,500);
        house();
        plane.teleport(900, 0);
        sun();
        plane.teleport(0,681);
        grass();
        fives();
        countdown();


        }





    public void square() {
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(200, 0, 0);
        plane.move(111);
        plane.turn(90);
        plane.setColor(0, 200, 0);
        plane.move(111);
        plane.turn(90);
        plane.setColor(0, 0, 200);
        plane.move(111);
        plane.turn(90);
        plane.setColor(77, 66, 55);
        plane.move(111);
        plane.turn(90);
    }
    public void house() {
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.move(111);
        plane.turn(90);
        plane.move(111);
        plane.turn(90);
        plane.move(111);
        plane.turn(90);
        plane.move(111);
        plane.startingAngle(0);
        plane.move(111);
        plane.turn(120);
        plane.move(111);
        plane.turn(120);
        plane.move(111);

    }

    public void sun(){
        plane.isTrail = true;
        plane.startingAngle(90);
        plane.setColor(245,232,93);
        plane.trailWidth = 100;
        plane.move(5);

    }

    public void grass(){
        plane.isTrail = true;
        plane.startingAngle(360);
        plane.setColor(0,232,0);
        plane.move(1000);


    }

    public void fives() {
        for (int i = 5; i <= 35; i = i + 5) {
            System.out.println(i);
            plane.startingAngle(0);
            plane.house(i);
        }
    }

        public void countdown() {
            for (int i = 7; i >= 2; i = i -1) {
                System.out.println(i);
                plane.startingAngle(0);
                plane.house(i);
            }
        }



}


/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- setColor(int r, int g, int b)
   setColor() sets the color of the plane's trail.
   plane.setColor(0, 0, 255); sets the color of the plane's trail to blue.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.
   
- turn(int x)
   turn() rotates the plane left by the number of degrees specified in the parameter.
   plane.turn(50); will turn the plane left 50 degrees.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.
   
- int trailWidth
   trailWidth controls the width of the trail left by the plane.
   plane.trailWidth = 10; sets the width of the trail to 10.

*/