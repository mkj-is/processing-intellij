
import processing.core.PApplet;

public class BaseMain {

  private static String[] sketches = {
          "example.Example"
  };


  public static void main( String args[] ) {
    menu.MenuWindow.setSketches( sketches );
    PApplet.main( "menu.MenuWindow" );
  }

}
