package com.bao.identity_service.mapper;

import com.bao.identity_service.dto.request.PermissionRequest;
import com.bao.identity_service.dto.request.UserCreationRequest;
import com.bao.identity_service.dto.request.UserUpdateRequest;
import com.bao.identity_service.dto.response.PermissionResponse;
import com.bao.identity_service.dto.response.UserResponse;
import com.bao.identity_service.entity.Permission;
import com.bao.identity_service.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

//    @Mapping(source = "lastName",target = "firstName")
    PermissionResponse toPermissionResponse(Permission permission);
//    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
