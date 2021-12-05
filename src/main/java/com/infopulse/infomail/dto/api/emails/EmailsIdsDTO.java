package com.infopulse.infomail.dto.api.emails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailsIdsDTO {

	@NotEmpty
	private List<Long> ids;

}
