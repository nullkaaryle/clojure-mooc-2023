(ns structured-data)

;------------------------------------------------------------------------------;
;                 EXERCISES FOR PART 3: STRUCTURED DATA                        ;
;           https://github.com/iloveponies/structured-data                     ;
;               - - - - - - - - - - - - - - - - - - - - -                      ;
;          UNIVERSITY OF HELSINKI CLOJURE MOOC: I LOVE PONIES                  ;
;                   http://iloveponies.github.io                               ;
;------------------------------------------------------------------------------;

;-------------------------------------------------
; EXERCISE 1
; - - - - - -
; The following function does a thing:
;   (defn do-a-thing [x]
;     (Math/pow (+ x x) (+ x x)))
; Change the function do-a-thing so 
; that it uses let to give a name to the common expression (+ x x) in its body.

(defn do-a-thing [x]
  :-)

;-------------------------------------------------
; EXERCISE 2
; - - - - - -
; Write the function (spiff v) that 
;   takes a vector and 
;   returns the sum of the first and third elements of the vector. 
; What happens when you pass in a vector that is too short?
;
; Examples:
;   (spiff [1 2 3])       ;=> 4
;   (spiff [1 2 3 4 5 6]) ;=> 4
;   (spiff [1 2])         ;=> ?
;   (spiff [])            ;=> ?

(defn spiff [v]
  :-)


;-------------------------------------------------
; EXERCISE 3
; - - - - - -
; Write the function (cutify v) that 
;   takes a vector as a parameter and 
;   adds "<3" to its end.
;
; Examples:
;   (cutify []) => ["<3"]
;   (cutify [1 2 3]) => [1 2 3 "<3"]
;   (cutify ["a" "b"]) => ["a" "b" "<3"]

(defn cutify [v]
  :-)


;-------------------------------------------------
; EXERCISE 4
; - - - - - -
; Rewrite our earlier function spiff by destructuring its parameter. 
; Call this new function spiff-destructuring.
;
(defn spiff-destructuring [v]
  :-)

;-------------------------------------------------
; EXERCISE 5
; - - - - - -
; Write the functions (height rectangle) and (width rectangle) 
; that return the height and width of the given rectangle. 
; Use destructuring.
;
; Examples:
;   (height (rectangle [1 1] [5 1])) => 0
;   (height (rectangle [1 1] [5 5])) => 4
;   (height (rectangle [0 0] [2 3])) => 3
;   (width (rectangle [1 1] [5 1]))  => 4
;   (width (rectangle [1 1] [1 1]))  => 0
;   (width (rectangle [3 1] [10 4])) => 7

(defn point [x y]
  [x y])

(defn rectangle [bottom-left top-right]
  [bottom-left top-right])

(defn width [rectangle]
  :-)

(defn height [rectangle]
  :-)

;-------------------------------------------------
; EXERCISE 6
; - - - - - -
; Write the function (square? rectangle) that 
;   returns true if rectangle is a square and 
;   otherwise false.
;
; Examples:
;   (square? (rectangle [1 1] [2 2])) ;=> true
;   (square? (rectangle [1 1] [2 3])) ;=> false
;   (square? (rectangle [1 1] [1 1])) ;=> true
;   (square? (rectangle [3 2] [1 0])) ;=> true
;   (square? (rectangle [3 2] [1 1])) ;=> false

(defn square? [rectangle]
  :-)


;-------------------------------------------------
; EXERCISE 7
; - - - - - -
; Write the function (area rectangle) that 
;   returns the area of the given rectangle.
;
; Examples:
;   (area (rectangle [1 1] [5 1]))  => 0
;   (area (rectangle [0 0] [1 1]))  => 1
;   (area (rectangle [0 0] [4 3]))  => 12
;   (area (rectangle [3 1] [10 4])) => 21

(defn area [rectangle]
  :-)

;-------------------------------------------------
; EXERCISE 8
; - - - - - -
; Write the function (contains-point? rectangle point) that 
;   returns true if rectangle contains point and 
;   otherwise false.
; Use destructuring.
; Remember that you can give <= multiple parameters. 
; (<= x y z) returns true if x≤y≤z holds. Otherwise false.
; Hint: and is useful.
;
; Examples:
;   (contains-point? (rectangle [0 0] [2 2]) (point 1 1))   ;=> true
;   (contains-point? (rectangle [0 0] [2 2]) (point 2 1))   ;=> true
;   (contains-point? (rectangle [0 0] [2 2]) (point -3 1))  ;=> false
;   (contains-point? (rectangle [0 0] [2 2]) (point 1 3))   ;=> false
;   (contains-point? (rectangle [1 1] [2 2]) (point 1 1))   ;=> true
;   (contains-point? (rectangle [1 1] [1 1]) (point 1 1))   ;=> true


(defn contains-point? [rectangle point]
  :-)


;-------------------------------------------------
; EXERCISE 9
; - - - - - -
; Write the function (contains-rectangle? outer inner) that 
;   returns true if the rectangle inner is inside the rectangle outer and 
;   otherwise false.
; Hint: use contains-point?
;
; Examples:
;   (contains-rectangle? (rectangle [0 0] [3 3])
;                        (rectangle [1 1] [2 2])) ;=> true
;   (contains-rectangle? (rectangle [0 0] [2 2])
;                        (rectangle [1 1] [3 3])) ;=> false
;   (contains-rectangle? (rectangle [0 0] [1 1])
;                        (rectangle [0 0] [1 1])) ;=> true
;   (contains-rectangle? (rectangle [0 0] [1 1])
;                        (rectangle [1 1] [2 2])) ;=> false

(defn contains-rectangle? [outer inner]
  :-)


;-------------------------------------------------
; EXERCISE 10
; - - - - - -
; Write the function (title-length book) that 
;   counts the length of the book’s title.
;
; Examples:
;   (title-length cities)         ;=> 21
;   (title-length wild-seed)      ;=> 9
;   (title-length little-schemer) ;=> 18

(defn title-length [book]
  :-)


;-------------------------------------------------
; EXERCISE 11
; - - - - - -
; Write the function (author-count book) that 
;   returns the amount of authors that book has.
;
; Examples:
;   (author-count cities)         ;=> 1
;   (author-count wild-seed)      ;=> 1
;   (author-count little-schemer) ;=> 2

(defn author-count [book]
  :-)


;-------------------------------------------------
; EXERCISE 12
; - - - - - -
; Write the function (multiple-authors? book) that 
;   returns true if book has multiple authors, 
;   otherwise false.
;
; Examples:
;   (multiple-authors? cities)         ;=> false
;   (multiple-authors? wild-seed)      ;=> false
;   (multiple-authors? little-schemer) ;=> true

(defn multiple-authors? [book]
  :-)

;-------------------------------------------------
; EXERCISE 13
; - - - - - -
; Use assoc and conj to write the function (add-author book new-author) that 
;   takes a book and an author as a parameter and 
;   adds author to books authors.
; Hint: use let to avoid pain
;
; Examples:
;   (add-author little-schemer {:name "Gerald J. Sussman"})
; 
;  => {:title "The Little Schemer"
;    :authors [{:birth-year 1944, :name "Daniel Friedman"}
;              {:name "Matthias Felleisen"}
;              {:name "Gerald J. Sussman"}]}
;   
; (add-author {:authors [{:name "Juhana"}]} {:name "Jani"})
; 
;   => {:authors [{:name "Juhana"} {:name "Jani"}]}

(defn add-author [book new-author]
  :-)


;-------------------------------------------------
; EXERCISE 14
; - - - - - -
; Write the function (alive? author) which takes an author map and 
;   returns true if the author is alive, 
;   otherwise false.
; An author is alive if the author does not have a death year.
;
; Examples:
;   (alive? china)   ;=> true
;   (alive? octavia) ;=> false

(defn alive? [author]
  :-)

;-------------------------------------------------
; EXERCISE 15
; - - - - - -
; Write the function (element-lengths collection) that 
;   returns the lengths of every item in collection.
;
; Examples:
;   (element-lengths ["foo" "bar" "" "quux"])  ;=> (3 3 0 4)
;   (element-lengths ["x" [:a :b :c] {:y 42}]) ;=> (1 3 1)


(defn element-lengths [collection]
  :-)

;-------------------------------------------------
; EXERCISE 16
; - - - - - -
; Use map to write the function (second-elements collection) that 
;   takes a vector of vectors and 
;   returns a sequence of the second elements.
; Remember that you can use get to index a vector.
; Use fn and let to create a helper function and use it with map.
;
; Examples:
;   (second-elements [[1 2] [2 3] [3 4]])               ;=> (2 3 4)
;   (second-elements [[1 2 3 4] [1] ["a" "s" "d" "f"]]) ;=> (2 nil "s")

(defn second-elements [collection]
  :-)

;-------------------------------------------------
; EXERCISE 17
; - - - - - -
; Write the function (titles books) that 
;   takes a collection of books and 
;   returns their titles.
;
; Examples:
;   (titles [cities]) ;=> ("The City and the City" )
;   (titles books)    ;=> ("The City and the City" "Wild Seed" "Embassytown" "The Little Schemer")
;
; Use this data:
(def china {:name "China Miéville", :birth-year 1972})
(def octavia {:name "Octavia E. Butler"
              :birth-year 1947
              :death-year 2006})
(def friedman {:name "Daniel Friedman" :birth-year 1944})
(def felleisen {:name "Matthias Felleisen"})

(def cities {:title "The City and the City" :authors [china]})
(def wild-seed {:title "Wild Seed", :authors [octavia]})
(def embassytown {:title "Embassytown", :authors [china]})
(def little-schemer {:title "The Little Schemer"
                     :authors [friedman, felleisen]})

(def books [cities, wild-seed, embassytown, little-schemer])


(defn titles [books]
  :-)



;-------------------------------------------------
; EXERCISE 18
; - - - - - -
; Write the function (stars n) that 
;   returns a string with n aterisks \*.
; The function (repeat n x) returns a sequence with n xs:
;   (repeat 5 "*") ;=> ("*" "*" "*" "*" "*")
;   (repeat 3 "~o~") ;=> ("~o~" "~o~" "~o~")
; Remember that you can use str to concatenate strings.
;
; Examples:
;   (stars 1) ;=> "*"
;   (stars 7) ;=> "*******"
;   (stars 3) ;=> "***"

(defn stars [n]
  :-)


;-------------------------------------------------
; EXERCISE 19
; - - - - - -
; Write the function (monotonic? a-seq) that 
;   returns true if a-seq is monotonic and 
    ;otherwise false.
; Use apply.
; A sequence is monotonic if is either inceasing or decreasing. 
; In a decreasing sequence every element is at most as large as the previous one 
; and in an increasing sequence every member is at least as large as the previous one.
; Hint: <= might be useful
;
; Examples:
;   (monotonic? [1 2 3])     ;=> true
;   (monotonic? [0 1 10 11]) ;=> true
;   (monotonic? [3 2 0 -3])  ;=> true
;   (monotonic? [3 2 2])     ;=> true    Not strictly monotonic
;   (monotonic? [1 2 1 0])   ;=> false

(defn monotonic? [a-seq]
  :-)


;-------------------------------------------------
; EXERCISE 20
; - - - - - -
; Write the function (toggle a-set elem) that 
;   removes elem from a-set if a-set contains elem, and 
;   adds it to the set otherwise.
;
; Examples:
;   (toggle #{:a :b :c} :d)   ;=> #{:a :c :b :d}
;   (toggle #{:a :b :c} :a)   ;=> #{:c :b}

(defn toggle [a-set elem]
  :-)


;-------------------------------------------------
; EXERCISE 21
; - - - - - -
; Write the function (contains-duplicates? sequence) that 
;   takes a sequence as a parameter and 
;   returns true if sequence contains some element multiple times. 
;   Otherwise it returns false.
;
; Examples: 
;   (contains-duplicates? [1 1 2 3 -40])    ;=> true
;   (contains-duplicates? [1 2 3 -40])      ;=> false
;   (contains-duplicates? [1 2 3 "a" "a"])  ;=> true

(defn contains-duplicates? [a-seq]
  :-)

;-------------------------------------------------
; EXERCISE 22
; - - - - - -
(defn old-book->new-book [book]
  :-)


;-------------------------------------------------
; EXERCISE 23
; - - - - - -
; Write the function (has-author? book author) that 
;   returns true if author is in the authors of book and 
;   otherwise false.
;
; Examples:
;   (has-author? cities china)             ;=> true
;   (has-author? cities felleisen)         ;=> false
;   (has-author? little-schemer felleisen) ;=> true
;   (has-author? little-schemer friedman)  ;=> true
;   (has-author? little-schemer octavia)   ;=> false

(defn has-author? [book author]
  :-)


;-------------------------------------------------
; EXERCISE 24
; - - - - - -
; Write the function (authors books) that 
;   returns the authors of every book in books as a set.
;
; Examples:
;   (authors [cities, wild-seed])              ;=> #{china, octavia}
;   (authors [cities, wild-seed, embassytown]) ;=> #{china, octavia}
;   (authors [little-schemer, cities])         ;=> #{china, friedman, felleisen}

(defn authors [books]
  :-)


;-------------------------------------------------
; EXERCISE 25
; - - - - - -
; Write the function (all-author-names books) that 
;   works like the previous one and uses authors.
;
; Examples: 
;   (all-author-names books)
;       ;=> #{"Matthias Felleisen" "China Miéville" "Octavia E. Butler" "Daniel Friedman"}
;   (all-author-names [cities, wild-seed])
;       ;=> #{"China Miéville" "Octavia E. Butler"}
;   (all-author-names []) 
;       ;=> #{}

(defn all-author-names [books]
  :-)

;-------------------------------------------------
; EXERCISE 26
; - - - - - -
; Write the function (author->string author) that 
;   returns a string representation of author
;
; You can assume that every author with a :death-year also has a :birth-year.
;
; Hint: you probably want to split this string into two parts: name and years. 
;    Use let to form these and use str to create the final string.
;
; Examples: 
;   (author->string felleisen) ;=> "Matthias Felleisen"
;   (author->string friedman)  ;=> "Daniel Friedman (1944 - )"
;   (author->string octavia)   ;=> "Octavia E. Butler (1947 - 2006)"

(defn author->string [author]
  :-)


;-------------------------------------------------
; EXERCISE 27
; - - - - - -
; Write the function (authors->string authors) which 
;    takes a sequence of authors as a parameter and 
;    returns a string representation of authors
;
; Since the authors are in a set, which doesn’t have a predefined order, 
; the resulting string can have the authors in any order.
;
; Examples:
;    (authors->string (:authors little-schemer))
;        ;=> "Daniel Friedman (1944 - ), Matthias Felleisen"
;    (authors->string #{octavia})          
;        ;=> "Octavia E. Butler (1947 - 2006)"
;    (authors->string #{})                 
;        ;=> ""
;    (authors->string #{octavia, friedman})
;        ;=> "Octavia E. Butler (1947 - 2006), Daniel Friedman (1944 - )"

(defn authors->string [authors]
  :-)


;-------------------------------------------------
; EXERCISE 28
; - - - - - -
; Write the function (book->string book) that
;   takes a single book as a parameter and 
;   returns a string representation of book
;
; Again, the order of authors in the string doesn’t matter.
;
; Examples:
;    (book->string wild-seed) 
;        ;=> "Wild Seed, written by Octavia E. Butler"
;    (book->string little-schemer)
;        ;=> "The Little Schemer, written by Daniel Friedman (1944 - ), Matthias Felleisen"
;                              

(defn book->string [book]
  :-)


;-------------------------------------------------
; EXERCISE 29
; - - - - - -
; Write the function (books->string books) that 
;   takes a sequence of books as a parameter and 
;   returns a string representation of books like this:
;
; Examples:
;   (books->string []) 
;        ;=> "No books."
;   (books->string [cities])
;       ;=> "1 book. The City and the City, written by China Miéville (1972 - )."
;   (books->string [little-schemer, cities, wild-seed])
;       ;=> "3 books. The Little Schemer, written by Daniel Friedman (1944 - ), 
;         Matthias Felleisen. The City and the City, written by China Miéville (1972 - ). 
;         Wild Seed, written by Octavia E. Butler (1947 - 2006)."

(defn books->string [books]
  :-)


;-------------------------------------------------
; EXERCISE 30
; - - - - - -
; Write the function (books-by-author author books).
; 
; Hint: has-author?
;
; Examples:
;   (books-by-author china books)   ;=> (cities embassytown)
;   (books-by-author octavia books) ;=> (wild-seed)

(defn books-by-author [author books]
  :-)


;-------------------------------------------------
; EXERCISE 31
; - - - - - -
; Write the function (author-by-name name authors) that 
;    takes a string name and a sequence of authors and 
;    returns an author with the given name if one is found. 
;    If one is not found, then nil should be returned.
;
; Hint: remember first
;
; Examples:
;   (author-by-name "Octavia E. Butler" authors)                ;=> octavia
;   (author-by-name "Octavia E. Butler" #{felleisen, friedman}) ;=> nil
;   (author-by-name "China Miéville" authors)                   ;=> china
;   (author-by-name "Goerge R. R. Martin" authors)              ;=> nil

(defn author-by-name [name authors]
  :-)


;-------------------------------------------------
; EXERCISE 32
; - - - - - -
; Write the function (living-authors authors) that 
;   takes a sequence of authors and 
;   returns those that are alive.
;
; Remember alive?. 
; The order in the results doesn’t matter.
;
; Examples:
;   (living-authors authors)             ;=> (china, felleisen, friedman)
;   (living-authors #{octavia})          ;=> ()
;   (living-authors #{china, felleisen}) ;=> (china, felleisen)

(defn living-authors [authors]
  :-)


;-------------------------------------------------
; EXERCISE 33
; - - - - - 
; Write the function (has-a-living-author? book) that 
;   returns true if book has a living author, and 
;   otherwise false.
;
; Examples: 
;   (books-by-living-authors books) 
;       ;=> (little-schemer cities embassytown)
;   (books-by-living-authors (concat books [deus-irae, silmarillion]))
;       ;=> (little-schemer cities embassytown silmarillion)

(defn has-a-living-author? [book]
  :-)


;-------------------------------------------------
; EXERCISE 34
; - - - - - -
; Write the function (books-by-living-authors books) that 
;   takes a sequence of books as a parameter and 
;   returns those that have a living author.
;
; Examples: 
;   (books-by-living-authors books)   
;       ;=> (little-schemer cities embassytown)
;   (books-by-living-authors (concat books [deus-irae, silmarillion])) 
;       ;=> (little-schemer cities embassytown silmarillion)

(defn books-by-living-authors [books]
  :-)


