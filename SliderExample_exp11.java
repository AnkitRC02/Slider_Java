import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class SliderExample_exp11 extends JFrame {

    public SliderExample_exp11() {
        setTitle("Slider with Custom Ticks Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a slider
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        slider.setMajorTickSpacing(10); // Major tick spacing
        slider.setMinorTickSpacing(1); // Minor tick spacing
        slider.setPaintTicks(true); // Paint tick marks
        slider.setPaintLabels(true); // Paint labels for major ticks

        // Create a panel and add the slider to it
        JPanel panel = new JPanel();
        panel.add(slider);

        // Add a change listener to the slider to monitor value changes
        slider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                // Handle slider value changes here
                JSlider source = (JSlider) e.getSource();
                int value = source.getValue();
                System.out.println("Slider value: " + value);
            }
        });

        // Add the panel to the frame
        add(panel);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SliderExample_exp11::new);
    }
}
