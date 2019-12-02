/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllTests;

import org.junit.runner.*;
import org.junit.runners.*;

import org.wahlzeit.handlers.TellFriendTest.class;
import org.walzeit.model.AccessRightsTest.class;
import org.walzeit.model.FlagReasonTest.class;
import org.walzeit.model.GenderTest.class;
import org.walzeit.model.GuestTest.class;
import org.walzeit.model.PhotoFilterTest.class;
import org.walzeit.model.TagsTest.class;
import org.walzeit.model.UserStatusTest.class;
import org.walzeit.model.ValueTest.class;
import org.walzeit.model.persistence.AbstractAdapterTest.class;
import org.walzeit.model.persistence.DatastoreAdapterTest.class;
import org.walzeit.services.EmailAddressTest.class;
import org.walzeit.services.LogBuilderTest.class;
import org.walzeit.services.mailing.EmailServiceTestSuite.class;
import org.walzeit.utils.StringUtilTest.class;
import org.walzeit.utils.VersionTest.class;

/**
 *
 * @author spyros
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({TellFriendTest.class, AccessRightsTest.class, FlagReasonTest.class, GenderTest.class, GuestTest.class, PhotoFilterTest.class, TagsTest.class, UserStatusTest.class, ValueTest.class, AbstractAdapterTest.class, DatastoreAdapterTest.class, EmailAddressTest.class, LogBuilderTest.class, EmailServiceTestSuite.class, StringUtilTest.class, VersionTest.class})
public class java {
    
}
