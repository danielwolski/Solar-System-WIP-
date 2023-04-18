import java.awt.*;

public class CelestialBody {
    private int x, y, mass;
    private int radius;
    private Color color;
    private String name;
    private double orbital_speed;

    public CelestialBody(int x, int y, int mass, int radius, Color color, String name, double orbital_speed) {
        this.x = x;
        this.y = y;
        this.mass = mass;
        this.radius = radius;
        this.color = color;
        this.name = name;
        this.orbital_speed = orbital_speed;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getMass() {return mass;}

    public void setMass() {this.mass = mass;}

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getOrbitalSpeed() {return orbital_speed;}

    public void setOrbitalSpeed() {this.orbital_speed = orbital_speed;}
}