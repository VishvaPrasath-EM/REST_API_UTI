package com.example.uti.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table (name ="UTI_PROJECT_DETAILS")
public class utiEntity {

      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;
      private String Team_members;
      private String Role;

      public Long getId() {
            return id;
      }

      public void setId(Long id) {
            this.id = id;
      }

      public String getRole() {
            return Role;
      }

      public void setRole(String role) {
            Role = role;
      }

      public String getTeam_members() {
            return Team_members;
      }

      public void setTeam_members(String team_members) {
            Team_members = team_members;
      }
}
