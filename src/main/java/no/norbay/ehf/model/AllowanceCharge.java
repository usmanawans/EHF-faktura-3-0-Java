package no.norbay.ehf.model;

import no.norbay.ehf.model.tax.TaxCategory;

public class AllowanceCharge {
	public boolean ChargeIndicator;
	public String AllowanceChargeReason;
	public Amount amount;
	public TaxCategory taxCategory;
}