package com.example.demor2dbc.dto.http.response;

import com.example.demor2dbc.statics.GroupName;

public class HrGroupDto extends HrEntityDto {
	private GroupName name;
		

	public GroupName getName() {
		return name;
	}

	public void setName(GroupName name) {
		this.name = name;
	}

	
}
