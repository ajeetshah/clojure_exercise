(ns clojure-exercise.core
  (:gen-class))

(defn hello
  []
  "Hello, World!"
)

(defn teen
  [age]
  (and (> age 12) (< age  20))
)

(defn abs
  [number]
  (if (> number 0)
    number
    (- number)
  )
)

(defn leap
  [year]
  (if (= (rem year 400) 0)
    true
    (if (= (rem year 100) 0)
      false
      (if (= (rem year 4) 0)
        true
        false
      )
    )
  )
)

(defn my_count
  [my_seq]

  (if (not= nil (first my_seq))
    (inc (my_count (rest my_seq)))
    0
  )
)

(defn add100
  [n]
  (+ n 100)
)

(defn dec-maker
  [dec-by]
 #(- % dec-by)
)

(defn spiff
  [v]
  (second (rest v))
  ;(nth v 3)
)

(defn element-lengths
  [collection]
  
  (loop [ i 0]
    (when (< i (count collection))
      (println (count (nth collection i)))
      (recur (inc i))
    )
  )
)

(defn test_loop
  [i_max]
  (loop [i 0]
      (when (<= i i_max)
          (println "running loop: " i)
          (recur (inc i))
      )
  )
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  ;(println "I am -main function")

  (element-lengths '("hello" "world" "harry" "potter"))

  (comment ;comment start

  (println (hello))

  (println (teen 17))
  (println (teen 22))
  (println (teen 22))
  (println (teen 22))
  (println (teen 22))
  (println (teen 22))
  (println (teen 22))


  (println (abs 9))
  (println (abs -5))

  (println (leap 2012))
  (println (leap 1900))

  (println (my_count '(22 33 44 00)))
  (println (my_count '(11 44 66)))

  (println (add100 24))
  (println (add100 -99))

  (def dec9 (dec-maker 9))
  (println (dec9 10))

  (println (spiff [11 22 33 44]))
  (println (spiff [121 "fdsfsf"]))

  (test_loop 10)
  
  ) ;comment end

)

