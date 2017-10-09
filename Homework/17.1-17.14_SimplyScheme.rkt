;Ethan Shaotran, David Shen
;Simply Scheme (17.#) AND 1.34-1.43

;17.1
;'Rod
;'Chris
;'(Chris Colin Hugh Paul)
;'R
;'((Rod Argent) Chris White)
;'(Rod Argent Chris White)
;'((Rod Argent) (Chris White))
;'Chris
;'(Colin Blunston)
;#f

;17.2
(define (f1 l1 l2)
  (append (cdr l1) (list (car l2))
   ))

(define (f2 l1 l2)
  (list (cdr l1) (cadr l2)
   ))

(define (f3 l1 l2)
  (append l1 l1
   ))

(define (f4 l1 l2)
  (list (list (car l1) (car l2)) (append (cdr l1) (cdr l2))
   ))

;17.3
;(map (lambda (x) (lambda (y) (+ x y))) '(1 2 3 4))
;Because x takes in a value from the mapped list, but y
;has nothing to taken in, so it default returns #<procedure>.
;It does this 4 times - for each mapped value in the list

;17.8
(define (mem? x list)
  (cond ((and (= (length list) 0) (= x (first list))) #t)
        ((and (= (length list) 0) (not (= x (first list)))) #f)
        ((= x (first list)) #t)
        (else (and #f (mem? x (bf list))) )

   ))

;17.9
(define (list-refnew list num)
  (cond ((> num 0) (list-refnew (bf list) (- num 1)))
        (else (first list))
   ))

;17.10
(define (length list)
  (len list 0))
(define (len list num)
  (cond ((empty? list) num)
        (else (len (bf list) (+ num 1) ))
   ))

;17.11
(define (before-in-list? list before after)
   (and (equal? (first (simplify list before after)) before) (equal? (first (bf (simplify list before after))) after)) 
   
   )

(define (simplify list term1 term2)
  (cond ((empty? list) '())
        ((or (and (equal? (first list) term1) (equal? (first (bf list)) term2))
             (and (equal? (first list) term2) (equal? (first (bf list)) term1)))
         list)
                  
        ((or (equal? (first list) term1)
             (equal? (first list) term2))
         (se (first list)
             (simplify (bf list) term1 term2)) )
        (else (simplify (bf list) term1 term2))
   ))

;17.12
(define (flatten-new list)
  (cond

    ((empty? list) list)
    ((list? (first list)) (se (flatten-new (first list)) (flatten-new (bf list))))
        ((not (list? (first list))) (se (first list) (flatten-new (bf list))))
   ))

;17.14
(define (branch element list)
  (cond ((empty? element) list)
        (else (branch (bf element) (list-ref list (- (first element) 1))))
        

   ))

;CHAPTER 1.3 STUF --------------------------------
;1.34
;You would get an error because it would simplify to (2 2), and since 2 is not a function, then it doesn't work

;1.37a

;k=11 will return result accurate to 4 decimal places
(define (cont-frac n d k)
  (cond
    ((= k 0) 1)
    ((> k 0) (/ (n 1) (+ (d 1) (cont-frac n d (- k 1)))))
   ))

;1.38
(define (cont-e n k u)
  (cond
    ((= k 0) 1)
    ((> k 0) (/ (n 1) (+ (e-list u) (cont-e n (- k 1) (+ u 1)) )))
   ))



(define (e-list num)
  (cond ((= 2 (remainder num 3)) (* 2 (ceiling (/ num 3))))
        (else 1)
   ))

;1.41
(define (double proc)
  (lambda (x) (proc (proc x))
  ))

(define (inc x)
  (+ x 1
   ))

;1.42
(define (compose func1 func2)
  (lambda (x) (func1 (func2 x))
   ))

;1.43
(define (square x)
  (* x x))

(define (repeated func num)
  (cond ((= num 1) func)
        (else (compose func (repeated2 func (- num 1))))
   ))


