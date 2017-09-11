;Ethan Shaotran, Alex Gao, Ethan Houston
;SICP Chapter 1.3

;1.30
(define (sum term a next b)
  (define (iter a result)
    (if (> a b)
        result
        (iter (next a) (+ result (term a)))))
  
  (iter a 0))

(define (inc n) (+ n 1))

(define (cube x) (* x x x))

(define (sum-cubes a b)
  (sum cube a inc b))

(trace sum-cubes)

;1.31a

(define (product f a next b)
    (if (> a b)
        1
        (* (f a) (product f (next a) next b))))

(define (inc2 n)
  (+ n 2))

(define (self n)
  n)

(define (factorial n)
  (product self 1 inc n))

(define (pi n)
  (define (pi-term x)
    (/ (* 4.0 (* x x)) (- (* 4 (* x x)) 1)))
  (* 2 (product pi-term 1 inc n)))

    

;1.32 (iterative process only)

;1.33 (use odd #s instead of primes for part (a))

