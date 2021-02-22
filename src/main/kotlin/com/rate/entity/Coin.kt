package com.rate.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Coin(

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  val id: Long? = null,

  @field:JsonIgnore
  val type: String,

  @field:JsonIgnore
  val name: String,

  @field:JsonIgnore
  val value: Double,

  @field:JsonIgnore
  val lastUpdateDate: LocalDate

)