package ru.hyst329.openfool.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import ru.hyst329.openfool.OpenFoolGame;

public class DesktopLauncher {
    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "OpenFool";
        config.width = 800;
        config.height = 480;
        new LwjglApplication(new OpenFoolGame(), config);
    }
}