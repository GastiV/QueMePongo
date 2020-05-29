package Service;

import Domain.ClienteDeClima;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccuWeatherAPI implements ClienteDeClima {

    //Como stakeholder de QuéMePongo, quiero poder asegurar la calidad de mi aplicación sin incurrir en costos innecesarios.
    //El cliente de AccuWeather debería guardar un snapshot del resultado de la consulta del clima de buenos aires
    //Este debería ser actualizado cada cierta cantidad de horas

    public Integer obtenerClimaDe(String unaCiudad) {
        return getWeather(unaCiudad).get(0).get("Temperature").get("Value");
    }

    public final List<Map<String, Object>> getWeather(String ciudad) {
        return Arrays.asList(new HashMap<String, Object>(){{
            put("DateTime", "2019-05-03T01:00:00-03:00");
            put("EpochDateTime", 1556856000);
            put("WeatherIcon", 33);
            put("IconPhrase", "Clear");
            put("IsDaylight", false);
            put("PrecipitationProbability", 0);
            put("MobileLink", "http://m.accuweather.com/en/ar/villa-vil/7984/");
            put("Link", "http://www.accuweather.com/en/ar/villa-vil/7984");
            put("Temperature", new HashMap<String, Object>(){{
                put("Value", 57);
                put("Unit", "F");
                put("UnitType", 18);
            }});
        }});
    }
}