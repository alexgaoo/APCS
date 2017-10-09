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


;(define (accumulate combiner null-value term a next b)
;  (if (> a b) null-value)
;)


(define (square x)
  (* x x))

(define (inc n)
  (+ n 1))

(define (integer x)
  x)

(define (accumulate combiner null-value term a next b)
  (define (iter a result)
    (if (> a b) result
        (iter (next a) (combiner (term a) result))))
  (iter a null-value))



;1.33 (use odd #s instead of primes for part (a))

;a
(define (odd? x)
  (if (= (modulo x 2) 0) #f
      #t))

;(define (filtered-accumulate combiner null-value term a next b filter)
 ; (define (iter a result)
;
 ;   (if (filter a) (if (> a b) result
  ;                   (iter (next a) (combiner (term a) result)))
;
 ;       (iter (next a) (combiner (term a) result)))
  ;(iter a null-value)))

  
(define (filtered-accum filter combiner null-value term a next b)
  (if (> a b)
      null-value
      (if (filter a)
          (combiner (term a)
                    (filtered-accum filter combiner null-value term (next a) next b))
          (filtered-accum filter combiner null-value term (next a) next b))))

(define (gcd a b)
  (if (= b 0)
      a
      (gcd b (remainder a b))))

(filtered-accum odd? + 0 square 7 inc 11)

;;; help from internet
(define (product-of-coprimes n)
  (define (coprime? i)
     (= 1 (gcd i n)))
  (filtered-accum coprime? * 1 identity 1 inc (- n 1)))

(define (identity x) x)
