package com.practice.Entities;

public class Card_details {
	

	private CardNumber cardnumber;
	
//	@NotBlank(message="Enter the Amount ")
	private Amount amount;

	public CardNumber getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(CardNumber cardnumber) {
		this.cardnumber = cardnumber;
	}

	public Amount getAmount() {
		return amount;
	}

	public void setAmount(Amount amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Card_details [cardnumber=" + cardnumber + ", amount=" + amount + "]";
	}
}
