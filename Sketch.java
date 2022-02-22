import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(150, 221, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
   fill(222, 139, 75);
   rect(20, 120, 360, 400);

   fill(125, 60, 10);
   triangle(20, 120, 200, 15, 380, 120);

    fill(237, 206, 183);
   rect(50,300,80,400);

    fill(120, 106, 99);
   rect(220,280,120,320);

    fill(192, 206, 207);
   ellipse(200, 70, 80, 80);

   rect(120,150,120,120);


	
  
  // define other methods down here.
}
}