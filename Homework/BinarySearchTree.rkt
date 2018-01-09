;Ethan Shaotran
;Binary Tree

(define (make-bintree datum left right)
  (lambda (msg)
    (cond ((= msg 0) datum)
          ((= msg 1) left)
          ((= msg 2) right))))

(define (datum bintree) (bintree 0))
(define (left bintree) (bintree 1))
(define (right bintree) (bintree 2))

(define tet 'toasterhead)
(define (empty-tree? tree) 
  (eq? tree 'toasterhead))
(define (leaf? bintree)
  (and (not (empty-tree? bintree))
       (empty-tree? (left bintree))
       (empty-tree? (right bintree))))
(define (bst? item)
  (and (not (empty-tree? item))
       (not (leaf? item))
   ))


(define bst
  (make-bintree 15
     (make-bintree 6
        (make-bintree 2 tet tet)
        tet)
     (make-bintree 22
        (make-bintree 17
           (make-bintree 16 tet tet)
           (make-bintree 19 tet tet))
        (make-bintree 24 tet tet))))

;contains? bst => bool
(define (contains? bt x)
  (cond ((empty-tree? bt) #f)
        ((= (datum bt) x) #t)
        ((> (datum bt) x) (or #f (contains? (left bt) x)))
        ((< (datum bt) x) (or #f (contains? (right bt) x)))
   ))

;inorder, bst => list
(define (inorder bt)
  (cond ((bst? bt) (append (list (inorder (left bt))) (list (datum bt)) (list (inorder (right bt)))))
        ((not (empty-tree? bt)) (datum bt))
   )) 

;square-tree => bst => bst
(define (square-tree bt)
  (cond ((empty-tree? bt) tet)
        ((leaf? bt) (square (datum bt)))
        ((bst? bt) (make-bintree (square (datum bt)) (square-tree (left bt)) (square-tree (right bt))))
   ))
(define (square x)
  (* x x))


