package com.bao.identity_service.mapper;

import org.mapstruct.Mapper;

import com.bao.identity_service.dto.request.PermissionRequest;
import com.bao.identity_service.dto.response.PermissionResponse;
import com.bao.identity_service.entity.Permission;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    //    @Mapping(source = "lastName",target = "firstName")
    PermissionResponse toPermissionResponse(Permission permission);
    //    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
