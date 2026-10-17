package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.BluetoothSearchingKt;
import androidx.compose.material.icons.filled.GamepadKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class um {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final void a(final km kmVar, ky kyVar, ky kyVar2, Composer composer, int i) {
        int i2;
        ky kyVar3;
        ky kyVar4;
        Composer composer2;
        String str;
        xe0 xe0Var;
        xe0 xe0Var2;
        kmVar.getClass();
        String str2 = kmVar.f;
        String str3 = kmVar.b;
        kyVar.getClass();
        kyVar2.getClass();
        Composer startRestartGroup = composer.startRestartGroup(-1037246197);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(kmVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            kyVar3 = kyVar;
            i2 |= startRestartGroup.changedInstance(kyVar3) ? 32 : 16;
        } else {
            kyVar3 = kyVar;
        }
        if ((i & 384) == 0) {
            kyVar4 = kyVar2;
            i2 |= startRestartGroup.changedInstance(kyVar4) ? Fields.RotationX : Fields.SpotShadowColor;
        } else {
            kyVar4 = kyVar2;
        }
        if (startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1037246197, i2, -1, "com.lumi.singularity.ui.activities.ControllerCard (ControllerInfoActivity.kt:212)");
            }
            String str4 = ds0.g0(str3, "LeftHand", true) ? "left" : ds0.g0(str3, "RightHand", true) ? "right" : kmVar.a;
            boolean z = str4.equals("left") || str4.equals("right");
            switch (str2.hashCode()) {
                case 269844762:
                    str = str4;
                    if (str2.equals("SEARCHING")) {
                        startRestartGroup.startReplaceGroup(-361161807);
                        startRestartGroup.endReplaceGroup();
                        xe0Var = new xe0(Color.m4751boximpl(ColorKt.Color(4283051008L)), Color.m4751boximpl(ColorKt.Color(4294954112L)));
                        xe0Var2 = xe0Var;
                        break;
                    }
                    startRestartGroup.startReplaceGroup(-361155679);
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i3 = MaterialTheme.$stable;
                    xe0Var2 = new xe0(Color.m4751boximpl(materialTheme.getColorScheme(startRestartGroup, i3).m1749getErrorContainer0d7_KjU()), Color.m4751boximpl(materialTheme.getColorScheme(startRestartGroup, i3).m1755getOnErrorContainer0d7_KjU()));
                    startRestartGroup.endReplaceGroup();
                    break;
                case 380372252:
                    str = str4;
                    if (str2.equals("CONNECTED_ACTIVE")) {
                        startRestartGroup.startReplaceGroup(-361166351);
                        startRestartGroup.endReplaceGroup();
                        xe0Var = new xe0(Color.m4751boximpl(ColorKt.Color(4279983648L)), Color.m4751boximpl(ColorKt.Color(4289058471L)));
                        xe0Var2 = xe0Var;
                        break;
                    }
                    startRestartGroup.startReplaceGroup(-361155679);
                    MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
                    int i32 = MaterialTheme.$stable;
                    xe0Var2 = new xe0(Color.m4751boximpl(materialTheme2.getColorScheme(startRestartGroup, i32).m1749getErrorContainer0d7_KjU()), Color.m4751boximpl(materialTheme2.getColorScheme(startRestartGroup, i32).m1755getOnErrorContainer0d7_KjU()));
                    startRestartGroup.endReplaceGroup();
                    break;
                case 1851977478:
                    str = str4;
                    if (str2.equals("NOT PAIRED")) {
                        startRestartGroup.startReplaceGroup(-361159487);
                        MaterialTheme materialTheme3 = MaterialTheme.INSTANCE;
                        int i4 = MaterialTheme.$stable;
                        xe0Var2 = new xe0(Color.m4751boximpl(materialTheme3.getColorScheme(startRestartGroup, i4).m1790getSurfaceVariant0d7_KjU()), Color.m4751boximpl(materialTheme3.getColorScheme(startRestartGroup, i4).m1765getOnSurfaceVariant0d7_KjU()));
                        startRestartGroup.endReplaceGroup();
                        break;
                    }
                    startRestartGroup.startReplaceGroup(-361155679);
                    MaterialTheme materialTheme22 = MaterialTheme.INSTANCE;
                    int i322 = MaterialTheme.$stable;
                    xe0Var2 = new xe0(Color.m4751boximpl(materialTheme22.getColorScheme(startRestartGroup, i322).m1749getErrorContainer0d7_KjU()), Color.m4751boximpl(materialTheme22.getColorScheme(startRestartGroup, i322).m1755getOnErrorContainer0d7_KjU()));
                    startRestartGroup.endReplaceGroup();
                    break;
                case 2146152705:
                    if (str2.equals("CONNECTED_INACTIVE")) {
                        startRestartGroup.startReplaceGroup(-361164079);
                        startRestartGroup.endReplaceGroup();
                        str = str4;
                        xe0Var2 = new xe0(Color.m4751boximpl(ColorKt.Color(4279060385L)), Color.m4751boximpl(ColorKt.Color(4287679225L)));
                        break;
                    }
                default:
                    str = str4;
                    startRestartGroup.startReplaceGroup(-361155679);
                    MaterialTheme materialTheme222 = MaterialTheme.INSTANCE;
                    int i3222 = MaterialTheme.$stable;
                    xe0Var2 = new xe0(Color.m4751boximpl(materialTheme222.getColorScheme(startRestartGroup, i3222).m1749getErrorContainer0d7_KjU()), Color.m4751boximpl(materialTheme222.getColorScheme(startRestartGroup, i3222).m1755getOnErrorContainer0d7_KjU()));
                    startRestartGroup.endReplaceGroup();
                    break;
            }
            final long m4771unboximpl = ((Color) xe0Var2.d).m4771unboximpl();
            final long m4771unboximpl2 = ((Color) xe0Var2.e).m4771unboximpl();
            switch (str2.hashCode()) {
                case 269844762:
                    if (str2.equals("SEARCHING")) {
                        str2 = "Searching";
                        break;
                    }
                    break;
                case 380372252:
                    if (str2.equals("CONNECTED_ACTIVE")) {
                        str2 = "Active";
                        break;
                    }
                    break;
                case 1851977478:
                    if (str2.equals("NOT PAIRED")) {
                        str2 = "Unpaired";
                        break;
                    }
                    break;
                case 2146152705:
                    if (str2.equals("CONNECTED_INACTIVE")) {
                        str2 = "Inactive";
                        break;
                    }
                    break;
            }
            if (ds0.g0(str3, "LeftHand", true)) {
                str3 = "Left Controller";
            } else if (ds0.g0(str3, "RightHand", true)) {
                str3 = "Right Controller";
            }
            final String str5 = str3;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            RoundedCornerShape m1056RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(16.0f));
            CardColors m1678cardColorsro_MJ88 = CardDefaults.INSTANCE.m1678cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).m1790getSurfaceVariant0d7_KjU(), 0L, 0L, 0L, startRestartGroup, CardDefaults.$stable << 12, 14);
            final String str6 = str2;
            final ky kyVar5 = kyVar3;
            final ky kyVar6 = kyVar4;
            final boolean z2 = z;
            final String str7 = str;
            CardKt.Card(fillMaxWidth$default, m1056RoundedCornerShape0680j_4, m1678cardColorsro_MJ88, null, null, ComposableLambdaKt.rememberComposableLambda(-1828481575, true, new ny() { // from class: qm
                @Override // defpackage.ny
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    km kmVar2;
                    int i5;
                    Composer composer3 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((ColumnScope) obj).getClass();
                    if (composer3.shouldExecute((intValue & 17) != 16, intValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1828481575, intValue, -1, "com.lumi.singularity.ui.activities.ControllerCard.<anonymous> (ControllerInfoActivity.kt:250)");
                        }
                        Modifier.Companion companion = Modifier.Companion;
                        Modifier m762padding3ABfNKs = PaddingKt.m762padding3ABfNKs(companion, Dp.m7611constructorimpl(16.0f));
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.HorizontalOrVertical m647spacedBy0680j_4 = arrangement.m647spacedBy0680j_4(Dp.m7611constructorimpl(12.0f));
                        Alignment.Companion companion2 = Alignment.Companion;
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m647spacedBy0680j_4, companion2.getStart(), composer3, 6);
                        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, m762padding3ABfNKs);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                        iy constructor = companion3.getConstructor();
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
                        uo.h(companion3, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion3, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getCenterVertically(), composer3, 54);
                        int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default2);
                        iy constructor2 = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer m3878constructorimpl2 = Updater.m3878constructorimpl(composer3);
                        uo.h(companion3, m3878constructorimpl2, rowMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                        Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, k4.c(companion3, m3878constructorimpl2, Integer.valueOf(hashCode2), m3878constructorimpl2));
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m647spacedBy0680j_4(Dp.m7611constructorimpl(10.0f)), companion2.getCenterVertically(), composer3, 54);
                        int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, companion);
                        iy constructor3 = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor3);
                        } else {
                            composer3.useNode();
                        }
                        Composer m3878constructorimpl3 = Updater.m3878constructorimpl(composer3);
                        uo.h(companion3, m3878constructorimpl3, rowMeasurePolicy2, m3878constructorimpl3, currentCompositionLocalMap3);
                        Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, k4.c(companion3, m3878constructorimpl3, Integer.valueOf(hashCode3), m3878constructorimpl3));
                        Modifier clip = ClipKt.clip(SizeKt.m807size3ABfNKs(companion, Dp.m7611constructorimpl(40.0f)), RoundedCornerShapeKt.getCircleShape());
                        MaterialTheme materialTheme4 = MaterialTheme.INSTANCE;
                        int i6 = MaterialTheme.$stable;
                        Modifier m227backgroundbw27NRU$default = BackgroundKt.m227backgroundbw27NRU$default(clip, materialTheme4.getColorScheme(composer3, i6).m1773getPrimaryContainer0d7_KjU(), null, 2, null);
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                        int hashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                        CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer3, m227backgroundbw27NRU$default);
                        iy constructor4 = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor4);
                        } else {
                            composer3.useNode();
                        }
                        Composer m3878constructorimpl4 = Updater.m3878constructorimpl(composer3);
                        uo.h(companion3, m3878constructorimpl4, maybeCachedBoxMeasurePolicy, m3878constructorimpl4, currentCompositionLocalMap4);
                        Updater.m3886setimpl(m3878constructorimpl4, materializeModifier4, k4.c(companion3, m3878constructorimpl4, Integer.valueOf(hashCode4), m3878constructorimpl4));
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Icons icons = Icons.INSTANCE;
                        IconKt.m2055Iconww6aTOc(GamepadKt.getGamepad(icons.getDefault()), (String) null, SizeKt.m807size3ABfNKs(companion, Dp.m7611constructorimpl(20.0f)), materialTheme4.getColorScheme(composer3, i6).m1757getOnPrimaryContainer0d7_KjU(), composer3, 432, 0);
                        composer3.endNode();
                        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer3, 0);
                        int hashCode5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                        CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer3, companion);
                        iy constructor5 = companion3.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor5);
                        } else {
                            composer3.useNode();
                        }
                        Composer m3878constructorimpl5 = Updater.m3878constructorimpl(composer3);
                        uo.h(companion3, m3878constructorimpl5, columnMeasurePolicy2, m3878constructorimpl5, currentCompositionLocalMap5);
                        Updater.m3886setimpl(m3878constructorimpl5, materializeModifier5, k4.c(companion3, m3878constructorimpl5, Integer.valueOf(hashCode5), m3878constructorimpl5));
                        TextStyle titleMedium = materialTheme4.getTypography(composer3, i6).getTitleMedium();
                        FontWeight.Companion companion4 = FontWeight.Companion;
                        TextKt.m2607TextNvy7gAk(str5, null, 0L, null, 0L, null, companion4.getSemiBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, titleMedium, composer3, 1572864, 0, 131006);
                        Composer composer4 = composer3;
                        km kmVar3 = km.this;
                        String str8 = kmVar3.c;
                        if (str8 == null) {
                            composer4.startReplaceGroup(-196952621);
                            composer4.endReplaceGroup();
                            kmVar2 = kmVar3;
                            i5 = i6;
                        } else {
                            composer4.startReplaceGroup(-196952620);
                            kmVar2 = kmVar3;
                            i5 = i6;
                            TextKt.m2607TextNvy7gAk(str8, null, materialTheme4.getColorScheme(composer4, i6).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme4.getTypography(composer4, i6).getBodySmall(), composer4, 0, 0, 131066);
                            composer4 = composer4;
                            composer4.endReplaceGroup();
                        }
                        composer4.endNode();
                        composer4.endNode();
                        Modifier m763paddingVpY3zN4 = PaddingKt.m763paddingVpY3zN4(BackgroundKt.m227backgroundbw27NRU$default(ClipKt.clip(companion, RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(8.0f))), m4771unboximpl, null, 2, null), Dp.m7611constructorimpl(10.0f), Dp.m7611constructorimpl(4.0f));
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                        int hashCode6 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0));
                        CompositionLocalMap currentCompositionLocalMap6 = composer4.getCurrentCompositionLocalMap();
                        Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(composer4, m763paddingVpY3zN4);
                        iy constructor6 = companion3.getConstructor();
                        if (composer4.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor6);
                        } else {
                            composer4.useNode();
                        }
                        Composer m3878constructorimpl6 = Updater.m3878constructorimpl(composer4);
                        uo.h(companion3, m3878constructorimpl6, maybeCachedBoxMeasurePolicy2, m3878constructorimpl6, currentCompositionLocalMap6);
                        Updater.m3886setimpl(m3878constructorimpl6, materializeModifier6, k4.c(companion3, m3878constructorimpl6, Integer.valueOf(hashCode6), m3878constructorimpl6));
                        int i7 = i5;
                        Composer composer5 = composer4;
                        TextKt.m2607TextNvy7gAk(str6, null, m4771unboximpl2, null, 0L, null, companion4.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme4.getTypography(composer4, i7).getLabelSmall(), composer5, 1572864, 0, 131002);
                        Composer composer6 = composer5;
                        composer6.endNode();
                        composer6.endNode();
                        km kmVar4 = kmVar2;
                        boolean z3 = kmVar4.i;
                        boolean z4 = z2;
                        String str9 = str7;
                        if (z3) {
                            composer6.startReplaceGroup(-1722876213);
                            DividerKt.m1934HorizontalDivider9IZ8Weo(null, 0.0f, materialTheme4.getColorScheme(composer6, i7).m1771getOutlineVariant0d7_KjU(), composer6, 0, 3);
                            MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.m647spacedBy0680j_4(Dp.m7611constructorimpl(6.0f)), companion2.getStart(), composer6, 6);
                            int hashCode7 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0));
                            CompositionLocalMap currentCompositionLocalMap7 = composer6.getCurrentCompositionLocalMap();
                            Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(composer6, companion);
                            iy constructor7 = companion3.getConstructor();
                            if (composer6.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer6.startReusableNode();
                            if (composer6.getInserting()) {
                                composer6.createNode(constructor7);
                            } else {
                                composer6.useNode();
                            }
                            Composer m3878constructorimpl7 = Updater.m3878constructorimpl(composer6);
                            uo.h(companion3, m3878constructorimpl7, columnMeasurePolicy3, m3878constructorimpl7, currentCompositionLocalMap7);
                            Updater.m3886setimpl(m3878constructorimpl7, materializeModifier7, k4.c(companion3, m3878constructorimpl7, Integer.valueOf(hashCode7), m3878constructorimpl7));
                            String str10 = kmVar4.g;
                            if (str10 == null) {
                                composer6.startReplaceGroup(-268853674);
                            } else {
                                composer6.startReplaceGroup(-268853673);
                                String concat = str10.concat("%");
                                Integer e0 = ks0.e0(str10);
                                um.d("Battery", concat, false, e0 != null && e0.intValue() < 20, composer6, 6, 4);
                            }
                            composer6.endReplaceGroup();
                            String str11 = kmVar4.h;
                            if (str11 == null) {
                                composer6.startReplaceGroup(-268663520);
                            } else {
                                composer6.startReplaceGroup(-268663519);
                                um.d("Firmware", str11, false, false, composer6, 6, 12);
                            }
                            composer6.endReplaceGroup();
                            String str12 = kmVar4.e;
                            if (str12 == null) {
                                composer6.startReplaceGroup(-268576751);
                            } else {
                                composer6.startReplaceGroup(-268576750);
                                if (str12.equals("N/A")) {
                                    composer6.startReplaceGroup(533377546);
                                } else {
                                    composer6.startReplaceGroup(848886909);
                                    um.d("Serial", str12, false, false, composer6, 6, 12);
                                }
                                composer6.endReplaceGroup();
                            }
                            composer6.endReplaceGroup();
                            String str13 = kmVar4.d;
                            if (str13 == null) {
                                composer6.startReplaceGroup(-268478264);
                            } else {
                                composer6.startReplaceGroup(-268478263);
                                um.d("ID", str13, true, false, composer6, 390, 8);
                            }
                            composer6.endReplaceGroup();
                            composer6.endNode();
                            if (z4) {
                                composer6.startReplaceGroup(-1722161663);
                                ky kyVar7 = kyVar6;
                                boolean changed = composer6.changed(kyVar7) | composer6.changed(str9);
                                Object rememberedValue = composer6.rememberedValue();
                                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = new mm(0, str9, kyVar7);
                                    composer6.updateRememberedValue(rememberedValue);
                                }
                                Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                                RoundedCornerShape m1056RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(10.0f));
                                ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                                long m1748getError0d7_KjU = materialTheme4.getColorScheme(composer6, i7).m1748getError0d7_KjU();
                                int i8 = ButtonDefaults.$stable;
                                ButtonKt.OutlinedButton((iy) rememberedValue, fillMaxWidth$default3, false, m1056RoundedCornerShape0680j_42, buttonDefaults.m1668outlinedButtonColorsro_MJ88(0L, m1748getError0d7_KjU, 0L, 0L, composer6, i8 << 12, 13), null, BorderStroke.m250copyD5KLDUw$default(buttonDefaults.getOutlinedButtonBorder(composer6, i8), 0.0f, new SolidColor(Color.m4760copywmQWz5c$default(materialTheme4.getColorScheme(composer6, i7).m1748getError0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null), 1, null), null, null, zk.d, composer6, 805306416, 420);
                                composer6 = composer6;
                            } else {
                                composer6.startReplaceGroup(-1734739169);
                            }
                            composer6.endReplaceGroup();
                            composer6.endReplaceGroup();
                        } else {
                            composer6.startReplaceGroup(-1721151900);
                            DividerKt.m1934HorizontalDivider9IZ8Weo(null, 0.0f, materialTheme4.getColorScheme(composer6, i7).m1771getOutlineVariant0d7_KjU(), composer6, 0, 3);
                            Modifier fillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.m647spacedBy0680j_4(Dp.m7611constructorimpl(8.0f)), companion2.getCenterVertically(), composer6, 54);
                            int hashCode8 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0));
                            CompositionLocalMap currentCompositionLocalMap8 = composer6.getCurrentCompositionLocalMap();
                            Modifier materializeModifier8 = ComposedModifierKt.materializeModifier(composer6, fillMaxWidth$default4);
                            iy constructor8 = companion3.getConstructor();
                            if (composer6.getApplier() == null) {
                                ComposablesKt.invalidApplier();
                            }
                            composer6.startReusableNode();
                            if (composer6.getInserting()) {
                                composer6.createNode(constructor8);
                            } else {
                                composer6.useNode();
                            }
                            Composer m3878constructorimpl8 = Updater.m3878constructorimpl(composer6);
                            uo.h(companion3, m3878constructorimpl8, rowMeasurePolicy3, m3878constructorimpl8, currentCompositionLocalMap8);
                            Updater.m3886setimpl(m3878constructorimpl8, materializeModifier8, k4.c(companion3, m3878constructorimpl8, Integer.valueOf(hashCode8), m3878constructorimpl8));
                            IconKt.m2055Iconww6aTOc(BluetoothSearchingKt.getBluetoothSearching(icons.getDefault()), (String) null, SizeKt.m807size3ABfNKs(companion, Dp.m7611constructorimpl(16.0f)), materialTheme4.getColorScheme(composer6, i7).m1765getOnSurfaceVariant0d7_KjU(), composer6, 432, 0);
                            TextKt.m2607TextNvy7gAk("No controller paired to this slot", null, materialTheme4.getColorScheme(composer6, i7).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme4.getTypography(composer6, i7).getBodySmall(), composer6, 6, 0, 131066);
                            composer6 = composer6;
                            composer6.endNode();
                            if (z4) {
                                composer6.startReplaceGroup(-1720267253);
                                ky kyVar8 = kyVar5;
                                boolean changed2 = composer6.changed(kyVar8) | composer6.changed(str9);
                                Object rememberedValue2 = composer6.rememberedValue();
                                if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                                    rememberedValue2 = new mm(1, str9, kyVar8);
                                    composer6.updateRememberedValue(rememberedValue2);
                                }
                                ButtonKt.Button((iy) rememberedValue2, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), false, RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(10.0f)), null, null, null, null, null, zk.e, composer6, 805306416, 500);
                                composer6 = composer6;
                            } else {
                                composer6.startReplaceGroup(-1734739169);
                            }
                            composer6.endReplaceGroup();
                            composer6.endReplaceGroup();
                        }
                        composer6.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return w01.a;
                }
            }, startRestartGroup, 54), startRestartGroup, 196614, 24);
            composer2 = startRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new z5(i, 6, kmVar, kyVar, kyVar2));
        }
    }

    public static final void b(jm jmVar, iy iyVar, Composer composer, int i) {
        int i2;
        Composer composer2;
        Object g4Var;
        MutableState mutableState;
        MutableState mutableState2;
        un unVar;
        jm jmVar2 = jmVar;
        iyVar.getClass();
        Composer startRestartGroup = composer.startRestartGroup(-822368452);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(jmVar2) : startRestartGroup.changedInstance(jmVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(iyVar) ? 32 : 16;
        }
        int i3 = 1;
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-822368452, i2, -1, "com.lumi.singularity.ui.activities.ControllerInfoScreen (ControllerInfoActivity.kt:87)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = EffectsKt.createCompositionCoroutineScope(st.d, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            un unVar2 = (un) rememberedValue;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new SnackbarHostState();
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            SnackbarHostState snackbarHostState = (SnackbarHostState) rememberedValue2;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState3 = (MutableState) rememberedValue3;
            boolean changedInstance = startRestartGroup.changedInstance(unVar2);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new c9(unVar2, mutableState3, snackbarHostState, i3);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            ky kyVar = (ky) rememberedValue4;
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ut.d, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            MutableState mutableState4 = (MutableState) rememberedValue5;
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == companion.getEmpty()) {
                rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            MutableState mutableState5 = (MutableState) rememberedValue6;
            boolean changedInstance2 = ((i2 & 14) == 4 || ((i2 & 8) != 0 && startRestartGroup.changedInstance(jmVar2))) | startRestartGroup.changedInstance(unVar2);
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue7 == companion.getEmpty()) {
                mutableState = mutableState5;
                mutableState2 = mutableState4;
                g4Var = new g4(unVar2, jmVar2, mutableState, mutableState2, null, 1);
                unVar = unVar2;
                startRestartGroup.updateRememberedValue(g4Var);
            } else {
                unVar = unVar2;
                g4Var = rememberedValue7;
                mutableState = mutableState5;
                mutableState2 = mutableState4;
            }
            EffectsKt.LaunchedEffect(w01.a, (my) g4Var, startRestartGroup, 6);
            MutableState mutableState6 = mutableState2;
            MutableState mutableState7 = mutableState;
            jmVar2 = jmVar;
            composer2 = startRestartGroup;
            ScaffoldKt.m2300ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(-344171264, true, new om(iyVar, unVar, jmVar, mutableState7, mutableState6), startRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(82383234, true, new h8(snackbarHostState, i3), startRestartGroup, 54), null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-1237945717, true, new d9(jmVar2, unVar, kyVar, mutableState7, mutableState6), startRestartGroup, 54), composer2, 805309488, 501);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new q6(jmVar2, iyVar, i, 10));
        }
    }

    public static final void c(un unVar, jm jmVar, MutableState mutableState, MutableState mutableState2) {
        p01.t(unVar, null, null, new o3(jmVar, mutableState, mutableState2, (hm) null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final String str, final String str2, boolean z, boolean z2, Composer composer, final int i, final int i2) {
        int i3;
        String str3;
        boolean z3;
        int i4;
        boolean z4;
        Composer composer2;
        final boolean z5;
        final boolean z6;
        ScopeUpdateScope endRestartGroup;
        long m1764getOnSurface0d7_KjU;
        Composer startRestartGroup = composer.startRestartGroup(1698276491);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            str3 = str2;
            i3 |= startRestartGroup.changed(str3) ? 32 : 16;
        } else {
            str3 = str2;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            z3 = z;
            i3 |= startRestartGroup.changed(z3) ? Fields.RotationX : Fields.SpotShadowColor;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z4 = z2;
                i3 |= startRestartGroup.changed(z4) ? Fields.CameraDistance : Fields.RotationZ;
                if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    boolean z7 = i5 != 0 ? false : z3;
                    boolean z8 = i4 != 0 ? false : z4;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1698276491, i3, -1, "com.lumi.singularity.ui.activities.InfoRow (ControllerInfoActivity.kt:379)");
                    }
                    Modifier.Companion companion = Modifier.Companion;
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.Companion.getCenterVertically(), startRestartGroup, 54);
                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                    iy constructor = companion2.getConstructor();
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
                    uo.h(companion2, m3878constructorimpl, rowMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion2, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i6 = MaterialTheme.$stable;
                    TextKt.m2607TextNvy7gAk(str, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), materialTheme.getColorScheme(startRestartGroup, i6).m1765getOnSurfaceVariant0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, materialTheme.getTypography(startRestartGroup, i6).getBodySmall(), startRestartGroup, i3 & 14, 0, 131064);
                    TextStyle bodySmall = materialTheme.getTypography(startRestartGroup, i6).getBodySmall();
                    GenericFontFamily monospace = z7 ? FontFamily.Companion.getMonospace() : null;
                    FontWeight.Companion companion3 = FontWeight.Companion;
                    FontWeight bold = z8 ? companion3.getBold() : companion3.getNormal();
                    if (z8) {
                        startRestartGroup.startReplaceGroup(-585567892);
                        m1764getOnSurface0d7_KjU = materialTheme.getColorScheme(startRestartGroup, i6).m1748getError0d7_KjU();
                    } else {
                        startRestartGroup.startReplaceGroup(-585566704);
                        m1764getOnSurface0d7_KjU = materialTheme.getColorScheme(startRestartGroup, i6).m1764getOnSurface0d7_KjU();
                    }
                    startRestartGroup.endReplaceGroup();
                    composer2 = startRestartGroup;
                    TextKt.m2607TextNvy7gAk(str3, null, m1764getOnSurface0d7_KjU, null, TextUnitKt.getSp(z7 ? 11 : 13), null, bold, monospace, 0L, null, null, 0L, 0, false, 0, 0, null, bodySmall, composer2, (i3 >> 3) & 14, 0, 130858);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z7;
                    z6 = z8;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    z5 = z3;
                    z6 = z4;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new my() { // from class: nm
                        @Override // defpackage.my
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            um.d(str, str2, z5, z6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            return w01.a;
                        }
                    });
                    return;
                }
                return;
            }
            z4 = z2;
            if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z3 = z;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z4 = z2;
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
