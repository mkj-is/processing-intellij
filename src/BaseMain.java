
import processing.core.PApplet;

public class BaseMain {

  private static String[] sketches = {
          "sketch.Sketch",
          "example.Example"
          // Add your sketch's base class path here ("package.Class")
  };


  public static void main( String args[] ) {
    menu.MenuWindow.setSketches( sketches );
    PApplet.main( "menu.MenuWindow" );
  }

}
