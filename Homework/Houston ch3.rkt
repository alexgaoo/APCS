(define (make-accumulator value)
    (lambda (x)
      (set! value (+ value x))
      value)  
  )

(define (make-monitored f)

 (let ((count 0))
       (define (mf msg)
         (cond ((eqv? msg 'how-many-calls?) count)
               ((eqv? msg 'reset-count) (set! count 0))
               (else (display (f msg))
                     (set! count (+ 1 count)))
               )
         )
   mf
       )
   )

(define (make-account balance passwd)
  (define (withdraw amount)
    (if (>= balance amount)
        (begin (set! balance (- balance amount))
               balance)
        "Insufficient funds"))
  (define (deposit amount)
    (set! balance (+ balance amount))
    balance)
  (define (dispatch m p)
    (cond ((not (eqv? passwd p)) (error "Incorrect password"))
          ((eq? m 'withdraw) withdraw)
          ((eq? m 'deposit) deposit)
          (else (error "Unknown request -- MAKE-ACCOUNT"
                       m))))
  dispatch)
  
 
 