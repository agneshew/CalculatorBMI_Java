public class Enum {
    public enum units {
        KG(true),
        IBS(false);

        Boolean unit;

        private units(boolean unitType) {
            unit = unitType;
        }
    }


}
