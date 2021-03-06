/**
 * Copyright (c) 2008-2012, Dr. Garbage Community
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

package com.drgarbage.controlflowgraphfactory.actions;

import org.eclipse.gef.internal.GEFMessages;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.RetargetAction;

/**
 * SelectAll Action. The Action is defined as a global action.
 * Only the definition is nessesary.
 *
 * @author Sergej Alekseev
 * @version $Revision$
 * $Id: SellectAllAction.java 1523 2012-04-13 14:34:24Z Sergej Alekseev $
 */
public class SellectAllAction extends RetargetAction {

	public SellectAllAction() {
		super(ActionFactory.SELECT_ALL.getId(), GEFMessages.SelectAllAction_Label);
		setToolTipText(GEFMessages.SelectAllAction_Tooltip);
	}
}
