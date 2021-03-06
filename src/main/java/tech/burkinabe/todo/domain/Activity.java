package tech.burkinabe.todo.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "created_at")
    private ZonedDateTime createdAt;

    @Column(name = "modify_at")
    private ZonedDateTime modifyAt;

    @Column(name = "begun_at")
    private ZonedDateTime begunAt;

    @Column(name = "end_at")
    private ZonedDateTime endAt;
}
