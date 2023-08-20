import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class LiveScoreBean{
    private String scoreLine;

    public static final String PROP_SCORE = "scoreLine";

    public String getScoreLine() {
        return scoreLine;
    }

    public void setScoreLine(String someData) {
        String oldSomeData = this.scoreLine;
        this.scoreLine = someData;
        propertyChangeSupport.firePropertyChange(PROP_SCORE, oldSomeData, someData);
    }
    
    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener subscriber) {
        propertyChangeSupport.addPropertyChangeListener(subscriber);
    }

    public void removePropertyChangeListener(PropertyChangeListener subscriber) {
        propertyChangeSupport.removePropertyChangeListener(subscriber);
    }
}