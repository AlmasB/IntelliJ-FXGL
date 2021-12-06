package com.almasb.test;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.dsl.FXGL;
import javafx.scene.shape.Rectangle;

/**
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
public class TestApp extends GameApplication {
    @Override
    protected void initSettings(GameSettings settings) { }

    @Override
    protected void initGame() {
        var e = FXGL.entityBuilder()
                .view(new Rectangle(40, 40))
                .buildAndAttach();

        FXGL.animationBuilder()
                .repeatInfinitely()
                .translate(e)
                .from(e.getPosition())
                .to(e.getPosition().add(200, 0))
                .buildAndPlay();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
