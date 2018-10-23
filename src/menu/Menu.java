package menu;

import processing.core.PApplet;

import static processing.core.PConstants.*;

class Menu {

  private int textSize;

  int getCurrent() {
    return current;
  }

  private int current;
  private int numOfSketches;
  PApplet p;
  private MenuItem[] items;

  Menu( PApplet p, String[] sketches, int textSize ) {
    this.p = p;
    this.textSize = textSize;
    numOfSketches = sketches.length;
    items = new MenuItem[ numOfSketches ];
    for ( int i = 0; i < numOfSketches; i++ ) {
      items[ i ] = new MenuItem( this, i, sketches[ i ] );
    }
    this.current = 0;
  }

  void show() {
    p.textSize( textSize );
    for ( MenuItem item :
            items ) {
      item.show( textSize );
      if ( item.isUnderMouse() ) current = item.getIndex();
    }
  }

  void handleKey( char key, int keyCode ) {
    if ( key == p.CODED ) {
      items[ current ].toggleSelected();
      switch ( keyCode ) {
        case (char) UP:
          current = current == 0 ? numOfSketches - 1 : current - 1;
          break;
        case (char) DOWN:
          current = ( current + 1 ) % numOfSketches;
          break;
      }
      items[ current ].toggleSelected();
    }
    if ( key == ENTER ) {
      runSketch( current );
    }
  }

  void handleMouse() {
    if ( items[ current ].isUnderMouse() ) {
      runSketch( current );
    }
  }

  private void runSketch( int current ) {
    String name = items[ current ].getName();
    try {
      PApplet.main( name );
    } catch ( Exception e ) {
      System.out.println( "Sketch " + name + " not found" );
    }
  }

}
