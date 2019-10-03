// This file contains material supporting section 2.9 of the textbook:
// "Object Oriented Software Engineering" and is issued under the open-source
// license found at www.lloseng.com 

/**
 * This class contains instances of coordinates in either polar or
 * cartesian format.  It also provides the utilities to convert
 * them into the other type. It is not an optimal design, it is used
 * only to illustrate some design issues.
 *
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Dr Timothy C. Lethbridge
 * @version July 2000
 */
public interface PointCP6 {
 
  public double getX();

  public double getY();
  
  public double getRho();
  
  public double getTheta();
  
  public void convertStorageToPolar();

  public void convertStorageToCartesian();
	
  public double getDistance(PointCP6 pointB);

  public PointCP6 rotatePoint(double rotation);
	
  public String toString();
 
}
