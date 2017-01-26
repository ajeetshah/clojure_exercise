(ns clojure-exercise.core-test
  (:require [clojure.test :refer :all]
            [clojure-exercise.core :refer :all]))

(deftest a-test
  (testing "Just a check"
    (is (= 1 1))))

(deftest teen-test
  (
   testing "teen function"
    (is (true? (teen 16)))
  )
)

(deftest abs-test
  (testing "abs function"
    (is (true? (> (abs -199) 0)))
  )
)

(deftest leap-test
  (testing "leap function"
   (is (true? (leap 2012)))
  )  
)

