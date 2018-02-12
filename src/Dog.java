/* The purpose of an object in programming is it's mainly a place to store data.
 * While classes can "do" things, they're usually just manipulating data in the
 * background, hiding it from you. This "hiding" is called encapsulation or more simply,
 * "information hiding". Here, we hide the information for the name, age, status, and command,
 * due to the fact that if the person using the class (for now it's only you, but in the future
 * it may be other people) enters bad information, we can reject it. Look at the age method
 * for an example of rejecting bad data.
 */
public class Dog
{
    enum Status {
        Status_Hungry,
        Status_Playful,
        Status_Idle
    }

    private String name;
    private int age;
    private Status status;

    /*
        We create a constructor where we set the dog's information.
     */
    public Dog(String name, int age, Status status)
    {
        this.name = name;
        this.age = age;
        this.status = status;
    }

    public boolean play()
    {
        if (this.status != Status.Status_Playful)
        {
            return false;
        }

        this.status = Status.Status_Hungry;
        return true;
    }

    public boolean feed()
    {
        if (this.status != Status.Status_Hungry)
        {
            return false;
        }

        this.status = Status.Status_Idle;
        return true;
    }

    public void pet()
    {
        this.status = Status.Status_Playful;
    }

    /** GETTERS & SETTERS **/

    /* Notice that `this` refers to the current instance of the object.
     *
     * Due to the fact that the instance variables are all `private`, we
     * cannot access them outside of the class directly. Due to this, we
     * must then set them through methods. This is considered good practice.
     *
     * When using the contraction `this.var = var`, it can be translated to
     * english as `set this class's var with the parameter's var`. See setName()
     * for this implemented.
     */
    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return this.age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public Status getStatus()
    {
        return this.status;
    }

    public void setStatus(Status status)
    {
        this.status = status;
    }
}