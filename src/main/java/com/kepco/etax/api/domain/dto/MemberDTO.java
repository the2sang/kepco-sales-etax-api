package com.kepco.etax.api.domain.dto;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
public class MemberDTO {

    private String name;
    private String email;
    private String organization;

    @Override
    public String toString() {
        return "MemberDTO{" +
            "name='" + name + '\'' +
            ", email='" + email + '\'' +
            ", organization='" + organization + '\'' +
            '}';
    }
}
