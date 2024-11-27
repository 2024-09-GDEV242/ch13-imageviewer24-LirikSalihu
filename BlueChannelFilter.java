import java.awt.Color;

/**
 * Converts the image to grayscale using the blue channel.
 *
 * @author Lirik Salihu
 * @version 2024.11.26
 */
public class BlueChannelFilter extends Filter {
    public BlueChannelFilter() {
        super("Blue Channel");
    }

    @Override
    public void apply(OFImage image) {
        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                int blue = image.getPixel(x, y).getBlue();
                image.setPixel(x, y, new Color(blue, blue, blue));
            }
        }
    }
}
