(ns two-fer)

(defn two-fer 
  ([] "One for you, one for me.") 
  ([name]  (str "One for "name ", one for me.")))

(two-fer)


(two-fer "haley")

