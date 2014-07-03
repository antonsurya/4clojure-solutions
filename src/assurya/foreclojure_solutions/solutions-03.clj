;; Solutions for 4clojure.com problems 30 to 39

(ns assurya.foreclojure-solutions.solutions-03)


;; #30: Compress a Sequence
;; Write a function which removes consecutive duplicates from a sequence.
;; e.g. (= (apply str (__ "Leeeeeerrroyyy")) "Leroy")

;; Variant A: using Clojure functions

(defn sol-30-a []
  (fn [x]
    (let [y (concat (list nil) x)]
      (map first (filter (fn [z] (not (= (first z) (second z))))
                         (map vector x y))))))

;; Variant B: using recursive method explicitly

(defn sol-30-b []
  (fn mycomp [c]
    (cond
     (empty? c) '()
     (= (first c) (second c)) (mycomp (rest c))
     :else (cons (first c) (mycomp (rest c))))))

