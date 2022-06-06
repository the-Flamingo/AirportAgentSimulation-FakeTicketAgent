import dhbw.sose2022.softwareengineering.airportagentsim.simulation.api.geometry.Point
import dhbw.sose2022.softwareengineering.airportagentsim.simulation.api.simulation.entity.Agent
import dhbw.sose2022.softwareengineering.airportagentsim.simulation.api.simulation.entity.Entity
import kotlin.random.Random

// Creates a ticket and uses it to pass the ticket counter
class FakeTicketAgent : Agent() {

    private var ticket = false
    // Agent recieves a boolean attribute to check, if a the Agent has a ticket
    // If a different name is chosen, this will be adapted

    private var lastPosition = Point(-1, -1)

    init {
        speed = .0
    }

    override fun pluginUpdate() {

        // If this agent has no ticket, it creates one for itself
        if(!ticket) {

            ticket = true
            // If tickets receive their own class, the creation of the ticket will be adapted appropriately
        }

        /*
        TicketSchalter nicht implementiert von Objektgruppe

        val schalter = world.entities.filterIsInstance<TicketSchalter>().firstOrNull() ?: return
        turn(schalter.position)
        */

        // This part gives the agent a simple walking routine, by turning randomly when hitting a wall
        if(lastPosition == position) {
            do {
                try {
                    turn(
                        Point(
                            Random.nextInt(0, world.width),
                            Random.nextInt(0, world.height)
                        )
                    )
                    break
                } catch (_: Exception) {}
            } while(true)
        }
        lastPosition = position
    }

    companion object {
        const val TYPE_ID = "FakeTicketAgent"
    }
}