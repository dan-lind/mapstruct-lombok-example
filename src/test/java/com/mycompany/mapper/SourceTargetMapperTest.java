/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package com.mycompany.mapper;

import static org.junit.Assert.assertEquals;

import com.mycompany.dto.AnotherSource;
import org.junit.Test;

import com.mycompany.dto.Source;
import com.mycompany.entities.Target;

public class SourceTargetMapperTest {

    @Test
    public void testMapping() {
        Source s = new Source();
        AnotherSource anotherSource = new AnotherSource();
        anotherSource.setTest("5");
        s.setTestToo(anotherSource);

        Target t = SourceTargetMapper.MAPPER.toTarget( s );
        assertEquals( 5, (long) t.getNestedTarget().getTestingToo());
    }
}
