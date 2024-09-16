package com.soundardev.LeeviHotel.service.interfac;

import com.soundardev.LeeviHotel.dto.Response;
import com.soundardev.LeeviHotel.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
