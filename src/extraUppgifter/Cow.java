package extraUppgifter;

public class Cow {

    // The weight of the cow
    private int mWeight;

    // The name of the cow
    private String mName;

    /**
     * Creates a new {@link Cow}
     * @param weight is the weight of the cow
     * @param name is the name of the cow
     */
    public Cow(int weight, String name) {
        mWeight = weight;
        mName = name;
    }

    public int getWeight() {
        return mWeight;
    }

    public String getName() {
        return mName;
    }
}
