package exceptions_and_collections;

public class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException (String str)
    {
        super(str);
    }
}
