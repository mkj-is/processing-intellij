package menu;

class MenuItem {
  private Menu m;

  int getIndex() {
    return index;
  }

  private int index;
  private int textSize;

  String getName() {
    return name;
  }

  private String name;
  private Boolean selected = false;

  MenuItem( Menu m, int index, String name ) {
    this.m = m;
    this.index = index;
    this.name = name;
    if ( index == 0 ) {
      toggleSelected();
    }
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
    m.p.fill( isSelected() ? 100 : 0 );
    m.p.rect( 0, ( index ) * textSize + 5, m.p.width - 5, textSize );
    m.p.textAlign( m.p.LEFT, m.p.BASELINE );
    m.p.fill( 255 );
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
}
