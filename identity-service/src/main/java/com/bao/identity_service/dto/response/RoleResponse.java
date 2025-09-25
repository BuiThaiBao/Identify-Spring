package com.bao.identity_service.dto.response;

import com.bao.identity_service.entity.Permission;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE
)
public class RoleResponse {
    @NotBlank
    String name;
    String description;
    Set<PermissionResponse> permissions;
}
