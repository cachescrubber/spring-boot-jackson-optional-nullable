package org.cachescrubber.openapitools.demo.springbootjacksonoptionalnullable.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Instant;
import java.util.Optional;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Simple Model to demo usage of JsonNullable and Optional
 *
 * @author cachescrubber, 2022-02-20
 * @since 0.1.0
 */

// for Intellij idea.
@SuppressWarnings("OptionalUsedAsFieldOrParameterType")
public class DemoModel1 {

  @JsonProperty("name")
  private String name;

  @JsonProperty("email")
  private JsonNullable<@Email String> email = JsonNullable.undefined();

  @JsonProperty("workEmail")
  private JsonNullable<@Email String> workEmail = JsonNullable.undefined();

  @JsonProperty("numberOfUsers")
  private Optional<@Min(2) Integer> numberOfUsers = Optional.empty();

  @JsonProperty("lastLogin")
  private Optional<Instant> lastLogin = Optional.empty();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DemoModel1 name(String name) {
    this.name = name;
    return this;
  }

  public JsonNullable<String> getEmail() {
    return email;
  }

  public void setEmail(JsonNullable<String> email) {
    this.email = email;
  }

  public JsonNullable<String> getWorkEmail() {
    return workEmail;
  }

  public void setWorkEmail(JsonNullable<String> workEmail) {
    this.workEmail = workEmail;
  }

  public Optional<Integer> getNumberOfUsers() {
    return numberOfUsers;
  }

  public void setNumberOfUsers(Optional<Integer> numberOfUsers) {
    this.numberOfUsers = numberOfUsers;
  }

  public void setNumberOfUsers(Integer numberOfUsers) {
    this.numberOfUsers = Optional.ofNullable(numberOfUsers);
  }

  public DemoModel1 numberOfUsers(Optional<Integer> numberOfUsers) {
    this.numberOfUsers = numberOfUsers;
    return this;
  }

  public DemoModel1 numberOfUsers(Integer numberOfUsers) {
    this.numberOfUsers = Optional.ofNullable(numberOfUsers);
    return this;
  }

  public Optional<Instant> getLastLogin() {
    return lastLogin;
  }

  public void setLastLogin(Optional<Instant> lastLogin) {
    this.lastLogin = lastLogin;
  }

}
