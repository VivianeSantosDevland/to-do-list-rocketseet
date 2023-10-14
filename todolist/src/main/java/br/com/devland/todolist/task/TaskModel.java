package br.com.devland.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_tasks")
public class TaskModel {
  /*
   * ID
   * usuário (ID_usuario)
   * Descrição
   * 
   * 
   */

  @Id
  @GeneratedValue(generator = "UUID")
  private UUID id;
  private String description;
  @Column(length = 60)
  private String title;
  private LocalDateTime startAt;
  private LocalDateTime endAt;
  private String priority;

  @CreationTimestamp
  private LocalDateTime createdAt;

  private UUID idUser;

}
