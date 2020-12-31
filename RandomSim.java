import org.jetbrains.annotations.NotNull;
import java.util.Random;

public class RandomSim
{
    Random random = new Random();
    String type = getSimType();
    String gender = getSimGender();
    String age = getSimAge();
    int voice = getSimVoice();
    String walk = getSimWalk();
    int firstNameDiceClicks = getDiceClicks();
    int lastNameDiceClicks = getDiceClicks();
    int appearanceDiceClicks = getDiceClicks();
    String aspiration = getSimAspiration();
    String trait1 = getSimTrait();
    String trait2 = getSimTrait();
    String trait3 = getSimTrait();

    public RandomSim() {
        System.out.println("*** RANDOM SIM GENERATED **************************");
        System.out.println("Gender: " + gender);
        System.out.println("Type: " + type);
        System.out.println("Age: " + age);
        System.out.println("Number of Dice Clicks for First Name: " + firstNameDiceClicks);
        System.out.println("Number of DIce Clicks for Appearance: " + appearanceDiceClicks);
        System.out.println("Number of Dice CLicks for Last Name: " + lastNameDiceClicks);
        System.out.println("Voice (1 - highest, 6 - lowest): " + voice);
        System.out.println("Walk Style: " + walk);
        System.out.println("Aspiration: " + aspiration);
        while((!checkSimTraits(trait1, trait2, trait3)) && trait1.equals(trait2) || trait1.equals(trait3)
                || trait2.equals(trait3)) {
            trait1 = getSimTrait();
            trait2 = getSimTrait();
            trait3 = getSimTrait();
        }
        System.out.println("Trait 1: " + trait1);
        System.out.println("Trait 2: " + trait2);
        System.out.println("Trait 3: " + trait3);
        System.out.println("***************************************************");
        System.out.println();
    }

    public String getSimType() {
        int type = random.nextInt(2);
        if(type == 0) {
            return "Human";
        }
        else {
            int occultType = random.nextInt(2);
            if(occultType == 0) {
                return "Vampire";
            }
            else {
                return "Alien";
            }
        }
    }

    public String getSimGender() {
        int gender = random.nextInt(2);
        if(gender == 0) {
            return "Male";
        }
        else {
            return "Female";
        }
    }

    public String getSimAge() {
        int age = random.nextInt(3);
        if(age == 0) {
            return "Young Adult";
        }
        else if(age == 1) {
            return "Adult";
        }
        else {
            return "Elder";
        }
    }

    public int getSimVoice() {
        return random.nextInt(6) + 1;
    }

    public String getSimWalk() {
        int walkStyle = random.nextInt(10);
        return switch (walkStyle) {
            case 0 -> "Default";
            case 1 -> "Perky";
            case 2 -> "Snooty";
            case 3 -> "Swagger";
            case 4 -> "Feminine";
            case 5 -> "Tough";
            case 6 -> "Goofy";
            case 7 -> "Sluggish";
            case 8 -> "Bouncy";
            case 9 -> "Creepy";
            default -> "";
        };
    }

    public int getDiceClicks() {
        return random.nextInt(10) + 1;
    }

    public String getSimAspiration() {
        int aspiration = random.nextInt(12);
        String aspString = "";
        switch (aspiration) {
            case 0 -> aspString = "Friend of the Animals";
            case 1 -> aspString = "Body Builder";
            case 2 -> {
                int creativeAsp = random.nextInt(4);
                switch (creativeAsp) {
                    case 0 -> aspString = "Bestselling Author";
                    case 1 -> aspString = "Musical Genius";
                    case 2 -> aspString = "Master Actor";
                    case 3 -> aspString = "Painter Extraordinaire";
                }
            }
            case 3 -> {
                int devianceAsp = random.nextInt(2);
                switch (devianceAsp) {
                    case 0 -> aspString = "Public Enemy";
                    case 1 -> aspString = "Chief of Mischief";
                }
            }
            case 4 -> {
                int familyAsp = random.nextInt(4);
                switch (familyAsp) {
                    case 0 -> aspString = "Big Happy Family";
                    case 1 -> aspString = "Vampire Family";
                    case 2 -> aspString = "Super Parent";
                    case 3 -> aspString = "Successful Lineage";
                }
            }
            case 5 -> {
                int foodAsp = random.nextInt(2);
                switch (foodAsp) {
                    case 0 -> aspString = "Master Chef";
                    case 1 -> aspString = "Master Mixologist";
                }
            }
            case 6 -> {
                int fortuneAsp = random.nextInt(2);
                switch (fortuneAsp) {
                    case 0 -> aspString = "Fabulously Wealthy";
                    case 1 -> aspString = "Mansion Baron";
                }
            }
            case 7 -> {
                int knowledgeAsp = random.nextInt(5);
                switch (knowledgeAsp) {
                    case 0 -> aspString = "Computer Whiz";
                    case 1 -> aspString = "Nerd Brain";
                    case 2 -> aspString = "Master Vampire";
                    case 3 -> aspString = "Renaissance Sim";
                    case 4 -> aspString = "Archaeology Scholar";
                }
            }
            case 8 -> {
                int locationAsp = random.nextInt(2);
                switch (locationAsp) {
                    case 0 -> aspString = "Strangeville Mystery";
                    case 1 -> aspString = "City Native";
                }
            }
            case 9 -> {
                int loveAsp = random.nextInt(2);
                switch (loveAsp) {
                    case 0 -> aspString = "Serial Romantic";
                    case 1 -> aspString = "Soulmate";
                }
            }
            case 10 -> {
                int natureAsp = random.nextInt(5);
                switch (natureAsp) {
                    case 0 -> aspString = "The Curator";
                    case 1 -> aspString = "Jungle Explorer";
                    case 2 -> aspString = "Outdoor Enthusiast";
                    case 3 -> aspString = "Freelance Botanist";
                    case 4 -> aspString = "Angle Ace";
                }
            }
            case 11 -> {
                int popularityAsp = random.nextInt(6);
                switch (popularityAsp) {
                    case 0 -> aspString = "Friend of the World";
                    case 1 -> aspString = "Party Animal";
                    case 2 -> aspString = "Good Vampire";
                    case 3 -> aspString = "World-Famous Celebrity";
                    case 4 -> aspString = "Leader of the Pack";
                    case 5 -> aspString = "Joke Star";
                }
            }
        }
        return aspString;
    }

    public String getSimTrait() {
        int simTrait = random.nextInt(45);
        return switch(simTrait) {
            case 0 -> "Active";
            case 1 -> "Cheerful";
            case 2 -> "Creative";
            case 3 -> "Genius";
            case 4 -> "Gloomy";
            case 5 -> "Goofball";
            case 6 -> "Hot-Headed";
            case 7 -> "Romantic";
            case 8 -> "Self-Assured";
            case 9 -> "Unflirty";
            case 10 -> "Art Lover";
            case 11 -> "Bookworm";
            case 12 -> "Foodie";
            case 13 -> "Geek";
            case 14 -> "Music Lover";
            case 15 -> "Perfectionist";
            case 16 -> "Ambitious";
            case 17 -> "Cat Lover";
            case 18 -> "Childish";
            case 19 -> "Clumsy";
            case 20 -> "Dance Machine";
            case 21 -> "Dog Lover";
            case 22 -> "Erratic";
            case 23 -> "Glutton";
            case 24 -> "Kleptomaniac";
            case 25 -> "Lazy";
            case 26 -> "Loves Outdoors";
            case 27 -> "Materialistic";
            case 28 -> "Neat";
            case 29 -> "Slob";
            case 30 -> "Snob";
            case 31 -> "Squeamish";
            case 32 -> "Vegetarian";
            case 33 -> "Bro";
            case 34 -> "Evil";
            case 35 -> "Family-Oriented";
            case 36 -> "Good";
            case 37 -> "Hates Children";
            case 38 -> "Insider";
            case 39 -> "Jealous";
            case 40 -> "Loner";
            case 41 -> "Mean";
            case 42 -> "Noncommittal";
            case 43 -> "Outgoing";
            case 44 -> "Paranoid";
            default -> "";
        };
    }

    @SuppressWarnings("DuplicateCondition")
    public boolean checkSimTraits(@NotNull String trait1, String trait2, String trait3) {

        // Active
        if(trait1.equals("Active") && (trait2.equals("Lazy") || trait3.equals("Lazy"))) {
            return false;
        }
        if(trait2.equals("Active") && (trait1.equals("Lazy") || trait3.equals("Lazy"))) {
            return false;
        }
        if(trait3.equals("Active") && (trait1.equals("Lazy") || trait2.equals("Lazy"))) {
            return false;
        }

        // Cheerful
        boolean cheerfulTestTrait1 = trait1.equals("Gloomy") || trait1.equals("Hot-Headed");
        boolean cheerfulTestTrait2 = trait2.equals("Gloomy") || trait2.equals("Hot-Headed");
        boolean cheerfulTestTrait3 = trait3.equals("Gloomy") || trait3.equals("Hot-Headed");
        
        if(trait1.equals("Cheerful") && cheerfulTestTrait2 || cheerfulTestTrait3) {
            return false;
        }
        if(trait2.equals("Cheerful") && cheerfulTestTrait1 || cheerfulTestTrait3) {
            return false;
        }
        if(trait3.equals("Cheerful") && cheerfulTestTrait1 || cheerfulTestTrait2) {
            return false;
        }

        // Gloomy
        boolean gloomyTestTrait1 = trait1.equals("Cheerful") || trait1.equals("Hot-Headed");
        boolean gloomyTestTrait2 = trait2.equals("Cheerful") || trait2.equals("Hot-Headed");
        boolean gloomyTestTrait3 = trait3.equals("Cheerful") || trait3.equals("Hot-Headed"); 
        
        if(trait1.equals("Gloomy") && gloomyTestTrait2 || gloomyTestTrait3) {
            return false;
        }
        if(trait2.equals("Gloomy") && gloomyTestTrait1 || gloomyTestTrait3) {
            return false;
        }
        if(trait3.equals("Gloomy") && gloomyTestTrait1 || gloomyTestTrait2) {
            return false;
        }

        // Goofball
        if(trait1.equals("Goofball") && trait2.equals("Snob") || trait3.equals("Snob")) {
            return false;
        }
        if(trait2.equals("Goofball") && trait1.equals("Snob") || trait3.equals("Snob")) {
            return false;
        }
        if(trait3.equals("Goofball") && trait1.equals("Snob") || trait2.equals("Snob")) {
            return false;
        }

        // Hot-Headed
        boolean hotHeadedTestTrait1 = trait1.equals("Cheerful") || trait1.equals("Gloomy");
        boolean hotHeadedTestTrait2 = trait2.equals("Cheerful") || trait2.equals("Gloomy");
        boolean hotHeadedTestTrait3 = trait3.equals("Cheerful") || trait3.equals("Gloomy");
        
        if(trait1.equals("Hot-Headed") && hotHeadedTestTrait2 || hotHeadedTestTrait3) {
            return false;
        }
        if(trait2.equals("Hot-Headed") && hotHeadedTestTrait1 || hotHeadedTestTrait3) {
            return false;
        }
        if(trait3.equals("Hot-Headed") && hotHeadedTestTrait1 || hotHeadedTestTrait2) {
            return false;
        }

        // Romantic
        if(trait1.equals("Romantic") && trait2.equals("Unflirty") || trait3.equals("Unflirty")) {
            return false;
        }
        if(trait2.equals("Romantic") && trait1.equals("Unflirty") || trait3.equals("Unflirty")) {
            return false;
        }
        if(trait3.equals("Romantic") && trait1.equals("Unflirty") || trait2.equals("Unflirty")) {
            return false;
        }

        // Unflirty
        if(trait1.equals("Unflirty") && trait2.equals("Romantic") || trait3.equals("Romantic")) {
            return false;
        }
        if(trait2.equals("Unflirty") && trait1.equals("Romantic") || trait3.equals("Romantic")) {
            return false;
        }
        if(trait3.equals("Unflirty") && trait1.equals("Romantic") || trait2.equals("Romantic")) {
            return false;
        }

        // Foodie
        if(trait1.equals("Foodie") && trait2.equals("Glutton") || trait3.equals("Glutton")) {
            return false;
        }
        if(trait2.equals("Foodie") && trait1.equals("Glutton") || trait3.equals("Glutton")) {
            return false;
        }
        if(trait3.equals("Foodie") && trait1.equals("Glutton") || trait2.equals("Glutton")) {
            return false;
        }

        // Ambitious
        if(trait1.equals("Ambitious") && trait2.equals("Lazy") || trait3.equals("Lazy")) {
            return false;
        }
        if(trait2.equals("Ambitious") && trait1.equals("Lazy") || trait3.equals("Lazy")) {
            return false;
        }
        if(trait3.equals("Ambitious") && trait1.equals("Lazy") || trait2.equals("Lazy")) {
            return false;
        }

        // Childish
        boolean childishTestTrait1 = trait1.equals("Snob") || trait1.equals("Evil") || trait1.equals("Hates Children");
        boolean childishTestTrait2 = trait2.equals("Snob") || trait2.equals("Evil") || trait2.equals("Hates Children");
        boolean childishTestTrait3 = trait3.equals("Snob") || trait3.equals("Evil") || trait3.equals("Hates Children");
        
        if(trait1.equals("Childish") && childishTestTrait2 || childishTestTrait3) {
            return false;
        }
        if(trait2.equals("Childish") && childishTestTrait1 || childishTestTrait3) {
            return false;
        }
        if(trait3.equals("Childish") && childishTestTrait1 || childishTestTrait2) {
            return false;
        }

        // Glutton
        boolean gluttonTestTrait1 = trait1.equals("Squeamish") || trait1.equals("Foodie");
        boolean gluttonTestTrait2 = trait2.equals("Squeamish") || trait2.equals("Foodie");
        boolean gluttonTestTrait3 = trait3.equals("Squeamish") || trait3.equals("Foodie");

        if(trait1.equals("Glutton") && gluttonTestTrait2 || gluttonTestTrait3) {
            return false;
        }
        if(trait2.equals("Glutton") && gluttonTestTrait1 || gluttonTestTrait3) {
            return false;
        }
        if(trait3.equals("Glutton") && gluttonTestTrait1 || gluttonTestTrait2) {
            return false;
        }

        // Kleptomaniac
        if(trait1.equals("Kleptomaniac") && trait2.equals("Good") || trait3.equals("Good")) {
            return false;
        }
        if(trait2.equals("Kleptomaniac") && trait1.equals("Good") || trait3.equals("Good")) {
            return false;
        }
        if(trait3.equals("Kleptomaniac") && trait1.equals("Good") || trait2.equals("Good")) {
            return false;
        }

        // Lazy
        boolean lazyTestTrait1 = trait1.equals("Active") || trait1.equals("Ambitious") || trait1.equals("Neat");
        boolean lazyTestTrait2 = trait2.equals("Active") || trait2.equals("Ambitious") || trait2.equals("Neat");
        boolean lazyTestTrait3 = trait3.equals("Active") || trait3.equals("Ambitious") || trait3.equals("Neat");

        if(trait1.equals("Lazy") && lazyTestTrait2 || lazyTestTrait3) {
            return false;
        }
        if(trait2.equals("Lazy") && lazyTestTrait1 || lazyTestTrait3) {
            return false;
        }
        if(trait3.equals("Lazy") && lazyTestTrait1 || lazyTestTrait2) {
            return false;
        }

        // Loves Outdoors
        if(trait1.equals("Loves Outdoors") && trait2.equals("Squeamish") || trait3.equals("Squeamish")) {
            return false;
        }
        if(trait2.equals("Loves Outdoors") && trait1.equals("Squeamish") || trait3.equals("Squeamish")) {
            return false;
        }
        if(trait3.equals("Loves Outdoors") && trait1.equals("Squeamish") || trait2.equals("Squeamish")) {
            return false;
        }

        // Neat
        boolean neatTestTrait1 = trait1.equals("Lazy") || trait1.equals("Slob");
        boolean neatTestTrait2 = trait2.equals("Lazy") || trait2.equals("Slob");
        boolean neatTestTrait3 = trait3.equals("Lazy") || trait3.equals("Slob");

        if(trait1.equals("Neat") && neatTestTrait2 || neatTestTrait3) {
            return false;
        }
        if(trait2.equals("Neat") && neatTestTrait1 || neatTestTrait3) {
            return false;
        }
        if(trait3.equals("Neat") && neatTestTrait1 || neatTestTrait2) {
            return false;
        }

        // Slob
        boolean slobTestTrait1 = trait1.equals("Neat") || trait1.equals("Squeamish");
        boolean slobTestTrait2 = trait2.equals("Neat") || trait2.equals("Squeamish");
        boolean slobTestTrait3 = trait3.equals("Neat") || trait3.equals("Squeamish");

        if(trait1.equals("Slob") && slobTestTrait2 || slobTestTrait3) {
            return false;
        }
        if(trait2.equals("Slob") && slobTestTrait1 || slobTestTrait3) {
            return false;
        }
        if(trait3.equals("Slob") && slobTestTrait1 || slobTestTrait2) {
            return false;
        }

        // Snob
        boolean snobTestTrait1 = trait1.equals("Goofball") || trait1.equals("Childish");
        boolean snobTestTrait2 = trait2.equals("Goofball") || trait2.equals("Childish");
        boolean snobTestTrait3 = trait3.equals("Goofball") || trait3.equals("Childish");

        if(trait1.equals("Snob") && snobTestTrait2 || snobTestTrait3) {
            return false;
        }
        if(trait2.equals("Snob") && snobTestTrait1 || snobTestTrait3) {
            return false;
        }
        if(trait3.equals("Snob") && snobTestTrait1 || snobTestTrait2) {
            return false;
        }

        // Squeamish
        boolean squeamishTestTrait1 = trait1.equals("Glutton") || trait1.equals("Loves Outdoors") || trait1.equals("Slob");
        boolean squeamishTestTrait2 = trait2.equals("Glutton") || trait2.equals("Loves Outdoors") || trait2.equals("Slob");
        boolean squeamishTestTrait3 = trait3.equals("Glutton") || trait3.equals("Loves Outdoors") || trait3.equals("Slob");

        if(trait1.equals("Squeamish") && squeamishTestTrait2 || squeamishTestTrait3) {
            return false;
        }
        if(trait2.equals("Squeamish") && squeamishTestTrait1 || squeamishTestTrait3) {
            return false;
        }
        if(trait3.equals("Squeamish") && squeamishTestTrait1 || squeamishTestTrait2) {
            return false;
        }

        // Evil
        boolean evilTestTrait1 = trait1.equals("Good") || trait1.equals("Childish");
        boolean evilTestTrait2 = trait2.equals("Good") || trait2.equals("Childish");
        boolean evilTestTrait3 = trait3.equals("Good") || trait3.equals("Childish");

        if(trait1.equals("Evil") && evilTestTrait2 || evilTestTrait3) {
            return false;
        }
        if(trait2.equals("Evil") && evilTestTrait1 || evilTestTrait3) {
            return false;
        }
        if(trait3.equals("Evil") && evilTestTrait1 || evilTestTrait2) {
            return false;
        }

        // Family-Oriented
        boolean famOrientedTestTrait1 = trait1.equals("Hates Children") || trait1.equals("Noncommittal");
        boolean famOrientedTestTrait2 = trait2.equals("Hates Children") || trait2.equals("Noncommittal");
        boolean famOrientedTestTrait3 = trait3.equals("Hates Children") || trait3.equals("Noncommittal");

        if(trait1.equals("Family-Oriented") && famOrientedTestTrait2 || famOrientedTestTrait3) {
            return false;
        }
        if(trait2.equals("Family-Oriented") && famOrientedTestTrait1 || famOrientedTestTrait3) {
            return false;
        }
        if(trait3.equals("Family-Oriented") && famOrientedTestTrait1 || famOrientedTestTrait2) {
            return false;
        }

        // Good
        boolean goodTestTrait1 = trait1.equals("Kleptomaniac") || trait1.equals("Evil") || trait1.equals("Mean");
        boolean goodTestTrait2 = trait2.equals("Kleptomaniac") || trait2.equals("Evil") || trait2.equals("Mean");
        boolean goodTestTrait3 = trait3.equals("Kleptomaniac") || trait3.equals("Evil") || trait3.equals("Mean");

        if(trait1.equals("Good") && goodTestTrait2 || goodTestTrait3) {
            return false;
        }
        if(trait2.equals("Good") && goodTestTrait1 || goodTestTrait3) {
            return false;
        }
        if(trait3.equals("Good") && goodTestTrait1 || goodTestTrait2) {
            return false;
        } 

        // Hates Children
        boolean hateChildTestTrait1 = trait1.equals("Family-Oriented") || trait1.equals("Childish");
        boolean hateChildTestTrait2 = trait2.equals("Family-Oriented") || trait2.equals("Childish");
        boolean hateChildTestTrait3 = trait3.equals("Family-Oriented") || trait3.equals("Childish");

        if(trait1.equals("Hates Children") && hateChildTestTrait2 || hateChildTestTrait3) {
            return false;
        }
        if(trait2.equals("Hates Children") && hateChildTestTrait1 || hateChildTestTrait3) {
            return false;
        }
        if(trait3.equals("Hates Children") && hateChildTestTrait1 || hateChildTestTrait2) {
            return false;
        }

        // Insider
        if(trait1.equals("Insider") && trait2.equals("Loner") || trait3.equals("Loner")) {
            return false;
        }
        if(trait2.equals("Insider") && trait1.equals("Loner") || trait3.equals("Loner")) {
            return false;
        }
        if(trait3.equals("Insider") && trait1.equals("Loner") || trait2.equals("Loner")) {
            return false;
        }

        // Loner
        boolean lonerTestTrait1 = trait1.equals("Insider") || trait1.equals("Outgoing");
        boolean lonerTestTrait2 = trait2.equals("Insider") || trait2.equals("Outgoing");
        boolean lonerTestTrait3 = trait3.equals("Insider") || trait3.equals("Outgoing");

        if(trait1.equals("Loner") && lonerTestTrait2 || lonerTestTrait3) {
            return false;
        }
        if(trait2.equals("Loner") && lonerTestTrait1 || lonerTestTrait3) {
            return false;
        }
        if(trait3.equals("Loner") && lonerTestTrait1 || lonerTestTrait2) {
            return false;
        }

        // Mean
        if(trait1.equals("Mean") && trait2.equals("Good") || trait3.equals("Good")) {
            return false;
        }
        if(trait2.equals("Mean") && trait1.equals("Good") || trait3.equals("Good")) {
            return false;
        }
        if(trait3.equals("Mean") && trait1.equals("Good") || trait2.equals("Good")) {
            return false;
        }

        // Noncommittal
        if(trait1.equals("Noncommittal") && trait2.equals("Family-Oriented") || trait3.equals("Family-Oriented")) {
            return false;
        }
        if(trait2.equals("Noncommittal") && trait1.equals("Family-Oriented") || trait3.equals("Family-Oriented")) {
            return false;
        }
        if(trait3.equals("Noncommittal") && trait1.equals("Family-Oriented") || trait2.equals("Family-Oriented")) {
            return false;
        }

        // Outgoing
        boolean outgoingTestTrait1 = trait1.equals("Loner") || trait1.equals("Paranoid");
        boolean outgoingTestTrait2 = trait2.equals("Loner") || trait2.equals("Paranoid");
        boolean outgoingTestTrait3 = trait3.equals("Loner") || trait3.equals("Paranoid");

        if(trait1.equals("Outgoing") && outgoingTestTrait2 || outgoingTestTrait3) {
            return false;
        }
        if(trait2.equals("Outgoing") && outgoingTestTrait1 || outgoingTestTrait3) {
            return false;
        }
        if(trait3.equals("Outgoing") && outgoingTestTrait1 || outgoingTestTrait2) {
            return false;
        }

        // Paranoid
        if(trait1.equals("Paranoid") && trait2.equals("Outgoing") || trait3.equals("Outgoing")) {
            return false;
        }
        if(trait2.equals("Paranoid") && trait1.equals("Outgoing") || trait3.equals("Outgoing")) {
            return false;
        }
        if(trait3.equals("Paranoid") && trait1.equals("Outgoing") || trait2.equals("Outgoing")) {
            return false;
        }

        return true;
    }
}
