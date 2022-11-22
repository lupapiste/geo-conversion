(defproject lupapiste/geo-conversion "0.5.0"
  :description "Coordinate conversion library"
  :url "https://github.com/lupapiste/geo-conversion"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [org.eclipse.emf/org.eclipse.emf.common "2.26.0"]
                 [org.eclipse.emf/org.eclipse.emf.ecore "2.28.0" :exclusions [org.eclipse.emf/org.eclipse.emf.common]]
                 [org.geotools/gt-main "28.0" :exclusions [org.eclipse.emf/org.eclipse.emf.common
                                                           org.eclipse.emf/org.eclipse.emf.ecore
                                                           javax.media/jai_core]]
                 [org.geotools/gt-referencing "28.0" :exclusions [org.eclipse.emf/org.eclipse.emf.common
                                                                  org.eclipse.emf/org.eclipse.emf.ecore
                                                                  javax.media/jai_core]]
                 [org.geotools/gt-epsg-wkt "28.0" :exclusions [org.eclipse.emf/org.eclipse.emf.common
                                                               org.eclipse.emf/org.eclipse.emf.ecore
                                                               javax.media/jai_core]]]
  :aot :all
  :repositories [["osgeo" {:url "https://repo.osgeo.org/repository/release/"}]])
