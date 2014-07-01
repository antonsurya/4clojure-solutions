;; Solutions for 4clojure.com problems 20 to 29

(ns foreclojure-solutions.solutions-02)

;; #21: Nth Element
;; Write a function which returns the Nth element from a sequence.

(defn sol-21 []
  #(first (last (split-at %2 %1))))


;; #22: Count a sequence
;; Write a function which returns the total number of elements in a sequence.

;; Variant A: Using Clojure functions

(defn sol-22-a []
  #(last (interleave %1 (iterate inc 1))))


;; Variant B: Using recursive method explicitly

(defn sol-22-b []
  (fn s22b
    ([coll] (s22b coll 0))
    ([coll n]
     (cond
      (empty? coll) n
      :else (s22b (rest coll) (inc n))))))

