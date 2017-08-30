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


;1.10


;1.14 -- ON PAPER


;1.16


;1.19 (EXTRA CREDIT)



