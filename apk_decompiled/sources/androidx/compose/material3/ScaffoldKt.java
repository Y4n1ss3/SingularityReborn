package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.FabPosition;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.internal.MutableWindowInsets;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.fc;
import defpackage.iy;
import defpackage.jg;
import defpackage.k4;
import defpackage.ky;
import defpackage.ml0;
import defpackage.my;
import defpackage.ny;
import defpackage.ok;
import defpackage.q10;
import defpackage.w01;
import defpackage.yi;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScaffoldKt {
    private static final float FabSpacing = Dp.m7611constructorimpl(16.0f);

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02db  */
    /* renamed from: Scaffold-TvnljyQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2300ScaffoldTvnljyQ(Modifier modifier, my myVar, my myVar2, my myVar3, my myVar4, int i, long j, long j2, WindowInsets windowInsets, final ny nyVar, Composer composer, final int i2, final int i3) {
        int i4;
        my myVar5;
        int i5;
        my myVar6;
        int i6;
        my myVar7;
        int i7;
        my myVar8;
        int i8;
        int i9;
        Composer composer2;
        final Modifier modifier2;
        final WindowInsets windowInsets2;
        final my myVar9;
        final my myVar10;
        final my myVar11;
        final my myVar12;
        final int i10;
        final long j3;
        final long j4;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier3;
        my m1838getLambda$39202156$material3;
        my lambda$1582488484$material3;
        my lambda$414328099$material3;
        my m1837getLambda$1514016380$material3;
        int m1988getEndERTFSPs;
        int i11;
        long j5;
        long j6;
        WindowInsets windowInsets3;
        int i12;
        long j7;
        int i13;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(-1211482744);
        int i15 = i3 & 1;
        if (i15 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i16 = i3 & 2;
        if (i16 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            myVar5 = myVar;
            i4 |= startRestartGroup.changedInstance(myVar5) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                myVar6 = myVar2;
                i4 |= startRestartGroup.changedInstance(myVar6) ? Fields.RotationX : Fields.SpotShadowColor;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    myVar7 = myVar3;
                    i4 |= startRestartGroup.changedInstance(myVar7) ? Fields.CameraDistance : Fields.RotationZ;
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        myVar8 = myVar4;
                        i4 |= startRestartGroup.changedInstance(myVar8) ? Fields.Clip : 8192;
                        i8 = i3 & 32;
                        if (i8 != 0) {
                            i4 |= 196608;
                        } else if ((i2 & 196608) == 0) {
                            i4 |= startRestartGroup.changed(i) ? Fields.RenderEffect : 65536;
                        }
                        if ((i2 & 1572864) == 0) {
                            i9 = i15;
                            i4 |= ((i3 & 64) == 0 && startRestartGroup.changed(j)) ? 1048576 : Fields.BlendMode;
                        } else {
                            i9 = i15;
                        }
                        if ((i2 & 12582912) == 0) {
                            i4 |= ((i3 & Fields.SpotShadowColor) == 0 && startRestartGroup.changed(j2)) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        }
                        if ((i2 & 100663296) == 0) {
                            if ((i3 & Fields.RotationX) == 0 && startRestartGroup.changed(windowInsets)) {
                                i14 = GroupFlagsKt.IsRecompositionRequiredFlag;
                                i4 |= i14;
                            }
                            i14 = GroupFlagsKt.HasAuxSlotFlag;
                            i4 |= i14;
                        }
                        if ((i3 & Fields.RotationY) != 0) {
                            i4 |= 805306368;
                        } else if ((i2 & 805306368) == 0) {
                            i4 |= startRestartGroup.changedInstance(nyVar) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378, i4 & 1)) {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                modifier2 = modifier;
                                windowInsets2 = windowInsets;
                                myVar9 = myVar5;
                                myVar10 = myVar6;
                                myVar11 = myVar7;
                                myVar12 = myVar8;
                                i10 = i;
                                j3 = j;
                                j4 = j2;
                            } else {
                                startRestartGroup.startDefaults();
                                if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    modifier3 = i9 != 0 ? Modifier.Companion : modifier;
                                    m1838getLambda$39202156$material3 = i16 != 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m1838getLambda$39202156$material3() : myVar5;
                                    lambda$1582488484$material3 = i5 != 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.getLambda$1582488484$material3() : myVar6;
                                    lambda$414328099$material3 = i6 != 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.getLambda$414328099$material3() : myVar7;
                                    m1837getLambda$1514016380$material3 = i7 != 0 ? ComposableSingletons$ScaffoldKt.INSTANCE.m1837getLambda$1514016380$material3() : myVar8;
                                    m1988getEndERTFSPs = i8 != 0 ? FabPosition.Companion.m1988getEndERTFSPs() : i;
                                    if ((i3 & 64) != 0) {
                                        i4 &= -3670017;
                                        i11 = -234881025;
                                        j5 = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6).m1747getBackground0d7_KjU();
                                    } else {
                                        i11 = -234881025;
                                        j5 = j;
                                    }
                                    if ((i3 & Fields.SpotShadowColor) != 0) {
                                        j6 = ColorSchemeKt.m1797contentColorForek8zF_U(j5, startRestartGroup, (i4 >> 18) & 14);
                                        i4 &= -29360129;
                                    } else {
                                        j6 = j2;
                                    }
                                    if ((i3 & Fields.RotationX) != 0) {
                                        windowInsets3 = ScaffoldDefaults.INSTANCE.getContentWindowInsets(startRestartGroup, 6);
                                        i4 &= i11;
                                    } else {
                                        windowInsets3 = windowInsets;
                                    }
                                    i12 = 100663296;
                                    j7 = j6;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i3 & 64) != 0) {
                                        i4 &= -3670017;
                                    }
                                    if ((i3 & Fields.SpotShadowColor) != 0) {
                                        i4 &= -29360129;
                                    }
                                    if ((i3 & Fields.RotationX) != 0) {
                                        i4 &= -234881025;
                                    }
                                    modifier3 = modifier;
                                    m1988getEndERTFSPs = i;
                                    j5 = j;
                                    m1838getLambda$39202156$material3 = myVar5;
                                    lambda$1582488484$material3 = myVar6;
                                    lambda$414328099$material3 = myVar7;
                                    m1837getLambda$1514016380$material3 = myVar8;
                                    i12 = 100663296;
                                    j7 = j2;
                                    windowInsets3 = windowInsets;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    i13 = i12;
                                    ComposerKt.traceEventStart(-1211482744, i4, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:93)");
                                } else {
                                    i13 = i12;
                                }
                                int i17 = (234881024 & i4) ^ i13;
                                boolean z = (i17 > 67108864 && startRestartGroup.changed(windowInsets3)) || (i4 & i13) == 67108864;
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (z || rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = new MutableWindowInsets(windowInsets3);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                final MutableWindowInsets mutableWindowInsets = (MutableWindowInsets) rememberedValue;
                                long j8 = j5;
                                boolean changed = ((i17 > 67108864 && startRestartGroup.changed(windowInsets3)) || (i4 & i13) == 67108864) | startRestartGroup.changed(mutableWindowInsets);
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                                    rememberedValue2 = new ml0(mutableWindowInsets, windowInsets3, 0);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                final my myVar13 = m1838getLambda$39202156$material3;
                                final my myVar14 = lambda$1582488484$material3;
                                final my myVar15 = lambda$414328099$material3;
                                final my myVar16 = m1837getLambda$1514016380$material3;
                                final int i18 = m1988getEndERTFSPs;
                                int i19 = i4 >> 12;
                                composer2 = startRestartGroup;
                                SurfaceKt.m2464SurfaceT9BRK9s(WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(modifier3, (ky) rememberedValue2), null, j8, j7, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(848889571, true, new my() { // from class: androidx.compose.material3.ScaffoldKt$Scaffold$2
                                    public final void invoke(Composer composer3, int i20) {
                                        if (!composer3.shouldExecute((i20 & 3) != 2, i20 & 1)) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(848889571, i20, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:104)");
                                        }
                                        ScaffoldKt.m2301ScaffoldLayoutFMILGgc(i18, myVar13, nyVar, myVar15, myVar16, mutableWindowInsets, myVar14, composer3, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // defpackage.my
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                        return w01.a;
                                    }
                                }, startRestartGroup, 54), composer2, (i19 & 896) | 12582912 | (i19 & 7168), 114);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = modifier3;
                                myVar9 = m1838getLambda$39202156$material3;
                                myVar10 = lambda$1582488484$material3;
                                myVar11 = lambda$414328099$material3;
                                myVar12 = m1837getLambda$1514016380$material3;
                                i10 = m1988getEndERTFSPs;
                                windowInsets2 = windowInsets3;
                                j3 = j8;
                                j4 = j7;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new my() { // from class: nl0
                                    @Override // defpackage.my
                                    public final Object invoke(Object obj, Object obj2) {
                                        w01 Scaffold_TvnljyQ$lambda$3;
                                        int intValue = ((Integer) obj2).intValue();
                                        Scaffold_TvnljyQ$lambda$3 = ScaffoldKt.Scaffold_TvnljyQ$lambda$3(Modifier.this, myVar9, myVar10, myVar11, myVar12, i10, j3, j4, windowInsets2, nyVar, i2, i3, (Composer) obj, intValue);
                                        return Scaffold_TvnljyQ$lambda$3;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378, i4 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    myVar8 = myVar4;
                    i8 = i3 & 32;
                    if (i8 != 0) {
                    }
                    if ((i2 & 1572864) == 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    if ((i2 & 100663296) == 0) {
                    }
                    if ((i3 & Fields.RotationY) != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378, i4 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                myVar7 = myVar3;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                myVar8 = myVar4;
                i8 = i3 & 32;
                if (i8 != 0) {
                }
                if ((i2 & 1572864) == 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                if ((i2 & 100663296) == 0) {
                }
                if ((i3 & Fields.RotationY) != 0) {
                }
                if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378, i4 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            myVar6 = myVar2;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            myVar7 = myVar3;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            myVar8 = myVar4;
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            if ((i2 & 100663296) == 0) {
            }
            if ((i3 & Fields.RotationY) != 0) {
            }
            if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        myVar5 = myVar;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        myVar6 = myVar2;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        myVar7 = myVar3;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        myVar8 = myVar4;
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        if ((i2 & 100663296) == 0) {
        }
        if ((i3 & Fields.RotationY) != 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 306783379) == 306783378, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ScaffoldLayout-FMILGgc, reason: not valid java name */
    public static final void m2301ScaffoldLayoutFMILGgc(int i, final my myVar, final ny nyVar, final my myVar2, final my myVar3, WindowInsets windowInsets, final my myVar4, Composer composer, int i2) {
        int i3;
        ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$1;
        int i4;
        int i5;
        Composer startRestartGroup = composer.startRestartGroup(-280287501);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(nyVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i2 & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar3) ? Fields.Clip : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= startRestartGroup.changed(windowInsets) ? Fields.RenderEffect : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar4) ? 1048576 : Fields.BlendMode;
        }
        if (startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-280287501, i3, -1, "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:137)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new ScaffoldKt$ScaffoldLayout$contentPadding$1$1();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$12 = (ScaffoldKt$ScaffoldLayout$contentPadding$1$1) rememberedValue;
            boolean z = (i3 & 112) == 32;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = ComposableLambdaKt.composableLambdaInstance(605195056, true, new my() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$topBarContent$1$1
                    public final void invoke(Composer composer2, int i6) {
                        if (!composer2.shouldExecute((i6 & 3) != 2, i6 & 1)) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(605195056, i6, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous> (Scaffold.kt:158)");
                        }
                        my myVar5 = my.this;
                        Modifier.Companion companion2 = Modifier.Companion;
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, companion2);
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
                        my b = k4.b(companion3, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                        if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                        }
                        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        if (fc.l(myVar5, composer2, 0)) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // defpackage.my
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return w01.a;
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            my myVar5 = (my) rememberedValue2;
            boolean z2 = (i3 & 7168) == 2048;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = ComposableLambdaKt.composableLambdaInstance(418899191, true, new my() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$snackbarContent$1$1
                    public final void invoke(Composer composer2, int i6) {
                        if (!composer2.shouldExecute((i6 & 3) != 2, i6 & 1)) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(418899191, i6, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous> (Scaffold.kt:159)");
                        }
                        my myVar6 = my.this;
                        Modifier.Companion companion2 = Modifier.Companion;
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, companion2);
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
                        my b = k4.b(companion3, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                        if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                        }
                        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        if (fc.l(myVar6, composer2, 0)) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // defpackage.my
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return w01.a;
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            my myVar6 = (my) rememberedValue3;
            boolean z3 = (57344 & i3) == 16384;
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = ComposableLambdaKt.composableLambdaInstance(338600263, true, new my() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$fabContent$1$1
                    public final void invoke(Composer composer2, int i6) {
                        if (!composer2.shouldExecute((i6 & 3) != 2, i6 & 1)) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(338600263, i6, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous> (Scaffold.kt:160)");
                        }
                        my myVar7 = my.this;
                        Modifier.Companion companion2 = Modifier.Companion;
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, companion2);
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
                        my b = k4.b(companion3, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                        if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                        }
                        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        if (fc.l(myVar7, composer2, 0)) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // defpackage.my
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return w01.a;
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            my myVar7 = (my) rememberedValue4;
            boolean z4 = (i3 & 896) == 256;
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (z4 || rememberedValue5 == companion.getEmpty()) {
                scaffoldKt$ScaffoldLayout$contentPadding$1$1 = scaffoldKt$ScaffoldLayout$contentPadding$1$12;
                rememberedValue5 = ComposableLambdaKt.composableLambdaInstance(-1776388365, true, new my() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$bodyContent$1$1
                    public final void invoke(Composer composer2, int i6) {
                        if (!composer2.shouldExecute((i6 & 3) != 2, i6 & 1)) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1776388365, i6, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous> (Scaffold.kt:162)");
                        }
                        ny nyVar2 = ny.this;
                        ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$13 = scaffoldKt$ScaffoldLayout$contentPadding$1$12;
                        Modifier.Companion companion2 = Modifier.Companion;
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, companion2);
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
                        my b = k4.b(companion3, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                        if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                        }
                        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        nyVar2.invoke(scaffoldKt$ScaffoldLayout$contentPadding$1$13, composer2, 6);
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
                });
                startRestartGroup.updateRememberedValue(rememberedValue5);
            } else {
                scaffoldKt$ScaffoldLayout$contentPadding$1$1 = scaffoldKt$ScaffoldLayout$contentPadding$1$12;
            }
            my myVar8 = (my) rememberedValue5;
            boolean z5 = (3670016 & i3) == 1048576;
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (z5 || rememberedValue6 == companion.getEmpty()) {
                rememberedValue6 = ComposableLambdaKt.composableLambdaInstance(-1731662488, true, new my() { // from class: androidx.compose.material3.ScaffoldKt$ScaffoldLayout$bottomBarContent$1$1
                    public final void invoke(Composer composer2, int i6) {
                        if (!composer2.shouldExecute((i6 & 3) != 2, i6 & 1)) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1731662488, i6, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous> (Scaffold.kt:163)");
                        }
                        my myVar9 = my.this;
                        Modifier.Companion companion2 = Modifier.Companion;
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, companion2);
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
                        my b = k4.b(companion3, m3878constructorimpl, maybeCachedBoxMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                        if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                        }
                        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        if (fc.l(myVar9, composer2, 0)) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // defpackage.my
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return w01.a;
                    }
                });
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            my myVar9 = (my) rememberedValue6;
            boolean changed = ((458752 & i3) == 131072) | startRestartGroup.changed(myVar5) | startRestartGroup.changed(myVar6) | startRestartGroup.changed(myVar7) | ((i3 & 14) == 4) | startRestartGroup.changed(myVar9) | startRestartGroup.changed(myVar8);
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue7 == companion.getEmpty()) {
                i4 = 1;
                i5 = 0;
                ok okVar = new ok(windowInsets, myVar5, myVar6, myVar7, i, myVar9, scaffoldKt$ScaffoldLayout$contentPadding$1$1, myVar8);
                startRestartGroup.updateRememberedValue(okVar);
                rememberedValue7 = okVar;
            } else {
                i5 = 0;
                i4 = 1;
            }
            SubcomposeLayoutKt.SubcomposeLayout(null, (my) rememberedValue7, startRestartGroup, i5, i4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new jg(i, myVar, nyVar, myVar2, myVar3, windowInsets, myVar4, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult ScaffoldLayout_FMILGgc$lambda$15$lambda$14(final WindowInsets windowInsets, my myVar, my myVar2, my myVar3, int i, my myVar4, ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$1, my myVar5, final SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
        int mo361roundToPx0680j_4;
        int mo361roundToPx0680j_42;
        int i2;
        FabPlacement fabPlacement;
        Integer num;
        int intValue;
        int mo361roundToPx0680j_43;
        int bottom;
        final int m7564getMaxWidthimpl = Constraints.m7564getMaxWidthimpl(constraints.m7570unboximpl());
        final int m7563getMaxHeightimpl = Constraints.m7563getMaxHeightimpl(constraints.m7570unboximpl());
        long m7554copyZbe2FdA$default = Constraints.m7554copyZbe2FdA$default(constraints.m7570unboximpl(), 0, 0, 0, 0, 10, null);
        int left = windowInsets.getLeft(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection());
        int right = windowInsets.getRight(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection());
        int bottom2 = windowInsets.getBottom(subcomposeMeasureScope);
        final Placeable mo6234measureBRTryo0 = ((Measurable) yi.p0(subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.TopBar, myVar))).mo6234measureBRTryo0(m7554copyZbe2FdA$default);
        int i3 = (-left) - right;
        int i4 = -bottom2;
        final Placeable mo6234measureBRTryo02 = ((Measurable) yi.p0(subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Snackbar, myVar2))).mo6234measureBRTryo0(ConstraintsKt.m7583offsetNN6EwU(m7554copyZbe2FdA$default, i3, i4));
        final Placeable mo6234measureBRTryo03 = ((Measurable) yi.p0(subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Fab, myVar3))).mo6234measureBRTryo0(ConstraintsKt.m7583offsetNN6EwU(m7554copyZbe2FdA$default, i3, i4));
        if (mo6234measureBRTryo03.getWidth() == 0 && mo6234measureBRTryo03.getHeight() == 0) {
            fabPlacement = null;
        } else {
            int width = mo6234measureBRTryo03.getWidth();
            int height = mo6234measureBRTryo03.getHeight();
            FabPosition.Companion companion = FabPosition.Companion;
            if (FabPosition.m1983equalsimpl0(i, companion.m1990getStartERTFSPs())) {
                if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                    mo361roundToPx0680j_4 = subcomposeMeasureScope.mo361roundToPx0680j_4(FabSpacing);
                    i2 = mo361roundToPx0680j_4 + left;
                } else {
                    mo361roundToPx0680j_42 = subcomposeMeasureScope.mo361roundToPx0680j_4(FabSpacing);
                    i2 = ((m7564getMaxWidthimpl - mo361roundToPx0680j_42) - width) - right;
                }
            } else if (!FabPosition.m1983equalsimpl0(i, companion.m1988getEndERTFSPs()) && !FabPosition.m1983equalsimpl0(i, companion.m1989getEndOverlayERTFSPs())) {
                i2 = (((m7564getMaxWidthimpl - width) + left) - right) / 2;
            } else if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                mo361roundToPx0680j_42 = subcomposeMeasureScope.mo361roundToPx0680j_4(FabSpacing);
                i2 = ((m7564getMaxWidthimpl - mo361roundToPx0680j_42) - width) - right;
            } else {
                mo361roundToPx0680j_4 = subcomposeMeasureScope.mo361roundToPx0680j_4(FabSpacing);
                i2 = mo361roundToPx0680j_4 + left;
            }
            fabPlacement = new FabPlacement(i2, width, height);
        }
        final Placeable mo6234measureBRTryo04 = ((Measurable) yi.p0(subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.BottomBar, myVar4))).mo6234measureBRTryo0(m7554copyZbe2FdA$default);
        int i5 = 0;
        boolean z = mo6234measureBRTryo04.getWidth() == 0 && mo6234measureBRTryo04.getHeight() == 0;
        if (fabPlacement != null) {
            if (z || FabPosition.m1983equalsimpl0(i, FabPosition.Companion.m1989getEndOverlayERTFSPs())) {
                mo361roundToPx0680j_43 = subcomposeMeasureScope.mo361roundToPx0680j_4(FabSpacing) + fabPlacement.getHeight();
                bottom = windowInsets.getBottom(subcomposeMeasureScope);
            } else {
                mo361roundToPx0680j_43 = fabPlacement.getHeight() + mo6234measureBRTryo04.getHeight();
                bottom = subcomposeMeasureScope.mo361roundToPx0680j_4(FabSpacing);
            }
            num = Integer.valueOf(bottom + mo361roundToPx0680j_43);
        } else {
            num = null;
        }
        int height2 = mo6234measureBRTryo02.getHeight();
        if (height2 != 0) {
            if (num != null) {
                intValue = num.intValue();
            } else {
                Integer valueOf = Integer.valueOf(mo6234measureBRTryo04.getHeight());
                if (z) {
                    valueOf = null;
                }
                intValue = valueOf != null ? valueOf.intValue() : windowInsets.getBottom(subcomposeMeasureScope);
            }
            i5 = intValue + height2;
        }
        PaddingValues asPaddingValues = WindowInsetsKt.asPaddingValues(windowInsets, subcomposeMeasureScope);
        final Integer num2 = num;
        final FabPlacement fabPlacement2 = fabPlacement;
        scaffoldKt$ScaffoldLayout$contentPadding$1$1.setPaddingHolder(PaddingKt.m758PaddingValuesa9UjIt4(PaddingKt.calculateStartPadding(asPaddingValues, subcomposeMeasureScope.getLayoutDirection()), (mo6234measureBRTryo0.getWidth() == 0 && mo6234measureBRTryo0.getHeight() == 0) ? asPaddingValues.mo714calculateTopPaddingD9Ej5fM() : subcomposeMeasureScope.mo364toDpu2uoSUM(mo6234measureBRTryo0.getHeight()), PaddingKt.calculateEndPadding(asPaddingValues, subcomposeMeasureScope.getLayoutDirection()), z ? asPaddingValues.mo711calculateBottomPaddingD9Ej5fM() : subcomposeMeasureScope.mo364toDpu2uoSUM(mo6234measureBRTryo04.getHeight())));
        final Placeable mo6234measureBRTryo05 = ((Measurable) yi.p0(subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.MainContent, myVar5))).mo6234measureBRTryo0(m7554copyZbe2FdA$default);
        final int i6 = i5;
        return MeasureScope.layout$default(subcomposeMeasureScope, m7564getMaxWidthimpl, m7563getMaxHeightimpl, null, new ky() { // from class: ol0
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 ScaffoldLayout_FMILGgc$lambda$15$lambda$14$lambda$13;
                ScaffoldLayout_FMILGgc$lambda$15$lambda$14$lambda$13 = ScaffoldKt.ScaffoldLayout_FMILGgc$lambda$15$lambda$14$lambda$13(Placeable.this, mo6234measureBRTryo0, mo6234measureBRTryo02, m7564getMaxWidthimpl, windowInsets, subcomposeMeasureScope, m7563getMaxHeightimpl, i6, mo6234measureBRTryo04, fabPlacement2, mo6234measureBRTryo03, num2, (Placeable.PlacementScope) obj);
                return ScaffoldLayout_FMILGgc$lambda$15$lambda$14$lambda$13;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ScaffoldLayout_FMILGgc$lambda$15$lambda$14$lambda$13(Placeable placeable, Placeable placeable2, Placeable placeable3, int i, WindowInsets windowInsets, SubcomposeMeasureScope subcomposeMeasureScope, int i2, int i3, Placeable placeable4, FabPlacement fabPlacement, Placeable placeable5, Integer num, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        Placeable.PlacementScope.place$default(placementScope, placeable2, 0, 0, 0.0f, 4, null);
        Placeable.PlacementScope.place$default(placementScope, placeable3, ((windowInsets.getLeft(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection()) + (i - placeable3.getWidth())) - windowInsets.getRight(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection())) / 2, i2 - i3, 0.0f, 4, null);
        Placeable.PlacementScope.place$default(placementScope, placeable4, 0, i2 - placeable4.getHeight(), 0.0f, 4, null);
        if (fabPlacement != null) {
            int left = fabPlacement.getLeft();
            num.getClass();
            Placeable.PlacementScope.place$default(placementScope, placeable5, left, i2 - num.intValue(), 0.0f, 4, null);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ScaffoldLayout_FMILGgc$lambda$16(int i, my myVar, ny nyVar, my myVar2, my myVar3, WindowInsets windowInsets, my myVar4, int i2, Composer composer, int i3) {
        m2301ScaffoldLayoutFMILGgc(i, myVar, nyVar, myVar2, myVar3, windowInsets, myVar4, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Scaffold_TvnljyQ$lambda$2$lambda$1(MutableWindowInsets mutableWindowInsets, WindowInsets windowInsets, WindowInsets windowInsets2) {
        mutableWindowInsets.setInsets(WindowInsetsKt.exclude(windowInsets, windowInsets2));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Scaffold_TvnljyQ$lambda$3(Modifier modifier, my myVar, my myVar2, my myVar3, my myVar4, int i, long j, long j2, WindowInsets windowInsets, ny nyVar, int i2, int i3, Composer composer, int i4) {
        m2300ScaffoldTvnljyQ(modifier, myVar, myVar2, myVar3, myVar4, i, j, j2, windowInsets, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return w01.a;
    }
}
