/*
 * JBoss, Home of Professional Open Source
 * Copyright 2014 Red Hat Inc. and/or its affiliates and other contributors
 * as indicated by the @authors tag. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.aesh.complete;

import org.jboss.aesh.console.AeshContext;
import org.aesh.readline.completion.CompleteOperationImpl;

/**
 * @author <a href="mailto:stale.pedersen@jboss.org">Ståle W. Pedersen</a>
 */
public class AeshCompleteOperation extends CompleteOperationImpl {

    private AeshContext context;

    public AeshCompleteOperation(AeshContext context, String buffer, int cursor) {
        super(buffer, cursor);

        this.context = context;
    }

    public AeshCompleteOperation(String buffer, int cursor) {
        super(buffer, cursor);
    }

    public AeshContext getContext() {
        return context;
    }

}
