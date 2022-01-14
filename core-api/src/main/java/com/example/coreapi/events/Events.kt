package com.example.coreapi.events

import org.axonframework.modelling.command.TargetAggregateIdentifier


abstract class BaseEvent<T>(
       @TargetAggregateIdentifier open val id : T
)

data class CustomerCreatedEvent(
       override val id:String,
        val name:String,
        val email:String
):BaseEvent<String>(id)

data class CustomerUpdatedEvent(
        override val id:String,
        val name:String,
        val email:String
):BaseEvent<String>(id)