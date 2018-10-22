package menu;

import processing.core.PApplet;

class MenuItem {
  private PApplet p;
  private int index;

  String getName() {
    return name;
  }

  private String name;
  private Boolean selected = false;

  MenuItem( PApplet p, int index, String name ) {
    this.p = p;
    this.index = index;
    this.name = name;
    if ( index == 0 ) {
      toggleSelected();
    }
  }

  @SuppressWarnings( "WeakerAccess" )
  Boolean isSelected() {
    return selected;
  }

  void toggleSelected() {
    selected = !selected;
  }

  void show( int textSize ) {

    p.noStroke();
    p.fill( isSelected() ? 100 : 0 );
    p.rect( 0, ( index ) * textSize + 5, p.width - 5, textSize );
    p.textAlign( p.LEFT, p.BASELINE );
    p.fill( 255 );
    p.text( name, 20, ( index + 1 ) * textSize );
  }
}
