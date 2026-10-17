package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.compose.ui.window.PopupProperties;
import defpackage.cd;
import defpackage.dq;
import defpackage.g1;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.lg;
import defpackage.m6;
import defpackage.ny;
import defpackage.uo;
import defpackage.vh;
import defpackage.w01;
import defpackage.xl;
import defpackage.yl;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContextMenuUiKt {
    private static final ContextMenuColors DefaultContextMenuColors;
    private static final PopupProperties DefaultPopupProperties = new PopupProperties(true, false, false, false, 14, (dq) null);
    private static final float DisabledAlpha = 0.38f;

    static {
        Color.Companion companion = Color.Companion;
        DefaultContextMenuColors = new ContextMenuColors(companion.m4798getWhite0d7_KjU(), companion.m4787getBlack0d7_KjU(), companion.m4787getBlack0d7_KjU(), Color.m4760copywmQWz5c$default(companion.m4787getBlack0d7_KjU(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m4760copywmQWz5c$default(companion.m4787getBlack0d7_KjU(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContextMenuColumn(ContextMenuColors contextMenuColors, Modifier modifier, ny nyVar, Composer composer, int i, int i2) {
        ContextMenuColors contextMenuColors2;
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Modifier m4355shadows4CzXII;
        Composer startRestartGroup = composer.startRestartGroup(-527864079);
        if ((i & 6) == 0) {
            contextMenuColors2 = contextMenuColors;
            i3 = (startRestartGroup.changed(contextMenuColors2) ? 4 : 2) | i;
        } else {
            contextMenuColors2 = contextMenuColors;
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(nyVar) ? Fields.RotationX : Fields.SpotShadowColor;
            }
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i4 != 0 ? Modifier.Companion : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-527864079, i3, -1, "androidx.compose.foundation.contextmenu.ContextMenuColumn (ContextMenuUi.kt:153)");
                }
                ContextMenuSpec contextMenuSpec = ContextMenuSpec.INSTANCE;
                m4355shadows4CzXII = ShadowKt.m4355shadows4CzXII(modifier3, contextMenuSpec.m349getMenuContainerElevationD9Ej5fM(), (r14 & 2) != 0 ? RectangleShapeKt.getRectangleShape() : RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(contextMenuSpec.m339getCornerRadiusD9Ej5fM()), (r14 & 4) != 0 ? Dp.m7610compareTo0680j_4(r7, Dp.m7611constructorimpl(0.0f)) > 0 : false, (r14 & 8) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : 0L, (r14 & 16) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : 0L);
                Modifier verticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m764paddingVpY3zN4$default(IntrinsicKt.width(BackgroundKt.m227backgroundbw27NRU$default(m4355shadows4CzXII, contextMenuColors2.m331getBackgroundColor0d7_KjU(), null, 2, null), IntrinsicSize.Max), 0.0f, contextMenuSpec.m350getVerticalPaddingD9Ej5fM(), 1, null), ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
                int i5 = (i3 << 3) & 7168;
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
                int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default);
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                iy constructor = companion.getConstructor();
                if (startRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m3878constructorimpl = Updater.m3878constructorimpl(startRestartGroup);
                uo.h(companion, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                nyVar.invoke(ColumnScopeInstance.INSTANCE, startRestartGroup, Integer.valueOf(((i5 >> 6) & 112) | 6));
                startRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new g1(contextMenuColors2, modifier3, nyVar, i, i2, 3));
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ContextMenuColumn$lambda$0(ContextMenuColors contextMenuColors, Modifier modifier, ny nyVar, int i, int i2, Composer composer, int i3) {
        ContextMenuColumn(contextMenuColors, modifier, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    public static final void ContextMenuColumnBuilder(Modifier modifier, ContextMenuColors contextMenuColors, ky kyVar, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        ContextMenuColors contextMenuColors2;
        Composer startRestartGroup = composer.startRestartGroup(-625529233);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(contextMenuColors) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(kyVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i6 = 0;
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            Modifier modifier3 = modifier;
            if (i5 != 0) {
                contextMenuColors = DefaultContextMenuColors;
            }
            ContextMenuColors contextMenuColors3 = contextMenuColors;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-625529233, i3, -1, "androidx.compose.foundation.contextmenu.ContextMenuColumnBuilder (ContextMenuUi.kt:132)");
            }
            ContextMenuColumn(contextMenuColors3, modifier3, ComposableLambdaKt.rememberComposableLambda(-250345048, true, new xl(i6, kyVar, contextMenuColors3), startRestartGroup, 54), startRestartGroup, ((i3 >> 3) & 14) | 384 | ((i3 << 3) & 112), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            contextMenuColors2 = contextMenuColors3;
            modifier2 = modifier3;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            contextMenuColors2 = contextMenuColors;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new g1(modifier2, contextMenuColors2, kyVar, i, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ContextMenuColumnBuilder$lambda$0(ky kyVar, ContextMenuColors contextMenuColors, ColumnScope columnScope, Composer composer, int i) {
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-250345048, i, -1, "androidx.compose.foundation.contextmenu.ContextMenuColumnBuilder.<anonymous> (ContextMenuUi.kt:134)");
            }
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new ContextMenuScope(ComposableSingletons$ContextMenuUiKt.INSTANCE.m330getLambda$1571120048$foundation());
                composer.updateRememberedValue(rememberedValue);
            }
            ContextMenuScope contextMenuScope = (ContextMenuScope) rememberedValue;
            contextMenuScope.clear$foundation();
            kyVar.invoke(contextMenuScope);
            contextMenuScope.Content$foundation(contextMenuColors, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ContextMenuColumnBuilder$lambda$1(Modifier modifier, ContextMenuColors contextMenuColors, ky kyVar, int i, int i2, Composer composer, int i3) {
        ContextMenuColumnBuilder(modifier, contextMenuColors, kyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContextMenuItem(String str, boolean z, ContextMenuColors contextMenuColors, Modifier modifier, ny nyVar, iy iyVar, Composer composer, int i, int i2) {
        String str2;
        int i3;
        int i4;
        ny nyVar2;
        int i5;
        Composer composer2;
        Modifier modifier2;
        ny nyVar3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-2001167027);
        if ((i & 6) == 0) {
            str2 = str;
            i3 = (startRestartGroup.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(contextMenuColors) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? Fields.CameraDistance : Fields.RotationZ;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                ny nyVar4 = nyVar;
                i3 |= startRestartGroup.changedInstance(nyVar4) ? Fields.Clip : 8192;
                nyVar2 = nyVar4;
                if ((196608 & i) == 0) {
                    i3 |= startRestartGroup.changedInstance(iyVar) ? 131072 : 65536;
                }
                i5 = i3;
                int i7 = 1;
                if (startRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
                    Modifier modifier3 = i6 != 0 ? Modifier.Companion : modifier;
                    if (i4 != 0) {
                        nyVar2 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2001167027, i5, -1, "androidx.compose.foundation.contextmenu.ContextMenuItem (ContextMenuUi.kt:191)");
                    }
                    ContextMenuSpec contextMenuSpec = ContextMenuSpec.INSTANCE;
                    Alignment.Vertical labelVerticalTextAlignment = contextMenuSpec.getLabelVerticalTextAlignment();
                    Arrangement.HorizontalOrVertical m647spacedBy0680j_4 = Arrangement.INSTANCE.m647spacedBy0680j_4(contextMenuSpec.m343getHorizontalPaddingD9Ej5fM());
                    boolean z2 = ((i5 & 112) == 32) | ((458752 & i5) == 131072);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (z2 || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new cd(i7, z, iyVar);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    Modifier modifier4 = modifier3;
                    Modifier m764paddingVpY3zN4$default = PaddingKt.m764paddingVpY3zN4$default(SizeKt.m810sizeInqDBjuR0(SizeKt.fillMaxWidth$default(ClickableKt.m262clickableoSLSa3U$default(modifier4, z, str2, null, null, (iy) rememberedValue, 12, null), 0.0f, 1, null), contextMenuSpec.m338getContainerWidthMinD9Ej5fM(), contextMenuSpec.m348getListItemHeightD9Ej5fM(), contextMenuSpec.m337getContainerWidthMaxD9Ej5fM(), contextMenuSpec.m348getListItemHeightD9Ej5fM()), contextMenuSpec.m343getHorizontalPaddingD9Ej5fM(), 0.0f, 2, null);
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m647spacedBy0680j_4, labelVerticalTextAlignment, startRestartGroup, 54);
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m764paddingVpY3zN4$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                    iy constructor = companion.getConstructor();
                    if (startRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor);
                    } else {
                        startRestartGroup.useNode();
                    }
                    Composer m3878constructorimpl = Updater.m3878constructorimpl(startRestartGroup);
                    uo.h(companion, m3878constructorimpl, rowMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    if (nyVar2 == null) {
                        startRestartGroup.startReplaceGroup(-1597947094);
                    } else {
                        startRestartGroup.startReplaceGroup(-1597947093);
                        Modifier m803requiredSizeInqDBjuR0$default = SizeKt.m803requiredSizeInqDBjuR0$default(Modifier.Companion, contextMenuSpec.m344getIconSizeD9Ej5fM(), 0.0f, contextMenuSpec.m344getIconSizeD9Ej5fM(), contextMenuSpec.m344getIconSizeD9Ej5fM(), 2, null);
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                        int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m803requiredSizeInqDBjuR0$default);
                        iy constructor2 = companion.getConstructor();
                        if (startRestartGroup.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor2);
                        } else {
                            startRestartGroup.useNode();
                        }
                        Composer m3878constructorimpl2 = Updater.m3878constructorimpl(startRestartGroup);
                        uo.h(companion, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                        Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, k4.c(companion, m3878constructorimpl2, Integer.valueOf(hashCode2), m3878constructorimpl2));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        nyVar2.invoke(Color.m4751boximpl(z ? contextMenuColors.m334getIconColor0d7_KjU() : contextMenuColors.m332getDisabledIconColor0d7_KjU()), startRestartGroup, 0);
                        startRestartGroup.endNode();
                    }
                    startRestartGroup.endReplaceGroup();
                    ny nyVar5 = nyVar2;
                    composer2 = startRestartGroup;
                    BasicTextKt.m1078BasicTextRWo7tUw(str, rowScopeInstance.weight(Modifier.Companion, 1.0f, true), contextMenuSpec.m351textStyle8_81llA(z ? contextMenuColors.m335getTextColor0d7_KjU() : contextMenuColors.m333getDisabledTextColor0d7_KjU()), (ky) null, 0, false, 1, 0, (ColorProducer) null, (TextAutoSize) null, composer2, (i5 & 14) | 1572864, 952);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                    nyVar3 = nyVar5;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    modifier2 = modifier;
                    nyVar3 = nyVar2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new vh(str, z, contextMenuColors, modifier2, nyVar3, iyVar, i, i2));
                    return;
                }
                return;
            }
            nyVar2 = nyVar;
            if ((196608 & i) == 0) {
            }
            i5 = i3;
            int i72 = 1;
            if (startRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        nyVar2 = nyVar;
        if ((196608 & i) == 0) {
        }
        i5 = i3;
        int i722 = 1;
        if (startRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ContextMenuItem$lambda$0$0(boolean z, iy iyVar) {
        if (z) {
            iyVar.invoke();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ContextMenuItem$lambda$2(String str, boolean z, ContextMenuColors contextMenuColors, Modifier modifier, ny nyVar, iy iyVar, int i, int i2, Composer composer, int i3) {
        ContextMenuItem(str, z, contextMenuColors, modifier, nyVar, iyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContextMenuPopup(PopupPositionProvider popupPositionProvider, iy iyVar, Modifier modifier, ContextMenuColors contextMenuColors, ky kyVar, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-305401220);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(popupPositionProvider) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(iyVar) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changed(contextMenuColors) ? Fields.CameraDistance : Fields.RotationZ;
            }
            if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changedInstance(kyVar) ? Fields.Clip : 8192;
            }
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                Modifier modifier3 = i4 != 0 ? Modifier.Companion : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-305401220, i3, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.kt:117)");
                }
                AndroidPopup_androidKt.Popup(popupPositionProvider, iyVar, DefaultPopupProperties, ComposableLambdaKt.rememberComposableLambda(-1271367778, true, new m6(modifier3, contextMenuColors, kyVar, 3), startRestartGroup, 54), startRestartGroup, (i3 & 14) | 3456 | (i3 & 112), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new lg(popupPositionProvider, iyVar, modifier2, contextMenuColors, kyVar, i, i2));
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ContextMenuPopup$lambda$0(PopupPositionProvider popupPositionProvider, iy iyVar, Modifier modifier, ky kyVar, int i, int i2, Composer composer, int i3) {
        ContextMenuPopup(popupPositionProvider, iyVar, modifier, kyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ContextMenuPopup$lambda$1(Modifier modifier, ContextMenuColors contextMenuColors, ky kyVar, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1271367778, i, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup.<anonymous> (ContextMenuUi.kt:123)");
            }
            ContextMenuColumnBuilder(modifier, contextMenuColors, kyVar, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ContextMenuPopup$lambda$2(PopupPositionProvider popupPositionProvider, iy iyVar, Modifier modifier, ContextMenuColors contextMenuColors, ky kyVar, int i, int i2, Composer composer, int i3) {
        ContextMenuPopup(popupPositionProvider, iyVar, modifier, contextMenuColors, kyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    public static final ContextMenuColors getDefaultContextMenuColors() {
        return DefaultContextMenuColors;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContextMenuPopup(PopupPositionProvider popupPositionProvider, iy iyVar, Modifier modifier, ky kyVar, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(307841774);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(popupPositionProvider) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(iyVar) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(kyVar) ? Fields.CameraDistance : Fields.RotationZ;
            }
            if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                Modifier modifier3 = i4 != 0 ? Modifier.Companion : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(307841774, i3, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.kt:99)");
                }
                ContextMenuPopup(popupPositionProvider, iyVar, modifier3, ContextMenuUi_androidKt.computeContextMenuColors(startRestartGroup, 0), kyVar, startRestartGroup, (i3 & 1022) | ((i3 << 3) & 57344), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new yl(popupPositionProvider, iyVar, modifier2, kyVar, i, i2, 0));
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 3072) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
