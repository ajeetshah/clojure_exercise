(ns clojure-exercise.core
  (:gen-class))

(defn -foo
  "This is foo function"
  [& args]
  (println "This line is in the foo")
)

(defn teen
  [age]
  (if (and (> age 12) (< age  20))
    (println true)
    (println false)
  )
)

(defn abs
  [number]
  (if (> number 0)
    (println number)
    (println (- number))
  )
)

(defn leap
  [year]
  (if (= (rem year 400) 0)
    (println true)
    (if (= (rem year 100) 0)
      (println false)
      (if (= (rem year 4) 0)
        (println true)
        (println false)
      )
    )
  )
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (println "Hello, New World")
  (-foo)

  (teen 17)
  (teen 22)

  (abs 9)
  (abs -5)

  (leap 2012)
  (leap 2000)
  (leap 4)
  (leap 1900)
)

