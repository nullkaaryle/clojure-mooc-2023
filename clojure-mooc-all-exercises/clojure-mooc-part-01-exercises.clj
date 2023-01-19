(ns training-day)

(def hai "O HAI!")


;------------------------------------------------------------------------------;
;                  EXERCISES FOR PART 1: TRAINING DAY                          ;
;              https://github.com/iloveponies/training-day                     ;
;               - - - - - - - - - - - - - - - - - - - - -                      ;
;          UNIVERSITY OF HELSINKI CLOJURE MOOC: I LOVE PONIES                  ;
;                     http://iloveponies.github.io                             ;
;------------------------------------------------------------------------------;


; Exercises 1-4 are done in REPL. 
; Exercises starting from 5 are the exercises 
; in which you need to modify this file (src/training_day.clj). 
; Remember to run the tests with lein midje.

;-------------------------------------------------
; EXERCISE 1
; - - - - - -
; Write the following expression in the Clojure prefix syntax: 
; (2∗3)+4. Try evaluating it in the REPL. The result should be 10. 


;-------------------------------------------------
; EXERCISE 2
; - - - - - -
; Write the expression 3+4+5+6 in Clojure syntax. 
; Evaluate it in the REPL. 


;-------------------------------------------------
; EXERCISE 3
; - - - - - -
; Write a Clojure expression in the REPL that, 
; using get, gets the first character in the string "abrakadabra". 


;-------------------------------------------------
; EXERCISE 4
; - - - - - -
; Call the following function in the REPL with your name.
; (fn [name] (str "Welcome to Rivendell mr " name))


;-------------------------------------------------
; EXERCISE HAI FROM TUTORIAL
; - - - - - -
; Now as you have your REPLs open, write the following in it.
;   (use 'training-day)
;   hai
;
; Were you greeted in all CAPS? If not, please raise your hand.
;
; What use did was that it looked inside the namespace training-day 
; and brought with it all the names defined in that namespace. 
; The name hai was one of them.


;-------------------------------------------------
; EXERCISE 5
; - - - - - -
; Give a name answer to the answer to life the universe and everything.
; 
; Example:
;   answer ;=> 42

(def answer ":(")


;-------------------------------------------------
; EXERCISE 6
; - - - - - -
; Write the function (square x) that takes a number as a parameter 
; and multiplies it with itself.
;
; Examples:
;   (square 2) ;=> 4
;   (square 3) ;=> 9

(defn square [x]
  ":(")


;-------------------------------------------------
; EXERCISE 7
; - - - - - -
; Write the function (average a b), which returns 
;   the average of its two parameters a and b
;
; Examples:
;   (average 2 4) ;=> 3
;   (average 1 2) ;=> 3/2

(defn average [a b]
  ":(")

;-------------------------------------------------
; ¯\_(ツ)_/¯

