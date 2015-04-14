import java.awt.Color;

/**
 * This class contains class (static) methods that will help you test the
 * Picture class methods. Uncomment the methods and the code in the main to
 * test.
 * 
 * @author Barbara Ericson
 */
public class PictureTester {
	/** Method to test zeroBlue */
	public static void testZeroBlue() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}

	/** Method to test mirrorVertical */
	public static void testMirrorVertical() {
		Picture caterpillar = new Picture("caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorVertical();
		caterpillar.explore();
	}

	/** Method to test mirrorTemple */
	public static void testMirrorTemple() {
		Picture temple = new Picture("temple.jpg");
		temple.explore();
		temple.mirrorTemple();
		temple.explore();
	}

	/** Method to test the collage method */
	public static void testCollage() {
		Picture canvas = new Picture("640x480.jpg");
		canvas.createCollage();
		canvas.explore();
	}

	/** Method to test edgeDetection */
	public static void testEdgeDetection() {
		Picture swan = new Picture("swan.jpg");
		swan.edgeDetection(10);
		swan.explore();
	}

	/** Method to Mirror Snowman Arms **/
	public static void mirrorArms() {
		Pixel topPixel = null;
		Pixel botPixel = null;
		Pixel[][] pixels = new Picture("snowman.jpg").getPixels2D();
		for (int row = 155; row < 191; row++) {
			for (int col = 98; col < 169; col++) {
				topPixel = pixels[row][col];
				botPixel = pixels[191 - row + 191][col];
				botPixel.setColor(topPixel.getColor());
			}
		}
		for (int row = 155; row < 191; row++) {
			for (int col = 238; col < 296; col++) {
				topPixel = pixels[row][col];
				botPixel = pixels[191 - row + 191][col];
				botPixel.setColor(topPixel.getColor());
			}
		}
	}

	public static void mirrorGull() {
		int mirrorPoint = 350;
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel[][] pixels = new Picture("seagull.jpg").getPixels2D();
		for (int row = 225; row < 332; row++)
		{
			for (int col = 219; col < mirrorPoint; col++)
			{
				leftPixel = pixels[row][col];
				rightPixel = pixels[row][mirrorPoint - col +
				mirrorPoint];
				rightPixel.setColor(leftPixel.getColor());
			}
		}
	}

	/**
	 * Main method for testing. Every class can have a main method in Java
	 */
	public static void main(String[] args) {
		// uncomment a call here to run a test
		// and comment out the ones you don't want
		// to run
		// testZeroBlue();
		// testKeepOnlyBlue();
		// testKeepOnlyRed();
		// testKeepOnlyGreen();
		// testNegate();
		// testGrayscale();
		// testFixUnderwater();
		// testMirrorVertical();
		// testMirrorTemple();
		// testMirrorArms();
		// testMirrorGull();
		// testMirrorDiagonal();
		// testCollage();
		// testCopy();
		// testEdgeDetection();
		// testEdgeDetection2();
		// testChromakey();
		// testEncodeAndDecode();
		// testGetCountRedOverValue(250);
		// testSetRedToHalfValueInTopHalf();
		// testClearBlueOverValue(200);
		// testGetAverageForColumn(0);
	}
}