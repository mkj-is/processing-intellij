package menu;

import processing.core.PApplet;

public class MenuWindow extends PApplet {

  private final ThreadLocal<Menu> m = new ThreadLocal<>();
  private static String[] sketches;

  public static void setSketches( String[] sketches ) {
    MenuWindow.sketches = sketches;
  }

  @Override
  public void settings() {
    size( 400, 800 );
  }

  public void setup() {
    background( 0 );
    m.set( new Menu( this, sketches, 26 ) );
    m.get().show();
  }

  public void draw() {
    textAlign( CENTER, CENTER );
    text( "⇧ Only arrow keys for now ⇩", width / 2f, height / 2f );
  }

  @Override
  public void keyPressed() {
    if ( key != ENTER ) { //ignore ENTER on press so as to not create multiple instances when key is held
      m.get().handleKey( key, keyCode );
      m.get().show();
    }
  }

  @Override
  public void keyReleased() {
    if ( key == ENTER ) {
      m.get().handleKey( key, keyCode );
    }
  }
}
