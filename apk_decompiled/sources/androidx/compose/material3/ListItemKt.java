package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.ListItemKt;
import androidx.compose.material3.ListItemType;
import androidx.compose.material3.internal.LayoutUtilKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import defpackage.hz;
import defpackage.iy;
import defpackage.k4;
import defpackage.ky;
import defpackage.lk;
import defpackage.my;
import defpackage.p50;
import defpackage.q10;
import defpackage.q50;
import defpackage.w01;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ListItemKt {
    private static final float ListItemVerticalPadding = Dp.m7611constructorimpl(8.0f);
    private static final float ListItemThreeLineVerticalPadding = Dp.m7611constructorimpl(12.0f);
    private static final float ListItemStartPadding = Dp.m7611constructorimpl(16.0f);
    private static final float ListItemEndPadding = Dp.m7611constructorimpl(16.0f);
    private static final float LeadingContentEndPadding = Dp.m7611constructorimpl(16.0f);
    private static final float TrailingContentStartPadding = Dp.m7611constructorimpl(16.0f);

    /* JADX WARN: Removed duplicated region for block: B:103:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01cf  */
    /* renamed from: ListItem-HXNGIdc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2107ListItemHXNGIdc(final my myVar, Modifier modifier, my myVar2, my myVar3, my myVar4, my myVar5, ListItemColors listItemColors, float f, float f2, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final my myVar6;
        int i5;
        final my myVar7;
        int i6;
        my myVar8;
        int i7;
        my myVar9;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Composer composer2;
        float f3;
        Modifier modifier3;
        my myVar10;
        my myVar11;
        my myVar12;
        final my myVar13;
        ListItemColors listItemColors2;
        float f4;
        ScopeUpdateScope endRestartGroup;
        ListItemColors listItemColors3;
        int i13;
        float f5;
        int i14;
        float f6;
        final ListItemColors listItemColors4;
        final my myVar14;
        ComposableLambda rememberComposableLambda;
        ComposableLambda rememberComposableLambda2;
        my myVar15;
        ComposableLambda rememberComposableLambda3;
        final ComposableLambda composableLambda;
        Object rememberedValue;
        Composer startRestartGroup = composer.startRestartGroup(487133126);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(myVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i15 = i2 & 2;
        if (i15 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                myVar6 = myVar2;
                i3 |= startRestartGroup.changedInstance(myVar6) ? Fields.RotationX : Fields.SpotShadowColor;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    myVar7 = myVar3;
                    i3 |= startRestartGroup.changedInstance(myVar7) ? Fields.CameraDistance : Fields.RotationZ;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        myVar8 = myVar4;
                        i3 |= startRestartGroup.changedInstance(myVar8) ? Fields.Clip : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= 196608;
                        } else if ((196608 & i) == 0) {
                            myVar9 = myVar5;
                            i3 |= startRestartGroup.changedInstance(myVar9) ? Fields.RenderEffect : 65536;
                            if ((i & 1572864) == 0) {
                                i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(listItemColors)) ? 1048576 : Fields.BlendMode;
                            }
                            i8 = i2 & Fields.SpotShadowColor;
                            if (i8 == 0) {
                                i3 |= 12582912;
                            } else if ((i & 12582912) == 0) {
                                i9 = i8;
                                i3 |= startRestartGroup.changed(f) ? GroupFlagsKt.IsNodeFlag : 4194304;
                                i10 = i2 & Fields.RotationX;
                                if (i10 != 0) {
                                    i3 |= 100663296;
                                } else if ((i & 100663296) == 0) {
                                    i11 = i10;
                                    i3 |= startRestartGroup.changed(f2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                                    i12 = i3;
                                    if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i12 & 1)) {
                                        composer2 = startRestartGroup;
                                        composer2.skipToGroupEnd();
                                        f3 = f;
                                        modifier3 = modifier2;
                                        myVar10 = myVar6;
                                        myVar11 = myVar7;
                                        myVar12 = myVar8;
                                        myVar13 = myVar9;
                                        listItemColors2 = listItemColors;
                                        f4 = f2;
                                    } else {
                                        startRestartGroup.startDefaults();
                                        ComposableLambda composableLambda2 = null;
                                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                            if (i15 != 0) {
                                                modifier2 = Modifier.Companion;
                                            }
                                            if (i4 != 0) {
                                                myVar6 = null;
                                            }
                                            if (i5 != 0) {
                                                myVar7 = null;
                                            }
                                            if (i6 != 0) {
                                                myVar8 = null;
                                            }
                                            if (i7 != 0) {
                                                myVar9 = null;
                                            }
                                            if ((i2 & 64) != 0) {
                                                listItemColors3 = ListItemDefaults.INSTANCE.colors(startRestartGroup, 6);
                                                i13 = i12 & (-3670017);
                                            } else {
                                                listItemColors3 = listItemColors;
                                                i13 = i12;
                                            }
                                            float m2106getElevationD9Ej5fM = i9 != 0 ? ListItemDefaults.INSTANCE.m2106getElevationD9Ej5fM() : f;
                                            if (i11 != 0) {
                                                f6 = m2106getElevationD9Ej5fM;
                                                f5 = ListItemDefaults.INSTANCE.m2106getElevationD9Ej5fM();
                                                listItemColors4 = listItemColors3;
                                                i14 = i13;
                                            } else {
                                                f5 = f2;
                                                i14 = i13;
                                                f6 = m2106getElevationD9Ej5fM;
                                                myVar13 = myVar9;
                                                listItemColors4 = listItemColors3;
                                                myVar14 = myVar8;
                                                startRestartGroup.endDefaults();
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(487133126, i14, -1, "androidx.compose.material3.ListItem (ListItem.kt:104)");
                                                }
                                                final ComposableLambda rememberComposableLambda4 = ComposableLambdaKt.rememberComposableLambda(629852750, true, new my() { // from class: androidx.compose.material3.ListItemKt$ListItem$decoratedHeadlineContent$1
                                                    public final void invoke(Composer composer3, int i16) {
                                                        if (!composer3.shouldExecute((i16 & 3) != 2, i16 & 1)) {
                                                            composer3.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(629852750, i16, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:106)");
                                                        }
                                                        ListItemKt.m2108ProvideTextStyleFromToken3JVO9M(ListItemColors.this.m2100headlineColorvNxB06k$material3(true), ListTokens.INSTANCE.getListItemLabelTextFont(), myVar, composer3, 48);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }

                                                    @Override // defpackage.my
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                                        return w01.a;
                                                    }
                                                }, startRestartGroup, 54);
                                                if (myVar7 != null) {
                                                    startRestartGroup.startReplaceGroup(-510713870);
                                                    startRestartGroup.endReplaceGroup();
                                                    rememberComposableLambda = null;
                                                } else {
                                                    startRestartGroup.startReplaceGroup(-510713869);
                                                    rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1291211644, true, new my() { // from class: androidx.compose.material3.ListItemKt$ListItem$decoratedSupportingContent$1$1
                                                        public final void invoke(Composer composer3, int i16) {
                                                            if (!composer3.shouldExecute((i16 & 3) != 2, i16 & 1)) {
                                                                composer3.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-1291211644, i16, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:115)");
                                                            }
                                                            ListItemKt.m2108ProvideTextStyleFromToken3JVO9M(ListItemColors.this.m2103supportingColor0d7_KjU$material3(), ListTokens.INSTANCE.getListItemSupportingTextFont(), myVar7, composer3, 48);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }

                                                        @Override // defpackage.my
                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                            invoke((Composer) obj, ((Number) obj2).intValue());
                                                            return w01.a;
                                                        }
                                                    }, startRestartGroup, 54);
                                                    startRestartGroup.endReplaceGroup();
                                                }
                                                if (myVar6 != null) {
                                                    startRestartGroup.startReplaceGroup(-510395686);
                                                    startRestartGroup.endReplaceGroup();
                                                    rememberComposableLambda2 = null;
                                                } else {
                                                    startRestartGroup.startReplaceGroup(-510395685);
                                                    rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(372414991, true, new my() { // from class: androidx.compose.material3.ListItemKt$ListItem$decoratedOverlineContent$1$1
                                                        public final void invoke(Composer composer3, int i16) {
                                                            if (!composer3.shouldExecute((i16 & 3) != 2, i16 & 1)) {
                                                                composer3.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(372414991, i16, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:125)");
                                                            }
                                                            ListItemKt.m2108ProvideTextStyleFromToken3JVO9M(ListItemColors.this.m2102overlineColor0d7_KjU$material3(), ListTokens.INSTANCE.getListItemOverlineFont(), myVar6, composer3, 48);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }

                                                        @Override // defpackage.my
                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                            invoke((Composer) obj, ((Number) obj2).intValue());
                                                            return w01.a;
                                                        }
                                                    }, startRestartGroup, 54);
                                                    startRestartGroup.endReplaceGroup();
                                                }
                                                if (myVar14 != null) {
                                                    startRestartGroup.startReplaceGroup(-510083888);
                                                    startRestartGroup.endReplaceGroup();
                                                    myVar15 = myVar14;
                                                    rememberComposableLambda3 = null;
                                                } else {
                                                    startRestartGroup.startReplaceGroup(-510083887);
                                                    myVar15 = myVar14;
                                                    rememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(449548451, true, new my() { // from class: androidx.compose.material3.ListItemKt$ListItem$decoratedLeadingContent$1$1
                                                        public final void invoke(Composer composer3, int i16) {
                                                            if (!composer3.shouldExecute((i16 & 3) != 2, i16 & 1)) {
                                                                composer3.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(449548451, i16, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:135)");
                                                            }
                                                            Modifier m766paddingqDBjuR0$default = PaddingKt.m766paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, ListItemKt.getLeadingContentEndPadding(), 0.0f, 11, null);
                                                            ListItemColors listItemColors5 = ListItemColors.this;
                                                            my myVar16 = myVar14;
                                                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, m766paddingqDBjuR0$default);
                                                            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                                                            iy constructor = companion.getConstructor();
                                                            if (composer3.getApplier() == null) {
                                                                ComposablesKt.invalidApplier();
                                                            }
                                                            composer3.startReusableNode();
                                                            if (composer3.getInserting()) {
                                                                composer3.createNode(constructor);
                                                            } else {
                                                                composer3.useNode();
                                                            }
                                                            Composer m3878constructorimpl = Updater.m3878constructorimpl(composer3);
                                                            my b = k4.b(companion, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                                                            if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                                                            }
                                                            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
                                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(listItemColors5.m2101leadingIconColorvNxB06k$material3(true))), myVar16, composer3, ProvidedValue.$stable);
                                                            composer3.endNode();
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }

                                                        @Override // defpackage.my
                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                            invoke((Composer) obj, ((Number) obj2).intValue());
                                                            return w01.a;
                                                        }
                                                    }, startRestartGroup, 54);
                                                    startRestartGroup.endReplaceGroup();
                                                }
                                                if (myVar13 != null) {
                                                    startRestartGroup.startReplaceGroup(-509666659);
                                                    startRestartGroup.endReplaceGroup();
                                                    composableLambda = rememberComposableLambda3;
                                                } else {
                                                    startRestartGroup.startReplaceGroup(-509666658);
                                                    composableLambda = rememberComposableLambda3;
                                                    composableLambda2 = ComposableLambdaKt.rememberComposableLambda(1946411067, true, new my() { // from class: androidx.compose.material3.ListItemKt$ListItem$decoratedTrailingContent$1$1
                                                        public final void invoke(Composer composer3, int i16) {
                                                            if (!composer3.shouldExecute((i16 & 3) != 2, i16 & 1)) {
                                                                composer3.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(1946411067, i16, -1, "androidx.compose.material3.ListItem.<anonymous>.<anonymous> (ListItem.kt:146)");
                                                            }
                                                            Modifier m766paddingqDBjuR0$default = PaddingKt.m766paddingqDBjuR0$default(Modifier.Companion, ListItemKt.getTrailingContentStartPadding(), 0.0f, 0.0f, 0.0f, 14, null);
                                                            ListItemColors listItemColors5 = ListItemColors.this;
                                                            my myVar16 = myVar13;
                                                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, m766paddingqDBjuR0$default);
                                                            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                                                            iy constructor = companion.getConstructor();
                                                            if (composer3.getApplier() == null) {
                                                                ComposablesKt.invalidApplier();
                                                            }
                                                            composer3.startReusableNode();
                                                            if (composer3.getInserting()) {
                                                                composer3.createNode(constructor);
                                                            } else {
                                                                composer3.useNode();
                                                            }
                                                            Composer m3878constructorimpl = Updater.m3878constructorimpl(composer3);
                                                            my b = k4.b(companion, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                                                            if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                                                            }
                                                            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
                                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                            ListItemKt.m2108ProvideTextStyleFromToken3JVO9M(listItemColors5.m2104trailingIconColorvNxB06k$material3(true), ListTokens.INSTANCE.getListItemTrailingSupportingTextFont(), myVar16, composer3, 48);
                                                            composer3.endNode();
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }

                                                        @Override // defpackage.my
                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                            invoke((Composer) obj, ((Number) obj2).intValue());
                                                            return w01.a;
                                                        }
                                                    }, startRestartGroup, 54);
                                                    startRestartGroup.endReplaceGroup();
                                                }
                                                Modifier.Companion companion = Modifier.Companion;
                                                rememberedValue = startRestartGroup.rememberedValue();
                                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                                    rememberedValue = new hz(21);
                                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                                }
                                                final ComposableLambda composableLambda3 = rememberComposableLambda2;
                                                final ComposableLambda composableLambda4 = rememberComposableLambda;
                                                final ComposableLambda composableLambda5 = composableLambda2;
                                                int i16 = i14 >> 9;
                                                composer2 = startRestartGroup;
                                                SurfaceKt.m2464SurfaceT9BRK9s(SemanticsModifierKt.semantics(companion, true, (ky) rememberedValue).then(modifier2), ListItemDefaults.INSTANCE.getShape(startRestartGroup, 6), listItemColors4.m2089containerColor0d7_KjU$material3(), listItemColors4.m2100headlineColorvNxB06k$material3(true), f6, f5, null, ComposableLambdaKt.rememberComposableLambda(1192488737, true, new my() { // from class: androidx.compose.material3.ListItemKt$ListItem$2
                                                    public final void invoke(Composer composer3, int i17) {
                                                        if (!composer3.shouldExecute((i17 & 3) != 2, i17 & 1)) {
                                                            composer3.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1192488737, i17, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:164)");
                                                        }
                                                        ListItemKt.ListItemLayout(my.this, composableLambda5, rememberComposableLambda4, composableLambda3, composableLambda4, composer3, 384);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }

                                                    @Override // defpackage.my
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                                        return w01.a;
                                                    }
                                                }, startRestartGroup, 54), composer2, (57344 & i16) | 12582912 | (i16 & 458752), 64);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                                modifier3 = modifier2;
                                                myVar10 = myVar6;
                                                listItemColors2 = listItemColors4;
                                                myVar11 = myVar7;
                                                f3 = f6;
                                                f4 = f5;
                                                myVar12 = myVar15;
                                            }
                                        } else {
                                            startRestartGroup.skipToGroupEnd();
                                            if ((i2 & 64) != 0) {
                                                listItemColors4 = listItemColors;
                                                f6 = f;
                                                f5 = f2;
                                                i14 = i12 & (-3670017);
                                            } else {
                                                listItemColors4 = listItemColors;
                                                f6 = f;
                                                f5 = f2;
                                                i14 = i12;
                                            }
                                        }
                                        myVar14 = myVar8;
                                        myVar13 = myVar9;
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        final my rememberComposableLambda42 = ComposableLambdaKt.rememberComposableLambda(629852750, true, new my() { // from class: androidx.compose.material3.ListItemKt$ListItem$decoratedHeadlineContent$1
                                            public final void invoke(Composer composer3, int i162) {
                                                if (!composer3.shouldExecute((i162 & 3) != 2, i162 & 1)) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(629852750, i162, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:106)");
                                                }
                                                ListItemKt.m2108ProvideTextStyleFromToken3JVO9M(ListItemColors.this.m2100headlineColorvNxB06k$material3(true), ListTokens.INSTANCE.getListItemLabelTextFont(), myVar, composer3, 48);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }

                                            @Override // defpackage.my
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                invoke((Composer) obj, ((Number) obj2).intValue());
                                                return w01.a;
                                            }
                                        }, startRestartGroup, 54);
                                        if (myVar7 != null) {
                                        }
                                        if (myVar6 != null) {
                                        }
                                        if (myVar14 != null) {
                                        }
                                        if (myVar13 != null) {
                                        }
                                        Modifier.Companion companion2 = Modifier.Companion;
                                        rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.Companion.getEmpty()) {
                                        }
                                        final my composableLambda32 = rememberComposableLambda2;
                                        final my composableLambda42 = rememberComposableLambda;
                                        final my composableLambda52 = composableLambda2;
                                        int i162 = i14 >> 9;
                                        composer2 = startRestartGroup;
                                        SurfaceKt.m2464SurfaceT9BRK9s(SemanticsModifierKt.semantics(companion2, true, (ky) rememberedValue).then(modifier2), ListItemDefaults.INSTANCE.getShape(startRestartGroup, 6), listItemColors4.m2089containerColor0d7_KjU$material3(), listItemColors4.m2100headlineColorvNxB06k$material3(true), f6, f5, null, ComposableLambdaKt.rememberComposableLambda(1192488737, true, new my() { // from class: androidx.compose.material3.ListItemKt$ListItem$2
                                            public final void invoke(Composer composer3, int i17) {
                                                if (!composer3.shouldExecute((i17 & 3) != 2, i17 & 1)) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1192488737, i17, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:164)");
                                                }
                                                ListItemKt.ListItemLayout(my.this, composableLambda52, rememberComposableLambda42, composableLambda32, composableLambda42, composer3, 384);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }

                                            @Override // defpackage.my
                                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                invoke((Composer) obj, ((Number) obj2).intValue());
                                                return w01.a;
                                            }
                                        }, startRestartGroup, 54), composer2, (57344 & i162) | 12582912 | (i162 & 458752), 64);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        modifier3 = modifier2;
                                        myVar10 = myVar6;
                                        listItemColors2 = listItemColors4;
                                        myVar11 = myVar7;
                                        f3 = f6;
                                        f4 = f5;
                                        myVar12 = myVar15;
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup == null) {
                                        endRestartGroup.updateScope(new p50(myVar, modifier3, myVar10, myVar11, myVar12, myVar13, listItemColors2, f3, f4, i, i2));
                                        return;
                                    }
                                    return;
                                }
                                i11 = i10;
                                i12 = i3;
                                if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i12 & 1)) {
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            i9 = i8;
                            i10 = i2 & Fields.RotationX;
                            if (i10 != 0) {
                            }
                            i11 = i10;
                            i12 = i3;
                            if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i12 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        myVar9 = myVar5;
                        if ((i & 1572864) == 0) {
                        }
                        i8 = i2 & Fields.SpotShadowColor;
                        if (i8 == 0) {
                        }
                        i9 = i8;
                        i10 = i2 & Fields.RotationX;
                        if (i10 != 0) {
                        }
                        i11 = i10;
                        i12 = i3;
                        if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i12 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    myVar8 = myVar4;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    myVar9 = myVar5;
                    if ((i & 1572864) == 0) {
                    }
                    i8 = i2 & Fields.SpotShadowColor;
                    if (i8 == 0) {
                    }
                    i9 = i8;
                    i10 = i2 & Fields.RotationX;
                    if (i10 != 0) {
                    }
                    i11 = i10;
                    i12 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i12 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                myVar7 = myVar3;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                myVar8 = myVar4;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                myVar9 = myVar5;
                if ((i & 1572864) == 0) {
                }
                i8 = i2 & Fields.SpotShadowColor;
                if (i8 == 0) {
                }
                i9 = i8;
                i10 = i2 & Fields.RotationX;
                if (i10 != 0) {
                }
                i11 = i10;
                i12 = i3;
                if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i12 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            myVar6 = myVar2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            myVar7 = myVar3;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            myVar8 = myVar4;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            myVar9 = myVar5;
            if ((i & 1572864) == 0) {
            }
            i8 = i2 & Fields.SpotShadowColor;
            if (i8 == 0) {
            }
            i9 = i8;
            i10 = i2 & Fields.RotationX;
            if (i10 != 0) {
            }
            i11 = i10;
            i12 = i3;
            if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i12 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        myVar6 = myVar2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        myVar7 = myVar3;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        myVar8 = myVar4;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        myVar9 = myVar5;
        if ((i & 1572864) == 0) {
        }
        i8 = i2 & Fields.SpotShadowColor;
        if (i8 == 0) {
        }
        i9 = i8;
        i10 = i2 & Fields.RotationX;
        if (i10 != 0) {
        }
        i11 = i10;
        i12 = i3;
        if (startRestartGroup.shouldExecute((i3 & 38347923) == 38347922, i12 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ListItemLayout(my myVar, my myVar2, my myVar3, my myVar4, my myVar5, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-61277522);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(myVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar3) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar4) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar5) ? Fields.Clip : 8192;
        }
        if (startRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-61277522, i2, -1, "androidx.compose.material3.ListItemLayout (ListItem.kt:181)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new ListItemMeasurePolicy();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ListItemMeasurePolicy listItemMeasurePolicy = (ListItemMeasurePolicy) rememberedValue;
            List E = y80.E(myVar3, myVar4 == null ? ComposableSingletons$ListItemKt.INSTANCE.m1832getLambda$489887388$material3() : myVar4, myVar5 == null ? ComposableSingletons$ListItemKt.INSTANCE.getLambda$1629163587$material3() : myVar5, myVar == null ? ComposableSingletons$ListItemKt.INSTANCE.m1833getLambda$546752734$material3() : myVar, myVar2 == null ? ComposableSingletons$ListItemKt.INSTANCE.getLambda$1572298241$material3() : myVar2);
            Modifier.Companion companion2 = Modifier.Companion;
            my combineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(E);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = MultiContentMeasurePolicyKt.createMeasurePolicy(listItemMeasurePolicy);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue2;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            iy constructor = companion3.getConstructor();
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
            my b = k4.b(companion3, m3878constructorimpl, measurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
            }
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion3.getSetModifier());
            combineAsVirtualLayouts.invoke(startRestartGroup, 0);
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new lk(myVar, myVar2, myVar3, myVar4, myVar5, i, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ListItemLayout$lambda$8(my myVar, my myVar2, my myVar3, my myVar4, my myVar5, int i, Composer composer, int i2) {
        ListItemLayout(myVar, myVar2, myVar3, myVar4, myVar5, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ListItem_HXNGIdc$lambda$5$lambda$4(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ListItem_HXNGIdc$lambda$6(my myVar, Modifier modifier, my myVar2, my myVar3, my myVar4, my myVar5, ListItemColors listItemColors, float f, float f2, int i, int i2, Composer composer, int i3) {
        m2107ListItemHXNGIdc(myVar, modifier, myVar2, myVar3, myVar4, myVar5, listItemColors, f, f2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ProvideTextStyleFromToken-3J-VO9M, reason: not valid java name */
    public static final void m2108ProvideTextStyleFromToken3JVO9M(long j, TypographyKeyTokens typographyKeyTokens, my myVar, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-285397024);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(typographyKeyTokens.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-285397024, i2, -1, "androidx.compose.material3.ProvideTextStyleFromToken (ListItem.kt:703)");
            }
            ProvideContentColorTextStyleKt.m2902ProvideContentColorTextStyle3JVO9M(j, TypographyKt.getValue(typographyKeyTokens, startRestartGroup, (i2 >> 3) & 14), myVar, startRestartGroup, i2 & 910);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new q50(j, typographyKeyTokens, myVar, i, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ProvideTextStyleFromToken_3J_VO9M$lambda$12(long j, TypographyKeyTokens typographyKeyTokens, my myVar, int i, Composer composer, int i2) {
        m2108ProvideTextStyleFromToken3JVO9M(j, typographyKeyTokens, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-N4Jib3Y, reason: not valid java name */
    public static final int m2113calculateHeightN4Jib3Y(IntrinsicMeasureScope intrinsicMeasureScope, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        ListItemType.Companion companion = ListItemType.Companion;
        int max = Math.max(Math.max(Constraints.m7565getMinHeightimpl(j), intrinsicMeasureScope.mo361roundToPx0680j_4(ListItemType.m2120equalsimpl0(i6, companion.m2125getOneLineAlXitO8()) ? ListTokens.INSTANCE.m3409getListItemOneLineContainerHeightD9Ej5fM() : ListItemType.m2120equalsimpl0(i6, companion.m2127getTwoLineAlXitO8()) ? ListTokens.INSTANCE.m3414getListItemTwoLineContainerHeightD9Ej5fM() : ListTokens.INSTANCE.m3411getListItemThreeLineContainerHeightD9Ej5fM())), Math.max(i, Math.max(i3 + i4 + i5, i2)) + i7);
        int m7563getMaxHeightimpl = Constraints.m7563getMaxHeightimpl(j);
        return max > m7563getMaxHeightimpl ? m7563getMaxHeightimpl : max;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-yeHjK3Y, reason: not valid java name */
    public static final int m2114calculateWidthyeHjK3Y(IntrinsicMeasureScope intrinsicMeasureScope, int i, int i2, int i3, int i4, int i5, int i6, long j) {
        if (Constraints.m7560getHasBoundedWidthimpl(j)) {
            return Constraints.m7564getMaxWidthimpl(j);
        }
        return i6 + i + Math.max(i3, Math.max(i4, i5)) + i2;
    }

    public static final float getLeadingContentEndPadding() {
        return LeadingContentEndPadding;
    }

    public static final float getListItemEndPadding() {
        return ListItemEndPadding;
    }

    public static final float getListItemStartPadding() {
        return ListItemStartPadding;
    }

    public static final float getListItemThreeLineVerticalPadding() {
        return ListItemThreeLineVerticalPadding;
    }

    public static final float getListItemVerticalPadding() {
        return ListItemVerticalPadding;
    }

    public static final float getTrailingContentStartPadding() {
        return TrailingContentStartPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSupportingMultilineHeuristic(Density density, int i) {
        return i > density.mo360roundToPxR2X_6o(TextUnitKt.getSp(30));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult place(MeasureScope measureScope, final int i, final int i2, final Placeable placeable, final Placeable placeable2, final Placeable placeable3, final Placeable placeable4, final Placeable placeable5, final boolean z, final int i3, final int i4, final int i5) {
        return MeasureScope.layout$default(measureScope, i, i2, null, new ky() { // from class: o50
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 place$lambda$11;
                place$lambda$11 = ListItemKt.place$lambda$11(Placeable.this, i3, z, i5, placeable3, placeable4, placeable5, i2, placeable2, i, i4, (Placeable.PlacementScope) obj);
                return place$lambda$11;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 place$lambda$11(Placeable placeable, int i, boolean z, int i2, Placeable placeable2, Placeable placeable3, Placeable placeable4, int i3, Placeable placeable5, int i4, int i5, Placeable.PlacementScope placementScope) {
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, i, z ? i2 : Alignment.Companion.getCenterVertically().align(placeable.getHeight(), i3), 0.0f, 4, null);
        }
        int widthOrZero = LayoutUtilKt.getWidthOrZero(placeable) + i;
        int align = z ? i2 : Alignment.Companion.getCenterVertically().align(LayoutUtilKt.getHeightOrZero(placeable4) + LayoutUtilKt.getHeightOrZero(placeable3) + LayoutUtilKt.getHeightOrZero(placeable2), i3);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, widthOrZero, align, 0.0f, 4, null);
        }
        int heightOrZero = align + LayoutUtilKt.getHeightOrZero(placeable3);
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, widthOrZero, heightOrZero, 0.0f, 4, null);
        }
        int heightOrZero2 = heightOrZero + LayoutUtilKt.getHeightOrZero(placeable2);
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, widthOrZero, heightOrZero2, 0.0f, 4, null);
        }
        if (placeable5 != null) {
            int width = (i4 - i5) - placeable5.getWidth();
            if (!z) {
                i2 = Alignment.Companion.getCenterVertically().align(placeable5.getHeight(), i3);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, width, i2, 0.0f, 4, null);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: verticalPadding-yh95HIg, reason: not valid java name */
    public static final float m2115verticalPaddingyh95HIg(int i) {
        return ListItemType.m2120equalsimpl0(i, ListItemType.Companion.m2126getThreeLineAlXitO8()) ? ListItemThreeLineVerticalPadding : ListItemVerticalPadding;
    }

    public static /* synthetic */ void getLeadingContentEndPadding$annotations() {
    }

    public static /* synthetic */ void getListItemEndPadding$annotations() {
    }

    public static /* synthetic */ void getListItemStartPadding$annotations() {
    }

    public static /* synthetic */ void getListItemThreeLineVerticalPadding$annotations() {
    }

    public static /* synthetic */ void getListItemVerticalPadding$annotations() {
    }

    public static /* synthetic */ void getTrailingContentStartPadding$annotations() {
    }
}
