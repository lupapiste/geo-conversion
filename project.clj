(require 'cemerick.pomegranate.aether)
(cemerick.pomegranate.aether/register-wagon-factory!
  "http" #(org.apache.maven.wagon.providers.http.HttpWagon.))

(defproject lupapiste/geo-conversion "0.2.1"
  :description "Coordinate conversion library"
  :url "https://github.com/lupapiste/geo-conversion"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.geotools/gt-main "17.1"]
                 [org.geotools/gt-referencing "17.1"]
                 [org.geotools/gt-epsg-wkt "17.1"]]
  :aot :all
  :repositories [["boundless" {:url "https://repo.boundlessgeo.com/main/"}]
                 ["osgeo" {:url "http://download.osgeo.org/webdav/geotools"}]])
