public class OuterClass {
    private String instanceOuterField = "Instance Outer Field";
    private static String staticouterfield = "Stataic outer field";
    // Member inner class
    public class MemberInnerClass {
        public void display() {
            // Can access instance members of outer class
            System.out.println("Instance Field: " + instanceOuterField);
            System.out.println("Instance Field: " + staticouterfield);
        }
    }
}
