(define (f1 x y)
  (append (cdr x) (list (car y)))
  )


(define (f2 x y)
  (list (cdr x) (cadr y))
  )

;(f2 '(a b c) '(d e f))

(define (f3 x y)
  (append x x)
  )
;(f3 '(a b c) '(d e f))


(define (f4 x y)
  (list (append (list (car x)) (list (car y)))
        (append (cdr x) (cdr y)))
  )
;(f4 '(a b c) '(d e f))

(define (mymember x list)

  (cond ((eqv? list '()) #f)
        ((eqv? x (car list)) list) 
        ((not (eqv? x (car list))) (mymember x (cdr list)))
  )
)

(define (mylist-ref list index)

  (define x 0)
  
  (define (iter x list)

    (cond ((> index x) (iter (+ 1 x) (cdr list)))
          ((= index x) (car list))     
          )
  )
  (iter x list)
  )

(define (mylength list)
  (define count 0)
  (define (iter counter list)
    (cond ((eqv? list '()) counter)
          (else (iter (+ 1 counter) (cdr list)))
          )
    )
  (iter count list)
  )

(define (before-in-list? list first second)
  (if (mymember first list)
      (if (mymember second (mymember first list))
          #t
          #f)
      #f)
  )

(define (empty? list)
  (eqv? list '())
  )

(define (flatten list)

  
  
  (define (iter templist processedlist ticker)
   

    (cond ((eqv? templist '()) processedlist)
          ((not (list? templist)) (cons templist processedlist));(cons templist processedlist))
          ;(else (iter inputlist (car inputlist) processedlist))
          (else (iter (car templist) processedlist))
          )
  )

  
  (iter (car list) '() 0)
  )


    ;(flatten '(((a b) c (d e)) (f g) ((((h))) (i j) k)))

(define (flatten list)
  (cond ((null? list) '())
        ((pair? (car list))
         (append (flatten (car list)) (flatten (cdr list))))
        (else (cons (car list) (flatten (cdr list))))
        )
  )


(define (mylist-ref list index)

  (define x 1)
  
  (define (iter x list)

    (cond ((> index x) (iter (+ 1 x) (cdr list)))
          ((= index x) (car list))     
          )
  )
  (iter x list)
  )

(define (branch index list)

  (define (iter index list)

    (cond ((= (length index) 1) (mylist-ref list (car index)))
          (else (iter 
    


  )
  
  )
  (iter index list)
  )

