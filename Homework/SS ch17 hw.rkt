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

;7.8

(define (member start list)
  (if (= (length list) 0) #f
      (if (eqv? (car list) start) list (member start (cdr list)))
      )
  )
  
;7.9


(define (list-ref list index)
  (if (> (+ 1 index) (length list)) #f
      ;(member index list)
      #t
      
  )
)

;> (list-ref '(happiness is a warm gun) 3)
;WARM

;7.10
;7.11
;7.12
