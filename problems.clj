;; 22
;; Count a Sequence
;; Write a function which returns the total number of elements in a
;; sequence.

#(reduce + (map (fn [e] 1) %))

; or better
(partial (fn [n s]
           (if (empty? s)
             n
             (recur (inc n) (rest s))))
         0)

;; 23
;; Reverse a Sequence
;; Write a function which reverses a sequence.

(
 (partial (fn [s1 s2]
            (if (empty? s2)
              s1
              (recur (conj s1 (first s2)) (rest s2))))
          ())

 [1 2 3 4 55 56])


((fn ! [s]
   (if (empty? s) s
       (conj (! (drop-last s)) (last s) )))
 [1 2 3 3 3 4 4 5]
 )

;; 24
reduce + 

;; 25
(filter odd? #{1 2 3 4 5})

