;Ethan Shaotran, Alex Gao, Ethan Houston
;Homework for Chapter 1 (1.8), Chapter 2

;1.8
(define (cuberoot-iter guess x)
  (if (good-enough? guess x)
      guess
      (cuberoot-iter (improve x guess)
                     x)))

(define (improve x y)
(/ (+ (/ x (* y y)) (* 2 y) )
   3
 ))

(define (good-enough? guess x)
  (< (abs (- (cube guess) x)) 0.001))

(define (cube x)
  (* x x x 
   ))



;1.9
;The first one is iterative (It creates a new call which can forget the old procedure that called it)
;The second one is recursive (It has a + infront of the call, so it still relies on it)

;1.10 -- ETHAN
(define (A x y)
  (cond ((= y 0) 0)
        ((= x 0) (* 2 y))
        ((= y 1) 2)
        (else (A (- x 1)
                 (A x (- y 1))))))
;(trace A)
;(A 1 10) --> Produces 1024
;(A 2 4) --> 65536
;(A 3 3) --> 65536

; (f n) --> 2n
; (g n) --> 2^n
; (h n) --> 2^(-2)^(n-1) if n%2==1 ---- Can't figure this out for the life of me




;1.14 -- ON PAPER (HOUSTON)


;1.16 -- ALEX


;1.19 (EXTRA CREDIT)



