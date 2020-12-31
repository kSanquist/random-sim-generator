# random-sim-generator
Code used to generate a random Sim in the Sims 4!

#### The output simply displays random values for the following Sim attributes: ####
**Type** -- Whether the Sim is a human or an occult Sim  
**Gender** -- The gender of the sim (male or female)  
**Age** -- The age of the sim (young adult, adult, elder)  
**Voice** -- The number at which the voice slider is set (1 being the highest setting, 6 being the lowest)  
**Walk** -- The walkstyle of the Sim (Default, Bouncy, etc.)  
**First Name Dice CLicks** -- The number of times the random dice is clicked for a random first name  
**Last Name Dice Clicks** -- The number of times the random dice is clicked for a random last name  
**Appearance Dice Clicks** -- The number of times the random dice is clicked for the appearance of the Sim (face structure, clothes, etc.)  
**Aspiration** -- The Sim's aspiration in game (Best Selling Author, Big Happy Family, etc.)  
**Trait 1, 2, and 3** -- The three traits of the randomly generated Sim (evil, cheerful, hot-headed, etc.)  

#### Example program output: ####
*** RANDOM SIM GENERATED **************************  
Gender: Male  
Type: Alien  
Age: Adult  
Number of Dice Clicks for First Name: 4  
Number of DIce Clicks for Appearance: 2  
Number of DIce Clicks for Last Name: 10  
Voice (1 - highest, 6 - lowest): 5  
Walk Style: Bouncy  
Aspiration: Chief of Mischief  
Trait 1: Cheerful  
Trait 2: Childish  
Trait 3: Dance Machine  
\***************************************************  

#### Highlights ####
One aspect of the program that is particularly appealing is the checkSimTraits() function, this function requires three parameters, the Sims
1st, 2nd, and 3rd traits. This function takes the traits and checks their compatability, this is an important aspect to the program as some traits
cannot be paired with other traints, example, if a Sim has the Cheerful trait, they cannot have the trait of Gloomy, or Hot-Headed. The checkSimTraits()
is there to check such that using complicated if statements and logical operators.

Another highlight of the program is the use of nested switches. This can be seen in the getSimAspiration() method, where it chooses a random integer from 0 to 11, since there are 12 aspirations to choose from, finds, the appropriate aspiration and then proceeds to pick another random integer that corresponds to one of the sub-aspirations of an aspiration. An example of sub-aspirations would be the aspiration Creativity, having four sub-aspirations of "Best Selling Author", 
"Musical Genius", "Master Actor", and "Painter Extraordinaire".
