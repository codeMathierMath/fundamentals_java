public class ProceduralSpaceScene {

    // Concepts demonstrated: procedural decomposition, conditional logic,
    // and constrained randomness.

    // This program originated in early coursework and is included here as a
    // foundational example. It uses methods, random number generation, and
    // explicit conditionals to construct a simple scene composed of up to four
    // elements. The particular combination of elements is selected via a
    // simulated die roll, and each element is placed randomly within a
    // constrained region of the drawing window.

    // StdDraw.java is required.

    //Method that creates a solid black background representing space and then draws a moon
    // with random cratering.
    public static void baseLayer(double x, double y) {

        //Here for adjustments of canvas and pen size as needed
        StdDraw.setCanvasSize();
        StdDraw.setPenRadius(0.01);

        //Basic black square base layer
        StdDraw.filledSquare(0.5, 0.5, 0.5);

        //Randomly cratered moon (i.e grey circle with psuedo-random lighter spots)
        StdDraw.setPenColor(StdDraw.GRAY);
        StdDraw.filledCircle(0.4,0.5, 0.25);
        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        StdDraw.filledCircle(0.4 + x * Math.random(),0.5 + y * Math.random(), 0.02);
        StdDraw.filledCircle(0.35+ x * Math.random(),0.5 + y * Math.random(), 0.01);
        StdDraw.filledCircle(0.375 + x * Math.random(),0.6 + y * Math.random(), 0.01);
        StdDraw.filledCircle(0.5 + x * Math.random(),0.375 + y * Math.random(), 0.01);
        StdDraw.filledCircle(0.4 + x * Math.random(),0.3 + y * Math.random(), 0.02);
        StdDraw.filledCircle(0.5+ x * Math.random(),0.43 + y * Math.random(), 0.02);
        StdDraw.filledCircle(0.29 + x * Math.random(),0.5 + y * Math.random(), 0.01);
        StdDraw.filledCircle(0.55 + x * Math.random(),0.375 + y * Math.random(), 0.01);
        StdDraw.filledCircle(0.57+ x * Math.random(),0.49 + y * Math.random(), 0.03);
        StdDraw.filledCircle(0.32 + x * Math.random(),0.29 + y * Math.random(), 0.01);
        StdDraw.filledCircle(0.47 + x * Math.random(),0.375 + y * Math.random(), 0.03);
    }

    public static void starLayer(double x, double y) {
        StdDraw.setPenColor(StdDraw.YELLOW);
        StdDraw.setPenRadius(0.005);
        StdDraw.point(0.75 + x * Math.random(), 0.75 + x * Math.random());
        StdDraw.point(0.73 + x * Math.random(), 0.73 + x * Math.random());
        StdDraw.point(0.72 + x * Math.random(), 0.76 + x * Math.random());
        StdDraw.point(0.71 + x * Math.random(), 0.72 + x * Math.random());
        StdDraw.point(0.69 + x * Math.random(), 0.79 + x * Math.random());
        StdDraw.point(0.68 + x * Math.random(), 0.69 + x * Math.random());
        StdDraw.point(0.67 + x * Math.random(), 0.81 + x * Math.random());
        StdDraw.point(0.66 + x * Math.random(), 0.82 + x * Math.random());
        StdDraw.point(0.8 + x * Math.random(), 0.78 + x * Math.random());
        StdDraw.point(0.4 + x * Math.random(), 0.74 + x * Math.random());
        StdDraw.point(0.34 + x * Math.random(), 0.75 + x * Math.random());
        StdDraw.point(0.55 + x * Math.random(), 0.75 + x * Math.random());
        StdDraw.point(0.63 + x * Math.random(), 0.78 + x * Math.random());
        StdDraw.point(0.54 + x * Math.random(), 0.79 + x * Math.random());
        StdDraw.point(0.3 + x * Math.random(), 0.78 + x * Math.random());
        StdDraw.point(0.25 + x * Math.random(), 0.79 + x * Math.random());
        StdDraw.point(0.28 + x * Math.random(), 0.79 + x * Math.random());
        StdDraw.point(0.36 + x * Math.random(), 0.81 + x * Math.random());
        StdDraw.point(0.31 + x * Math.random(), 0.82 + x * Math.random());
        StdDraw.point(0.14+ x * Math.random(), 0.8 + x * Math.random());
        StdDraw.setPenRadius(0.008);
        StdDraw.point(0.16 + x * Math.random(), 0.74 + x * Math.random());
        StdDraw.point(0.21 + x * Math.random(), 0.75 + x * Math.random());
        StdDraw.point(0.75 + x * Math.random(), 0.75 + x * Math.random());
        StdDraw.point(0.73 + x * Math.random(), 0.73 + x * Math.random());
        StdDraw.point(0.72 + x * Math.random(), 0.76 + x * Math.random());
        StdDraw.point(0.71 + x * Math.random(), 0.72 + x * Math.random());
        StdDraw.point(0.69 + x * Math.random(), 0.79 + x * Math.random());
        StdDraw.point(0.68 + x * Math.random(), 0.69 + x * Math.random());
        StdDraw.point(0.67 + x * Math.random(), 0.81 + x * Math.random());
        StdDraw.point(0.66 + x * Math.random(), 0.82 + x * Math.random());
        StdDraw.point(0.8 + x * Math.random(), 0.68 + x * Math.random());
        StdDraw.point(0.82 + x * Math.random(), 0.74 + x * Math.random());
        StdDraw.point(0.84 + x * Math.random(), 0.75 + x * Math.random());


    }


    public static void ringedPlanet(double x, double y){
        StdDraw.setPenColor(StdDraw.ORANGE);
        StdDraw.filledEllipse(x , y,  0.3, 0.3);
        StdDraw.setPenColor(StdDraw.PRINCETON_ORANGE);
        StdDraw.filledCircle(x, y, 0.08);

    }

    public static void pulsar(double x, double y){
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.filledEllipse(x , y , 0.01, 0.3);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.filledEllipse(x, y,0.05, 0.1 );
    }

    public static void main(String[] args){

        //Produces a double on the 'uniform' random interval [0,0.4). Choosing this range because these values
        //will be passed as inputs to determine the position of the stars and craters on the StdDraw window, which
        //has max size 1.0, and need to stay Generally off of the moon and on top of the "moon", respectively
        // which has diameter 0.5 and center (0.4,0.5)
        double x1 = Math.random() * 0.1;
        double y1 = Math.random() * 0.1;


        //Creating a RollDie that will be used for conditionals when calling methods (or not calling them). I'll note
        //that I think the number of faces on the die should be equal to 2^(# of methods)-1 to allow me to assign every different
        // unordered combination of the methods to a die face, but when I write them all out I'm only seeing 13. So i'll provide 13 faces
        //for now given time constraints.
        int outcome = (int) (Math.random() * 13 +  1);

        //Calling four methods conditionally, based on dice rolls, that each lay down a different element to this space drawing. Each takes these random inputs
        // and uses them to generate positions on a given execution's drawing.
        //baseLayer(x1, y1);
        //starLayer(x1, y1);
        //ringedPlanet(x1, y1);
        //pulsar(x1, y1);

        if (outcome == 13) {
            baseLayer(x1, y1);
            starLayer(x1, y1);
            ringedPlanet(x1, y1);
            pulsar(x1, y1);
        }
        else if (outcome == 12){
            baseLayer(x1, y1);
            starLayer(x1, y1);
            ringedPlanet(x1, y1);
        }

        else if (outcome == 11){
            baseLayer(x1, y1);
            starLayer(x1, y1);
        }

        else if (outcome == 10){
            baseLayer(x1, y1);
        }

        else if (outcome == 9){
            starLayer(x1, y1);
            ringedPlanet(x1, y1);
            pulsar(x1, y1);
        }

        else if (outcome == 8){
            starLayer(x1, y1);
            ringedPlanet(x1, y1);
        }

        else if (outcome == 7){
            starLayer(x1, y1);
            pulsar(x1, y1);
        }

        else if (outcome == 6){
            starLayer(x1, y1);
        }

        else if (outcome == 5){
            baseLayer(x1, y1);
            pulsar(x1, y1);
        }

        else if (outcome == 4){
            baseLayer(x1, y1);
            ringedPlanet(x1, y1);
        }

        else if (outcome == 3){
            ringedPlanet(x1, y1);
            pulsar(x1, y1);

        }

        else if (outcome == 2){
            ringedPlanet(x1, y1);
        }

        else{
            pulsar(x1,y1);
        }
    }
}
