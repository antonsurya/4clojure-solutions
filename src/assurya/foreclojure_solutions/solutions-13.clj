;; Solutions for 4clojure.com problems 130 to 139

(ns assurya.foreclojure-solutions.solutions-13)


;; #135: Infix Calculator
;; Write a function that accepts a variable length mathematical expression
;; consisting of numbers and the operations +, -, *, and /. Assume a simple
;; calculator that does not do precedence and instead just calculates left
;; to right

(defn sol-135 []
  (fn [& e]
    (first (reduce
            #(if (number? %2)
               (if (empty? %1)
                 (list %2)
                 (list ((first %1) (second %1) %2)))
               (cons %2 %1))
            '()
            e))))
