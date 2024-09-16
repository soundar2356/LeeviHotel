package com.soundardev.LeeviHotel.service.interfac;


import com.soundardev.LeeviHotel.dto.LoginRequest;
import com.soundardev.LeeviHotel.dto.Response;
import com.soundardev.LeeviHotel.entity.User;

public interface IUserService {
   Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
