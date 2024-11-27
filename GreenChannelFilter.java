import java.awt.Color;

/**
 * Converts the image to grayscale using the green channel.
 *
 * @author Lirik Salihu
 * @version 2024.11.26
 */
public class GreenChannelFilter extends Filter {
    public GreenChannelFilter() {
        super("Green Channel");
    }

    @Override
    public void apply(OFImage image) {
        for (int x = 0; x < image.getWidth(); x++) {
            for (int y = 0; y < image.getHeight(); y++) {
                int green = image.getPixel(x, y).getGreen();
                image.setPixel(x, y, new Color(green, green, green));
            }
        }
    }
}
