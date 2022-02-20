package jpabook.jpashop.controller;

import jpabook.jpashop.domain.Member;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Setter
@Getter
@RequiredArgsConstructor
public class MemberForm {
    private Long id;

    @NotEmpty(message = "회원이름은 필수입니다.")
    private String name;

    private String city;
    private String street;
    private String zipcode;

    public MemberForm(Member memberEntity) {
        this.id = memberEntity.getId();
        this.name = memberEntity.getName();
        this.city = memberEntity.getAddress().getCity();
        this.street = memberEntity.getAddress().getStreet();
        this.zipcode = memberEntity.getAddress().getZipcode();
    }
}
