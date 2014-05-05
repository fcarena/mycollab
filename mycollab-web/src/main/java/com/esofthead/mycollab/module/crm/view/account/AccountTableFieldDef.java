/**
 * This file is part of mycollab-web.
 *
 * mycollab-web is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-web is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-web.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.esofthead.mycollab.module.crm.view.account;

import com.esofthead.mycollab.module.crm.localization.AccountI18nEnum;
import com.esofthead.mycollab.module.crm.localization.CrmCommonI18nEnum;
import com.esofthead.mycollab.vaadin.AppContext;
import com.esofthead.mycollab.vaadin.ui.UIConstants;
import com.esofthead.mycollab.vaadin.ui.table.TableViewField;

public interface AccountTableFieldDef {

	public static TableViewField selected = new TableViewField("", "selected",
			UIConstants.TABLE_CONTROL_WIDTH);

	public static TableViewField action = new TableViewField("", "id",
			UIConstants.TABLE_ACTION_CONTROL_WIDTH);

	public static TableViewField accountname = new TableViewField(
			AppContext.getMessage(CrmCommonI18nEnum.TABLE_NAME_HEADER),
			"accountname", UIConstants.TABLE_X_LABEL_WIDTH);

	public static TableViewField city = new TableViewField(
			AppContext.getMessage(CrmCommonI18nEnum.TABLE_CITY_HEADER),
			"city", UIConstants.TABLE_X_LABEL_WIDTH);

	public static TableViewField phoneoffice = new TableViewField(
			AppContext
					.getMessage(CrmCommonI18nEnum.TABLE_OFFICE_PHONE_HEADER),
			"phoneoffice", UIConstants.TABLE_M_LABEL_WIDTH);

	public static TableViewField email = new TableViewField(
			AppContext
					.getMessage(CrmCommonI18nEnum.TABLE_EMAIL_ADDRESS_HEADER),
			"email", UIConstants.TABLE_EMAIL_WIDTH);

	public static TableViewField assignUser = new TableViewField(
			AppContext
					.getMessage(CrmCommonI18nEnum.TABLE_ASSIGNED_USER_HEADER),
			"assignUserFullName", UIConstants.TABLE_X_LABEL_WIDTH);

	public static TableViewField website = new TableViewField(
			AppContext
					.getMessage(CrmCommonI18nEnum.TABLE_WEBSITE_HEADER),
			"website", UIConstants.TABLE_X_LABEL_WIDTH);

	public static TableViewField type = new TableViewField(
			AppContext.getMessage(AccountI18nEnum.FORM_TYPE), "type",
			UIConstants.TABLE_X_LABEL_WIDTH);

	public static TableViewField ownership = new TableViewField(
			AppContext.getMessage(AccountI18nEnum.FORM_OWNERSHIP),
			"ownership", UIConstants.TABLE_X_LABEL_WIDTH);

	public static TableViewField fax = new TableViewField(
			AppContext.getMessage(AccountI18nEnum.FORM_FAX), "fax",
			UIConstants.TABLE_M_LABEL_WIDTH);

}
