public class SplitConditional {
    class Employee {
        private String employeeType;
        private double basePayRate;
        public double calculatePay(boolean isOvertime) {
            double pay;
            if (isOvertime) {
                if ("FullTime".equals(employeeType)) {
                    pay = basePayRate * 1.5;
                } else if ("PartTime".equals(employeeType)) {
                    pay = basePayRate * 1.25;
                } else {
                    pay = basePayRate;
                }
                return pay;
            }
            else {
                if ("FullTime".equals(employeeType) || "PartTime".equals(employeeType)) {
                    pay = basePayRate;
                } else if ("Contractor".equals(employeeType)) {
                    pay = basePayRate * 0.9;
                } else {
                    pay = basePayRate * 0.8;
                }
                return pay;
            }
        }
    }
}



