/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015-2021 Elior "Mallowigi" Boukhobza
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 *
 */

/*
 * Created by JFormDesigner on Sat May 02 14:11:13 IDT 2020
 */

package com.mallowigi.config.associations.ui;

import com.intellij.ide.BrowserUtil;
import com.intellij.openapi.Disposable;
import com.intellij.util.ui.ColumnInfo;
import com.intellij.util.ui.table.TableModelEditor;
import com.mallowigi.config.AtomSettingsBundle;
import com.mallowigi.config.associations.AtomAssocConfig;
import com.mallowigi.config.associations.ui.columns.*;
import com.mallowigi.config.associations.ui.internal.AssociationsTableItemEditor;
import com.mallowigi.config.ui.SettingsFormUI;
import com.mallowigi.icons.associations.CustomAssociations;
import com.mallowigi.icons.associations.RegexAssociation;
import net.miginfocom.swing.MigLayout;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.Collections;
import java.util.ResourceBundle;

@SuppressWarnings({"UndesirableClassUsage",
  "FieldCanBeLocal",
  "LocalCanBeFinal",
  "PublicMethodNotExposedInInterface",
  "InstanceVariableMayNotBeInitialized",
  "TransientFieldNotInitialized",
  "DuplicateStringLiteralInspection",
  "StringConcatenation",
  "DuplicatedCode",
  "unused"
})
public final class AssociationsForm extends JPanel implements SettingsFormUI, Disposable {

  private final transient ColumnInfo[] fileColumns = {
    new EnabledColumnInfo(),
    new NameEditableColumnInfo(this, true),
    new PatternEditableColumnInfo(this, true),
    new FileIconEditableColumnInfo(this, true),
    new PriorityColumnInfo(this, true)
  };

  private final transient ColumnInfo[] folderColumns = {
    new EnabledColumnInfo(),
    new NameEditableColumnInfo(this, true),
    new PatternEditableColumnInfo(this, true),
    new FolderIconEditableColumnInfo(this, true),
    new PriorityColumnInfo(this, true)
  };

  // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
  // Generated using JFormDesigner non-commercial license
  private JTextPane deprecated;
  private JTabbedPane tabbedContainer;
  private JPanel customFileIcons;
  private JPanel customFolderIcons;
  // JFormDesigner - End of variables declaration  //GEN-END:variables
  private JComponent customFileIconsTable;
  private JComponent customFolderIconsTable;
  private @Nullable TableModelEditor<RegexAssociation> customFileAssociationsEditor;
  private @Nullable TableModelEditor<RegexAssociation> customFolderAssociationsEditor;

  @Override
  public void init() {
    initComponents();
    createCustomTables();
  }

  private static void linkMouseClicked(MouseEvent e) {
    BrowserUtil.browse(AtomSettingsBundle.message("SelectForm.link.text"));
  }

  @Override
  public void afterStateSet() {
    // add after state set
  }

  @Override
  public void dispose() {
    customFileAssociationsEditor = null;
    customFolderAssociationsEditor = null;
  }

  public void setFormState(final AtomAssocConfig config) {
    if (customFileAssociationsEditor != null) {
      customFileAssociationsEditor.reset(config.getCustomFileAssociations().getTheAssociations());
    }
    if (customFolderAssociationsEditor != null) {
      customFolderAssociationsEditor.reset(config.getCustomFolderAssociations().getTheAssociations());
    }
    afterStateSet();
  }

  @SuppressWarnings("SimplifiableIfStatement")
  public boolean isModified(@Nullable final AtomAssocConfig config) {
    if (config == null) {
      return false;
    }

    boolean modified = false;
    if (customFileAssociationsEditor != null) {
      modified = config.isFileIconsModified(customFileAssociationsEditor.getModel().getItems());
    }
    if (customFolderAssociationsEditor != null) {
      modified = modified || config.isFolderIconsModified(customFolderAssociationsEditor.getModel().getItems());
    }
    return modified;
  }

  public CustomAssociations getFileAssociations() {
    assert customFileAssociationsEditor != null;
    return new CustomAssociations(Collections.unmodifiableList(customFileAssociationsEditor.getModel().getItems()));
  }

  public CustomAssociations getFolderAssociations() {
    assert customFolderAssociationsEditor != null;
    return new CustomAssociations(Collections.unmodifiableList(customFolderAssociationsEditor.getModel().getItems()));
  }

  @Override
  public JComponent getContent() {
    return this;
  }

  @SuppressWarnings("ConfusingFloatingPointLiteral")
  private void initComponents() {
    // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
    // Generated using JFormDesigner non-commercial license
    ResourceBundle bundle = ResourceBundle.getBundle("messages.AtomFileIconsBundle");
    deprecated = new JTextPane();
    tabbedContainer = new JTabbedPane();
    customFileIcons = new JPanel();
    customFolderIcons = new JPanel();

    //======== this ========
    setBorder(new TitledBorder(null, bundle.getString("AssociationsForm.this.border"), TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION));
    setLayout(new MigLayout(
      "flowy,hidemode 3,wrap",
      // columns
      "[369,grow,fill]",
      // rows
      "[]" +
        "[270,grow,fill]"));

    //---- deprecated ----
    deprecated.setText(bundle.getString("AssociationsForm.deprecated.text"));
    deprecated.setFont(deprecated.getFont().deriveFont(deprecated.getFont().getSize() + 5f));
    deprecated.setForeground(SystemColor.controlHighlight);
    add(deprecated, "cell 0 0");

    //======== tabbedContainer ========
    {

      //======== customFileIcons ========
      {
        customFileIcons.setLayout(new MigLayout(
          "hidemode 3",
          // columns
          "0[grow,fill]0",
          // rows
          "0[grow,fill]0"));
      }
      tabbedContainer.addTab(bundle.getString("AssociationsForm.customFileIcons.tab.title"), customFileIcons);

      //======== customFolderIcons ========
      {
        customFolderIcons.setLayout(new MigLayout(
          "hidemode 3",
          // columns
          "0[grow,fill]0",
          // rows
          "0[grow,fill]0"));
      }
      tabbedContainer.addTab(bundle.getString("AssociationsForm.customFolderIcons.title"), customFolderIcons);
    }
    add(tabbedContainer, "cell 0 1");
    // JFormDesigner - End of component initialization  //GEN-END:initComponents
  }

  /**
   * Create the custom tables
   */
  private void createCustomTables() {
    createCustomFileIconsTable();
    createCustomFolderIconsTable();
  }

  /**
   * Create the custom file icons
   */
  private void createCustomFileIconsTable() {
    final AssociationsTableItemEditor itemEditor = new AssociationsTableItemEditor();
    customFileAssociationsEditor = new TableModelEditor<>(fileColumns,
      itemEditor,
      AtomSettingsBundle.message("no.custom.file.associations"));
    customFileIconsTable = customFileAssociationsEditor.createComponent();
    customFileIcons.add(customFileIconsTable, "cell 0 0"); //NON-NLS
  }

  /**
   * Create the custom folder icons
   */
  private void createCustomFolderIconsTable() {
    final AssociationsTableItemEditor itemEditor = new AssociationsTableItemEditor();
    customFolderAssociationsEditor = new TableModelEditor<>(folderColumns,
      itemEditor,
      AtomSettingsBundle.message("no.custom.folder.associations"));
    customFolderIconsTable = customFolderAssociationsEditor.createComponent();
    customFolderIcons.add(customFolderIconsTable, "cell 0 0"); //NON-NLS
  }

}