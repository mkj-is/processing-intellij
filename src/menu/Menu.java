package menu;

import processing.core.PApplet;

import static processing.core.PConstants.*;

class Menu {

  private int textSize, current, numOfSketches;
  private PApplet p;
  private MenuItem[] items;

  Menu( PApplet p, String[] sketches, int textSize ) {
    this.p = p;
    this.textSize = textSize;
    numOfSketches = sketches.length;
    items = new MenuItem[ numOfSketches ];
    for ( int i = 0; i < numOfSketches; i++ ) {
      items[ i ] = new MenuItem( p, i, sketches[ i ] );
    }
    this.current = 0;
  }

  void show() {
    p.textSize( textSize );
    for ( MenuItem item :
            items ) {
      item.show( textSize );
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
      this.show();
    }
    if ( key == ENTER ) {
      PApplet.main( items[ current ].getName() );
    }
  }
}
