package top.fyukina.iplmirror;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class EntranceController {
    @FXML
    private TextArea announcement;
    @FXML
    private void refreshAnnouncement() {
        announcement.setText("No Announcement.");
    }
}
