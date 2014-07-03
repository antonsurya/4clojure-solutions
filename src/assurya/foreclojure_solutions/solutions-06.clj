;; Solutions for 4clojure.com problems 60 to 69

(ns assurya.foreclojure-solutions.solutions-06)


;; #63: Group a Sequence
;; Given a function f and a sequence s, write a function which returns a map.
;; The keys should be the values of f applied to each item in s. The value at
;; each key should be a vector of corresponding items in the order they appear
;; in s.
;; e.g. (= (__ #(> % 5) [1 3 6 8]) {false [1 3], true [6 8]})
;;
;; Special Restrictions: group-by

(defn sol-63[]
  (fn [f c]
    (reduce
     (fn [p q]
       (let [r (f q)]
         (if (contains? p r)
           (into p {r (conj (p r) q)})
           (into p {r [q]}))))
     {}
     c)))

