package example;

import processing.core.PApplet;

public class Example extends PApplet {

  private Walker w;

  @Override
  public void settings() {
    size( 600, 400 );
  }

  @Override
  public void setup() {
    w = new Walker( this );
  }

  @Override
  public void draw() {
    background( 0 );
    w.step();
    w.show();
    fill( 255 );
    textAlign( CENTER, CENTER );
    text( "Click to reset", width / 2f, height / 2f );
  }

  @Override
  public void mouseReleased() {
    w.reset();
  }

}
