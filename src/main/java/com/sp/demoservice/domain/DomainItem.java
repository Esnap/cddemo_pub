package com.sp.demoservice.domain;

import lombok.*;

@Getter
@AllArgsConstructor
@Builder
public class DomainItem {

    @NonNull
    private String id;

    @NonNull
    private String information;

}
