class SpaceAge {
	
	private double seconds;
	private double earthYears;
	
	private static final double EARTH_SECONDS_PER_YEAR = 31557600;
	private static final double MERCURY_EARTH_YEARS = 0.2408467;
	private static final double VENUS_EARTH_YEARS = 0.61519726;
	private static final double MARS_EARTH_YEARS = 1.8808158;
	private static final double JUPITER_EARTH_YEARS = 11.862615;
	private static final double SATURN_EARTH_YEARS = 29.447498;
	private static final double URANUS_EARTH_YEARS = 84.016846;
	private static final double NEPTUNE_EARTH_YEARS = 164.79132;

    SpaceAge(double seconds) {
        this.seconds = seconds;
		earthYears = seconds / EARTH_SECONDS_PER_YEAR;
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
		return earthYears;
        
    }

    double onMercury() {
        return earthYears / MERCURY_EARTH_YEARS;
    }

    double onVenus() {
        return earthYears / VENUS_EARTH_YEARS;
    }

    double onMars() {
        return earthYears / MARS_EARTH_YEARS;
    }

    double onJupiter() {
        return earthYears / JUPITER_EARTH_YEARS;
    }

    double onSaturn() {
        return earthYears / SATURN_EARTH_YEARS;
    }

    double onUranus() {
        return earthYears / URANUS_EARTH_YEARS;
    }

    double onNeptune() {
        return earthYears / NEPTUNE_EARTH_YEARS;
    }

}
