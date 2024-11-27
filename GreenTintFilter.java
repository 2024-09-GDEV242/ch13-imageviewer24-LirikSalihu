import java.awt.Color;

/**
 * Applies a green tint to the image.
 *
 * @author Lirik Salihu
 * @version 2024.11.26
 */
public class GreenTintFilter extends Filter {
    public GreenTintFilter() {
        super("Green Tint");
    }

    @Override
    public void apply(OFImage image) {
        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                Color pixel = image.getPixel(x, y);
                int green = Math.min(255, (int) (pixel.getGreen() * 1.5));
                image.setPixel(x, y, new Color(pixel.getRed(), green, pixel.getBlue()));
            }
        }
    }
}
