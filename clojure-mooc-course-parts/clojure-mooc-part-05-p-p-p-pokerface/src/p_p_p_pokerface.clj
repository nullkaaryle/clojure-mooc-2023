(ns p-p-p-pokerface)

;------------------------------------------------------------------------------;
;                 EXERCISES FOR PART 5: P-P-P-POKERFACE                        ;
;            https://github.com/iloveponies/p-p-p-pokerface                    ;
;               - - - - - - - - - - - - - - - - - - - - -                      ;
;          UNIVERSITY OF HELSINKI CLOJURE MOOC: I LOVE PONIES                  ;
;                   http://iloveponies.github.io                               ;
;------------------------------------------------------------------------------;

;-------------------------------------------------
; EXERCISE 1
; - - - - - -
; Write the function (suit card) which 
;   takes a singe card and 
;   returns the suit of the card as a one character string.
;
; Examples:
;   (suit "2H") ;=> "H"
;   (suit "2D") ;=> "D"
;   (suit "2C") ;=> "C"
;   (suit "3S") ;=> "S"

(defn suit [card]
  nil)



;-------------------------------------------------
; EXERCISE 2
; - - - - - -
; Write the function (rank card) which 
;   takes a single card and 
;   returns the rank as a number between 2 and 14.
;
; Examples:
;    (rank "2H") ;=> 2
;    (rank "4S") ;=> 4
;    (rank "TS") ;=> 10
;    (rank "JS") ;=> 11
;    (rank "QS") ;=> 12
;    (rank "KS") ;=> 13
;    (rank "AS") ;=> 14

(defn rank [card]
  nil)


;-------------------------------------------------
; EXERCISE 3
; - - - - - -
; Write the function (pair? hand) that 
;    returns true if there is a pair in hand and 
;    false if there is no pair in hand.
;
; Examples:
;    (pair? pair-hand)  ;=> true
;    (pair? high-seven) ;=> false

(defn pair? [hand]
  nil)



;-------------------------------------------------
; EXERCISE 4
; - - - - - -
; Write the function (three-of-a-kind? hand) that 
;    returns true if the hand contains a three of a kind.
;
; Examples:
;   (three-of-a-kind? two-pairs-hand)       ;=> false
;   (three-of-a-kind? three-of-a-kind-hand) ;=> true

(defn three-of-a-kind? [hand]
  nil)


;-------------------------------------------------
; EXERCISE 5
; - - - - - -
; Write the function (four-of-a-kind? hand) that 
;   returns true if the hand contains a four of a kind.
;
; Examples:
;   (four-of-a-kind? two-pairs-hand)      ;=> false
;   (four-of-a-kind? four-of-a-kind-hand) ;=> true

(defn four-of-a-kind? [hand]
  nil)


;-------------------------------------------------
; EXERCISE 6
; - - - - - -
;  Write the function (flush? hand) that 
;    returns true if the hand is a flush.
;
; Examples:
;    (flush? pair-hand)  ;=> false
;    (flush? flush-hand) ;=> true)

(defn flush? [hand]
  nil)


;-------------------------------------------------
; EXERCISE 7
; - - - - - -
; Write the function (full-house? hand) that 
;    returns true if hand is a full house, and 
;    otherwise false.
;
; Examples:
;    (full-house? three-of-a-kind-hand) ;=> false
;    (full-house? full-house-hand)      ;=> true

(defn full-house? [hand]
  nil)


;-------------------------------------------------
; EXERCISE 8
; - - - - - -
; Write the function (two-pairs? hand) that 
;   returns true if hand has two pairs, and 
;   otherwise false.
;
; Note that a four of a kind is also two pairs.
;
; Examples:
;   (two-pairs? two-pairs-hand)      ;=> true
;   (two-pairs? pair-hand)           ;=> false
;   (two-pairs? four-of-a-kind-hand) ;=> true


(defn two-pairs? [hand]
  nil)


;-------------------------------------------------
; EXERCISE 9
; - - - - - -
; Write the function (straight? hand) that 
;   returns true if hand is a straight, and 
;   otherwise false.
;
; Note that an ace is accepted both as a rank 1 and rank 14 card in straights.
;
; Examples:
;   (straight? two-pairs-hand)             ;=> false
;   (straight? straight-hand)              ;=> true
;   (straight? low-ace-straight-hand)      ;=> true
;   (straight? ["2H" "2D" "3H" "4H" "5H"]) ;=> false
;   (straight? high-ace-straight-hand)     ;=> true

(defn straight? [hand]
  nil)


;-------------------------------------------------
; EXERCISE 10
; - - - - - -
; Write the function (straight-flush? hand) which 
;    returns true if the hand is a straight flush, 
;         that is both a straight and a flush, and 
;    otherwise false.
;
; Examples:
;   (straight-flush? straight-hand)                ;=> false
;   (straight-flush? flush-hand)                   ;=> false
;   (straight-flush? straight-flush-hand)          ;=> true
;   (straight-flush? low-ace-straight-flush-hand)  ;=> true
;   (straight-flush? high-ace-straight-flush-hand) ;=> true

(defn straight-flush? [hand]
  nil)


;-------------------------------------------------
; EXERCISE 11
; - - - - - -
; Write the function (value hand), which 
;    returns the value of a hand according to the table:

; Hand                 Value
;  High card (nothing)  0
;  Pair                 1
;  Two pairs            2
;  Three of a kind      3
;  Straight             4
;  Flush                5
;  Full house           6
;  Four of a kind       7
;  Straight flush       8
;
; It might be helpful to add a checker (high-card? hand):
;    (defn high-card? [hand]   => true) ; All hands have a high card.
;
; You can create a sequence of [matcher value] pairs like so:
;   (let [checkers #{[high-card? 0]  [pair? 1]
;                   [two-pairs? 2]  [three-of-a-kind? 3]
;                   [straight? 4]   [flush? 5]
;                   [full-house? 6] [four-of-a-kind? 7]
;                   [straight-flush? 8]}]
;   ...)
;
; You can now use filter, map and apply max 
; to get the highest value that a hand has. 
; The function second can be useful. 
; Remember to use let to give the intermediate results readable names.
;     (second [:i :am :a :sequence]) ;=> :am
;     (second [two-pairs? 2])        ;=> 2
;
; Examples:
;   (value high-seven)           ;=> 0
;   (value pair-hand)            ;=> 1
;   (value two-pairs-hand)       ;=> 2
;   (value three-of-a-kind-hand) ;=> 3
;   (value straight-hand)        ;=> 4
;   (value flush-hand)           ;=> 5
;   (value full-house-hand)      ;=> 6
;   (value four-of-a-kind-hand)  ;=> 7
;   (value straight-flush-hand)  ;=> 8

(defn straight-flush? [hand]
  nil)

