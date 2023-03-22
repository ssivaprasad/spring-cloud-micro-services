
By Default, Spring cloud Config Server uses Git as Config Store. The default implementation of EnvironmentRepository uses a Git backend.
GIT is very convenient for managing upgrades and physical environments and for auditing changes.
If we want local filesystem as config store we need to set active profile as **native**    

`-Dspring.profiles.active=native`