package no.norbay.ehf.model;

import no.norbay.ehf.model.customer.AccountingCustomerParty;
import no.norbay.ehf.model.delivery.Delivery;
import no.norbay.ehf.model.order.InvoiceLine;
import no.norbay.ehf.model.payment.PaymentMeans;
import no.norbay.ehf.model.payment.PaymentTerms;
import no.norbay.ehf.model.supplier.AccountingSupplierParty;
import no.norbay.ehf.model.tax.TaxTotal;

import java.util.Date;
import java.util.List;


public class Invoice {
	public String customizationID;
	public String profileID;
	public String id;
	public Date issueDate;
	public Date dueDate;
	public int invoiceTypeCode;
	public String documentCurrencyCode;
	public String accountingCost;
	public String buyerReference;
	public AccountingSupplierParty accountingSupplierParty;
	public AccountingCustomerParty accountingCustomerParty;
	public Delivery delivery;
	public PaymentMeans paymentMeans;
	public PaymentTerms paymentTerms;
	public AllowanceCharge allowanceCharge;
	public TaxTotal taxTotal;
	public LegalMonetaryTotal legalMonetaryTotal;
	public List<InvoiceLine> invoiceLine;
	public String cac;
	public String cbc;
	public String xmlns;
	public String text;
}