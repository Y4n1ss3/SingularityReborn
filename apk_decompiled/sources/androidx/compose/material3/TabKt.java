package androidx.compose.material3;

import androidx.compose.animation.ColorVectorConverterKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.TabKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import defpackage.bt0;
import defpackage.iy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.my;
import defpackage.ny;
import defpackage.q10;
import defpackage.q6;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TabKt {
    private static final float SmallTabHeight = PrimaryNavigationTabTokens.INSTANCE.m3592getContainerHeightD9Ej5fM();
    private static final float LargeTabHeight = Dp.m7611constructorimpl(72.0f);
    private static final float HorizontalTextPadding = Dp.m7611constructorimpl(16.0f);
    private static final float SingleLineTextBaselineWithIcon = Dp.m7611constructorimpl(14.0f);
    private static final float DoubleLineTextBaselineWithIcon = Dp.m7611constructorimpl(6.0f);
    private static final long IconDistanceFromBaseline = TextUnitKt.getSp(20);
    private static final float TextDistanceFromLeadingIcon = Dp.m7611constructorimpl(8.0f);

    /* JADX WARN: Removed duplicated region for block: B:100:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00e4  */
    /* renamed from: LeadingIconTab-wqdebIU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2496LeadingIconTabwqdebIU(boolean z, iy iyVar, final my myVar, my myVar2, Modifier modifier, boolean z2, long j, long j2, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2) {
        final boolean z3;
        int i3;
        final iy iyVar2;
        my myVar3;
        int i4;
        Modifier modifier2;
        int i5;
        boolean z4;
        long j3;
        int i6;
        int i7;
        int i8;
        Composer composer2;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier3;
        boolean z5;
        long j4;
        ScopeUpdateScope endRestartGroup;
        long j5;
        final MutableInteractionSource mutableInteractionSource3;
        Composer startRestartGroup = composer.startRestartGroup(-611535578);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changed(z3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            iyVar2 = iyVar;
        } else {
            iyVar2 = iyVar;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changedInstance(iyVar2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(myVar) ? Fields.RotationX : Fields.SpotShadowColor;
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                myVar3 = myVar2;
                i3 |= startRestartGroup.changedInstance(myVar3) ? Fields.CameraDistance : Fields.RotationZ;
                i4 = i2 & 16;
                if (i4 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= startRestartGroup.changed(modifier2) ? Fields.Clip : 8192;
                    i5 = i2 & 32;
                    if (i5 == 0) {
                        i3 |= 196608;
                    } else if ((196608 & i) == 0) {
                        z4 = z2;
                        i3 |= startRestartGroup.changed(z4) ? Fields.RenderEffect : 65536;
                        if ((1572864 & i) == 0) {
                            j3 = j;
                            i3 |= ((i2 & 64) == 0 && startRestartGroup.changed(j3)) ? 1048576 : Fields.BlendMode;
                        } else {
                            j3 = j;
                        }
                        if ((12582912 & i) == 0) {
                            i6 = i3 | (((i2 & Fields.SpotShadowColor) == 0 && startRestartGroup.changed(j2)) ? GroupFlagsKt.IsNodeFlag : 4194304);
                        } else {
                            i6 = i3;
                        }
                        i7 = i2 & Fields.RotationX;
                        if (i7 != 0) {
                            i6 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i8 = i7;
                            i6 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                            if (startRestartGroup.shouldExecute((i6 & 38347923) == 38347922, i6 & 1)) {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                mutableInteractionSource2 = mutableInteractionSource;
                                modifier3 = modifier2;
                                z5 = z4;
                                j4 = j2;
                            } else {
                                startRestartGroup.startDefaults();
                                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    if (i4 != 0) {
                                        modifier2 = Modifier.Companion;
                                    }
                                    if (i5 != 0) {
                                        z4 = true;
                                    }
                                    if ((i2 & 64) != 0) {
                                        j3 = ((Color) startRestartGroup.consume(ContentColorKt.getLocalContentColor())).m4771unboximpl();
                                        i6 &= -3670017;
                                    }
                                    if ((i2 & Fields.SpotShadowColor) != 0) {
                                        i6 &= -29360129;
                                        j5 = j3;
                                    } else {
                                        j5 = j2;
                                    }
                                    if (i8 != 0) {
                                        mutableInteractionSource3 = null;
                                        final boolean z6 = z4;
                                        int i9 = i6;
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-611535578, i9, -1, "androidx.compose.material3.LeadingIconTab (Tab.kt:164)");
                                        }
                                        final IndicationNodeFactory m2297rippleH2RKhps$default = RippleKt.m2297rippleH2RKhps$default(true, 0.0f, j3, 2, null);
                                        final Modifier modifier4 = modifier2;
                                        final my myVar4 = myVar3;
                                        int i10 = i9 >> 18;
                                        m2499TabTransitionKlgxPg(j3, j5, z, ComposableLambdaKt.rememberComposableLambda(1831009258, true, new my() { // from class: androidx.compose.material3.TabKt$LeadingIconTab$1
                                            public final void invoke(Composer composer3, int i11) {
                                                float f;
                                                float f2;
                                                if (!composer3.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1831009258, i11, -1, "androidx.compose.material3.LeadingIconTab.<anonymous> (Tab.kt:171)");
                                                }
                                                Modifier modifier5 = Modifier.this;
                                                f = TabKt.SmallTabHeight;
                                                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m764paddingVpY3zN4$default(SelectableKt.m1018selectableO2vRcR0(SizeKt.m793height3ABfNKs(modifier5, f), z3, mutableInteractionSource3, m2297rippleH2RKhps$default, z6, Role.m6821boximpl(Role.Companion.m6835getTabo7Vup1c()), iyVar2), TabKt.getHorizontalTextPadding(), 0.0f, 2, null), 0.0f, 1, null);
                                                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                                Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                                                my myVar5 = myVar4;
                                                my myVar6 = myVar;
                                                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer3, 54);
                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default);
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
                                                my b = k4.b(companion, m3878constructorimpl, rowMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                                                if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                                                }
                                                Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
                                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                myVar5.invoke(composer3, 0);
                                                Modifier.Companion companion2 = Modifier.Companion;
                                                f2 = TabKt.TextDistanceFromLeadingIcon;
                                                SpacerKt.Spacer(SizeKt.m804requiredWidth3ABfNKs(companion2, f2), composer3, 6);
                                                TextKt.ProvideTextStyle(TextStyle.m7073copyp1EtxEg$default(TypographyKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getLabelTextFont(), composer3, 6), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.Companion.m7489getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), myVar6, composer3, 0);
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
                                        }, startRestartGroup, 54), startRestartGroup, ((i9 << 6) & 896) | (i10 & 112) | (i10 & 14) | 3072);
                                        composer2 = startRestartGroup;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        modifier3 = modifier4;
                                        mutableInteractionSource2 = mutableInteractionSource3;
                                        z5 = z6;
                                        j4 = j5;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 64) != 0) {
                                        i6 &= -3670017;
                                    }
                                    if ((i2 & Fields.SpotShadowColor) != 0) {
                                        i6 &= -29360129;
                                    }
                                    j5 = j2;
                                }
                                mutableInteractionSource3 = mutableInteractionSource;
                                final boolean z62 = z4;
                                int i92 = i6;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                final IndicationNodeFactory m2297rippleH2RKhps$default2 = RippleKt.m2297rippleH2RKhps$default(true, 0.0f, j3, 2, null);
                                final Modifier modifier42 = modifier2;
                                final my myVar42 = myVar3;
                                int i102 = i92 >> 18;
                                m2499TabTransitionKlgxPg(j3, j5, z, ComposableLambdaKt.rememberComposableLambda(1831009258, true, new my() { // from class: androidx.compose.material3.TabKt$LeadingIconTab$1
                                    public final void invoke(Composer composer3, int i11) {
                                        float f;
                                        float f2;
                                        if (!composer3.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1831009258, i11, -1, "androidx.compose.material3.LeadingIconTab.<anonymous> (Tab.kt:171)");
                                        }
                                        Modifier modifier5 = Modifier.this;
                                        f = TabKt.SmallTabHeight;
                                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m764paddingVpY3zN4$default(SelectableKt.m1018selectableO2vRcR0(SizeKt.m793height3ABfNKs(modifier5, f), z3, mutableInteractionSource3, m2297rippleH2RKhps$default2, z62, Role.m6821boximpl(Role.Companion.m6835getTabo7Vup1c()), iyVar2), TabKt.getHorizontalTextPadding(), 0.0f, 2, null), 0.0f, 1, null);
                                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
                                        my myVar5 = myVar42;
                                        my myVar6 = myVar;
                                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer3, 54);
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default);
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
                                        my b = k4.b(companion, m3878constructorimpl, rowMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                                        if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                                        }
                                        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        myVar5.invoke(composer3, 0);
                                        Modifier.Companion companion2 = Modifier.Companion;
                                        f2 = TabKt.TextDistanceFromLeadingIcon;
                                        SpacerKt.Spacer(SizeKt.m804requiredWidth3ABfNKs(companion2, f2), composer3, 6);
                                        TextKt.ProvideTextStyle(TextStyle.m7073copyp1EtxEg$default(TypographyKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getLabelTextFont(), composer3, 6), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.Companion.m7489getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), myVar6, composer3, 0);
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
                                }, startRestartGroup, 54), startRestartGroup, ((i92 << 6) & 896) | (i102 & 112) | (i102 & 14) | 3072);
                                composer2 = startRestartGroup;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier42;
                                mutableInteractionSource2 = mutableInteractionSource3;
                                z5 = z62;
                                j4 = j5;
                            }
                            long j6 = j3;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new bt0(z, iyVar, myVar, myVar2, modifier3, z5, j6, j4, mutableInteractionSource2, i, i2));
                                return;
                            }
                            return;
                        }
                        i8 = i7;
                        if (startRestartGroup.shouldExecute((i6 & 38347923) == 38347922, i6 & 1)) {
                        }
                        long j62 = j3;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    z4 = z2;
                    if ((1572864 & i) == 0) {
                    }
                    if ((12582912 & i) == 0) {
                    }
                    i7 = i2 & Fields.RotationX;
                    if (i7 != 0) {
                    }
                    i8 = i7;
                    if (startRestartGroup.shouldExecute((i6 & 38347923) == 38347922, i6 & 1)) {
                    }
                    long j622 = j3;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                modifier2 = modifier;
                i5 = i2 & 32;
                if (i5 == 0) {
                }
                z4 = z2;
                if ((1572864 & i) == 0) {
                }
                if ((12582912 & i) == 0) {
                }
                i7 = i2 & Fields.RotationX;
                if (i7 != 0) {
                }
                i8 = i7;
                if (startRestartGroup.shouldExecute((i6 & 38347923) == 38347922, i6 & 1)) {
                }
                long j6222 = j3;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            myVar3 = myVar2;
            i4 = i2 & 16;
            if (i4 != 0) {
            }
            modifier2 = modifier;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            z4 = z2;
            if ((1572864 & i) == 0) {
            }
            if ((12582912 & i) == 0) {
            }
            i7 = i2 & Fields.RotationX;
            if (i7 != 0) {
            }
            i8 = i7;
            if (startRestartGroup.shouldExecute((i6 & 38347923) == 38347922, i6 & 1)) {
            }
            long j62222 = j3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 8) == 0) {
        }
        myVar3 = myVar2;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        z4 = z2;
        if ((1572864 & i) == 0) {
        }
        if ((12582912 & i) == 0) {
        }
        i7 = i2 & Fields.RotationX;
        if (i7 != 0) {
        }
        i8 = i7;
        if (startRestartGroup.shouldExecute((i6 & 38347923) == 38347922, i6 & 1)) {
        }
        long j622222 = j3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LeadingIconTab_wqdebIU$lambda$2(boolean z, iy iyVar, my myVar, my myVar2, Modifier modifier, boolean z2, long j, long j2, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        m2496LeadingIconTabwqdebIU(z, iyVar, myVar, myVar2, modifier, z2, j, j2, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00bb  */
    /* renamed from: Tab-bogVsAg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2497TabbogVsAg(final boolean z, final iy iyVar, Modifier modifier, boolean z2, long j, long j2, MutableInteractionSource mutableInteractionSource, final ny nyVar, Composer composer, final int i, final int i2) {
        boolean z3;
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        boolean z4;
        long j3;
        long j4;
        int i6;
        int i7;
        final Modifier modifier3;
        Composer composer2;
        final boolean z5;
        final long j5;
        final long j6;
        final MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        int i8;
        final Modifier modifier4;
        long j7;
        final MutableInteractionSource mutableInteractionSource3;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-1573136853);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changed(z3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(iyVar) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    z4 = z2;
                    i3 |= startRestartGroup.changed(z4) ? Fields.CameraDistance : Fields.RotationZ;
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            j3 = j;
                            if (startRestartGroup.changed(j3)) {
                                i10 = Fields.Clip;
                                i3 |= i10;
                            }
                        } else {
                            j3 = j;
                        }
                        i10 = 8192;
                        i3 |= i10;
                    } else {
                        j3 = j;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            j4 = j2;
                            if (startRestartGroup.changed(j4)) {
                                i9 = Fields.RenderEffect;
                                i3 |= i9;
                            }
                        } else {
                            j4 = j2;
                        }
                        i9 = 65536;
                        i3 |= i9;
                    } else {
                        j4 = j2;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(mutableInteractionSource) ? 1048576 : Fields.BlendMode;
                    }
                    if ((i2 & Fields.SpotShadowColor) == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changedInstance(nyVar) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        i7 = i3;
                        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i7 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i4 != 0) {
                                    modifier2 = Modifier.Companion;
                                }
                                if (i5 != 0) {
                                    z4 = true;
                                }
                                if ((i2 & 16) != 0) {
                                    j3 = ((Color) startRestartGroup.consume(ContentColorKt.getLocalContentColor())).m4771unboximpl();
                                    i8 = i7 & (-57345);
                                } else {
                                    i8 = i7;
                                }
                                if ((i2 & 32) != 0) {
                                    i8 &= -458753;
                                    j4 = j3;
                                }
                                if (i6 != 0) {
                                    modifier4 = modifier2;
                                    j7 = j4;
                                    mutableInteractionSource3 = null;
                                    final boolean z6 = z4;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1573136853, i8, -1, "androidx.compose.material3.Tab (Tab.kt:237)");
                                    }
                                    final IndicationNodeFactory m2297rippleH2RKhps$default = RippleKt.m2297rippleH2RKhps$default(true, 0.0f, j3, 2, null);
                                    final boolean z7 = z3;
                                    int i11 = i8 >> 12;
                                    m2499TabTransitionKlgxPg(j3, j7, z, ComposableLambdaKt.rememberComposableLambda(1128552423, true, new my() { // from class: androidx.compose.material3.TabKt$Tab$3
                                        public final void invoke(Composer composer3, int i12) {
                                            if (!composer3.shouldExecute((i12 & 3) != 2, i12 & 1)) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1128552423, i12, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:244)");
                                            }
                                            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m1018selectableO2vRcR0(Modifier.this, z7, mutableInteractionSource3, m2297rippleH2RKhps$default, z6, Role.m6821boximpl(Role.Companion.m6835getTabo7Vup1c()), iyVar), 0.0f, 1, null);
                                            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
                                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                            ny nyVar2 = nyVar;
                                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer3, 54);
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default);
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
                                            my b = k4.b(companion, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                                            if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                                            }
                                            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
                                            nyVar2.invoke(ColumnScopeInstance.INSTANCE, composer3, 6);
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
                                    }, startRestartGroup, 54), startRestartGroup, (i11 & 112) | (i11 & 14) | 3072 | ((i8 << 6) & 896));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    composer2 = startRestartGroup;
                                    j5 = j3;
                                    mutableInteractionSource2 = mutableInteractionSource3;
                                    j6 = j7;
                                    modifier3 = modifier4;
                                    z5 = z6;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                i8 = (i2 & 16) != 0 ? i7 & (-57345) : i7;
                                if ((i2 & 32) != 0) {
                                    i8 &= -458753;
                                }
                            }
                            modifier4 = modifier2;
                            j7 = j4;
                            mutableInteractionSource3 = mutableInteractionSource;
                            final boolean z62 = z4;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            final IndicationNodeFactory m2297rippleH2RKhps$default2 = RippleKt.m2297rippleH2RKhps$default(true, 0.0f, j3, 2, null);
                            final boolean z72 = z3;
                            int i112 = i8 >> 12;
                            m2499TabTransitionKlgxPg(j3, j7, z, ComposableLambdaKt.rememberComposableLambda(1128552423, true, new my() { // from class: androidx.compose.material3.TabKt$Tab$3
                                public final void invoke(Composer composer3, int i12) {
                                    if (!composer3.shouldExecute((i12 & 3) != 2, i12 & 1)) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1128552423, i12, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:244)");
                                    }
                                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(SelectableKt.m1018selectableO2vRcR0(Modifier.this, z72, mutableInteractionSource3, m2297rippleH2RKhps$default2, z62, Role.m6821boximpl(Role.Companion.m6835getTabo7Vup1c()), iyVar), 0.0f, 1, null);
                                    Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
                                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                    ny nyVar2 = nyVar;
                                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composer3, 54);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default);
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
                                    my b = k4.b(companion, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                                    if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                                    }
                                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
                                    nyVar2.invoke(ColumnScopeInstance.INSTANCE, composer3, 6);
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
                            }, startRestartGroup, 54), startRestartGroup, (i112 & 112) | (i112 & 14) | 3072 | ((i8 << 6) & 896));
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer2 = startRestartGroup;
                            j5 = j3;
                            mutableInteractionSource2 = mutableInteractionSource3;
                            j6 = j7;
                            modifier3 = modifier4;
                            z5 = z62;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            composer2 = startRestartGroup;
                            z5 = z4;
                            j5 = j3;
                            j6 = j4;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new my() { // from class: at0
                                @Override // defpackage.my
                                public final Object invoke(Object obj, Object obj2) {
                                    w01 Tab_bogVsAg$lambda$3;
                                    int intValue = ((Integer) obj2).intValue();
                                    Tab_bogVsAg$lambda$3 = TabKt.Tab_bogVsAg$lambda$3(z, iyVar, modifier3, z5, j5, j6, mutableInteractionSource2, nyVar, i, i2, (Composer) obj, intValue);
                                    return Tab_bogVsAg$lambda$3;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i7 = i3;
                    if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i7 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z4 = z2;
                if ((i & 24576) != 0) {
                }
                if ((196608 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i2 & Fields.SpotShadowColor) == 0) {
                }
                i7 = i3;
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i7 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z4 = z2;
            if ((i & 24576) != 0) {
            }
            if ((196608 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i2 & Fields.SpotShadowColor) == 0) {
            }
            i7 = i3;
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i7 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z4 = z2;
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i2 & Fields.SpotShadowColor) == 0) {
        }
        i7 = i3;
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i7 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00fd  */
    /* renamed from: Tab-wqdebIU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2498TabwqdebIU(boolean z, iy iyVar, Modifier modifier, boolean z2, my myVar, my myVar2, long j, long j2, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2) {
        boolean z3;
        int i3;
        iy iyVar2;
        Modifier modifier2;
        int i4;
        boolean z4;
        int i5;
        final my myVar3;
        int i6;
        final my myVar4;
        int i7;
        int i8;
        int i9;
        int i10;
        Composer composer2;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier3;
        boolean z5;
        my myVar5;
        my myVar6;
        long j3;
        long j4;
        ScopeUpdateScope endRestartGroup;
        long j5;
        long j6;
        boolean z6;
        final ComposableLambda composableLambda;
        long j7;
        long j8;
        int i11;
        MutableInteractionSource mutableInteractionSource3;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(1015017965);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 6) == 0) {
                i3 = (startRestartGroup.changed(z3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            iyVar2 = iyVar;
        } else {
            iyVar2 = iyVar;
            if ((i & 48) == 0) {
                i3 |= startRestartGroup.changedInstance(iyVar2) ? 32 : 16;
            }
        }
        int i14 = i2 & 4;
        if (i14 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z4 = z2;
                i3 |= startRestartGroup.changed(z4) ? Fields.CameraDistance : Fields.RotationZ;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    myVar3 = myVar;
                    i3 |= startRestartGroup.changedInstance(myVar3) ? Fields.Clip : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((196608 & i) == 0) {
                        myVar4 = myVar2;
                        i3 |= startRestartGroup.changedInstance(myVar4) ? Fields.RenderEffect : 65536;
                        if ((1572864 & i) == 0) {
                            if ((i2 & 64) == 0) {
                                i12 = i3;
                                i8 = i14;
                                if (startRestartGroup.changed(j)) {
                                    i13 = 1048576;
                                    i7 = i12 | i13;
                                }
                            } else {
                                i12 = i3;
                                i8 = i14;
                            }
                            i13 = Fields.BlendMode;
                            i7 = i12 | i13;
                        } else {
                            i7 = i3;
                            i8 = i14;
                        }
                        if ((i & 12582912) == 0) {
                            i7 |= ((i2 & Fields.SpotShadowColor) == 0 && startRestartGroup.changed(j2)) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        }
                        i9 = i2 & Fields.RotationX;
                        if (i9 != 0) {
                            i7 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i10 = i9;
                            i7 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                            if (startRestartGroup.shouldExecute((i7 & 38347923) == 38347922, i7 & 1)) {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                mutableInteractionSource2 = mutableInteractionSource;
                                modifier3 = modifier2;
                                z5 = z4;
                                myVar5 = myVar3;
                                myVar6 = myVar4;
                                j3 = j;
                                j4 = j2;
                            } else {
                                startRestartGroup.startDefaults();
                                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    if (i8 != 0) {
                                        modifier2 = Modifier.Companion;
                                    }
                                    if (i4 != 0) {
                                        z4 = true;
                                    }
                                    if (i5 != 0) {
                                        myVar3 = null;
                                    }
                                    if (i6 != 0) {
                                        myVar4 = null;
                                    }
                                    if ((i2 & 64) != 0) {
                                        j5 = ((Color) startRestartGroup.consume(ContentColorKt.getLocalContentColor())).m4771unboximpl();
                                        i7 &= -3670017;
                                    } else {
                                        j5 = j;
                                    }
                                    if ((i2 & Fields.SpotShadowColor) != 0) {
                                        i7 &= -29360129;
                                        j6 = j5;
                                    } else {
                                        j6 = j2;
                                    }
                                    z6 = z4;
                                    composableLambda = null;
                                    if (i10 != 0) {
                                        j7 = j5;
                                        i11 = 1015017965;
                                        mutableInteractionSource3 = null;
                                        j8 = j6;
                                    } else {
                                        j7 = j5;
                                        j8 = j6;
                                        i11 = 1015017965;
                                        mutableInteractionSource3 = mutableInteractionSource;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 64) != 0) {
                                        i7 &= -3670017;
                                    }
                                    if ((i2 & Fields.SpotShadowColor) != 0) {
                                        i7 &= -29360129;
                                    }
                                    j7 = j;
                                    mutableInteractionSource3 = mutableInteractionSource;
                                    z6 = z4;
                                    composableLambda = null;
                                    i11 = 1015017965;
                                    j8 = j2;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(i11, i7, -1, "androidx.compose.material3.Tab (Tab.kt:100)");
                                }
                                if (myVar3 == null) {
                                    startRestartGroup.startReplaceGroup(1830899669);
                                } else {
                                    startRestartGroup.startReplaceGroup(1830899670);
                                    composableLambda = ComposableLambdaKt.rememberComposableLambda(-1745256900, true, new my() { // from class: androidx.compose.material3.TabKt$Tab$styledText$1$1
                                        public final void invoke(Composer composer3, int i15) {
                                            if (!composer3.shouldExecute((i15 & 3) != 2, i15 & 1)) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1745256900, i15, -1, "androidx.compose.material3.Tab.<anonymous>.<anonymous> (Tab.kt:104)");
                                            }
                                            TextKt.ProvideTextStyle(TextStyle.m7073copyp1EtxEg$default(TypographyKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getLabelTextFont(), composer3, 6), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.Companion.m7489getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), my.this, composer3, 0);
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
                                }
                                startRestartGroup.endReplaceGroup();
                                int i15 = i7 >> 6;
                                composer2 = startRestartGroup;
                                m2497TabbogVsAg(z3, iyVar2, BadgeKt.badgeBounds(modifier2), z6, j7, j8, mutableInteractionSource3, ComposableLambdaKt.rememberComposableLambda(-906085472, true, new ny() { // from class: androidx.compose.material3.TabKt$Tab$1
                                    public final void invoke(ColumnScope columnScope, Composer composer3, int i16) {
                                        if (!composer3.shouldExecute((i16 & 17) != 16, i16 & 1)) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-906085472, i16, -1, "androidx.compose.material3.Tab.<anonymous> (Tab.kt:120)");
                                        }
                                        TabKt.TabBaselineLayout(my.this, myVar4, composer3, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // defpackage.ny
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                                        invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
                                        return w01.a;
                                    }
                                }, startRestartGroup, 54), composer2, (i7 & 14) | 12582912 | (i7 & 112) | (i7 & 7168) | (57344 & i15) | (458752 & i15) | (i15 & 3670016), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier2;
                                myVar5 = myVar3;
                                myVar6 = myVar4;
                                z5 = z6;
                                j3 = j7;
                                j4 = j8;
                                mutableInteractionSource2 = mutableInteractionSource3;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new bt0(z, iyVar, modifier3, z5, myVar5, myVar6, j3, j4, mutableInteractionSource2, i, i2));
                                return;
                            }
                            return;
                        }
                        i10 = i9;
                        if (startRestartGroup.shouldExecute((i7 & 38347923) == 38347922, i7 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    myVar4 = myVar2;
                    if ((1572864 & i) == 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    i9 = i2 & Fields.RotationX;
                    if (i9 != 0) {
                    }
                    i10 = i9;
                    if (startRestartGroup.shouldExecute((i7 & 38347923) == 38347922, i7 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                myVar3 = myVar;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                myVar4 = myVar2;
                if ((1572864 & i) == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i9 = i2 & Fields.RotationX;
                if (i9 != 0) {
                }
                i10 = i9;
                if (startRestartGroup.shouldExecute((i7 & 38347923) == 38347922, i7 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z4 = z2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            myVar3 = myVar;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            myVar4 = myVar2;
            if ((1572864 & i) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i9 = i2 & Fields.RotationX;
            if (i9 != 0) {
            }
            i10 = i9;
            if (startRestartGroup.shouldExecute((i7 & 38347923) == 38347922, i7 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z4 = z2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        myVar3 = myVar;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        myVar4 = myVar2;
        if ((1572864 & i) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i9 = i2 & Fields.RotationX;
        if (i9 != 0) {
        }
        i10 = i9;
        if (startRestartGroup.shouldExecute((i7 & 38347923) == 38347922, i7 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TabBaselineLayout(my myVar, my myVar2, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1349901398);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(myVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar2) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1349901398, i2, -1, "androidx.compose.material3.TabBaselineLayout (Tab.kt:300)");
            }
            int i3 = i2 & 14;
            boolean z = (i3 == 4) | ((i2 & 112) == 32);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new TabKt$TabBaselineLayout$2$1(myVar, myVar2);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
            Modifier.Companion companion = Modifier.Companion;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            my b = k4.b(companion2, m3878constructorimpl, measurePolicy, m3878constructorimpl, currentCompositionLocalMap);
            if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
            }
            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion2.getSetModifier());
            if (myVar != null) {
                startRestartGroup.startReplaceGroup(870361332);
                Modifier m764paddingVpY3zN4$default = PaddingKt.m764paddingVpY3zN4$default(LayoutIdKt.layoutId(companion, "text"), HorizontalTextPadding, 0.0f, 2, null);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m764paddingVpY3zN4$default);
                iy constructor2 = companion2.getConstructor();
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
                my b2 = k4.b(companion2, m3878constructorimpl2, maybeCachedBoxMeasurePolicy, m3878constructorimpl2, currentCompositionLocalMap2);
                if (m3878constructorimpl2.getInserting() || !q10.b(m3878constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    k4.j(b2, currentCompositeKeyHash2, m3878constructorimpl2, currentCompositeKeyHash2);
                }
                Updater.m3886setimpl(m3878constructorimpl2, materializeModifier2, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                kf0.f(myVar, startRestartGroup, i3);
            } else {
                startRestartGroup.startReplaceGroup(870466081);
                startRestartGroup.endReplaceGroup();
            }
            if (myVar2 != null) {
                startRestartGroup.startReplaceGroup(870494880);
                Modifier layoutId = LayoutIdKt.layoutId(companion, "icon");
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, layoutId);
                iy constructor3 = companion2.getConstructor();
                if (startRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m3878constructorimpl3 = Updater.m3878constructorimpl(startRestartGroup);
                my b3 = k4.b(companion2, m3878constructorimpl3, maybeCachedBoxMeasurePolicy2, m3878constructorimpl3, currentCompositionLocalMap3);
                if (m3878constructorimpl3.getInserting() || !q10.b(m3878constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    k4.j(b3, currentCompositeKeyHash3, m3878constructorimpl3, currentCompositeKeyHash3);
                }
                Updater.m3886setimpl(m3878constructorimpl3, materializeModifier3, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                kf0.f(myVar2, startRestartGroup, (i2 >> 3) & 14);
            } else {
                startRestartGroup.startReplaceGroup(870557345);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new q6(myVar, myVar2, i, 28));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TabBaselineLayout$lambda$11(my myVar, my myVar2, int i, Composer composer, int i2) {
        TabBaselineLayout(myVar, myVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* renamed from: TabTransition-Klgx-Pg, reason: not valid java name */
    private static final void m2499TabTransitionKlgxPg(final long j, final long j2, boolean z, final my myVar, Composer composer, final int i) {
        int i2;
        final boolean z2;
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-833145221);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= startRestartGroup.changed(z2) ? Fields.RotationX : Fields.SpotShadowColor;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if (startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-833145221, i2, -1, "androidx.compose.material3.TabTransition (Tab.kt:274)");
            }
            int i4 = i2 >> 6;
            Transition updateTransition = TransitionKt.updateTransition(Boolean.valueOf(z2), (String) null, startRestartGroup, i4 & 14, 2);
            TabKt$TabTransition$color$2 tabKt$TabTransition$color$2 = new ny() { // from class: androidx.compose.material3.TabKt$TabTransition$color$2
                public final FiniteAnimationSpec<Color> invoke(Transition.Segment<Boolean> segment, Composer composer2, int i5) {
                    FiniteAnimationSpec<Color> value;
                    composer2.startReplaceGroup(1058649156);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1058649156, i5, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:280)");
                    }
                    if (segment.isTransitioningTo(Boolean.FALSE, Boolean.TRUE)) {
                        composer2.startReplaceGroup(272207019);
                        value = MotionSchemeKt.value(MotionSchemeKeyTokens.DefaultEffects, composer2, 6);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(272326989);
                        value = MotionSchemeKt.value(MotionSchemeKeyTokens.FastEffects, composer2, 6);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return value;
                }

                @Override // defpackage.ny
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke((Transition.Segment<Boolean>) obj, (Composer) obj2, ((Number) obj3).intValue());
                }
            };
            boolean booleanValue = ((Boolean) updateTransition.getTargetState()).booleanValue();
            startRestartGroup.startReplaceGroup(-1069234984);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1069234984, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:289)");
            }
            long j3 = booleanValue ? j : j2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            ColorSpace m4765getColorSpaceimpl = Color.m4765getColorSpaceimpl(j3);
            boolean changed = startRestartGroup.changed(m4765getColorSpaceimpl);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.Companion).invoke(m4765getColorSpaceimpl);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            TwoWayConverter twoWayConverter = (TwoWayConverter) rememberedValue;
            boolean booleanValue2 = ((Boolean) updateTransition.getCurrentState()).booleanValue();
            startRestartGroup.startReplaceGroup(-1069234984);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1069234984, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:289)");
            }
            long j4 = booleanValue2 ? j : j2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            Color m4751boximpl = Color.m4751boximpl(j4);
            boolean booleanValue3 = ((Boolean) updateTransition.getTargetState()).booleanValue();
            startRestartGroup.startReplaceGroup(-1069234984);
            if (ComposerKt.isTraceInProgress()) {
                i3 = i4;
                ComposerKt.traceEventStart(-1069234984, 0, -1, "androidx.compose.material3.TabTransition.<anonymous> (Tab.kt:289)");
            } else {
                i3 = i4;
            }
            long j5 = booleanValue3 ? j : j2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            startRestartGroup.endReplaceGroup();
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4751boximpl(TabTransition_Klgx_Pg$lambda$5(TransitionKt.createTransitionAnimation(updateTransition, m4751boximpl, Color.m4751boximpl(j5), (FiniteAnimationSpec) tabKt$TabTransition$color$2.invoke((Object) updateTransition.getSegment(), (Object) startRestartGroup, (Object) 0), twoWayConverter, "ColorAnimation", startRestartGroup, 0)))), myVar, startRestartGroup, ProvidedValue.$stable | (i3 & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new my() { // from class: ct0
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 TabTransition_Klgx_Pg$lambda$6;
                    int intValue = ((Integer) obj2).intValue();
                    TabTransition_Klgx_Pg$lambda$6 = TabKt.TabTransition_Klgx_Pg$lambda$6(j, j2, z2, myVar, i, (Composer) obj, intValue);
                    return TabTransition_Klgx_Pg$lambda$6;
                }
            });
        }
    }

    private static final long TabTransition_Klgx_Pg$lambda$5(State<Color> state) {
        return state.getValue().m4771unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 TabTransition_Klgx_Pg$lambda$6(long j, long j2, boolean z, my myVar, int i, Composer composer, int i2) {
        m2499TabTransitionKlgxPg(j, j2, z, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Tab_bogVsAg$lambda$3(boolean z, iy iyVar, Modifier modifier, boolean z2, long j, long j2, MutableInteractionSource mutableInteractionSource, ny nyVar, int i, int i2, Composer composer, int i3) {
        m2497TabbogVsAg(z, iyVar, modifier, z2, j, j2, mutableInteractionSource, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Tab_wqdebIU$lambda$1(boolean z, iy iyVar, Modifier modifier, boolean z2, my myVar, my myVar2, long j, long j2, MutableInteractionSource mutableInteractionSource, int i, int i2, Composer composer, int i3) {
        m2498TabwqdebIU(z, iyVar, modifier, z2, myVar, myVar2, j, j2, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    public static final float getHorizontalTextPadding() {
        return HorizontalTextPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeTextAndIcon(Placeable.PlacementScope placementScope, Density density, Placeable placeable, Placeable placeable2, int i, int i2, int i3, int i4) {
        int mo361roundToPx0680j_4 = density.mo361roundToPx0680j_4(PrimaryNavigationTabTokens.INSTANCE.m3590getActiveIndicatorHeightD9Ej5fM()) + density.mo361roundToPx0680j_4(i3 == i4 ? SingleLineTextBaselineWithIcon : DoubleLineTextBaselineWithIcon);
        int mo360roundToPxR2X_6o = (density.mo360roundToPxR2X_6o(IconDistanceFromBaseline) + placeable2.getHeight()) - i3;
        int i5 = (i2 - i4) - mo361roundToPx0680j_4;
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, j50.p(i, 2, placeable), i5, 0.0f, 4, null);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, j50.p(i, 2, placeable2), i5 - mo360roundToPxR2X_6o, 0.0f, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeTextOrIcon(Placeable.PlacementScope placementScope, Placeable placeable, int i) {
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, j50.c(i, 2, placeable), 0.0f, 4, null);
    }
}
