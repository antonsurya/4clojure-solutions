;; Solutions for 4clojure.com problems 110 to 119

(ns assurya.foreclojure-solutions.solutions-11)


;; #118: Re-implement Map
;; Map is one of the core elements of a functional programming language.
;; Given a function f and an input sequence s, return a lazy sequence of
;; (f x) for each element x in s.

(defn sol-118 []
  (fn mymap [f s]
    (cond
     (empty? s) '()
     :else (lazy-seq (cons (f (first s)) (mymap f (rest s)))))))

