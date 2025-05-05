package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class ExpenseTrackerModel {
   private List<Transaction> transactions = new ArrayList<>();
   private Stack<Transaction> undoStack = new Stack<>();

   public ExpenseTrackerModel() {}

   public void addTransaction(Transaction var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("The new transaction must be non-null.");
      }
      this.transactions.add(var1);
      this.undoStack.push(var1);  // Track for undo
   }

   public void removeTransaction(Transaction var1) {
      this.transactions.remove(var1);
   }

   public List<Transaction> getTransactions() {
      return Collections.unmodifiableList(new ArrayList<>(this.transactions));
   }

   public boolean undoLastTransaction() {
      if (!undoStack.isEmpty()) {
         Transaction last = undoStack.pop();
         transactions.remove(last);
         return true;
      }
      return false;
   }

   public boolean canUndo() {
      return !undoStack.isEmpty();
   }
}
