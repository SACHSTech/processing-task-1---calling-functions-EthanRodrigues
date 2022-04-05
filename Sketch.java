import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
   * This program draws a house
    Author: Ethan Rodrigues
   */
  public void settings() {
    size(400, 400);
  }

  public void setup() {
    background(210, 255, 173);
  }

  public void draw() {

      // code for the grass
        fill(0, 176, 26);
        rect(0, 380, 400, 400);

      // code for the house
        fill(222, 139, 75);
        rect(20, 120, 360, 400);

      // code for the chimney
        rect(60, 20, 50, 80);

      // code for the roof
        fill(125, 60, 10);
        triangle(20, 120, 200, 15, 380, 120);

      // code for the door and the doorknob
        fill(237, 206, 183);
        rect(50, 300, 80, 400);
        ellipse(110, 370, 10, 10);

      // code for the garage door
        fill(120, 106, 99);
        rect(220, 280, 120, 320);
        fill(133, 107, 72);
        rect(225, 285, 110, 320);
      
      // code for the windows
        fill(192, 206, 207);
        ellipse(100, 200, 80, 80);
        rect(210, 150, 150, 100);
      }
  
}