package com.ms.email.models;

import com.ms.email.enums.StatusEmail;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="TB_EMAILS")
public class EmailModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "email_id")
    UUID emailId;
    @Column(name = "user_id")
    UUID userId;
    @Column(name = "email_from")
    private String emailFrom;
    @Column(name = "email_to")
    private String emailTo;
    private String subject;
    private String text;
    @Column(name = "send_date_email")
    private LocalDateTime sendDateEmail;
    @Column(name = "status_email")
    private StatusEmail statusEmail;
}
