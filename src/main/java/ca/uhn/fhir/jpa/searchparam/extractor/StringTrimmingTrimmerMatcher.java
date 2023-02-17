package ca.uhn.fhir.jpa.searchparam.extractor;

/*-
 * #%L
 * HAPI FHIR Search Parameters
 * %%
 * Copyright (C) 2014 - 2022 Smile CDR, Inc.
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.apache.commons.text.matcher.StringMatcher;

/**
 * Utility class that works with the commons-text
 * {@link org.apache.commons.text.StringTokenizer}
 * class to return tokens that are whitespace trimmed.
 */
public class StringTrimmingTrimmerMatcher implements StringMatcher {
	@Override
	public int isMatch(char[] buffer, int start, int bufferStart, int bufferEnd) {
		return (buffer[start] <= 32) ? 1 : 0;
	}
}
