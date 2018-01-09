(define (reverse list)
  (revhelp list 0 '()))

(define (revhelp list index end)
  (cond ((= index (length list)) end)
        (else (revhelp list (+ index 1) (cons (list-ref list index) end)))))


(define (deep-reverse oldlist newlist)
  (cond ((null? oldlist) newlist)
   ((number? (car oldlist)) (print newlist)
                            (append (list (car oldlist)) newlist)
                            (print newlist)
                         (deep-reverse (cdr oldlist) newlist))
   ((list? (car oldlist)) (cons (reverse (car oldlist)) newlist)
                       (deep-reverse (cdr oldlist) newlist))
   )
)


(trace deep-reverse)