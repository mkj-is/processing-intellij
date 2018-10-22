package example;

import processing.core.PApplet;

class Walker {

  private PApplet p;
  private float x, y, r;
  private int color;

  Walker( PApplet p ) {
    this.p = p;
    this.x = p.random( p.width );
    this.y = p.random( p.height );
    this.r = p.random( 100 );
    this.color = p.color( p.random( 255 ), p.random( 255 ), p.random( 255 ) );
  }

  void step() {
    x += p.random( -1, 1 );
    y += p.random( -1, 1 );
  }

  void show() {
    p.noStroke();
    p.fill( color );
    p.ellipse( x, y, r, r );
  }

  void reset() {
    this.x = p.random( p.width );
    this.y = p.random( p.height );
    this.r = p.random( 100 );
    this.color = p.color( p.random( 255 ), p.random( 255 ), p.random( 255 ) );
  }
}
