;Ethan Shaotran, Ethan Houston, Alex Gao, Period C

;2.17

(define (last-pair list)
  (cond ((= (length list) 1) list)
        (else (lp (cdr list)))))

;2.18

(define (reverse list)
  (revhelp list 0 '()))

(define (revhelp list index end)
  (cond ((= index (length list)) end)
        (else (revhelp list (+ index 1) (cons (list-ref list index) end)))))

;2.20
(define (same-parity f . l)
  (sp2 f '() l
   ))

(define (sp2 f end . l)
  (cond ((null? (car l)) end)
        ((and (even? f) (even? (car (car l)))) (sp2 f (cons (car l) end) (cdr l) ))
        ((and (even? f) (odd? (car (car l)))) (sp2 f end (cdr l) ))
        ((and (odd? f) (even? (car (car l)))) (sp2 f (cons (car l) end) (cdr l) ))
        ((and (odd? f) (odd? (car (car l)))) (sp2 f end (cdr l) ))
   ))

(define (same-parity . l) (if (even? (car l)) (filtered-accumulate cons even? '() list-ref 0 (lambda (x) (+ 1 x)) (length l) l) (filtered-accumulate cons odd? '() list-ref 0 (lambda (x) (+ 1 x)) (length l) l))) (define (filtered-accumulate combiner filter null-value term a next b l) (define (iter a result) (if (> a b) result (iter (next a) (combiner result (if (filter a) (term l (- a 1)) null-value))))) (iter a null-value))



  

