(ns recursion)


;------------------------------------------------------------------------------;
;                 EXERCISES FOR PART 7: RECURSION                              ;
;                https://github.com/iloveponies/recursion                      ;
;               - - - - - - - - - - - - - - - - - - - - -                      ;
;          UNIVERSITY OF HELSINKI CLOJURE MOOC: I LOVE PONIES                  ;
;                   http://iloveponies.github.io                               ;
;------------------------------------------------------------------------------;

;-------------------------------------------------
; EXERCISE 1
; - - - - - -
; Write the function (product coll) that 
;   computes the product of a collection of values. 
; 
; The product of a, b and c is a∗b∗c.
;
; Examples:
;   (product [])        ;=> 1  ; special case
;   (product [1 2 3])   ;=> 6
;   (product [1 2 3 4]) ;=> 24
;   (product [0 1 2])   ;=> 0
;   (product #{2 3 4})  ;=> 24 ; works for sets too!

(defn product [coll]
  :-)


;-------------------------------------------------
; EXERCISE 2
; - - - - - -
; Write down the evaluation of (product [1 2 4]) 
; like we did for sum in the tutorial. 
; 
  


;-------------------------------------------------
; EXERCISE 3
; - - - - - -
; Write the function (singleton? coll) which 
;   returns true if the collection has only one element in it and 
;   false otherwise. 
; 
; This is a very useful helper function in the remainder of this chapter.
;
; Do not use count as it can be expensive on long sequences. 
; This function is not recursive.
;
; Examples:
;   (singleton? [1])     ;=> true
;   (singleton? #{2})    ;=> true
;   (singleton? [])      ;=> false
;   (singleton? [1 2 3]) ;=> false

(defn singleton? [coll]
  :-)


;-------------------------------------------------
; EXERCISE 4
; - - - - - -
; Write (my-last a-seq) that computes the last element of a sequence.
;
; Hint: what is the base case here? How can you check if you’re there?
; 
; Examples:
;   (my-last [])      ;=> nil
;   (my-last [1 2 3]) ;=> 3
;   (my-last [2 5])   ;=> 5

(defn my-last [coll]
  :-)


;-------------------------------------------------
; EXERCISE 5
; - - - - - -
; Write the function (max-element a-seq) that
;   computes returns the maximum element in a-seq 
;   or nil if a-seq is empty?
;
; You can use the function (max a b) that 
;    returns the greater of a and b.
;
; Examples:
;   (max-element [2 4 1 4]) ;=> 4
;   (max-element [2])       ;=> 2
;   (max-element [])        ;=> nil

(defn max-element [a-seq]
  :-)


;-------------------------------------------------
; EXERCISE 6
; - - - - - -
; Write the function (seq-max seq-1 seq-2) that 
;   returns the longer one of seq-1 and seq-2. 
;
; This is a helper for the next exercise. 
; You do not need to use recursion here. It is okay to use count.
;
; Examples:
;   (seq-max [1] [1 2])   ;=> [1 2]
;   (seq-max [1 2] [3 4]) ;=> [3 4]

(defn seq-max [seq-1 seq-2]
  [:-])


;-------------------------------------------------
; EXERCISE 7
; - - - - - -
; Write the function (longest-sequence a-seq) that 
;   takes a sequence of sequences as a parameter and 
;   returns the longest one.
;
; Examples:
;   (longest-sequence [[1 2] [] [1 2 3]]) ;=> [1 2 3]
;   (longest-sequence [[1 2]])            ;=> [1 2]
;   (longest-sequence [])                 ;=> nil

(defn longest-sequence [a-seq]
  [:-])


;-------------------------------------------------
; EXERCISE 8
; - - - - - -
; Implement the function (my-filter pred? a-seq) that 
;    works just like the standard filter.
;
; Don’t use remove.
;
; Examples:
;   (my-filter odd? [1 2 3 4])                      ;=> (1 3)
;   (my-filter (fn [x] (> x 9000)) [12 49 90 9001]) ;=> (9001)
;   (my-filter even? [1 3 5 7])                     ;=> ()

(defn my-filter [pred? a-seq]
  [:-])


;-------------------------------------------------
; EXERCISE 9
; - - - - - -
; Write the function (sequence-contains? elem a-seq) that 
;   returns true if the given sequence contains the given value, 
;   otherwise false.
;
; Hint: remember to stop searching when you find it.
;
; Examples:
;   (sequence-contains? 3 [1 2 3]) ;=> true
;   (sequence-contains? 3 [4 7 9]) ;=> false
;   (sequence-contains? :pony [])  ;=> false

(defn sequence-contains? [elem a-seq]
  :-)


;-------------------------------------------------
; EXERCISE 10
; - - - - - -
; Write the function (my-take-while pred? a-seq) that 
;   returns the longest prefix of a-seq 
;   where pred? returns true for every element.
;
; Examples:
;   (my-take-while odd? [1 2 3 4])  ;=> (1)
;   (my-take-while odd? [1 3 4 5])  ;=> (1 3)
;   (my-take-while even? [1 3 4 5]) ;=> ()
;   (my-take-while odd? [])         ;=> ()

(defn my-take-while [pred? a-seq]
  [:-])


;-------------------------------------------------
; EXERCISE 11
; - - - - - -
; Write the function (my-drop-while pred? a-seq) that 
;   drops elements from a-seq until pred? returns false.
;
; Examples:
;   (my-drop-while odd? [1 2 3 4])  ;=> (2 3 4)
;   (my-drop-while odd? [1 3 4 5])  ;=> (4 5)
;   (my-drop-while even? [1 3 4 5]) ;=> (1 3 4 5)
;   (my-drop-while odd? [])         ;=> ()

(defn my-drop-while [pred? a-seq]
  [:-])


;-------------------------------------------------
; EXERCISE 12
; - - - - - -
; Write the function (seq= seq-1 seq-2) that 
;   compares two sequences for equality.
;
; Examples:
;   (seq= [1 2 4] '(1 2 4))  ;=> true
;   (seq= [1 2 3] [1 2 3 4]) ;=> false
;   (seq= [1 3 5] [])        ;=> false

(defn seq= [a-seq b-seq]
  :-)


;-------------------------------------------------
; EXERCISE 13
; - - - - - -
; Write the function (my-map f seq-1 seq-2) that 
;   returns a sequence of the following kind.
;
; The first item is the return value of f 
;   called with the first values of seq-1 and seq-2. 
; The second item is the return value of f called 
;   with the second values of seq-1 and seq-2 
; and so forth until seq-1 or seq-2 ends.
;
; This is actually exactly how map works when given two sequences, 
; but for the sake of practice don’t use map when defining my-map.
;
; Examples:
;   (my-map + [1 2 3] [4 4 4])   ;=> (5 6 7)
;   (my-map + [1 2 3 4] [0 0 0]) ;=> (1 2 3)
;   (my-map + [1 2 3] [])        ;=> ()

(defn my-map [f seq-1 seq-2]
  [:-])


;-------------------------------------------------
; EXERCISE 14
; - - - - - -
; Write the function (power n k) that 
;    computes the mathematical expression n^k.
;
; Examples:
;   (power 2 2)  ;=> 4
;   (power 5 3)  ;=> 125
;   (power 7 0)  ;=> 1
;   (power 0 10) ;=> 0

(defn power [n k]
  :-)


;-------------------------------------------------
; EXERCISE 15
; - - - - - -
; Compute the nth Fibonacci number. 
;
; The nth Fibonacci number, Fn, is defined as:
;   F0 = 0
;   F1 = 1
;   Fn = Fn − 1 + Fn − 2
;
; Write the function (fib n) which returns Fn
;
; Examples:
;   (fib 0) ;=> 0
;   (fib 1) ;=> 1
;   (fib 2) ;=> 1
;   (fib 3) ;=> 2
;   (fib 4) ;=> 3
;   (fib 5) ;=> 5
;   (fib 6) ;=> 8
;   ...
;   (fib 10) ;=> 55

(defn fib [n]
  :-)


;-------------------------------------------------
; EXERCISE 16
; - - - - - -
; Write the function (my-repeat how-many-times what-to-repeat) that 
;   generates a list with 
;   what-to-repeat repeated how-many-times number of times.
;
; Examples:
;   (my-repeat 2 :a)    ;=> (:a :a)
;   (my-repeat 3 "lol") ;=> ("lol" "lol" "lol")
;   (my-repeat -1 :a)   ;=> ()

(defn my-repeat [how-many-times what-to-repeat]
  [:-])


;-------------------------------------------------
; EXERCISE 17
; - - - - - -
; Write the function (my-range up-to) that works like this:
;
; Examples:
;   (my-range 0)  ;=> ()
;   (my-range 1)  ;=> (0)
;   (my-range 2)  ;=> (1 0)
;   (my-range 3)  ;=> (2 1 0)

(defn my-range [up-to]
  [:-])


;-------------------------------------------------
; EXERCISE 18
; - - - - - -
; Write the functions tails and inits that 
;   return all the suffixes and prefixes of a sequence, 
;   respectively.
;
; You can output the tails and inits in any order you like.
;
; Hint: You can use reverse and map.
;   (reverse [1 2 3]) ;=> (3 2 1)
;   (reverse [2 3 1]) ;=> (1 3 2)
;
; Examples:
;   (tails [1 2 3 4]) ;=> ((1 2 3 4) (2 3 4) (3 4) (4) ())
;   (inits [1 2 3 4]) ;=> (() (1) (1 2) (1 2 3) (1 2 3 4))
;   (inits [1 2 3 4]) ;=> ((1 2) () (1 2 3) (1) (1 2 3 4))

(defn tails [a-seq]
  [:-])

(defn inits [a-seq]
  [:-])


;-------------------------------------------------
; EXERCISE 19
; - - - - - -
; Write the function (rotations a-seq) that, 
;   when given a sequence, 
;   returns all the rotations of that sequence.
;
; The order of rotations does not matter.
;
; Keep in mind the function concat.
;   (concat [1 2 3] [:a :b :c]) ;=> (1 2 3 :a :b :c)
;   (concat [1 2] [3 4 5 6])    ;=> (1 2 3 4 5 6)
;
; Examples:
;   (rotations [])        ;=> (())
;   (rotations [1 2 3])   ;=> ((1 2 3) (2 3 1) (3 1 2))
;   (rotations [:a :b])   ;=> ((:a :b) (:b :a))
;   (rotations [:a :b])   ;=> ((:b :a) (:a :b))
;   (rotations [1 5 9 2]) ;=> ((1 5 9 2) (2 1 5 9) (9 2 1 5) (5 9 2 1))
;   (count (rotations [6 5 8 9 2])) ;=> 5

(defn rotations [a-seq]
  [:-])



;-------------------------------------------------
; EXERCISE 20
; - - - - - -
; Write the function (my-frequencies a-seq) that 
;    computes a map of how many times each element occurs in a sequence. 
;
; You’ll want to structure your code like this,
;  my-frequencies-helper is a recursive helper function:
;       
;        (defn my-frequencies-helper [freqs a-seq]
;         ...)
;
;        (defn my-frequencies [a-seq]
;         (frequencies-helper {} a-seq))
;   
; Examples:
;   (my-frequencies []) 
;       ;=> {}
;   (my-frequencies [:a "moi" :a "moi" "moi" :a 1]) 
;       ;=> {:a 3, "moi" 3, 1 1}

(defn my-frequencies-helper [freqs a-seq]
  [:-])

(defn my-frequencies-helper [freqs a-seq]
  [:-])


;-------------------------------------------------
; EXERCISE 21
; - - - - - -
; Write the function (un-frequencies a-map) which 
;   takes a map produced by my-frequencies and 
;   generates a sequence 
;      with the corresponding numbers of different elements.
;
; The order of elements in the output sequence doesn’t matter.
;
; Hint 1: Remember that you can use first and rest on a map too!
;    (first {:a 1 :b 2}) ;=> [:a 1]
;    (rest {:a 1 :b 2 :c 3}) ;=> ([:b 2] [:c 3])
;
; Hint 2: There are multiple ways to implement this, 
;         but consider using concat and repeat.
;
; Examples:
;   (un-frequencies {:a 3 :b 2 "^_^" 1})             
;      ;=> (:a :a :a "^_^" :b :b)
;   (un-frequencies (my-frequencies [:a :b :c :a]))  
;      ;=> (:a :a :b :c)
;   (my-frequencies (un-frequencies {:a 100 :b 10})) 
;      ;=> {:a 100 :b 10}

(defn un-frequencies [a-map]
  [:-])


;-------------------------------------------------
; EXERCISE 22
; - - - - - -
; Implement (my-take n coll) that 
;   returns n first items of coll.
;
; Examples:
;   (my-take 2 [1 2 3 4]) ;=> (1 2)
;   (my-take 4 [:a :b])   ;=> (:a :b)


(defn my-take [n coll]
  [:-])


;-------------------------------------------------
; EXERCISE 23
; - - - - - -
; Implement (my-drop n coll) that 
;   returns all but the n first items of coll.
;
; Examples:
;   (my-drop 2 [1 2 3 4]) ;=> (3 4)
;   (my-drop 4 [:a :b])   ;=> ()

(defn my-drop [n coll]
  [:-])


;-------------------------------------------------
; EXERCISE 24
; - - - - - -
; Implement the function (halve a-seq) that 
;   takes a sequence and 
;   returns one vector with two elements. 
;
; The first element is the first half of a-seq and 
; the second element is the second half of a-seq.
;
;To turn a result of division into an integer use int.
;   (int (/ 7 2)) ;=> 3
;
; Examples:
;   (halve [1 2 3 4])   ;=> [(1 2) (3 4)]
;   (halve [1 2 3 4 5]) ;=> [(1 2) (3 4 5)]
;   (halve [1])         ;=> [() (1)]

(defn halve [a-seq]
  [:-])

;-------------------------------------------------
; EXERCISE 25
; - - - - - -
; Write the function (seq-merge a-seq b-seq) that 
;    takes two (low to high) sorted number sequences and 
;    combines them into one sorted sequence. 
;
; Don’t use sort (nor implement it yourself, yet).
;
; Examples:
;   (seq-merge [4] [1 2 6 7])        ;=> (1 2 4 6 7)
;   (seq-merge [1 5 7 9] [2 2 8 10]) ;=> (1 2 2 5 7 8 9 10)

(defn seq-merge [a-seq b-seq]
  [:-])


;-------------------------------------------------
; EXERCISE 26
; - - - - - -
; Write the function (merge-sort a-seq) that implements merge sort.
; 
; The idea of merge sort is to 
;   divide the input into subsequences using halve, 
;   sort the subsequences recursively and 
;   use the seq-merge function to 
;       merge the sorted subsequences back together.
;
;
; Conceptually:
;   If the sequence is 0 or 1 elements long, it is already sorted.
;   Otherwise, divide the sequence into two subsequences.
;   Sort each subsequence recursively.
;   Merge the two subsequences back into one sorted sequence.
;
;     (merge-sort [4 2 3 1])
; ;=> (seq-merge (merge-sort (4 2))
; ;              (merge-sort (3 1)))
; ;=> (seq-merge (seq-merge (merge-sort (4))
; ;                         (merge-sort (2)))
; ;              (seq-merge (merge-sort (3))
; ;                         (merge-sort (1))))
; ;=> (seq-merge (seq-merge (4) (2))
; ;              (seq-merge (3) (1)))
; ;=> (seq-merge (2 4) (1 3))
; ;=> (1 2 3 4)
;
;
; Examples:
;   (merge-sort [])                 ;=> ()
;   (merge-sort [1 2 3])            ;=> (1 2 3)
;   (merge-sort [5 3 4 17 2 100 1]) ;=> (1 2 3 4 5 17 100)

(defn merge-sort [a-seq]
  [:-])


;*************************************************
; ENCORE EXERCISES 27-29                         ;
; The following exercises are ment to be tricky. ;
; So don’t dwell too long on them.               ;  
; Move along and come back later.                ;
;*************************************************

;-------------------------------------------------
; EXERCISE 27
; - - - - - -
; Write the function split-into-monotonics that 
;   takes a sequence and 
;   returns the sequence split into monotonic pieces. 
;
; Hint: You might find useful the functions take-while, drop and inits. 
; Make sure that your inits 
;   returns the prefixes from the shortest to the longest:
;      (inits [1 2 3 4]) ;=> (() (1) (1 2) (1 2 3) (1 2 3 4))
;
; Examples:
;   (split-into-monotonics [0 1 2 1 0])   ;=> ((0 1 2) (1 0))
;   (split-into-monotonics [0 5 4 7 1 3]) ;=> ((0 5) (4 7) (1 3))

(defn split-into-monotonics [a-seq]
  [:-])



;-------------------------------------------------
; EXERCISE 28
; - - - - - -
; Given a sequence, return all permutations of that sequence.
; 
; The order of the permutations doesn’t matter.
;
; Examples:
;   (permutations #{})
;       ;=> (())
;   (permutations #{1 5 3})
;       ;=> ((1 5 3) (5 1 3) (5 3 1) (1 3 5) (3 1 5) (3 5 1))

(defn permutations [a-set]
  [:-])


;-------------------------------------------------
; EXERCISE 29
; - - - - - -
; Given a set, return the powerset of that set.
;
; Examples:
;   (powerset #{}) ;=> #{#{}}
;        
;   (powerset #{1 2 4}) 
;        ;=> #{#{} #{4} #{2} #{2 4} #{1} #{1 4} #{1 2} #{1 2 4}}

(defn powerset [a-set]
  [:-])

;^^