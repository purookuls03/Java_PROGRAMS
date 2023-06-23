class PurooException extends Exception
{
    public String toString()
    {
        return "Exception is occured..........";
    }
}

class UserDefineException {
    static void sum(int a, int b) throws PurooException {
        if (a < 0) {
            throw new PurooException();
        }
        else {
            System.out.println(a + b);
        }
    }

    public static void main(String[] args) {
        try {
            sum(-10, 10);
        }
        catch (PurooException me) {
            System.out.println(me);
        }
    }
}