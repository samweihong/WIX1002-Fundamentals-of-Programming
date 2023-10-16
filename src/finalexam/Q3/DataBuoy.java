package finalexam.Q3;

class DataBuoy {
    private String buoy_id;
    private int latitude;
    private int longitude;
    private float air_temperature;
    private float water_temperature;

    public DataBuoy(String buoy_id, int latitude, int longitude, float air_temperature, float water_temperature) {
        this.buoy_id = buoy_id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.air_temperature = air_temperature;
        this.water_temperature = water_temperature;
    }

    public int getLatitude() {
        return latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public float getWaterTemperature() {
        return water_temperature;
    }

    @Override
    public String toString() {
        return String.format("%-18s%-9d%-9d%-9.2f%-9.2f", buoy_id, latitude, longitude, air_temperature, water_temperature);
    }
}
