package apimodels.controlObjects;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Response{

	@JsonProperty("number")
	private int number;

	@JsonProperty("last")
	private boolean last;

	@JsonProperty("size")
	private int size;

	@JsonProperty("numberOfElements")
	private int numberOfElements;

	@JsonProperty("totalPages")
	private int totalPages;

	@JsonProperty("pageable")
	private Pageable pageable;

	@JsonProperty("sort")
	private Sort sort;

	@JsonProperty("first")
	private boolean first;

	@JsonProperty("content")
	private List<ContentItem> content;

	@JsonProperty("totalElements")
	private int totalElements;

	@JsonProperty("empty")
	private boolean empty;

	public int getNumber(){
		return number;
	}

	public boolean isLast(){
		return last;
	}

	public int getSize(){
		return size;
	}

	public int getNumberOfElements(){
		return numberOfElements;
	}

	public int getTotalPages(){
		return totalPages;
	}

	public Pageable getPageable(){
		return pageable;
	}

	public Sort getSort(){
		return sort;
	}

	public boolean isFirst(){
		return first;
	}

	public List<ContentItem> getContent(){
		return content;
	}

	public int getTotalElements(){
		return totalElements;
	}

	public boolean isEmpty(){
		return empty;
	}
}