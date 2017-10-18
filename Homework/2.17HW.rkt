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


;2.21

(define (square x)
  (* x x))

(define (square-list1 items)
  (if (null? items)
      nil
      (cons (square (car items)) (square-list (cdr items)))))


(define (square-list items)
  (map square items))

;2.22

;First: arguments to cons are flipped
;Second: cons shouldn't be used, should rather use append
;(for-each (lambda (x) (newline) (display x))

(define (for-each proc list)

  (cond ((null? list) 'empty)
        ((not (null? (car list))) (proc (car list))
                                  (print (car list))
                                  (for-each proc (cdr list)))
        )
  )

(define (fe2 num proc lst)
  (if (= num 0)
      (void)
      (append (fe (- num 1) proc (cdr lst)) (list (proc (car lst))))
   ))

(define (fe num proc lst)
  (if (= num 0)
      (void)
      (seq-action
       (proc (car lst))
       (fe (- num 1) proc (cdr lst)))
   ))

(define seq-action
  (lambda (action1 action2) 
    (action1) (action2)))

(define (for-each proc list)
  (fe (length list) proc list
   ))

(define (for-each proc lyst)
  (cond ((null? lyst) lyst)
        ((= (length lyst) 1) (proc (car lyst)))
        (else (and (proc (car lyst))(for-each proc (cdr lyst))))))

;2.24 - done in heads

;2.25
(car (cdaddr '(1 3 (5 7) 9)))

(caar '((7)))

(cadadr (cadadr (cadadr '(1 (2 (3 (4 (5 (6 7)))))))))


;2.26
;appends it
;makes a pair of lists
;'(() ())

;2.27

(define (deep-revh list)
  (cond ((null? list) '())
        ((list? (car list)) (reverse (cons (reverse (deep-rev (car list))) (deep-rev (cdr list)))))
        (else (cons (car list) (deep-rev (cdr list))))
   ))


