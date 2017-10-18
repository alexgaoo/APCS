(define (mymax a . b)

  (cond ((eqv? '() b) 'test)
        ((= 1 (length b))
         (if (> a (car b))
             a
             (mymax (car b) (cdr b))
             )
         )
        ((> a (car b)) (mymax a (cdr b)))
        ((> (car b) a) (mymax (car b) (cdr b)))
        )
  )

(trace mymax)