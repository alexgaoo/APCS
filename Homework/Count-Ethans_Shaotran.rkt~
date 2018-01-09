;Ethan Shaotran, Period C APCS

(define (count-Ethans struct) ;Takes in a tree at first, then structure
  (cond ((null? struct) 0)
        ((empty-twig? struct) 0)
        ((ethan-twig? struct) 1)
        ((and (tree? struct) (= 1 (length struct))) (count-Ethans (car struct)))
        
        ((or (tree? struct) (branch? struct)) (+ (count-Ethans (car struct)) (count-Ethans (cdr struct))))
        
   ))

;HELPERS:
(define branch? pair?)
(define (empty-twig? struct) (equal? struct 'twig))
(define (ethan-twig? struct) (equal? struct 'Ethan))
(define tree? list?)

;CONSTRUCTORS:
(define make-tree list)
(define make-branch cons)

;RUN PROGRAM:
(count-Ethans (make-tree (make-branch 'twig 'Ethan) 'twig (make-branch (make-branch 'Ethan 'twig) 'Ethan) 'Ethan))
