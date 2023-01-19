(ns predicates)

(defn whitespace? [character]
  (Character/isWhitespace character))

(def china {:name "China Miéville", 
            :birth-year 1972})

(def octavia {:name "Octavia E. Butler"
              :birth-year 1947
              :death-year 2006})

(def kay {:name "Guy Gavriel Kay" 
          :birth-year 1954})

(def dick {:name "Philip K. Dick", 
           :birth-year 1928, 
           :death-year 1982})

(def zelazny {:name "Roger Zelazny", 
              :birth-year 1937, 
              :death-year 1995})

(def authors #{china, octavia, kay, dick, zelazny})

(def cities {:title "The City and the City" 
             :authors #{china}
             :awards #{:locus, :world-fantasy, :hugo}})

(def wild-seed {:title "Wild Seed", 
                :authors #{octavia}})

(def lord-of-light {:title "Lord of Light", 
                    :authors #{zelazny}
                    :awards #{:hugo}})

(def deus-irae {:title "Deus Irae", 
                :authors #{dick, zelazny}})
(def ysabel {:title "Ysabel", 
             :authors #{kay}, 
             :awards #{:world-fantasy}})

(def scanner-darkly {:title "A Scanner Darkly" 
                     :authors #{dick}})

(def books #{cities, wild-seed, lord-of-light, deus-irae, ysabel, scanner-darkly})


;------------------------------------------------------------------------------;
;                 EXERCISES FOR PART 6: PREDICATES                             ;
;              https://github.com/iloveponies/predicates                       ;
;               - - - - - - - - - - - - - - - - - - - - -                      ;
;          UNIVERSITY OF HELSINKI CLOJURE MOOC: I LOVE PONIES                  ;
;                   http://iloveponies.github.io                               ;
;------------------------------------------------------------------------------;

;-------------------------------------------------
; EXERCISE 1
; - - - - - -
; Write the function (sum-f f g x) that 
;   returns (+ (f x) (g x)).
;
; Examples:
;   (sum-f inc dec 4)      ;=> 8
;   (sum-f inc identity 5) ;=> 11
;   (sum-f identity - 10)  ;=> 0

(defn sum-f [f g x]
  :-)


;-------------------------------------------------
; EXERCISE 2
; - - - - - -
; Write the functions (less-than n) and (equal-to n) that 
;    work like greater-than. 
; Use == as comparison in equal-to
;
; Examples:
;   (filter (less-than 3) [1 2 3 4 5])   ;=> (1 2)
;   (filter (less-than 4) [-2 12 3 4 0]) ;=> (-2 3 0)
;   (filter (equal-to 2) [2 1 3 2.0])    ;=> (2 2.0)
;   (filter (equal-to 2) [3 4 5 6])      ;=> ()

(defn less-than [n]
  :-)

(defn equal-to [n]
  :-)


;-------------------------------------------------
; EXERCISE 3
; - - - - - -
; Write the function (set->predicate a-set) that 
;   takes a-set as a parameter and 
;   returns a predicate that takes x as a parameter and
;      -returns true if x is in a-set
;      -otherwise returns false
;
; Examples:
;    (filter (set->predicate #{1 2 3})     [0 2 4 6])       ;=> (2)
;    (filter (set->predicate #{1 2 3 nil}) [2 nil 4 nil 6]) ;=> (2 nil nil)

(defn set->predicate [a-set]
  :-)


;-------------------------------------------------
; EXERCISE 4
; - - - - - -
; Write the function (pred-and pred1 pred2) that 
;   returns a new predicate that:
;      -returns true if both pred1 and pred2 return true
;      -otherwise returns false
;
; Suppose I wanted all even positive numbers from a sequence. 
; With pred-and, this should be easy.
;    
; Examples:
;   (filter (pred-and pos? even?) [1 2 -4 0 6 7 -3])  
;        ;=> [2 6]
;   (filter (pred-and pos? odd?) [1 2 -4 0 6 7 -3])   
;        ;=> [1 7]
;   (filter (pred-and (complement nil?) empty?) [[] '() nil {} #{}])
;        ;=> [[] '() {} #{}]

(defn pred-and [pred1 pred2]
  :-)


;-------------------------------------------------
; EXERCISE 5
; - - - - - -
; Write the function (pred-or pred1 pred2) that 
;    takes two predicates and 
;    returns a new predicate that:
;       -returns true if pred1 or pred2 returns true
;       -otherwise returns false
;
; Examples:
;   (filter (pred-or pos? odd?) [1 2 -4 0 6 7 -3])  ;=> [1 2 6 7 -3]
;   (filter (pred-or pos? even?) [1 2 -4 0 6 7 -3]) ;=> [1 2 -4 0 6 7]

(defn pred-or [pred1 pred2]
  :-)


;-------------------------------------------------
; EXERCISE 6
; - - - - - -
;  Write the function (blank? string) that 
;    takes a string as a parameter and 
;    returns true if string is empty, nil, or contains only whitespace.
;
; Remember that strings can be used as a sequence of characters 
; with sequence functions like every?.
;
; A function whitespace? that tells if a character is whitespace 
; is defined for you in this source file.
;
; Examples:
;    (blank? " \t\n\t ") ;=> true
;    (blank? "  \t a")   ;=> false
;    (blank? "")         ;=> true

(defn blank? [string]
  :-)


;-------------------------------------------------
; EXERCISE 7
; - - - - - -
; Write the function (has-award? book award) that 
;   returns true if book has won award.
;
; Examples:
;    (has-award? ysabel :world-fantasy) ;=> true
;    (has-award? scanner-darkly :hugo)  ;=> false

(defn has-award? [book award]
  :-)


;-------------------------------------------------
; EXERCISE 8
; - - - - - -
; Write the function (HAS-ALL-THE-AWARDS? book awards) that 
;    returns true if book has won every award in awards.
;
; Examples:
;   (HAS-ALL-THE-AWARDS? cities #{:locus})
;       ;=> true
;   (HAS-ALL-THE-AWARDS? cities #{:locus :world-fantasy :hugo})
;       ;=> true
;   (HAS-ALL-THE-AWARDS? cities #{:locus :world-fantasy :hugo :pulitzer})
;       ;=> false
;   (HAS-ALL-THE-AWARDS? lord-of-light #{:locus :world-fantasy :hugo})
;       ;=> false
;   (HAS-ALL-THE-AWARDS? lord-of-light #{:hugo})
;       ;=> true
;   (HAS-ALL-THE-AWARDS? scanner-darkly #{})
;       ;=> true


(defn HAS-ALL-THE-AWARDS? [book awards]
  :-)


;-------------------------------------------------
; EXERCISE 9
; - - - - - -
; Write you own implementation for some called my-some.
;
; Hint: You might find map, filter and first useful 
; (you won’t necessarily need them all).
;
; Examples:
;   (my-some even? [1 3 5 7])       ;=> falsey
;   (my-some even? [1 3 5 7 8])     ;=> true
;   (my-some neg? [1 3 5 0 7 8])    ;=> falsey
;   (my-some neg? [1 3 5 0 7 -1 8]) ;=> true
;   (my-some neg? [])               ;=> falsey
;   (my-some first [[false] [1]])   ;=> 1
;   (my-some first [[false] []])    ;=> falsey
;   (my-some nil? [1 2])            ;=> falsey
;   (my-some nil? [1 nil 2])        ;=> true

(defn my-some [pred a-seq]
  :-)


;-------------------------------------------------
; EXERCISE 10
; - - - - - -
; Write your own implementation for every? called my-every?.
;
; Hint: the previous hint applies. 
; empty? and complement might come in handy as well.
;
; Examples:
;   (my-every? pos? [1 2 3 4])   ;=> true
;   (my-every? pos? [1 2 3 4 0]) ;=> false
;   (my-every? even? [2 4 6])    ;=> true
;   (my-every? even? [])         ;=> true

(defn my-every? [pred a-seq]
  :-)


;-------------------------------------------------
; EXERCISE 11
; - - - - - -
; Write the function (prime? n) that 
;   returns true if n is a prime number and 
;   otherwise false.
;
; The function (range k n) returns the sequence
;    (k (+ k 1) (+ k 2) ... (- n 1))
;
; Here’s a concrete example:
;   (range 2 10)   ;=> (2 3 4 5 6 7 8 9)
;
; A positive integer p is a prime number 
; if the only positive numbers dividing p are p and 1.
;
; Your solution should be of the form
;    (defn prime? [n]
;        (let [pred ...]
;            (not (some pred (range 2 n)))))
;
; Examples:
;   (prime? 4)                   ;=> false
;   (prime? 7)                   ;=> true
;   (prime? 10)                  ;=> false
;   (filter prime? (range 2 50)) ;=> (2 3 5 7 11 13 17 19 23 29 31 37 41 43 47)

(defn prime? [n]
  :-)

;^^