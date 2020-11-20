; Tutorial from youtube video https://youtu.be/zFPiPBIkAcQ
;
;


; will throw an exception for n greater than 20 because * only accepts and returns long values

(defn factorial[n]
    (if (= n 0) 1
    (* n (factorial(dec n))))


; uses arbitrary precision math function, so works for n greater than 20
; really high high numbers(11439) triggers stack overflow.
; (This will vary from system to system)

(defn factorial-bigint [n]
    (if (= n 0) 1
        ;the funtion * returns arbitrary precision numbers (clojure.lang.BigInt) 
        (*' n (factorial-bigint(dec n)))))


(defn factorial-bigint-recur [n]
    (if (= n 0) 1
        ;EVALUATION ERROR! recur is not in tail position
        (* n (recur (dec n)))))

; does not consume additional stack space for each iteration
(defn factorial-bigint-loop [n]
    (if = n 0) 1
        (loop [val n i n]
            (if (<= i 1) val
                (recur (*' val (dec i)) (dec i)))))

; fizz buzz problem
; Print integers 1 to N, but print “Fizz” if an integer is divisible by 3, “Buzz” if an integer is divisible by 5, and “FizzBuzz” if an integer is divisible by both 3 and 5.

(defn fizzbuzz []
    (loop [i 1]
        (if (<= i 100)
        (do 
            (if (and (= (rem i 3) (=(rem i 5) 0))
                (println "FizzBuzz")
                if (= (rem i 3) 0)
                    (println "Fizz")
                    if (= (rem i 5) 0)
                        (println "Buzz")
                        (println i))))
            (recur (inc i)))))

; fizzbuzz with cond
(def fizz-buzz-cond []
    (loop [i 1]
        (if (<=100)
            (do 
                (cond 
                    (and (= (rem i 3) (=(rem i 5) 0)) (println "FizzBuzz")
                    (=(rem i 3)0 (println "Fizz")
                    (=(rem i 5)0 (println "Buzz")
                    :else(println i ))
                (recur (inc i))))))))