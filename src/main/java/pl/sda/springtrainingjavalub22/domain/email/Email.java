package pl.sda.springtrainingjavalub22.domain.email;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
public class Email {
    private String sendTo;
    private String title;
    private String content;

    private Set<String> attachments;
}
