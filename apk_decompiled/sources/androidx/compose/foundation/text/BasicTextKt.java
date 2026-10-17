package androidx.compose.foundation.text;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.SelectionController;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNodeKt;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import defpackage.ed;
import defpackage.er;
import defpackage.i2;
import defpackage.i3;
import defpackage.iy;
import defpackage.j3;
import defpackage.k4;
import defpackage.kd;
import defpackage.ky;
import defpackage.ld;
import defpackage.my;
import defpackage.od;
import defpackage.pd;
import defpackage.qd;
import defpackage.rd;
import defpackage.uo;
import defpackage.v4;
import defpackage.vt;
import defpackage.w01;
import defpackage.w5;
import defpackage.xe0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BasicTextKt {
    /* JADX WARN: Removed duplicated region for block: B:105:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0079  */
    @er
    /* renamed from: BasicText-4YKlhWE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m1073BasicText4YKlhWE(AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, ky kyVar, int i, boolean z, int i2, Map map, Composer composer, int i3, int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        TextStyle textStyle2;
        int i7;
        ky kyVar2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Composer composer2;
        int i13;
        int i14;
        Modifier modifier3;
        TextStyle textStyle3;
        ky kyVar3;
        boolean z2;
        Map map2;
        ScopeUpdateScope endRestartGroup;
        int i15;
        Modifier modifier4;
        int i16;
        ky kyVar4;
        Composer startRestartGroup = composer.startRestartGroup(-648605928);
        if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changed(annotatedString) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i17 = i4 & 2;
        if (i17 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 384) == 0) {
                textStyle2 = textStyle;
                i5 |= startRestartGroup.changed(textStyle2) ? Fields.RotationX : Fields.SpotShadowColor;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    kyVar2 = kyVar;
                    i5 |= startRestartGroup.changedInstance(kyVar2) ? Fields.CameraDistance : Fields.RotationZ;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i3 & 24576) == 0) {
                        i5 |= startRestartGroup.changed(i) ? Fields.Clip : 8192;
                        i9 = i4 & 32;
                        if (i9 != 0) {
                            i5 |= 196608;
                        } else if ((196608 & i3) == 0) {
                            i5 |= startRestartGroup.changed(z) ? Fields.RenderEffect : 65536;
                            i10 = i4 & 64;
                            if (i10 == 0) {
                                i5 |= 1572864;
                            } else if ((i3 & 1572864) == 0) {
                                i5 |= startRestartGroup.changed(i2) ? 1048576 : Fields.BlendMode;
                            }
                            i11 = i4 & Fields.SpotShadowColor;
                            if (i11 == 0) {
                                i5 |= 12582912;
                            } else if ((i3 & 12582912) == 0) {
                                i12 = i11;
                                i5 |= startRestartGroup.changedInstance(map) ? GroupFlagsKt.IsNodeFlag : 4194304;
                                if (startRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
                                    if (i17 != 0) {
                                        modifier4 = Modifier.Companion;
                                        i15 = i8;
                                    } else {
                                        i15 = i8;
                                        modifier4 = modifier2;
                                    }
                                    TextStyle textStyle4 = i6 != 0 ? TextStyle.Companion.getDefault() : textStyle2;
                                    if (i7 != 0) {
                                        kyVar4 = null;
                                        i16 = i9;
                                    } else {
                                        i16 = i9;
                                        kyVar4 = kyVar2;
                                    }
                                    int m7546getClipgIe3tQ8 = i15 != 0 ? TextOverflow.Companion.m7546getClipgIe3tQ8() : i;
                                    boolean z3 = i16 != 0 ? true : z;
                                    int i18 = i10 != 0 ? Integer.MAX_VALUE : i2;
                                    Map map3 = i12 != 0 ? vt.d : map;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-648605928, i5, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:408)");
                                    }
                                    composer2 = startRestartGroup;
                                    m1076BasicTextCL7eQgs(annotatedString, modifier4, textStyle4, kyVar4, m7546getClipgIe3tQ8, z3, i18, 1, map3, null, null, composer2, (i5 & 14) | 12582912 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | ((i5 << 3) & 234881024), 0, 1536);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier4;
                                    textStyle3 = textStyle4;
                                    kyVar3 = kyVar4;
                                    i13 = m7546getClipgIe3tQ8;
                                    z2 = z3;
                                    i14 = i18;
                                    map2 = map3;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    i13 = i;
                                    i14 = i2;
                                    modifier3 = modifier2;
                                    textStyle3 = textStyle2;
                                    kyVar3 = kyVar2;
                                    z2 = z;
                                    map2 = map;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new pd(annotatedString, modifier3, textStyle3, kyVar3, i13, z2, i14, map2, i3, i4));
                                    return;
                                }
                                return;
                            }
                            i12 = i11;
                            if (startRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i10 = i4 & 64;
                        if (i10 == 0) {
                        }
                        i11 = i4 & Fields.SpotShadowColor;
                        if (i11 == 0) {
                        }
                        i12 = i11;
                        if (startRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i9 = i4 & 32;
                    if (i9 != 0) {
                    }
                    i10 = i4 & 64;
                    if (i10 == 0) {
                    }
                    i11 = i4 & Fields.SpotShadowColor;
                    if (i11 == 0) {
                    }
                    i12 = i11;
                    if (startRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                kyVar2 = kyVar;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i4 & 32;
                if (i9 != 0) {
                }
                i10 = i4 & 64;
                if (i10 == 0) {
                }
                i11 = i4 & Fields.SpotShadowColor;
                if (i11 == 0) {
                }
                i12 = i11;
                if (startRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            textStyle2 = textStyle;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            kyVar2 = kyVar;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i4 & 32;
            if (i9 != 0) {
            }
            i10 = i4 & 64;
            if (i10 == 0) {
            }
            i11 = i4 & Fields.SpotShadowColor;
            if (i11 == 0) {
            }
            i12 = i11;
            if (startRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        textStyle2 = textStyle;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        kyVar2 = kyVar;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i4 & 32;
        if (i9 != 0) {
        }
        i10 = i4 & 64;
        if (i10 == 0) {
        }
        i11 = i4 & Fields.SpotShadowColor;
        if (i11 == 0) {
        }
        i12 = i11;
        if (startRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0041  */
    @er
    /* renamed from: BasicText-BpD7jsM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m1075BasicTextBpD7jsM(final String str, Modifier modifier, TextStyle textStyle, ky kyVar, int i, boolean z, int i2, Composer composer, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        TextStyle textStyle2;
        int i7;
        int i8;
        int i9;
        boolean z2;
        int i10;
        Composer composer2;
        final int i11;
        final int i12;
        final Modifier modifier3;
        final TextStyle textStyle3;
        final ky kyVar2;
        ScopeUpdateScope endRestartGroup;
        int i13;
        TextStyle textStyle4;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(1022429478);
        if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changed(str) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i16 = i4 & 2;
        if (i16 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 384) == 0) {
                textStyle2 = textStyle;
                i5 |= startRestartGroup.changed(textStyle2) ? Fields.RotationX : Fields.SpotShadowColor;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    i5 |= startRestartGroup.changedInstance(kyVar) ? Fields.CameraDistance : Fields.RotationZ;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i3 & 24576) == 0) {
                        i5 |= startRestartGroup.changed(i) ? Fields.Clip : 8192;
                        i9 = i4 & 32;
                        if (i9 != 0) {
                            i5 |= 196608;
                        } else if ((196608 & i3) == 0) {
                            z2 = z;
                            i5 |= startRestartGroup.changed(z2) ? Fields.RenderEffect : 65536;
                            i10 = i4 & 64;
                            if (i10 == 0) {
                                i5 |= 1572864;
                            } else if ((i3 & 1572864) == 0) {
                                i5 |= startRestartGroup.changed(i2) ? 1048576 : Fields.BlendMode;
                            }
                            if (startRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                i11 = i;
                                i12 = i2;
                                modifier3 = modifier2;
                                textStyle3 = textStyle2;
                                kyVar2 = kyVar;
                            } else {
                                Modifier modifier4 = i16 != 0 ? Modifier.Companion : modifier2;
                                if (i6 != 0) {
                                    textStyle4 = TextStyle.Companion.getDefault();
                                    i13 = i8;
                                } else {
                                    i13 = i8;
                                    textStyle4 = textStyle2;
                                }
                                ky kyVar3 = i7 != 0 ? null : kyVar;
                                if (i13 != 0) {
                                    i15 = TextOverflow.Companion.m7546getClipgIe3tQ8();
                                    i14 = i9;
                                } else {
                                    i14 = i9;
                                    i15 = i;
                                }
                                if (i14 != 0) {
                                    z2 = true;
                                }
                                int i17 = i10 != 0 ? Integer.MAX_VALUE : i2;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1022429478, i5, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:384)");
                                }
                                composer2 = startRestartGroup;
                                m1078BasicTextRWo7tUw(str, modifier4, textStyle4, kyVar3, i15, z2, i17, 1, (ColorProducer) null, (TextAutoSize) null, composer2, (i5 & 14) | 12582912 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 768);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                textStyle3 = textStyle4;
                                kyVar2 = kyVar3;
                                i11 = i15;
                                i12 = i17;
                            }
                            final boolean z3 = z2;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new my() { // from class: nd
                                    @Override // defpackage.my
                                    public final Object invoke(Object obj, Object obj2) {
                                        w01 BasicText_BpD7jsM$lambda$0;
                                        int intValue = ((Integer) obj2).intValue();
                                        BasicText_BpD7jsM$lambda$0 = BasicTextKt.BasicText_BpD7jsM$lambda$0(str, modifier3, textStyle3, kyVar2, i11, z3, i12, i3, i4, (Composer) obj, intValue);
                                        return BasicText_BpD7jsM$lambda$0;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        z2 = z;
                        i10 = i4 & 64;
                        if (i10 == 0) {
                        }
                        if (startRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
                        }
                        final boolean z32 = z2;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i9 = i4 & 32;
                    if (i9 != 0) {
                    }
                    z2 = z;
                    i10 = i4 & 64;
                    if (i10 == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
                    }
                    final boolean z322 = z2;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i4 & 32;
                if (i9 != 0) {
                }
                z2 = z;
                i10 = i4 & 64;
                if (i10 == 0) {
                }
                if (startRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
                }
                final boolean z3222 = z2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            textStyle2 = textStyle;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i4 & 32;
            if (i9 != 0) {
            }
            z2 = z;
            i10 = i4 & 64;
            if (i10 == 0) {
            }
            if (startRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
            }
            final boolean z32222 = z2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        textStyle2 = textStyle;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i4 & 32;
        if (i9 != 0) {
        }
        z2 = z;
        i10 = i4 & 64;
        if (i10 == 0) {
        }
        if (startRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
        }
        final boolean z322222 = z2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0173  */
    /* renamed from: BasicText-CL7eQgs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1076BasicTextCL7eQgs(AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, ky kyVar, int i, boolean z, int i2, int i3, Map<String, InlineTextContent> map, ColorProducer colorProducer, TextAutoSize textAutoSize, Composer composer, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        TextStyle textStyle2;
        int i9;
        ky kyVar2;
        int i10;
        int i11;
        int i12;
        int i13;
        final int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        final AnnotatedString annotatedString2;
        Composer composer2;
        final Modifier modifier2;
        final int i24;
        final Map<String, InlineTextContent> map2;
        final ColorProducer colorProducer2;
        final int i25;
        final TextStyle textStyle3;
        final ky kyVar3;
        final boolean z2;
        final TextAutoSize textAutoSize2;
        ScopeUpdateScope endRestartGroup;
        int i26;
        Modifier modifier3;
        TextStyle textStyle4;
        boolean z3;
        SelectionController selectionController;
        int i27;
        TextStyle textStyle5;
        boolean changed;
        Object rememberedValue;
        Composer startRestartGroup = composer.startRestartGroup(-1343466571);
        if ((i4 & 6) == 0) {
            i7 = (startRestartGroup.changed(annotatedString) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i28 = i6 & 2;
        if (i28 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            i7 |= startRestartGroup.changed(modifier) ? 32 : 16;
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else if ((i4 & 384) == 0) {
                textStyle2 = textStyle;
                i7 |= startRestartGroup.changed(textStyle2) ? Fields.RotationX : Fields.SpotShadowColor;
                i9 = i6 & 8;
                if (i9 != 0) {
                    i7 |= 3072;
                } else if ((i4 & 3072) == 0) {
                    kyVar2 = kyVar;
                    i7 |= startRestartGroup.changedInstance(kyVar2) ? Fields.CameraDistance : Fields.RotationZ;
                    i10 = i6 & 16;
                    if (i10 == 0) {
                        i7 |= 24576;
                    } else if ((i4 & 24576) == 0) {
                        i11 = i;
                        i7 |= startRestartGroup.changed(i11) ? Fields.Clip : 8192;
                        i12 = i6 & 32;
                        if (i12 != 0) {
                            i7 |= 196608;
                        } else if ((i4 & 196608) == 0) {
                            i7 |= startRestartGroup.changed(z) ? Fields.RenderEffect : 65536;
                        }
                        i13 = i6 & 64;
                        if (i13 != 0) {
                            i7 |= 1572864;
                            i14 = i2;
                        } else {
                            i14 = i2;
                            if ((i4 & 1572864) == 0) {
                                i7 |= startRestartGroup.changed(i14) ? 1048576 : Fields.BlendMode;
                            }
                        }
                        i15 = i6 & Fields.SpotShadowColor;
                        if (i15 != 0) {
                            i7 |= 12582912;
                        } else if ((i4 & 12582912) == 0) {
                            i16 = i15;
                            i7 |= startRestartGroup.changed(i3) ? GroupFlagsKt.IsNodeFlag : 4194304;
                            i17 = i6 & Fields.RotationX;
                            if (i17 == 0) {
                                i7 |= 100663296;
                            } else if ((i4 & 100663296) == 0) {
                                i18 = i17;
                                i7 |= startRestartGroup.changedInstance(map) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                                i19 = i6 & Fields.RotationY;
                                if (i19 != 0) {
                                    i7 |= 805306368;
                                } else if ((i4 & 805306368) == 0) {
                                    i20 = i19;
                                    i7 |= startRestartGroup.changedInstance(colorProducer) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                                    i21 = i6 & Fields.RotationZ;
                                    if (i21 == 0) {
                                        i23 = i5 | 6;
                                    } else {
                                        if ((i5 & 6) != 0) {
                                            i22 = i5;
                                            if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i22 & 3) != 2, i7 & 1)) {
                                                Modifier modifier4 = i28 != 0 ? Modifier.Companion : modifier;
                                                TextStyle textStyle6 = i8 != 0 ? TextStyle.Companion.getDefault() : textStyle2;
                                                ky kyVar4 = i9 != 0 ? null : kyVar2;
                                                if (i10 != 0) {
                                                    i11 = TextOverflow.Companion.m7546getClipgIe3tQ8();
                                                }
                                                boolean z4 = i12 != 0 ? true : z;
                                                if (i13 != 0) {
                                                    i14 = Integer.MAX_VALUE;
                                                }
                                                int i29 = i14;
                                                int i30 = i11;
                                                int i31 = i16 != 0 ? 1 : i3;
                                                Map<String, InlineTextContent> map3 = i18 != 0 ? vt.d : map;
                                                ColorProducer colorProducer3 = i20 != 0 ? null : colorProducer;
                                                TextAutoSize textAutoSize3 = i21 != 0 ? null : textAutoSize;
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1343466571, i7, i22, "androidx.compose.foundation.text.BasicText (BasicText.kt:200)");
                                                }
                                                HeightInLinesModifierKt.validateMinMaxLines(i31, i29);
                                                SelectionRegistrar selectionRegistrar = (SelectionRegistrar) startRestartGroup.consume(SelectionRegistrarKt.getLocalSelectionRegistrar());
                                                if (selectionRegistrar != null) {
                                                    startRestartGroup.startReplaceGroup(1588268245);
                                                    z3 = z4;
                                                    long m1568getBackgroundColor0d7_KjU = ((TextSelectionColors) startRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).m1568getBackgroundColor0d7_KjU();
                                                    Object[] objArr = {selectionRegistrar};
                                                    i26 = i22;
                                                    Saver<Long, Long> selectionIdSaver = selectionIdSaver(selectionRegistrar);
                                                    boolean changedInstance = startRestartGroup.changedInstance(selectionRegistrar);
                                                    modifier3 = modifier4;
                                                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                                                    if (changedInstance) {
                                                        textStyle4 = textStyle6;
                                                    } else {
                                                        textStyle4 = textStyle6;
                                                        if (rememberedValue2 != Composer.Companion.getEmpty()) {
                                                            long longValue = ((Number) RememberSaveableKt.m4146rememberSaveable(objArr, (Saver) selectionIdSaver, (iy) rememberedValue2, startRestartGroup, 0)).longValue();
                                                            changed = startRestartGroup.changed(longValue) | startRestartGroup.changed(selectionRegistrar) | startRestartGroup.changed(m1568getBackgroundColor0d7_KjU);
                                                            rememberedValue = startRestartGroup.rememberedValue();
                                                            if (!changed || rememberedValue == Composer.Companion.getEmpty()) {
                                                                rememberedValue = new SelectionController(longValue, selectionRegistrar, m1568getBackgroundColor0d7_KjU, null, 8, null);
                                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                                            }
                                                            startRestartGroup.endReplaceGroup();
                                                            selectionController = (SelectionController) rememberedValue;
                                                        }
                                                    }
                                                    rememberedValue2 = new rd(selectionRegistrar, 1);
                                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                                    long longValue2 = ((Number) RememberSaveableKt.m4146rememberSaveable(objArr, (Saver) selectionIdSaver, (iy) rememberedValue2, startRestartGroup, 0)).longValue();
                                                    changed = startRestartGroup.changed(longValue2) | startRestartGroup.changed(selectionRegistrar) | startRestartGroup.changed(m1568getBackgroundColor0d7_KjU);
                                                    rememberedValue = startRestartGroup.rememberedValue();
                                                    if (!changed) {
                                                    }
                                                    rememberedValue = new SelectionController(longValue2, selectionRegistrar, m1568getBackgroundColor0d7_KjU, null, 8, null);
                                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                                    startRestartGroup.endReplaceGroup();
                                                    selectionController = (SelectionController) rememberedValue;
                                                } else {
                                                    i26 = i22;
                                                    modifier3 = modifier4;
                                                    textStyle4 = textStyle6;
                                                    z3 = z4;
                                                    startRestartGroup.startReplaceGroup(1588759409);
                                                    startRestartGroup.endReplaceGroup();
                                                    selectionController = null;
                                                }
                                                boolean hasInlineContent = AnnotatedStringResolveInlineContentKt.hasInlineContent(annotatedString);
                                                boolean hasLinks = TextAnnotatedStringNodeKt.hasLinks(annotatedString);
                                                FontFamily.Resolver resolver = (FontFamily.Resolver) startRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                                                if (hasInlineContent || hasLinks) {
                                                    annotatedString2 = annotatedString;
                                                    i27 = i30;
                                                    TextStyle textStyle7 = textStyle4;
                                                    SelectionController selectionController2 = selectionController;
                                                    startRestartGroup.startReplaceGroup(1590022070);
                                                    boolean z5 = (i7 & 14) == 4;
                                                    Object rememberedValue3 = startRestartGroup.rememberedValue();
                                                    if (z5 || rememberedValue3 == Composer.Companion.getEmpty()) {
                                                        rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(annotatedString2, null, 2, null);
                                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                                    }
                                                    MutableState mutableState = (MutableState) rememberedValue3;
                                                    boolean z6 = z3;
                                                    AnnotatedString BasicText_CL7eQgs$lambda$3 = BasicText_CL7eQgs$lambda$3(mutableState);
                                                    boolean changed2 = startRestartGroup.changed(mutableState);
                                                    Object rememberedValue4 = startRestartGroup.rememberedValue();
                                                    if (changed2 || rememberedValue4 == Composer.Companion.getEmpty()) {
                                                        rememberedValue4 = new i3(mutableState, 6);
                                                        startRestartGroup.updateRememberedValue(rememberedValue4);
                                                    }
                                                    int i32 = i7 << 6;
                                                    int i33 = ((i7 >> 21) & 896) | ((i26 << 12) & 57344);
                                                    composer2 = startRestartGroup;
                                                    Modifier modifier5 = modifier3;
                                                    m1081LayoutWithLinksAndInlineContent11Od_4g(modifier5, BasicText_CL7eQgs$lambda$3, kyVar4, hasInlineContent, map3, textStyle7, i27, z6, i29, i31, resolver, selectionController2, colorProducer3, (ky) rememberedValue4, textAutoSize3, composer2, ((i7 >> 3) & 910) | ((i7 >> 12) & 57344) | ((i7 << 9) & 458752) | (3670016 & i32) | (29360128 & i32) | (234881024 & i32) | (i32 & 1879048192), i33, 0);
                                                    textStyle5 = textStyle7;
                                                    z3 = z6;
                                                    modifier3 = modifier5;
                                                    composer2.endReplaceGroup();
                                                } else {
                                                    startRestartGroup.startReplaceGroup(1589006262);
                                                    TextStyle textStyle8 = textStyle4;
                                                    BasicText_androidKt.BackgroundTextMeasurement(annotatedString, textStyle8, resolver, null, startRestartGroup, (i7 & 14) | 3072 | ((i7 >> 3) & 112));
                                                    annotatedString2 = annotatedString;
                                                    i27 = i30;
                                                    Modifier m1082textModifierCL7eQgs = m1082textModifierCL7eQgs(modifier3, annotatedString2, textStyle8, kyVar4, i27, z3, i29, i31, resolver, null, null, selectionController, colorProducer3, null, textAutoSize3);
                                                    EmptyMeasurePolicy emptyMeasurePolicy = EmptyMeasurePolicy.INSTANCE;
                                                    int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                                                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1082textModifierCL7eQgs);
                                                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
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
                                                    Updater.m3886setimpl(m3878constructorimpl, emptyMeasurePolicy, companion.getSetMeasurePolicy());
                                                    Updater.m3886setimpl(m3878constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                                    Updater.m3884reconcileimpl(m3878constructorimpl, companion.getApplyOnDeactivatedNodeAssertion());
                                                    Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
                                                    Updater.m3882initimpl(m3878constructorimpl, Integer.valueOf(hashCode), companion.getSetCompositeKeyHash());
                                                    startRestartGroup.endNode();
                                                    startRestartGroup.endReplaceGroup();
                                                    composer2 = startRestartGroup;
                                                    textStyle5 = textStyle8;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                                i25 = i27;
                                                i24 = i31;
                                                colorProducer2 = colorProducer3;
                                                textAutoSize2 = textAutoSize3;
                                                map2 = map3;
                                                kyVar3 = kyVar4;
                                                i14 = i29;
                                                z2 = z3;
                                                textStyle3 = textStyle5;
                                                modifier2 = modifier3;
                                            } else {
                                                annotatedString2 = annotatedString;
                                                composer2 = startRestartGroup;
                                                composer2.skipToGroupEnd();
                                                modifier2 = modifier;
                                                i24 = i3;
                                                map2 = map;
                                                colorProducer2 = colorProducer;
                                                i25 = i11;
                                                textStyle3 = textStyle2;
                                                kyVar3 = kyVar2;
                                                z2 = z;
                                                textAutoSize2 = textAutoSize;
                                            }
                                            endRestartGroup = composer2.endRestartGroup();
                                            if (endRestartGroup != null) {
                                                endRestartGroup.updateScope(new my() { // from class: jd
                                                    @Override // defpackage.my
                                                    public final Object invoke(Object obj, Object obj2) {
                                                        w01 BasicText_CL7eQgs$lambda$6;
                                                        int intValue = ((Integer) obj2).intValue();
                                                        BasicText_CL7eQgs$lambda$6 = BasicTextKt.BasicText_CL7eQgs$lambda$6(AnnotatedString.this, modifier2, textStyle3, kyVar3, i25, z2, i14, i24, map2, colorProducer2, textAutoSize2, i4, i5, i6, (Composer) obj, intValue);
                                                        return BasicText_CL7eQgs$lambda$6;
                                                    }
                                                });
                                                return;
                                            }
                                            return;
                                        }
                                        i23 = i5 | ((i5 & 8) == 0 ? startRestartGroup.changed(textAutoSize) : startRestartGroup.changedInstance(textAutoSize) ? 4 : 2);
                                    }
                                    i22 = i23;
                                    if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i22 & 3) != 2, i7 & 1)) {
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup != null) {
                                    }
                                }
                                i20 = i19;
                                i21 = i6 & Fields.RotationZ;
                                if (i21 == 0) {
                                }
                                i22 = i23;
                                if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i22 & 3) != 2, i7 & 1)) {
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                }
                            }
                            i18 = i17;
                            i19 = i6 & Fields.RotationY;
                            if (i19 != 0) {
                            }
                            i20 = i19;
                            i21 = i6 & Fields.RotationZ;
                            if (i21 == 0) {
                            }
                            i22 = i23;
                            if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i22 & 3) != 2, i7 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i16 = i15;
                        i17 = i6 & Fields.RotationX;
                        if (i17 == 0) {
                        }
                        i18 = i17;
                        i19 = i6 & Fields.RotationY;
                        if (i19 != 0) {
                        }
                        i20 = i19;
                        i21 = i6 & Fields.RotationZ;
                        if (i21 == 0) {
                        }
                        i22 = i23;
                        if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i22 & 3) != 2, i7 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i11 = i;
                    i12 = i6 & 32;
                    if (i12 != 0) {
                    }
                    i13 = i6 & 64;
                    if (i13 != 0) {
                    }
                    i15 = i6 & Fields.SpotShadowColor;
                    if (i15 != 0) {
                    }
                    i16 = i15;
                    i17 = i6 & Fields.RotationX;
                    if (i17 == 0) {
                    }
                    i18 = i17;
                    i19 = i6 & Fields.RotationY;
                    if (i19 != 0) {
                    }
                    i20 = i19;
                    i21 = i6 & Fields.RotationZ;
                    if (i21 == 0) {
                    }
                    i22 = i23;
                    if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i22 & 3) != 2, i7 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                kyVar2 = kyVar;
                i10 = i6 & 16;
                if (i10 == 0) {
                }
                i11 = i;
                i12 = i6 & 32;
                if (i12 != 0) {
                }
                i13 = i6 & 64;
                if (i13 != 0) {
                }
                i15 = i6 & Fields.SpotShadowColor;
                if (i15 != 0) {
                }
                i16 = i15;
                i17 = i6 & Fields.RotationX;
                if (i17 == 0) {
                }
                i18 = i17;
                i19 = i6 & Fields.RotationY;
                if (i19 != 0) {
                }
                i20 = i19;
                i21 = i6 & Fields.RotationZ;
                if (i21 == 0) {
                }
                i22 = i23;
                if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i22 & 3) != 2, i7 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            textStyle2 = textStyle;
            i9 = i6 & 8;
            if (i9 != 0) {
            }
            kyVar2 = kyVar;
            i10 = i6 & 16;
            if (i10 == 0) {
            }
            i11 = i;
            i12 = i6 & 32;
            if (i12 != 0) {
            }
            i13 = i6 & 64;
            if (i13 != 0) {
            }
            i15 = i6 & Fields.SpotShadowColor;
            if (i15 != 0) {
            }
            i16 = i15;
            i17 = i6 & Fields.RotationX;
            if (i17 == 0) {
            }
            i18 = i17;
            i19 = i6 & Fields.RotationY;
            if (i19 != 0) {
            }
            i20 = i19;
            i21 = i6 & Fields.RotationZ;
            if (i21 == 0) {
            }
            i22 = i23;
            if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i22 & 3) != 2, i7 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        textStyle2 = textStyle;
        i9 = i6 & 8;
        if (i9 != 0) {
        }
        kyVar2 = kyVar;
        i10 = i6 & 16;
        if (i10 == 0) {
        }
        i11 = i;
        i12 = i6 & 32;
        if (i12 != 0) {
        }
        i13 = i6 & 64;
        if (i13 != 0) {
        }
        i15 = i6 & Fields.SpotShadowColor;
        if (i15 != 0) {
        }
        i16 = i15;
        i17 = i6 & Fields.RotationX;
        if (i17 == 0) {
        }
        i18 = i17;
        i19 = i6 & Fields.RotationY;
        if (i19 != 0) {
        }
        i20 = i19;
        i21 = i6 & Fields.RotationZ;
        if (i21 == 0) {
        }
        i22 = i23;
        if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i22 & 3) != 2, i7 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* renamed from: BasicText-RWo7tUw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1078BasicTextRWo7tUw(String str, Modifier modifier, TextStyle textStyle, ky kyVar, int i, boolean z, int i2, int i3, ColorProducer colorProducer, TextAutoSize textAutoSize, Composer composer, int i4, int i5) {
        int i6;
        Modifier modifier2;
        int i7;
        TextStyle textStyle2;
        int i8;
        ky kyVar2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z2;
        int i18;
        TextAutoSize textAutoSize2;
        Composer composer2;
        Modifier modifier3;
        TextStyle textStyle3;
        ky kyVar3;
        int i19;
        int i20;
        ColorProducer colorProducer2;
        ScopeUpdateScope endRestartGroup;
        int i21;
        SelectionController selectionController;
        int i22;
        int i23;
        TextStyle textStyle4;
        Modifier modifier4;
        Modifier m1082textModifierCL7eQgs;
        int i24;
        Composer startRestartGroup = composer.startRestartGroup(-1040751001);
        if ((i4 & 6) == 0) {
            i6 = (startRestartGroup.changed(str) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i25 = i5 & 2;
        if (i25 != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            modifier2 = modifier;
            i6 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i4 & 384) == 0) {
                textStyle2 = textStyle;
                i6 |= startRestartGroup.changed(textStyle2) ? Fields.RotationX : Fields.SpotShadowColor;
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else if ((i4 & 3072) == 0) {
                    kyVar2 = kyVar;
                    i6 |= startRestartGroup.changedInstance(kyVar2) ? Fields.CameraDistance : Fields.RotationZ;
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else if ((i4 & 24576) == 0) {
                        i10 = i;
                        i6 |= startRestartGroup.changed(i10) ? Fields.Clip : 8192;
                        i11 = i5 & 32;
                        if (i11 != 0) {
                            i6 |= 196608;
                        } else if ((i4 & 196608) == 0) {
                            i6 |= startRestartGroup.changed(z) ? Fields.RenderEffect : 65536;
                        }
                        i12 = i5 & 64;
                        if (i12 != 0) {
                            i6 |= 1572864;
                        } else if ((i4 & 1572864) == 0) {
                            i6 |= startRestartGroup.changed(i2) ? 1048576 : Fields.BlendMode;
                        }
                        i13 = i5 & Fields.SpotShadowColor;
                        if (i13 != 0) {
                            i6 |= 12582912;
                        } else if ((i4 & 12582912) == 0) {
                            i14 = i13;
                            i6 |= startRestartGroup.changed(i3) ? GroupFlagsKt.IsNodeFlag : 4194304;
                            i15 = i5 & Fields.RotationX;
                            if (i15 == 0) {
                                i6 |= 100663296;
                            } else if ((i4 & 100663296) == 0) {
                                i16 = i15;
                                i6 |= startRestartGroup.changedInstance(colorProducer) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                                i17 = i5 & Fields.RotationY;
                                int i26 = 805306368;
                                if (i17 == 0) {
                                    if ((i4 & 805306368) == 0) {
                                        i26 = (i4 & GroupFlagsKt.IsSubcompositionContextFlag) == 0 ? startRestartGroup.changed(textAutoSize) : startRestartGroup.changedInstance(textAutoSize) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                                    }
                                    if (startRestartGroup.shouldExecute((i6 & 306783379) == 306783378, i6 & 1)) {
                                        startRestartGroup.skipToGroupEnd();
                                        z2 = z;
                                        i18 = i3;
                                        textAutoSize2 = textAutoSize;
                                        composer2 = startRestartGroup;
                                        modifier3 = modifier2;
                                        textStyle3 = textStyle2;
                                        kyVar3 = kyVar2;
                                        i19 = i10;
                                        i20 = i2;
                                        colorProducer2 = colorProducer;
                                    } else {
                                        if (i25 != 0) {
                                            modifier2 = Modifier.Companion;
                                        }
                                        if (i7 != 0) {
                                            textStyle2 = TextStyle.Companion.getDefault();
                                        }
                                        ky kyVar4 = i8 != 0 ? null : kyVar2;
                                        int m7546getClipgIe3tQ8 = i9 != 0 ? TextOverflow.Companion.m7546getClipgIe3tQ8() : i10;
                                        boolean z3 = i11 != 0 ? true : z;
                                        int i27 = i12 != 0 ? Integer.MAX_VALUE : i2;
                                        int i28 = i14 != 0 ? 1 : i3;
                                        ColorProducer colorProducer3 = i16 != 0 ? null : colorProducer;
                                        TextAutoSize textAutoSize3 = i17 != 0 ? null : textAutoSize;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1040751001, i6, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:102)");
                                        }
                                        HeightInLinesModifierKt.validateMinMaxLines(i28, i27);
                                        SelectionRegistrar selectionRegistrar = (SelectionRegistrar) startRestartGroup.consume(SelectionRegistrarKt.getLocalSelectionRegistrar());
                                        if (selectionRegistrar != null) {
                                            startRestartGroup.startReplaceGroup(356423075);
                                            long m1568getBackgroundColor0d7_KjU = ((TextSelectionColors) startRestartGroup.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).m1568getBackgroundColor0d7_KjU();
                                            Object[] objArr = {selectionRegistrar};
                                            Saver<Long, Long> selectionIdSaver = selectionIdSaver(selectionRegistrar);
                                            boolean changedInstance = startRestartGroup.changedInstance(selectionRegistrar);
                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                                                i24 = 0;
                                                rememberedValue = new rd(selectionRegistrar, i24);
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            } else {
                                                i24 = 0;
                                            }
                                            Number number = (Number) RememberSaveableKt.m4146rememberSaveable(objArr, (Saver) selectionIdSaver, (iy) rememberedValue, startRestartGroup, i24);
                                            i21 = i6;
                                            long longValue = number.longValue();
                                            boolean changed = startRestartGroup.changed(longValue) | startRestartGroup.changed(selectionRegistrar) | startRestartGroup.changed(m1568getBackgroundColor0d7_KjU);
                                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                                            if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                                                rememberedValue2 = new SelectionController(longValue, selectionRegistrar, m1568getBackgroundColor0d7_KjU, null, 8, null);
                                                startRestartGroup.updateRememberedValue(rememberedValue2);
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            selectionController = (SelectionController) rememberedValue2;
                                        } else {
                                            i21 = i6;
                                            startRestartGroup.startReplaceGroup(356914239);
                                            startRestartGroup.endReplaceGroup();
                                            selectionController = null;
                                        }
                                        FontFamily.Resolver resolver = (FontFamily.Resolver) startRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                                        BasicText_androidKt.BackgroundTextMeasurement(str, textStyle2, resolver, startRestartGroup, (i21 & 14) | ((i21 >> 3) & 112));
                                        if (selectionController == null && kyVar4 == null && textAutoSize3 == null) {
                                            startRestartGroup.startReplaceGroup(357875859);
                                            startRestartGroup.endReplaceGroup();
                                            int i29 = i27;
                                            int i30 = i28;
                                            TextStyle textStyle5 = textStyle2;
                                            textStyle4 = textStyle5;
                                            i22 = i29;
                                            i23 = i30;
                                            m1082textModifierCL7eQgs = modifier2.then(new TextStringSimpleElement(str, textStyle5, resolver, m7546getClipgIe3tQ8, z3, i29, i30, colorProducer3, null));
                                            modifier4 = modifier2;
                                        } else {
                                            i22 = i27;
                                            i23 = i28;
                                            textStyle4 = textStyle2;
                                            startRestartGroup.startReplaceGroup(357232113);
                                            modifier4 = modifier2;
                                            m1082textModifierCL7eQgs = m1082textModifierCL7eQgs(modifier4, new AnnotatedString(str, null, 2, 0 == true ? 1 : 0), textStyle4, kyVar4, m7546getClipgIe3tQ8, z3, i22, i23, (FontFamily.Resolver) startRestartGroup.consume(CompositionLocalsKt.getLocalFontFamilyResolver()), null, null, selectionController, colorProducer3, null, textAutoSize3);
                                            startRestartGroup.endReplaceGroup();
                                        }
                                        EmptyMeasurePolicy emptyMeasurePolicy = EmptyMeasurePolicy.INSTANCE;
                                        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1082textModifierCL7eQgs);
                                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
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
                                        Updater.m3886setimpl(m3878constructorimpl, emptyMeasurePolicy, companion.getSetMeasurePolicy());
                                        Updater.m3886setimpl(m3878constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                        Updater.m3884reconcileimpl(m3878constructorimpl, companion.getApplyOnDeactivatedNodeAssertion());
                                        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, companion.getSetModifier());
                                        Updater.m3882initimpl(m3878constructorimpl, Integer.valueOf(hashCode), companion.getSetCompositeKeyHash());
                                        startRestartGroup.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        composer2 = startRestartGroup;
                                        modifier3 = modifier4;
                                        textStyle3 = textStyle4;
                                        kyVar3 = kyVar4;
                                        i19 = m7546getClipgIe3tQ8;
                                        z2 = z3;
                                        i20 = i22;
                                        i18 = i23;
                                        colorProducer2 = colorProducer3;
                                        textAutoSize2 = textAutoSize3;
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup == null) {
                                        endRestartGroup.updateScope(new od(str, modifier3, textStyle3, kyVar3, i19, z2, i20, i18, colorProducer2, textAutoSize2, i4, i5));
                                        return;
                                    }
                                    return;
                                }
                                i6 |= i26;
                                if (startRestartGroup.shouldExecute((i6 & 306783379) == 306783378, i6 & 1)) {
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            i16 = i15;
                            i17 = i5 & Fields.RotationY;
                            int i262 = 805306368;
                            if (i17 == 0) {
                            }
                            i6 |= i262;
                            if (startRestartGroup.shouldExecute((i6 & 306783379) == 306783378, i6 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i14 = i13;
                        i15 = i5 & Fields.RotationX;
                        if (i15 == 0) {
                        }
                        i16 = i15;
                        i17 = i5 & Fields.RotationY;
                        int i2622 = 805306368;
                        if (i17 == 0) {
                        }
                        i6 |= i2622;
                        if (startRestartGroup.shouldExecute((i6 & 306783379) == 306783378, i6 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i10 = i;
                    i11 = i5 & 32;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 64;
                    if (i12 != 0) {
                    }
                    i13 = i5 & Fields.SpotShadowColor;
                    if (i13 != 0) {
                    }
                    i14 = i13;
                    i15 = i5 & Fields.RotationX;
                    if (i15 == 0) {
                    }
                    i16 = i15;
                    i17 = i5 & Fields.RotationY;
                    int i26222 = 805306368;
                    if (i17 == 0) {
                    }
                    i6 |= i26222;
                    if (startRestartGroup.shouldExecute((i6 & 306783379) == 306783378, i6 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                kyVar2 = kyVar;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                i10 = i;
                i11 = i5 & 32;
                if (i11 != 0) {
                }
                i12 = i5 & 64;
                if (i12 != 0) {
                }
                i13 = i5 & Fields.SpotShadowColor;
                if (i13 != 0) {
                }
                i14 = i13;
                i15 = i5 & Fields.RotationX;
                if (i15 == 0) {
                }
                i16 = i15;
                i17 = i5 & Fields.RotationY;
                int i262222 = 805306368;
                if (i17 == 0) {
                }
                i6 |= i262222;
                if (startRestartGroup.shouldExecute((i6 & 306783379) == 306783378, i6 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            textStyle2 = textStyle;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            kyVar2 = kyVar;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            i10 = i;
            i11 = i5 & 32;
            if (i11 != 0) {
            }
            i12 = i5 & 64;
            if (i12 != 0) {
            }
            i13 = i5 & Fields.SpotShadowColor;
            if (i13 != 0) {
            }
            i14 = i13;
            i15 = i5 & Fields.RotationX;
            if (i15 == 0) {
            }
            i16 = i15;
            i17 = i5 & Fields.RotationY;
            int i2622222 = 805306368;
            if (i17 == 0) {
            }
            i6 |= i2622222;
            if (startRestartGroup.shouldExecute((i6 & 306783379) == 306783378, i6 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        textStyle2 = textStyle;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        kyVar2 = kyVar;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i;
        i11 = i5 & 32;
        if (i11 != 0) {
        }
        i12 = i5 & 64;
        if (i12 != 0) {
        }
        i13 = i5 & Fields.SpotShadowColor;
        if (i13 != 0) {
        }
        i14 = i13;
        i15 = i5 & Fields.RotationX;
        if (i15 == 0) {
        }
        i16 = i15;
        i17 = i5 & Fields.RotationY;
        int i26222222 = 805306368;
        if (i17 == 0) {
        }
        i6 |= i26222222;
        if (startRestartGroup.shouldExecute((i6 & 306783379) == 306783378, i6 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00b2  */
    @er
    /* renamed from: BasicText-VhcvRP8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m1079BasicTextVhcvRP8(AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, ky kyVar, int i, boolean z, int i2, int i3, Map map, Composer composer, int i4, int i5) {
        int i6;
        Modifier modifier2;
        int i7;
        TextStyle textStyle2;
        int i8;
        ky kyVar2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer composer2;
        int i16;
        int i17;
        Map map2;
        Modifier modifier3;
        TextStyle textStyle3;
        ky kyVar3;
        boolean z2;
        int i18;
        ScopeUpdateScope endRestartGroup;
        int i19;
        TextStyle textStyle4;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        Composer startRestartGroup = composer.startRestartGroup(851408699);
        if ((i4 & 6) == 0) {
            i6 = (startRestartGroup.changed(annotatedString) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i26 = i5 & 2;
        if (i26 != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            modifier2 = modifier;
            i6 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i4 & 384) == 0) {
                textStyle2 = textStyle;
                i6 |= startRestartGroup.changed(textStyle2) ? Fields.RotationX : Fields.SpotShadowColor;
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else if ((i4 & 3072) == 0) {
                    kyVar2 = kyVar;
                    i6 |= startRestartGroup.changedInstance(kyVar2) ? Fields.CameraDistance : Fields.RotationZ;
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else if ((i4 & 24576) == 0) {
                        i6 |= startRestartGroup.changed(i) ? Fields.Clip : 8192;
                        i10 = i5 & 32;
                        if (i10 != 0) {
                            i6 |= 196608;
                        } else if ((196608 & i4) == 0) {
                            i6 |= startRestartGroup.changed(z) ? Fields.RenderEffect : 65536;
                            i11 = i5 & 64;
                            if (i11 == 0) {
                                i6 |= 1572864;
                            } else if ((i4 & 1572864) == 0) {
                                i6 |= startRestartGroup.changed(i2) ? 1048576 : Fields.BlendMode;
                            }
                            i12 = i5 & Fields.SpotShadowColor;
                            if (i12 == 0) {
                                i6 |= 12582912;
                            } else if ((i4 & 12582912) == 0) {
                                i13 = i12;
                                i6 |= startRestartGroup.changed(i3) ? GroupFlagsKt.IsNodeFlag : 4194304;
                                i14 = i5 & Fields.RotationX;
                                if (i14 != 0) {
                                    i6 |= 100663296;
                                } else if ((i4 & 100663296) == 0) {
                                    i15 = i14;
                                    i6 |= startRestartGroup.changedInstance(map) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                                    if (startRestartGroup.shouldExecute((i6 & 38347923) == 38347922, i6 & 1)) {
                                        composer2 = startRestartGroup;
                                        composer2.skipToGroupEnd();
                                        i16 = i;
                                        i17 = i2;
                                        map2 = map;
                                        modifier3 = modifier2;
                                        textStyle3 = textStyle2;
                                        kyVar3 = kyVar2;
                                        z2 = z;
                                        i18 = i3;
                                    } else {
                                        Modifier modifier4 = i26 != 0 ? Modifier.Companion : modifier2;
                                        if (i7 != 0) {
                                            textStyle4 = TextStyle.Companion.getDefault();
                                            i19 = i10;
                                        } else {
                                            i19 = i10;
                                            textStyle4 = textStyle2;
                                        }
                                        ky kyVar4 = i8 != 0 ? null : kyVar2;
                                        if (i9 != 0) {
                                            i21 = TextOverflow.Companion.m7546getClipgIe3tQ8();
                                            i20 = i11;
                                        } else {
                                            i20 = i11;
                                            i21 = i;
                                        }
                                        boolean z3 = i19 != 0 ? true : z;
                                        if (i20 != 0) {
                                            int i27 = i13;
                                            i23 = Integer.MAX_VALUE;
                                            i22 = i27;
                                        } else {
                                            i22 = i13;
                                            i23 = i2;
                                        }
                                        if (i22 != 0) {
                                            i24 = i15;
                                            i25 = 1;
                                        } else {
                                            i24 = i15;
                                            i25 = i3;
                                        }
                                        Map map3 = i24 != 0 ? vt.d : map;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(851408699, i6, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:448)");
                                        }
                                        composer2 = startRestartGroup;
                                        m1076BasicTextCL7eQgs(annotatedString, modifier4, textStyle4, kyVar4, i21, z3, i23, i25, map3, null, null, composer2, i6 & 268435454, 0, 1536);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        modifier3 = modifier4;
                                        textStyle3 = textStyle4;
                                        kyVar3 = kyVar4;
                                        i16 = i21;
                                        z2 = z3;
                                        i17 = i23;
                                        i18 = i25;
                                        map2 = map3;
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup == null) {
                                        endRestartGroup.updateScope(new qd(annotatedString, modifier3, textStyle3, kyVar3, i16, z2, i17, i18, map2, i4, i5, 0));
                                        return;
                                    }
                                    return;
                                }
                                i15 = i14;
                                if (startRestartGroup.shouldExecute((i6 & 38347923) == 38347922, i6 & 1)) {
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            i13 = i12;
                            i14 = i5 & Fields.RotationX;
                            if (i14 != 0) {
                            }
                            i15 = i14;
                            if (startRestartGroup.shouldExecute((i6 & 38347923) == 38347922, i6 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i11 = i5 & 64;
                        if (i11 == 0) {
                        }
                        i12 = i5 & Fields.SpotShadowColor;
                        if (i12 == 0) {
                        }
                        i13 = i12;
                        i14 = i5 & Fields.RotationX;
                        if (i14 != 0) {
                        }
                        i15 = i14;
                        if (startRestartGroup.shouldExecute((i6 & 38347923) == 38347922, i6 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i10 = i5 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i5 & 64;
                    if (i11 == 0) {
                    }
                    i12 = i5 & Fields.SpotShadowColor;
                    if (i12 == 0) {
                    }
                    i13 = i12;
                    i14 = i5 & Fields.RotationX;
                    if (i14 != 0) {
                    }
                    i15 = i14;
                    if (startRestartGroup.shouldExecute((i6 & 38347923) == 38347922, i6 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                kyVar2 = kyVar;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                i10 = i5 & 32;
                if (i10 != 0) {
                }
                i11 = i5 & 64;
                if (i11 == 0) {
                }
                i12 = i5 & Fields.SpotShadowColor;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i5 & Fields.RotationX;
                if (i14 != 0) {
                }
                i15 = i14;
                if (startRestartGroup.shouldExecute((i6 & 38347923) == 38347922, i6 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            textStyle2 = textStyle;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            kyVar2 = kyVar;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            i10 = i5 & 32;
            if (i10 != 0) {
            }
            i11 = i5 & 64;
            if (i11 == 0) {
            }
            i12 = i5 & Fields.SpotShadowColor;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i5 & Fields.RotationX;
            if (i14 != 0) {
            }
            i15 = i14;
            if (startRestartGroup.shouldExecute((i6 & 38347923) == 38347922, i6 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        textStyle2 = textStyle;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        kyVar2 = kyVar;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i5 & 32;
        if (i10 != 0) {
        }
        i11 = i5 & 64;
        if (i11 == 0) {
        }
        i12 = i5 & Fields.SpotShadowColor;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i5 & Fields.RotationX;
        if (i14 != 0) {
        }
        i15 = i14;
        if (startRestartGroup.shouldExecute((i6 & 38347923) == 38347922, i6 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicText_4YKlhWE$lambda$0(AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, ky kyVar, int i, boolean z, int i2, Map map, int i3, int i4, Composer composer, int i5) {
        m1073BasicText4YKlhWE(annotatedString, modifier, textStyle, kyVar, i, z, i2, map, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicText_4YKlhWE$lambda$1(String str, Modifier modifier, TextStyle textStyle, ky kyVar, int i, boolean z, int i2, int i3, int i4, int i5, Composer composer, int i6) {
        m1074BasicText4YKlhWE(str, modifier, textStyle, kyVar, i, z, i2, i3, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicText_BpD7jsM$lambda$0(String str, Modifier modifier, TextStyle textStyle, ky kyVar, int i, boolean z, int i2, int i3, int i4, Composer composer, int i5) {
        m1075BasicTextBpD7jsM(str, modifier, textStyle, kyVar, i, z, i2, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return w01.a;
    }

    private static final AnnotatedString BasicText_CL7eQgs$lambda$3(MutableState<AnnotatedString> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicText_CL7eQgs$lambda$5$0(MutableState mutableState, TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue) {
        mutableState.setValue(textSubstitutionValue.isShowingSubstitution() ? textSubstitutionValue.getSubstitution() : textSubstitutionValue.getOriginal());
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicText_CL7eQgs$lambda$6(AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, ky kyVar, int i, boolean z, int i2, int i3, Map map, ColorProducer colorProducer, TextAutoSize textAutoSize, int i4, int i5, int i6, Composer composer, int i7) {
        m1076BasicTextCL7eQgs(annotatedString, modifier, textStyle, kyVar, i, z, i2, i3, map, colorProducer, textAutoSize, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicText_RWo7tUw$lambda$2(String str, Modifier modifier, TextStyle textStyle, ky kyVar, int i, boolean z, int i2, int i3, ColorProducer colorProducer, TextAutoSize textAutoSize, int i4, int i5, Composer composer, int i6) {
        m1078BasicTextRWo7tUw(str, modifier, textStyle, kyVar, i, z, i2, i3, colorProducer, textAutoSize, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicText_RWo7tUw$lambda$3(AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, ky kyVar, int i, boolean z, int i2, int i3, Map map, ColorProducer colorProducer, int i4, int i5, Composer composer, int i6) {
        m1077BasicTextRWo7tUw(annotatedString, modifier, textStyle, kyVar, i, z, i2, i3, map, colorProducer, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicText_VhcvRP8$lambda$0(String str, Modifier modifier, TextStyle textStyle, ky kyVar, int i, boolean z, int i2, int i3, ColorProducer colorProducer, int i4, int i5, Composer composer, int i6) {
        m1080BasicTextVhcvRP8(str, modifier, textStyle, kyVar, i, z, i2, i3, colorProducer, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 BasicText_VhcvRP8$lambda$1(AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, ky kyVar, int i, boolean z, int i2, int i3, Map map, int i4, int i5, Composer composer, int i6) {
        m1079BasicTextVhcvRP8(annotatedString, modifier, textStyle, kyVar, i, z, i2, i3, map, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013a  */
    /* renamed from: LayoutWithLinksAndInlineContent-11Od_4g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m1081LayoutWithLinksAndInlineContent11Od_4g(final Modifier modifier, final AnnotatedString annotatedString, final ky kyVar, final boolean z, Map<String, InlineTextContent> map, final TextStyle textStyle, final int i, final boolean z2, final int i2, final int i3, final FontFamily.Resolver resolver, final SelectionController selectionController, final ColorProducer colorProducer, final ky kyVar2, final TextAutoSize textAutoSize, Composer composer, final int i4, final int i5, final int i6) {
        int i7;
        int i8;
        int i9;
        final Map<String, InlineTextContent> map2;
        ScopeUpdateScope endRestartGroup;
        TextLinkScope textLinkScope;
        iy iyVar;
        int i10;
        ky kyVar3;
        MutableState mutableState;
        ky kyVar4;
        MeasurePolicy textMeasurePolicy;
        Composer startRestartGroup = composer.startRestartGroup(-2118572703);
        if ((i4 & 6) == 0) {
            i7 = (startRestartGroup.changed(modifier) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            i7 |= startRestartGroup.changed(annotatedString) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i7 |= startRestartGroup.changedInstance(kyVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i11 = i4 & 3072;
        int i12 = Fields.RotationZ;
        if (i11 == 0) {
            i7 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        int i13 = i6 & 16;
        if (i13 != 0) {
            i7 |= 24576;
        } else if ((i4 & 24576) == 0) {
            i7 |= startRestartGroup.changedInstance(map) ? 16384 : 8192;
            if ((i4 & 196608) == 0) {
                i7 |= startRestartGroup.changed(textStyle) ? Fields.RenderEffect : 65536;
            }
            if ((i4 & 1572864) == 0) {
                i7 |= startRestartGroup.changed(i) ? 1048576 : Fields.BlendMode;
            }
            if ((i4 & 12582912) == 0) {
                i7 |= startRestartGroup.changed(z2) ? GroupFlagsKt.IsNodeFlag : 4194304;
            }
            if ((i4 & 100663296) == 0) {
                i7 |= startRestartGroup.changed(i2) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
            }
            if ((i4 & 805306368) == 0) {
                i7 |= startRestartGroup.changed(i3) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
            }
            if ((i5 & 6) != 0) {
                i8 = i5 | (startRestartGroup.changedInstance(resolver) ? 4 : 2);
            } else {
                i8 = i5;
            }
            if ((i5 & 48) == 0) {
                i8 |= startRestartGroup.changedInstance(selectionController) ? 32 : 16;
            }
            if ((i5 & 384) == 0) {
                i8 |= startRestartGroup.changedInstance(colorProducer) ? Fields.RotationX : Fields.SpotShadowColor;
            }
            if ((i5 & 3072) == 0) {
                if (startRestartGroup.changedInstance(kyVar2)) {
                    i12 = 2048;
                }
                i8 |= i12;
            }
            if ((i5 & 24576) == 0) {
                i8 |= (32768 & i5) == 0 ? startRestartGroup.changed(textAutoSize) : startRestartGroup.changedInstance(textAutoSize) ? 16384 : 8192;
            }
            i9 = i8;
            if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i9 & 9363) != 9362, i7 & 1)) {
                startRestartGroup.skipToGroupEnd();
                map2 = map;
            } else {
                Map<String, InlineTextContent> map3 = i13 != 0 ? vt.d : map;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2118572703, i7, i9, "androidx.compose.foundation.text.LayoutWithLinksAndInlineContent (BasicText.kt:646)");
                }
                if (TextAnnotatedStringNodeKt.hasLinks(annotatedString)) {
                    startRestartGroup.startReplaceGroup(145641571);
                    boolean z3 = (i7 & 112) == 32;
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (z3 || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new TextLinkScope(annotatedString);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceGroup();
                    textLinkScope = (TextLinkScope) rememberedValue;
                } else {
                    startRestartGroup.startReplaceGroup(145707228);
                    startRestartGroup.endReplaceGroup();
                    textLinkScope = null;
                }
                if (TextAnnotatedStringNodeKt.hasLinks(annotatedString)) {
                    startRestartGroup.startReplaceGroup(145905443);
                    boolean changed = ((i7 & 112) == 32) | startRestartGroup.changed(textLinkScope);
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                        rememberedValue2 = new v4(7, textLinkScope, annotatedString);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    iyVar = (iy) rememberedValue2;
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(146002721);
                    boolean z4 = (i7 & 112) == 32;
                    Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (z4 || rememberedValue3 == Composer.Companion.getEmpty()) {
                        rememberedValue3 = new i2(annotatedString, 7);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    iyVar = (iy) rememberedValue3;
                    startRestartGroup.endReplaceGroup();
                }
                iy iyVar2 = iyVar;
                xe0 resolveInlineContent = z ? AnnotatedStringResolveInlineContentKt.resolveInlineContent(annotatedString, map3) : new xe0(null, null);
                List list = (List) resolveInlineContent.d;
                List list2 = (List) resolveInlineContent.e;
                if (z) {
                    startRestartGroup.startReplaceGroup(146318828);
                    Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (rememberedValue4 == Composer.Companion.getEmpty()) {
                        i10 = i9;
                        kyVar3 = null;
                        rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    } else {
                        i10 = i9;
                        kyVar3 = null;
                    }
                    startRestartGroup.endReplaceGroup();
                    mutableState = (MutableState) rememberedValue4;
                } else {
                    i10 = i9;
                    kyVar3 = null;
                    startRestartGroup.startReplaceGroup(146406588);
                    startRestartGroup.endReplaceGroup();
                    mutableState = null;
                }
                if (z) {
                    startRestartGroup.startReplaceGroup(146499837);
                    boolean changed2 = startRestartGroup.changed(mutableState);
                    Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if (changed2 || rememberedValue5 == Composer.Companion.getEmpty()) {
                        rememberedValue5 = new i3(mutableState, 5);
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    startRestartGroup.endReplaceGroup();
                    kyVar4 = (ky) rememberedValue5;
                } else {
                    startRestartGroup.startReplaceGroup(146571260);
                    startRestartGroup.endReplaceGroup();
                    kyVar4 = kyVar3;
                }
                int i14 = (i7 >> 3) & 14;
                int i15 = 6;
                MutableState mutableState2 = mutableState;
                int i16 = i7;
                BasicText_androidKt.BackgroundTextMeasurement(annotatedString, textStyle, resolver, list, startRestartGroup, ((i7 >> 12) & 112) | i14 | ((i10 << 6) & 896));
                AnnotatedString annotatedString2 = (AnnotatedString) iyVar2.invoke();
                boolean changedInstance = startRestartGroup.changedInstance(textLinkScope) | ((i16 & 896) == 256);
                Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue6 == Composer.Companion.getEmpty()) {
                    rememberedValue6 = new kd(textLinkScope, kyVar, 0);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                Map<String, InlineTextContent> map4 = map3;
                Modifier m1082textModifierCL7eQgs = m1082textModifierCL7eQgs(modifier, annotatedString2, textStyle, (ky) rememberedValue6, i, z2, i2, i3, resolver, list, kyVar4, selectionController, colorProducer, kyVar2, textAutoSize);
                if (z) {
                    startRestartGroup.startReplaceGroup(147927697);
                    boolean changedInstance2 = startRestartGroup.changedInstance(textLinkScope);
                    Object rememberedValue7 = startRestartGroup.rememberedValue();
                    if (changedInstance2 || rememberedValue7 == Composer.Companion.getEmpty()) {
                        rememberedValue7 = new ld(textLinkScope, 1);
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                    }
                    iy iyVar3 = (iy) rememberedValue7;
                    boolean changed3 = startRestartGroup.changed(mutableState2);
                    Object rememberedValue8 = startRestartGroup.rememberedValue();
                    if (changed3 || rememberedValue8 == Composer.Companion.getEmpty()) {
                        rememberedValue8 = new j3(mutableState2, i15);
                        startRestartGroup.updateRememberedValue(rememberedValue8);
                    }
                    textMeasurePolicy = new TextMeasurePolicy(iyVar3, (iy) rememberedValue8);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(147750935);
                    boolean changedInstance3 = startRestartGroup.changedInstance(textLinkScope);
                    Object rememberedValue9 = startRestartGroup.rememberedValue();
                    if (changedInstance3 || rememberedValue9 == Composer.Companion.getEmpty()) {
                        rememberedValue9 = new ld(textLinkScope, 0);
                        startRestartGroup.updateRememberedValue(rememberedValue9);
                    }
                    textMeasurePolicy = new LinksTextMeasurePolicy((iy) rememberedValue9);
                    startRestartGroup.endReplaceGroup();
                }
                int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1082textModifierCL7eQgs);
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
                uo.h(companion, m3878constructorimpl, textMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                if (textLinkScope == null) {
                    startRestartGroup.startReplaceGroup(-433557001);
                } else {
                    startRestartGroup.startReplaceGroup(-291080374);
                    textLinkScope.LinksComposables(startRestartGroup, 0);
                }
                startRestartGroup.endReplaceGroup();
                if (list2 == null) {
                    startRestartGroup.startReplaceGroup(-433506223);
                } else {
                    startRestartGroup.startReplaceGroup(-433506222);
                    AnnotatedStringResolveInlineContentKt.InlineChildren(annotatedString, list2, startRestartGroup, i14);
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                map2 = map4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new my() { // from class: md
                    @Override // defpackage.my
                    public final Object invoke(Object obj, Object obj2) {
                        w01 LayoutWithLinksAndInlineContent_11Od_4g$lambda$10;
                        int intValue = ((Integer) obj2).intValue();
                        LayoutWithLinksAndInlineContent_11Od_4g$lambda$10 = BasicTextKt.LayoutWithLinksAndInlineContent_11Od_4g$lambda$10(Modifier.this, annotatedString, kyVar, z, map2, textStyle, i, z2, i2, i3, resolver, selectionController, colorProducer, kyVar2, textAutoSize, i4, i5, i6, (Composer) obj, intValue);
                        return LayoutWithLinksAndInlineContent_11Od_4g$lambda$10;
                    }
                });
                return;
            }
            return;
        }
        if ((i4 & 196608) == 0) {
        }
        if ((i4 & 1572864) == 0) {
        }
        if ((i4 & 12582912) == 0) {
        }
        if ((i4 & 100663296) == 0) {
        }
        if ((i4 & 805306368) == 0) {
        }
        if ((i5 & 6) != 0) {
        }
        if ((i5 & 48) == 0) {
        }
        if ((i5 & 384) == 0) {
        }
        if ((i5 & 3072) == 0) {
        }
        if ((i5 & 24576) == 0) {
        }
        i9 = i8;
        if (startRestartGroup.shouldExecute((i7 & 306783379) == 306783378 || (i9 & 9363) != 9362, i7 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotatedString LayoutWithLinksAndInlineContent_11Od_4g$lambda$1$0(TextLinkScope textLinkScope, AnnotatedString annotatedString) {
        AnnotatedString applyAnnotators$foundation;
        return (textLinkScope == null || (applyAnnotators$foundation = textLinkScope.applyAnnotators$foundation()) == null) ? annotatedString : applyAnnotators$foundation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LayoutWithLinksAndInlineContent_11Od_4g$lambda$10(Modifier modifier, AnnotatedString annotatedString, ky kyVar, boolean z, Map map, TextStyle textStyle, int i, boolean z2, int i2, int i3, FontFamily.Resolver resolver, SelectionController selectionController, ColorProducer colorProducer, ky kyVar2, TextAutoSize textAutoSize, int i4, int i5, int i6, Composer composer, int i7) {
        m1081LayoutWithLinksAndInlineContent11Od_4g(modifier, annotatedString, kyVar, z, map, textStyle, i, z2, i2, i3, resolver, selectionController, colorProducer, kyVar2, textAutoSize, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LayoutWithLinksAndInlineContent_11Od_4g$lambda$4$0(MutableState mutableState, List list) {
        if (mutableState != null) {
            mutableState.setValue(list);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 LayoutWithLinksAndInlineContent_11Od_4g$lambda$6$0(TextLinkScope textLinkScope, ky kyVar, TextLayoutResult textLayoutResult) {
        if (textLinkScope != null) {
            textLinkScope.setTextLayoutResult(textLayoutResult);
        }
        if (kyVar != null) {
            kyVar.invoke(textLayoutResult);
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LayoutWithLinksAndInlineContent_11Od_4g$lambda$7$0(TextLinkScope textLinkScope) {
        if (textLinkScope != null) {
            return ((Boolean) textLinkScope.getShouldMeasureLinks().invoke()).booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LayoutWithLinksAndInlineContent_11Od_4g$lambda$8$0(TextLinkScope textLinkScope) {
        if (textLinkScope != null) {
            return ((Boolean) textLinkScope.getShouldMeasureLinks().invoke()).booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List LayoutWithLinksAndInlineContent_11Od_4g$lambda$9$0(MutableState mutableState) {
        if (mutableState != null) {
            return (List) mutableState.getValue();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<xe0> measureWithTextRangeMeasureConstraints(List<? extends Measurable> list, iy iyVar) {
        if (!((Boolean) iyVar.invoke()).booleanValue()) {
            return null;
        }
        TextRangeLayoutMeasureScope textRangeLayoutMeasureScope = new TextRangeLayoutMeasureScope();
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Measurable measurable = list.get(i);
            Object parentData = measurable.getParentData();
            parentData.getClass();
            TextRangeLayoutMeasureResult measure = ((TextRangeLayoutModifier) parentData).getMeasurePolicy().measure(textRangeLayoutMeasureScope);
            arrayList.add(new xe0(measurable.mo6234measureBRTryo0(Constraints.Companion.m7573fitPrioritizingWidthZbe2FdA(measure.getWidth(), measure.getWidth(), measure.getHeight(), measure.getHeight())), measure.getPlace()));
        }
        return arrayList;
    }

    private static final Saver<Long, Long> selectionIdSaver(SelectionRegistrar selectionRegistrar) {
        return SaverKt.Saver(new w5(selectionRegistrar, 1), new ed(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long selectionIdSaver$lambda$0(SelectionRegistrar selectionRegistrar, SaverScope saverScope, long j) {
        if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j)) {
            return Long.valueOf(j);
        }
        return null;
    }

    /* renamed from: textModifier-CL7eQgs, reason: not valid java name */
    private static final Modifier m1082textModifierCL7eQgs(Modifier modifier, AnnotatedString annotatedString, TextStyle textStyle, ky kyVar, int i, boolean z, int i2, int i3, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, ky kyVar2, SelectionController selectionController, ColorProducer colorProducer, ky kyVar3, TextAutoSize textAutoSize) {
        if (selectionController == null) {
            return modifier.then(Modifier.Companion).then(new TextAnnotatedStringElement(annotatedString, textStyle, resolver, kyVar, i, z, i2, i3, list, kyVar2, null, colorProducer, textAutoSize, kyVar3, null));
        }
        return modifier.then(selectionController.getModifier()).then(new SelectableTextAnnotatedStringElement(annotatedString, textStyle, resolver, kyVar, i, z, i2, i3, list, kyVar2, selectionController, colorProducer, textAutoSize, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotatedString LayoutWithLinksAndInlineContent_11Od_4g$lambda$2$0(AnnotatedString annotatedString) {
        return annotatedString;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0079  */
    @er
    /* renamed from: BasicText-4YKlhWE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m1074BasicText4YKlhWE(final String str, Modifier modifier, TextStyle textStyle, ky kyVar, int i, boolean z, int i2, int i3, Composer composer, final int i4, final int i5) {
        int i6;
        Modifier modifier2;
        int i7;
        TextStyle textStyle2;
        int i8;
        ky kyVar2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Composer composer2;
        final int i14;
        final int i15;
        final Modifier modifier3;
        final TextStyle textStyle3;
        final ky kyVar3;
        final boolean z2;
        final int i16;
        ScopeUpdateScope endRestartGroup;
        int i17;
        Modifier modifier4;
        int i18;
        ky kyVar4;
        Composer startRestartGroup = composer.startRestartGroup(1542716361);
        if ((i4 & 6) == 0) {
            i6 = (startRestartGroup.changed(str) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i19 = i5 & 2;
        if (i19 != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            modifier2 = modifier;
            i6 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i4 & 384) == 0) {
                textStyle2 = textStyle;
                i6 |= startRestartGroup.changed(textStyle2) ? Fields.RotationX : Fields.SpotShadowColor;
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else if ((i4 & 3072) == 0) {
                    kyVar2 = kyVar;
                    i6 |= startRestartGroup.changedInstance(kyVar2) ? Fields.CameraDistance : Fields.RotationZ;
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else if ((i4 & 24576) == 0) {
                        i6 |= startRestartGroup.changed(i) ? Fields.Clip : 8192;
                        i10 = i5 & 32;
                        if (i10 != 0) {
                            i6 |= 196608;
                        } else if ((196608 & i4) == 0) {
                            i6 |= startRestartGroup.changed(z) ? Fields.RenderEffect : 65536;
                            i11 = i5 & 64;
                            if (i11 == 0) {
                                i6 |= 1572864;
                            } else if ((i4 & 1572864) == 0) {
                                i6 |= startRestartGroup.changed(i2) ? 1048576 : Fields.BlendMode;
                            }
                            i12 = i5 & Fields.SpotShadowColor;
                            if (i12 == 0) {
                                i6 |= 12582912;
                            } else if ((i4 & 12582912) == 0) {
                                i13 = i12;
                                i6 |= startRestartGroup.changed(i3) ? GroupFlagsKt.IsNodeFlag : 4194304;
                                if (startRestartGroup.shouldExecute((i6 & 4793491) != 4793490, i6 & 1)) {
                                    if (i19 != 0) {
                                        modifier4 = Modifier.Companion;
                                        i17 = i9;
                                    } else {
                                        i17 = i9;
                                        modifier4 = modifier2;
                                    }
                                    TextStyle textStyle4 = i7 != 0 ? TextStyle.Companion.getDefault() : textStyle2;
                                    if (i8 != 0) {
                                        kyVar4 = null;
                                        i18 = i10;
                                    } else {
                                        i18 = i10;
                                        kyVar4 = kyVar2;
                                    }
                                    int m7546getClipgIe3tQ8 = i17 != 0 ? TextOverflow.Companion.m7546getClipgIe3tQ8() : i;
                                    boolean z3 = i18 != 0 ? true : z;
                                    int i20 = i11 != 0 ? Integer.MAX_VALUE : i2;
                                    int i21 = i13 != 0 ? 1 : i3;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1542716361, i6, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:433)");
                                    }
                                    composer2 = startRestartGroup;
                                    m1078BasicTextRWo7tUw(str, modifier4, textStyle4, kyVar4, m7546getClipgIe3tQ8, z3, i20, i21, (ColorProducer) null, (TextAutoSize) null, composer2, i6 & 33554430, 768);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier4;
                                    textStyle3 = textStyle4;
                                    kyVar3 = kyVar4;
                                    i14 = m7546getClipgIe3tQ8;
                                    z2 = z3;
                                    i15 = i20;
                                    i16 = i21;
                                } else {
                                    composer2 = startRestartGroup;
                                    composer2.skipToGroupEnd();
                                    i14 = i;
                                    i15 = i2;
                                    modifier3 = modifier2;
                                    textStyle3 = textStyle2;
                                    kyVar3 = kyVar2;
                                    z2 = z;
                                    i16 = i3;
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.updateScope(new my() { // from class: id
                                        @Override // defpackage.my
                                        public final Object invoke(Object obj, Object obj2) {
                                            w01 BasicText_4YKlhWE$lambda$1;
                                            int intValue = ((Integer) obj2).intValue();
                                            BasicText_4YKlhWE$lambda$1 = BasicTextKt.BasicText_4YKlhWE$lambda$1(str, modifier3, textStyle3, kyVar3, i14, z2, i15, i16, i4, i5, (Composer) obj, intValue);
                                            return BasicText_4YKlhWE$lambda$1;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i13 = i12;
                            if (startRestartGroup.shouldExecute((i6 & 4793491) != 4793490, i6 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i11 = i5 & 64;
                        if (i11 == 0) {
                        }
                        i12 = i5 & Fields.SpotShadowColor;
                        if (i12 == 0) {
                        }
                        i13 = i12;
                        if (startRestartGroup.shouldExecute((i6 & 4793491) != 4793490, i6 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i10 = i5 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i5 & 64;
                    if (i11 == 0) {
                    }
                    i12 = i5 & Fields.SpotShadowColor;
                    if (i12 == 0) {
                    }
                    i13 = i12;
                    if (startRestartGroup.shouldExecute((i6 & 4793491) != 4793490, i6 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                kyVar2 = kyVar;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                i10 = i5 & 32;
                if (i10 != 0) {
                }
                i11 = i5 & 64;
                if (i11 == 0) {
                }
                i12 = i5 & Fields.SpotShadowColor;
                if (i12 == 0) {
                }
                i13 = i12;
                if (startRestartGroup.shouldExecute((i6 & 4793491) != 4793490, i6 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            textStyle2 = textStyle;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            kyVar2 = kyVar;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            i10 = i5 & 32;
            if (i10 != 0) {
            }
            i11 = i5 & 64;
            if (i11 == 0) {
            }
            i12 = i5 & Fields.SpotShadowColor;
            if (i12 == 0) {
            }
            i13 = i12;
            if (startRestartGroup.shouldExecute((i6 & 4793491) != 4793490, i6 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        textStyle2 = textStyle;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        kyVar2 = kyVar;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i5 & 32;
        if (i10 != 0) {
        }
        i11 = i5 & 64;
        if (i11 == 0) {
        }
        i12 = i5 & Fields.SpotShadowColor;
        if (i12 == 0) {
        }
        i13 = i12;
        if (startRestartGroup.shouldExecute((i6 & 4793491) != 4793490, i6 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00b2  */
    @er
    /* renamed from: BasicText-VhcvRP8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m1080BasicTextVhcvRP8(String str, Modifier modifier, TextStyle textStyle, ky kyVar, int i, boolean z, int i2, int i3, ColorProducer colorProducer, Composer composer, int i4, int i5) {
        int i6;
        Modifier modifier2;
        int i7;
        TextStyle textStyle2;
        int i8;
        ky kyVar2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer composer2;
        int i16;
        int i17;
        ColorProducer colorProducer2;
        Modifier modifier3;
        TextStyle textStyle3;
        ky kyVar3;
        boolean z2;
        int i18;
        ScopeUpdateScope endRestartGroup;
        int i19;
        TextStyle textStyle4;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        Composer startRestartGroup = composer.startRestartGroup(-1186827822);
        if ((i4 & 6) == 0) {
            i6 = (startRestartGroup.changed(str) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i26 = i5 & 2;
        if (i26 != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            modifier2 = modifier;
            i6 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i4 & 384) == 0) {
                textStyle2 = textStyle;
                i6 |= startRestartGroup.changed(textStyle2) ? Fields.RotationX : Fields.SpotShadowColor;
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else if ((i4 & 3072) == 0) {
                    kyVar2 = kyVar;
                    i6 |= startRestartGroup.changedInstance(kyVar2) ? Fields.CameraDistance : Fields.RotationZ;
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else if ((i4 & 24576) == 0) {
                        i6 |= startRestartGroup.changed(i) ? Fields.Clip : 8192;
                        i10 = i5 & 32;
                        if (i10 != 0) {
                            i6 |= 196608;
                        } else if ((196608 & i4) == 0) {
                            i6 |= startRestartGroup.changed(z) ? Fields.RenderEffect : 65536;
                            i11 = i5 & 64;
                            if (i11 == 0) {
                                i6 |= 1572864;
                            } else if ((i4 & 1572864) == 0) {
                                i6 |= startRestartGroup.changed(i2) ? 1048576 : Fields.BlendMode;
                            }
                            i12 = i5 & Fields.SpotShadowColor;
                            if (i12 == 0) {
                                i6 |= 12582912;
                            } else if ((i4 & 12582912) == 0) {
                                i13 = i12;
                                i6 |= startRestartGroup.changed(i3) ? GroupFlagsKt.IsNodeFlag : 4194304;
                                i14 = i5 & Fields.RotationX;
                                if (i14 != 0) {
                                    i6 |= 100663296;
                                } else if ((i4 & 100663296) == 0) {
                                    i15 = i14;
                                    i6 |= startRestartGroup.changedInstance(colorProducer) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                                    if (!startRestartGroup.shouldExecute((i6 & 38347923) == 38347922, i6 & 1)) {
                                        Modifier modifier4 = i26 != 0 ? Modifier.Companion : modifier2;
                                        if (i7 != 0) {
                                            textStyle4 = TextStyle.Companion.getDefault();
                                            i19 = i10;
                                        } else {
                                            i19 = i10;
                                            textStyle4 = textStyle2;
                                        }
                                        ky kyVar4 = i8 != 0 ? null : kyVar2;
                                        if (i9 != 0) {
                                            i21 = TextOverflow.Companion.m7546getClipgIe3tQ8();
                                            i20 = i11;
                                        } else {
                                            i20 = i11;
                                            i21 = i;
                                        }
                                        boolean z3 = i19 != 0 ? true : z;
                                        if (i20 != 0) {
                                            int i27 = i13;
                                            i23 = Integer.MAX_VALUE;
                                            i22 = i27;
                                        } else {
                                            i22 = i13;
                                            i23 = i2;
                                        }
                                        if (i22 != 0) {
                                            i24 = i15;
                                            i25 = 1;
                                        } else {
                                            i24 = i15;
                                            i25 = i3;
                                        }
                                        ColorProducer colorProducer3 = i24 != 0 ? null : colorProducer;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1186827822, i6, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:317)");
                                        }
                                        composer2 = startRestartGroup;
                                        m1078BasicTextRWo7tUw(str, modifier4, textStyle4, kyVar4, i21, z3, i23, i25, colorProducer3, (TextAutoSize) null, composer2, i6 & 268435454, Fields.RotationY);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        modifier3 = modifier4;
                                        textStyle3 = textStyle4;
                                        kyVar3 = kyVar4;
                                        i16 = i21;
                                        z2 = z3;
                                        i17 = i23;
                                        i18 = i25;
                                        colorProducer2 = colorProducer3;
                                    } else {
                                        composer2 = startRestartGroup;
                                        composer2.skipToGroupEnd();
                                        i16 = i;
                                        i17 = i2;
                                        colorProducer2 = colorProducer;
                                        modifier3 = modifier2;
                                        textStyle3 = textStyle2;
                                        kyVar3 = kyVar2;
                                        z2 = z;
                                        i18 = i3;
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup == null) {
                                        endRestartGroup.updateScope(new qd(str, modifier3, textStyle3, kyVar3, i16, z2, i17, i18, colorProducer2, i4, i5, 1));
                                        return;
                                    }
                                    return;
                                }
                                i15 = i14;
                                if (!startRestartGroup.shouldExecute((i6 & 38347923) == 38347922, i6 & 1)) {
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            i13 = i12;
                            i14 = i5 & Fields.RotationX;
                            if (i14 != 0) {
                            }
                            i15 = i14;
                            if (!startRestartGroup.shouldExecute((i6 & 38347923) == 38347922, i6 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        i11 = i5 & 64;
                        if (i11 == 0) {
                        }
                        i12 = i5 & Fields.SpotShadowColor;
                        if (i12 == 0) {
                        }
                        i13 = i12;
                        i14 = i5 & Fields.RotationX;
                        if (i14 != 0) {
                        }
                        i15 = i14;
                        if (!startRestartGroup.shouldExecute((i6 & 38347923) == 38347922, i6 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i10 = i5 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i5 & 64;
                    if (i11 == 0) {
                    }
                    i12 = i5 & Fields.SpotShadowColor;
                    if (i12 == 0) {
                    }
                    i13 = i12;
                    i14 = i5 & Fields.RotationX;
                    if (i14 != 0) {
                    }
                    i15 = i14;
                    if (!startRestartGroup.shouldExecute((i6 & 38347923) == 38347922, i6 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                kyVar2 = kyVar;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                i10 = i5 & 32;
                if (i10 != 0) {
                }
                i11 = i5 & 64;
                if (i11 == 0) {
                }
                i12 = i5 & Fields.SpotShadowColor;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i5 & Fields.RotationX;
                if (i14 != 0) {
                }
                i15 = i14;
                if (!startRestartGroup.shouldExecute((i6 & 38347923) == 38347922, i6 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            textStyle2 = textStyle;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            kyVar2 = kyVar;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            i10 = i5 & 32;
            if (i10 != 0) {
            }
            i11 = i5 & 64;
            if (i11 == 0) {
            }
            i12 = i5 & Fields.SpotShadowColor;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i5 & Fields.RotationX;
            if (i14 != 0) {
            }
            i15 = i14;
            if (!startRestartGroup.shouldExecute((i6 & 38347923) == 38347922, i6 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        textStyle2 = textStyle;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        kyVar2 = kyVar;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i5 & 32;
        if (i10 != 0) {
        }
        i11 = i5 & 64;
        if (i11 == 0) {
        }
        i12 = i5 & Fields.SpotShadowColor;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i5 & Fields.RotationX;
        if (i14 != 0) {
        }
        i15 = i14;
        if (!startRestartGroup.shouldExecute((i6 & 38347923) == 38347922, i6 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f4  */
    @er
    /* renamed from: BasicText-RWo7tUw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void m1077BasicTextRWo7tUw(AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, ky kyVar, int i, boolean z, int i2, int i3, Map map, ColorProducer colorProducer, Composer composer, int i4, int i5) {
        int i6;
        Modifier modifier2;
        int i7;
        TextStyle textStyle2;
        int i8;
        ky kyVar2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Composer composer2;
        int i19;
        Map map2;
        Modifier modifier3;
        TextStyle textStyle3;
        ky kyVar3;
        int i20;
        boolean z2;
        int i21;
        ColorProducer colorProducer2;
        ScopeUpdateScope endRestartGroup;
        int i22;
        Modifier modifier4;
        int i23;
        boolean z3;
        int i24;
        int i25;
        int i26;
        int i27;
        Composer startRestartGroup = composer.startRestartGroup(-1064305212);
        if ((i4 & 6) == 0) {
            i6 = (startRestartGroup.changed(annotatedString) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i28 = i5 & 2;
        if (i28 != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            modifier2 = modifier;
            i6 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i4 & 384) == 0) {
                textStyle2 = textStyle;
                i6 |= startRestartGroup.changed(textStyle2) ? Fields.RotationX : Fields.SpotShadowColor;
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else if ((i4 & 3072) == 0) {
                    kyVar2 = kyVar;
                    i6 |= startRestartGroup.changedInstance(kyVar2) ? Fields.CameraDistance : Fields.RotationZ;
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else if ((i4 & 24576) == 0) {
                        i10 = i;
                        i6 |= startRestartGroup.changed(i10) ? Fields.Clip : 8192;
                        i11 = i5 & 32;
                        if (i11 != 0) {
                            i6 |= 196608;
                        } else if ((196608 & i4) == 0) {
                            i6 |= startRestartGroup.changed(z) ? Fields.RenderEffect : 65536;
                            i12 = i5 & 64;
                            if (i12 == 0) {
                                i6 |= 1572864;
                            } else if ((i4 & 1572864) == 0) {
                                i6 |= startRestartGroup.changed(i2) ? 1048576 : Fields.BlendMode;
                            }
                            i13 = i5 & Fields.SpotShadowColor;
                            if (i13 == 0) {
                                i6 |= 12582912;
                            } else if ((i4 & 12582912) == 0) {
                                i14 = i13;
                                i6 |= startRestartGroup.changed(i3) ? GroupFlagsKt.IsNodeFlag : 4194304;
                                i15 = i5 & Fields.RotationX;
                                if (i15 != 0) {
                                    i6 |= 100663296;
                                } else if ((i4 & 100663296) == 0) {
                                    i16 = i15;
                                    i6 |= startRestartGroup.changedInstance(map) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                                    i17 = i5 & Fields.RotationY;
                                    if (i17 == 0) {
                                        i6 |= 805306368;
                                    } else if ((i4 & 805306368) == 0) {
                                        i18 = i17;
                                        i6 |= startRestartGroup.changedInstance(colorProducer) ? GroupFlagsKt.HasMovableContentFlag : GroupFlagsKt.IsMovableContentFlag;
                                        if (startRestartGroup.shouldExecute((i6 & 306783379) != 306783378, i6 & 1)) {
                                            if (i28 != 0) {
                                                modifier4 = Modifier.Companion;
                                                i22 = i11;
                                            } else {
                                                i22 = i11;
                                                modifier4 = modifier2;
                                            }
                                            TextStyle textStyle4 = i7 != 0 ? TextStyle.Companion.getDefault() : textStyle2;
                                            ky kyVar4 = i8 != 0 ? null : kyVar2;
                                            int m7546getClipgIe3tQ8 = i9 != 0 ? TextOverflow.Companion.m7546getClipgIe3tQ8() : i10;
                                            if (i22 != 0) {
                                                i23 = i14;
                                                z3 = true;
                                            } else {
                                                i23 = i14;
                                                z3 = z;
                                            }
                                            if (i12 != 0) {
                                                int i29 = i16;
                                                i25 = Integer.MAX_VALUE;
                                                i24 = i29;
                                            } else {
                                                i24 = i16;
                                                i25 = i2;
                                            }
                                            if (i23 != 0) {
                                                i26 = i18;
                                                i27 = 1;
                                            } else {
                                                i26 = i18;
                                                i27 = i3;
                                            }
                                            Map map3 = i24 != 0 ? vt.d : map;
                                            ColorProducer colorProducer3 = i26 != 0 ? null : colorProducer;
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1064305212, i6, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:359)");
                                            }
                                            composer2 = startRestartGroup;
                                            m1076BasicTextCL7eQgs(annotatedString, modifier4, textStyle4, kyVar4, m7546getClipgIe3tQ8, z3, i25, i27, map3, colorProducer3, null, composer2, i6 & 2147483646, 0, Fields.RotationZ);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                            modifier3 = modifier4;
                                            textStyle3 = textStyle4;
                                            kyVar3 = kyVar4;
                                            i20 = m7546getClipgIe3tQ8;
                                            z2 = z3;
                                            i19 = i25;
                                            i21 = i27;
                                            map2 = map3;
                                            colorProducer2 = colorProducer3;
                                        } else {
                                            composer2 = startRestartGroup;
                                            composer2.skipToGroupEnd();
                                            i19 = i2;
                                            map2 = map;
                                            modifier3 = modifier2;
                                            textStyle3 = textStyle2;
                                            kyVar3 = kyVar2;
                                            i20 = i10;
                                            z2 = z;
                                            i21 = i3;
                                            colorProducer2 = colorProducer;
                                        }
                                        endRestartGroup = composer2.endRestartGroup();
                                        if (endRestartGroup != null) {
                                            endRestartGroup.updateScope(new od(annotatedString, modifier3, textStyle3, kyVar3, i20, z2, i19, i21, map2, colorProducer2, i4, i5));
                                            return;
                                        }
                                        return;
                                    }
                                    i18 = i17;
                                    if (startRestartGroup.shouldExecute((i6 & 306783379) != 306783378, i6 & 1)) {
                                    }
                                    endRestartGroup = composer2.endRestartGroup();
                                    if (endRestartGroup != null) {
                                    }
                                }
                                i16 = i15;
                                i17 = i5 & Fields.RotationY;
                                if (i17 == 0) {
                                }
                                i18 = i17;
                                if (startRestartGroup.shouldExecute((i6 & 306783379) != 306783378, i6 & 1)) {
                                }
                                endRestartGroup = composer2.endRestartGroup();
                                if (endRestartGroup != null) {
                                }
                            }
                            i14 = i13;
                            i15 = i5 & Fields.RotationX;
                            if (i15 != 0) {
                            }
                            i16 = i15;
                            i17 = i5 & Fields.RotationY;
                            if (i17 == 0) {
                            }
                            i18 = i17;
                            if (startRestartGroup.shouldExecute((i6 & 306783379) != 306783378, i6 & 1)) {
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i12 = i5 & 64;
                        if (i12 == 0) {
                        }
                        i13 = i5 & Fields.SpotShadowColor;
                        if (i13 == 0) {
                        }
                        i14 = i13;
                        i15 = i5 & Fields.RotationX;
                        if (i15 != 0) {
                        }
                        i16 = i15;
                        i17 = i5 & Fields.RotationY;
                        if (i17 == 0) {
                        }
                        i18 = i17;
                        if (startRestartGroup.shouldExecute((i6 & 306783379) != 306783378, i6 & 1)) {
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i10 = i;
                    i11 = i5 & 32;
                    if (i11 != 0) {
                    }
                    i12 = i5 & 64;
                    if (i12 == 0) {
                    }
                    i13 = i5 & Fields.SpotShadowColor;
                    if (i13 == 0) {
                    }
                    i14 = i13;
                    i15 = i5 & Fields.RotationX;
                    if (i15 != 0) {
                    }
                    i16 = i15;
                    i17 = i5 & Fields.RotationY;
                    if (i17 == 0) {
                    }
                    i18 = i17;
                    if (startRestartGroup.shouldExecute((i6 & 306783379) != 306783378, i6 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                kyVar2 = kyVar;
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                i10 = i;
                i11 = i5 & 32;
                if (i11 != 0) {
                }
                i12 = i5 & 64;
                if (i12 == 0) {
                }
                i13 = i5 & Fields.SpotShadowColor;
                if (i13 == 0) {
                }
                i14 = i13;
                i15 = i5 & Fields.RotationX;
                if (i15 != 0) {
                }
                i16 = i15;
                i17 = i5 & Fields.RotationY;
                if (i17 == 0) {
                }
                i18 = i17;
                if (startRestartGroup.shouldExecute((i6 & 306783379) != 306783378, i6 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            textStyle2 = textStyle;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            kyVar2 = kyVar;
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            i10 = i;
            i11 = i5 & 32;
            if (i11 != 0) {
            }
            i12 = i5 & 64;
            if (i12 == 0) {
            }
            i13 = i5 & Fields.SpotShadowColor;
            if (i13 == 0) {
            }
            i14 = i13;
            i15 = i5 & Fields.RotationX;
            if (i15 != 0) {
            }
            i16 = i15;
            i17 = i5 & Fields.RotationY;
            if (i17 == 0) {
            }
            i18 = i17;
            if (startRestartGroup.shouldExecute((i6 & 306783379) != 306783378, i6 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        textStyle2 = textStyle;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        kyVar2 = kyVar;
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        i10 = i;
        i11 = i5 & 32;
        if (i11 != 0) {
        }
        i12 = i5 & 64;
        if (i12 == 0) {
        }
        i13 = i5 & Fields.SpotShadowColor;
        if (i13 == 0) {
        }
        i14 = i13;
        i15 = i5 & Fields.RotationX;
        if (i15 != 0) {
        }
        i16 = i15;
        i17 = i5 & Fields.RotationY;
        if (i17 == 0) {
        }
        i18 = i17;
        if (startRestartGroup.shouldExecute((i6 & 306783379) != 306783378, i6 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
