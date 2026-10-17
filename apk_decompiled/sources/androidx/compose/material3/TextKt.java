package androidx.compose.material3;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.TextUnit;
import defpackage.dq;
import defpackage.er;
import defpackage.ky;
import defpackage.my;
import defpackage.pu0;
import defpackage.q6;
import defpackage.qu0;
import defpackage.sn0;
import defpackage.vt;
import defpackage.vt0;
import defpackage.w01;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextKt {
    private static final ProvidableCompositionLocal<TextStyle> LocalTextStyle = CompositionLocalKt.compositionLocalOf(SnapshotStateKt.structuralEqualityPolicy(), new sn0(10));

    public static final void ProvideTextStyle(TextStyle textStyle, my myVar, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(15327438);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(textStyle) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(15327438, i2, -1, "androidx.compose.material3.ProvideTextStyle (Text.kt:459)");
            }
            ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
            CompositionLocalKt.CompositionLocalProvider(providableCompositionLocal.provides(((TextStyle) startRestartGroup.consume(providableCompositionLocal)).merge(textStyle)), myVar, startRestartGroup, (i2 & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new q6(textStyle, myVar, i, 29));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ProvideTextStyle$lambda$20(TextStyle textStyle, my myVar, int i, Composer composer, int i2) {
        ProvideTextStyle(textStyle, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    @er
    /* renamed from: Text--4IGK_g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m2604Text4IGK_g(final AnnotatedString annotatedString, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, Map map, ky kyVar, TextStyle textStyle, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        long j5;
        int i8;
        int i9;
        long j6;
        int i10;
        FontStyle fontStyle2;
        int i11;
        FontWeight fontWeight2;
        int i12;
        FontFamily fontFamily2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z2;
        int i25;
        int i26;
        int i27;
        int i28;
        Composer composer2;
        final Modifier modifier2;
        final TextAlign textAlign2;
        final int i29;
        final int i30;
        final Map map2;
        final ky kyVar2;
        final TextStyle textStyle2;
        final boolean z3;
        final long j7;
        final FontStyle fontStyle3;
        final long j8;
        final FontWeight fontWeight3;
        final FontFamily fontFamily3;
        final long j9;
        final TextDecoration textDecoration2;
        final long j10;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier3;
        int i31;
        ky kyVar3;
        TextStyle textStyle3;
        ky kyVar4;
        TextAlign textAlign3;
        long j11;
        Map map3;
        Modifier modifier4;
        int i32;
        long j12;
        boolean z4;
        int i33;
        TextDecoration textDecoration3;
        FontFamily fontFamily4;
        FontStyle fontStyle4;
        long j13;
        FontWeight fontWeight4;
        long j14;
        Composer startRestartGroup = composer.startRestartGroup(224529679);
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i6 = (startRestartGroup.changed(annotatedString) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i34 = i5 & 2;
        if (i34 != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i8 = i6 | 384;
                j5 = j;
            } else {
                int i35 = i6;
                j5 = j;
                if ((i3 & 384) == 0) {
                    i35 |= startRestartGroup.changed(j5) ? Fields.RotationX : Fields.SpotShadowColor;
                }
                i8 = i35;
            }
            i9 = i5 & 8;
            int i36 = Fields.RotationZ;
            if (i9 == 0) {
                i8 |= 3072;
                j6 = j2;
            } else {
                j6 = j2;
                if ((i3 & 3072) == 0) {
                    i8 |= startRestartGroup.changed(j6) ? 2048 : 1024;
                }
            }
            i10 = i5 & 16;
            if (i10 == 0) {
                i8 |= 24576;
            } else if ((i3 & 24576) == 0) {
                fontStyle2 = fontStyle;
                i8 |= startRestartGroup.changed(fontStyle2) ? 16384 : 8192;
                i11 = i5 & 32;
                int i37 = Fields.RenderEffect;
                if (i11 != 0) {
                    i8 |= 196608;
                    fontWeight2 = fontWeight;
                } else {
                    fontWeight2 = fontWeight;
                    if ((i3 & 196608) == 0) {
                        i8 |= startRestartGroup.changed(fontWeight2) ? 131072 : 65536;
                    }
                }
                i12 = i5 & 64;
                int i38 = Fields.BlendMode;
                if (i12 != 0) {
                    i8 |= 1572864;
                    fontFamily2 = fontFamily;
                } else {
                    fontFamily2 = fontFamily;
                    if ((i3 & 1572864) == 0) {
                        i8 |= startRestartGroup.changed(fontFamily2) ? 1048576 : 524288;
                    }
                }
                i13 = i5 & Fields.SpotShadowColor;
                if (i13 != 0) {
                    i8 |= 12582912;
                } else if ((i3 & 12582912) == 0) {
                    i14 = i8 | (startRestartGroup.changed(j3) ? GroupFlagsKt.IsNodeFlag : 4194304);
                    i15 = i5 & Fields.RotationX;
                    if (i15 == 0) {
                        i14 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i16 = i15;
                        i14 |= startRestartGroup.changed(textDecoration) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        i17 = i5 & Fields.RotationY;
                        if (i17 != 0) {
                            i14 |= 805306368;
                            i18 = i17;
                        } else if ((i3 & 805306368) == 0) {
                            i18 = i17;
                            i14 |= startRestartGroup.changed(textAlign) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        } else {
                            i18 = i17;
                        }
                        i19 = i14;
                        i20 = i5 & Fields.RotationZ;
                        if (i20 != 0) {
                            i21 = i4 | 6;
                        } else if ((i4 & 6) == 0) {
                            i21 = i4 | (startRestartGroup.changed(j4) ? 4 : 2);
                        } else {
                            i21 = i4;
                        }
                        i22 = i5 & Fields.CameraDistance;
                        if (i22 != 0) {
                            i21 |= 48;
                            i23 = i22;
                        } else if ((i4 & 48) == 0) {
                            i23 = i22;
                            i21 |= startRestartGroup.changed(i) ? 32 : 16;
                        } else {
                            i23 = i22;
                        }
                        int i39 = i21;
                        i24 = i5 & Fields.TransformOrigin;
                        if (i24 != 0) {
                            i39 |= 384;
                        } else if ((i4 & 384) == 0) {
                            z2 = z;
                            i39 |= startRestartGroup.changed(z2) ? Fields.RotationX : Fields.SpotShadowColor;
                            i25 = i5 & 8192;
                            if (i25 == 0) {
                                i26 = i39 | 3072;
                            } else {
                                int i40 = i39;
                                if ((i4 & 3072) == 0) {
                                    if (startRestartGroup.changed(i2)) {
                                        i36 = 2048;
                                    }
                                    i26 = i40 | i36;
                                } else {
                                    i26 = i40;
                                }
                            }
                            i27 = i5 & Fields.Clip;
                            if (i27 == 0) {
                                i26 |= 24576;
                            } else if ((i4 & 24576) == 0) {
                                i26 |= startRestartGroup.changedInstance(map) ? 16384 : 8192;
                                i28 = i5 & Fields.CompositingStrategy;
                                if (i28 != 0) {
                                    i26 |= 196608;
                                } else if ((i4 & 196608) == 0) {
                                    if (!startRestartGroup.changedInstance(kyVar)) {
                                        i37 = 65536;
                                    }
                                    i26 |= i37;
                                }
                                if ((i4 & 1572864) == 0) {
                                    if ((i5 & 65536) == 0 && startRestartGroup.changed(textStyle)) {
                                        i38 = 1048576;
                                    }
                                    i26 |= i38;
                                }
                                if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (599187 & i26) != 599186, i19 & 1)) {
                                    startRestartGroup.startDefaults();
                                    if ((i3 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                        Modifier modifier5 = i34 != 0 ? Modifier.Companion : modifier;
                                        if (i7 != 0) {
                                            j5 = Color.Companion.m4797getUnspecified0d7_KjU();
                                        }
                                        if (i9 != 0) {
                                            j6 = TextUnit.Companion.m7816getUnspecifiedXSAIIZE();
                                        }
                                        if (i10 != 0) {
                                            fontStyle2 = null;
                                        }
                                        if (i11 != 0) {
                                            fontWeight2 = null;
                                        }
                                        if (i12 != 0) {
                                            fontFamily2 = null;
                                        }
                                        long m7816getUnspecifiedXSAIIZE = i13 != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j3;
                                        TextDecoration textDecoration4 = i16 != 0 ? null : textDecoration;
                                        TextAlign textAlign4 = i18 == 0 ? textAlign : null;
                                        long m7816getUnspecifiedXSAIIZE2 = i20 != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j4;
                                        int m7546getClipgIe3tQ8 = i23 != 0 ? TextOverflow.Companion.m7546getClipgIe3tQ8() : i;
                                        boolean z5 = i24 == 0 ? z2 : true;
                                        int i41 = i25 != 0 ? Integer.MAX_VALUE : i2;
                                        Map map4 = i27 != 0 ? vt.d : map;
                                        if (i28 != 0) {
                                            i31 = -3670017;
                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                            modifier3 = modifier5;
                                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                                rememberedValue = new qu0(3);
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            kyVar3 = (ky) rememberedValue;
                                        } else {
                                            modifier3 = modifier5;
                                            i31 = -3670017;
                                            kyVar3 = kyVar;
                                        }
                                        if ((i5 & 65536) != 0) {
                                            i26 &= i31;
                                            kyVar4 = kyVar3;
                                            textStyle3 = (TextStyle) startRestartGroup.consume(LocalTextStyle);
                                        } else {
                                            textStyle3 = textStyle;
                                            kyVar4 = kyVar3;
                                        }
                                        textAlign3 = textAlign4;
                                        j11 = m7816getUnspecifiedXSAIIZE2;
                                        map3 = map4;
                                        modifier4 = modifier3;
                                        long j15 = m7816getUnspecifiedXSAIIZE;
                                        i32 = i41;
                                        j12 = j5;
                                        z4 = z5;
                                        i33 = m7546getClipgIe3tQ8;
                                        textDecoration3 = textDecoration4;
                                        fontFamily4 = fontFamily2;
                                        long j16 = j6;
                                        fontStyle4 = fontStyle2;
                                        j13 = j16;
                                        fontWeight4 = fontWeight2;
                                        j14 = j15;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i5 & 65536) != 0) {
                                            i26 &= -3670017;
                                        }
                                        long j17 = j6;
                                        fontStyle4 = fontStyle2;
                                        j13 = j17;
                                        modifier4 = modifier;
                                        textDecoration3 = textDecoration;
                                        textAlign3 = textAlign;
                                        j11 = j4;
                                        i33 = i;
                                        i32 = i2;
                                        map3 = map;
                                        kyVar4 = kyVar;
                                        textStyle3 = textStyle;
                                        z4 = z2;
                                        j12 = j5;
                                        fontWeight4 = fontWeight2;
                                        fontFamily4 = fontFamily2;
                                        j14 = j3;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(224529679, i19, i26, "androidx.compose.material3.Text (Text.kt:418)");
                                    }
                                    int i42 = i19 << 3;
                                    int i43 = (i19 & 1022) | (i42 & 57344) | (i42 & 458752) | (i42 & 3670016) | (i42 & 29360128) | (i42 & 234881024) | (i42 & 1879048192);
                                    int i44 = i26 << 3;
                                    int i45 = ((i19 >> 27) & 14) | 196608 | (i44 & 112) | (i44 & 896) | (i44 & 7168) | (i44 & 57344);
                                    int i46 = i26 << 6;
                                    composer2 = startRestartGroup;
                                    m2608TextZ58ophY(annotatedString, modifier4, j12, null, j13, fontStyle4, fontWeight4, fontFamily4, j14, textDecoration3, textAlign3, j11, i33, z4, i32, 1, map3, kyVar4, textStyle3, composer2, i43, i45 | (i46 & 3670016) | (i46 & 29360128) | (i46 & 234881024), 8);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier2 = modifier4;
                                    j7 = j12;
                                    j8 = j13;
                                    fontStyle3 = fontStyle4;
                                    fontWeight3 = fontWeight4;
                                    fontFamily3 = fontFamily4;
                                    j9 = j14;
                                    textDecoration2 = textDecoration3;
                                    textAlign2 = textAlign3;
                                    j10 = j11;
                                    i29 = i33;
                                    z3 = z4;
                                    i30 = i32;
                                    map2 = map3;
                                    kyVar2 = kyVar4;
                                    textStyle2 = textStyle3;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    modifier2 = modifier;
                                    textAlign2 = textAlign;
                                    i29 = i;
                                    i30 = i2;
                                    map2 = map;
                                    kyVar2 = kyVar;
                                    textStyle2 = textStyle;
                                    z3 = z2;
                                    j7 = j5;
                                    fontStyle3 = fontStyle2;
                                    j8 = j6;
                                    fontWeight3 = fontWeight2;
                                    fontFamily3 = fontFamily2;
                                    j9 = j3;
                                    textDecoration2 = textDecoration;
                                    j10 = j4;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new my() { // from class: nu0
                                        @Override // defpackage.my
                                        public final Object invoke(Object obj, Object obj2) {
                                            w01 Text__4IGK_g$lambda$18;
                                            int intValue = ((Integer) obj2).intValue();
                                            Text__4IGK_g$lambda$18 = TextKt.Text__4IGK_g$lambda$18(AnnotatedString.this, modifier2, j7, j8, fontStyle3, fontWeight3, fontFamily3, j9, textDecoration2, textAlign2, j10, i29, z3, i30, map2, kyVar2, textStyle2, i3, i4, i5, (Composer) obj, intValue);
                                            return Text__4IGK_g$lambda$18;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i28 = i5 & Fields.CompositingStrategy;
                            if (i28 != 0) {
                            }
                            if ((i4 & 1572864) == 0) {
                            }
                            if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (599187 & i26) != 599186, i19 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        z2 = z;
                        i25 = i5 & 8192;
                        if (i25 == 0) {
                        }
                        i27 = i5 & Fields.Clip;
                        if (i27 == 0) {
                        }
                        i28 = i5 & Fields.CompositingStrategy;
                        if (i28 != 0) {
                        }
                        if ((i4 & 1572864) == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (599187 & i26) != 599186, i19 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i16 = i15;
                    i17 = i5 & Fields.RotationY;
                    if (i17 != 0) {
                    }
                    i19 = i14;
                    i20 = i5 & Fields.RotationZ;
                    if (i20 != 0) {
                    }
                    i22 = i5 & Fields.CameraDistance;
                    if (i22 != 0) {
                    }
                    int i392 = i21;
                    i24 = i5 & Fields.TransformOrigin;
                    if (i24 != 0) {
                    }
                    z2 = z;
                    i25 = i5 & 8192;
                    if (i25 == 0) {
                    }
                    i27 = i5 & Fields.Clip;
                    if (i27 == 0) {
                    }
                    i28 = i5 & Fields.CompositingStrategy;
                    if (i28 != 0) {
                    }
                    if ((i4 & 1572864) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (599187 & i26) != 599186, i19 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i14 = i8;
                i15 = i5 & Fields.RotationX;
                if (i15 == 0) {
                }
                i16 = i15;
                i17 = i5 & Fields.RotationY;
                if (i17 != 0) {
                }
                i19 = i14;
                i20 = i5 & Fields.RotationZ;
                if (i20 != 0) {
                }
                i22 = i5 & Fields.CameraDistance;
                if (i22 != 0) {
                }
                int i3922 = i21;
                i24 = i5 & Fields.TransformOrigin;
                if (i24 != 0) {
                }
                z2 = z;
                i25 = i5 & 8192;
                if (i25 == 0) {
                }
                i27 = i5 & Fields.Clip;
                if (i27 == 0) {
                }
                i28 = i5 & Fields.CompositingStrategy;
                if (i28 != 0) {
                }
                if ((i4 & 1572864) == 0) {
                }
                if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (599187 & i26) != 599186, i19 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            fontStyle2 = fontStyle;
            i11 = i5 & 32;
            int i372 = Fields.RenderEffect;
            if (i11 != 0) {
            }
            i12 = i5 & 64;
            int i382 = Fields.BlendMode;
            if (i12 != 0) {
            }
            i13 = i5 & Fields.SpotShadowColor;
            if (i13 != 0) {
            }
            i14 = i8;
            i15 = i5 & Fields.RotationX;
            if (i15 == 0) {
            }
            i16 = i15;
            i17 = i5 & Fields.RotationY;
            if (i17 != 0) {
            }
            i19 = i14;
            i20 = i5 & Fields.RotationZ;
            if (i20 != 0) {
            }
            i22 = i5 & Fields.CameraDistance;
            if (i22 != 0) {
            }
            int i39222 = i21;
            i24 = i5 & Fields.TransformOrigin;
            if (i24 != 0) {
            }
            z2 = z;
            i25 = i5 & 8192;
            if (i25 == 0) {
            }
            i27 = i5 & Fields.Clip;
            if (i27 == 0) {
            }
            i28 = i5 & Fields.CompositingStrategy;
            if (i28 != 0) {
            }
            if ((i4 & 1572864) == 0) {
            }
            if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (599187 & i26) != 599186, i19 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i9 = i5 & 8;
        int i362 = Fields.RotationZ;
        if (i9 == 0) {
        }
        i10 = i5 & 16;
        if (i10 == 0) {
        }
        fontStyle2 = fontStyle;
        i11 = i5 & 32;
        int i3722 = Fields.RenderEffect;
        if (i11 != 0) {
        }
        i12 = i5 & 64;
        int i3822 = Fields.BlendMode;
        if (i12 != 0) {
        }
        i13 = i5 & Fields.SpotShadowColor;
        if (i13 != 0) {
        }
        i14 = i8;
        i15 = i5 & Fields.RotationX;
        if (i15 == 0) {
        }
        i16 = i15;
        i17 = i5 & Fields.RotationY;
        if (i17 != 0) {
        }
        i19 = i14;
        i20 = i5 & Fields.RotationZ;
        if (i20 != 0) {
        }
        i22 = i5 & Fields.CameraDistance;
        if (i22 != 0) {
        }
        int i392222 = i21;
        i24 = i5 & Fields.TransformOrigin;
        if (i24 != 0) {
        }
        z2 = z;
        i25 = i5 & 8192;
        if (i25 == 0) {
        }
        i27 = i5 & Fields.Clip;
        if (i27 == 0) {
        }
        i28 = i5 & Fields.CompositingStrategy;
        if (i28 != 0) {
        }
        if ((i4 & 1572864) == 0) {
        }
        if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (599187 & i26) != 599186, i19 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    @er
    /* renamed from: Text-IbK3jfQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m2606TextIbK3jfQ(AnnotatedString annotatedString, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, Map map, ky kyVar, TextStyle textStyle, Composer composer, int i4, int i5, int i6) {
        int i7;
        Modifier modifier2;
        int i8;
        long j5;
        int i9;
        long j6;
        int i10;
        FontStyle fontStyle2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long j7;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        Composer composer2;
        long j8;
        long j9;
        FontWeight fontWeight2;
        FontFamily fontFamily2;
        TextDecoration textDecoration2;
        TextAlign textAlign2;
        int i30;
        boolean z2;
        int i31;
        int i32;
        Map map2;
        ky kyVar2;
        TextStyle textStyle2;
        long j10;
        long j11;
        ScopeUpdateScope endRestartGroup;
        int i33;
        TextAlign textAlign3;
        int i34;
        ky kyVar3;
        TextStyle textStyle3;
        boolean z3;
        TextAlign textAlign4;
        int i35;
        ky kyVar4;
        int i36;
        long j12;
        Modifier modifier3;
        FontWeight fontWeight3;
        FontStyle fontStyle3;
        long j13;
        long j14;
        FontFamily fontFamily3;
        long j15;
        Composer startRestartGroup = composer.startRestartGroup(2027001676);
        if ((i6 & 1) != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i7 = (startRestartGroup.changed(annotatedString) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i37 = i6 & 2;
        if (i37 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            modifier2 = modifier;
            i7 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
                j5 = j;
            } else {
                j5 = j;
                if ((i4 & 384) == 0) {
                    i7 |= startRestartGroup.changed(j5) ? Fields.RotationX : Fields.SpotShadowColor;
                }
            }
            i9 = i6 & 8;
            int i38 = Fields.RotationZ;
            if (i9 == 0) {
                i7 |= 3072;
                j6 = j2;
            } else {
                j6 = j2;
                if ((i4 & 3072) == 0) {
                    i7 |= startRestartGroup.changed(j6) ? 2048 : 1024;
                }
            }
            i10 = i6 & 16;
            if (i10 == 0) {
                i7 |= 24576;
            } else if ((i4 & 24576) == 0) {
                fontStyle2 = fontStyle;
                i7 |= startRestartGroup.changed(fontStyle2) ? 16384 : 8192;
                i11 = i6 & 32;
                if (i11 != 0) {
                    i7 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    i7 |= startRestartGroup.changed(fontWeight) ? 131072 : 65536;
                }
                i12 = i6 & 64;
                int i39 = Fields.BlendMode;
                if (i12 != 0) {
                    i7 |= 1572864;
                } else if ((i4 & 1572864) == 0) {
                    i7 |= startRestartGroup.changed(fontFamily) ? 1048576 : 524288;
                }
                i13 = i6 & Fields.SpotShadowColor;
                int i40 = 4194304;
                if (i13 != 0) {
                    i7 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    i7 |= startRestartGroup.changed(j3) ? 8388608 : 4194304;
                }
                i14 = i6 & Fields.RotationX;
                if (i14 != 0) {
                    i7 |= 100663296;
                } else if ((i4 & 100663296) == 0) {
                    i15 = i14;
                    i7 |= startRestartGroup.changed(textDecoration) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                    i16 = i6 & Fields.RotationY;
                    if (i16 == 0) {
                        i7 |= 805306368;
                    } else if ((i4 & 805306368) == 0) {
                        i17 = i16;
                        i7 |= startRestartGroup.changed(textAlign) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        i18 = i6 & Fields.RotationZ;
                        if (i18 != 0) {
                            i19 = i5 | 6;
                            j7 = j4;
                        } else {
                            j7 = j4;
                            if ((i5 & 6) == 0) {
                                i19 = i5 | (startRestartGroup.changed(j7) ? 4 : 2);
                            } else {
                                i19 = i5;
                            }
                        }
                        i20 = i6 & Fields.CameraDistance;
                        if (i20 != 0) {
                            i19 |= 48;
                            i21 = i20;
                        } else if ((i5 & 48) == 0) {
                            i21 = i20;
                            i19 |= startRestartGroup.changed(i) ? 32 : 16;
                        } else {
                            i21 = i20;
                        }
                        int i41 = i19;
                        i22 = i6 & Fields.TransformOrigin;
                        if (i22 != 0) {
                            i23 = i41 | 384;
                        } else {
                            int i42 = i41;
                            if ((i5 & 384) == 0) {
                                i42 |= startRestartGroup.changed(z) ? Fields.RotationX : Fields.SpotShadowColor;
                            }
                            i23 = i42;
                        }
                        i24 = i6 & 8192;
                        if (i24 != 0) {
                            i25 = i23 | 3072;
                        } else {
                            int i43 = i23;
                            if ((i5 & 3072) == 0) {
                                if (startRestartGroup.changed(i2)) {
                                    i38 = 2048;
                                }
                                i25 = i43 | i38;
                            } else {
                                i25 = i43;
                            }
                        }
                        i26 = i6 & Fields.Clip;
                        if (i26 != 0) {
                            i27 = i25 | 24576;
                        } else {
                            i27 = i25;
                            if ((i5 & 24576) == 0) {
                                i27 |= startRestartGroup.changed(i3) ? 16384 : 8192;
                                i28 = i6 & Fields.CompositingStrategy;
                                if (i28 == 0) {
                                    i27 |= 196608;
                                } else if ((i5 & 196608) == 0) {
                                    i27 |= startRestartGroup.changedInstance(map) ? 131072 : 65536;
                                }
                                i29 = i6 & 65536;
                                if (i29 == 0) {
                                    i27 |= 1572864;
                                } else if ((i5 & 1572864) == 0) {
                                    if (startRestartGroup.changedInstance(kyVar)) {
                                        i39 = 1048576;
                                    }
                                    i27 |= i39;
                                }
                                if ((i5 & 12582912) == 0) {
                                    if ((i6 & Fields.RenderEffect) == 0 && startRestartGroup.changed(textStyle)) {
                                        i40 = 8388608;
                                    }
                                    i27 |= i40;
                                }
                                if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i27 & 4793491) != 4793490, i7 & 1)) {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    long j16 = j6;
                                    j8 = j7;
                                    j9 = j16;
                                    fontWeight2 = fontWeight;
                                    fontFamily2 = fontFamily;
                                    textDecoration2 = textDecoration;
                                    textAlign2 = textAlign;
                                    i30 = i;
                                    z2 = z;
                                    i31 = i2;
                                    i32 = i3;
                                    map2 = map;
                                    kyVar2 = kyVar;
                                    textStyle2 = textStyle;
                                    j10 = j5;
                                    j11 = j3;
                                } else {
                                    startRestartGroup.startDefaults();
                                    if ((i4 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                        if (i37 != 0) {
                                            modifier2 = Modifier.Companion;
                                        }
                                        long m4797getUnspecified0d7_KjU = i8 != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j5;
                                        long m7816getUnspecifiedXSAIIZE = i9 != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j6;
                                        if (i10 != 0) {
                                            fontStyle2 = null;
                                        }
                                        FontWeight fontWeight4 = i11 != 0 ? null : fontWeight;
                                        FontFamily fontFamily4 = i12 != 0 ? null : fontFamily;
                                        long m7816getUnspecifiedXSAIIZE2 = i13 != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j3;
                                        TextDecoration textDecoration3 = i15 != 0 ? null : textDecoration;
                                        TextAlign textAlign5 = i17 == 0 ? textAlign : null;
                                        if (i18 != 0) {
                                            j7 = TextUnit.Companion.m7816getUnspecifiedXSAIIZE();
                                        }
                                        int m7546getClipgIe3tQ8 = i21 != 0 ? TextOverflow.Companion.m7546getClipgIe3tQ8() : i;
                                        boolean z4 = i22 != 0 ? true : z;
                                        int i44 = i24 != 0 ? Integer.MAX_VALUE : i2;
                                        i33 = i26 == 0 ? i3 : 1;
                                        Map map3 = i28 != 0 ? vt.d : map;
                                        if (i29 != 0) {
                                            i34 = -29360129;
                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                            textAlign3 = textAlign5;
                                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                                rememberedValue = new qu0(2);
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            kyVar3 = (ky) rememberedValue;
                                        } else {
                                            textAlign3 = textAlign5;
                                            i34 = -29360129;
                                            kyVar3 = kyVar;
                                        }
                                        if ((i6 & Fields.RenderEffect) != 0) {
                                            i27 &= i34;
                                            textStyle3 = (TextStyle) startRestartGroup.consume(LocalTextStyle);
                                        } else {
                                            textStyle3 = textStyle;
                                        }
                                        z3 = z4;
                                        textDecoration2 = textDecoration3;
                                        i30 = m7546getClipgIe3tQ8;
                                        textAlign4 = textAlign3;
                                        i35 = i44;
                                        long j17 = m7816getUnspecifiedXSAIIZE2;
                                        kyVar4 = kyVar3;
                                        map2 = map3;
                                        i36 = i27;
                                        j12 = j7;
                                        modifier3 = modifier2;
                                        fontWeight3 = fontWeight4;
                                        fontStyle3 = fontStyle2;
                                        j13 = m4797getUnspecified0d7_KjU;
                                        j14 = m7816getUnspecifiedXSAIIZE;
                                        fontFamily3 = fontFamily4;
                                        j15 = j17;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i6 & Fields.RenderEffect) != 0) {
                                            i27 &= -29360129;
                                        }
                                        fontFamily3 = fontFamily;
                                        textDecoration2 = textDecoration;
                                        textAlign4 = textAlign;
                                        i30 = i;
                                        z3 = z;
                                        i35 = i2;
                                        i33 = i3;
                                        map2 = map;
                                        kyVar4 = kyVar;
                                        textStyle3 = textStyle;
                                        i36 = i27;
                                        j12 = j7;
                                        modifier3 = modifier2;
                                        fontWeight3 = fontWeight;
                                        fontStyle3 = fontStyle2;
                                        j13 = j5;
                                        j14 = j6;
                                        j15 = j3;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(2027001676, i7, i36, "androidx.compose.material3.Text (Text.kt:329)");
                                    }
                                    int i45 = i7 << 3;
                                    int i46 = i36 << 3;
                                    composer2 = startRestartGroup;
                                    m2608TextZ58ophY(annotatedString, modifier3, j13, null, j14, fontStyle3, fontWeight3, fontFamily3, j15, textDecoration2, textAlign4, j12, i30, z3, i35, i33, map2, kyVar4, textStyle3, composer2, (i7 & 14) | 3072 | (i7 & 112) | (i7 & 896) | (i45 & 57344) | (i45 & 458752) | (i45 & 3670016) | (i45 & 29360128) | (i45 & 234881024) | (i45 & 1879048192), ((i7 >> 27) & 14) | (i46 & 112) | (i46 & 896) | (i46 & 7168) | (i46 & 57344) | (i46 & 458752) | (i46 & 3670016) | (i46 & 29360128) | (i46 & 234881024), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    j10 = j13;
                                    fontStyle2 = fontStyle3;
                                    fontWeight2 = fontWeight3;
                                    modifier2 = modifier3;
                                    j9 = j14;
                                    fontFamily2 = fontFamily3;
                                    j11 = j15;
                                    textAlign2 = textAlign4;
                                    j8 = j12;
                                    z2 = z3;
                                    i31 = i35;
                                    i32 = i33;
                                    kyVar2 = kyVar4;
                                    textStyle2 = textStyle3;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                    endRestartGroup.updateScope(new pu0(annotatedString, modifier2, j10, j9, fontStyle2, fontWeight2, fontFamily2, j11, textDecoration2, textAlign2, j8, i30, z2, i31, i32, map2, kyVar2, textStyle2, i4, i5, i6));
                                    return;
                                }
                                return;
                            }
                        }
                        i28 = i6 & Fields.CompositingStrategy;
                        if (i28 == 0) {
                        }
                        i29 = i6 & 65536;
                        if (i29 == 0) {
                        }
                        if ((i5 & 12582912) == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i27 & 4793491) != 4793490, i7 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i17 = i16;
                    i18 = i6 & Fields.RotationZ;
                    if (i18 != 0) {
                    }
                    i20 = i6 & Fields.CameraDistance;
                    if (i20 != 0) {
                    }
                    int i412 = i19;
                    i22 = i6 & Fields.TransformOrigin;
                    if (i22 != 0) {
                    }
                    i24 = i6 & 8192;
                    if (i24 != 0) {
                    }
                    i26 = i6 & Fields.Clip;
                    if (i26 != 0) {
                    }
                    i28 = i6 & Fields.CompositingStrategy;
                    if (i28 == 0) {
                    }
                    i29 = i6 & 65536;
                    if (i29 == 0) {
                    }
                    if ((i5 & 12582912) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i27 & 4793491) != 4793490, i7 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i15 = i14;
                i16 = i6 & Fields.RotationY;
                if (i16 == 0) {
                }
                i17 = i16;
                i18 = i6 & Fields.RotationZ;
                if (i18 != 0) {
                }
                i20 = i6 & Fields.CameraDistance;
                if (i20 != 0) {
                }
                int i4122 = i19;
                i22 = i6 & Fields.TransformOrigin;
                if (i22 != 0) {
                }
                i24 = i6 & 8192;
                if (i24 != 0) {
                }
                i26 = i6 & Fields.Clip;
                if (i26 != 0) {
                }
                i28 = i6 & Fields.CompositingStrategy;
                if (i28 == 0) {
                }
                i29 = i6 & 65536;
                if (i29 == 0) {
                }
                if ((i5 & 12582912) == 0) {
                }
                if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i27 & 4793491) != 4793490, i7 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            fontStyle2 = fontStyle;
            i11 = i6 & 32;
            if (i11 != 0) {
            }
            i12 = i6 & 64;
            int i392 = Fields.BlendMode;
            if (i12 != 0) {
            }
            i13 = i6 & Fields.SpotShadowColor;
            int i402 = 4194304;
            if (i13 != 0) {
            }
            i14 = i6 & Fields.RotationX;
            if (i14 != 0) {
            }
            i15 = i14;
            i16 = i6 & Fields.RotationY;
            if (i16 == 0) {
            }
            i17 = i16;
            i18 = i6 & Fields.RotationZ;
            if (i18 != 0) {
            }
            i20 = i6 & Fields.CameraDistance;
            if (i20 != 0) {
            }
            int i41222 = i19;
            i22 = i6 & Fields.TransformOrigin;
            if (i22 != 0) {
            }
            i24 = i6 & 8192;
            if (i24 != 0) {
            }
            i26 = i6 & Fields.Clip;
            if (i26 != 0) {
            }
            i28 = i6 & Fields.CompositingStrategy;
            if (i28 == 0) {
            }
            i29 = i6 & 65536;
            if (i29 == 0) {
            }
            if ((i5 & 12582912) == 0) {
            }
            if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i27 & 4793491) != 4793490, i7 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i9 = i6 & 8;
        int i382 = Fields.RotationZ;
        if (i9 == 0) {
        }
        i10 = i6 & 16;
        if (i10 == 0) {
        }
        fontStyle2 = fontStyle;
        i11 = i6 & 32;
        if (i11 != 0) {
        }
        i12 = i6 & 64;
        int i3922 = Fields.BlendMode;
        if (i12 != 0) {
        }
        i13 = i6 & Fields.SpotShadowColor;
        int i4022 = 4194304;
        if (i13 != 0) {
        }
        i14 = i6 & Fields.RotationX;
        if (i14 != 0) {
        }
        i15 = i14;
        i16 = i6 & Fields.RotationY;
        if (i16 == 0) {
        }
        i17 = i16;
        i18 = i6 & Fields.RotationZ;
        if (i18 != 0) {
        }
        i20 = i6 & Fields.CameraDistance;
        if (i20 != 0) {
        }
        int i412222 = i19;
        i22 = i6 & Fields.TransformOrigin;
        if (i22 != 0) {
        }
        i24 = i6 & 8192;
        if (i24 != 0) {
        }
        i26 = i6 & Fields.Clip;
        if (i26 != 0) {
        }
        i28 = i6 & Fields.CompositingStrategy;
        if (i28 == 0) {
        }
        i29 = i6 & 65536;
        if (i29 == 0) {
        }
        if ((i5 & 12582912) == 0) {
        }
        if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i27 & 4793491) != 4793490, i7 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0447  */
    /* renamed from: Text-Nvy7gAk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2607TextNvy7gAk(String str, Modifier modifier, long j, TextAutoSize textAutoSize, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, ky kyVar, TextStyle textStyle, Composer composer, int i4, int i5, int i6) {
        int i7;
        Modifier modifier2;
        int i8;
        long j5;
        int i9;
        int i10;
        TextAutoSize textAutoSize2;
        int i11;
        long j6;
        int i12;
        FontStyle fontStyle2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        Composer composer2;
        FontWeight fontWeight2;
        TextDecoration textDecoration2;
        boolean z2;
        int i32;
        int i33;
        ky kyVar2;
        TextStyle textStyle2;
        int i34;
        long j7;
        TextAutoSize textAutoSize3;
        FontStyle fontStyle3;
        Modifier modifier3;
        long j8;
        FontFamily fontFamily2;
        long j9;
        TextAlign textAlign2;
        long j10;
        ScopeUpdateScope endRestartGroup;
        TextAlign textAlign3;
        boolean z3;
        int i35;
        int i36;
        ky kyVar3;
        TextStyle textStyle3;
        FontWeight fontWeight3;
        FontStyle fontStyle4;
        long j11;
        FontFamily fontFamily3;
        TextDecoration textDecoration3;
        long j12;
        long j13;
        long j14;
        TextStyle m7105mergedA7vx0o;
        Composer startRestartGroup = composer.startRestartGroup(1809465675);
        if ((i6 & 1) != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i7 = (startRestartGroup.changed(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i37 = i6 & 2;
        if (i37 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            modifier2 = modifier;
            i7 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i8 = i6 & 4;
            if (i8 == 0) {
                i9 = i7 | 384;
                j5 = j;
            } else {
                int i38 = i7;
                j5 = j;
                if ((i4 & 384) == 0) {
                    i38 |= startRestartGroup.changed(j5) ? Fields.RotationX : Fields.SpotShadowColor;
                }
                i9 = i38;
            }
            i10 = i6 & 8;
            int i39 = Fields.RotationZ;
            if (i10 == 0) {
                i9 |= 3072;
            } else if ((i4 & 3072) == 0) {
                textAutoSize2 = textAutoSize;
                i9 |= startRestartGroup.changedInstance(textAutoSize2) ? 2048 : 1024;
                i11 = i6 & 16;
                if (i11 != 0) {
                    i9 |= 24576;
                    j6 = j2;
                } else {
                    j6 = j2;
                    if ((i4 & 24576) == 0) {
                        i9 |= startRestartGroup.changed(j6) ? 16384 : 8192;
                    }
                }
                i12 = i6 & 32;
                if (i12 != 0) {
                    i9 |= 196608;
                    fontStyle2 = fontStyle;
                } else {
                    fontStyle2 = fontStyle;
                    if ((i4 & 196608) == 0) {
                        i9 |= startRestartGroup.changed(fontStyle2) ? 131072 : 65536;
                    }
                }
                i13 = i6 & 64;
                int i40 = Fields.BlendMode;
                if (i13 != 0) {
                    i9 |= 1572864;
                } else if ((i4 & 1572864) == 0) {
                    i9 |= startRestartGroup.changed(fontWeight) ? 1048576 : 524288;
                }
                i14 = i6 & Fields.SpotShadowColor;
                int i41 = 4194304;
                if (i14 != 0) {
                    i9 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    i15 = i14;
                    i9 |= startRestartGroup.changed(fontFamily) ? 8388608 : 4194304;
                    i16 = i6 & Fields.RotationX;
                    if (i16 == 0) {
                        i9 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        i17 = i9 | (startRestartGroup.changed(j3) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag);
                        i18 = i6 & Fields.RotationY;
                        if (i18 != 0) {
                            i17 |= 805306368;
                            i19 = i18;
                        } else if ((i4 & 805306368) == 0) {
                            i19 = i18;
                            i17 |= startRestartGroup.changed(textDecoration) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        } else {
                            i19 = i18;
                        }
                        i20 = i17;
                        i21 = i6 & Fields.RotationZ;
                        if (i21 != 0) {
                            i23 = i5 | 6;
                            i22 = i21;
                        } else if ((i5 & 6) == 0) {
                            i22 = i21;
                            i23 = i5 | (startRestartGroup.changed(textAlign) ? 4 : 2);
                        } else {
                            i22 = i21;
                            i23 = i5;
                        }
                        i24 = i6 & Fields.CameraDistance;
                        if (i24 != 0) {
                            i23 |= 48;
                        } else if ((i5 & 48) == 0) {
                            i23 |= startRestartGroup.changed(j4) ? 32 : 16;
                        }
                        int i42 = i23;
                        i25 = i6 & Fields.TransformOrigin;
                        if (i25 != 0) {
                            i42 |= 384;
                        } else if ((i5 & 384) == 0) {
                            i26 = i;
                            i42 |= startRestartGroup.changed(i26) ? Fields.RotationX : Fields.SpotShadowColor;
                            i27 = i6 & 8192;
                            if (i27 == 0) {
                                i28 = i42 | 3072;
                            } else {
                                int i43 = i42;
                                if ((i5 & 3072) == 0) {
                                    if (startRestartGroup.changed(z)) {
                                        i39 = 2048;
                                    }
                                    i28 = i43 | i39;
                                } else {
                                    i28 = i43;
                                }
                            }
                            i29 = i6 & Fields.Clip;
                            if (i29 == 0) {
                                i28 |= 24576;
                            } else if ((i5 & 24576) == 0) {
                                i28 |= startRestartGroup.changed(i2) ? 16384 : 8192;
                                i30 = i6 & Fields.CompositingStrategy;
                                if (i30 != 0) {
                                    i28 |= 196608;
                                } else if ((i5 & 196608) == 0) {
                                    i28 |= startRestartGroup.changed(i3) ? 131072 : 65536;
                                }
                                i31 = i6 & 65536;
                                if (i31 != 0) {
                                    i28 |= 1572864;
                                } else if ((i5 & 1572864) == 0) {
                                    if (startRestartGroup.changedInstance(kyVar)) {
                                        i40 = 1048576;
                                    }
                                    i28 |= i40;
                                }
                                if ((i5 & 12582912) == 0) {
                                    if ((i6 & Fields.RenderEffect) == 0 && startRestartGroup.changed(textStyle)) {
                                        i41 = 8388608;
                                    }
                                    i28 |= i41;
                                }
                                if (startRestartGroup.shouldExecute((i20 & 306783379) == 306783378 || (4793491 & i28) != 4793490, i20 & 1)) {
                                    startRestartGroup.startDefaults();
                                    if ((i4 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                        if (i37 != 0) {
                                            modifier2 = Modifier.Companion;
                                        }
                                        if (i8 != 0) {
                                            j5 = Color.Companion.m4797getUnspecified0d7_KjU();
                                        }
                                        if (i10 != 0) {
                                            textAutoSize2 = null;
                                        }
                                        long m7816getUnspecifiedXSAIIZE = i11 != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j6;
                                        if (i12 != 0) {
                                            fontStyle2 = null;
                                        }
                                        FontWeight fontWeight4 = i13 != 0 ? null : fontWeight;
                                        FontFamily fontFamily4 = i15 != 0 ? null : fontFamily;
                                        long m7816getUnspecifiedXSAIIZE2 = i16 != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j3;
                                        TextDecoration textDecoration4 = i19 != 0 ? null : textDecoration;
                                        textAlign3 = i22 != 0 ? null : textAlign;
                                        long m7816getUnspecifiedXSAIIZE3 = i24 != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j4;
                                        if (i25 != 0) {
                                            i26 = TextOverflow.Companion.m7546getClipgIe3tQ8();
                                        }
                                        z3 = i27 != 0 ? true : z;
                                        i35 = i29 != 0 ? Integer.MAX_VALUE : i2;
                                        i36 = i30 == 0 ? i3 : 1;
                                        kyVar3 = i31 == 0 ? kyVar : null;
                                        if ((i6 & Fields.RenderEffect) != 0) {
                                            i28 &= -29360129;
                                            textStyle3 = (TextStyle) startRestartGroup.consume(LocalTextStyle);
                                        } else {
                                            textStyle3 = textStyle;
                                        }
                                        fontWeight3 = fontWeight4;
                                        fontStyle4 = fontStyle2;
                                        j11 = m7816getUnspecifiedXSAIIZE;
                                        fontFamily3 = fontFamily4;
                                        textDecoration3 = textDecoration4;
                                        j12 = m7816getUnspecifiedXSAIIZE2;
                                        j13 = m7816getUnspecifiedXSAIIZE3;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i6 & Fields.RenderEffect) != 0) {
                                            i28 &= -29360129;
                                        }
                                        fontWeight3 = fontWeight;
                                        fontFamily3 = fontFamily;
                                        j12 = j3;
                                        textDecoration3 = textDecoration;
                                        textAlign3 = textAlign;
                                        j13 = j4;
                                        z3 = z;
                                        i35 = i2;
                                        i36 = i3;
                                        kyVar3 = kyVar;
                                        textStyle3 = textStyle;
                                        fontStyle4 = fontStyle2;
                                        j11 = j6;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1809465675, i20, i28, "androidx.compose.material3.Text (Text.kt:120)");
                                    }
                                    startRestartGroup.startReplaceGroup(-565217106);
                                    if (j5 != 16) {
                                        j14 = j5;
                                    } else {
                                        startRestartGroup.startReplaceGroup(-565216333);
                                        long m7090getColor0d7_KjU = textStyle3.m7090getColor0d7_KjU();
                                        if (m7090getColor0d7_KjU == 16) {
                                            m7090getColor0d7_KjU = ((Color) startRestartGroup.consume(ContentColorKt.getLocalContentColor())).m4771unboximpl();
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        j14 = m7090getColor0d7_KjU;
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    m7105mergedA7vx0o = textStyle3.m7105mergedA7vx0o((r60 & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j14, (r60 & 2) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j11, (r60 & 4) != 0 ? null : fontWeight3, (r60 & 8) != 0 ? null : fontStyle4, (r60 & 16) != 0 ? null : null, (r60 & 32) != 0 ? null : fontFamily3, (r60 & 64) != 0 ? null : null, (r60 & Fields.SpotShadowColor) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j12, (r60 & Fields.RotationX) != 0 ? null : null, (r60 & Fields.RotationY) != 0 ? null : null, (r60 & Fields.RotationZ) != 0 ? null : null, (r60 & Fields.CameraDistance) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : 0L, (r60 & Fields.TransformOrigin) != 0 ? null : textDecoration3, (r60 & 8192) != 0 ? null : null, (r60 & Fields.Clip) != 0 ? null : null, (r60 & Fields.CompositingStrategy) != 0 ? TextAlign.Companion.m7495getUnspecifiede0LSkKk() : textAlign3 != null ? textAlign3.m7488unboximpl() : TextAlign.Companion.m7495getUnspecifiede0LSkKk(), (r60 & 65536) != 0 ? TextDirection.Companion.m7511getUnspecifieds_7Xco() : 0, (r60 & Fields.RenderEffect) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j13, (r60 & Fields.ColorFilter) != 0 ? null : null, (r60 & Fields.BlendMode) != 0 ? null : null, (r60 & 1048576) != 0 ? LineBreak.Companion.m7407getUnspecifiedrAG3T2k() : 0, (r60 & 2097152) != 0 ? Hyphens.Companion.m7383getUnspecifiedvmbZdU8() : 0, (r60 & 4194304) != 0 ? null : null, (r60 & GroupFlagsKt.IsNodeFlag) != 0 ? null : null);
                                    int i44 = (i20 & 126) | ((i28 >> 9) & 7168);
                                    int i45 = i28 << 6;
                                    BasicTextKt.m1078BasicTextRWo7tUw(str, modifier2, m7105mergedA7vx0o, kyVar3, i26, z3, i35, i36, (ColorProducer) null, textAutoSize2, startRestartGroup, ((i20 << 18) & 1879048192) | (i45 & 29360128) | i44 | (57344 & i45) | (458752 & i45) | (3670016 & i45), Fields.RotationX);
                                    composer2 = startRestartGroup;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    i32 = i35;
                                    j7 = j5;
                                    textAutoSize3 = textAutoSize2;
                                    modifier3 = modifier2;
                                    z2 = z3;
                                    textAlign2 = textAlign3;
                                    i33 = i36;
                                    textStyle2 = textStyle3;
                                    fontWeight2 = fontWeight3;
                                    fontStyle3 = fontStyle4;
                                    fontFamily2 = fontFamily3;
                                    j9 = j12;
                                    textDecoration2 = textDecoration3;
                                    j10 = j13;
                                    kyVar2 = kyVar3;
                                    i34 = i26;
                                    j8 = j11;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    fontWeight2 = fontWeight;
                                    textDecoration2 = textDecoration;
                                    z2 = z;
                                    i32 = i2;
                                    i33 = i3;
                                    kyVar2 = kyVar;
                                    textStyle2 = textStyle;
                                    i34 = i26;
                                    j7 = j5;
                                    textAutoSize3 = textAutoSize2;
                                    fontStyle3 = fontStyle2;
                                    modifier3 = modifier2;
                                    j8 = j6;
                                    fontFamily2 = fontFamily;
                                    j9 = j3;
                                    textAlign2 = textAlign;
                                    j10 = j4;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new pu0(str, modifier3, j7, textAutoSize3, j8, fontStyle3, fontWeight2, fontFamily2, j9, textDecoration2, textAlign2, j10, i34, z2, i32, i33, kyVar2, textStyle2, i4, i5, i6));
                                    return;
                                }
                                return;
                            }
                            i30 = i6 & Fields.CompositingStrategy;
                            if (i30 != 0) {
                            }
                            i31 = i6 & 65536;
                            if (i31 != 0) {
                            }
                            if ((i5 & 12582912) == 0) {
                            }
                            if (startRestartGroup.shouldExecute((i20 & 306783379) == 306783378 || (4793491 & i28) != 4793490, i20 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i26 = i;
                        i27 = i6 & 8192;
                        if (i27 == 0) {
                        }
                        i29 = i6 & Fields.Clip;
                        if (i29 == 0) {
                        }
                        i30 = i6 & Fields.CompositingStrategy;
                        if (i30 != 0) {
                        }
                        i31 = i6 & 65536;
                        if (i31 != 0) {
                        }
                        if ((i5 & 12582912) == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i20 & 306783379) == 306783378 || (4793491 & i28) != 4793490, i20 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i17 = i9;
                    i18 = i6 & Fields.RotationY;
                    if (i18 != 0) {
                    }
                    i20 = i17;
                    i21 = i6 & Fields.RotationZ;
                    if (i21 != 0) {
                    }
                    i24 = i6 & Fields.CameraDistance;
                    if (i24 != 0) {
                    }
                    int i422 = i23;
                    i25 = i6 & Fields.TransformOrigin;
                    if (i25 != 0) {
                    }
                    i26 = i;
                    i27 = i6 & 8192;
                    if (i27 == 0) {
                    }
                    i29 = i6 & Fields.Clip;
                    if (i29 == 0) {
                    }
                    i30 = i6 & Fields.CompositingStrategy;
                    if (i30 != 0) {
                    }
                    i31 = i6 & 65536;
                    if (i31 != 0) {
                    }
                    if ((i5 & 12582912) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i20 & 306783379) == 306783378 || (4793491 & i28) != 4793490, i20 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i15 = i14;
                i16 = i6 & Fields.RotationX;
                if (i16 == 0) {
                }
                i17 = i9;
                i18 = i6 & Fields.RotationY;
                if (i18 != 0) {
                }
                i20 = i17;
                i21 = i6 & Fields.RotationZ;
                if (i21 != 0) {
                }
                i24 = i6 & Fields.CameraDistance;
                if (i24 != 0) {
                }
                int i4222 = i23;
                i25 = i6 & Fields.TransformOrigin;
                if (i25 != 0) {
                }
                i26 = i;
                i27 = i6 & 8192;
                if (i27 == 0) {
                }
                i29 = i6 & Fields.Clip;
                if (i29 == 0) {
                }
                i30 = i6 & Fields.CompositingStrategy;
                if (i30 != 0) {
                }
                i31 = i6 & 65536;
                if (i31 != 0) {
                }
                if ((i5 & 12582912) == 0) {
                }
                if (startRestartGroup.shouldExecute((i20 & 306783379) == 306783378 || (4793491 & i28) != 4793490, i20 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            textAutoSize2 = textAutoSize;
            i11 = i6 & 16;
            if (i11 != 0) {
            }
            i12 = i6 & 32;
            if (i12 != 0) {
            }
            i13 = i6 & 64;
            int i402 = Fields.BlendMode;
            if (i13 != 0) {
            }
            i14 = i6 & Fields.SpotShadowColor;
            int i412 = 4194304;
            if (i14 != 0) {
            }
            i15 = i14;
            i16 = i6 & Fields.RotationX;
            if (i16 == 0) {
            }
            i17 = i9;
            i18 = i6 & Fields.RotationY;
            if (i18 != 0) {
            }
            i20 = i17;
            i21 = i6 & Fields.RotationZ;
            if (i21 != 0) {
            }
            i24 = i6 & Fields.CameraDistance;
            if (i24 != 0) {
            }
            int i42222 = i23;
            i25 = i6 & Fields.TransformOrigin;
            if (i25 != 0) {
            }
            i26 = i;
            i27 = i6 & 8192;
            if (i27 == 0) {
            }
            i29 = i6 & Fields.Clip;
            if (i29 == 0) {
            }
            i30 = i6 & Fields.CompositingStrategy;
            if (i30 != 0) {
            }
            i31 = i6 & 65536;
            if (i31 != 0) {
            }
            if ((i5 & 12582912) == 0) {
            }
            if (startRestartGroup.shouldExecute((i20 & 306783379) == 306783378 || (4793491 & i28) != 4793490, i20 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i10 = i6 & 8;
        int i392 = Fields.RotationZ;
        if (i10 == 0) {
        }
        textAutoSize2 = textAutoSize;
        i11 = i6 & 16;
        if (i11 != 0) {
        }
        i12 = i6 & 32;
        if (i12 != 0) {
        }
        i13 = i6 & 64;
        int i4022 = Fields.BlendMode;
        if (i13 != 0) {
        }
        i14 = i6 & Fields.SpotShadowColor;
        int i4122 = 4194304;
        if (i14 != 0) {
        }
        i15 = i14;
        i16 = i6 & Fields.RotationX;
        if (i16 == 0) {
        }
        i17 = i9;
        i18 = i6 & Fields.RotationY;
        if (i18 != 0) {
        }
        i20 = i17;
        i21 = i6 & Fields.RotationZ;
        if (i21 != 0) {
        }
        i24 = i6 & Fields.CameraDistance;
        if (i24 != 0) {
        }
        int i422222 = i23;
        i25 = i6 & Fields.TransformOrigin;
        if (i25 != 0) {
        }
        i26 = i;
        i27 = i6 & 8192;
        if (i27 == 0) {
        }
        i29 = i6 & Fields.Clip;
        if (i29 == 0) {
        }
        i30 = i6 & Fields.CompositingStrategy;
        if (i30 != 0) {
        }
        i31 = i6 & 65536;
        if (i31 != 0) {
        }
        if ((i5 & 12582912) == 0) {
        }
        if (startRestartGroup.shouldExecute((i20 & 306783379) == 306783378 || (4793491 & i28) != 4793490, i20 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x028d  */
    /* renamed from: Text-Z58ophY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2608TextZ58ophY(final AnnotatedString annotatedString, Modifier modifier, long j, TextAutoSize textAutoSize, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, Map<String, InlineTextContent> map, ky kyVar, TextStyle textStyle, Composer composer, final int i4, final int i5, final int i6) {
        int i7;
        Modifier modifier2;
        int i8;
        long j5;
        int i9;
        int i10;
        int i11;
        long j6;
        int i12;
        FontStyle fontStyle2;
        int i13;
        FontWeight fontWeight2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        Composer composer2;
        final TextAutoSize textAutoSize2;
        final TextDecoration textDecoration2;
        final boolean z2;
        final int i33;
        final int i34;
        final Map<String, InlineTextContent> map2;
        final ky kyVar2;
        final TextStyle textStyle2;
        final int i35;
        final long j7;
        final long j8;
        final Modifier modifier3;
        final FontStyle fontStyle3;
        final FontWeight fontWeight3;
        final FontFamily fontFamily2;
        final long j9;
        final TextAlign textAlign2;
        final long j10;
        ScopeUpdateScope endRestartGroup;
        TextAutoSize textAutoSize3;
        TextAlign textAlign3;
        boolean z3;
        int i36;
        int i37;
        Map<String, InlineTextContent> map3;
        ky kyVar3;
        TextStyle textStyle3;
        int i38;
        long j11;
        FontStyle fontStyle4;
        FontWeight fontWeight4;
        FontFamily fontFamily3;
        TextDecoration textDecoration3;
        long j12;
        long j13;
        long j14;
        TextStyle m7105mergedA7vx0o;
        Composer startRestartGroup = composer.startRestartGroup(292247417);
        if ((i6 & 1) != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i7 = (startRestartGroup.changed(annotatedString) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i39 = i6 & 2;
        if (i39 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            modifier2 = modifier;
            i7 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
                j5 = j;
            } else {
                j5 = j;
                if ((i4 & 384) == 0) {
                    i7 |= startRestartGroup.changed(j5) ? Fields.RotationX : Fields.SpotShadowColor;
                }
            }
            i9 = i6 & 8;
            int i40 = Fields.RotationZ;
            if (i9 == 0) {
                i7 |= 3072;
            } else if ((i4 & 3072) == 0) {
                i7 |= startRestartGroup.changedInstance(textAutoSize) ? 2048 : 1024;
                i10 = i6 & 16;
                if (i10 != 0) {
                    i7 |= 24576;
                    i11 = i39;
                    j6 = j2;
                } else {
                    i11 = i39;
                    j6 = j2;
                    if ((i4 & 24576) == 0) {
                        i7 |= startRestartGroup.changed(j6) ? 16384 : 8192;
                    }
                }
                i12 = i6 & 32;
                if (i12 != 0) {
                    i7 |= 196608;
                    fontStyle2 = fontStyle;
                } else {
                    fontStyle2 = fontStyle;
                    if ((i4 & 196608) == 0) {
                        i7 |= startRestartGroup.changed(fontStyle2) ? 131072 : 65536;
                    }
                }
                i13 = i6 & 64;
                int i41 = Fields.BlendMode;
                if (i13 != 0) {
                    i7 |= 1572864;
                    fontWeight2 = fontWeight;
                } else {
                    fontWeight2 = fontWeight;
                    if ((i4 & 1572864) == 0) {
                        i7 |= startRestartGroup.changed(fontWeight2) ? 1048576 : 524288;
                    }
                }
                i14 = i6 & Fields.SpotShadowColor;
                if (i14 != 0) {
                    i7 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    i7 |= startRestartGroup.changed(fontFamily) ? 8388608 : 4194304;
                }
                i15 = i6 & Fields.RotationX;
                int i42 = GroupFlagsKt.HasAuxSlotFlag;
                if (i15 != 0) {
                    i7 |= 100663296;
                } else if ((i4 & 100663296) == 0) {
                    i16 = i7 | (startRestartGroup.changed(j3) ? 67108864 : 33554432);
                    i17 = i6 & Fields.RotationY;
                    if (i17 == 0) {
                        i16 |= 805306368;
                        i18 = i17;
                    } else if ((i4 & 805306368) == 0) {
                        i18 = i17;
                        i16 |= startRestartGroup.changed(textDecoration) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                    } else {
                        i18 = i17;
                    }
                    i19 = i16;
                    i20 = i6 & Fields.RotationZ;
                    if (i20 == 0) {
                        i22 = i5 | 6;
                        i21 = i20;
                    } else if ((i5 & 6) == 0) {
                        i21 = i20;
                        i22 = i5 | (startRestartGroup.changed(textAlign) ? 4 : 2);
                    } else {
                        i21 = i20;
                        i22 = i5;
                    }
                    i23 = i6 & Fields.CameraDistance;
                    if (i23 == 0) {
                        i22 |= 48;
                    } else if ((i5 & 48) == 0) {
                        i22 |= startRestartGroup.changed(j4) ? 32 : 16;
                    }
                    int i43 = i22;
                    i24 = i6 & Fields.TransformOrigin;
                    if (i24 == 0) {
                        i43 |= 384;
                    } else if ((i5 & 384) == 0) {
                        i25 = i;
                        i43 |= startRestartGroup.changed(i25) ? Fields.RotationX : Fields.SpotShadowColor;
                        i26 = i6 & 8192;
                        if (i26 != 0) {
                            i27 = i43 | 3072;
                        } else {
                            int i44 = i43;
                            if ((i5 & 3072) == 0) {
                                if (startRestartGroup.changed(z)) {
                                    i40 = 2048;
                                }
                                i27 = i44 | i40;
                            } else {
                                i27 = i44;
                            }
                        }
                        i28 = i6 & Fields.Clip;
                        if (i28 != 0) {
                            i27 |= 24576;
                        } else if ((i5 & 24576) == 0) {
                            i27 |= startRestartGroup.changed(i2) ? 16384 : 8192;
                            i29 = i6 & Fields.CompositingStrategy;
                            if (i29 == 0) {
                                i27 |= 196608;
                            } else if ((i5 & 196608) == 0) {
                                i27 |= startRestartGroup.changed(i3) ? 131072 : 65536;
                            }
                            i30 = i6 & 65536;
                            if (i30 == 0) {
                                i27 |= 1572864;
                            } else if ((i5 & 1572864) == 0) {
                                if (startRestartGroup.changedInstance(map)) {
                                    i41 = 1048576;
                                }
                                i27 |= i41;
                            }
                            i31 = i6 & Fields.RenderEffect;
                            if (i31 == 0) {
                                i27 |= 12582912;
                            } else if ((i5 & 12582912) == 0) {
                                i27 |= startRestartGroup.changedInstance(kyVar) ? 8388608 : 4194304;
                            }
                            if ((i5 & 100663296) == 0) {
                                if ((i6 & Fields.ColorFilter) == 0 && startRestartGroup.changed(textStyle)) {
                                    i42 = 67108864;
                                }
                                i27 |= i42;
                            }
                            i32 = i27;
                            if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (i32 & 38347923) != 38347922, i19 & 1)) {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                textAutoSize2 = textAutoSize;
                                textDecoration2 = textDecoration;
                                z2 = z;
                                i33 = i2;
                                i34 = i3;
                                map2 = map;
                                kyVar2 = kyVar;
                                textStyle2 = textStyle;
                                i35 = i25;
                                j7 = j6;
                                j8 = j5;
                                modifier3 = modifier2;
                                fontStyle3 = fontStyle2;
                                fontWeight3 = fontWeight2;
                                fontFamily2 = fontFamily;
                                j9 = j3;
                                textAlign2 = textAlign;
                                j10 = j4;
                            } else {
                                startRestartGroup.startDefaults();
                                if ((i4 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                    if (i11 != 0) {
                                        modifier2 = Modifier.Companion;
                                    }
                                    if (i8 != 0) {
                                        j5 = Color.Companion.m4797getUnspecified0d7_KjU();
                                    }
                                    textAutoSize3 = i9 != 0 ? null : textAutoSize;
                                    if (i10 != 0) {
                                        j6 = TextUnit.Companion.m7816getUnspecifiedXSAIIZE();
                                    }
                                    if (i12 != 0) {
                                        fontStyle2 = null;
                                    }
                                    if (i13 != 0) {
                                        fontWeight2 = null;
                                    }
                                    FontFamily fontFamily4 = i14 != 0 ? null : fontFamily;
                                    long m7816getUnspecifiedXSAIIZE = i15 != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j3;
                                    TextDecoration textDecoration4 = i18 != 0 ? null : textDecoration;
                                    textAlign3 = i21 == 0 ? textAlign : null;
                                    long m7816getUnspecifiedXSAIIZE2 = i23 != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j4;
                                    if (i24 != 0) {
                                        i25 = TextOverflow.Companion.m7546getClipgIe3tQ8();
                                    }
                                    z3 = i26 != 0 ? true : z;
                                    i36 = i28 != 0 ? Integer.MAX_VALUE : i2;
                                    i37 = i29 != 0 ? 1 : i3;
                                    map3 = i30 != 0 ? vt.d : map;
                                    if (i31 != 0) {
                                        Object rememberedValue = startRestartGroup.rememberedValue();
                                        if (rememberedValue == Composer.Companion.getEmpty()) {
                                            rememberedValue = new qu0(0);
                                            startRestartGroup.updateRememberedValue(rememberedValue);
                                        }
                                        kyVar3 = (ky) rememberedValue;
                                    } else {
                                        kyVar3 = kyVar;
                                    }
                                    if ((i6 & Fields.ColorFilter) != 0) {
                                        textStyle3 = (TextStyle) startRestartGroup.consume(LocalTextStyle);
                                        j11 = j6;
                                        fontStyle4 = fontStyle2;
                                        fontWeight4 = fontWeight2;
                                        fontFamily3 = fontFamily4;
                                        i38 = i32 & (-234881025);
                                    } else {
                                        textStyle3 = textStyle;
                                        i38 = i32;
                                        j11 = j6;
                                        fontStyle4 = fontStyle2;
                                        fontWeight4 = fontWeight2;
                                        fontFamily3 = fontFamily4;
                                    }
                                    textDecoration3 = textDecoration4;
                                    j12 = m7816getUnspecifiedXSAIIZE;
                                    j13 = m7816getUnspecifiedXSAIIZE2;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i6 & Fields.ColorFilter) != 0) {
                                        textAutoSize3 = textAutoSize;
                                        fontFamily3 = fontFamily;
                                        j12 = j3;
                                        textDecoration3 = textDecoration;
                                        j13 = j4;
                                        z3 = z;
                                        i36 = i2;
                                        i37 = i3;
                                        map3 = map;
                                        kyVar3 = kyVar;
                                        textStyle3 = textStyle;
                                        i38 = i32 & (-234881025);
                                        j11 = j6;
                                        fontStyle4 = fontStyle2;
                                        fontWeight4 = fontWeight2;
                                        textAlign3 = textAlign;
                                    } else {
                                        textAutoSize3 = textAutoSize;
                                        fontFamily3 = fontFamily;
                                        j12 = j3;
                                        textDecoration3 = textDecoration;
                                        textAlign3 = textAlign;
                                        j13 = j4;
                                        z3 = z;
                                        i36 = i2;
                                        i37 = i3;
                                        map3 = map;
                                        kyVar3 = kyVar;
                                        textStyle3 = textStyle;
                                        i38 = i32;
                                        j11 = j6;
                                        fontStyle4 = fontStyle2;
                                        fontWeight4 = fontWeight2;
                                    }
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(292247417, i19, i38, "androidx.compose.material3.Text (Text.kt:228)");
                                }
                                startRestartGroup.startReplaceGroup(1676919644);
                                if (j5 != 16) {
                                    j14 = j5;
                                } else {
                                    startRestartGroup.startReplaceGroup(1676920417);
                                    long m7090getColor0d7_KjU = textStyle3.m7090getColor0d7_KjU();
                                    if (m7090getColor0d7_KjU == 16) {
                                        m7090getColor0d7_KjU = ((Color) startRestartGroup.consume(ContentColorKt.getLocalContentColor())).m4771unboximpl();
                                    }
                                    startRestartGroup.endReplaceGroup();
                                    j14 = m7090getColor0d7_KjU;
                                }
                                startRestartGroup.endReplaceGroup();
                                TextLinkStyles rememberTextLinkStyles = rememberTextLinkStyles(startRestartGroup, 0);
                                boolean changed = ((i19 & 14) == 4) | startRestartGroup.changed(rememberTextLinkStyles);
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                                    rememberedValue2 = createTextWithLinkStyles(annotatedString, rememberTextLinkStyles);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                AnnotatedString annotatedString2 = (AnnotatedString) rememberedValue2;
                                m7105mergedA7vx0o = textStyle3.m7105mergedA7vx0o((r60 & 1) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : j14, (r60 & 2) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j11, (r60 & 4) != 0 ? null : fontWeight4, (r60 & 8) != 0 ? null : fontStyle4, (r60 & 16) != 0 ? null : null, (r60 & 32) != 0 ? null : fontFamily3, (r60 & 64) != 0 ? null : null, (r60 & Fields.SpotShadowColor) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j12, (r60 & Fields.RotationX) != 0 ? null : null, (r60 & Fields.RotationY) != 0 ? null : null, (r60 & Fields.RotationZ) != 0 ? null : null, (r60 & Fields.CameraDistance) != 0 ? Color.Companion.m4797getUnspecified0d7_KjU() : 0L, (r60 & Fields.TransformOrigin) != 0 ? null : textDecoration3, (r60 & 8192) != 0 ? null : null, (r60 & Fields.Clip) != 0 ? null : null, (r60 & Fields.CompositingStrategy) != 0 ? TextAlign.Companion.m7495getUnspecifiede0LSkKk() : textAlign3 != null ? textAlign3.m7488unboximpl() : TextAlign.Companion.m7495getUnspecifiede0LSkKk(), (r60 & 65536) != 0 ? TextDirection.Companion.m7511getUnspecifieds_7Xco() : 0, (r60 & Fields.RenderEffect) != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j13, (r60 & Fields.ColorFilter) != 0 ? null : null, (r60 & Fields.BlendMode) != 0 ? null : null, (r60 & 1048576) != 0 ? LineBreak.Companion.m7407getUnspecifiedrAG3T2k() : 0, (r60 & 2097152) != 0 ? Hyphens.Companion.m7383getUnspecifiedvmbZdU8() : 0, (r60 & 4194304) != 0 ? null : null, (r60 & GroupFlagsKt.IsNodeFlag) != 0 ? null : null);
                                int i45 = (i19 & 112) | ((i38 >> 12) & 7168);
                                int i46 = i38 << 6;
                                BasicTextKt.m1076BasicTextCL7eQgs(annotatedString2, modifier2, m7105mergedA7vx0o, kyVar3, i25, z3, i36, i37, map3, null, textAutoSize3, startRestartGroup, (i46 & 234881024) | i45 | (57344 & i46) | (458752 & i46) | (3670016 & i46) | (29360128 & i46), (i19 >> 9) & 14, Fields.RotationY);
                                composer2 = startRestartGroup;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                textAlign2 = textAlign3;
                                kyVar2 = kyVar3;
                                i35 = i25;
                                j8 = j5;
                                modifier3 = modifier2;
                                textAutoSize2 = textAutoSize3;
                                i34 = i37;
                                map2 = map3;
                                textStyle2 = textStyle3;
                                fontWeight3 = fontWeight4;
                                fontStyle3 = fontStyle4;
                                fontFamily2 = fontFamily3;
                                j9 = j12;
                                textDecoration2 = textDecoration3;
                                i33 = i36;
                                z2 = z3;
                                j7 = j11;
                                j10 = j13;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new my() { // from class: ru0
                                    @Override // defpackage.my
                                    public final Object invoke(Object obj, Object obj2) {
                                        w01 Text_Z58ophY$lambda$8;
                                        int intValue = ((Integer) obj2).intValue();
                                        Text_Z58ophY$lambda$8 = TextKt.Text_Z58ophY$lambda$8(AnnotatedString.this, modifier3, j8, textAutoSize2, j7, fontStyle3, fontWeight3, fontFamily2, j9, textDecoration2, textAlign2, j10, i35, z2, i33, i34, map2, kyVar2, textStyle2, i4, i5, i6, (Composer) obj, intValue);
                                        return Text_Z58ophY$lambda$8;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i29 = i6 & Fields.CompositingStrategy;
                        if (i29 == 0) {
                        }
                        i30 = i6 & 65536;
                        if (i30 == 0) {
                        }
                        i31 = i6 & Fields.RenderEffect;
                        if (i31 == 0) {
                        }
                        if ((i5 & 100663296) == 0) {
                        }
                        i32 = i27;
                        if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (i32 & 38347923) != 38347922, i19 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i25 = i;
                    i26 = i6 & 8192;
                    if (i26 != 0) {
                    }
                    i28 = i6 & Fields.Clip;
                    if (i28 != 0) {
                    }
                    i29 = i6 & Fields.CompositingStrategy;
                    if (i29 == 0) {
                    }
                    i30 = i6 & 65536;
                    if (i30 == 0) {
                    }
                    i31 = i6 & Fields.RenderEffect;
                    if (i31 == 0) {
                    }
                    if ((i5 & 100663296) == 0) {
                    }
                    i32 = i27;
                    if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (i32 & 38347923) != 38347922, i19 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i16 = i7;
                i17 = i6 & Fields.RotationY;
                if (i17 == 0) {
                }
                i19 = i16;
                i20 = i6 & Fields.RotationZ;
                if (i20 == 0) {
                }
                i23 = i6 & Fields.CameraDistance;
                if (i23 == 0) {
                }
                int i432 = i22;
                i24 = i6 & Fields.TransformOrigin;
                if (i24 == 0) {
                }
                i25 = i;
                i26 = i6 & 8192;
                if (i26 != 0) {
                }
                i28 = i6 & Fields.Clip;
                if (i28 != 0) {
                }
                i29 = i6 & Fields.CompositingStrategy;
                if (i29 == 0) {
                }
                i30 = i6 & 65536;
                if (i30 == 0) {
                }
                i31 = i6 & Fields.RenderEffect;
                if (i31 == 0) {
                }
                if ((i5 & 100663296) == 0) {
                }
                i32 = i27;
                if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (i32 & 38347923) != 38347922, i19 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i10 = i6 & 16;
            if (i10 != 0) {
            }
            i12 = i6 & 32;
            if (i12 != 0) {
            }
            i13 = i6 & 64;
            int i412 = Fields.BlendMode;
            if (i13 != 0) {
            }
            i14 = i6 & Fields.SpotShadowColor;
            if (i14 != 0) {
            }
            i15 = i6 & Fields.RotationX;
            int i422 = GroupFlagsKt.HasAuxSlotFlag;
            if (i15 != 0) {
            }
            i16 = i7;
            i17 = i6 & Fields.RotationY;
            if (i17 == 0) {
            }
            i19 = i16;
            i20 = i6 & Fields.RotationZ;
            if (i20 == 0) {
            }
            i23 = i6 & Fields.CameraDistance;
            if (i23 == 0) {
            }
            int i4322 = i22;
            i24 = i6 & Fields.TransformOrigin;
            if (i24 == 0) {
            }
            i25 = i;
            i26 = i6 & 8192;
            if (i26 != 0) {
            }
            i28 = i6 & Fields.Clip;
            if (i28 != 0) {
            }
            i29 = i6 & Fields.CompositingStrategy;
            if (i29 == 0) {
            }
            i30 = i6 & 65536;
            if (i30 == 0) {
            }
            i31 = i6 & Fields.RenderEffect;
            if (i31 == 0) {
            }
            if ((i5 & 100663296) == 0) {
            }
            i32 = i27;
            if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (i32 & 38347923) != 38347922, i19 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i9 = i6 & 8;
        int i402 = Fields.RotationZ;
        if (i9 == 0) {
        }
        i10 = i6 & 16;
        if (i10 != 0) {
        }
        i12 = i6 & 32;
        if (i12 != 0) {
        }
        i13 = i6 & 64;
        int i4122 = Fields.BlendMode;
        if (i13 != 0) {
        }
        i14 = i6 & Fields.SpotShadowColor;
        if (i14 != 0) {
        }
        i15 = i6 & Fields.RotationX;
        int i4222 = GroupFlagsKt.HasAuxSlotFlag;
        if (i15 != 0) {
        }
        i16 = i7;
        i17 = i6 & Fields.RotationY;
        if (i17 == 0) {
        }
        i19 = i16;
        i20 = i6 & Fields.RotationZ;
        if (i20 == 0) {
        }
        i23 = i6 & Fields.CameraDistance;
        if (i23 == 0) {
        }
        int i43222 = i22;
        i24 = i6 & Fields.TransformOrigin;
        if (i24 == 0) {
        }
        i25 = i;
        i26 = i6 & 8192;
        if (i26 != 0) {
        }
        i28 = i6 & Fields.Clip;
        if (i28 != 0) {
        }
        i29 = i6 & Fields.CompositingStrategy;
        if (i29 == 0) {
        }
        i30 = i6 & 65536;
        if (i30 == 0) {
        }
        i31 = i6 & Fields.RenderEffect;
        if (i31 == 0) {
        }
        if ((i5 & 100663296) == 0) {
        }
        i32 = i27;
        if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (i32 & 38347923) != 38347922, i19 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    @er
    /* renamed from: Text-fLXpl1I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m2609TextfLXpl1I(final String str, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, ky kyVar, TextStyle textStyle, Composer composer, final int i3, final int i4, final int i5) {
        int i6;
        int i7;
        long j5;
        int i8;
        int i9;
        long j6;
        int i10;
        FontStyle fontStyle2;
        int i11;
        FontWeight fontWeight2;
        int i12;
        FontFamily fontFamily2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z2;
        int i25;
        int i26;
        int i27;
        int i28;
        Composer composer2;
        final Modifier modifier2;
        final TextAlign textAlign2;
        final int i29;
        final int i30;
        final ky kyVar2;
        final TextStyle textStyle2;
        final boolean z3;
        final long j7;
        final FontStyle fontStyle3;
        final long j8;
        final FontWeight fontWeight3;
        final FontFamily fontFamily3;
        final long j9;
        final TextDecoration textDecoration2;
        final long j10;
        ScopeUpdateScope endRestartGroup;
        int i31;
        ky kyVar3;
        TextStyle textStyle3;
        int i32;
        Modifier modifier3;
        int i33;
        long j11;
        ky kyVar4;
        TextDecoration textDecoration3;
        FontFamily fontFamily4;
        boolean z4;
        long j12;
        int i34;
        TextAlign textAlign3;
        FontStyle fontStyle4;
        long j13;
        FontWeight fontWeight4;
        long j14;
        Composer startRestartGroup = composer.startRestartGroup(1968784669);
        if ((i5 & 1) != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i6 = (startRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i35 = i5 & 2;
        if (i35 != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            i6 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i8 = i6 | 384;
                j5 = j;
            } else {
                int i36 = i6;
                j5 = j;
                if ((i3 & 384) == 0) {
                    i36 |= startRestartGroup.changed(j5) ? Fields.RotationX : Fields.SpotShadowColor;
                }
                i8 = i36;
            }
            i9 = i5 & 8;
            int i37 = Fields.RotationZ;
            if (i9 == 0) {
                i8 |= 3072;
                j6 = j2;
            } else {
                j6 = j2;
                if ((i3 & 3072) == 0) {
                    i8 |= startRestartGroup.changed(j6) ? 2048 : 1024;
                }
            }
            i10 = i5 & 16;
            if (i10 == 0) {
                i8 |= 24576;
            } else if ((i3 & 24576) == 0) {
                fontStyle2 = fontStyle;
                i8 |= startRestartGroup.changed(fontStyle2) ? 16384 : 8192;
                i11 = i5 & 32;
                int i38 = 65536;
                if (i11 != 0) {
                    i8 |= 196608;
                    fontWeight2 = fontWeight;
                } else {
                    fontWeight2 = fontWeight;
                    if ((i3 & 196608) == 0) {
                        i8 |= startRestartGroup.changed(fontWeight2) ? 131072 : 65536;
                    }
                }
                i12 = i5 & 64;
                if (i12 != 0) {
                    i8 |= 1572864;
                    fontFamily2 = fontFamily;
                } else {
                    fontFamily2 = fontFamily;
                    if ((i3 & 1572864) == 0) {
                        i8 |= startRestartGroup.changed(fontFamily2) ? 1048576 : Fields.BlendMode;
                    }
                }
                i13 = i5 & Fields.SpotShadowColor;
                if (i13 != 0) {
                    i8 |= 12582912;
                } else if ((i3 & 12582912) == 0) {
                    i14 = i8 | (startRestartGroup.changed(j3) ? GroupFlagsKt.IsNodeFlag : 4194304);
                    i15 = i5 & Fields.RotationX;
                    if (i15 == 0) {
                        i14 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i16 = i15;
                        i14 |= startRestartGroup.changed(textDecoration) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        i17 = i5 & Fields.RotationY;
                        if (i17 != 0) {
                            i14 |= 805306368;
                            i18 = i17;
                        } else if ((i3 & 805306368) == 0) {
                            i18 = i17;
                            i14 |= startRestartGroup.changed(textAlign) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        } else {
                            i18 = i17;
                        }
                        i19 = i14;
                        i20 = i5 & Fields.RotationZ;
                        if (i20 != 0) {
                            i21 = i4 | 6;
                        } else if ((i4 & 6) == 0) {
                            i21 = i4 | (startRestartGroup.changed(j4) ? 4 : 2);
                        } else {
                            i21 = i4;
                        }
                        i22 = i5 & Fields.CameraDistance;
                        if (i22 != 0) {
                            i21 |= 48;
                            i23 = i22;
                        } else if ((i4 & 48) == 0) {
                            i23 = i22;
                            i21 |= startRestartGroup.changed(i) ? 32 : 16;
                        } else {
                            i23 = i22;
                        }
                        int i39 = i21;
                        i24 = i5 & Fields.TransformOrigin;
                        if (i24 != 0) {
                            i39 |= 384;
                        } else if ((i4 & 384) == 0) {
                            z2 = z;
                            i39 |= startRestartGroup.changed(z2) ? Fields.RotationX : Fields.SpotShadowColor;
                            i25 = i5 & 8192;
                            if (i25 == 0) {
                                i26 = i39 | 3072;
                            } else {
                                int i40 = i39;
                                if ((i4 & 3072) == 0) {
                                    if (startRestartGroup.changed(i2)) {
                                        i37 = 2048;
                                    }
                                    i26 = i40 | i37;
                                } else {
                                    i26 = i40;
                                }
                            }
                            i27 = i5 & Fields.Clip;
                            if (i27 == 0) {
                                i26 |= 24576;
                            } else if ((i4 & 24576) == 0) {
                                i26 |= startRestartGroup.changedInstance(kyVar) ? 16384 : 8192;
                                if ((i4 & 196608) == 0) {
                                    if ((i5 & Fields.CompositingStrategy) == 0 && startRestartGroup.changed(textStyle)) {
                                        i38 = 131072;
                                    }
                                    i26 |= i38;
                                }
                                i28 = i26;
                                int i41 = 1;
                                if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (i28 & 74899) != 74898, i19 & 1)) {
                                    startRestartGroup.startDefaults();
                                    if ((i3 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                                        Modifier modifier4 = i35 != 0 ? Modifier.Companion : modifier;
                                        if (i7 != 0) {
                                            j5 = Color.Companion.m4797getUnspecified0d7_KjU();
                                        }
                                        if (i9 != 0) {
                                            j6 = TextUnit.Companion.m7816getUnspecifiedXSAIIZE();
                                        }
                                        if (i10 != 0) {
                                            fontStyle2 = null;
                                        }
                                        if (i11 != 0) {
                                            fontWeight2 = null;
                                        }
                                        if (i12 != 0) {
                                            fontFamily2 = null;
                                        }
                                        long m7816getUnspecifiedXSAIIZE = i13 != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j3;
                                        TextDecoration textDecoration4 = i16 != 0 ? null : textDecoration;
                                        TextAlign textAlign4 = i18 == 0 ? textAlign : null;
                                        long m7816getUnspecifiedXSAIIZE2 = i20 != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j4;
                                        int m7546getClipgIe3tQ8 = i23 != 0 ? TextOverflow.Companion.m7546getClipgIe3tQ8() : i;
                                        if (i24 != 0) {
                                            z2 = true;
                                        }
                                        int i42 = i25 != 0 ? Integer.MAX_VALUE : i2;
                                        if (i27 != 0) {
                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                            i31 = -458753;
                                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                                rememberedValue = new qu0(i41);
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            kyVar3 = (ky) rememberedValue;
                                        } else {
                                            i31 = -458753;
                                            kyVar3 = kyVar;
                                        }
                                        if ((i5 & Fields.CompositingStrategy) != 0) {
                                            textStyle3 = (TextStyle) startRestartGroup.consume(LocalTextStyle);
                                            i32 = i28 & i31;
                                            i33 = m7546getClipgIe3tQ8;
                                            j11 = m7816getUnspecifiedXSAIIZE2;
                                            modifier3 = modifier4;
                                        } else {
                                            textStyle3 = textStyle;
                                            i32 = i28;
                                            modifier3 = modifier4;
                                            i33 = m7546getClipgIe3tQ8;
                                            j11 = m7816getUnspecifiedXSAIIZE2;
                                        }
                                        kyVar4 = kyVar3;
                                        textDecoration3 = textDecoration4;
                                        fontFamily4 = fontFamily2;
                                        long j15 = m7816getUnspecifiedXSAIIZE;
                                        z4 = z2;
                                        j12 = j5;
                                        i34 = i42;
                                        textAlign3 = textAlign4;
                                        long j16 = j6;
                                        fontStyle4 = fontStyle2;
                                        j13 = j16;
                                        fontWeight4 = fontWeight2;
                                        j14 = j15;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i5 & Fields.CompositingStrategy) != 0) {
                                            i32 = i28 & (-458753);
                                            long j17 = j6;
                                            fontStyle4 = fontStyle2;
                                            j13 = j17;
                                            modifier3 = modifier;
                                            textDecoration3 = textDecoration;
                                            textAlign3 = textAlign;
                                            j11 = j4;
                                            i33 = i;
                                            i34 = i2;
                                            kyVar4 = kyVar;
                                            textStyle3 = textStyle;
                                        } else {
                                            long j18 = j6;
                                            fontStyle4 = fontStyle2;
                                            j13 = j18;
                                            modifier3 = modifier;
                                            textDecoration3 = textDecoration;
                                            textAlign3 = textAlign;
                                            j11 = j4;
                                            i33 = i;
                                            i34 = i2;
                                            kyVar4 = kyVar;
                                            textStyle3 = textStyle;
                                            i32 = i28;
                                        }
                                        z4 = z2;
                                        j12 = j5;
                                        fontWeight4 = fontWeight2;
                                        fontFamily4 = fontFamily2;
                                        j14 = j3;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1968784669, i19, i32, "androidx.compose.material3.Text (Text.kt:373)");
                                    }
                                    int i43 = i19 << 3;
                                    int i44 = (i19 & 1022) | (i43 & 57344) | (i43 & 458752) | (i43 & 3670016) | (i43 & 29360128) | (i43 & 234881024) | (i43 & 1879048192);
                                    int i45 = i32 << 3;
                                    int i46 = ((i19 >> 27) & 14) | 196608 | (i45 & 112) | (i45 & 896) | (i45 & 7168) | (i45 & 57344);
                                    int i47 = i32 << 6;
                                    composer2 = startRestartGroup;
                                    m2607TextNvy7gAk(str, modifier3, j12, null, j13, fontStyle4, fontWeight4, fontFamily4, j14, textDecoration3, textAlign3, j11, i33, z4, i34, 1, kyVar4, textStyle3, composer2, i44, i46 | (i47 & 3670016) | (i47 & 29360128), 8);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier2 = modifier3;
                                    j7 = j12;
                                    j8 = j13;
                                    fontStyle3 = fontStyle4;
                                    fontWeight3 = fontWeight4;
                                    fontFamily3 = fontFamily4;
                                    j9 = j14;
                                    textDecoration2 = textDecoration3;
                                    textAlign2 = textAlign3;
                                    j10 = j11;
                                    i29 = i33;
                                    z3 = z4;
                                    i30 = i34;
                                    kyVar2 = kyVar4;
                                    textStyle2 = textStyle3;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    modifier2 = modifier;
                                    textAlign2 = textAlign;
                                    i29 = i;
                                    i30 = i2;
                                    kyVar2 = kyVar;
                                    textStyle2 = textStyle;
                                    z3 = z2;
                                    j7 = j5;
                                    fontStyle3 = fontStyle2;
                                    j8 = j6;
                                    fontWeight3 = fontWeight2;
                                    fontFamily3 = fontFamily2;
                                    j9 = j3;
                                    textDecoration2 = textDecoration;
                                    j10 = j4;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new my() { // from class: su0
                                        @Override // defpackage.my
                                        public final Object invoke(Object obj, Object obj2) {
                                            w01 Text_fLXpl1I$lambda$15;
                                            int intValue = ((Integer) obj2).intValue();
                                            Text_fLXpl1I$lambda$15 = TextKt.Text_fLXpl1I$lambda$15(str, modifier2, j7, j8, fontStyle3, fontWeight3, fontFamily3, j9, textDecoration2, textAlign2, j10, i29, z3, i30, kyVar2, textStyle2, i3, i4, i5, (Composer) obj, intValue);
                                            return Text_fLXpl1I$lambda$15;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            if ((i4 & 196608) == 0) {
                            }
                            i28 = i26;
                            int i412 = 1;
                            if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (i28 & 74899) != 74898, i19 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        z2 = z;
                        i25 = i5 & 8192;
                        if (i25 == 0) {
                        }
                        i27 = i5 & Fields.Clip;
                        if (i27 == 0) {
                        }
                        if ((i4 & 196608) == 0) {
                        }
                        i28 = i26;
                        int i4122 = 1;
                        if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (i28 & 74899) != 74898, i19 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i16 = i15;
                    i17 = i5 & Fields.RotationY;
                    if (i17 != 0) {
                    }
                    i19 = i14;
                    i20 = i5 & Fields.RotationZ;
                    if (i20 != 0) {
                    }
                    i22 = i5 & Fields.CameraDistance;
                    if (i22 != 0) {
                    }
                    int i392 = i21;
                    i24 = i5 & Fields.TransformOrigin;
                    if (i24 != 0) {
                    }
                    z2 = z;
                    i25 = i5 & 8192;
                    if (i25 == 0) {
                    }
                    i27 = i5 & Fields.Clip;
                    if (i27 == 0) {
                    }
                    if ((i4 & 196608) == 0) {
                    }
                    i28 = i26;
                    int i41222 = 1;
                    if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (i28 & 74899) != 74898, i19 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i14 = i8;
                i15 = i5 & Fields.RotationX;
                if (i15 == 0) {
                }
                i16 = i15;
                i17 = i5 & Fields.RotationY;
                if (i17 != 0) {
                }
                i19 = i14;
                i20 = i5 & Fields.RotationZ;
                if (i20 != 0) {
                }
                i22 = i5 & Fields.CameraDistance;
                if (i22 != 0) {
                }
                int i3922 = i21;
                i24 = i5 & Fields.TransformOrigin;
                if (i24 != 0) {
                }
                z2 = z;
                i25 = i5 & 8192;
                if (i25 == 0) {
                }
                i27 = i5 & Fields.Clip;
                if (i27 == 0) {
                }
                if ((i4 & 196608) == 0) {
                }
                i28 = i26;
                int i412222 = 1;
                if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (i28 & 74899) != 74898, i19 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            fontStyle2 = fontStyle;
            i11 = i5 & 32;
            int i382 = 65536;
            if (i11 != 0) {
            }
            i12 = i5 & 64;
            if (i12 != 0) {
            }
            i13 = i5 & Fields.SpotShadowColor;
            if (i13 != 0) {
            }
            i14 = i8;
            i15 = i5 & Fields.RotationX;
            if (i15 == 0) {
            }
            i16 = i15;
            i17 = i5 & Fields.RotationY;
            if (i17 != 0) {
            }
            i19 = i14;
            i20 = i5 & Fields.RotationZ;
            if (i20 != 0) {
            }
            i22 = i5 & Fields.CameraDistance;
            if (i22 != 0) {
            }
            int i39222 = i21;
            i24 = i5 & Fields.TransformOrigin;
            if (i24 != 0) {
            }
            z2 = z;
            i25 = i5 & 8192;
            if (i25 == 0) {
            }
            i27 = i5 & Fields.Clip;
            if (i27 == 0) {
            }
            if ((i4 & 196608) == 0) {
            }
            i28 = i26;
            int i4122222 = 1;
            if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (i28 & 74899) != 74898, i19 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        i9 = i5 & 8;
        int i372 = Fields.RotationZ;
        if (i9 == 0) {
        }
        i10 = i5 & 16;
        if (i10 == 0) {
        }
        fontStyle2 = fontStyle;
        i11 = i5 & 32;
        int i3822 = 65536;
        if (i11 != 0) {
        }
        i12 = i5 & 64;
        if (i12 != 0) {
        }
        i13 = i5 & Fields.SpotShadowColor;
        if (i13 != 0) {
        }
        i14 = i8;
        i15 = i5 & Fields.RotationX;
        if (i15 == 0) {
        }
        i16 = i15;
        i17 = i5 & Fields.RotationY;
        if (i17 != 0) {
        }
        i19 = i14;
        i20 = i5 & Fields.RotationZ;
        if (i20 != 0) {
        }
        i22 = i5 & Fields.CameraDistance;
        if (i22 != 0) {
        }
        int i392222 = i21;
        i24 = i5 & Fields.TransformOrigin;
        if (i24 != 0) {
        }
        z2 = z;
        i25 = i5 & 8192;
        if (i25 == 0) {
        }
        i27 = i5 & Fields.Clip;
        if (i27 == 0) {
        }
        if ((i4 & 196608) == 0) {
        }
        i28 = i26;
        int i41222222 = 1;
        if (startRestartGroup.shouldExecute((i19 & 306783379) == 306783378 || (i28 & 74899) != 74898, i19 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Text_IbK3jfQ$lambda$11$lambda$10(TextLayoutResult textLayoutResult) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Text_IbK3jfQ$lambda$12(AnnotatedString annotatedString, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, Map map, ky kyVar, TextStyle textStyle, int i4, int i5, int i6, Composer composer, int i7) {
        m2606TextIbK3jfQ(annotatedString, modifier, j, j2, fontStyle, fontWeight, fontFamily, j3, textDecoration, textAlign, j4, i, z, i2, i3, map, kyVar, textStyle, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Text_Nvy7gAk$lambda$2(String str, Modifier modifier, long j, TextAutoSize textAutoSize, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, ky kyVar, TextStyle textStyle, int i4, int i5, int i6, Composer composer, int i7) {
        m2607TextNvy7gAk(str, modifier, j, textAutoSize, j2, fontStyle, fontWeight, fontFamily, j3, textDecoration, textAlign, j4, i, z, i2, i3, kyVar, textStyle, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Text_Z58ophY$lambda$4$lambda$3(TextLayoutResult textLayoutResult) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Text_Z58ophY$lambda$8(AnnotatedString annotatedString, Modifier modifier, long j, TextAutoSize textAutoSize, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, Map map, ky kyVar, TextStyle textStyle, int i4, int i5, int i6, Composer composer, int i7) {
        m2608TextZ58ophY(annotatedString, modifier, j, textAutoSize, j2, fontStyle, fontWeight, fontFamily, j3, textDecoration, textAlign, j4, i, z, i2, i3, map, kyVar, textStyle, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Text__4IGK_g$lambda$17$lambda$16(TextLayoutResult textLayoutResult) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Text__4IGK_g$lambda$18(AnnotatedString annotatedString, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, Map map, ky kyVar, TextStyle textStyle, int i3, int i4, int i5, Composer composer, int i6) {
        m2604Text4IGK_g(annotatedString, modifier, j, j2, fontStyle, fontWeight, fontFamily, j3, textDecoration, textAlign, j4, i, z, i2, map, kyVar, textStyle, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Text__4IGK_g$lambda$9(String str, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, ky kyVar, TextStyle textStyle, int i4, int i5, int i6, Composer composer, int i7) {
        m2605Text4IGK_g(str, modifier, j, j2, fontStyle, fontWeight, fontFamily, j3, textDecoration, textAlign, j4, i, z, i2, i3, kyVar, textStyle, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Text_fLXpl1I$lambda$14$lambda$13(TextLayoutResult textLayoutResult) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Text_fLXpl1I$lambda$15(String str, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, ky kyVar, TextStyle textStyle, int i3, int i4, int i5, Composer composer, int i6) {
        m2609TextfLXpl1I(str, modifier, j, j2, fontStyle, fontWeight, fontFamily, j3, textDecoration, textAlign, j4, i, z, i2, kyVar, textStyle, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return w01.a;
    }

    private static final AnnotatedString createTextWithLinkStyles(AnnotatedString annotatedString, TextLinkStyles textLinkStyles) {
        return annotatedString.mapAnnotations(new vt0(textLinkStyles, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotatedString.Range createTextWithLinkStyles$lambda$21(TextLinkStyles textLinkStyles, AnnotatedString.Range range) {
        AnnotatedString.Annotation annotation = (AnnotatedString.Annotation) range.getItem();
        if (annotation instanceof LinkAnnotation.Url) {
            LinkAnnotation.Url url = (LinkAnnotation.Url) annotation;
            if (url.getStyles() == null) {
                return AnnotatedString.Range.copy$default(range, LinkAnnotation.Url.copy$default(url, null, textLinkStyles, null, 5, null), 0, 0, null, 14, null);
            }
        }
        if (annotation instanceof LinkAnnotation.Clickable) {
            LinkAnnotation.Clickable clickable = (LinkAnnotation.Clickable) annotation;
            if (clickable.getStyles() == null) {
                return AnnotatedString.Range.copy$default(range, LinkAnnotation.Clickable.copy$default(clickable, null, textLinkStyles, null, 5, null), 0, 0, null, 14, null);
            }
        }
        return range;
    }

    public static final ProvidableCompositionLocal<TextStyle> getLocalTextStyle() {
        return LocalTextStyle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final TextLinkStyles rememberTextLinkStyles(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1113329403, i, -1, "androidx.compose.material3.rememberTextLinkStyles (Text.kt:481)");
        }
        long m1772getPrimary0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1772getPrimary0d7_KjU();
        boolean changed = composer.changed(m1772getPrimary0d7_KjU);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            Object[] objArr3 = 0 == true ? 1 : 0;
            TextLinkStyles textLinkStyles = new TextLinkStyles(new SpanStyle(m1772getPrimary0d7_KjU, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61438, (dq) null), objArr, objArr2, objArr3, 14, 0 == true ? 1 : 0);
            composer.updateRememberedValue(textLinkStyles);
            rememberedValue = textLinkStyles;
        }
        TextLinkStyles textLinkStyles2 = (TextLinkStyles) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textLinkStyles2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    @er
    /* renamed from: Text--4IGK_g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m2605Text4IGK_g(final String str, Modifier modifier, long j, long j2, FontStyle fontStyle, FontWeight fontWeight, FontFamily fontFamily, long j3, TextDecoration textDecoration, TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, ky kyVar, TextStyle textStyle, Composer composer, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        long j5;
        int i9;
        int i10;
        long j6;
        int i11;
        FontStyle fontStyle2;
        int i12;
        FontWeight fontWeight2;
        int i13;
        FontFamily fontFamily2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z2;
        int i26;
        int i27;
        int i28;
        int i29;
        Composer composer2;
        final Modifier modifier2;
        final TextAlign textAlign2;
        final int i30;
        final int i31;
        final int i32;
        final ky kyVar2;
        final TextStyle textStyle2;
        final boolean z3;
        final long j7;
        final FontStyle fontStyle3;
        final long j8;
        final FontWeight fontWeight3;
        final FontFamily fontFamily3;
        final long j9;
        final TextDecoration textDecoration2;
        final long j10;
        ScopeUpdateScope endRestartGroup;
        Modifier modifier3;
        long j11;
        ky kyVar3;
        int i33;
        int i34;
        TextStyle textStyle3;
        boolean z4;
        long j12;
        int i35;
        TextAlign textAlign3;
        TextDecoration textDecoration3;
        FontFamily fontFamily4;
        FontStyle fontStyle4;
        long j13;
        FontWeight fontWeight4;
        long j14;
        Composer startRestartGroup = composer.startRestartGroup(-2055108902);
        if ((i6 & 1) != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i7 = (startRestartGroup.changed(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i36 = i6 & 2;
        if (i36 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            i7 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i8 = i6 & 4;
            if (i8 == 0) {
                i9 = i7 | 384;
                j5 = j;
            } else {
                int i37 = i7;
                j5 = j;
                if ((i4 & 384) == 0) {
                    i37 |= startRestartGroup.changed(j5) ? Fields.RotationX : Fields.SpotShadowColor;
                }
                i9 = i37;
            }
            i10 = i6 & 8;
            int i38 = Fields.RotationZ;
            if (i10 == 0) {
                i9 |= 3072;
                j6 = j2;
            } else {
                j6 = j2;
                if ((i4 & 3072) == 0) {
                    i9 |= startRestartGroup.changed(j6) ? 2048 : 1024;
                }
            }
            i11 = i6 & 16;
            if (i11 == 0) {
                i9 |= 24576;
            } else if ((i4 & 24576) == 0) {
                fontStyle2 = fontStyle;
                i9 |= startRestartGroup.changed(fontStyle2) ? 16384 : 8192;
                i12 = i6 & 32;
                int i39 = Fields.RenderEffect;
                if (i12 != 0) {
                    i9 |= 196608;
                    fontWeight2 = fontWeight;
                } else {
                    fontWeight2 = fontWeight;
                    if ((i4 & 196608) == 0) {
                        i9 |= startRestartGroup.changed(fontWeight2) ? 131072 : 65536;
                    }
                }
                i13 = i6 & 64;
                int i40 = Fields.BlendMode;
                if (i13 != 0) {
                    i9 |= 1572864;
                    fontFamily2 = fontFamily;
                } else {
                    fontFamily2 = fontFamily;
                    if ((i4 & 1572864) == 0) {
                        i9 |= startRestartGroup.changed(fontFamily2) ? 1048576 : 524288;
                    }
                }
                i14 = i6 & Fields.SpotShadowColor;
                if (i14 != 0) {
                    i9 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    i15 = i9 | (startRestartGroup.changed(j3) ? GroupFlagsKt.IsNodeFlag : 4194304);
                    i16 = i6 & Fields.RotationX;
                    if (i16 == 0) {
                        i15 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        i17 = i16;
                        i15 |= startRestartGroup.changed(textDecoration) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        i18 = i6 & Fields.RotationY;
                        if (i18 != 0) {
                            i15 |= 805306368;
                            i19 = i18;
                        } else if ((i4 & 805306368) == 0) {
                            i19 = i18;
                            i15 |= startRestartGroup.changed(textAlign) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                        } else {
                            i19 = i18;
                        }
                        i20 = i15;
                        i21 = i6 & Fields.RotationZ;
                        if (i21 != 0) {
                            i22 = i5 | 6;
                        } else if ((i5 & 6) == 0) {
                            i22 = i5 | (startRestartGroup.changed(j4) ? 4 : 2);
                        } else {
                            i22 = i5;
                        }
                        i23 = i6 & Fields.CameraDistance;
                        if (i23 != 0) {
                            i22 |= 48;
                            i24 = i23;
                        } else if ((i5 & 48) == 0) {
                            i24 = i23;
                            i22 |= startRestartGroup.changed(i) ? 32 : 16;
                        } else {
                            i24 = i23;
                        }
                        int i41 = i22;
                        i25 = i6 & Fields.TransformOrigin;
                        if (i25 != 0) {
                            i41 |= 384;
                        } else if ((i5 & 384) == 0) {
                            z2 = z;
                            i41 |= startRestartGroup.changed(z2) ? Fields.RotationX : Fields.SpotShadowColor;
                            i26 = i6 & 8192;
                            if (i26 == 0) {
                                i27 = i41 | 3072;
                            } else {
                                int i42 = i41;
                                if ((i5 & 3072) == 0) {
                                    if (startRestartGroup.changed(i2)) {
                                        i38 = 2048;
                                    }
                                    i27 = i42 | i38;
                                } else {
                                    i27 = i42;
                                }
                            }
                            i28 = i6 & Fields.Clip;
                            if (i28 == 0) {
                                i27 |= 24576;
                            } else if ((i5 & 24576) == 0) {
                                i27 |= startRestartGroup.changed(i3) ? 16384 : 8192;
                                i29 = i6 & Fields.CompositingStrategy;
                                if (i29 != 0) {
                                    i27 |= 196608;
                                } else if ((i5 & 196608) == 0) {
                                    if (!startRestartGroup.changedInstance(kyVar)) {
                                        i39 = 65536;
                                    }
                                    i27 |= i39;
                                }
                                if ((i5 & 1572864) == 0) {
                                    if ((i6 & 65536) == 0 && startRestartGroup.changed(textStyle)) {
                                        i40 = 1048576;
                                    }
                                    i27 |= i40;
                                }
                                if (startRestartGroup.shouldExecute((i20 & 306783379) == 306783378 || (599187 & i27) != 599186, i20 & 1)) {
                                    startRestartGroup.startDefaults();
                                    if ((i4 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                        startRestartGroup.skipToGroupEnd();
                                        if ((i6 & 65536) != 0) {
                                            i27 &= -3670017;
                                        }
                                        long j15 = j6;
                                        fontStyle4 = fontStyle2;
                                        j13 = j15;
                                        modifier3 = modifier;
                                        textDecoration3 = textDecoration;
                                        textAlign3 = textAlign;
                                        j11 = j4;
                                        i34 = i;
                                        i35 = i2;
                                        i33 = i3;
                                        kyVar3 = kyVar;
                                        textStyle3 = textStyle;
                                        z4 = z2;
                                        j12 = j5;
                                        fontWeight4 = fontWeight2;
                                        fontFamily4 = fontFamily2;
                                        j14 = j3;
                                    } else {
                                        Modifier modifier4 = i36 != 0 ? Modifier.Companion : modifier;
                                        if (i8 != 0) {
                                            j5 = Color.Companion.m4797getUnspecified0d7_KjU();
                                        }
                                        if (i10 != 0) {
                                            j6 = TextUnit.Companion.m7816getUnspecifiedXSAIIZE();
                                        }
                                        if (i11 != 0) {
                                            fontStyle2 = null;
                                        }
                                        if (i12 != 0) {
                                            fontWeight2 = null;
                                        }
                                        if (i13 != 0) {
                                            fontFamily2 = null;
                                        }
                                        long m7816getUnspecifiedXSAIIZE = i14 != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j3;
                                        TextDecoration textDecoration4 = i17 != 0 ? null : textDecoration;
                                        TextAlign textAlign4 = i19 != 0 ? null : textAlign;
                                        long m7816getUnspecifiedXSAIIZE2 = i21 != 0 ? TextUnit.Companion.m7816getUnspecifiedXSAIIZE() : j4;
                                        int m7546getClipgIe3tQ8 = i24 != 0 ? TextOverflow.Companion.m7546getClipgIe3tQ8() : i;
                                        if (i25 != 0) {
                                            z2 = true;
                                        }
                                        int i43 = i26 != 0 ? Integer.MAX_VALUE : i2;
                                        int i44 = i28 == 0 ? i3 : 1;
                                        ky kyVar4 = i29 == 0 ? kyVar : null;
                                        if ((i6 & 65536) != 0) {
                                            i27 &= -3670017;
                                            j11 = m7816getUnspecifiedXSAIIZE2;
                                            kyVar3 = kyVar4;
                                            i33 = i44;
                                            i34 = m7546getClipgIe3tQ8;
                                            textStyle3 = (TextStyle) startRestartGroup.consume(LocalTextStyle);
                                            modifier3 = modifier4;
                                        } else {
                                            modifier3 = modifier4;
                                            j11 = m7816getUnspecifiedXSAIIZE2;
                                            kyVar3 = kyVar4;
                                            i33 = i44;
                                            i34 = m7546getClipgIe3tQ8;
                                            textStyle3 = textStyle;
                                        }
                                        long j16 = m7816getUnspecifiedXSAIIZE;
                                        z4 = z2;
                                        j12 = j5;
                                        i35 = i43;
                                        textAlign3 = textAlign4;
                                        textDecoration3 = textDecoration4;
                                        fontFamily4 = fontFamily2;
                                        long j17 = j6;
                                        fontStyle4 = fontStyle2;
                                        j13 = j17;
                                        fontWeight4 = fontWeight2;
                                        j14 = j16;
                                    }
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-2055108902, i20, i27, "androidx.compose.material3.Text (Text.kt:283)");
                                    }
                                    int i45 = i20 << 3;
                                    int i46 = (i20 & 14) | 3072 | (i20 & 112) | (i20 & 896) | (i45 & 57344) | (i45 & 458752) | (i45 & 3670016) | (i45 & 29360128) | (i45 & 234881024) | (i45 & 1879048192);
                                    int i47 = i27 << 3;
                                    composer2 = startRestartGroup;
                                    m2607TextNvy7gAk(str, modifier3, j12, null, j13, fontStyle4, fontWeight4, fontFamily4, j14, textDecoration3, textAlign3, j11, i34, z4, i35, i33, kyVar3, textStyle3, composer2, i46, ((i20 >> 27) & 14) | (i47 & 112) | (i47 & 896) | (i47 & 7168) | (i47 & 57344) | (i47 & 458752) | (i47 & 3670016) | (i47 & 29360128), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier2 = modifier3;
                                    j7 = j12;
                                    j8 = j13;
                                    fontStyle3 = fontStyle4;
                                    fontWeight3 = fontWeight4;
                                    fontFamily3 = fontFamily4;
                                    j9 = j14;
                                    textDecoration2 = textDecoration3;
                                    textAlign2 = textAlign3;
                                    j10 = j11;
                                    i30 = i34;
                                    z3 = z4;
                                    i31 = i35;
                                    i32 = i33;
                                    kyVar2 = kyVar3;
                                    textStyle2 = textStyle3;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    modifier2 = modifier;
                                    textAlign2 = textAlign;
                                    i30 = i;
                                    i31 = i2;
                                    i32 = i3;
                                    kyVar2 = kyVar;
                                    textStyle2 = textStyle;
                                    z3 = z2;
                                    j7 = j5;
                                    fontStyle3 = fontStyle2;
                                    j8 = j6;
                                    fontWeight3 = fontWeight2;
                                    fontFamily3 = fontFamily2;
                                    j9 = j3;
                                    textDecoration2 = textDecoration;
                                    j10 = j4;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new my() { // from class: ou0
                                        @Override // defpackage.my
                                        public final Object invoke(Object obj, Object obj2) {
                                            w01 Text__4IGK_g$lambda$9;
                                            int intValue = ((Integer) obj2).intValue();
                                            Text__4IGK_g$lambda$9 = TextKt.Text__4IGK_g$lambda$9(str, modifier2, j7, j8, fontStyle3, fontWeight3, fontFamily3, j9, textDecoration2, textAlign2, j10, i30, z3, i31, i32, kyVar2, textStyle2, i4, i5, i6, (Composer) obj, intValue);
                                            return Text__4IGK_g$lambda$9;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i29 = i6 & Fields.CompositingStrategy;
                            if (i29 != 0) {
                            }
                            if ((i5 & 1572864) == 0) {
                            }
                            if (startRestartGroup.shouldExecute((i20 & 306783379) == 306783378 || (599187 & i27) != 599186, i20 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        z2 = z;
                        i26 = i6 & 8192;
                        if (i26 == 0) {
                        }
                        i28 = i6 & Fields.Clip;
                        if (i28 == 0) {
                        }
                        i29 = i6 & Fields.CompositingStrategy;
                        if (i29 != 0) {
                        }
                        if ((i5 & 1572864) == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i20 & 306783379) == 306783378 || (599187 & i27) != 599186, i20 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i17 = i16;
                    i18 = i6 & Fields.RotationY;
                    if (i18 != 0) {
                    }
                    i20 = i15;
                    i21 = i6 & Fields.RotationZ;
                    if (i21 != 0) {
                    }
                    i23 = i6 & Fields.CameraDistance;
                    if (i23 != 0) {
                    }
                    int i412 = i22;
                    i25 = i6 & Fields.TransformOrigin;
                    if (i25 != 0) {
                    }
                    z2 = z;
                    i26 = i6 & 8192;
                    if (i26 == 0) {
                    }
                    i28 = i6 & Fields.Clip;
                    if (i28 == 0) {
                    }
                    i29 = i6 & Fields.CompositingStrategy;
                    if (i29 != 0) {
                    }
                    if ((i5 & 1572864) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i20 & 306783379) == 306783378 || (599187 & i27) != 599186, i20 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i15 = i9;
                i16 = i6 & Fields.RotationX;
                if (i16 == 0) {
                }
                i17 = i16;
                i18 = i6 & Fields.RotationY;
                if (i18 != 0) {
                }
                i20 = i15;
                i21 = i6 & Fields.RotationZ;
                if (i21 != 0) {
                }
                i23 = i6 & Fields.CameraDistance;
                if (i23 != 0) {
                }
                int i4122 = i22;
                i25 = i6 & Fields.TransformOrigin;
                if (i25 != 0) {
                }
                z2 = z;
                i26 = i6 & 8192;
                if (i26 == 0) {
                }
                i28 = i6 & Fields.Clip;
                if (i28 == 0) {
                }
                i29 = i6 & Fields.CompositingStrategy;
                if (i29 != 0) {
                }
                if ((i5 & 1572864) == 0) {
                }
                if (startRestartGroup.shouldExecute((i20 & 306783379) == 306783378 || (599187 & i27) != 599186, i20 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            fontStyle2 = fontStyle;
            i12 = i6 & 32;
            int i392 = Fields.RenderEffect;
            if (i12 != 0) {
            }
            i13 = i6 & 64;
            int i402 = Fields.BlendMode;
            if (i13 != 0) {
            }
            i14 = i6 & Fields.SpotShadowColor;
            if (i14 != 0) {
            }
            i15 = i9;
            i16 = i6 & Fields.RotationX;
            if (i16 == 0) {
            }
            i17 = i16;
            i18 = i6 & Fields.RotationY;
            if (i18 != 0) {
            }
            i20 = i15;
            i21 = i6 & Fields.RotationZ;
            if (i21 != 0) {
            }
            i23 = i6 & Fields.CameraDistance;
            if (i23 != 0) {
            }
            int i41222 = i22;
            i25 = i6 & Fields.TransformOrigin;
            if (i25 != 0) {
            }
            z2 = z;
            i26 = i6 & 8192;
            if (i26 == 0) {
            }
            i28 = i6 & Fields.Clip;
            if (i28 == 0) {
            }
            i29 = i6 & Fields.CompositingStrategy;
            if (i29 != 0) {
            }
            if ((i5 & 1572864) == 0) {
            }
            if (startRestartGroup.shouldExecute((i20 & 306783379) == 306783378 || (599187 & i27) != 599186, i20 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        i10 = i6 & 8;
        int i382 = Fields.RotationZ;
        if (i10 == 0) {
        }
        i11 = i6 & 16;
        if (i11 == 0) {
        }
        fontStyle2 = fontStyle;
        i12 = i6 & 32;
        int i3922 = Fields.RenderEffect;
        if (i12 != 0) {
        }
        i13 = i6 & 64;
        int i4022 = Fields.BlendMode;
        if (i13 != 0) {
        }
        i14 = i6 & Fields.SpotShadowColor;
        if (i14 != 0) {
        }
        i15 = i9;
        i16 = i6 & Fields.RotationX;
        if (i16 == 0) {
        }
        i17 = i16;
        i18 = i6 & Fields.RotationY;
        if (i18 != 0) {
        }
        i20 = i15;
        i21 = i6 & Fields.RotationZ;
        if (i21 != 0) {
        }
        i23 = i6 & Fields.CameraDistance;
        if (i23 != 0) {
        }
        int i412222 = i22;
        i25 = i6 & Fields.TransformOrigin;
        if (i25 != 0) {
        }
        z2 = z;
        i26 = i6 & 8192;
        if (i26 == 0) {
        }
        i28 = i6 & Fields.Clip;
        if (i28 == 0) {
        }
        i29 = i6 & Fields.CompositingStrategy;
        if (i29 != 0) {
        }
        if ((i5 & 1572864) == 0) {
        }
        if (startRestartGroup.shouldExecute((i20 & 306783379) == 306783378 || (599187 & i27) != 599186, i20 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
