package com.bao.identity_service.controller;

import com.bao.identity_service.dto.request.RoleRequest;
import com.bao.identity_service.dto.response.ApiResponse;
import com.bao.identity_service.dto.response.RoleResponse;
import com.bao.identity_service.dto.response.RoleResponse;
import com.bao.identity_service.service.RoleService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/roles")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
public class RoleController {
    RoleService roleService;

    @PostMapping()
    ApiResponse<RoleResponse> create(@RequestBody RoleRequest request){
        RoleResponse role = roleService.create(request);
        return ApiResponse.<RoleResponse>builder()
                .result(role)
                .build();
    }
    @GetMapping
    ApiResponse<List<RoleResponse>> getAll(){
        return ApiResponse.<List<RoleResponse>>builder()
                .result(roleService.getAll())
                .build();
    }

    @DeleteMapping("/{role}")
    ApiResponse<String> delete(@PathVariable String role){
        roleService.delete(role);
        return ApiResponse.<String>builder()
                .result("Role has been deleted")
                .build();
    }
}
