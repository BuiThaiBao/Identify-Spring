package com.bao.identity_service.controller;

import com.bao.identity_service.dto.request.PermissionRequest;
import com.bao.identity_service.dto.response.ApiResponse;
import com.bao.identity_service.dto.response.PermissionResponse;
import com.bao.identity_service.service.PermissionService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/permissions")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
public class PermissionController {
    PermissionService permissionService;

    @PostMapping()
    ApiResponse<PermissionResponse> create(@RequestBody PermissionRequest request){
        PermissionResponse permission = permissionService.create(request);
        return ApiResponse.<PermissionResponse>builder()
                .result(permission)
                .build();
    }
    @GetMapping
    ApiResponse<List<PermissionResponse>> getAll(){
        return ApiResponse.<List<PermissionResponse>>builder()
                .result(permissionService.getAll())
                .build();
    }

    @DeleteMapping("/{permission}")
    ApiResponse<String> delete(@PathVariable String permission){
        permissionService.delete(permission);
        return ApiResponse.<String>builder()
                .result("Permission has been deleted")
                .build();
    }
}
