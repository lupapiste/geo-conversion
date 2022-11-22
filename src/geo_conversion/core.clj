(ns geo-conversion.core
  (:import [org.geotools.referencing.crs DefaultGeographicCRS]
           [org.geotools.referencing CRS]
           [org.geotools.geometry GeneralDirectPosition]
           [org.opengis.referencing.crs CoordinateReferenceSystem]
           [java.math RoundingMode]))

(defn- round-to [^BigDecimal n acc]
  (.setScale n (int acc) RoundingMode/HALF_UP))

(def wgs-84 DefaultGeographicCRS/WGS84)

(def etrs-tm35fin "epsg:3067")

(defn convert-crs [coord-array ^String src-crs ^String to-crs]
  (let [source-CRS (CRS/decode src-crs)
        to-CRS (if (= wgs-84 to-crs) wgs-84 (CRS/decode to-crs))
        math-transform (CRS/findMathTransform ^CoordinateReferenceSystem source-CRS
                                              ^CoordinateReferenceSystem to-CRS
                                              true)
        double-array (->> coord-array
                          (map (comp #(.doubleValue %) bigdec))
                          (into-array Double/TYPE))
        direct-pos (GeneralDirectPosition. ^doubles double-array)
        result-point (. math-transform transform direct-pos nil)]
    (->> result-point
         .getCoordinate
         (map (comp #(.doubleValue %) #(round-to % 5) bigdec)))))

(defn epsg3067->wgs84 [coord-array]
  (convert-crs coord-array etrs-tm35fin wgs-84))
