(defproject lupapiste/geo-conversion "0.4.0"
  :description "Coordinate conversion library"
  :url "https://github.com/lupapiste/geo-conversion"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.geotools/gt-main "23.0"]
                 [org.geotools/gt-referencing "23.0"]
                 [org.geotools/gt-epsg-wkt "23.0"]]
  :aot :all
  :repositories [["osgeo" {:url "https://repo.osgeo.org/repository/release/"}]])
