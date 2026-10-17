package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import defpackage.cm;
import defpackage.dm;
import defpackage.er;
import defpackage.my;
import defpackage.oy;
import defpackage.w01;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContextualFlowLayoutKt {
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019f, code lost:
    
        if (r6 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L138;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00d8  */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContextualFlowColumn(int i, Modifier modifier, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, Alignment.Horizontal horizontal2, int i2, int i3, ContextualFlowColumnOverflow contextualFlowColumnOverflow, oy oyVar, Composer composer, int i4, int i5) {
        int i6;
        Modifier modifier2;
        int i7;
        Arrangement.Vertical vertical2;
        int i8;
        int i9;
        Alignment.Horizontal horizontal3;
        int i10;
        int i11;
        int i12;
        Arrangement.Horizontal horizontal4;
        int i13;
        ContextualFlowColumnOverflow contextualFlowColumnOverflow2;
        Arrangement.Vertical vertical3;
        int i14;
        ScopeUpdateScope endRestartGroup;
        int i15;
        Arrangement.Horizontal horizontal5;
        Object obj;
        Composer startRestartGroup = composer.startRestartGroup(1986851536);
        if ((i4 & 6) == 0) {
            i6 = (startRestartGroup.changed(i) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i16 = i5 & 2;
        if (i16 != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            modifier2 = modifier;
            i6 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i4 & 384) == 0) {
                vertical2 = vertical;
                i6 |= startRestartGroup.changed(vertical2) ? Fields.RotationX : Fields.SpotShadowColor;
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else if ((i4 & 3072) == 0) {
                    i6 |= startRestartGroup.changed(horizontal) ? Fields.CameraDistance : Fields.RotationZ;
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else if ((i4 & 24576) == 0) {
                        horizontal3 = horizontal2;
                        i6 |= startRestartGroup.changed(horizontal3) ? Fields.Clip : 8192;
                        i10 = i5 & 32;
                        if (i10 != 0) {
                            i6 |= 196608;
                        } else if ((i4 & 196608) == 0) {
                            i6 |= startRestartGroup.changed(i2) ? Fields.RenderEffect : 65536;
                        }
                        i11 = i5 & 64;
                        if (i11 != 0) {
                            i6 |= 1572864;
                        } else if ((i4 & 1572864) == 0) {
                            i6 |= startRestartGroup.changed(i3) ? 1048576 : Fields.BlendMode;
                        }
                        i12 = i5 & Fields.SpotShadowColor;
                        if (i12 != 0) {
                            i6 |= 12582912;
                        } else if ((i4 & 12582912) == 0) {
                            i6 |= startRestartGroup.changed(contextualFlowColumnOverflow) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        }
                        if ((i4 & 100663296) == 0) {
                            i6 |= startRestartGroup.changedInstance(oyVar) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        }
                        int i17 = 1;
                        if (startRestartGroup.shouldExecute((i6 & 38347923) != 38347922, i6 & 1)) {
                            if (i16 != 0) {
                                modifier2 = Modifier.Companion;
                            }
                            Arrangement.Vertical top = i7 != 0 ? Arrangement.INSTANCE.getTop() : vertical2;
                            if (i8 != 0) {
                                horizontal5 = Arrangement.INSTANCE.getStart();
                                i15 = i9;
                            } else {
                                i15 = i9;
                                horizontal5 = horizontal;
                            }
                            if (i15 != 0) {
                                horizontal3 = Alignment.Companion.getStart();
                            }
                            int i18 = i10 != 0 ? Integer.MAX_VALUE : i2;
                            int i19 = i11 != 0 ? Integer.MAX_VALUE : i3;
                            ContextualFlowColumnOverflow clip = i12 != 0 ? ContextualFlowColumnOverflow.Companion.getClip() : contextualFlowColumnOverflow;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1986851536, i6, -1, "androidx.compose.foundation.layout.ContextualFlowColumn (ContextualFlowLayout.kt:154)");
                            }
                            int i20 = 29360128 & i6;
                            boolean z = i20 == 8388608;
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = clip.createOverflowState$foundation_layout();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState) rememberedValue;
                            boolean z2 = i20 == 8388608;
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!z2) {
                                obj = rememberedValue2;
                            }
                            ArrayList arrayList = new ArrayList();
                            clip.addOverflowComposables$foundation_layout(flowLayoutOverflowState, arrayList);
                            startRestartGroup.updateRememberedValue(arrayList);
                            obj = arrayList;
                            int i21 = i6 >> 6;
                            SubcomposeLayoutKt.SubcomposeLayout(modifier2, contextualColumnMeasureHelper(top, horizontal5, horizontal3, i18, i19, flowLayoutOverflowState, i, (List) obj, ComposableLambdaKt.rememberComposableLambda(620176540, true, new cm(oyVar, i17), startRestartGroup, 54), startRestartGroup, (i21 & 57344) | (i21 & 14) | 100663296 | (i21 & 112) | (i21 & 896) | (i21 & 7168) | ((i6 << 18) & 3670016)), startRestartGroup, (i6 >> 3) & 14, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            contextualFlowColumnOverflow2 = clip;
                            vertical3 = top;
                            horizontal4 = horizontal5;
                            i13 = i18;
                            i14 = i19;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            horizontal4 = horizontal;
                            i13 = i2;
                            contextualFlowColumnOverflow2 = contextualFlowColumnOverflow;
                            vertical3 = vertical2;
                            i14 = i3;
                        }
                        Modifier modifier3 = modifier2;
                        Alignment.Horizontal horizontal6 = horizontal3;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new dm(i, modifier3, vertical3, horizontal4, horizontal6, i13, i14, contextualFlowColumnOverflow2, oyVar, i4, i5));
                            return;
                        }
                        return;
                    }
                    horizontal3 = horizontal2;
                    i10 = i5 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i5 & 64;
                    if (i11 != 0) {
                    }
                    i12 = i5 & Fields.SpotShadowColor;
                    if (i12 != 0) {
                    }
                    if ((i4 & 100663296) == 0) {
                    }
                    int i172 = 1;
                    if (startRestartGroup.shouldExecute((i6 & 38347923) != 38347922, i6 & 1)) {
                    }
                    Modifier modifier32 = modifier2;
                    Alignment.Horizontal horizontal62 = horizontal3;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                horizontal3 = horizontal2;
                i10 = i5 & 32;
                if (i10 != 0) {
                }
                i11 = i5 & 64;
                if (i11 != 0) {
                }
                i12 = i5 & Fields.SpotShadowColor;
                if (i12 != 0) {
                }
                if ((i4 & 100663296) == 0) {
                }
                int i1722 = 1;
                if (startRestartGroup.shouldExecute((i6 & 38347923) != 38347922, i6 & 1)) {
                }
                Modifier modifier322 = modifier2;
                Alignment.Horizontal horizontal622 = horizontal3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            vertical2 = vertical;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            horizontal3 = horizontal2;
            i10 = i5 & 32;
            if (i10 != 0) {
            }
            i11 = i5 & 64;
            if (i11 != 0) {
            }
            i12 = i5 & Fields.SpotShadowColor;
            if (i12 != 0) {
            }
            if ((i4 & 100663296) == 0) {
            }
            int i17222 = 1;
            if (startRestartGroup.shouldExecute((i6 & 38347923) != 38347922, i6 & 1)) {
            }
            Modifier modifier3222 = modifier2;
            Alignment.Horizontal horizontal6222 = horizontal3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        vertical2 = vertical;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        horizontal3 = horizontal2;
        i10 = i5 & 32;
        if (i10 != 0) {
        }
        i11 = i5 & 64;
        if (i11 != 0) {
        }
        i12 = i5 & Fields.SpotShadowColor;
        if (i12 != 0) {
        }
        if ((i4 & 100663296) == 0) {
        }
        int i172222 = 1;
        if (startRestartGroup.shouldExecute((i6 & 38347923) != 38347922, i6 & 1)) {
        }
        Modifier modifier32222 = modifier2;
        Alignment.Horizontal horizontal62222 = horizontal3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ContextualFlowColumn$lambda$2(oy oyVar, int i, FlowLineInfo flowLineInfo, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(620176540, i2, -1, "androidx.compose.foundation.layout.ContextualFlowColumn.<anonymous> (ContextualFlowLayout.kt:173)");
        }
        oyVar.invoke(new ContextualFlowColumnScopeImpl(flowLineInfo.getLineIndex$foundation_layout(), flowLineInfo.getPositionInLine$foundation_layout(), flowLineInfo.m695getMaxCrossAxisSizeD9Ej5fM$foundation_layout(), flowLineInfo.m696getMaxMainAxisSizeD9Ej5fM$foundation_layout(), null), Integer.valueOf(i), composer, Integer.valueOf((i2 << 3) & 112));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ContextualFlowColumn$lambda$3(int i, Modifier modifier, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, Alignment.Horizontal horizontal2, int i2, int i3, ContextualFlowColumnOverflow contextualFlowColumnOverflow, oy oyVar, int i4, int i5, Composer composer, int i6) {
        ContextualFlowColumn(i, modifier, vertical, horizontal, horizontal2, i2, i3, contextualFlowColumnOverflow, oyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
        return w01.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x019f, code lost:
    
        if (r6 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L138;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00d8  */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContextualFlowRow(int i, Modifier modifier, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, int i2, int i3, ContextualFlowRowOverflow contextualFlowRowOverflow, oy oyVar, Composer composer, int i4, int i5) {
        int i6;
        Modifier modifier2;
        int i7;
        Arrangement.Horizontal horizontal2;
        int i8;
        int i9;
        Alignment.Vertical vertical3;
        int i10;
        int i11;
        int i12;
        Arrangement.Vertical vertical4;
        int i13;
        ContextualFlowRowOverflow contextualFlowRowOverflow2;
        Arrangement.Horizontal horizontal3;
        int i14;
        ScopeUpdateScope endRestartGroup;
        int i15;
        Arrangement.Vertical vertical5;
        Object obj;
        Composer startRestartGroup = composer.startRestartGroup(-294153140);
        if ((i4 & 6) == 0) {
            i6 = (startRestartGroup.changed(i) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i16 = i5 & 2;
        if (i16 != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            modifier2 = modifier;
            i6 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i7 = i5 & 4;
            if (i7 == 0) {
                i6 |= 384;
            } else if ((i4 & 384) == 0) {
                horizontal2 = horizontal;
                i6 |= startRestartGroup.changed(horizontal2) ? Fields.RotationX : Fields.SpotShadowColor;
                i8 = i5 & 8;
                if (i8 != 0) {
                    i6 |= 3072;
                } else if ((i4 & 3072) == 0) {
                    i6 |= startRestartGroup.changed(vertical) ? Fields.CameraDistance : Fields.RotationZ;
                    i9 = i5 & 16;
                    if (i9 == 0) {
                        i6 |= 24576;
                    } else if ((i4 & 24576) == 0) {
                        vertical3 = vertical2;
                        i6 |= startRestartGroup.changed(vertical3) ? Fields.Clip : 8192;
                        i10 = i5 & 32;
                        if (i10 != 0) {
                            i6 |= 196608;
                        } else if ((i4 & 196608) == 0) {
                            i6 |= startRestartGroup.changed(i2) ? Fields.RenderEffect : 65536;
                        }
                        i11 = i5 & 64;
                        if (i11 != 0) {
                            i6 |= 1572864;
                        } else if ((i4 & 1572864) == 0) {
                            i6 |= startRestartGroup.changed(i3) ? 1048576 : Fields.BlendMode;
                        }
                        i12 = i5 & Fields.SpotShadowColor;
                        if (i12 != 0) {
                            i6 |= 12582912;
                        } else if ((i4 & 12582912) == 0) {
                            i6 |= startRestartGroup.changed(contextualFlowRowOverflow) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        }
                        if ((i4 & 100663296) == 0) {
                            i6 |= startRestartGroup.changedInstance(oyVar) ? GroupFlagsKt.IsRecompositionRequiredFlag : GroupFlagsKt.HasAuxSlotFlag;
                        }
                        if (startRestartGroup.shouldExecute((i6 & 38347923) != 38347922, i6 & 1)) {
                            if (i16 != 0) {
                                modifier2 = Modifier.Companion;
                            }
                            Arrangement.Horizontal start = i7 != 0 ? Arrangement.INSTANCE.getStart() : horizontal2;
                            if (i8 != 0) {
                                vertical5 = Arrangement.INSTANCE.getTop();
                                i15 = i9;
                            } else {
                                i15 = i9;
                                vertical5 = vertical;
                            }
                            if (i15 != 0) {
                                vertical3 = Alignment.Companion.getTop();
                            }
                            int i17 = i10 != 0 ? Integer.MAX_VALUE : i2;
                            int i18 = i11 != 0 ? Integer.MAX_VALUE : i3;
                            ContextualFlowRowOverflow clip = i12 != 0 ? ContextualFlowRowOverflow.Companion.getClip() : contextualFlowRowOverflow;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-294153140, i6, -1, "androidx.compose.foundation.layout.ContextualFlowRow (ContextualFlowLayout.kt:79)");
                            }
                            int i19 = 29360128 & i6;
                            boolean z = i19 == 8388608;
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = clip.createOverflowState$foundation_layout();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState) rememberedValue;
                            boolean z2 = i19 == 8388608;
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!z2) {
                                obj = rememberedValue2;
                            }
                            ArrayList arrayList = new ArrayList();
                            clip.addOverflowComposables$foundation_layout(flowLayoutOverflowState, arrayList);
                            startRestartGroup.updateRememberedValue(arrayList);
                            obj = arrayList;
                            int i20 = i6 >> 6;
                            SubcomposeLayoutKt.SubcomposeLayout(modifier2, contextualRowMeasurementHelper(start, vertical5, vertical3, i17, i18, flowLayoutOverflowState, i, (List) obj, ComposableLambdaKt.rememberComposableLambda(-1677845586, true, new cm(oyVar, 0), startRestartGroup, 54), startRestartGroup, (i20 & 57344) | (i20 & 14) | 100663296 | (i20 & 112) | (i20 & 896) | (i20 & 7168) | ((i6 << 18) & 3670016)), startRestartGroup, (i6 >> 3) & 14, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            contextualFlowRowOverflow2 = clip;
                            horizontal3 = start;
                            vertical4 = vertical5;
                            i13 = i17;
                            i14 = i18;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            vertical4 = vertical;
                            i13 = i2;
                            contextualFlowRowOverflow2 = contextualFlowRowOverflow;
                            horizontal3 = horizontal2;
                            i14 = i3;
                        }
                        Modifier modifier3 = modifier2;
                        Alignment.Vertical vertical6 = vertical3;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new dm(i, modifier3, horizontal3, vertical4, vertical6, i13, i14, contextualFlowRowOverflow2, oyVar, i4, i5));
                            return;
                        }
                        return;
                    }
                    vertical3 = vertical2;
                    i10 = i5 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i5 & 64;
                    if (i11 != 0) {
                    }
                    i12 = i5 & Fields.SpotShadowColor;
                    if (i12 != 0) {
                    }
                    if ((i4 & 100663296) == 0) {
                    }
                    if (startRestartGroup.shouldExecute((i6 & 38347923) != 38347922, i6 & 1)) {
                    }
                    Modifier modifier32 = modifier2;
                    Alignment.Vertical vertical62 = vertical3;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i9 = i5 & 16;
                if (i9 == 0) {
                }
                vertical3 = vertical2;
                i10 = i5 & 32;
                if (i10 != 0) {
                }
                i11 = i5 & 64;
                if (i11 != 0) {
                }
                i12 = i5 & Fields.SpotShadowColor;
                if (i12 != 0) {
                }
                if ((i4 & 100663296) == 0) {
                }
                if (startRestartGroup.shouldExecute((i6 & 38347923) != 38347922, i6 & 1)) {
                }
                Modifier modifier322 = modifier2;
                Alignment.Vertical vertical622 = vertical3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            horizontal2 = horizontal;
            i8 = i5 & 8;
            if (i8 != 0) {
            }
            i9 = i5 & 16;
            if (i9 == 0) {
            }
            vertical3 = vertical2;
            i10 = i5 & 32;
            if (i10 != 0) {
            }
            i11 = i5 & 64;
            if (i11 != 0) {
            }
            i12 = i5 & Fields.SpotShadowColor;
            if (i12 != 0) {
            }
            if ((i4 & 100663296) == 0) {
            }
            if (startRestartGroup.shouldExecute((i6 & 38347923) != 38347922, i6 & 1)) {
            }
            Modifier modifier3222 = modifier2;
            Alignment.Vertical vertical6222 = vertical3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i7 = i5 & 4;
        if (i7 == 0) {
        }
        horizontal2 = horizontal;
        i8 = i5 & 8;
        if (i8 != 0) {
        }
        i9 = i5 & 16;
        if (i9 == 0) {
        }
        vertical3 = vertical2;
        i10 = i5 & 32;
        if (i10 != 0) {
        }
        i11 = i5 & 64;
        if (i11 != 0) {
        }
        i12 = i5 & Fields.SpotShadowColor;
        if (i12 != 0) {
        }
        if ((i4 & 100663296) == 0) {
        }
        if (startRestartGroup.shouldExecute((i6 & 38347923) != 38347922, i6 & 1)) {
        }
        Modifier modifier32222 = modifier2;
        Alignment.Vertical vertical62222 = vertical3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ContextualFlowRow$lambda$2(oy oyVar, int i, FlowLineInfo flowLineInfo, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1677845586, i2, -1, "androidx.compose.foundation.layout.ContextualFlowRow.<anonymous> (ContextualFlowLayout.kt:98)");
        }
        oyVar.invoke(new ContextualFlowRowScopeImpl(flowLineInfo.getLineIndex$foundation_layout(), flowLineInfo.getPositionInLine$foundation_layout(), flowLineInfo.m696getMaxMainAxisSizeD9Ej5fM$foundation_layout(), flowLineInfo.m695getMaxCrossAxisSizeD9Ej5fM$foundation_layout(), null), Integer.valueOf(i), composer, Integer.valueOf((i2 << 3) & 112));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ContextualFlowRow$lambda$3(int i, Modifier modifier, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, int i2, int i3, ContextualFlowRowOverflow contextualFlowRowOverflow, oy oyVar, int i4, int i5, Composer composer, int i6) {
        ContextualFlowRow(i, modifier, horizontal, vertical, vertical2, i2, i3, contextualFlowRowOverflow, oyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
        return w01.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r30.changed(r4) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c1, code lost:
    
        if (r30.changed(r29) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c9, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ca, code lost:
    
        r2 = r3 | r5;
        r3 = r30.rememberedValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d0, code lost:
    
        if (r2 != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d8, code lost:
    
        if (r3 != androidx.compose.runtime.Composer.Companion.getEmpty()) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ff, code lost:
    
        r3 = (defpackage.my) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0105, code lost:
    
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0107, code lost:
    
        androidx.compose.runtime.ComposerKt.traceEventEnd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010a, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00da, code lost:
    
        r3 = new androidx.compose.foundation.layout.FlowMeasureLazyPolicy(false, r22, r21, r21.mo653getSpacingD9Ej5fM(), androidx.compose.foundation.layout.CrossAxisAlignment.Companion.horizontal$foundation_layout(r23), r22.mo653getSpacingD9Ej5fM(), r27, r25, r4, r26, r28, r29, null).getMeasurePolicy();
        r30.updateRememberedValue(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c7, code lost:
    
        if ((r31 & 100663296) != 67108864) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final my contextualColumnMeasureHelper(Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, Alignment.Horizontal horizontal2, int i, int i2, FlowLayoutOverflowState flowLayoutOverflowState, int i3, List<? extends my> list, oy oyVar, Composer composer, int i4) {
        int i5;
        boolean z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-676633639, i4, -1, "androidx.compose.foundation.layout.contextualColumnMeasureHelper (ContextualFlowLayout.kt:424)");
        }
        boolean z2 = false;
        boolean z3 = ((((i4 & 14) ^ 6) > 4 && composer.changed(vertical)) || (i4 & 6) == 4) | ((((i4 & 112) ^ 48) > 32 && composer.changed(horizontal)) || (i4 & 48) == 32) | ((((i4 & 896) ^ 384) > 256 && composer.changed(horizontal2)) || (i4 & 384) == 256);
        if (((i4 & 7168) ^ 3072) > 2048) {
            i5 = i;
        } else {
            i5 = i;
        }
        if ((i4 & 3072) != 2048) {
            z = false;
            boolean changed = z3 | z | ((((57344 & i4) ^ 24576) <= 16384 && composer.changed(i2)) || (i4 & 24576) == 16384) | composer.changed(flowLayoutOverflowState) | ((((3670016 & i4) ^ 1572864) <= 1048576 && composer.changed(i3)) || (i4 & 1572864) == 1048576);
            if (((234881024 & i4) ^ 100663296) <= 67108864) {
            }
        }
        z = true;
        boolean changed2 = z3 | z | ((((57344 & i4) ^ 24576) <= 16384 && composer.changed(i2)) || (i4 & 24576) == 16384) | composer.changed(flowLayoutOverflowState) | ((((3670016 & i4) ^ 1572864) <= 1048576 && composer.changed(i3)) || (i4 & 1572864) == 1048576);
        if (((234881024 & i4) ^ 100663296) <= 67108864) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r30.changed(r4) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c1, code lost:
    
        if (r30.changed(r29) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c9, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ca, code lost:
    
        r2 = r3 | r5;
        r3 = r30.rememberedValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d0, code lost:
    
        if (r2 != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d8, code lost:
    
        if (r3 != androidx.compose.runtime.Composer.Companion.getEmpty()) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ff, code lost:
    
        r3 = (defpackage.my) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0105, code lost:
    
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0107, code lost:
    
        androidx.compose.runtime.ComposerKt.traceEventEnd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010a, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00da, code lost:
    
        r3 = new androidx.compose.foundation.layout.FlowMeasureLazyPolicy(true, r21, r22, r21.mo653getSpacingD9Ej5fM(), androidx.compose.foundation.layout.CrossAxisAlignment.Companion.vertical$foundation_layout(r23), r22.mo653getSpacingD9Ej5fM(), r27, r25, r4, r26, r28, r29, null).getMeasurePolicy();
        r30.updateRememberedValue(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c7, code lost:
    
        if ((r31 & 100663296) != 67108864) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final my contextualRowMeasurementHelper(Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, int i, int i2, FlowLayoutOverflowState flowLayoutOverflowState, int i3, List<? extends my> list, oy oyVar, Composer composer, int i4) {
        int i5;
        boolean z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(962906403, i4, -1, "androidx.compose.foundation.layout.contextualRowMeasurementHelper (ContextualFlowLayout.kt:384)");
        }
        boolean z2 = false;
        boolean z3 = ((((i4 & 14) ^ 6) > 4 && composer.changed(horizontal)) || (i4 & 6) == 4) | ((((i4 & 112) ^ 48) > 32 && composer.changed(vertical)) || (i4 & 48) == 32) | ((((i4 & 896) ^ 384) > 256 && composer.changed(vertical2)) || (i4 & 384) == 256);
        if (((i4 & 7168) ^ 3072) > 2048) {
            i5 = i;
        } else {
            i5 = i;
        }
        if ((i4 & 3072) != 2048) {
            z = false;
            boolean changed = z3 | z | ((((57344 & i4) ^ 24576) <= 16384 && composer.changed(i2)) || (i4 & 24576) == 16384) | composer.changed(flowLayoutOverflowState) | ((((3670016 & i4) ^ 1572864) <= 1048576 && composer.changed(i3)) || (i4 & 1572864) == 1048576);
            if (((234881024 & i4) ^ 100663296) <= 67108864) {
            }
        }
        z = true;
        boolean changed2 = z3 | z | ((((57344 & i4) ^ 24576) <= 16384 && composer.changed(i2)) || (i4 & 24576) == 16384) | composer.changed(flowLayoutOverflowState) | ((((3670016 & i4) ^ 1572864) <= 1048576 && composer.changed(i3)) || (i4 & 1572864) == 1048576);
        if (((234881024 & i4) ^ 100663296) <= 67108864) {
        }
    }
}
