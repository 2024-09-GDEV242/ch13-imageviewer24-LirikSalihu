import java.awt.Color;

/**
 * Applies a red tint to the image.
 *
 * @author Lirik Salihu
 * @version 2024.11.26
 */
public class RedTintFilter extends Filter {
    public RedTintFilter() {
        super("Red Tint");
    }

    @Override
    public void apply(OFImage image) {
        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                Color pixel = image.getPixel(x, y);
                int red = Math.min(255, (int) (pixel.getRed() * 1.5));
                image.setPixel(x, y, new Color(red, pixel.getGreen(), pixel.getBlue()));
            }
        }
    }
}