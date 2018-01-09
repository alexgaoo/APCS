(define (better-make-rat n d)

  (cond ((and (positive? n) (positive? d)) (cons n d))
        ((and (negative? n) (negative? d)) (cons (abs n) (abs d)))
        ((or (negative? n) (negative? d)) (cons (* -1 (abs n)) (abs d)))
  )
)

(define (make-segment start-segment end-segment)
  (cons start-segment end-segment)
  )

(define (start-segment point1 point2)
  (cons point1 point2)
  )

(define (end-segment point1 point2)
  (cons point1 point2)
  )

(define (make-point x y)
  (cons x y))

(define (x-point point)
  (car point)
  )

(define (y-point point)
  (cdr point)
  )

(define (print-point p)
  (newline)
  (display "(")
  (display (x-point p))
  (display ",")
  (display (y-point p))
  (display ")"))

(define (midpoint-segment start-segment end-segment)
  (make-point (/ (+ (x-point start-segment) (x-point end-segment)) 2)
              (/ (+ (y-point start-segment) (y-point end-segment)) 2)
              )
  )