/*
 * Copyright 2009 (C) James Dempsey
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */
package pcgen.core.term;

import pcgen.core.Equipment;
import pcgen.core.PlayerCharacter;

/**
 * The Class {@code EQAltPlusTotalTermEvaluator} is responsible for producing
 * the value of the ALTPLUSTOTAL token for use in equipment and eqmod cost formulas. 
 */
public class EQAltPlusTotalTermEvaluator extends BaseEQTermEvaluator implements TermEvaluator
{

	/**
	 * Instantiates a new eQ plus term evaluator.
	 * 
	 * @param expressionString the expression string
	 */
	public EQAltPlusTotalTermEvaluator(String expressionString)
	{
		this.originalText = expressionString;
	}

	@Override
	public Float resolve(Equipment eq, boolean primary, PlayerCharacter pc)
	{
		return TermUtil.convertToFloat(originalText, evaluate(eq, primary, pc));
	}

	@Override
	public String evaluate(Equipment eq, boolean primary, PlayerCharacter pc)
	{
		return Integer.toString(eq.calcPlusForHead(false));
	}

	@Override
	public boolean isSourceDependant()
	{
		return false;
	}

	public boolean isStatic()
	{
		return false;
	}

}
