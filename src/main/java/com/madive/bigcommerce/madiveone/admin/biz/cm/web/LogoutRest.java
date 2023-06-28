package com.madive.bigcommerce.madiveone.admin.biz.cm.web;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name ="login-endpoint")
public class LogoutRest {
    @PostMapping("/lo/02")
    public void logout() {
    }
}
