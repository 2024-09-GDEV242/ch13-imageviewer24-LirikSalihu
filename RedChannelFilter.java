import java.awt.Color;

/**
 * Converts the image to grayscale using the red channel.
 *
 * @author Lirik Salihu
 * @version 2024.11.26
 */
public class RedChannelFilter extends Filter {
    public RedChannelFilter() {
        super("Red Channel");
    }

    @Override
    public void apply(OFImage image) {
        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                int red = image.getPixel(x, y).getRed();
                image.setPixel(x, y, new Color(red, red, red));
            }
        }
    }
}
