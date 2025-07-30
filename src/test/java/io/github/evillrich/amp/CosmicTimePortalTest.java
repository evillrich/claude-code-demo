package io.github.evillrich.amp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.lang.reflect.Method;

/**
 * Unit tests for CosmicTimePortal - testing the cosmic journey through time and space
 */
public class CosmicTimePortalTest {
    
    private ByteArrayOutputStream outputStream;
    private PrintStream originalOut;
    
    @BeforeEach
    void setUp() {
        // Capture system output for testing print statements
        outputStream = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
    }
    
    void tearDown() {
        // Restore original system output
        System.setOut(originalOut);
    }
    
    @Test
    @DisplayName("Should display cosmic portal ASCII art")
    void testPrintPortalArt() throws Exception {
        // Use reflection to test private method
        Method printPortalArt = CosmicTimePortal.class.getDeclaredMethod("printPortalArt");
        printPortalArt.setAccessible(true);
        printPortalArt.invoke(null);
        
        String output = outputStream.toString();
        
        // Verify cosmic elements are present
        assertTrue(output.contains("COSMIC TIME PORTAL"), "Should contain portal title");
        assertTrue(output.contains("EST"), "Should contain EST zone indicator");
        assertTrue(output.contains("TIME"), "Should contain TIME text");
        assertTrue(output.contains("ZONE"), "Should contain ZONE text");
        assertTrue(output.contains("PORTAL"), "Should contain PORTAL text");
        assertTrue(output.contains("ACTIVE"), "Should contain ACTIVE status");
        assertTrue(output.contains("CONNECTED"), "Should contain CONNECTED status");
        
        // Verify cosmic emojis are present
        assertTrue(output.contains("🌌"), "Should contain galaxy emoji");
        assertTrue(output.contains("⭐"), "Should contain star emoji");
        assertTrue(output.contains("✨"), "Should contain sparkles emoji");
        assertTrue(output.contains("🚀"), "Should contain rocket emoji");
        assertTrue(output.contains("🔮"), "Should contain crystal ball emoji");
        
        // Verify proper box structure
        assertTrue(output.contains("╔"), "Should contain top-left box corner");
        assertTrue(output.contains("╗"), "Should contain top-right box corner");
        assertTrue(output.contains("╚"), "Should contain bottom-left box corner");
        assertTrue(output.contains("╝"), "Should contain bottom-right box corner");
        assertTrue(output.contains("║"), "Should contain vertical box lines");
        
        tearDown();
    }
    
    @Test
    @DisplayName("Should provide cosmic context based on time of day")
    void testGetCosmicContext() throws Exception {
        // Use reflection to test private method
        Method getCosmicContext = CosmicTimePortal.class.getDeclaredMethod("getCosmicContext", int.class, int.class);
        getCosmicContext.setAccessible(true);
        
        // Test morning context (5-11)
        String morningContext = (String) getCosmicContext.invoke(null, 8, 100);
        assertTrue(morningContext.contains("Morning cosmic energy"), "Should provide morning context");
        assertTrue(morningContext.contains("🌅"), "Should contain sunrise emoji");
        
        // Test afternoon context (12-16)
        String afternoonContext = (String) getCosmicContext.invoke(null, 14, 100);
        assertTrue(afternoonContext.contains("Afternoon solar power"), "Should provide afternoon context");
        assertTrue(afternoonContext.contains("☀️"), "Should contain sun emoji");
        
        // Test evening context (17-20)
        String eveningContext = (String) getCosmicContext.invoke(null, 19, 100);
        assertTrue(eveningContext.contains("Evening tranquility"), "Should provide evening context");
        assertTrue(eveningContext.contains("🌆"), "Should contain cityscape emoji");
        
        // Test night context (21-4)
        String nightContext = (String) getCosmicContext.invoke(null, 23, 100);
        assertTrue(nightContext.contains("Nocturnal cosmic forces"), "Should provide night context");
        assertTrue(nightContext.contains("🌙"), "Should contain moon emoji");
        
        // Test edge case - early morning (should be night)
        String earlyMorningContext = (String) getCosmicContext.invoke(null, 3, 100);
        assertTrue(earlyMorningContext.contains("Nocturnal cosmic forces"), "Should provide night context for early morning");
    }
    
    @Test
    @DisplayName("Should display time discovery with proper formatting")
    void testDisplayTimeDiscovery() throws Exception {
        // Create a test time
        ZonedDateTime testTime = ZonedDateTime.of(2025, 7, 30, 15, 30, 45, 0, ZoneId.of("America/New_York"));
        
        // Use reflection to test private method
        Method displayTimeDiscovery = CosmicTimePortal.class.getDeclaredMethod("displayTimeDiscovery", ZonedDateTime.class);
        displayTimeDiscovery.setAccessible(true);
        displayTimeDiscovery.invoke(null, testTime);
        
        String output = outputStream.toString();
        
        // Verify time transmission messages
        assertTrue(output.contains("TEMPORAL COORDINATES LOCKED"), "Should contain coordinates message");
        assertTrue(output.contains("Receiving transmission from EST dimension"), "Should contain transmission message");
        
        // Verify time display box
        assertTrue(output.contains("COSMIC TIME READING"), "Should contain time reading header");
        assertTrue(output.contains("Date:"), "Should display date label");
        assertTrue(output.contains("Time:"), "Should display time label");
        assertTrue(output.contains("Zone:"), "Should display zone label");
        
        // Verify emojis
        assertTrue(output.contains("🎯"), "Should contain target emoji");
        assertTrue(output.contains("📡"), "Should contain satellite emoji");
        assertTrue(output.contains("🕰️"), "Should contain clock emoji");
        assertTrue(output.contains("📅"), "Should contain calendar emoji");
        assertTrue(output.contains("⏰"), "Should contain alarm clock emoji");
        assertTrue(output.contains("🌍"), "Should contain earth emoji");
        
        // Verify time formatting (should contain afternoon context for 3:30 PM)
        assertTrue(output.contains("Afternoon solar power"), "Should contain afternoon context for test time");
        
        tearDown();
    }
    
    @Test
    @DisplayName("Should share cosmic wisdom from facts array")
    void testShareCosmicWisdom() throws Exception {
        // Use reflection to test private method
        Method shareCosmicWisdom = CosmicTimePortal.class.getDeclaredMethod("shareCosmicWisdom");
        shareCosmicWisdom.setAccessible(true);
        shareCosmicWisdom.invoke(null);
        
        String output = outputStream.toString();
        
        // Verify wisdom transmission structure
        assertTrue(output.contains("COSMIC WISDOM TRANSMISSION"), "Should contain wisdom header");
        assertTrue(output.contains("The Time Lords share their knowledge"), "Should contain Time Lords message");
        assertTrue(output.contains("Remember: Every moment is a gift"), "Should contain gift message");
        assertTrue(output.contains("experiencing this exact moment only once"), "Should contain uniqueness message");
        
        // Verify emojis
        assertTrue(output.contains("🔬"), "Should contain microscope emoji");
        assertTrue(output.contains("📡"), "Should contain satellite emoji");
        assertTrue(output.contains("💭"), "Should contain thought bubble emoji");
        assertTrue(output.contains("🎪"), "Should contain circus tent emoji");
        
        // Should contain at least one fact (check for common fact elements)
        boolean containsFact = output.contains("🌟") || output.contains("⭐") || output.contains("🚀") || 
                              output.contains("🌌") || output.contains("💫") || output.contains("🔭") || 
                              output.contains("🌍");
        assertTrue(containsFact, "Should contain at least one cosmic fact with emoji");
        
        tearDown();
    }
    
    @Test
    @DisplayName("Should open portal with loading animation")
    void testOpenPortal() throws Exception {
        // Use reflection to test private method
        Method openPortal = CosmicTimePortal.class.getDeclaredMethod("openPortal");
        openPortal.setAccessible(true);
        
        // Note: This test will actually run the sleep animation, but should complete quickly
        long startTime = System.currentTimeMillis();
        openPortal.invoke(null);
        long endTime = System.currentTimeMillis();
        
        String output = outputStream.toString();
        
        // Verify portal opening messages
        assertTrue(output.contains("Opening interdimensional portal"), "Should contain portal opening message");
        assertTrue(output.contains("Portal successfully opened"), "Should contain success message");
        assertTrue(output.contains("Eastern Standard Time dimension"), "Should mention EST dimension");
        
        // Verify emojis
        assertTrue(output.contains("🔮"), "Should contain crystal ball emoji");
        assertTrue(output.contains("✨"), "Should contain sparkles emoji");
        
        // Verify loading animation completed (should take at least 2 seconds for 8 stages * 300ms)
        assertTrue(endTime - startTime >= 2000, "Should have taken time for loading animation");
        
        // Verify portal art is included
        assertTrue(output.contains("COSMIC TIME PORTAL"), "Should contain portal art");
        
        tearDown();
    }
    
    @Test
    @DisplayName("Should have cosmic facts array with proper content")
    void testCosmicFactsArray() throws Exception {
        // Use reflection to access the private static field
        java.lang.reflect.Field cosmicFactsField = CosmicTimePortal.class.getDeclaredField("COSMIC_FACTS");
        cosmicFactsField.setAccessible(true);
        String[] cosmicFacts = (String[]) cosmicFactsField.get(null);
        
        // Verify facts exist
        assertNotNull(cosmicFacts, "Cosmic facts array should not be null");
        assertTrue(cosmicFacts.length > 0, "Should have at least one cosmic fact");
        
        // Verify all facts contain emojis (cosmic theme)
        for (String fact : cosmicFacts) {
            assertNotNull(fact, "Each fact should not be null");
            assertFalse(fact.trim().isEmpty(), "Each fact should not be empty");
            
            // Each fact should start with an emoji
            assertTrue(fact.matches("^[\\p{So}\\p{Cn}].*"), 
                "Each fact should start with an emoji: " + fact);
        }
        
        // Verify expected number of facts (should have 7 based on the code)
        assertEquals(7, cosmicFacts.length, "Should have exactly 7 cosmic facts");
        
        // Verify some expected fact topics are present
        String allFacts = String.join(" ", cosmicFacts);
        assertTrue(allFacts.contains("second on Earth"), "Should contain fact about seconds");
        assertTrue(allFacts.contains("gravitational fields"), "Should contain fact about gravity");
        assertTrue(allFacts.contains("Space Station"), "Should contain fact about ISS");
        assertTrue(allFacts.contains("Einstein"), "Should contain fact about Einstein");
        assertTrue(allFacts.contains("EST"), "Should contain fact about EST");
    }
    
    @Test
    @DisplayName("Should run main method without errors")
    void testMainMethod() {
        // Test that main method runs without throwing exceptions
        assertDoesNotThrow(() -> {
            String[] args = {};
            CosmicTimePortal.main(args);
        }, "Main method should run without throwing exceptions");
        
        String output = outputStream.toString();
        
        // Verify main method output contains expected elements
        assertTrue(output.contains("Initializing Cosmic Time Portal"), "Should contain initialization message");
        assertTrue(output.contains("AMP-powered temporal displacement"), "Should contain AMP message");
        assertTrue(output.contains("Portal closing"), "Should contain closing message");
        assertTrue(output.contains("Safe travels"), "Should contain farewell message");
        
        tearDown();
    }
}