# Uber-Simulator

# Car and Driver

This project has a number of classes to support an Uber simulator with clients making ride requests and drivers mvoing around
a city grid completing these requests.

* ShortestWaitDispatcher
  * This dispatcher will  choose the driver that is closest to the client's position (i.e. will incur
    the shortest wait time.
  
* ShortButFairDispatcher
  * This dispatcher will choose the driver that is closest to the client's position but without
    considering the last five drivers chosen (assuming there will be more than five
    available drivers). In other words, if your dispatcher first chooses DriverA, then the next four
    times that the dispatcher is asked to choose a driver, DriverA should not be eligible for being
    chosen. 
  
