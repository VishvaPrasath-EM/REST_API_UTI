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


}
