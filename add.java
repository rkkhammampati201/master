// UserController.cs
using Microsoft.AspNetCore.Mvc;

public class UserController : Controller
{
    public IActionResult Register()
    {
        return View();
    }

    [HttpPost]
    public IActionResult Register(UserRegistrationModel model)
    {
        // Save user registration details to the database
        // You can use Entity Framework Core for database operations
        // Example: dbContext.Users.Add(model);
        return RedirectToAction("EducationDetails");
    }
}

// UserRegistrationModel.cs
public class UserRegistrationModel
{
    public string Username { get; set; }
    public string Password { get; set; }
    // Other user details like name, email, etc.
}

// Register.cshtml (View)
@model UserRegistrationModel

<form asp-action="Register" method="post">
    <input asp-for="Username" />
    <input asp-for="Password" />
    <!-- Other input fields -->
    <button type="submit">Register</button>
</form>

- UserRegistration
  - Controllers
    - UserController.cs
  - Models
    - UserRegistrationModel.cs
  - Views
    - User
      - Register.cshtml
- PaymentDetails
- PendingAmount
- TopScorers
- StudentMarks
- Laptop
- AsusLaptop
- TicketingSystem
- TourDetails

