package Cart.Item.tuto.model.dto;

import lombok.Data;

import javax.persistence.*;

import java.util.Objects;

import Cart.Item.tuto.model.Item;

@Data
public class ItemDto {
    private Long id;
    private String serialNumber;
    public Long getId() {
		return id;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public PlainCartDto getPlainCartDto() {
		return plainCartDto;
	}
	private PlainCartDto plainCartDto;
    
	public void setId(Long id) {
		this.id = id;
	}
    public void setSerialNumber(String serialNumber) {
    	this.serialNumber = serialNumber;
    }
    public void setPlainCartDto(PlainCartDto plainCartDto) {
    	this.plainCartDto = plainCartDto;
    }
    public static ItemDto from(Item item){
        ItemDto itemDto = new ItemDto();
        itemDto.setId(item.getId());
        itemDto.setSerialNumber(item.getSerialNumber());
        if(Objects.nonNull(item.getCart())){
            itemDto.setPlainCartDto(PlainCartDto.from(item.getCart()));
        }
        return itemDto;
    }
}
