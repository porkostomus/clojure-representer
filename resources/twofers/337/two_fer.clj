(ns two-fer)

(defn two-fer [name] ;; <- arglist goes here
  (if (not= name nil)
    (str "One for " name ", one for me.")
    (str "One for you, one for me.")))
