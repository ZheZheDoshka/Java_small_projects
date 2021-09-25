package ua.testing.registration_form.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Note {

    private Long id;
    private String name;
    private String surname;
    private String login;
}
