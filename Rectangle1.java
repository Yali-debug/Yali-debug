/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangle1;

/**
 *
 * @author BOBBY
 */
public class Rectangle1 {
    private Point basGauche;
    private int larg;
    private int lon;
    
    Rectangle1 (Point p1, Point p2){
        int x1 = Math.min (p1.x, p2.x);
        int y1 = Math.min (p1.y, p2.y);
        this.basGauche = new Point (x1, y1);
        this.lon = Math.abs (p2.x - p1.x);
        this.larg = Math.abs (p2.y - p1.y);
    }
    
    Rectangle1 (Point p3, int larg, int lon) {
       this.basGauche = new Point (p3.x, p3.y);
       this.lon = lon;
       this.larg = larg;
    }
    
    Rectangle1 (int x, int y, int larg, int lon) {
    this.basGauche = new Point (x, y);
    this.lon = lon;
    this.larg = larg;
    }
    public int surface () {
        return lon * larg;
    }
    
    public void translate (int x, int y) {
        this.basGauche.x += x;
        this.basGauche.y +=y;
    }
    
    public boolean contain (Point p) {
        return p.x >= basGauche.x && p.x <= basGauche.x + lon && 
                p.y >= basGauche.y && 
                p.y <=basGauche.y + larg;
    }
    
    public boolean contains (Rectangle1 r) {
        Point upRight = new Point (r.basGauche.x + r.lon, r.basGauche.y + r.larg);
        return this.contain(r.basGauche) && this.contain (upRight);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point origin = new Point (0,0);
        Rectangle1 rect = new Rectangle1 (origin, 10, 5);
        System.out.println ("avant le déplacement :" + origin.x + "et" + origin.y);
        rect.translate (4,5);
        System.out.println ("Après le déplacement :" + origin.x + "et" + origin.y);
        
        
        // TODO code application logic here
    }
    
}
