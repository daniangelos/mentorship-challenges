(ns samwise.core-test
  (:require [clojure.test :refer :all]
            [samwise.core :refer :all]))

(deftest calculate-average-spending-test
  (testing "Calculate average spending with valid inputs"
    ;; Test case 1: Typical case with multiple transactions
    (let [customer-data {:customer-id 1 :total-spent 500 :transaction-count 5}]
      (is (= 100 (calculate-average-spending customer-data))))

    ;; Test case 2: Only one transaction
    (let [customer-data {:customer-id 1 :total-spent 100 :transaction-count 1}]
      (is (= 100 (calculate-average-spending customer-data))))))