(ns geo-conversion.core-test
  (:require [geo-conversion.core :as sut]
            [clojure.test :refer [deftest is]]))

(deftest conversion
  (is (= [26.21382 67.41531]
         (sut/epsg3067->wgs84 [466307 7477892]))))
