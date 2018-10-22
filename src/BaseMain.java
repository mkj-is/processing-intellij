
import processing.core.PApplet;

public class BaseMain {

  private static String[] sketches = {
          "intro.IntroductionWalker",
          "terrain.Terrain",
          "vectors.VectorBase"
  };


  public static void main( String args[] ) {
    menu.MenuWindow.setSketches( sketches );
    PApplet.main( "menu.MenuWindow" );
  }

}
