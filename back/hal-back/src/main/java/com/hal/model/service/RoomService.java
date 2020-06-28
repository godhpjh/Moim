package com.hal.model.service;

import java.util.Date;
import java.util.List;

import com.hal.model.dto.ChatRequestDto;
import com.hal.model.dto.RoomResponseDto;

public interface RoomService {

	public List<RoomResponseDto> findRoomListById(int uid);

	public String addRoom(int senderId, int receiverId);
	//마지막 채팅 보낸 시간 업데이트
	public void updateLastTime(ChatRequestDto chat);
}
