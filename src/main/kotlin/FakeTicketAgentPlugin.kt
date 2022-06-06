import dhbw.sose2022.softwareengineering.airportagentsim.simulation.api.AirportAgentSimulation
import dhbw.sose2022.softwareengineering.airportagentsim.simulation.api.config.ConfigurableAttribute
import dhbw.sose2022.softwareengineering.airportagentsim.simulation.api.config.ConfigurationFormatException
import dhbw.sose2022.softwareengineering.airportagentsim.simulation.api.plugin.Plugin

class FakeTicketAgentPlugin : Plugin {

    override fun activate() {
         try {
            AirportAgentSimulation.registerEntity(this, FakeTicketAgent.TYPE_ID, FakeTicketAgent::class.java)
        } catch (exception: ConfigurationFormatException) {
            exception.printStackTrace()
        }
    }

}