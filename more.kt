/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

data class Event(
          val title: String,
          val description: String? = null,
          val daypart: Daypart,
          val durationInMinutes: Int
)

enum class Daypart{
    MORNING,
    AFTERNOON,
    EVENING
}
    


fun main() {
    
val event1 = Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0)
val event2 = Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15)
val event3 = Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30)
val event4 = Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60)
val event5 = Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10)
val event6 = Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)
  
val eventList = mutableListOf(event1, event2, event3, event4, event5, event6)
 
 var shortEvent = 0
    eventList.forEach{
       if(it.durationInMinutes<60){
           shortEvent++
       }
    }
    println("You have $shortEvent short events.")
    
    val eventGroup = eventList.groupBy {it.daypart}
    val morningEventsCount = eventGroup[Daypart.MORNING]?.size ?: 0
    val afternoonEventsCount = eventGroup[Daypart.AFTERNOON]?.size ?: 0
    val eveningEventsCount = eventGroup[Daypart.EVENING]?.size ?: 0
    println("Morning: $morningEventsCount events")
    println("Afternoon: $afternoonEventsCount events")
    println("Evening: $eveningEventsCount events")
    
   
    println(eventList.last().title)
    
    
}
