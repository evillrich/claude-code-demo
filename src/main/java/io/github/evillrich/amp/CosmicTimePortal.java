package io.github.evillrich.amp;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 * A cosmic journey through time and space to discover the current EST moment
 */
public class CosmicTimePortal {
    
    private static final String[] COSMIC_FACTS = {
        "🌟 Did you know? A second on Earth is 1/31,557,600th of a year!",
        "⭐ Time moves slower in stronger gravitational fields!",
        "🚀 On the International Space Station, astronauts age slightly slower!",
        "🌌 The concept of 'now' is relative throughout the universe!",
        "💫 Einstein showed us that time is not constant but flexible!",
        "🔭 Light from the nearest star takes 4.37 years to reach us!",
        "🌍 EST was first standardized by railroad companies in 1883!"
    };
    
    public static void main(String[] args) {
        // Begin the cosmic journey! 🚀
        System.out.println("🌌 Initializing Cosmic Time Portal... 🌌");
        System.out.println("⚡ AMP-powered temporal displacement engine activated! ⚡");
        
        // Simulate portal opening sequence
        openPortal();
        
        // Get EST time
        ZonedDateTime estTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        
        // Display the cosmic time discovery
        displayTimeDiscovery(estTime);
        
        // Share cosmic wisdom
        shareCosmicWisdom();
        
        System.out.println("\n🌟 Portal closing... Safe travels through time and space! 🌟");
    }
    
    private static void openPortal() {
        System.out.println("\n🔮 Opening interdimensional portal to EST time zone...");
        
        // Simulate loading with a progress effect
        String[] loadingStages = {"◐", "◓", "◑", "◒"};
        for (int i = 0; i < 8; i++) {
            System.out.print("\r⏳ Scanning temporal coordinates... " + loadingStages[i % 4]);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("\r✨ Portal successfully opened to Eastern Standard Time dimension! ✨");
        
        // Display the portal ASCII art
        printPortalArt();
    }
    
    private static void printPortalArt() {
        System.out.println("\n" +
            "    ╔══════════════════════════════════════════════════════════╗\n" +
            "    ║                  🌌 COSMIC TIME PORTAL 🌌                 ║\n" +
            "    ║                                                          ║\n" +
            "    ║        ░░░██████░░░░░░██████░░░░░░██████░░░              ║\n" +
            "    ║      ░░██░░░░░░██░░██░░░░░░██░░██░░░░░░██░░              ║\n" +
            "    ║    ░░██░░░░██░░░░████░░░░██░░░░████░░░░██░░░░            ║\n" +
            "    ║    ██░░░░██░░░░░░░░░░██░░░░░░░░░░░░██░░░░██              ║\n" +
            "    ║    ██░░██░░░░░░░░░░░░░░████░░░░░░░░░░██░░██              ║\n" +
            "    ║    ██░░██░░░░░░░  EST ZONE  ░░░░░░░░██░░██              ║\n" +
            "    ║    ██░░██░░░░░░░░░░░░░░████░░░░░░░░░░██░░██              ║\n" +
            "    ║    ██░░░░██░░░░░░░░░░██░░░░░░░░░░░░██░░░░██              ║\n" +
            "    ║    ░░██░░░░██░░░░████░░░░██░░░░████░░░░██░░░░            ║\n" +
            "    ║      ░░██░░░░░░██░░██░░░░░░██░░██░░░░░░██░░              ║\n" +
            "    ║        ░░░██████░░░░░░██████░░░░░░██████░░░              ║\n" +
            "    ║                                                          ║\n" +
            "    ╚══════════════════════════════════════════════════════════╝");
    }
    
    private static void displayTimeDiscovery(ZonedDateTime estTime) {
        System.out.println("\n🎯 TEMPORAL COORDINATES LOCKED! 🎯");
        System.out.println("📡 Receiving transmission from EST dimension...");
        
        // Format the time in various ways for creative display
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        DateTimeFormatter zoneFormatter = DateTimeFormatter.ofPattern("zzz");
        
        System.out.println("\n╔═══════════════════════════════════════════════════════════╗");
        System.out.println("║                    🕰️  COSMIC TIME READING  🕰️              ║");
        System.out.println("║                                                           ║");
        System.out.printf("║  📅 Date: %-47s ║%n", estTime.format(dateFormatter));
        System.out.printf("║  ⏰ Time: %-47s ║%n", estTime.format(timeFormatter));
        System.out.printf("║  🌍 Zone: %-47s ║%n", estTime.format(zoneFormatter));
        System.out.println("║                                                           ║");
        
        // Add some cosmic context
        int dayOfYear = estTime.getDayOfYear();
        int hour = estTime.getHour();
        String cosmicContext = getCosmicContext(hour, dayOfYear);
        System.out.printf("║  %s ║%n", cosmicContext);
        
        System.out.println("╚═══════════════════════════════════════════════════════════╝");
    }
    
    private static String getCosmicContext(int hour, int dayOfYear) {
        if (hour >= 5 && hour < 12) {
            return "🌅 Morning cosmic energy detected! Perfect time for new beginnings.";
        } else if (hour >= 12 && hour < 17) {
            return "☀️ Afternoon solar power at peak! Maximum productivity detected.   ";
        } else if (hour >= 17 && hour < 21) {
            return "🌆 Evening tranquility approaching. Time to reflect on the day.    ";
        } else {
            return "🌙 Nocturnal cosmic forces active! The universe whispers secrets.  ";
        }
    }
    
    private static void shareCosmicWisdom() {
        Random random = new Random();
        String randomFact = COSMIC_FACTS[random.nextInt(COSMIC_FACTS.length)];
        
        System.out.println("\n🔬 COSMIC WISDOM TRANSMISSION 🔬");
        System.out.println("📡 The Time Lords share their knowledge:");
        System.out.println("   " + randomFact);
        System.out.println("\n💭 Remember: Every moment is a gift from the cosmos!");
        System.out.println("🎪 You are currently experiencing this exact moment only once in all of eternity!");
    }
}