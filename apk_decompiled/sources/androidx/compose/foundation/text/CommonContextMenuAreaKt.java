package androidx.compose.foundation.text;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.contextmenu.ContextMenuAreaKt;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuStateKt;
import androidx.compose.foundation.text.contextmenu.internal.PlatformDefaultTextContextMenuProviders_androidKt;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGesturesModifierKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import defpackage.hm;
import defpackage.ij;
import defpackage.iy;
import defpackage.j9;
import defpackage.jj;
import defpackage.kj;
import defpackage.ky;
import defpackage.lj;
import defpackage.my;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.p9;
import defpackage.st;
import defpackage.un;
import defpackage.vn;
import defpackage.w01;
import defpackage.xn;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CommonContextMenuAreaKt {
    public static final void CommonContextMenuArea(TextFieldSelectionState textFieldSelectionState, boolean z, my myVar, Composer composer, int i) {
        int i2;
        Modifier modifier;
        Composer startRestartGroup = composer.startRestartGroup(-1442752422);
        int i3 = 4;
        int i4 = 2;
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(textFieldSelectionState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i5 = 1;
        if (startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1442752422, i2, -1, "androidx.compose.foundation.text.CommonContextMenuArea (CommonContextMenuArea.kt:75)");
            }
            if (ComposeFoundationFlags.isNewContextMenuEnabled) {
                startRestartGroup.startReplaceGroup(-1299459355);
                if (z) {
                    startRestartGroup.startReplaceGroup(-1299415211);
                    Modifier.Companion companion = Modifier.Companion;
                    boolean changedInstance = startRestartGroup.changedInstance(textFieldSelectionState);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1(textFieldSelectionState, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    modifier = TextContextMenuGesturesModifierKt.showTextContextMenuOnSecondaryClick(companion, (my) rememberedValue);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1298836224);
                    startRestartGroup.endReplaceGroup();
                    modifier = Modifier.Companion;
                }
                PlatformDefaultTextContextMenuProviders_androidKt.ProvideDefaultPlatformTextContextMenuProviders(modifier, myVar, startRestartGroup, (i2 >> 3) & 112, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1298667367);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                Composer.Companion companion2 = Composer.Companion;
                if (rememberedValue2 == companion2.getEmpty()) {
                    rememberedValue2 = new ContextMenuState(null, 1, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                ContextMenuState contextMenuState = (ContextMenuState) rememberedValue2;
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == companion2.getEmpty()) {
                    rememberedValue3 = EffectsKt.createCompositionCoroutineScope(st.d, startRestartGroup);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                un unVar = (un) rememberedValue3;
                Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == companion2.getEmpty()) {
                    rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MenuItemsAvailability.m1143boximpl(MenuItemsAvailability.Companion.m1156getNoneJKCFgKw()), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                MutableState mutableState = (MutableState) rememberedValue4;
                boolean changedInstance2 = startRestartGroup.changedInstance(unVar);
                Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue5 == companion2.getEmpty()) {
                    rememberedValue5 = new j9(unVar, i5);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                ky contextMenuBuilder = TextFieldSelectionStateKt.contextMenuBuilder(textFieldSelectionState, contextMenuState, mutableState, (my) rememberedValue5);
                Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (rememberedValue6 == companion2.getEmpty()) {
                    rememberedValue6 = new ij(contextMenuState, i4);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                iy iyVar = (iy) rememberedValue6;
                boolean changedInstance3 = startRestartGroup.changedInstance(unVar) | startRestartGroup.changedInstance(textFieldSelectionState);
                Object rememberedValue7 = startRestartGroup.rememberedValue();
                if (changedInstance3 || rememberedValue7 == companion2.getEmpty()) {
                    rememberedValue7 = new p9(unVar, mutableState, textFieldSelectionState, i3);
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                ContextMenuAreaKt.ContextMenuArea(contextMenuState, iyVar, contextMenuBuilder, null, z, (iy) rememberedValue7, myVar, startRestartGroup, ((i2 << 9) & 57344) | 54 | ((i2 << 12) & 3670016), 8);
                startRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new lj(textFieldSelectionState, z, myVar, i, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CommonContextMenuArea$lambda$10$0(un unVar, MutableState mutableState, TextFieldSelectionState textFieldSelectionState) {
        p01.t(unVar, null, xn.g, new CommonContextMenuAreaKt$CommonContextMenuArea$5$1$1(mutableState, textFieldSelectionState, null), 1);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CommonContextMenuArea$lambda$11(TextFieldSelectionState textFieldSelectionState, boolean z, my myVar, int i, Composer composer, int i2) {
        CommonContextMenuArea(textFieldSelectionState, z, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CommonContextMenuArea$lambda$13$0(ContextMenuState contextMenuState) {
        ContextMenuStateKt.close(contextMenuState);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CommonContextMenuArea$lambda$14(SelectionManager selectionManager, my myVar, int i, Composer composer, int i2) {
        CommonContextMenuArea(selectionManager, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CommonContextMenuArea$lambda$2$0(ContextMenuState contextMenuState) {
        ContextMenuStateKt.close(contextMenuState);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CommonContextMenuArea$lambda$3$0(un unVar, MutableState mutableState, TextFieldSelectionManager textFieldSelectionManager) {
        p01.t(unVar, null, xn.g, new CommonContextMenuAreaKt$CommonContextMenuArea$2$1$1(mutableState, textFieldSelectionManager, null), 1);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CommonContextMenuArea$lambda$4(TextFieldSelectionManager textFieldSelectionManager, my myVar, int i, Composer composer, int i2) {
        CommonContextMenuArea(textFieldSelectionManager, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CommonContextMenuArea$lambda$8$0(un unVar, TextFieldSelectionState textFieldSelectionState, TextContextMenuItems textContextMenuItems) {
        p01.t(unVar, null, xn.g, new CommonContextMenuAreaKt$CommonContextMenuArea$menuBuilder$1$1$1(textContextMenuItems, textFieldSelectionState, null), 1);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 CommonContextMenuArea$lambda$9$0(ContextMenuState contextMenuState) {
        ContextMenuStateKt.close(contextMenuState);
        return w01.a;
    }

    public static final void TextItem(ContextMenuScope contextMenuScope, ContextMenuState contextMenuState, TextContextMenuItems textContextMenuItems, boolean z, iy iyVar) {
        if (z) {
            ContextMenuScope.item$default(contextMenuScope, new CommonContextMenuAreaKt$TextItem$1(textContextMenuItems), null, false, null, new CommonContextMenuAreaKt$TextItem$2(iyVar, contextMenuState), 14, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object getContextMenuItemsAvailability(TextFieldSelectionState textFieldSelectionState, hm hmVar) {
        CommonContextMenuAreaKt$getContextMenuItemsAvailability$1 commonContextMenuAreaKt$getContextMenuItemsAvailability$1;
        int i;
        if (hmVar instanceof CommonContextMenuAreaKt$getContextMenuItemsAvailability$1) {
            commonContextMenuAreaKt$getContextMenuItemsAvailability$1 = (CommonContextMenuAreaKt$getContextMenuItemsAvailability$1) hmVar;
            int i2 = commonContextMenuAreaKt$getContextMenuItemsAvailability$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonContextMenuAreaKt$getContextMenuItemsAvailability$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonContextMenuAreaKt$getContextMenuItemsAvailability$1.result;
                i = commonContextMenuAreaKt$getContextMenuItemsAvailability$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    commonContextMenuAreaKt$getContextMenuItemsAvailability$1.L$0 = textFieldSelectionState;
                    commonContextMenuAreaKt$getContextMenuItemsAvailability$1.label = 1;
                    Object updateClipboardEntry = textFieldSelectionState.updateClipboardEntry(commonContextMenuAreaKt$getContextMenuItemsAvailability$1);
                    vn vnVar = vn.d;
                    if (updateClipboardEntry == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    textFieldSelectionState = (TextFieldSelectionState) commonContextMenuAreaKt$getContextMenuItemsAvailability$1.L$0;
                    p10.Q(obj);
                }
                return MenuItemsAvailability.m1143boximpl(MenuItemsAvailability.m1145constructorimpl(textFieldSelectionState.canShowCopyMenuItem(), textFieldSelectionState.canShowPasteMenuItem(), textFieldSelectionState.canShowCutMenuItem(), textFieldSelectionState.canShowSelectAllMenuItem(), textFieldSelectionState.canShowAutofillMenuItem()));
            }
        }
        commonContextMenuAreaKt$getContextMenuItemsAvailability$1 = new CommonContextMenuAreaKt$getContextMenuItemsAvailability$1(hmVar);
        Object obj2 = commonContextMenuAreaKt$getContextMenuItemsAvailability$1.result;
        i = commonContextMenuAreaKt$getContextMenuItemsAvailability$1.label;
        if (i != 0) {
        }
        return MenuItemsAvailability.m1143boximpl(MenuItemsAvailability.m1145constructorimpl(textFieldSelectionState.canShowCopyMenuItem(), textFieldSelectionState.canShowPasteMenuItem(), textFieldSelectionState.canShowCutMenuItem(), textFieldSelectionState.canShowSelectAllMenuItem(), textFieldSelectionState.canShowAutofillMenuItem()));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object getContextMenuItemsAvailability(TextFieldSelectionManager textFieldSelectionManager, hm hmVar) {
        CommonContextMenuAreaKt$getContextMenuItemsAvailability$2 commonContextMenuAreaKt$getContextMenuItemsAvailability$2;
        int i;
        if (hmVar instanceof CommonContextMenuAreaKt$getContextMenuItemsAvailability$2) {
            commonContextMenuAreaKt$getContextMenuItemsAvailability$2 = (CommonContextMenuAreaKt$getContextMenuItemsAvailability$2) hmVar;
            int i2 = commonContextMenuAreaKt$getContextMenuItemsAvailability$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonContextMenuAreaKt$getContextMenuItemsAvailability$2.label = i2 - Integer.MIN_VALUE;
                Object obj = commonContextMenuAreaKt$getContextMenuItemsAvailability$2.result;
                i = commonContextMenuAreaKt$getContextMenuItemsAvailability$2.label;
                if (i != 0) {
                    p10.Q(obj);
                    commonContextMenuAreaKt$getContextMenuItemsAvailability$2.L$0 = textFieldSelectionManager;
                    commonContextMenuAreaKt$getContextMenuItemsAvailability$2.label = 1;
                    Object updateClipboardEntry$foundation = textFieldSelectionManager.updateClipboardEntry$foundation(commonContextMenuAreaKt$getContextMenuItemsAvailability$2);
                    vn vnVar = vn.d;
                    if (updateClipboardEntry$foundation == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    textFieldSelectionManager = (TextFieldSelectionManager) commonContextMenuAreaKt$getContextMenuItemsAvailability$2.L$0;
                    p10.Q(obj);
                }
                return MenuItemsAvailability.m1143boximpl(MenuItemsAvailability.m1145constructorimpl(textFieldSelectionManager.canShowCopyMenuItem$foundation(), textFieldSelectionManager.canShowPasteMenuItem$foundation(), textFieldSelectionManager.canShowCutMenuItem$foundation(), textFieldSelectionManager.canShowSelectAllMenuItem$foundation(), textFieldSelectionManager.canShowAutofillMenuItem$foundation()));
            }
        }
        commonContextMenuAreaKt$getContextMenuItemsAvailability$2 = new CommonContextMenuAreaKt$getContextMenuItemsAvailability$2(hmVar);
        Object obj2 = commonContextMenuAreaKt$getContextMenuItemsAvailability$2.result;
        i = commonContextMenuAreaKt$getContextMenuItemsAvailability$2.label;
        if (i != 0) {
        }
        return MenuItemsAvailability.m1143boximpl(MenuItemsAvailability.m1145constructorimpl(textFieldSelectionManager.canShowCopyMenuItem$foundation(), textFieldSelectionManager.canShowPasteMenuItem$foundation(), textFieldSelectionManager.canShowCutMenuItem$foundation(), textFieldSelectionManager.canShowSelectAllMenuItem$foundation(), textFieldSelectionManager.canShowAutofillMenuItem$foundation()));
    }

    public static final void CommonContextMenuArea(TextFieldSelectionManager textFieldSelectionManager, my myVar, Composer composer, int i) {
        int i2;
        my myVar2;
        Composer startRestartGroup = composer.startRestartGroup(1533506138);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(textFieldSelectionManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? 32 : 16;
        }
        int i3 = 0;
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1533506138, i2, -1, "androidx.compose.foundation.text.CommonContextMenuArea (CommonContextMenuArea.kt:46)");
            }
            if (ComposeFoundationFlags.isNewContextMenuEnabled) {
                startRestartGroup.startReplaceGroup(-885604480);
                PlatformDefaultTextContextMenuProviders_androidKt.ProvideDefaultPlatformTextContextMenuProviders(textFieldSelectionManager.getContextMenuAreaModifier(), myVar, startRestartGroup, i2 & 112, 0);
                startRestartGroup.endReplaceGroup();
                myVar2 = myVar;
            } else {
                startRestartGroup.startReplaceGroup(-885475365);
                Object rememberedValue = startRestartGroup.rememberedValue();
                Composer.Companion companion = Composer.Companion;
                if (rememberedValue == companion.getEmpty()) {
                    rememberedValue = new ContextMenuState(null, 1, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                ContextMenuState contextMenuState = (ContextMenuState) rememberedValue;
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == companion.getEmpty()) {
                    rememberedValue2 = EffectsKt.createCompositionCoroutineScope(st.d, startRestartGroup);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                un unVar = (un) rememberedValue2;
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == companion.getEmpty()) {
                    rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MenuItemsAvailability.m1143boximpl(MenuItemsAvailability.Companion.m1156getNoneJKCFgKw()), null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                MutableState mutableState = (MutableState) rememberedValue3;
                Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == companion.getEmpty()) {
                    rememberedValue4 = new ij(contextMenuState, i3);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                iy iyVar = (iy) rememberedValue4;
                ky contextMenuBuilder = TextFieldSelectionManagerKt.contextMenuBuilder(textFieldSelectionManager, contextMenuState, mutableState);
                boolean enabled = textFieldSelectionManager.getEnabled();
                boolean changedInstance = startRestartGroup.changedInstance(unVar) | startRestartGroup.changedInstance(textFieldSelectionManager);
                Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue5 == companion.getEmpty()) {
                    rememberedValue5 = new p9(unVar, mutableState, textFieldSelectionManager, 3);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                myVar2 = myVar;
                ContextMenuAreaKt.ContextMenuArea(contextMenuState, iyVar, contextMenuBuilder, null, enabled, (iy) rememberedValue5, myVar2, startRestartGroup, ((i2 << 15) & 3670016) | 54, 8);
                startRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            myVar2 = myVar;
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new jj(textFieldSelectionManager, myVar2, i, i3));
        }
    }

    public static final void CommonContextMenuArea(SelectionManager selectionManager, my myVar, Composer composer, int i) {
        int i2;
        my myVar2;
        Composer startRestartGroup = composer.startRestartGroup(-614342087);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(selectionManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? 32 : 16;
        }
        int i3 = 0;
        int i4 = 1;
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-614342087, i2, -1, "androidx.compose.foundation.text.CommonContextMenuArea (CommonContextMenuArea.kt:131)");
            }
            if (ComposeFoundationFlags.isNewContextMenuEnabled) {
                startRestartGroup.startReplaceGroup(-1009319487);
                PlatformDefaultTextContextMenuProviders_androidKt.ProvideDefaultPlatformTextContextMenuProviders(selectionManager.getContextMenuAreaModifier(), myVar, startRestartGroup, i2 & 112, 0);
                startRestartGroup.endReplaceGroup();
                myVar2 = myVar;
            } else {
                startRestartGroup.startReplaceGroup(-1009204043);
                Object rememberedValue = startRestartGroup.rememberedValue();
                Composer.Companion companion = Composer.Companion;
                if (rememberedValue == companion.getEmpty()) {
                    rememberedValue = new ContextMenuState(null, 1, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                ContextMenuState contextMenuState = (ContextMenuState) rememberedValue;
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == companion.getEmpty()) {
                    rememberedValue2 = new ij(contextMenuState, i4);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                myVar2 = myVar;
                ContextMenuAreaKt.ContextMenuArea(contextMenuState, (iy) rememberedValue2, SelectionManagerKt.contextMenuBuilder(selectionManager, contextMenuState), null, false, null, myVar2, startRestartGroup, ((i2 << 15) & 3670016) | 54, 56);
                startRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            myVar2 = myVar;
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kj(selectionManager, myVar2, i, i3));
        }
    }
}
