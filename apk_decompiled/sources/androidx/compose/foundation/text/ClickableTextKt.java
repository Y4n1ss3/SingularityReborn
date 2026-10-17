package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import defpackage.ed;
import defpackage.er;
import defpackage.ky;
import defpackage.pd;
import defpackage.t8;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ClickableTextKt {
    /* JADX WARN: Removed duplicated region for block: B:104:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00b4  */
    @er
    /* renamed from: ClickableText-4YKlhWE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1083ClickableText4YKlhWE(AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, boolean z, int i, int i2, ky kyVar, ky kyVar2, Composer composer, int i3, int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        TextStyle textStyle2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer composer2;
        boolean z2;
        int i12;
        TextStyle textStyle3;
        ky kyVar3;
        ScopeUpdateScope endRestartGroup;
        int i13;
        int i14;
        ky kyVar4;
        Composer startRestartGroup = composer.startRestartGroup(-246609449);
        if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changed(annotatedString) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i15 = i4 & 2;
        if (i15 != 0) {
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
                    i5 |= startRestartGroup.changed(z) ? Fields.CameraDistance : Fields.RotationZ;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i3 & 24576) == 0) {
                        i9 = i;
                        i5 |= startRestartGroup.changed(i9) ? Fields.Clip : 8192;
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= 196608;
                        } else if ((i3 & 196608) == 0) {
                            i5 |= startRestartGroup.changed(i2) ? Fields.RenderEffect : 65536;
                        }
                        i11 = i4 & 64;
                        if (i11 != 0) {
                            i5 |= 1572864;
                        } else if ((i3 & 1572864) == 0) {
                            i5 |= startRestartGroup.changedInstance(kyVar) ? 1048576 : Fields.BlendMode;
                        }
                        if ((i3 & 12582912) == 0) {
                            i5 |= startRestartGroup.changedInstance(kyVar2) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        }
                        int i16 = 1;
                        if (startRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
                            if (i15 != 0) {
                                modifier2 = Modifier.Companion;
                            }
                            TextStyle textStyle4 = i6 != 0 ? TextStyle.Companion.getDefault() : textStyle2;
                            boolean z3 = i7 != 0 ? true : z;
                            if (i8 != 0) {
                                i9 = TextOverflow.Companion.m7546getClipgIe3tQ8();
                            }
                            if (i10 != 0) {
                                i14 = Integer.MAX_VALUE;
                                i13 = i11;
                            } else {
                                i13 = i11;
                                i14 = i2;
                            }
                            if (i13 != 0) {
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = new ed(20);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                kyVar4 = (ky) rememberedValue;
                            } else {
                                kyVar4 = kyVar;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-246609449, i5, -1, "androidx.compose.foundation.text.ClickableText (ClickableText.kt:79)");
                            }
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            Composer.Companion companion = Composer.Companion;
                            if (rememberedValue2 == companion.getEmpty()) {
                                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            MutableState mutableState = (MutableState) rememberedValue2;
                            Modifier.Companion companion2 = Modifier.Companion;
                            boolean z4 = (29360128 & i5) == 8388608;
                            Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (z4 || rememberedValue3 == companion.getEmpty()) {
                                rememberedValue3 = new ClickableTextKt$ClickableText$pressIndicator$1$1(mutableState, kyVar2);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            Modifier then = modifier2.then(SuspendingPointerInputFilterKt.pointerInput(companion2, kyVar2, (PointerInputEventHandler) rememberedValue3));
                            boolean z5 = (i5 & 3670016) == 1048576;
                            Object rememberedValue4 = startRestartGroup.rememberedValue();
                            if (z5 || rememberedValue4 == companion.getEmpty()) {
                                rememberedValue4 = new t8(mutableState, kyVar4, i16);
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            composer2 = startRestartGroup;
                            BasicTextKt.m1076BasicTextCL7eQgs(annotatedString, then, textStyle4, (ky) rememberedValue4, i9, z3, i14, 0, null, null, null, composer2, (58254 & i5) | (458752 & (i5 << 6)) | ((i5 << 3) & 3670016), 0, 1920);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            kyVar3 = kyVar4;
                            textStyle3 = textStyle4;
                            z2 = z3;
                            i12 = i14;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            z2 = z;
                            i12 = i2;
                            textStyle3 = textStyle2;
                            kyVar3 = kyVar;
                        }
                        Modifier modifier3 = modifier2;
                        int i17 = i9;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new pd(annotatedString, modifier3, textStyle3, z2, i17, i12, kyVar3, kyVar2, i3, i4));
                            return;
                        }
                        return;
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i4 & 64;
                    if (i11 != 0) {
                    }
                    if ((i3 & 12582912) == 0) {
                    }
                    int i162 = 1;
                    if (startRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
                    }
                    Modifier modifier32 = modifier2;
                    int i172 = i9;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                i11 = i4 & 64;
                if (i11 != 0) {
                }
                if ((i3 & 12582912) == 0) {
                }
                int i1622 = 1;
                if (startRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
                }
                Modifier modifier322 = modifier2;
                int i1722 = i9;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            textStyle2 = textStyle;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            i11 = i4 & 64;
            if (i11 != 0) {
            }
            if ((i3 & 12582912) == 0) {
            }
            int i16222 = 1;
            if (startRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
            }
            Modifier modifier3222 = modifier2;
            int i17222 = i9;
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
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        i11 = i4 & 64;
        if (i11 != 0) {
        }
        if ((i3 & 12582912) == 0) {
        }
        int i162222 = 1;
        if (startRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
        }
        Modifier modifier32222 = modifier2;
        int i172222 = i9;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ClickableText_4YKlhWE$lambda$0$0(TextLayoutResult textLayoutResult) {
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ClickableText_4YKlhWE$lambda$3$0(MutableState mutableState, ky kyVar, TextLayoutResult textLayoutResult) {
        mutableState.setValue(textLayoutResult);
        kyVar.invoke(textLayoutResult);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ClickableText_4YKlhWE$lambda$4(AnnotatedString annotatedString, Modifier modifier, TextStyle textStyle, boolean z, int i, int i2, ky kyVar, ky kyVar2, int i3, int i4, Composer composer, int i5) {
        m1083ClickableText4YKlhWE(annotatedString, modifier, textStyle, z, i, i2, kyVar, kyVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return w01.a;
    }
}
