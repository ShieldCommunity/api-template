# NullCordX API example implementation

## How to integrate
You must have purchased NullCordX to have access to this broad and extensive API.
Before nothing, remember that you need to change the path of the .jar file on the pom.xml file 
On top of that, you must know that the plugin will work only with NullCordX if you impl this events

## Official Downloads

* [Polymart page](https://polymart.org/resource/nullcordx.1476)
* [MC-Market page](https://builtbybit.com/resources/nullcordx-lightweight-antibot.22322/)
  
## Some events and useful methods
* HAProxyConnectionInitEvent - Called when the HAProxy message for a connection has been decoded, this event is called even earlier than ClientConnectEvent
* AttackDetectedEvent - Event to detect when an attack of any kind has started.
* BotAttackDetectedEvent/BotAttackEndedEvent - Extension of AttackDetectedEvent for BOT attack
* PingAttackDetectedEvent/PingAttackEndedEvent - Extension of AttackDetectedEvent for PING attack
* SpamAttackDetectedEvent/SpamAttackDEndedEvent - Extension of AttackDetectedEvent for SPAM attack
* NullCordXReloadEvent - Will be called after a successful reload of NullCordX
* UserCheckedSuccessfullyEvent - Called only when the player has successfully passed the filter check and is ready to move to the server or be kicked. (depending on configuration)
* UserFailedCheckEvent -  An event that is triggered whenever a player fails a check, please note that this event can also be triggered if KickType is SUCCESSFULLY

In addition to the events, you have access to NullCordXImpl, then the ChannelWrapper, the kick type, the statistics, the language manager, the user manager, databases, messages and all the anti-bot on top of the database.
They can be useful e.g. to avoid using reflection to access ChannelWrapper methods without relying on reflection
