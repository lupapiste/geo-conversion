(ns geo-conversion.core
  (:import [org.geotools.referencing.crs DefaultGeographicCRS]
           [org.geotools.referencing CRS]
           [org.geotools.geometry GeneralDirectPosition]))

(defn- round-to [n acc]
  (.setScale n acc BigDecimal/ROUND_HALF_UP))

(defn epsg3067->wgs84 [coord-array]
  (let [source-CRS (CRS/decode "epsg:3067")
        to-CRS DefaultGeographicCRS/WGS84
        math-transform (CRS/findMathTransform source-CRS to-CRS true)
        direct-pos (->> coord-array
                        (map (comp #(.doubleValue %) bigdec))
                        (into-array Double/TYPE)
                        GeneralDirectPosition.)
        result-point (. math-transform transform direct-pos nil)]
    (->> result-point
         .getCoordinate
         (map (comp #(.doubleValue %) #(round-to % 5) bigdec)))))
