package net.h0lg.autodns.xml.builder;

import com.neovisionaries.i18n.CountryCode;
import net.h0lg.autodns.xml.request.model.Owner;
import net.h0lg.autodns.xml.request.model.contact.Handle;
import net.h0lg.autodns.xml.request.model.contact.HandleForceCreate;
import net.h0lg.autodns.xml.request.model.contact.HandleProtection;
import net.h0lg.autodns.xml.request.model.contact.HandleType;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HandleBuilderTest {

	private final String id = "abc123";
	private final String alias = "testAlias";
	private final String title = "Prof. Dr. Dr.";
	private final String firstName = "Foo";
	private final String lastName = "Bar";
	private final String organisation = "private";
	private final String postcode = "AB12 3CD";
	private final String city = "Example City";
	private final String replyTo = "me@you.local";
	private final String state = "Sample State";
	private final String phone = "+44 1234 567890";
	private final String fax = "+44 9876 543210";
	private final String email = "foo@bar.local";
	private final List<CountryCode> nicReference = Collections.singletonList(CountryCode.DE);
	private final String remarks = "Test Remark";
	private final String comment = "Test comment";
	private final Owner owner = new Owner();

	@Test
	public void should_returnHandle_given_minimalData() {
		Handle actualHandle = createBasicHandleBuilder().build();

		Handle expectedHandle = Handle.builder()
				.type(HandleType.PERSON)
				.firstName(firstName)
				.lastName(lastName)
				.organisation(organisation)
				.addresses(oneLineStreet())
				.postcode(postcode)
				.city(city)
				.country(CountryCode.UK)
				.protection(HandleProtection.LIMITED)
				.replyTo(replyTo)
				.build();

		assertThat(actualHandle, is(expectedHandle));
	}

	@Test
	public void should_returnHandle_givenAllDetails() {
		Handle.HandleBuilder builder = createBasicHandleBuilder();

		builder
				.id(id)
				.alias(alias)
				.type(HandleType.ORG)
				.title(title)
				.state(state)
				.country(CountryCode.DE)
				.phone(phone)
				.fax(fax)
				.email(email)
				.protection(HandleProtection.ALL)
				.nicReferences(nicReference)
				.remarks(remarks)
				.forceHandleCreate(HandleForceCreate.FORCE)
				.comment(comment)
				.owner(owner);


		Handle expectedHandle = Handle.builder()
				.id(id)
				.alias(alias)
				.type(HandleType.ORG)
				.firstName(firstName)
				.lastName(lastName)
				.title(title)
				.organisation(organisation)
				.addresses(oneLineStreet())
				.postcode(postcode)
				.city(city)
				.state(state)
				.country(CountryCode.DE)
				.phone(phone)
				.fax(fax)
				.email(email)
				.protection(HandleProtection.ALL)
				.nicReferences(nicReference)
				.remarks(remarks)
				.replyTo(replyTo)
				.forceHandleCreate(HandleForceCreate.FORCE)
				.comment(comment)
				.owner(owner)
				.build();

		assertThat(builder.build(), is(expectedHandle));

	}

	private Handle.HandleBuilder createBasicHandleBuilder() {
		return Handle.builder()
				.type(HandleType.PERSON)
				.firstName(firstName)
				.lastName(lastName)
				.organisation(organisation)
				.addresses(oneLineStreet())
				.postcode(postcode)
				.city(city)
				.country(CountryCode.UK)
				.protection(HandleProtection.LIMITED)
				.replyTo(replyTo);
	}

	private List<String> oneLineStreet() {
		return Collections.singletonList("123 Example Street");
	}


}
