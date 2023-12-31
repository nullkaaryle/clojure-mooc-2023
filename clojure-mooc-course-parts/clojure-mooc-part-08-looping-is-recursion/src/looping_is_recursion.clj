(ns looping-is-recursion)


;------------------------------------------------------------------------------;
;               EXERCISES FOR PART 8: LOOPING IS RECURSION                     ;
;          https://github.com/iloveponies/looping-is-recursion                 ;
;               - - - - - - - - - - - - - - - - - - - - -                      ;
;          UNIVERSITY OF HELSINKI CLOJURE MOOC: I LOVE PONIES                  ;
;                   http://iloveponies.github.io                               ;
;------------------------------------------------------------------------------;

;-------------------------------------------------
; EXERCISE 1
; - - - - - -
; Write the function (power n k) that 
;   computes the mathematical expression nk.
; 
; Examples:
;   (power 2 2)  ;=> 4
;   (power 5 3)  ;=> 125
;   (power 7 0)  ;=> 1
;   (power 0 10) ;=> 0

(defn power [base exp]
  ":(")


;-------------------------------------------------
; EXERCISE 2
; - - - - - -
; Compute the last element of a sequence.
;
; Examples:
;   (last-element [])      ;=> nil
;   (last-element [1 2 3]) ;=> 3
;   (last-element [2 5])   ;=> 5
  
(defn last-element [a-seq]
  ":(")


;-------------------------------------------------
; EXERCISE 3
; - - - - - -
; Write the function (seq= a-seq b-seq) that 
;   compares two sequences for equality.
; 
; Examples:
;   (seq= [1 2 4] '(1 2 4))  ;=> true
;   (seq= [1 2 3] [1 2 3 4]) ;=> false
;   (seq= [1 3 5] [])        ;=> false

(defn seq= [seq1 seq2]
  ":(")


;-------------------------------------------------
; EXERCISE 4
; - - - - - -
; Implement the function (find-first-index [predicate seq]) that 
;   returns the first index in seq 
;      for which predicate returns true,
;   or nil if no such index exists.

; Examples:
;   (find-first-index zero? [1 1 1 0 3 7 0 2])     ;=> 3
;   (find-first-index zero? [1 1 3 7 2])           ;=> nil
;   (find-first-index nil? [])                     ;=> nil
;   (find-first-index (fn [n] (= n 6)) [:cat :dog :six :blorg 6]) 
;       ;=> 4

(defn find-first-index [pred a-seq]
  ":(")


;-------------------------------------------------
; EXERCISE 5
; - - - - - -
; Implement the function (avg a-seq) that 
;   computes the average of a sequence.?
;
; Hint: You need to keep track of multiple things in the loop.
;
; Examples:
;   (avg [1 2 3])   ;=> 2
;   (avg [0 0 0 4]) ;=> 1
;   (avg [1 0 0 1]) ;=> 1/2 ;; or 0.5

(defn avg [a-seq]
  -1)


;-------------------------------------------------
; EXERCISE 6
; - - - - - -
; Write the function (parity a-seq) that 
;   takes in a sequence and 
;   returns a set of those elements that 
;     occur an odd number of times in the sequence. 
;
; Hint: Recall the fuction (toggle set elem) from Structured data
;   (toggle #{1 2 3} 1) ;=> #{2 3}
;   (toggle #{2 3} 1) ;=> #{1 2 3}
;
; Examples:
;   (parity [:a :b :c])           ;=> #{:a :b :c}
;   (parity [:a :b :c :a])        ;=> #{:b :c}
;   (parity [1 1 2 1 2 3 1 2 3 4] ;=> #{2 4}

(defn parity [a-seq]
  ":(")


;-------------------------------------------------
; EXERCISE 7
; - - - - - -
; Write the function (fast-fibo n) that 
;   computes the nth fibonacci number using loop and recur. 
;
; Do not use recursion.
;
; Hint: to avoid recursion, 
;       you need to keep track of Fn−1 and Fn in the loop.
;
; Examples:
;   (fast-fibo 0) ;=> 0
;   (fast-fibo 1) ;=> 1
;   (fast-fibo 2) ;=> 1
;   (fast-fibo 3) ;=> 2
;   (fast-fibo 4) ;=> 3
;   (fast-fibo 5) ;=> 5
;   (fast-fibo 6) ;=> 8

(defn fast-fibo [n]
  ":(")


;-------------------------------------------------
; EXERCISE 8
; - - - - - -
; Write the function (cut-at-repetition a-seq) that 
;   takes in a sequence and 
;   returns elements from the sequence up to the first repetition.
;
; Hint1: Remember that conjing onto a vector appends the element.
; Hint2: A set might be helpful
;
; Examples:
;   (cut-at-repetition [1 1 1 1 1])
;       ;=> [1] doesn't have to be a vector, a sequence is fine too
;   (cut-at-repetition [:cat :dog :house :milk 1 :cat :dog])
;       ;=> [:cat :dog :house :milk 1]
;   (cut-at-repetition [0 1 2 3 4 5])
;       ;=> [0 1 2 3 4 5]

(defn cut-at-repetition [a-seq]
  [":("])


;^^