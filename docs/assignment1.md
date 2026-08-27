# Group P — HomeComfort Furniture

| Item  | Price (UGX) |
| ----- | ----------: |
| Chair |   45,000.00 |
| Table |  120,000.00 |
| Bed   |  350,000.00 |
| Sofa  |  500,000.00 |

## Discounts

* [ ] **Chair** — Buy 4 or more, and the chair total gets **5% off**.
* [ ] **Table** — No deal. Never discounted, no matter the quantity.
* [ ] **Bed** — Buy 2 or more, and **UGX 20,000** comes straight off the bed total.
* [ ] **Sofa** — Buy 2 or more, and the sofa total gets **10% off**.

## Check Yourself

If you buy:

* 3 × Chair
* 2 × Table
* 1 × Bed
* 2 × Sofa

Your program's total should come out to:

**UGX 1,625,000.00**

### What the Program Must Do

1. Store your four items and their prices using arrays — not four separate variables for the names and four more for the prices. (Hint: a String[] for names and a double[] for prices, in the same order.)

2. Display your business's price list to the screen, formatted clearly, using a loop that reads from your arrays — not four separate println lines typed by hand.

3. For each item, work out how many the customer is buying. For this version, it's fine to set the quantities directly in your code as variables (e.g. int qty1 = 4;) — you do not need to ask the user to type anything.

4. For each item, calculate that item's subtotal: price × quantity, then apply that item's discount rule if it qualifies.

5. Add up all four subtotals (after discounts) into one grand total.

6. Print an itemised receipt: one line per item showing the quantity, the subtotal, and whether a discount was applied — followed by the grand total.

7. Use at least two of your own methods (for example: a method that calculates one item's discounted subtotal, and a method that prints the receipt). Passing the right values into your methods, and using what they return, is part of the assessment.