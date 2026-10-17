package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import defpackage.ig;
import defpackage.iy;
import defpackage.jg;
import defpackage.k4;
import defpackage.kg;
import defpackage.lg;
import defpackage.my;
import defpackage.ny;
import defpackage.q10;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CardKt {
    /* JADX WARN: Removed duplicated region for block: B:107:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Card(iy iyVar, Modifier modifier, boolean z, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final ny nyVar, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        CardColors cardColors2;
        int i5;
        BorderStroke borderStroke2;
        int i6;
        Composer composer2;
        CardElevation cardElevation2;
        Modifier modifier3;
        boolean z3;
        Shape shape3;
        CardColors cardColors3;
        BorderStroke borderStroke3;
        MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        CardColors cardColors4;
        Composer composer3;
        boolean z4;
        int i7;
        CardElevation cardElevation3;
        Modifier modifier4;
        Shape shape4;
        BorderStroke borderStroke4;
        int i8;
        boolean z5;
        MutableInteractionSource mutableInteractionSource3;
        MutableInteractionSource mutableInteractionSource4;
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(2136075085);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(iyVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? Fields.RotationX : Fields.SpotShadowColor;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i11 = Fields.CameraDistance;
                            i3 |= i11;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i11 = Fields.RotationZ;
                    i3 |= i11;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        cardColors2 = cardColors;
                        if (startRestartGroup.changed(cardColors2)) {
                            i10 = Fields.Clip;
                            i3 |= i10;
                        }
                    } else {
                        cardColors2 = cardColors;
                    }
                    i10 = 8192;
                    i3 |= i10;
                } else {
                    cardColors2 = cardColors;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0 && startRestartGroup.changed(cardElevation)) {
                        i9 = Fields.RenderEffect;
                        i3 |= i9;
                    }
                    i9 = 65536;
                    i3 |= i9;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    borderStroke2 = borderStroke;
                    i3 |= startRestartGroup.changed(borderStroke2) ? 1048576 : Fields.BlendMode;
                    i6 = i2 & Fields.SpotShadowColor;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changed(mutableInteractionSource) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    }
                    if ((i2 & Fields.RotationX) == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= startRestartGroup.changedInstance(nyVar) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                    }
                    if (startRestartGroup.shouldExecute((38347923 & i3) == 38347922, i3 & 1)) {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        cardElevation2 = cardElevation;
                        modifier3 = modifier2;
                        z3 = z2;
                        shape3 = shape2;
                        cardColors3 = cardColors2;
                        borderStroke3 = borderStroke;
                        mutableInteractionSource2 = mutableInteractionSource;
                    } else {
                        startRestartGroup.startDefaults();
                        if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i12 != 0) {
                                modifier2 = Modifier.Companion;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                                shape2 = CardDefaults.INSTANCE.getShape(startRestartGroup, 6);
                            }
                            if ((i2 & 16) != 0) {
                                cardColors4 = CardDefaults.INSTANCE.cardColors(startRestartGroup, 6);
                                i3 &= -57345;
                            } else {
                                cardColors4 = cardColors2;
                            }
                            if ((i2 & 32) != 0) {
                                z4 = true;
                                i7 = i6;
                                cardElevation3 = CardDefaults.INSTANCE.m1679cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                                composer3 = startRestartGroup;
                                i3 &= -458753;
                            } else {
                                composer3 = startRestartGroup;
                                z4 = true;
                                i7 = i6;
                                cardElevation3 = cardElevation;
                            }
                            BorderStroke borderStroke5 = i5 != 0 ? null : borderStroke;
                            if (i7 != 0) {
                                Modifier modifier5 = modifier2;
                                i8 = i3;
                                mutableInteractionSource3 = null;
                                modifier4 = modifier5;
                                shape4 = shape2;
                                borderStroke4 = borderStroke5;
                                z5 = z2;
                                composer3.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2136075085, i8, -1, "androidx.compose.material3.Card (Card.kt:145)");
                                }
                                if (mutableInteractionSource3 != null) {
                                    composer3.startReplaceGroup(1577885006);
                                    Object rememberedValue = composer3.rememberedValue();
                                    if (rememberedValue == Composer.Companion.getEmpty()) {
                                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composer3.updateRememberedValue(rememberedValue);
                                    }
                                    mutableInteractionSource4 = (MutableInteractionSource) rememberedValue;
                                    composer3.endReplaceGroup();
                                } else {
                                    composer3.startReplaceGroup(-226195799);
                                    composer3.endReplaceGroup();
                                    mutableInteractionSource4 = mutableInteractionSource3;
                                }
                                composer2 = composer3;
                                SurfaceKt.m2467Surfaceo_FOJdg(iyVar, modifier4, z5, shape4, cardColors4.m1671containerColorvNxB06k$material3(z5), cardColors4.m1672contentColorvNxB06k$material3(z5), 0.0f, cardElevation3.shadowElevation$material3(z5, mutableInteractionSource4, composer3, ((i8 >> 6) & 14) | ((i8 >> 9) & 896)).getValue().m7625unboximpl(), borderStroke4, mutableInteractionSource4, ComposableLambdaKt.rememberComposableLambda(-1347531112, z4, new my() { // from class: androidx.compose.material3.CardKt$Card$3
                                    public final void invoke(Composer composer4, int i13) {
                                        if (!composer4.shouldExecute((i13 & 3) != 2, i13 & 1)) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1347531112, i13, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:159)");
                                        }
                                        ny nyVar2 = ny.this;
                                        Modifier.Companion companion = Modifier.Companion;
                                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer4, 0);
                                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer4, companion);
                                        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                                        iy constructor = companion2.getConstructor();
                                        if (composer4.getApplier() == null) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer m3878constructorimpl = Updater.m3878constructorimpl(composer4);
                                        my b = k4.b(companion2, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                                        if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                                        }
                                        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion2.getSetModifier());
                                        nyVar2.invoke(ColumnScopeInstance.INSTANCE, composer4, 6);
                                        composer4.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    @Override // defpackage.my
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((Composer) obj, ((Number) obj2).intValue());
                                        return w01.a;
                                    }
                                }, composer3, 54), composer2, (i8 & 8190) | (234881024 & (i8 << 6)), 6, 64);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                cardColors3 = cardColors4;
                                cardElevation2 = cardElevation3;
                                mutableInteractionSource2 = mutableInteractionSource3;
                                modifier3 = modifier4;
                                z3 = z5;
                                shape3 = shape4;
                                borderStroke3 = borderStroke4;
                            } else {
                                modifier4 = modifier2;
                                shape4 = shape2;
                                borderStroke4 = borderStroke5;
                                i8 = i3;
                                z5 = z2;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            shape4 = shape2;
                            cardColors4 = cardColors2;
                            z4 = true;
                            borderStroke4 = borderStroke2;
                            composer3 = startRestartGroup;
                            modifier4 = modifier2;
                            z5 = z2;
                            cardElevation3 = cardElevation;
                            i8 = i3;
                        }
                        mutableInteractionSource3 = mutableInteractionSource;
                        composer3.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        if (mutableInteractionSource3 != null) {
                        }
                        composer2 = composer3;
                        SurfaceKt.m2467Surfaceo_FOJdg(iyVar, modifier4, z5, shape4, cardColors4.m1671containerColorvNxB06k$material3(z5), cardColors4.m1672contentColorvNxB06k$material3(z5), 0.0f, cardElevation3.shadowElevation$material3(z5, mutableInteractionSource4, composer3, ((i8 >> 6) & 14) | ((i8 >> 9) & 896)).getValue().m7625unboximpl(), borderStroke4, mutableInteractionSource4, ComposableLambdaKt.rememberComposableLambda(-1347531112, z4, new my() { // from class: androidx.compose.material3.CardKt$Card$3
                            public final void invoke(Composer composer4, int i13) {
                                if (!composer4.shouldExecute((i13 & 3) != 2, i13 & 1)) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1347531112, i13, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:159)");
                                }
                                ny nyVar2 = ny.this;
                                Modifier.Companion companion = Modifier.Companion;
                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer4, 0);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer4, companion);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                                iy constructor = companion2.getConstructor();
                                if (composer4.getApplier() == null) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor);
                                } else {
                                    composer4.useNode();
                                }
                                Composer m3878constructorimpl = Updater.m3878constructorimpl(composer4);
                                my b = k4.b(companion2, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                                if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                                }
                                Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion2.getSetModifier());
                                nyVar2.invoke(ColumnScopeInstance.INSTANCE, composer4, 6);
                                composer4.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // defpackage.my
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return w01.a;
                            }
                        }, composer3, 54), composer2, (i8 & 8190) | (234881024 & (i8 << 6)), 6, 64);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        cardColors3 = cardColors4;
                        cardElevation2 = cardElevation3;
                        mutableInteractionSource2 = mutableInteractionSource3;
                        modifier3 = modifier4;
                        z3 = z5;
                        shape3 = shape4;
                        borderStroke3 = borderStroke4;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new ig(iyVar, modifier3, z3, shape3, cardColors3, cardElevation2, borderStroke3, mutableInteractionSource2, nyVar, i, i2, 0));
                        return;
                    }
                    return;
                }
                borderStroke2 = borderStroke;
                i6 = i2 & Fields.SpotShadowColor;
                if (i6 == 0) {
                }
                if ((i2 & Fields.RotationX) == 0) {
                }
                if (startRestartGroup.shouldExecute((38347923 & i3) == 38347922, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            borderStroke2 = borderStroke;
            i6 = i2 & Fields.SpotShadowColor;
            if (i6 == 0) {
            }
            if ((i2 & Fields.RotationX) == 0) {
            }
            if (startRestartGroup.shouldExecute((38347923 & i3) == 38347922, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        borderStroke2 = borderStroke;
        i6 = i2 & Fields.SpotShadowColor;
        if (i6 == 0) {
        }
        if ((i2 & Fields.RotationX) == 0) {
        }
        if (startRestartGroup.shouldExecute((38347923 & i3) == 38347922, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Card$lambda$0(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, ny nyVar, int i, int i2, Composer composer, int i3) {
        Card(modifier, shape, cardColors, cardElevation, borderStroke, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Card$lambda$2(iy iyVar, Modifier modifier, boolean z, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, ny nyVar, int i, int i2, Composer composer, int i3) {
        Card(iyVar, modifier, z, shape, cardColors, cardElevation, borderStroke, mutableInteractionSource, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ElevatedCard(iy iyVar, Modifier modifier, boolean z, Shape shape, CardColors cardColors, CardElevation cardElevation, MutableInteractionSource mutableInteractionSource, ny nyVar, Composer composer, int i, int i2) {
        iy iyVar2;
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        CardColors cardColors2;
        CardElevation cardElevation2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        Modifier modifier3;
        boolean z3;
        Shape shape3;
        CardColors cardColors3;
        CardElevation cardElevation3;
        MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        CardColors cardColors4;
        Composer composer3;
        CardColors cardColors5;
        boolean z4;
        Shape shape4;
        CardElevation cardElevation4;
        Composer composer4;
        MutableInteractionSource mutableInteractionSource4;
        Modifier modifier4;
        int i6;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-129138571);
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
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? Fields.RotationX : Fields.SpotShadowColor;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i8 = Fields.CameraDistance;
                            i3 |= i8;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i8 = Fields.RotationZ;
                    i3 |= i8;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        cardColors2 = cardColors;
                        if (startRestartGroup.changed(cardColors2)) {
                            i7 = Fields.Clip;
                            i3 |= i7;
                        }
                    } else {
                        cardColors2 = cardColors;
                    }
                    i7 = 8192;
                    i3 |= i7;
                } else {
                    cardColors2 = cardColors;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        cardElevation2 = cardElevation;
                        if (startRestartGroup.changed(cardElevation2)) {
                            i6 = Fields.RenderEffect;
                            i3 |= i6;
                        }
                    } else {
                        cardElevation2 = cardElevation;
                    }
                    i6 = 65536;
                    i3 |= i6;
                } else {
                    cardElevation2 = cardElevation;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? 1048576 : Fields.BlendMode;
                    if ((i2 & Fields.SpotShadowColor) == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changedInstance(nyVar) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        if (startRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i9 != 0) {
                                    modifier2 = Modifier.Companion;
                                }
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                    shape2 = CardDefaults.INSTANCE.getElevatedShape(startRestartGroup, 6);
                                }
                                if ((i2 & 16) != 0) {
                                    cardColors4 = CardDefaults.INSTANCE.elevatedCardColors(startRestartGroup, 6);
                                    i3 &= -57345;
                                } else {
                                    cardColors4 = cardColors2;
                                }
                                if ((i2 & 32) != 0) {
                                    composer3 = startRestartGroup;
                                    i3 &= -458753;
                                    cardElevation2 = CardDefaults.INSTANCE.m1681elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer3, 1572864, 63);
                                } else {
                                    composer3 = startRestartGroup;
                                }
                                if (i5 != 0) {
                                    cardColors5 = cardColors4;
                                    z4 = z2;
                                    shape4 = shape2;
                                    cardElevation4 = cardElevation2;
                                    composer4 = composer3;
                                    mutableInteractionSource4 = null;
                                } else {
                                    cardColors5 = cardColors4;
                                    z4 = z2;
                                    shape4 = shape2;
                                    cardElevation4 = cardElevation2;
                                    composer4 = composer3;
                                    mutableInteractionSource4 = mutableInteractionSource;
                                }
                                modifier4 = modifier2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                composer4 = startRestartGroup;
                                shape4 = shape2;
                                cardColors5 = cardColors2;
                                cardElevation4 = cardElevation2;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                modifier4 = modifier2;
                                z4 = z2;
                            }
                            composer4.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-129138571, i3, -1, "androidx.compose.material3.ElevatedCard (Card.kt:250)");
                            }
                            int i10 = i3 << 3;
                            Card(iyVar2, modifier4, z4, shape4, cardColors5, cardElevation4, null, mutableInteractionSource4, nyVar, composer4, (i3 & 14) | 1572864 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (29360128 & i10) | (i10 & 234881024), 0);
                            MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource4;
                            composer2 = composer4;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            mutableInteractionSource3 = mutableInteractionSource5;
                            modifier3 = modifier4;
                            z3 = z4;
                            shape3 = shape4;
                            cardColors3 = cardColors5;
                            cardElevation3 = cardElevation4;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier3 = modifier2;
                            z3 = z2;
                            shape3 = shape2;
                            cardColors3 = cardColors2;
                            cardElevation3 = cardElevation2;
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kg(iyVar, modifier3, z3, shape3, cardColors3, cardElevation3, mutableInteractionSource3, nyVar, i, i2, 0));
                            return;
                        }
                        return;
                    }
                    if (startRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i2 & Fields.SpotShadowColor) == 0) {
                }
                if (startRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & Fields.SpotShadowColor) == 0) {
            }
            if (startRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & Fields.SpotShadowColor) == 0) {
        }
        if (startRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ElevatedCard$lambda$3(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, ny nyVar, int i, int i2, Composer composer, int i3) {
        ElevatedCard(modifier, shape, cardColors, cardElevation, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ElevatedCard$lambda$4(iy iyVar, Modifier modifier, boolean z, Shape shape, CardColors cardColors, CardElevation cardElevation, MutableInteractionSource mutableInteractionSource, ny nyVar, int i, int i2, Composer composer, int i3) {
        ElevatedCard(iyVar, modifier, z, shape, cardColors, cardElevation, mutableInteractionSource, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedCard(iy iyVar, Modifier modifier, boolean z, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, ny nyVar, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Shape shape2;
        CardColors cardColors2;
        CardElevation cardElevation2;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        Composer composer2;
        Modifier modifier3;
        boolean z3;
        Shape shape3;
        CardColors cardColors3;
        CardElevation cardElevation3;
        BorderStroke borderStroke2;
        MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope endRestartGroup;
        Composer composer3;
        int i6;
        int i7;
        BorderStroke borderStroke3;
        MutableInteractionSource mutableInteractionSource4;
        BorderStroke borderStroke4;
        Modifier modifier4;
        boolean z4;
        Shape shape4;
        CardColors cardColors4;
        CardElevation cardElevation4;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(1401605899);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(iyVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? Fields.RotationX : Fields.SpotShadowColor;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        if (startRestartGroup.changed(shape2)) {
                            i11 = Fields.CameraDistance;
                            i3 |= i11;
                        }
                    } else {
                        shape2 = shape;
                    }
                    i11 = Fields.RotationZ;
                    i3 |= i11;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        cardColors2 = cardColors;
                        if (startRestartGroup.changed(cardColors2)) {
                            i10 = Fields.Clip;
                            i3 |= i10;
                        }
                    } else {
                        cardColors2 = cardColors;
                    }
                    i10 = 8192;
                    i3 |= i10;
                } else {
                    cardColors2 = cardColors;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        cardElevation2 = cardElevation;
                        if (startRestartGroup.changed(cardElevation2)) {
                            i9 = Fields.RenderEffect;
                            i3 |= i9;
                        }
                    } else {
                        cardElevation2 = cardElevation;
                    }
                    i9 = 65536;
                    i3 |= i9;
                } else {
                    cardElevation2 = cardElevation;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0 && startRestartGroup.changed(borderStroke)) {
                        i8 = 1048576;
                        i3 |= i8;
                    }
                    i8 = Fields.BlendMode;
                    i3 |= i8;
                }
                i5 = i2 & Fields.SpotShadowColor;
                if (i5 != 0) {
                    i3 |= 12582912;
                } else if ((12582912 & i) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(mutableInteractionSource2) ? GroupFlagsKt.IsNodeFlag : 4194304;
                    if ((i2 & Fields.RotationX) == 0) {
                        i3 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i3 |= startRestartGroup.changedInstance(nyVar) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                if (i12 != 0) {
                                    modifier2 = Modifier.Companion;
                                }
                                if (i4 != 0) {
                                    z2 = true;
                                }
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                    shape2 = CardDefaults.INSTANCE.getOutlinedShape(startRestartGroup, 6);
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                    cardColors2 = CardDefaults.INSTANCE.outlinedCardColors(startRestartGroup, 6);
                                }
                                if ((i2 & 32) != 0) {
                                    i6 = 0;
                                    i7 = i5;
                                    composer3 = startRestartGroup;
                                    i3 &= -458753;
                                    cardElevation2 = CardDefaults.INSTANCE.m1683outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                                } else {
                                    composer3 = startRestartGroup;
                                    i6 = 0;
                                    i7 = i5;
                                }
                                if ((i2 & 64) != 0) {
                                    borderStroke3 = CardDefaults.INSTANCE.outlinedCardBorder(z2, composer3, ((i3 >> 6) & 14) | 48, i6);
                                    i3 &= -3670017;
                                } else {
                                    borderStroke3 = borderStroke;
                                }
                                if (i7 != 0) {
                                    borderStroke4 = borderStroke3;
                                    mutableInteractionSource4 = null;
                                } else {
                                    mutableInteractionSource4 = mutableInteractionSource;
                                    borderStroke4 = borderStroke3;
                                }
                                modifier4 = modifier2;
                                z4 = z2;
                                shape4 = shape2;
                                cardColors4 = cardColors2;
                                cardElevation4 = cardElevation2;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 8) != 0) {
                                    i3 &= -7169;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                borderStroke4 = borderStroke;
                                composer3 = startRestartGroup;
                                modifier4 = modifier2;
                                z4 = z2;
                                cardColors4 = cardColors2;
                                cardElevation4 = cardElevation2;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                shape4 = shape2;
                            }
                            composer3.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1401605899, i3, -1, "androidx.compose.material3.OutlinedCard (Card.kt:353)");
                            }
                            composer2 = composer3;
                            Card(iyVar, modifier4, z4, shape4, cardColors4, cardElevation4, borderStroke4, mutableInteractionSource4, nyVar, composer2, i3 & 268435454, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            z3 = z4;
                            shape3 = shape4;
                            cardColors3 = cardColors4;
                            cardElevation3 = cardElevation4;
                            borderStroke2 = borderStroke4;
                            mutableInteractionSource3 = mutableInteractionSource4;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier3 = modifier2;
                            z3 = z2;
                            shape3 = shape2;
                            cardColors3 = cardColors2;
                            cardElevation3 = cardElevation2;
                            borderStroke2 = borderStroke;
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new ig(iyVar, modifier3, z3, shape3, cardColors3, cardElevation3, borderStroke2, mutableInteractionSource3, nyVar, i, i2, 1));
                            return;
                        }
                        return;
                    }
                    if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i2 & Fields.RotationX) == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            i5 = i2 & Fields.SpotShadowColor;
            if (i5 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i2 & Fields.RotationX) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        i5 = i2 & Fields.SpotShadowColor;
        if (i5 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i2 & Fields.RotationX) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 38347923) != 38347922, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 OutlinedCard$lambda$5(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, ny nyVar, int i, int i2, Composer composer, int i3) {
        OutlinedCard(modifier, shape, cardColors, cardElevation, borderStroke, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 OutlinedCard$lambda$6(iy iyVar, Modifier modifier, boolean z, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, ny nyVar, int i, int i2, Composer composer, int i3) {
        OutlinedCard(iyVar, modifier, z, shape, cardColors, cardElevation, borderStroke, mutableInteractionSource, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ElevatedCard(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, ny nyVar, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Shape shape2;
        CardColors cardColors2;
        CardElevation cardElevation2;
        Composer composer2;
        Modifier modifier3;
        Shape shape3;
        CardColors cardColors3;
        CardElevation cardElevation3;
        ScopeUpdateScope endRestartGroup;
        Shape shape4;
        CardColors cardColors4;
        Composer composer3;
        Shape shape5;
        CardColors cardColors5;
        CardElevation cardElevation4;
        Modifier modifier4;
        int i4;
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(-1464672362);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                shape2 = shape;
                if (startRestartGroup.changed(shape2)) {
                    i6 = 32;
                    i3 |= i6;
                }
            } else {
                shape2 = shape;
            }
            i6 = 16;
            i3 |= i6;
        } else {
            shape2 = shape;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                cardColors2 = cardColors;
                if (startRestartGroup.changed(cardColors2)) {
                    i5 = Fields.RotationX;
                    i3 |= i5;
                }
            } else {
                cardColors2 = cardColors;
            }
            i5 = Fields.SpotShadowColor;
            i3 |= i5;
        } else {
            cardColors2 = cardColors;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                cardElevation2 = cardElevation;
                if (startRestartGroup.changed(cardElevation2)) {
                    i4 = Fields.CameraDistance;
                    i3 |= i4;
                }
            } else {
                cardElevation2 = cardElevation;
            }
            i4 = Fields.RotationZ;
            i3 |= i4;
        } else {
            cardElevation2 = cardElevation;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(nyVar) ? Fields.Clip : 8192;
            if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    shape5 = shape2;
                    cardColors5 = cardColors2;
                    cardElevation4 = cardElevation2;
                    composer3 = startRestartGroup;
                    modifier4 = modifier2;
                } else {
                    Modifier modifier5 = i7 != 0 ? Modifier.Companion : modifier2;
                    if ((i2 & 2) != 0) {
                        shape4 = CardDefaults.INSTANCE.getElevatedShape(startRestartGroup, 6);
                        i3 &= -113;
                    } else {
                        shape4 = shape2;
                    }
                    if ((i2 & 4) != 0) {
                        cardColors4 = CardDefaults.INSTANCE.elevatedCardColors(startRestartGroup, 6);
                        i3 &= -897;
                    } else {
                        cardColors4 = cardColors2;
                    }
                    if ((i2 & 8) != 0) {
                        composer3 = startRestartGroup;
                        i3 &= -7169;
                        modifier4 = modifier5;
                        shape5 = shape4;
                        cardColors5 = cardColors4;
                        cardElevation4 = CardDefaults.INSTANCE.m1681elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer3, 1572864, 63);
                    } else {
                        composer3 = startRestartGroup;
                        shape5 = shape4;
                        cardColors5 = cardColors4;
                        cardElevation4 = cardElevation2;
                        modifier4 = modifier5;
                    }
                }
                composer3.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1464672362, i3, -1, "androidx.compose.material3.ElevatedCard (Card.kt:197)");
                }
                Composer composer4 = composer3;
                Card(modifier4, shape5, cardColors5, cardElevation4, null, nyVar, composer4, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | ((i3 << 3) & 458752), 0);
                composer2 = composer4;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                shape3 = shape5;
                cardColors3 = cardColors5;
                cardElevation3 = cardElevation4;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
                shape3 = shape2;
                cardColors3 = cardColors2;
                cardElevation3 = cardElevation2;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new lg(modifier3, shape3, cardColors3, cardElevation3, nyVar, i, i2, 0));
                return;
            }
            return;
        }
        if (!startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OutlinedCard(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, ny nyVar, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Shape shape2;
        CardColors cardColors2;
        CardElevation cardElevation2;
        BorderStroke borderStroke2;
        Composer composer2;
        Modifier modifier3;
        Shape shape3;
        CardColors cardColors3;
        CardElevation cardElevation3;
        BorderStroke borderStroke3;
        ScopeUpdateScope endRestartGroup;
        Shape shape4;
        CardColors cardColors4;
        boolean z;
        int i4;
        Composer composer3;
        BorderStroke borderStroke4;
        Modifier modifier4;
        Shape shape5;
        CardColors cardColors5;
        CardElevation cardElevation4;
        int i5;
        int i6;
        int i7;
        int i8;
        Composer startRestartGroup = composer.startRestartGroup(-1945643296);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                shape2 = shape;
                if (startRestartGroup.changed(shape2)) {
                    i8 = 32;
                    i3 |= i8;
                }
            } else {
                shape2 = shape;
            }
            i8 = 16;
            i3 |= i8;
        } else {
            shape2 = shape;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                cardColors2 = cardColors;
                if (startRestartGroup.changed(cardColors2)) {
                    i7 = Fields.RotationX;
                    i3 |= i7;
                }
            } else {
                cardColors2 = cardColors;
            }
            i7 = Fields.SpotShadowColor;
            i3 |= i7;
        } else {
            cardColors2 = cardColors;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                cardElevation2 = cardElevation;
                if (startRestartGroup.changed(cardElevation2)) {
                    i6 = Fields.CameraDistance;
                    i3 |= i6;
                }
            } else {
                cardElevation2 = cardElevation;
            }
            i6 = Fields.RotationZ;
            i3 |= i6;
        } else {
            cardElevation2 = cardElevation;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                borderStroke2 = borderStroke;
                if (startRestartGroup.changed(borderStroke2)) {
                    i5 = Fields.Clip;
                    i3 |= i5;
                }
            } else {
                borderStroke2 = borderStroke;
            }
            i5 = 8192;
            i3 |= i5;
        } else {
            borderStroke2 = borderStroke;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= startRestartGroup.changedInstance(nyVar) ? Fields.RenderEffect : 65536;
            if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    shape5 = shape2;
                    cardColors5 = cardColors2;
                    cardElevation4 = cardElevation2;
                    borderStroke4 = borderStroke2;
                    composer3 = startRestartGroup;
                    modifier4 = modifier2;
                } else {
                    Modifier modifier5 = i9 != 0 ? Modifier.Companion : modifier2;
                    if ((i2 & 2) != 0) {
                        shape4 = CardDefaults.INSTANCE.getOutlinedShape(startRestartGroup, 6);
                        i3 &= -113;
                    } else {
                        shape4 = shape2;
                    }
                    if ((i2 & 4) != 0) {
                        cardColors4 = CardDefaults.INSTANCE.outlinedCardColors(startRestartGroup, 6);
                        i3 &= -897;
                    } else {
                        cardColors4 = cardColors2;
                    }
                    if ((i2 & 8) != 0) {
                        z = false;
                        composer3 = startRestartGroup;
                        i3 &= -7169;
                        i4 = 1;
                        cardElevation2 = CardDefaults.INSTANCE.m1683outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer3, 1572864, 63);
                    } else {
                        z = false;
                        i4 = 1;
                        composer3 = startRestartGroup;
                    }
                    if ((i2 & 16) != 0) {
                        BorderStroke outlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(z, composer3, 48, i4);
                        i3 &= -57345;
                        modifier4 = modifier5;
                        shape5 = shape4;
                        cardColors5 = cardColors4;
                        borderStroke4 = outlinedCardBorder;
                    } else {
                        borderStroke4 = borderStroke;
                        modifier4 = modifier5;
                        shape5 = shape4;
                        cardColors5 = cardColors4;
                    }
                    cardElevation4 = cardElevation2;
                }
                composer3.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1945643296, i3, -1, "androidx.compose.material3.OutlinedCard (Card.kt:298)");
                }
                Composer composer4 = composer3;
                Card(modifier4, shape5, cardColors5, cardElevation4, borderStroke4, nyVar, composer4, 524286 & i3, 0);
                composer2 = composer4;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                shape3 = shape5;
                cardColors3 = cardColors5;
                cardElevation3 = cardElevation4;
                borderStroke3 = borderStroke4;
            } else {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
                shape3 = shape2;
                cardColors3 = cardColors2;
                cardElevation3 = cardElevation2;
                borderStroke3 = borderStroke;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new jg(modifier3, shape3, cardColors3, cardElevation3, borderStroke3, nyVar, i, i2, 0));
                return;
            }
            return;
        }
        if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Card(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, final ny nyVar, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Shape shape2;
        CardColors cardColors2;
        CardElevation cardElevation2;
        BorderStroke borderStroke2;
        Modifier modifier3;
        Shape shape3;
        CardColors cardColors3;
        CardElevation cardElevation3;
        BorderStroke borderStroke3;
        ScopeUpdateScope endRestartGroup;
        Shape shape4;
        CardColors cardColors4;
        boolean z;
        Modifier modifier4;
        CardElevation cardElevation4;
        BorderStroke borderStroke4;
        Shape shape5;
        int i4;
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(1359693790);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                shape2 = shape;
                if (startRestartGroup.changed(shape2)) {
                    i6 = 32;
                    i3 |= i6;
                }
            } else {
                shape2 = shape;
            }
            i6 = 16;
            i3 |= i6;
        } else {
            shape2 = shape;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                cardColors2 = cardColors;
                if (startRestartGroup.changed(cardColors2)) {
                    i5 = Fields.RotationX;
                    i3 |= i5;
                }
            } else {
                cardColors2 = cardColors;
            }
            i5 = Fields.SpotShadowColor;
            i3 |= i5;
        } else {
            cardColors2 = cardColors;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                cardElevation2 = cardElevation;
                if (startRestartGroup.changed(cardElevation2)) {
                    i4 = Fields.CameraDistance;
                    i3 |= i4;
                }
            } else {
                cardElevation2 = cardElevation;
            }
            i4 = Fields.RotationZ;
            i3 |= i4;
        } else {
            cardElevation2 = cardElevation;
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            borderStroke2 = borderStroke;
            i3 |= startRestartGroup.changed(borderStroke2) ? Fields.Clip : 8192;
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                i3 |= startRestartGroup.changedInstance(nyVar) ? Fields.RenderEffect : 65536;
            }
            if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    cardElevation4 = cardElevation2;
                    borderStroke4 = borderStroke2;
                    modifier4 = modifier2;
                    shape5 = shape2;
                    cardColors4 = cardColors2;
                    z = true;
                } else {
                    Modifier modifier5 = i7 != 0 ? Modifier.Companion : modifier2;
                    if ((i2 & 2) != 0) {
                        shape4 = CardDefaults.INSTANCE.getShape(startRestartGroup, 6);
                        i3 &= -113;
                    } else {
                        shape4 = shape2;
                    }
                    if ((i2 & 4) != 0) {
                        cardColors4 = CardDefaults.INSTANCE.cardColors(startRestartGroup, 6);
                        i3 &= -897;
                    } else {
                        cardColors4 = cardColors2;
                    }
                    if ((i2 & 8) != 0) {
                        z = true;
                        cardElevation2 = CardDefaults.INSTANCE.m1679cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                        i3 &= -7169;
                    } else {
                        z = true;
                    }
                    CardElevation cardElevation5 = cardElevation2;
                    modifier4 = modifier5;
                    cardElevation4 = cardElevation5;
                    if (i8 != 0) {
                        shape5 = shape4;
                        borderStroke4 = null;
                    } else {
                        borderStroke4 = borderStroke;
                        shape5 = shape4;
                    }
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1359693790, i3, -1, "androidx.compose.material3.Card (Card.kt:86)");
                }
                SurfaceKt.m2464SurfaceT9BRK9s(modifier4, shape5, cardColors4.m1671containerColorvNxB06k$material3(z), cardColors4.m1672contentColorvNxB06k$material3(z), 0.0f, cardElevation4.shadowElevation$material3(z, null, startRestartGroup, ((i3 >> 3) & 896) | 54).getValue().m7625unboximpl(), borderStroke4, ComposableLambdaKt.rememberComposableLambda(-97109725, z, new my() { // from class: androidx.compose.material3.CardKt$Card$1
                    public final void invoke(Composer composer2, int i9) {
                        if (!composer2.shouldExecute((i9 & 3) != 2, i9 & 1)) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-97109725, i9, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:95)");
                        }
                        ny nyVar2 = ny.this;
                        Modifier.Companion companion = Modifier.Companion;
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer2, 0);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                        iy constructor = companion2.getConstructor();
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
                        my b = k4.b(companion2, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                        if (m3878constructorimpl.getInserting() || !q10.b(m3878constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            k4.j(b, currentCompositeKeyHash, m3878constructorimpl, currentCompositeKeyHash);
                        }
                        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion2.getSetModifier());
                        nyVar2.invoke(ColumnScopeInstance.INSTANCE, composer2, 6);
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
                }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 12582912 | (i3 & 112) | (3670016 & (i3 << 6)), 16);
                startRestartGroup = startRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                cardColors3 = cardColors4;
                shape3 = shape5;
                borderStroke3 = borderStroke4;
                cardElevation3 = cardElevation4;
                modifier3 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                shape3 = shape2;
                cardColors3 = cardColors2;
                cardElevation3 = cardElevation2;
                borderStroke3 = borderStroke;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new jg(modifier3, shape3, cardColors3, cardElevation3, borderStroke3, nyVar, i, i2, 1));
                return;
            }
            return;
        }
        borderStroke2 = borderStroke;
        if ((i2 & 32) == 0) {
        }
        if (!startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
