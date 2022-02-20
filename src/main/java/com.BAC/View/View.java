package com.BAC.View;

import com.BAC.Controller.Controller;
import javafx.scene.Parent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

//public class View {
//
//}

public class View implements FXComponent {
//    private Controller controller;
//
//    public View(Controller controller) {
//        this.controller = controller;
//    }

    @Override
    public Parent render() {
        HBox layout = new HBox();

//        //     Status: message view
//        MessageView messageView = new MessageView(controller);
//        layout.getChildren().add(messageView.render());
//
//        // Puzzle view
//        PuzzleView puzzleView = new PuzzleView(controller);
//        layout.getChildren().add(puzzleView.render());
//
//        // Control view
//        ControlView controlView =
//                new ControlView(controller, controller.getPuzzleIndex(), controller.getPuzzleCount());
//        layout.getChildren().add(controlView.render());

        return layout;
    }
}
