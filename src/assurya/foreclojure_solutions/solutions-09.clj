;; Solutions for 4clojure.com problems 90 to 99

(ns assurya.foreclojure-solutions.solutions-09)


;; #90: Cartesian Products
;; Write a function which calculates the Cartesian product of two sets.

(defn sol-90 []
  #(into #{} (for [a %1, b %2] [a b])))


;; #97: Pascal's Triangle
;; Pascal's triangle is a triangle of numbers computed using the following
;; rules:
;;     - The first row is 1.
;;     - Each successive row is computed by adding together adjacent numbers
;; in the row above, and adding a 1 to the beginning and end of the row.
;; Write a function which returns the nth row of Pascal's Triangle.

(defn sol-97 []
  (fn pas-tri
    ([n] (pas-tri n [1]))
    ([n c] (if (<= n (count c))
             c
             (pas-tri n (map + (concat [0] c) (concat c [0])))))))


