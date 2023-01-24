package no.norbay.ehf.model.party;

import no.norbay.ehf.model.Contact;
import no.norbay.ehf.model.address.PostalAddress;

public class Party {
	public EndpointID EndpointID;
	public PartyIdentification PartyIdentification;
	public PartyName PartyName;
	public PostalAddress postalAddress;
	public PartyTaxScheme PartyTaxScheme;
	public PartyLegalEntity PartyLegalEntity;
	public Contact contact;
}