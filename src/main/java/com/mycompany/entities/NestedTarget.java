/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package com.mycompany.entities;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class NestedTarget {

    Long testing;
    Long testingToo;
}
