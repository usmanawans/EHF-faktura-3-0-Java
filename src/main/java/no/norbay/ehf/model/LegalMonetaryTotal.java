package no.norbay.ehf.model;

import no.norbay.ehf.model.order.LineExtensionAmount;
import no.norbay.ehf.model.tax.TaxExclusiveAmount;
import no.norbay.ehf.model.tax.TaxInclusiveAmount;

public class LegalMonetaryTotal {
	public LineExtensionAmount lineExtensionAmount;
	public TaxExclusiveAmount taxExclusiveAmount;
	public TaxInclusiveAmount taxInclusiveAmount;
	public ChargeTotalAmount chargeTotalAmount;
	public PayableAmount payableAmount;
}