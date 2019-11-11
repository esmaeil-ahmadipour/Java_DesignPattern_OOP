package ir.sample.DesignPatternBuilder2;

public class EmailService
{
    String Username;
    String Password;
    String FirstName;
    String LastName;
    String Location;

    public static class Builder
    {
        private String username; //This is important, so we'll pass it to the constructor.
        private String password;
        private String firstName;
        private String lastName;
        private String location;

        public Builder(String username)
        {
            this.username = username;
        }

        public Builder setFirstName(String firstName)
        {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName)
        {
            this.lastName = lastName;
            return this;
        }

        public Builder setLocation(String location)
        {
            this.location = location;
            return this;
        }

        public Builder setPassword(String password)
        {
            this.password = password;
            return this;
        }


        public EmailService build()
        {
            EmailService service = new EmailService();
            service.Username = this.username;
            service.Password = this.password;
            service.FirstName = this.firstName;
            service.LastName = this.lastName;
            service.Location = this.location;
            return service;
        }
    }

    private EmailService()
    {
        //Constructor is now private.
    }
}
