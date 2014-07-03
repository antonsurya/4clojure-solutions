;; Solutions for 4clojure.com problems 140 to 149

(ns assurya.foreclojure-solutions.solutions-14)


;; #147: Pascal's Trapezoid
;; Write a function that, for any given input vector of numbers, returns an
;; infinite lazy sequence of vectors, where each next one is constructed from
;; the previous following the rules used in Pascal's Triangle. For example,
;; for [3 1 2], the next row is [3 4 3 2].

(defn sol-147 []
  (fn pas-trap [c]
    (lazy-seq (cons c (pas-trap (mapv +' (concat [0] c) (concat c [0])))))))


