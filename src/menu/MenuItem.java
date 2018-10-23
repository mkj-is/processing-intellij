package menu;

import processing.core.PApplet;
import processing.core.PConstants;

import static processing.core.PConstants.HSB;

class MenuItem {
  private Menu m;

  int getIndex() {
    return index;
  }

  private int index, textSize, color;
  private String name;
  private Boolean selected = false;


  MenuItem( Menu m, int index, String name ) {
    this.m = m;
    this.index = index;
    this.name = name;
    if ( index == 0 ) {
      toggleSelected();
    }
    this.color = randomColor();
  }

  String getName() {
    return name;
  }

  @SuppressWarnings( "WeakerAccess" )
  Boolean isSelected() {
    return index == m.getCurrent();
  }

  void toggleSelected() {
    selected = !selected;
  }

  void show( int textSize ) {
    this.textSize = textSize;

    m.p.noStroke();
    m.p.fill( isSelected() ? 50 : 0 );
    m.p.rect( 0, ( index ) * textSize + 5, m.p.width - 5, textSize );
    m.p.textAlign( m.p.LEFT, m.p.BASELINE );
    m.p.colorMode( PConstants.RGB );
    m.p.fill( isSelected() ? color : 255 );
    m.p.text( name, 20, ( index + 1 ) * textSize );
  }

  boolean isUnderMouse() {
    if ( m.p.mouseX >= 0 &&
            m.p.mouseX <= ( 0f + m.p.width - 5 ) &&
            m.p.mouseY >= ( ( index ) * textSize + 5 ) &&
            m.p.mouseY <= ( ( index ) * textSize + 5 ) + textSize ) {
      selected = true;
      return true;
    }
    return false;
  }

  private int randomColor() {
    float goldernRationConjugate = 0.618033988749895f;
    float h = ( m.p.random( 1 ) + goldernRationConjugate ) % 1;
//    m.p.colorMode( HSB, 1, 1, 1 );
    m.p.colorMode( HSB );
    return m.p.color( PApplet.map( h, 0, 1, 0, 255 ), 127.5f, 200f );
  }
}
