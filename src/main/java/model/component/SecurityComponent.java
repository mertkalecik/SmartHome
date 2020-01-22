package model.component;

public class SecurityComponent {
    private GlassBreakDetector glassBreakDetector;
    private PresenceDetector presenceDetector;
    private SmokeDetector smokeDetector;
    private WaterDetector waterDetector;

    public SecurityComponent() {
        this.glassBreakDetector = new GlassBreakDetector();
        this.presenceDetector = new PresenceDetector();
        this.smokeDetector = new SmokeDetector();
        this.waterDetector = new WaterDetector();
    }
}
