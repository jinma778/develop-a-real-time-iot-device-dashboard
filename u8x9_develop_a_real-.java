import java.util.ArrayList;
import java.util.List;

public class IoTDeviceDashboard {
    public static class Device {
        private String deviceId;
        private String deviceName;
        private List<Sensor> sensors;

        public Device(String deviceId, String deviceName) {
            this.deviceId = deviceId;
            this.deviceName = deviceName;
            this.sensors = new ArrayList<>();
        }

        public void addSensor(Sensor sensor) {
            this.sensors.add(sensor);
        }

        public String getDeviceId() {
            return deviceId;
        }

        public String getDeviceName() {
            return deviceName;
        }

        public List<Sensor> getSensors() {
            return sensors;
        }
    }

    public static class Sensor {
        private String sensorId;
        private String sensorType;
        private double currentValue;

        public Sensor(String sensorId, String sensorType) {
            this.sensorId = sensorId;
            this.sensorType = sensorType;
        }

        public void updateCurrentValue(double currentValue) {
            this.currentValue = currentValue;
        }

        public String getSensorId() {
            return sensorId;
        }

        public String getSensorType() {
            return sensorType;
        }

        public double getCurrentValue() {
            return currentValue;
        }
    }

    public static class Dashboard {
        private List<Device> devices;

        public Dashboard() {
            this.devices = new ArrayList<>();
        }

        public void addDevice(Device device) {
            this.devices.add(device);
        }

        public List<Device> getDevices() {
            return devices;
        }
    }
}