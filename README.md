## IntelliJ-FXGL
A possible (UI?) bug.

### How to reproduce

1. Using IntelliJ, import the project as "Maven".
2. Open TestApp.java in the editor, you should see something like this, indicating an error:

![image](screenshot.png)

3. However, you can run `TestApp` in the editor as normal, without any issues.

### Notes

The source code of the library in question (FXGL), and specifically the function `buildAndPlay` and everything related to `AnimationBuilder`, is here: [buildAndPlay](https://github.com/AlmasB/FXGL/blob/bdb0005428329528e4202563c152e4afe913e5b6/fxgl-core/src/main/kotlin/com/almasb/fxgl/animation/AnimationBuilder.kt#L248)