(ns clojure-exercise.core
  (:gen-class))

(defn -foo
  "This is foo function"
  [& args]
  (println "This line is in the foo")
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (println "Hello, New World")
  (-foo)
)

