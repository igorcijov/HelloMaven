package lesson25.spring;

public class Camera {
    private CameraRoll cameraRoll;

    public Camera() {
    }

    public CameraRoll getCameraRoll() {
        return this.cameraRoll;
    }

    public void setCameraRoll(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }

    public void doPhotograph() {
        System.out.println("Click!");
        this.cameraRoll.processing();
    }
}

