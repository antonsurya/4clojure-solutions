;; Solutions for 4clojure.com problems 120 to 129

(ns assurya.foreclojure-solutions.solutions-12)


;; #120: Sum of square of digits
;; Write a function which takes a collection of integers as an argument.
;; Return the count of how many elements are smaller than the sum of their
;; squared component digits. For example: 10 is larger than 1 squared plus 0
;; squared; whereas 15 is smaller than 1 squared plus 5 squared.

(defn sol-120 []
  (fn [s]
    (reduce
     (fn [c n]
       (if (< n
              (apply + (reductions (fn [_ b] (* b b))
                                   0
                                   (for [x (seq (str n))] (- (int x) (int \0))))))
         (inc c)
         c))
     0
     s)))



;; #122: Read a binary number
;; Convert a binary number, provided in the form of a string, to its numerical value.
;; e.g. (= 7 (__ "111"))

(defn sol-122 []
  (fn [x]
    (reduce
     +
     (map *
          (map #(- (int %) (int \0)) (reverse x))
          (reductions #(* %1 %2) 1 (repeat 2))
          ))))

