;Ethan Shaotran
;2.29
(define make-mobile cons)

(define make-branch cons)

(define left-branch car)
(define right-branch cdr)

(define branch-length car)
(define branch-structure cdr)

(define weight? number?)
(define mobile? pair?)

(define (total-weight mob)
  (cond ((mobile? mob) (+ (total-weight (branch-structure (left-branch mob)))
                          (total-weight (branch-structure (right-branch mob)))))
        ((weight? mob) mob)
        ))

(define (balanced? mob)
  (cond ((mobile? mob) (and (= (* (branch-length (left-branch mob)) (total-weight (branch-structure (left-branch mob)))) (* (branch-length (right-branch mob)) (total-weight (branch-structure (right-branch mob)))))
                            (balanced? (branch-structure (left-branch mob)))
                            (balanced? (branch-structure (right-branch mob)))))
        ((weight? mob) #t)
   ))

(define m
  (make-mobile
   (make-branch 6
    (make-mobile
     (make-branch 1 8)
     (make-branch 4 2)))
   (make-branch 5 12)))

;You shouldn't have to change it at all.

;2.30
(define (square-tree lst)
  (cond ((empty? lst) '())
        ((list? (car lst)) (append (list (square-tree (car lst))) (square-tree (cdr lst))) )
        (else (append (list (square (car lst))) (square-tree (cdr lst))))
   ))
(define (square x)
  (* x x))

;2.31
(define (tree-map func lst)
  (cond ((empty? lst) '())
        ((list? (car lst)) (append (list (tree-map func (car lst))) (tree-map func (cdr lst))) )
        (else (append (list (func (car lst))) (tree-map func (cdr lst))))
   ))
(define (square-tree2 tree) (tree-map square tree))

;2.32
(define nil '())
(define (subsets s)
  (if (null? s)
      (list nil)
      (let ((rest (subsets (cdr s))))
        (append rest (map (lambda (x) (cons s x)) rest)))))

;Because you have to add each element of rest to s to not get an empty list

;2.33
(define (map p sequence)
  (accumulate (lambda (x y) (cons (p x) y)) '() sequence))
;(define (append seq1 seq2)
;  (accumulate cons '() (cons seq1 seq2)))
(define (length sequence)
  (accumulate (lambda (x y) (+ 1 y)) 0 sequence))


(define (accumulate op initial sequence)
  (if (null? sequence)
      initial
      (op (car sequence)
          (accumulate op initial (cdr sequence)))))
  
;2.35
(define (leaf? x) (not (pair? x)))

(define (count-leaves t)
  (accumulate + 0 (map (lambda (part)
                         (if (leaf? part)
                             1
                             (count-leaves part)))
                       t)))



