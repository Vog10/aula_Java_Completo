package model.service;

public class PaypalService implements OnlinePaymentService {

	
	//Criando Const, HARDCODE POIS É APENAS EXERCICIO FIXO
	private static final double PAYMENT_FEE = 0.02;
	private static final double MONTHLY_INTEREST = 0.01;
	
	
	@Override
	public Double paymentFee(Double amount) {
		
		return  amount * PAYMENT_FEE;
	}

	@Override
	public Double interest(Double amount, Integer months) {
		return amount * months * MONTHLY_INTEREST ;
	}


	
}
