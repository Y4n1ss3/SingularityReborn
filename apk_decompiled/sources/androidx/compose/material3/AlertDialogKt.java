package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.AlertDialogKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.DialogProperties;
import defpackage.dq;
import defpackage.er;
import defpackage.fc;
import defpackage.iy;
import defpackage.k4;
import defpackage.m4;
import defpackage.my;
import defpackage.q10;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AlertDialogKt {
    private static final float DialogMinWidth = Dp.m7611constructorimpl(280.0f);
    private static final float DialogMaxWidth = Dp.m7611constructorimpl(560.0f);
    private static final float ButtonsMainAxisSpacing = Dp.m7611constructorimpl(8.0f);
    private static final float ButtonsCrossAxisSpacing = Dp.m7611constructorimpl(12.0f);
    private static final PaddingValues DialogPadding = PaddingKt.m755PaddingValues0680j_4(Dp.m7611constructorimpl(24.0f));
    private static final PaddingValues IconPadding = PaddingKt.m759PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m7611constructorimpl(16.0f), 7, null);
    private static final PaddingValues TitlePadding = PaddingKt.m759PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m7611constructorimpl(16.0f), 7, null);
    private static final PaddingValues TextPadding = PaddingKt.m759PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m7611constructorimpl(24.0f), 7, null);
    private static final ProvidableCompositionLocal<BasicAlertDialogOverride> LocalBasicAlertDialogOverride = CompositionLocalKt.compositionLocalOf$default(null, new defpackage.e1(1), 1, null);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x004d  */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AlertDialog(iy iyVar, Modifier modifier, DialogProperties dialogProperties, my myVar, Composer composer, int i, int i2) {
        iy iyVar2;
        int i3;
        Modifier modifier2;
        int i4;
        my myVar2;
        DialogProperties dialogProperties2;
        Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(402506956);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            iyVar2 = iyVar;
        } else if ((i & 6) == 0) {
            iyVar2 = iyVar;
            i3 = (startRestartGroup.changedInstance(iyVar2) ? 4 : 2) | i;
        } else {
            iyVar2 = iyVar;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= startRestartGroup.changed(dialogProperties) ? Fields.RotationX : Fields.SpotShadowColor;
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                    myVar2 = myVar;
                } else {
                    myVar2 = myVar;
                    if ((i & 3072) == 0) {
                        i3 |= startRestartGroup.changedInstance(myVar2) ? Fields.CameraDistance : Fields.RotationZ;
                    }
                }
                if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    Modifier modifier4 = i5 != 0 ? Modifier.Companion : modifier2;
                    DialogProperties dialogProperties3 = i4 != 0 ? new DialogProperties(false, false, false, 7, (dq) null) : dialogProperties;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(402506956, i3, -1, "androidx.compose.material3.AlertDialog (AlertDialog.kt:215)");
                    }
                    BasicAlertDialog(iyVar2, modifier4, dialogProperties3, myVar2, startRestartGroup, i3 & 8190, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    dialogProperties2 = dialogProperties3;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    dialogProperties2 = dialogProperties;
                    modifier3 = modifier2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new m4(iyVar, modifier3, dialogProperties2, myVar, i, i2, 0));
                    return;
                }
                return;
            }
            if ((i2 & 8) != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 AlertDialog$lambda$2(iy iyVar, Modifier modifier, DialogProperties dialogProperties, my myVar, int i, int i2, Composer composer, int i3) {
        AlertDialog(iyVar, modifier, dialogProperties, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00de  */
    /* renamed from: AlertDialogContent-4hvqGtA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1593AlertDialogContent4hvqGtA(final my myVar, Modifier modifier, final my myVar2, final my myVar3, final my myVar4, final Shape shape, final long j, final float f, final long j2, final long j3, final long j4, final long j5, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        final my myVar5;
        my myVar6;
        my myVar7;
        long j6;
        int i5;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(1378716401);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(myVar) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i3 & 4) == 0) {
                i4 |= 384;
                myVar5 = myVar2;
            } else {
                myVar5 = myVar2;
                if ((i & 384) == 0) {
                    i4 |= startRestartGroup.changedInstance(myVar5) ? Fields.RotationX : Fields.SpotShadowColor;
                }
            }
            if ((i3 & 8) == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                myVar6 = myVar3;
                i4 |= startRestartGroup.changedInstance(myVar6) ? Fields.CameraDistance : Fields.RotationZ;
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    myVar7 = myVar4;
                    i4 |= startRestartGroup.changedInstance(myVar7) ? Fields.Clip : 8192;
                    if ((i3 & 32) == 0) {
                        i4 |= 196608;
                    } else if ((i & 196608) == 0) {
                        i4 |= startRestartGroup.changed(shape) ? Fields.RenderEffect : 65536;
                        if ((i3 & 64) != 0) {
                            i4 |= 1572864;
                            j6 = j;
                        } else {
                            j6 = j;
                            if ((i & 1572864) == 0) {
                                i4 |= startRestartGroup.changed(j6) ? 1048576 : Fields.BlendMode;
                            }
                        }
                        if ((i3 & Fields.SpotShadowColor) != 0) {
                            i4 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i4 |= startRestartGroup.changed(f) ? GroupFlagsKt.IsNodeFlag : 4194304;
                            if ((i3 & Fields.RotationX) == 0) {
                                i4 |= 100663296;
                            } else if ((i & 100663296) == 0) {
                                i4 |= startRestartGroup.changed(j2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                            }
                            if ((i3 & Fields.RotationY) == 0) {
                                i4 |= 805306368;
                            } else if ((i & 805306368) == 0) {
                                i4 |= startRestartGroup.changed(j3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            }
                            if ((i3 & Fields.RotationZ) == 0) {
                                i5 = i2 | 6;
                            } else if ((i2 & 6) == 0) {
                                i5 = i2 | (startRestartGroup.changed(j4) ? 4 : 2);
                            } else {
                                i5 = i2;
                            }
                            if ((i3 & Fields.CameraDistance) == 0) {
                                i5 |= 48;
                            } else if ((i2 & 48) == 0) {
                                i5 |= startRestartGroup.changed(j5) ? 32 : 16;
                                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i5 & 19) != 18, i4 & 1)) {
                                    Modifier modifier4 = i6 != 0 ? Modifier.Companion : modifier2;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1378716401, i4, i5, "androidx.compose.material3.AlertDialogContent (AlertDialog.kt:308)");
                                    }
                                    final my myVar8 = myVar6;
                                    final my myVar9 = myVar7;
                                    int i7 = i4 >> 12;
                                    SurfaceKt.m2464SurfaceT9BRK9s(modifier4, shape, j6, 0L, f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-652798794, true, new my() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1
                                        /* JADX WARN: Code restructure failed: missing block: B:18:0x009d, code lost:
                                        
                                            if (defpackage.q10.b(r8.rememberedValue(), java.lang.Integer.valueOf(r5)) == false) goto L24;
                                         */
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                        */
                                        public final void invoke(Composer composer2, int i8) {
                                            PaddingValues paddingValues;
                                            long j7;
                                            my myVar10;
                                            if (!composer2.shouldExecute((i8 & 3) != 2, i8 & 1)) {
                                                composer2.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-652798794, i8, -1, "androidx.compose.material3.AlertDialogContent.<anonymous> (AlertDialog.kt:315)");
                                            }
                                            Modifier.Companion companion = Modifier.Companion;
                                            paddingValues = AlertDialogKt.DialogPadding;
                                            Modifier padding = PaddingKt.padding(companion, paddingValues);
                                            final my myVar11 = my.this;
                                            final my myVar12 = myVar8;
                                            final my myVar13 = myVar9;
                                            long j8 = j3;
                                            long j9 = j4;
                                            long j10 = j5;
                                            long j11 = j2;
                                            my myVar14 = myVar;
                                            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                                            Alignment.Companion companion2 = Alignment.Companion;
                                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, padding);
                                            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                                            iy constructor = companion3.getConstructor();
                                            if (composer2.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer m3878constructorimpl = Updater.m3878constructorimpl(composer2);
                                            my b = k4.b(companion3, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                                            if (m3878constructorimpl.getInserting()) {
                                                j7 = j8;
                                            } else {
                                                j7 = j8;
                                            }
                                            k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                                            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion3.getSetModifier());
                                            final ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                            if (myVar11 == null) {
                                                composer2.startReplaceGroup(346092326);
                                            } else {
                                                composer2.startReplaceGroup(346092327);
                                                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(j7)), ComposableLambdaKt.rememberComposableLambda(-1128150638, true, new my() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$1$1
                                                    public final void invoke(Composer composer3, int i9) {
                                                        PaddingValues paddingValues2;
                                                        if (!composer3.shouldExecute((i9 & 3) != 2, i9 & 1)) {
                                                            composer3.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-1128150638, i9, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:318)");
                                                        }
                                                        ColumnScope columnScope = ColumnScope.this;
                                                        Modifier.Companion companion4 = Modifier.Companion;
                                                        paddingValues2 = AlertDialogKt.IconPadding;
                                                        Modifier padding2 = PaddingKt.padding(companion4, paddingValues2);
                                                        Alignment.Companion companion5 = Alignment.Companion;
                                                        Modifier align = columnScope.align(padding2, companion5.getCenterHorizontally());
                                                        my myVar15 = myVar11;
                                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
                                                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, align);
                                                        ComposeUiNode.Companion companion6 = ComposeUiNode.Companion;
                                                        iy constructor2 = companion6.getConstructor();
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
                                                        my b2 = k4.b(companion6, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                                                        if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                            k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
                                                        }
                                                        Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion6.getSetModifier());
                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                        if (fc.l(myVar15, composer3, 0)) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }

                                                    @Override // defpackage.my
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                                        return w01.a;
                                                    }
                                                }, composer2, 54), composer2, ProvidedValue.$stable | 48);
                                            }
                                            composer2.endReplaceGroup();
                                            if (myVar12 == null) {
                                                composer2.startReplaceGroup(346396529);
                                                composer2.endReplaceGroup();
                                                myVar10 = myVar14;
                                            } else {
                                                composer2.startReplaceGroup(346396530);
                                                myVar10 = myVar14;
                                                ProvideContentColorTextStyleKt.m2902ProvideContentColorTextStyle3JVO9M(j9, TypographyKt.getValue(DialogTokens.INSTANCE.getHeadlineFont(), composer2, 6), ComposableLambdaKt.rememberComposableLambda(71284337, true, new my() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$2$1
                                                    public final void invoke(Composer composer3, int i9) {
                                                        PaddingValues paddingValues2;
                                                        Alignment.Companion companion4;
                                                        Alignment.Horizontal centerHorizontally;
                                                        if (!composer3.shouldExecute((i9 & 3) != 2, i9 & 1)) {
                                                            composer3.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(71284337, i9, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:328)");
                                                        }
                                                        ColumnScope columnScope = ColumnScope.this;
                                                        Modifier.Companion companion5 = Modifier.Companion;
                                                        paddingValues2 = AlertDialogKt.TitlePadding;
                                                        Modifier padding2 = PaddingKt.padding(companion5, paddingValues2);
                                                        if (myVar11 == null) {
                                                            companion4 = Alignment.Companion;
                                                            centerHorizontally = companion4.getStart();
                                                        } else {
                                                            companion4 = Alignment.Companion;
                                                            centerHorizontally = companion4.getCenterHorizontally();
                                                        }
                                                        Modifier align = columnScope.align(padding2, centerHorizontally);
                                                        my myVar15 = myVar12;
                                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                                                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, align);
                                                        ComposeUiNode.Companion companion6 = ComposeUiNode.Companion;
                                                        iy constructor2 = companion6.getConstructor();
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
                                                        my b2 = k4.b(companion6, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                                                        if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                            k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
                                                        }
                                                        Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion6.getSetModifier());
                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                        if (fc.l(myVar15, composer3, 0)) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }

                                                    @Override // defpackage.my
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                                        return w01.a;
                                                    }
                                                }, composer2, 54), composer2, 384);
                                                composer2.endReplaceGroup();
                                            }
                                            if (myVar13 == null) {
                                                composer2.startReplaceGroup(347174009);
                                            } else {
                                                composer2.startReplaceGroup(347174010);
                                                ProvideContentColorTextStyleKt.m2902ProvideContentColorTextStyle3JVO9M(j10, TypographyKt.getValue(DialogTokens.INSTANCE.getSupportingTextFont(), composer2, 6), ComposableLambdaKt.rememberComposableLambda(705583346, true, new my() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogContent$1$1$3$1
                                                    public final void invoke(Composer composer3, int i9) {
                                                        PaddingValues paddingValues2;
                                                        if (!composer3.shouldExecute((i9 & 3) != 2, i9 & 1)) {
                                                            composer3.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(705583346, i9, -1, "androidx.compose.material3.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:349)");
                                                        }
                                                        ColumnScope columnScope = ColumnScope.this;
                                                        Modifier weight = columnScope.weight(Modifier.Companion, 1.0f, false);
                                                        paddingValues2 = AlertDialogKt.TextPadding;
                                                        Modifier padding2 = PaddingKt.padding(weight, paddingValues2);
                                                        Alignment.Companion companion4 = Alignment.Companion;
                                                        Modifier align = columnScope.align(padding2, companion4.getStart());
                                                        my myVar15 = myVar13;
                                                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                                                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, align);
                                                        ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                                                        iy constructor2 = companion5.getConstructor();
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
                                                        my b2 = k4.b(companion5, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                                                        if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                            k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
                                                        }
                                                        Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion5.getSetModifier());
                                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                        if (fc.l(myVar15, composer3, 0)) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }

                                                    @Override // defpackage.my
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                                        return w01.a;
                                                    }
                                                }, composer2, 54), composer2, 384);
                                            }
                                            composer2.endReplaceGroup();
                                            Modifier align = columnScopeInstance.align(companion, companion2.getEnd());
                                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, align);
                                            iy constructor2 = companion3.getConstructor();
                                            if (composer2.getApplier() == null) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor2);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer m3878constructorimpl2 = Updater.m3878constructorimpl(composer2);
                                            my b2 = k4.b(companion3, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                                            if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
                                            }
                                            Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion3.getSetModifier());
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            ProvideContentColorTextStyleKt.m2902ProvideContentColorTextStyle3JVO9M(j11, TypographyKt.getValue(DialogTokens.INSTANCE.getActionLabelTextFont(), composer2, 6), myVar10, composer2, 0);
                                            composer2.endNode();
                                            composer2.endNode();
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        @Override // defpackage.my
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                            invoke((Composer) obj, ((Number) obj2).intValue());
                                            return w01.a;
                                        }
                                    }, startRestartGroup, 54), startRestartGroup, ((i4 >> 3) & 14) | 12582912 | (i7 & 112) | (i7 & 896) | ((i4 >> 9) & 57344), 104);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier4;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    modifier3 = modifier2;
                                }
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new my() { // from class: n4
                                        @Override // defpackage.my
                                        public final Object invoke(Object obj, Object obj2) {
                                            w01 AlertDialogContent_4hvqGtA$lambda$4;
                                            int intValue = ((Integer) obj2).intValue();
                                            AlertDialogContent_4hvqGtA$lambda$4 = AlertDialogKt.AlertDialogContent_4hvqGtA$lambda$4(my.this, modifier3, myVar2, myVar3, myVar4, shape, j, f, j2, j3, j4, j5, i, i2, i3, (Composer) obj, intValue);
                                            return AlertDialogContent_4hvqGtA$lambda$4;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i5 & 19) != 18, i4 & 1)) {
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        if ((i3 & Fields.RotationX) == 0) {
                        }
                        if ((i3 & Fields.RotationY) == 0) {
                        }
                        if ((i3 & Fields.RotationZ) == 0) {
                        }
                        if ((i3 & Fields.CameraDistance) == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i5 & 19) != 18, i4 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    if ((i3 & 64) != 0) {
                    }
                    if ((i3 & Fields.SpotShadowColor) != 0) {
                    }
                    if ((i3 & Fields.RotationX) == 0) {
                    }
                    if ((i3 & Fields.RotationY) == 0) {
                    }
                    if ((i3 & Fields.RotationZ) == 0) {
                    }
                    if ((i3 & Fields.CameraDistance) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i5 & 19) != 18, i4 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                myVar7 = myVar4;
                if ((i3 & 32) == 0) {
                }
                if ((i3 & 64) != 0) {
                }
                if ((i3 & Fields.SpotShadowColor) != 0) {
                }
                if ((i3 & Fields.RotationX) == 0) {
                }
                if ((i3 & Fields.RotationY) == 0) {
                }
                if ((i3 & Fields.RotationZ) == 0) {
                }
                if ((i3 & Fields.CameraDistance) == 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i5 & 19) != 18, i4 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            myVar6 = myVar3;
            if ((i3 & 16) != 0) {
            }
            myVar7 = myVar4;
            if ((i3 & 32) == 0) {
            }
            if ((i3 & 64) != 0) {
            }
            if ((i3 & Fields.SpotShadowColor) != 0) {
            }
            if ((i3 & Fields.RotationX) == 0) {
            }
            if ((i3 & Fields.RotationY) == 0) {
            }
            if ((i3 & Fields.RotationZ) == 0) {
            }
            if ((i3 & Fields.CameraDistance) == 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i5 & 19) != 18, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i3 & 4) == 0) {
        }
        if ((i3 & 8) == 0) {
        }
        myVar6 = myVar3;
        if ((i3 & 16) != 0) {
        }
        myVar7 = myVar4;
        if ((i3 & 32) == 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if ((i3 & Fields.SpotShadowColor) != 0) {
        }
        if ((i3 & Fields.RotationX) == 0) {
        }
        if ((i3 & Fields.RotationY) == 0) {
        }
        if ((i3 & Fields.RotationZ) == 0) {
        }
        if ((i3 & Fields.CameraDistance) == 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i5 & 19) != 18, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 AlertDialogContent_4hvqGtA$lambda$4(my myVar, Modifier modifier, my myVar2, my myVar3, my myVar4, Shape shape, long j, float f, long j2, long j3, long j4, long j5, int i, int i2, int i3, Composer composer, int i4) {
        m1593AlertDialogContent4hvqGtA(myVar, modifier, myVar2, myVar3, myVar4, shape, j, f, j2, j3, j4, j5, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return w01.a;
    }

    /* renamed from: AlertDialogFlowRow-ixp7dh8, reason: not valid java name */
    public static final void m1594AlertDialogFlowRowixp7dh8(final float f, final float f2, final my myVar, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-917637668);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(f2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-917637668, i2, -1, "androidx.compose.material3.AlertDialogFlowRow (AlertDialog.kt:379)");
            }
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new AlertDialogKt$AlertDialogFlowRow$1$1(f, f2);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            int i3 = (i2 >> 6) & 14;
            Modifier.Companion companion = Modifier.Companion;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            iy constructor = companion2.getConstructor();
            int i4 = ((i3 << 6) & 896) | 6;
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
            my b = k4.b(companion2, m3878constructorimpl, measurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
            }
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion2.getSetModifier());
            if (fc.l(myVar, startRestartGroup, (i4 >> 6) & 14)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: p4
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 AlertDialogFlowRow_ixp7dh8$lambda$6;
                    int intValue = ((Integer) obj2).intValue();
                    AlertDialogFlowRow_ixp7dh8$lambda$6 = AlertDialogKt.AlertDialogFlowRow_ixp7dh8$lambda$6(f, f2, myVar, i, (Composer) obj, intValue);
                    return AlertDialogFlowRow_ixp7dh8$lambda$6;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 AlertDialogFlowRow_ixp7dh8$lambda$6(float f, float f2, my myVar, int i, Composer composer, int i2) {
        m1594AlertDialogFlowRowixp7dh8(f, f2, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* renamed from: AlertDialogImpl-wrnwzgE, reason: not valid java name */
    public static final void m1595AlertDialogImplwrnwzgE(final iy iyVar, final my myVar, final Modifier modifier, final my myVar2, final my myVar3, final my myVar4, final my myVar5, final Shape shape, final long j, final long j2, final long j3, final long j4, final float f, final DialogProperties dialogProperties, Composer composer, final int i, final int i2) {
        int i3;
        my myVar6;
        my myVar7;
        my myVar8;
        int i4;
        float f2;
        Composer startRestartGroup = composer.startRestartGroup(-867616355);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(iyVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            myVar6 = myVar;
            i3 |= startRestartGroup.changedInstance(myVar6) ? 32 : 16;
        } else {
            myVar6 = myVar;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i5 = i & 3072;
        int i6 = Fields.CameraDistance;
        if (i5 == 0) {
            myVar7 = myVar2;
            i3 |= startRestartGroup.changedInstance(myVar7) ? 2048 : Fields.RotationZ;
        } else {
            myVar7 = myVar2;
        }
        if ((i & 24576) == 0) {
            myVar8 = myVar3;
            i3 |= startRestartGroup.changedInstance(myVar8) ? Fields.Clip : 8192;
        } else {
            myVar8 = myVar3;
        }
        if ((i & 196608) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar4) ? Fields.RenderEffect : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar5) ? 1048576 : Fields.BlendMode;
        }
        if ((i & 12582912) == 0) {
            i3 |= startRestartGroup.changed(shape) ? GroupFlagsKt.IsNodeFlag : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= startRestartGroup.changed(j) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
        }
        if ((i & 805306368) == 0) {
            i3 |= startRestartGroup.changed(j2) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (startRestartGroup.changed(j3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(j4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            f2 = f;
            i4 |= startRestartGroup.changed(f2) ? Fields.RotationX : Fields.SpotShadowColor;
        } else {
            f2 = f;
        }
        if ((i2 & 3072) == 0) {
            if (!startRestartGroup.changed(dialogProperties)) {
                i6 = Fields.RotationZ;
            }
            i4 |= i6;
        }
        int i7 = i4;
        if (startRestartGroup.shouldExecute(((i3 & 306783379) == 306783378 && (i7 & 1171) == 1170) ? false : true, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-867616355, i3, i7, "androidx.compose.material3.AlertDialogImpl (AlertDialog.kt:260)");
            }
            final my myVar9 = myVar6;
            final my myVar10 = myVar7;
            final float f3 = f2;
            final my myVar11 = myVar8;
            BasicAlertDialog(iyVar, modifier, dialogProperties, ComposableLambdaKt.rememberComposableLambda(527420759, true, new my() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogImpl$1
                public final void invoke(Composer composer2, int i8) {
                    if (!composer2.shouldExecute((i8 & 3) != 2, i8 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(527420759, i8, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous> (AlertDialog.kt:266)");
                    }
                    final my myVar12 = myVar10;
                    final my myVar13 = myVar9;
                    AlertDialogKt.m1593AlertDialogContent4hvqGtA(ComposableLambdaKt.rememberComposableLambda(1367541877, true, new my() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogImpl$1.1
                        public final void invoke(Composer composer3, int i9) {
                            float f4;
                            float f5;
                            if (!composer3.shouldExecute((i9 & 3) != 2, i9 & 1)) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1367541877, i9, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous>.<anonymous> (AlertDialog.kt:268)");
                            }
                            f4 = AlertDialogKt.ButtonsMainAxisSpacing;
                            f5 = AlertDialogKt.ButtonsCrossAxisSpacing;
                            final my myVar14 = my.this;
                            final my myVar15 = myVar13;
                            AlertDialogKt.m1594AlertDialogFlowRowixp7dh8(f4, f5, ComposableLambdaKt.rememberComposableLambda(-459506658, true, new my() { // from class: androidx.compose.material3.AlertDialogKt.AlertDialogImpl.1.1.1
                                public final void invoke(Composer composer4, int i10) {
                                    if (!composer4.shouldExecute((i10 & 3) != 2, i10 & 1)) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-459506658, i10, -1, "androidx.compose.material3.AlertDialogImpl.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:272)");
                                    }
                                    my myVar16 = my.this;
                                    if (myVar16 == null) {
                                        composer4.startReplaceGroup(-1102039173);
                                    } else {
                                        composer4.startReplaceGroup(795734342);
                                        myVar16.invoke(composer4, 0);
                                    }
                                    composer4.endReplaceGroup();
                                    myVar15.invoke(composer4, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // defpackage.my
                                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((Composer) obj, ((Number) obj2).intValue());
                                    return w01.a;
                                }
                            }, composer3, 54), composer3, 438);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // defpackage.my
                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((Composer) obj, ((Number) obj2).intValue());
                            return w01.a;
                        }
                    }, composer2, 54), null, my.this, myVar4, myVar5, shape, j, f3, ColorSchemeKt.getValue(DialogTokens.INSTANCE.getActionLabelTextColor(), composer2, 6), j2, j3, j4, composer2, 6, 0, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // defpackage.my
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return w01.a;
                }
            }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 3072 | ((i3 >> 3) & 112) | ((i7 >> 3) & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: o4
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 AlertDialogImpl_wrnwzgE$lambda$3;
                    int intValue = ((Integer) obj2).intValue();
                    AlertDialogImpl_wrnwzgE$lambda$3 = AlertDialogKt.AlertDialogImpl_wrnwzgE$lambda$3(iy.this, myVar, modifier, myVar2, myVar3, myVar4, myVar5, shape, j, j2, j3, j4, f, dialogProperties, i, i2, (Composer) obj, intValue);
                    return AlertDialogImpl_wrnwzgE$lambda$3;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 AlertDialogImpl_wrnwzgE$lambda$3(iy iyVar, my myVar, Modifier modifier, my myVar2, my myVar3, my myVar4, my myVar5, Shape shape, long j, long j2, long j3, long j4, float f, DialogProperties dialogProperties, int i, int i2, Composer composer, int i3) {
        m1595AlertDialogImplwrnwzgE(iyVar, myVar, modifier, myVar2, myVar3, myVar4, myVar5, shape, j, j2, j3, j4, f, dialogProperties, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicAlertDialog(iy iyVar, Modifier modifier, DialogProperties dialogProperties, my myVar, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        DialogProperties dialogProperties2;
        Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(24925658);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(iyVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                dialogProperties2 = dialogProperties;
                i3 |= startRestartGroup.changed(dialogProperties2) ? Fields.RotationX : Fields.SpotShadowColor;
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= startRestartGroup.changedInstance(myVar) ? Fields.CameraDistance : Fields.RotationZ;
                }
                if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    modifier3 = i5 != 0 ? Modifier.Companion : modifier2;
                    if (i4 != 0) {
                        dialogProperties2 = new DialogProperties(false, false, false, 7, (dq) null);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(24925658, i3, -1, "androidx.compose.material3.BasicAlertDialog (AlertDialog.kt:143)");
                    }
                    ((BasicAlertDialogOverride) startRestartGroup.consume(LocalBasicAlertDialogOverride)).BasicAlertDialog(new BasicAlertDialogOverrideScope(iyVar, modifier3, dialogProperties2, myVar), startRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                DialogProperties dialogProperties3 = dialogProperties2;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new m4(iyVar, modifier3, dialogProperties3, myVar, i, i2, 1));
                    return;
                }
                return;
            }
            dialogProperties2 = dialogProperties;
            if ((i2 & 8) != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            DialogProperties dialogProperties32 = dialogProperties2;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        dialogProperties2 = dialogProperties;
        if ((i2 & 8) != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        DialogProperties dialogProperties322 = dialogProperties2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicAlertDialog$lambda$1(iy iyVar, Modifier modifier, DialogProperties dialogProperties, my myVar, int i, int i2, Composer composer, int i3) {
        BasicAlertDialog(iyVar, modifier, dialogProperties, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    public static final float getDialogMaxWidth() {
        return DialogMaxWidth;
    }

    public static final float getDialogMinWidth() {
        return DialogMinWidth;
    }

    public static final ProvidableCompositionLocal<BasicAlertDialogOverride> getLocalBasicAlertDialogOverride() {
        return LocalBasicAlertDialogOverride;
    }
}
