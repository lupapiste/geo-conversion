(require 'cemerick.pomegranate.aether)

(defproject lupapiste/geo-conversion "0.2.2"
  :description "Coordinate conversion library"
  :url "https://github.com/lupapiste/geo-conversion"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.geotools/gt-main "19.1"]
                 [org.geotools/gt-referencing "19.1"]
                 [org.geotools/gt-epsg-wkt "19.1"]]
  :aot :all
  :repositories [["osgeo" {:url "https://download.osgeo.org/webdav/geotools"}]])
