; 2.1

(define (make-rat n d)
  (if (< (* n d) 0)
      (cons (* -1 (abs n)) (abs d))
      (cons (abs n) (abs d))))
      

(define (numer x) (car x))

(define (denom x) (cdr x))

; 2.2

(define (make-segment x y)
  (cons x y))

(define (start-segment x) (car x))

(define (end-segment x) (cdr x))

(define (make-point x y)
  (cons x y))

(define (x-point x) (car x))

(define (y-point x) (cdr x))

(define (midpoint-segment p)
  (let ((x (/ (+ (x-point (start-segment p)) (x-point (end-segment p))) 2))
       (y (/ (+ (y-point (start-segment p)) (y-point (end-segment p))) 2)))
  (cons x y)))

; 2.4

(define (cons x y)
  (lambda (m) (m x y)))

(define (car z)
  (z (lambda (p q) p)))

(define (cdr z)
  (z (lambda (p q) q)))

; 2.7



; 2.8

; 2.9


