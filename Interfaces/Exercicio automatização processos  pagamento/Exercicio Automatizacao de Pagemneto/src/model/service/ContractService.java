package model.service;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	// Inversão de controle
	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService; // Injeção de dependência
	}
	//////// //////// /////// //////// //////// ///////////

	public void processContract(Contract contract, Integer months) {
		double basicQuota = contract.getTotalValue() / months;
		// basicQuota = resultado dos dados do contrato / pelos meses.
		for (int i = 1; i <= months; i++) {

			double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
			// updatedQuota = valor do resultado acima
			double fullQuota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);
			// fullQuota = valor total.
			Date dueDate = addMonths(contract.getDate(), i);
			contract.getInstallments().add(new Installment(dueDate, fullQuota));
		}

	}
	
	// funcao para instancia a data de pagamento
	private Date addMonths(Date date, int N) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, N);
		return calendar.getTime();
	}
	
	
	
}
