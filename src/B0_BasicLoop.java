public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        //columnOfSmallSquares();
        //fitness();
        gridOfSmallSquares();

    }

    public void rowOfSmallSquares() {
        //in this method, create a long row of 10 pixel by 10 pixel squares
        plane.trailWidth = 5;
    }
        public void columnOfSmallSquares () {
            plane.trailWidth = 5;
            for (int y = 0; y < 500; y = y + 10) {
                System.out.println(y);
                plane.teleport(300, y+10);
                plane.square(10);
            }


        }
        public void gridOfSmallSquares () {
        plane.pausetime = 0;
        plane.trailWidth = 5;
        for(int x=0; x<1000;x=x+10){
            for(int y=0;y<1000;y=y+10) {
                System.out.println("x:"+x+",y:"+y);
                plane.teleport(y+10, x+10);
                plane.setColor(230, x*1/5, 230);
                plane.square(10);

            }
            }
        }



        public void fitness() {
            for (int s = 0; s < 5; s = s + 1) {
                System.out.println("sprint" + s);
                for(int p=0; p<10; p=p+1){
                    System.out.println("-pushup" + p);
                }

            }
        }
    }
