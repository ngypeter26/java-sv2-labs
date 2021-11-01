package enumtype.position;

public enum Position {
   ENGINEER(500,"SZEP Card"),
   PROJEKT_MANAGER(500,"Car"),
   TEAM_LEADER(800,"Car");

   private final int salary;
   private final String benefit;

   Position(int salary, String benefit) {
      this.salary = salary;
      this.benefit = benefit;
   }

   public int getSalary() {
      return salary;
   }

   public String getBenefit() {
      return benefit;
   }
}
