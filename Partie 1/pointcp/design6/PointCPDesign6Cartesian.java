

public class PointCPDesign6Cartesian implements PointCP6{
    private double x;
    private double y;

    PointCPDesign6Cartesian(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getR(){return (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));}
    public double getTheta() {
        return Math.toDegrees(Math.atan2(y, x));
    }

    public double getX()
    {
        return this.x;
    }

    public double getY()
    {
        return this.y;
    }

    /**
     * Calculates the distance in between two points using the Pythagorean
     * theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
     *
     * @param pointB The second point.
     * @return The distance between the two points.
     */
    public double getDistance(PointCP6 pointB){
        // Obtain differences in X and Y, sign is not important as these values
        // will be squared later.
        double deltaX = getX() - pointB.getX();
        double deltaY = getY() - pointB.getY();

        return Math.sqrt((Math.pow(deltaX, 2) + Math.pow(deltaY, 2)));
    }

    /**
     * Rotates the specified point by the specified number of degrees.
     * Not required until E2.30
     *
     * @param rotation The number of degrees to rotate the point.
     * @return The rotated image of the original point.
     */
    public PointCPDesign6Interface rotatePoint(double rotation) {
        double radRotation = Math.toRadians(rotation);
        double X = getX();
        double Y = getY();

        return new PointCPDesign6Cartesian((Math.cos(radRotation) * X) - (Math.sin(radRotation) * Y),
                (Math.sin(radRotation) * X) + (Math.cos(radRotation) * Y));
    }

    /**
     * Returns information about the coordinates in polar form.
     *
     * @return A String containing information about the coordinates in polar form.
     */
    public String polarToString()
    {
        return "Stored as Polar [" + getR() + "," + getTheta() + "]" + "\n";
    }

    /**
     * Returns information about the coordinates in cartesian form.
     *
     * @return A String containing information about the coordinates in cartesian form.
     */
    public String cartesianToString(){ return "Stored as Cartesian [" + getX() + "," + getY() + "]" + "\n";}
}
