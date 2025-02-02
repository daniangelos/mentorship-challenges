# Challenge: Bug Hunt

## Contextualization

The Samwise service plays a key role in a loyalty program by calculating the average spending per
customer, a factor used to determine discounts. Recently, there were changes to the service requirements
where, after a period of inactivity, a customer’s `totalSpent` and `transactionCount` are reset to zero.
This modification has led to issues with the calculation of average spent, causing it to malfunction
unexpectedly.


## Goal

Your mission in this challenge is to:

- Investigate the underlying issues causing the Samwise service to break following the recent requirement changes.
- Identify the root cause of the problem, particularly focusing on calculations involving customer spending averages.
- Implement a robust solution to ensure the service functions correctly and gracefully handles all scenarios, including potential edge cases.


## Usage

Follow these steps to engage with the challenge:

1. **Clone the Repository and Navigate to the Challenge Directory**
   ```bash
   git clone https://github.com/daniangelos/mentorship-challenges.git
   cd mentorship-challenges/bug-hunt
   
2. **Investigate the Code and Identify Issues**

   Thoroughly examine the existing implementation of the Samwise service to detect any flaws or logical errors introduced by the recent changes.

3. **Implement Fixes**

   Make the necessary changes to resolve identified issues and enhance service reliability.

4. **Run Tests Using Leiningen**

   Verify your solution by executing tests with the following command:
    ```bash
   lein test
   ```
   - Ensure all tests pass successfully. Make sure to update the test cases, indicating that the service now handles the requirements
   appropriately.
   