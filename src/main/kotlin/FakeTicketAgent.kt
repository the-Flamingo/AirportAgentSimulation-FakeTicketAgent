import dhbw.sose2022.softwareengineering.airportagentsim.simulation.api.geometry.Point
import dhbw.sose2022.softwareengineering.airportagentsim.simulation.api.simulation.entity.Agent
import dhbw.sose2022.softwareengineering.airportagentsim.simulation.api.simulation.entity.Entity

// Creates a ticket and uses it to pass the ticket counter
class FakeTicketAgent : Agent() {

    private var ticket = false
    // Agent recieves a boolean attribute to check, if a the Agent has a ticket
    // If a different name is chosen, this will be adapted

    init {
        speed = .0
    }

    override fun pluginUpdate() {

        // If this agent has no ticket, it creates one for itself
        if(!ticket) {

            ticket = true
            // If tickets receive their own class, the creation of the ticket will be adapted appropriately

        }

    }

    companion object {
        const val TYPE_ID = "FakeTicketAgent"
    }
}