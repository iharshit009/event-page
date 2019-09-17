internal class Walker // The walker class
{
    var location: PVector? = null // A vector object representing the location


    // Program to implement random walker

    var w: Walker? = null // Walker object

    init// Constructor to initialize the data member.
    {
        // Initial location of the walker object is
        // set to the middle of the output window.
        location = PVector(width / 2, height / 2)
    }

    fun display() // Function to display the walker object
    {
        // Drawing a black circle of radius 10 at location
        fill(0)
        ellipse(location!!.x, location!!.y, 10, 10)
    }

    fun setup() // Called at the beginning once
    {
        size(640, 360) // Declaring size of the output window
        background(255) // Setting a white background
        w = Walker() // Initializing the new walker object
    }

    fun draw() // Called every frame
    {
        w!!.walk() // Walking the Walker object
        w!!.checkEdges() // Checking for edges of the output screen.
        w!!.display() // Displaying the walker object
    }
}


internal class Walker // The walker class
{
    var location: PVector? = null // A vector object representing the location

    init// Constructor to initialize the data member.
    {
        // Initial location of the walker object is
        // set to the middle of the output window.
        location = PVector(width / 2, height / 2)
    }

    fun walk() {
        // The x and y values of the location
        // vector are incremented by a random value
        // between -5 and 5
        location!!.x += random(-5, 5)
        location!!.y += random(-5, 5)
    }

    // Function to prevent the Walker to move out of the screen
    fun checkEdges() {
        if (location!!.x < 0)
            location!!.x = 0
        else if (location!!.x > width)
            location!!.x = width
        if (location!!.y < 0)
            location!!.y = 0
        else if (location!!.y > height)
            location!!.y = height
    }

    fun display() // Function to display the walker object
    {
        // Drawing a black circle of radius 10 at location
        fill(0)
        ellipse(location!!.x, location!!.y, 10, 10)
    }
}// Walker object
// Called at the beginning once
// Declaring size of the output window
// Initializing the new walker object
// Called every frame
// Setting a white background
// Displaying the walker object



