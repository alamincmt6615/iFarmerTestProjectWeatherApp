package alamin.iFarmer.TestProjectWeather.core.network.enums;


import java.util.Locale;

public enum RequestURL {

    BaseURL {
        @Override
        public String toString() {
             return "http://api.openweathermap.org/data/2.5/";
        }
    },

    AppId {
        @Override
        public String toString() {
            return "&APPID=f99154b4074ab6d40bdaef30df8fb498";
        }
    },

    Weather {
        @Override
        public String toString() {
            return "weather?";
        }
    },

    Forecast {
        @Override
        public String toString() {
            return "forecast?";
        }
    },

    QueryQ {
        @Override
        public String toString() {
            return "q=";
        }
    },

    QueryId {
        @Override
        public String toString() {
            return "id=";
        }
    },

    QueryLat {
        @Override
        public String toString() {
            return "lat=";
        }
    },

    QueryLon {
        @Override
        public String toString() {
            return "&lon=";
        }
    },

    Units {
        @Override
        public String toString() {
            return "&units=metric";
        }
    },

    Lang {
        @Override
        public String toString() {
            return "&lang=" + Locale.getDefault().getLanguage();
        }
    }

}
