; Ethan Houston, Alex Gao
; 17.1

; 'Rod
; 'Chris
; '(Chris Colin Hugh Paul)
; 'Rod
; '(Rod Argent Chris White)
;'(Rod Argent Chris White)
;'((Rod Argent) (Chris White))
; 'Chris
; '(Colin Blunstone)
; #f

17.2
(define (f1 a b)
           (append (cdr a) (car b)))

(define (f2 a b)
           (cons (cdr a) (car b)))

(define (f3 a b)
  (append a a)
  )

(define (f4 a b)
  (list (list (car a) (car b)) (append (cdr a) (cdr b))))
  

;17.3
; Four procedures

