(ns one-function-to-rule-them-all)


;------------------------------------------------------------------------------;
;            EXERCISES FOR PART 9: ONE FUNCTION TO RULE THEM ALL               ;
;       https://github.com/iloveponies/one-function-to-rule-them-all           ;
;               - - - - - - - - - - - - - - - - - - - - -                      ;
;          UNIVERSITY OF HELSINKI CLOJURE MOOC: I LOVE PONIES                  ;
;                   http://iloveponies.github.io                               ;
;------------------------------------------------------------------------------;

;-------------------------------------------------
; EXERCISE 1
; - - - - - -
; Write the function (concat-elements a-seq) that 
;   takes a sequence of sequences and 
;   concatenates them together with concat.
;
; Don’t use apply to implement this function.
;
; Examples:
;   (concat-elements [])            ;=> ()
;   (concat-elements [[1 2]])       ;=> (1 2)
;   (concat-elements [[1 2] [3 4]]) ;=> (1 2 3 4)

(defn concat-elements [a-seq]
  :-)


;-------------------------------------------------
; EXERCISE 2
; - - - - - -
; Write the function (str-cat a-seq) that 
;   takes a sequence of strings and 
;   catenates them with one space character between each.
; 
; You probably want to handle the special case 
;   of empty parameter outside reduce.
;
; Examples:
;   (str-cat ["I" "am" "Legend"])  ;=> "I am Legend"
;   (str-cat ["I" "am" "back"])    ;=> "I am back"
;   (str-cat ["more" " " "space"]) ;=> "more   space"
;   (str-cat [])                   ;=> ""

(defn str-cat [a-seq]
  :-)


;-------------------------------------------------
; EXERCISE 3
; - - - - - -
; Write the function (my-interpose x a-seq) that places x between every element of a-seq.
;
; Keep in mind how conj works for vectors.
;
; Examples:
;   (my-interpose 0 [1 2 3])               ;=> (1 0 2 0 3)
;   (my-interpose "," ["I" "me" "myself"]) ;=> ("I" "," "me" "," "myself")
;   (my-interpose :a [1])                  ;=> (1)
;   (my-interpose :a [])                   ;=> ()

(defn my-interpose [x a-seq]
  [:-])


;-------------------------------------------------
; EXERCISE 4
; - - - - - -
; Write the function (my-count a-seq) that 
;   returns the length of a sequence.
;
;  Do not use count in your implementation.
; 
; Examples:
;   (my-count [])      ;=> 0
;   (my-count [1 2 3]) ;=> 3
;   (my-count [1])     ;=> 1

(defn my-count [a-seq]
  :-)


;-------------------------------------------------
; EXERCISE 5
; - - - - - -
; Write the function (my-reverse a-seq) that 
;   reverses a sequence.
;
; Examples:
;   (my-reverse [1 2 3]) ;=> (3 2 1)
;   (my-reverse [1 2])   ;=> (2 1)
;   (my-reverse [])      ;=> ()

(defn my-reverse [a-seq]
  [:-])


;-------------------------------------------------
; EXERCISE 6
; - - - - - -
; Write the function (min-max-element a-seq) that 
;   returns the maximal and minimal elements 
;     of a-seq in a vertor like [min max].
;
; Examples:
;   (min-max-element [2 7 3 15 4]) ;=> [2 15]
;   (min-max-element [1 2 3 4])    ;=> [1 4]
;   (min-max-element [1])          ;=> [1 1]

(defn min-max-element [a-seq]
  [:-])


;-------------------------------------------------
; EXERCISE 7
; - - - - - -
; Write the function (insert sorted-seq n) that 
;    adds the number n into a sorted sequence of number. 
;
; The ordering of the sequence must be preserved.
;
; You don’t need to use reduce for this, 
; and you probably don’t want to.
;
; Then implement (insertion-sort a-seq) 
;    using reduce and 
;    the function insert.
;
; Examples:
;   (insert [] 2)      ;=> (2)
;   (insert [1 3 4] 2) ;=> (1 2 3 4)
;   (insert [1] 2)     ;=> (1 2)
;
;   (insertion-sort [2 5 3 1]) ;=> (1 2 3 5)
;   (insertion-sort [1 2])     ;=> (1 2)

(defn insert [sorted-seq n]
  [:-])

(defn insertion-sort [a-seq]
  [:-])


;-------------------------------------------------
; EXERCISE 8
; - - - - - -
; Write the fuction (parity a-seq) that 
;   picks into a set those elements of a-seq 
;   that occur odd number of time.
;
; Examples:
;   (parity [:a :b :c])    ;=> #{:a :b :c}
;   (parity [:a :a :b :b]) ;=> #{}
;   (parity [1 2 3 1])     ;=> #{2 3}

(defn parity [a-seq]
  [:-])



;-------------------------------------------------
; EXERCISE 9
; - - - - - -
; Write the function minus that takes one or two parameters.
;   If given a one parameter x, it returns −x.
;   If given to parameters x and y, it returns x−y.
;
; Examples:
;   (minus 2)   ;=> -2
;   (minus 4 3) ;=> 1

(defn minus [x]
  :-)

;-------------------------------------------------
; EXERCISE 10
; - - - - - -
; Write the function count-params that 
;   accepts any number of parameters and 
;   returns how many it was called with. 
; 
; You need only a one definition for this.
;
; Examples:
;   (count-params)            ;=> 0
;   (count-params :a)         ;=> 1
;   (count-params :a 1 :b :c) ;=> 4

(defn count-params [x]
  :-)


;-------------------------------------------------
; EXERCISE 11
; - - - - - -
; Write the function my-* that takes any number of parameters.
;   If no parameters are given, return 1
;   If one parameter x is given, return x.
;   If two parameters x and y are given, return xy.
;   If more than two parameters x, y, … are given, return their product x⋅y⋯.
;
; You are free to use *, but not apply.
;
; Examples:
;   (my-*)           ;=> 1
;   (my-* 4 3)       ;=> 12
;   (my-* 1 2 3 4 5) ;=> 120

(defn my-* [x]
  :-)


;-------------------------------------------------
; EXERCISE 12
; - - - - - -
; Remember the function pred-and that you implemented in Predicates?
;
; Write a new definition for it that works for any amount of parameters.
;    -If no parameters are given, return a predicate that 
;       always returns true.
;    -If only one predicate p is given, 
;       return p.
;    -If two predicates are given, return a predicate that 
;          returns true if both of them return true and 
;          false otherwise.
;    -If more than two predicates are given, return a predicate that 
;          returns true only if all of the predicates return true and 
;          false otherwise.
;
; Examples:
;   (filter (pred-and) [1 0 -2])                    
;          ;=> (1 0 -2)
;   (filter (pred-and pos? odd?) [1 2 -4 0 6 7 -3]) 
;           ;=> (1 7)
;   (filter (pred-and number? integer? pos? even?) [1 0 -2 :a 7 "a" 2])                    
;          ;=> (0 2)

(defn pred-and [x]
  (fn [x] :-))



;*************************************************
; ENCORE EXERCISES 13                            ;
; The next exercise is a bit trickier.           ;
;*************************************************

;-------------------------------------------------
; EXERCISE 13
; - - - - - -
; Write the function my-map that works just like standard map. 
;
; It takes one or more sequences and a function f 
;   that takes as many parameters as there are sequences.
;
; Examples:
;    (my-map inc [1 2 3 4])                  
;          ;=> (2 3 4 5)
;    (my-map + [1 1 1] [1 1 1] [1 1 1])      
;          ;=> (3 3 3)
;    (my-map vector [1 2 3] [1 2 3] [1 2 3]) 
;          ;=> ((1 1 1) (2 2 2) (3 3 3))

(defn my-map [f a-seq]
  [:-])


;^^