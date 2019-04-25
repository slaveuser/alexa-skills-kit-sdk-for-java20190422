/*
    Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.

    Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
    except in compliance with the License. A copy of the License is located at

        http://aws.amazon.com/apache2.0/

    or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
    the specific language governing permissions and limitations under the License.
 */

package com.amazon.ask.response;

import com.amazon.ask.model.interfaces.display.TextContent;

/**
 * A helper to assist in building {@link com.amazon.ask.model.interfaces.display.PlainText} and
 * {@link com.amazon.ask.model.interfaces.display.RichText} content.
 **/
public abstract class TextContentHelper {

    protected String primaryText;
    protected String secondaryText;
    protected String tertiaryText;

    public static PlainTextContentContentHelper forPlainText() {
        return new PlainTextContentContentHelper();
    }

    public static RichContentTextContentHelper forRichText() {
        return new RichContentTextContentHelper();
    }

    public TextContentHelper withPrimaryText(String primaryText) {
        this.primaryText = primaryText;
        return this;
    }

    public TextContentHelper withSecondaryText(String secondaryText) {
        this.secondaryText = secondaryText;
        return this;
    }

    public TextContentHelper withTertiaryText(String tertiaryText) {
        this.tertiaryText = tertiaryText;
        return this;
    }

    public abstract TextContent build();

}
