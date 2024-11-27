import java.awt.Color;

/**
 * Applies a blue tint to the image.
 *
 * @author Lirik Salihu
 * @version 2024.11.26
 */
public class BlueTintFilter extends Filter {
    public BlueTintFilter() {
        super("Blue Tint");
    }

    @Override
    public void apply(OFImage image) {
        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                Color pixel = image.getPixel(x, y);
                int blue = Math.min(255, (int) (pixel.getBlue() * 1.5));
                image.setPixel(x, y, new Color(pixel.getRed(), pixel.getGreen(), blue));
            }
        }
    }
}
