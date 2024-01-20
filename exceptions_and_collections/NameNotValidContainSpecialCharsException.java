package exceptions_and_collections;

public class NameNotValidContainSpecialCharsException extends Exception{
    public NameNotValidContainSpecialCharsException (String str)
    {
        super(str);
    }
}
