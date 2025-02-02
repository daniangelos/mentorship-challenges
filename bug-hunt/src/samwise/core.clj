(ns samwise.core)

(defn calculate-average-spending [customer]
  "Computes average spending per transaction.

   Expects a map with:
   - :total-spent (numeric)
   - :transaction-count (numeric)
   Returns average spending.

   Example:
   (calculate-average-spending {:total-spent 300, :transaction-count 3}) ;=> 100"
  (let [total-spent (:total-spent customer)
        transaction-count (:transaction-count customer)]
    (/ total-spent transaction-count)))
