contenedor(" openjdk:11 ") {
    kotlinScript { api ->
        api.space().projects.automation.deployments.start(
            proyecto = api.projectIdentifier(),
 
            targetIdentifier = TargetIdentifier.Key( "apibsaletest" ),
 
            versión = "1.0.0" ,
  
            // actualizar automáticamente el estado de implementación en función del estado de un trabajo
            syncWithAutomationJob = verdadero  
        )
    }
}
