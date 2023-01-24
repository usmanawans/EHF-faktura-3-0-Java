package no.norbay.ehf.model.order;

import no.norbay.ehf.model.InvoicedQuantity;

public class InvoiceLine {
	public int id;
	public InvoicedQuantity invoicedQuantity;
	public LineExtensionAmount lineExtensionAmount;
	public String accountingCost;
	public OrderLineReference orderLineReference;
	public Item item;
	public Price price;
}