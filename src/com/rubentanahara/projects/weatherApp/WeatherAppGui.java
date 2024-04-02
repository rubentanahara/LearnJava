import javax.swing.JFrame;

public class WeatherAppGui extends JFrame {
    public WeatherAppGui() {
        super("Weather App");

        setDefaultCloseOperation(EXIT_ON_CLOSE);// end program on close

        setSize(450, 650); // sizes in pixels

        setLocationRelativeTo(null); // center

        setLayout(null); // make layout manager null to manually position our component within the gui

        setResizable(false); // prevent resize of our gui
    }
}
