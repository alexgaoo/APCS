; Alex Gao
; Ethan Shaotran
; Ethan Houston

; 1.1
; 10
; 12
; 8
; 3
; 6
; 19
; 3
; #f
; 4
; 16
; 6
; 16

; 1.2
(/ (+ 5 4 (- 2 (- 3 (+ 6 (/ 4 5))))) (* 3 (- 6 2) ( - 2 7 )))

; 1.3
(define (sumsquares x y z)
  (cond ((and (> x y) (> y z)) (+ (* x x) (* y y)))
        ((and (> x y) (> z y)) (+ (* x x) (* z z)))
        ((and (> y x) (> z x)) (+ (* y y) (* z z)))))

; 1.4
; The procedure adds b to a if b is positive. It subtracts b from a if b is negative,
; which is a double negative and turns into addition of positive a and b.

; 1.5
; If you use applicative order evaluation, the interpreter will return an infinite loop error.
; Howeve,r if you use normal order evaluation, the interpreter will return 0.

; 1.6
; It can't run because it's perpetually dependant on the evluation of the third argument 
