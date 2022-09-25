package lesson25;

public class Client {
    public Client() {
    }

    public static void main(String[] args) {
        Camera camera = new Camera();
        CameraRoll colorCameraRoll = new ColorCameraRoll();
        CameraRoll blackAndWhiteCameraRoll = new BlackAndWhiteCameraRoll();
        camera.setCameraRoll(colorCameraRoll);
        camera.doPhotograph();
        camera.setCameraRoll(blackAndWhiteCameraRoll);
        camera.doPhotograph();
    }
}

