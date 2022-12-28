package src;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class CherryBomb extends Plant {

    public CherryBomb(GridPane my_grid_pane) {
        Image img = new Image(getClass().getResourceAsStream("img/cherrybomb.png"));
        this.setFitHeight(53);
        this.setFitWidth(62);
        this.setImage(img);
        System.out.println("Encountered a cherryBomb");
        for (int u=0; u < Level.plantsUnlocked.size(); u++) {
            if (this.getBoundsInParent().intersects(Level.plantsUnlocked.get(u).getBoundsInParent())) {
                blast(my_grid_pane);
            }
        }
    }
    public void blast(GridPane my_grid_pane){
        Image img = new Image(getClass().getResourceAsStream("img/cherry-bomb.png"));
        this.setImage(img);
        my_grid_pane.getChildren().remove(this);

    }
}