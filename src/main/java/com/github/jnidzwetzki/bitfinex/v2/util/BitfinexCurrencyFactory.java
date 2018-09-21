/*******************************************************************************
 *
 *    Copyright (C) 2015-2018 Jan Kristof Nidzwetzki
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *
 *******************************************************************************/
package com.github.jnidzwetzki.bitfinex.v2.util;

import com.github.jnidzwetzki.bitfinex.v2.entity.currency.BitfinexCurrency;
import com.github.jnidzwetzki.bitfinex.v2.entity.currency.BitfinexCurrencyPair;
import com.github.jnidzwetzki.bitfinex.v2.entity.currency.BitfinexFundingCurrency;

public class BitfinexCurrencyFactory {

	/**
	 * Build the bitfinex currency from sybol string
	 * @param symbolString
	 * @return
	 */
	public static BitfinexCurrency build(final String symbolString) {
		
		if(symbolString.startsWith("t")) {
			return BitfinexCurrencyPair.fromSymbolString(symbolString);
		} else if(symbolString.startsWith("f")) {
			return BitfinexFundingCurrency.fromSymbolString(symbolString);
		} else {
			throw new IllegalArgumentException("Unable to build currency for symbol string: " + symbolString);
		}
	}
	
}