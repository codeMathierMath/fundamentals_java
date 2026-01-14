public class AnimatedStateEvolution {

    // Concepts demonstrated: state evolution over time, boundary conditions, animation loops, and code reuse.

    // This program extends ProceduralSpaceScene by introducing a time
    // dimension. Previously defined drawing primitives are reused while
    // object positions are updated incrementally inside an infinite loop.
    // The emphasis is on making state changes explicit rather than on
    // abstraction or generality.

    // StdDraw.java is required.

        public static void main(String[] args){
            //Produces doubles on the 'uniform' random interval [0,0.9). Choosing this range because these values
            //will be passed as inputs to determine the position of the drawings on the StdDraw window
            double x0_A = Math.random() * 0.9;
            double y0_A= Math.random() * 0.9;
            double x0_B = Math.random() * 0.9;
            double y0_B = Math.random() * 0.9;



            StdDraw.enableDoubleBuffering();
            //Creating step lengths, number of steps, and time diff
            double ds_A = 0.001;
            int dt = 20;
            int totalStepsS1 = (int) (Math.sqrt(Math.pow(0.99-x0_A , 2) + Math.pow(0.99-y0_A, 2))/ds_A);
            double ds_B = 0.001;
            int totalStepsS2 = (int) (Math.sqrt(Math.pow(0.01 - x0_B, 2) + Math.pow(0.99 - y0_B, 2))/ds_B);

            System.out.println(totalStepsS1 + " " + totalStepsS2);

            //Draws two objects in StdDraw window at randomized initial positions and iterates them endlessly over
            //linear paths in the window (back and forth).
            while(true){
                if ((x0_A >= 0.99 || x0_A <= 0.01) || (y0_A >= 0.99 || y0_A <= 0.01)){ ds_A = -ds_A;}
                if ((x0_B >= 0.99 || x0_B <= 0.01) || (y0_B >= 0.99 || y0_B <= 0.01)){ ds_B = -ds_B;}
                x0_A += ds_A;
                y0_A += ds_A;
                x0_B -= ds_B;
                y0_B += ds_B;
                StdDraw.clear();
                ProceduralSpaceScene.pulsar(x0_A,y0_A);
                ProceduralSpaceScene.ringedPlanet(x0_B,y0_B);
                StdDraw.show();
                StdDraw.pause(dt);
            }
        }
}
