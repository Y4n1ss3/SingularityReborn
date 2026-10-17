package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.CrossAxisAlignment;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import defpackage.c10;
import defpackage.er;
import defpackage.fc;
import defpackage.h10;
import defpackage.hx;
import defpackage.ix;
import defpackage.iy;
import defpackage.ji0;
import defpackage.jx;
import defpackage.k4;
import defpackage.ky;
import defpackage.ma0;
import defpackage.my;
import defpackage.na0;
import defpackage.ny;
import defpackage.o;
import defpackage.oa0;
import defpackage.uo;
import defpackage.w01;
import defpackage.y80;
import defpackage.yi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FlowLayoutKt {
    private static final CrossAxisAlignment CROSS_AXIS_ALIGNMENT_START;
    private static final CrossAxisAlignment CROSS_AXIS_ALIGNMENT_TOP;

    static {
        CrossAxisAlignment.Companion companion = CrossAxisAlignment.Companion;
        Alignment.Companion companion2 = Alignment.Companion;
        CROSS_AXIS_ALIGNMENT_TOP = companion.vertical$foundation_layout(companion2.getTop());
        CROSS_AXIS_ALIGNMENT_START = companion.horizontal$foundation_layout(companion2.getStart());
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ab, code lost:
    
        if (r4 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L139;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FlowColumn(Modifier modifier, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, Alignment.Horizontal horizontal2, int i, int i2, FlowColumnOverflow flowColumnOverflow, ny nyVar, Composer composer, int i3, int i4) {
        int i5;
        Arrangement.Vertical vertical2;
        int i6;
        int i7;
        Alignment.Horizontal horizontal3;
        int i8;
        int i9;
        int i10;
        int i11;
        Modifier modifier2;
        Arrangement.Horizontal horizontal4;
        Arrangement.Vertical vertical3;
        Composer composer2;
        int i12;
        int i13;
        FlowColumnOverflow flowColumnOverflow2;
        ScopeUpdateScope endRestartGroup;
        int i14;
        Arrangement.Horizontal horizontal5;
        Object obj;
        Composer startRestartGroup = composer.startRestartGroup(-1944405121);
        int i15 = i4 & 1;
        if (i15 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changed(modifier) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i16 = i4 & 2;
        if (i16 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            vertical2 = vertical;
            i5 |= startRestartGroup.changed(vertical2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 384) == 0) {
                i5 |= startRestartGroup.changed(horizontal) ? Fields.RotationX : Fields.SpotShadowColor;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    horizontal3 = horizontal2;
                    i5 |= startRestartGroup.changed(horizontal3) ? Fields.CameraDistance : Fields.RotationZ;
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
                            i5 |= startRestartGroup.changed(flowColumnOverflow) ? 1048576 : Fields.BlendMode;
                        }
                        if ((i3 & 12582912) == 0) {
                            i5 |= startRestartGroup.changedInstance(nyVar) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        }
                        if (startRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
                            Modifier modifier3 = i15 != 0 ? Modifier.Companion : modifier;
                            Arrangement.Vertical top = i16 != 0 ? Arrangement.INSTANCE.getTop() : vertical2;
                            if (i6 != 0) {
                                horizontal5 = Arrangement.INSTANCE.getStart();
                                i14 = i7;
                            } else {
                                i14 = i7;
                                horizontal5 = horizontal;
                            }
                            if (i14 != 0) {
                                horizontal3 = Alignment.Companion.getStart();
                            }
                            int i17 = i8 != 0 ? Integer.MAX_VALUE : i9;
                            int i18 = i10 != 0 ? Integer.MAX_VALUE : i2;
                            FlowColumnOverflow clip = i11 != 0 ? FlowColumnOverflow.Companion.getClip() : flowColumnOverflow;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1944405121, i5, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:213)");
                            }
                            int i19 = 3670016 & i5;
                            boolean z = i19 == 1048576;
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = clip.createOverflowState$foundation_layout();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState) rememberedValue;
                            MultiContentMeasurePolicy columnMeasurementMultiContentHelper = columnMeasurementMultiContentHelper(top, horizontal5, horizontal3, i17, i18, flowLayoutOverflowState, startRestartGroup, (i5 >> 3) & 65534);
                            boolean z2 = ((29360128 & i5) == 8388608) | (i19 == 1048576) | ((i5 & 458752) == 131072);
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!z2) {
                                obj = rememberedValue2;
                            }
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(ComposableLambdaKt.composableLambdaInstance(-1720407857, true, new hx(nyVar, 0)));
                            clip.addOverflowComposables$foundation_layout(flowLayoutOverflowState, arrayList);
                            startRestartGroup.updateRememberedValue(arrayList);
                            obj = arrayList;
                            my combineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts((List) obj);
                            boolean changed = startRestartGroup.changed(columnMeasurementMultiContentHelper);
                            Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (changed || rememberedValue3 == Composer.Companion.getEmpty()) {
                                rememberedValue3 = MultiContentMeasurePolicyKt.createMeasurePolicy(columnMeasurementMultiContentHelper);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue3;
                            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
                            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                            Modifier modifier4 = modifier3;
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
                            uo.h(companion, m3878constructorimpl, measurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                            if (fc.l(combineAsVirtualLayouts, startRestartGroup, 0)) {
                                ComposerKt.traceEventEnd();
                            }
                            horizontal4 = horizontal5;
                            i12 = i17;
                            i13 = i18;
                            modifier2 = modifier4;
                            composer2 = startRestartGroup;
                            flowColumnOverflow2 = clip;
                            vertical3 = top;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            horizontal4 = horizontal;
                            vertical3 = vertical2;
                            composer2 = startRestartGroup;
                            i12 = i9;
                            i13 = i2;
                            flowColumnOverflow2 = flowColumnOverflow;
                        }
                        Alignment.Horizontal horizontal6 = horizontal3;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new ix(modifier2, vertical3, horizontal4, horizontal6, i12, i13, flowColumnOverflow2, nyVar, i3, i4));
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
                    if (startRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
                    }
                    Alignment.Horizontal horizontal62 = horizontal3;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                horizontal3 = horizontal2;
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
                if (startRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
                }
                Alignment.Horizontal horizontal622 = horizontal3;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            horizontal3 = horizontal2;
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
            if (startRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
            }
            Alignment.Horizontal horizontal6222 = horizontal3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        vertical2 = vertical;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        horizontal3 = horizontal2;
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
        if (startRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
        }
        Alignment.Horizontal horizontal62222 = horizontal3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 FlowColumn$lambda$1$0(ny nyVar, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1720407857, i, -1, "androidx.compose.foundation.layout.FlowColumn.<anonymous>.<anonymous> (FlowLayout.kt:227)");
            }
            nyVar.invoke(FlowColumnScopeInstance.INSTANCE, composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 FlowColumn$lambda$2(Modifier modifier, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, Alignment.Horizontal horizontal2, int i, int i2, FlowColumnOverflow flowColumnOverflow, ny nyVar, int i3, int i4, Composer composer, int i5) {
        FlowColumn(modifier, vertical, horizontal, horizontal2, i, i2, flowColumnOverflow, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 FlowColumn$lambda$3(Modifier modifier, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, Alignment.Horizontal horizontal2, int i, int i2, ny nyVar, int i3, int i4, Composer composer, int i5) {
        FlowColumn(modifier, vertical, horizontal, horizontal2, i, i2, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return w01.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x01ab, code lost:
    
        if (r4 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L139;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    @er
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FlowRow(Modifier modifier, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, int i, int i2, FlowRowOverflow flowRowOverflow, ny nyVar, Composer composer, int i3, int i4) {
        int i5;
        Arrangement.Horizontal horizontal2;
        int i6;
        int i7;
        Alignment.Vertical vertical3;
        int i8;
        int i9;
        int i10;
        int i11;
        Modifier modifier2;
        Arrangement.Vertical vertical4;
        Arrangement.Horizontal horizontal3;
        Composer composer2;
        int i12;
        int i13;
        FlowRowOverflow flowRowOverflow2;
        ScopeUpdateScope endRestartGroup;
        int i14;
        Arrangement.Vertical vertical5;
        Object obj;
        Composer startRestartGroup = composer.startRestartGroup(-1956591841);
        int i15 = i4 & 1;
        if (i15 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = (startRestartGroup.changed(modifier) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i16 = i4 & 2;
        if (i16 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            horizontal2 = horizontal;
            i5 |= startRestartGroup.changed(horizontal2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 384) == 0) {
                i5 |= startRestartGroup.changed(vertical) ? Fields.RotationX : Fields.SpotShadowColor;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    vertical3 = vertical2;
                    i5 |= startRestartGroup.changed(vertical3) ? Fields.CameraDistance : Fields.RotationZ;
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
                            i5 |= startRestartGroup.changed(flowRowOverflow) ? 1048576 : Fields.BlendMode;
                        }
                        if ((i3 & 12582912) == 0) {
                            i5 |= startRestartGroup.changedInstance(nyVar) ? GroupFlagsKt.IsNodeFlag : 4194304;
                        }
                        if (startRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
                            Modifier modifier3 = i15 != 0 ? Modifier.Companion : modifier;
                            Arrangement.Horizontal start = i16 != 0 ? Arrangement.INSTANCE.getStart() : horizontal2;
                            if (i6 != 0) {
                                vertical5 = Arrangement.INSTANCE.getTop();
                                i14 = i7;
                            } else {
                                i14 = i7;
                                vertical5 = vertical;
                            }
                            if (i14 != 0) {
                                vertical3 = Alignment.Companion.getTop();
                            }
                            int i17 = i8 != 0 ? Integer.MAX_VALUE : i9;
                            int i18 = i10 != 0 ? Integer.MAX_VALUE : i2;
                            FlowRowOverflow clip = i11 != 0 ? FlowRowOverflow.Companion.getClip() : flowRowOverflow;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1956591841, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:99)");
                            }
                            int i19 = 3670016 & i5;
                            boolean z = i19 == 1048576;
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = clip.createOverflowState$foundation_layout();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState) rememberedValue;
                            MultiContentMeasurePolicy rowMeasurementMultiContentHelper = rowMeasurementMultiContentHelper(start, vertical5, vertical3, i17, i18, flowLayoutOverflowState, startRestartGroup, (i5 >> 3) & 65534);
                            boolean z2 = ((29360128 & i5) == 8388608) | (i19 == 1048576) | ((i5 & 458752) == 131072);
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!z2) {
                                obj = rememberedValue2;
                            }
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(ComposableLambdaKt.composableLambdaInstance(-1192950673, true, new hx(nyVar, 1)));
                            clip.addOverflowComposables$foundation_layout(flowLayoutOverflowState, arrayList);
                            startRestartGroup.updateRememberedValue(arrayList);
                            obj = arrayList;
                            my combineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts((List) obj);
                            boolean changed = startRestartGroup.changed(rowMeasurementMultiContentHelper);
                            Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (changed || rememberedValue3 == Composer.Companion.getEmpty()) {
                                rememberedValue3 = MultiContentMeasurePolicyKt.createMeasurePolicy(rowMeasurementMultiContentHelper);
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue3;
                            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
                            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                            Modifier modifier4 = modifier3;
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
                            uo.h(companion, m3878constructorimpl, measurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                            Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                            if (fc.l(combineAsVirtualLayouts, startRestartGroup, 0)) {
                                ComposerKt.traceEventEnd();
                            }
                            vertical4 = vertical5;
                            i12 = i17;
                            i13 = i18;
                            modifier2 = modifier4;
                            composer2 = startRestartGroup;
                            flowRowOverflow2 = clip;
                            horizontal3 = start;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            vertical4 = vertical;
                            horizontal3 = horizontal2;
                            composer2 = startRestartGroup;
                            i12 = i9;
                            i13 = i2;
                            flowRowOverflow2 = flowRowOverflow;
                        }
                        Alignment.Vertical vertical6 = vertical3;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new ix(modifier2, horizontal3, vertical4, vertical6, i12, i13, flowRowOverflow2, nyVar, i3, i4));
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
                    if (startRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
                    }
                    Alignment.Vertical vertical62 = vertical3;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                vertical3 = vertical2;
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
                if (startRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
                }
                Alignment.Vertical vertical622 = vertical3;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            vertical3 = vertical2;
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
            if (startRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
            }
            Alignment.Vertical vertical6222 = vertical3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        horizontal2 = horizontal;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        vertical3 = vertical2;
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
        if (startRestartGroup.shouldExecute((i5 & 4793491) != 4793490, i5 & 1)) {
        }
        Alignment.Vertical vertical62222 = vertical3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 FlowRow$lambda$1$0(ny nyVar, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1192950673, i, -1, "androidx.compose.foundation.layout.FlowRow.<anonymous>.<anonymous> (FlowLayout.kt:113)");
            }
            nyVar.invoke(FlowRowScopeInstance.INSTANCE, composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 FlowRow$lambda$2(Modifier modifier, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, int i, int i2, FlowRowOverflow flowRowOverflow, ny nyVar, int i3, int i4, Composer composer, int i5) {
        FlowRow(modifier, horizontal, vertical, vertical2, i, i2, flowRowOverflow, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 FlowRow$lambda$3(Modifier modifier, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, int i, int i2, ny nyVar, int i3, int i4, Composer composer, int i5) {
        FlowRow(modifier, horizontal, vertical, vertical2, i, i2, nyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return w01.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03de  */
    /* renamed from: breakDownItems-di9J0FM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final MeasureResult m688breakDownItemsdi9J0FM(MeasureScope measureScope, FlowLineMeasurePolicy flowLineMeasurePolicy, Iterator<? extends Measurable> it, float f, float f2, long j, int i, int i2, FlowLayoutOverflowState flowLayoutOverflowState) {
        int i3;
        int i4;
        MutableVector mutableVector;
        c10 c10Var;
        na0 na0Var;
        int i5;
        int i6;
        MeasureScope measureScope2;
        FlowLineMeasurePolicy flowLineMeasurePolicy2;
        int[] iArr;
        int[] iArr2;
        long j2;
        int i7;
        int height;
        int width;
        int i8;
        na0 na0Var2;
        ArrayList arrayList;
        c10 c10Var2;
        int i9;
        c10 c10Var3;
        int i10;
        int i11;
        int i12;
        ma0 ma0Var;
        ma0 ma0Var2;
        int i13;
        oa0 oa0Var;
        int i14;
        int i15;
        int i16;
        FlowLayoutData flowLayoutData;
        MeasureScope measureScope3 = measureScope;
        FlowLineMeasurePolicy flowLineMeasurePolicy3 = flowLineMeasurePolicy;
        Iterator<? extends Measurable> it2 = it;
        MutableVector mutableVector2 = new MutableVector(new MeasureResult[16], 0);
        int m7564getMaxWidthimpl = Constraints.m7564getMaxWidthimpl(j);
        int m7566getMinWidthimpl = Constraints.m7566getMinWidthimpl(j);
        int m7563getMaxHeightimpl = Constraints.m7563getMaxHeightimpl(j);
        na0 na0Var3 = h10.a;
        na0 na0Var4 = new na0();
        ArrayList arrayList2 = new ArrayList();
        int ceil = (int) Math.ceil(measureScope3.mo367toPx0680j_4(f));
        int ceil2 = (int) Math.ceil(measureScope3.mo367toPx0680j_4(f2));
        long m729constructorimpl = OrientationIndependentConstraints.m729constructorimpl(0, m7564getMaxWidthimpl, 0, m7563getMaxHeightimpl);
        long m744toBoxConstraintsOenEA2s = OrientationIndependentConstraints.m744toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m733copyyUG9Ft0$default(m729constructorimpl, 0, 0, 0, 0, 14, null), flowLineMeasurePolicy3.isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical);
        final ji0 ji0Var = new ji0();
        FlowLineInfo flowLineInfo = it2 instanceof ContextualFlowItemIterator ? new FlowLineInfo(0, 0, measureScope3.mo364toDpu2uoSUM(m7564getMaxWidthimpl), measureScope3.mo364toDpu2uoSUM(m7563getMaxHeightimpl), null) : null;
        Measurable safeNext = !it2.hasNext() ? null : safeNext(it2, flowLineInfo);
        if (safeNext != null) {
            mutableVector = mutableVector2;
            final int i17 = 0;
            i3 = ceil;
            i4 = ceil2;
            c10Var = new c10(m689measureAndCacherqJ1uqs(safeNext, flowLineMeasurePolicy3, m744toBoxConstraintsOenEA2s, new ky() { // from class: kx
                @Override // defpackage.ky
                public final Object invoke(Object obj) {
                    w01 breakDownItems_di9J0FM$lambda$0$0;
                    w01 breakDownItems_di9J0FM$lambda$2$0;
                    int i18 = i17;
                    ji0 ji0Var2 = ji0Var;
                    Placeable placeable = (Placeable) obj;
                    switch (i18) {
                        case 0:
                            breakDownItems_di9J0FM$lambda$0$0 = FlowLayoutKt.breakDownItems_di9J0FM$lambda$0$0(ji0Var2, placeable);
                            return breakDownItems_di9J0FM$lambda$0$0;
                        default:
                            breakDownItems_di9J0FM$lambda$2$0 = FlowLayoutKt.breakDownItems_di9J0FM$lambda$2$0(ji0Var2, placeable);
                            return breakDownItems_di9J0FM$lambda$2$0;
                    }
                }
            }));
        } else {
            i3 = ceil;
            i4 = ceil2;
            mutableVector = mutableVector2;
            c10Var = null;
        }
        Integer valueOf = c10Var != null ? Integer.valueOf((int) (c10Var.a >> 32)) : null;
        Measurable measurable = safeNext;
        Integer valueOf2 = c10Var != null ? Integer.valueOf((int) (c10Var.a & 4294967295L)) : null;
        ma0 ma0Var3 = new ma0();
        Integer num = valueOf2;
        ma0 ma0Var4 = new ma0();
        c10 c10Var4 = c10Var;
        oa0 oa0Var2 = new oa0();
        Integer num2 = valueOf;
        FlowLineInfo flowLineInfo2 = flowLineInfo;
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i, flowLayoutOverflowState, j, i2, i3, i4, null);
        int i18 = i4;
        int i19 = i3;
        FlowLayoutBuildingBlocks.WrapInfo m686getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m686getWrapInfoOpUlnko(it2.hasNext(), 0, c10.a(m7564getMaxWidthimpl, m7563getMaxHeightimpl), c10Var4, 0, 0, 0, false, false);
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo = m686getWrapInfoOpUlnko.isLastItemInContainer() ? flowLayoutBuildingBlocks.getWrapEllipsisInfo(m686getWrapInfoOpUlnko, c10Var4 != null, -1, 0, m7564getMaxWidthimpl, 0) : null;
        int i20 = m7564getMaxWidthimpl;
        Measurable measurable2 = measurable;
        int i21 = i20;
        FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo2 = wrapEllipsisInfo;
        int i22 = 0;
        int i23 = m7566getMinWidthimpl;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        ma0 ma0Var5 = ma0Var3;
        FlowLayoutBuildingBlocks.WrapInfo wrapInfo = m686getWrapInfoOpUlnko;
        int i28 = 0;
        boolean z = false;
        int i29 = m7563getMaxHeightimpl;
        while (!wrapInfo.isLastItemInContainer() && measurable2 != null) {
            num2.getClass();
            int intValue = num2.intValue();
            num.getClass();
            oa0 oa0Var3 = oa0Var2;
            ma0 ma0Var6 = ma0Var4;
            int i30 = i25 + intValue;
            int max = Math.max(i28, num.intValue());
            int i31 = i21 - intValue;
            int i32 = i24 + 1;
            int i33 = i20;
            flowLayoutOverflowState.setItemShown$foundation_layout(i32);
            arrayList2.add(measurable2);
            na0Var4.i(i24, ji0Var.d);
            Object parentData = measurable2.getParentData();
            RowColumnParentData rowColumnParentData = parentData instanceof RowColumnParentData ? (RowColumnParentData) parentData : null;
            if (((rowColumnParentData == null || (flowLayoutData = rowColumnParentData.getFlowLayoutData()) == null) ? null : Float.valueOf(flowLayoutData.getFillCrossAxisFraction())) != null) {
                z = true;
            }
            int i34 = i32 - i26;
            boolean z2 = i34 < i;
            if (flowLineInfo2 != null) {
                if (z2) {
                    i8 = i34;
                    i14 = i22;
                } else {
                    i8 = i34;
                    i14 = i22 + 1;
                }
                int i35 = z2 ? i8 : 0;
                if (z2) {
                    int i36 = i31 - i19;
                    i15 = i36 < 0 ? 0 : i36;
                } else {
                    i15 = i33;
                }
                float mo364toDpu2uoSUM = measureScope3.mo364toDpu2uoSUM(i15);
                if (z2) {
                    na0Var2 = na0Var4;
                    i16 = i29;
                } else {
                    int i37 = (i29 - max) - i18;
                    na0Var2 = na0Var4;
                    i16 = i37 < 0 ? 0 : i37;
                }
                flowLineInfo2.m699update4j6BHR0$foundation_layout(i14, i35, mo364toDpu2uoSUM, measureScope3.mo364toDpu2uoSUM(i16));
            } else {
                i8 = i34;
                na0Var2 = na0Var4;
            }
            Measurable safeNext2 = !it2.hasNext() ? null : safeNext(it2, flowLineInfo2);
            ji0Var.d = null;
            if (safeNext2 != null) {
                final int i38 = 1;
                ky kyVar = new ky() { // from class: kx
                    @Override // defpackage.ky
                    public final Object invoke(Object obj) {
                        w01 breakDownItems_di9J0FM$lambda$0$0;
                        w01 breakDownItems_di9J0FM$lambda$2$0;
                        int i182 = i38;
                        ji0 ji0Var2 = ji0Var;
                        Placeable placeable = (Placeable) obj;
                        switch (i182) {
                            case 0:
                                breakDownItems_di9J0FM$lambda$0$0 = FlowLayoutKt.breakDownItems_di9J0FM$lambda$0$0(ji0Var2, placeable);
                                return breakDownItems_di9J0FM$lambda$0$0;
                            default:
                                breakDownItems_di9J0FM$lambda$2$0 = FlowLayoutKt.breakDownItems_di9J0FM$lambda$2$0(ji0Var2, placeable);
                                return breakDownItems_di9J0FM$lambda$2$0;
                        }
                    }
                };
                arrayList = arrayList2;
                c10Var2 = new c10(m689measureAndCacherqJ1uqs(safeNext2, flowLineMeasurePolicy3, m744toBoxConstraintsOenEA2s, kyVar));
            } else {
                arrayList = arrayList2;
                c10Var2 = null;
            }
            Integer valueOf3 = c10Var2 != null ? Integer.valueOf(((int) (c10Var2.a >> 32)) + i19) : null;
            Measurable measurable3 = safeNext2;
            num = c10Var2 != null ? Integer.valueOf((int) (c10Var2.a & 4294967295L)) : null;
            boolean hasNext = it.hasNext();
            int i39 = i22;
            long a = c10.a(i31, i29);
            if (c10Var2 == null) {
                i9 = i31;
                c10Var3 = null;
            } else {
                valueOf3.getClass();
                int intValue2 = valueOf3.intValue();
                num.getClass();
                i9 = i31;
                c10Var3 = new c10(c10.a(intValue2, num.intValue()));
            }
            FlowLayoutBuildingBlocks.WrapInfo m686getWrapInfoOpUlnko2 = flowLayoutBuildingBlocks.m686getWrapInfoOpUlnko(hasNext, i8, a, c10Var3, i39, i27, max, false, false);
            if (m686getWrapInfoOpUlnko2.isLastItemInLine()) {
                i11 = i33;
                int min = Math.min(Math.max(i23, i30), i11);
                int i40 = i27 + max;
                FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo3 = flowLayoutBuildingBlocks.getWrapEllipsisInfo(m686getWrapInfoOpUlnko2, c10Var2 != null, i39, i40, i9, i8);
                ma0Var6.e(max);
                if (z) {
                    oa0Var = oa0Var3;
                    i13 = min;
                    oa0Var.b[oa0Var.e(i39)] = i39;
                } else {
                    i13 = min;
                    oa0Var = oa0Var3;
                }
                int i41 = (m7563getMaxHeightimpl - i40) - i18;
                oa0Var3 = oa0Var;
                ma0Var = ma0Var5;
                ma0Var.e(i32);
                valueOf3 = valueOf3 != null ? Integer.valueOf(valueOf3.intValue() - i19) : null;
                i22 = i39 + 1;
                i27 = i40 + i18;
                i29 = i41;
                i12 = i11;
                i26 = i32;
                wrapEllipsisInfo2 = wrapEllipsisInfo3;
                ma0Var2 = ma0Var6;
                z = false;
                i25 = 0;
                i10 = 0;
                i23 = i13;
            } else {
                i10 = max;
                i11 = i33;
                i12 = i9;
                ma0Var = ma0Var5;
                ma0Var2 = ma0Var6;
                i25 = i30;
                i22 = i39;
            }
            int i42 = i11;
            oa0Var2 = oa0Var3;
            measurable2 = measurable3;
            arrayList2 = arrayList;
            i20 = i42;
            ma0Var5 = ma0Var;
            ma0Var4 = ma0Var2;
            wrapInfo = m686getWrapInfoOpUlnko2;
            it2 = it;
            i24 = i32;
            num2 = valueOf3;
            na0Var4 = na0Var2;
            i21 = i12;
            i28 = i10;
        }
        oa0 oa0Var4 = oa0Var2;
        na0 na0Var5 = na0Var4;
        ArrayList arrayList3 = arrayList2;
        ma0 ma0Var7 = ma0Var4;
        ma0 ma0Var8 = ma0Var5;
        int i43 = i23;
        if (wrapEllipsisInfo2 != null) {
            arrayList3.add(wrapEllipsisInfo2.getEllipsis());
            na0Var = na0Var5;
            na0Var.i(arrayList3.size() - 1, wrapEllipsisInfo2.getPlaceable());
            int i44 = ma0Var8.b - 1;
            if (wrapEllipsisInfo2.getPlaceEllipsisOnLastContentLine()) {
                int i45 = ma0Var8.b - 1;
                ma0Var7.i(i44, Math.max(ma0Var7.b(i44), (int) (wrapEllipsisInfo2.m687getEllipsisSizeOO21N7I() & 4294967295L)));
                ma0Var8.i(i45, ma0Var8.c() + 1);
            } else {
                ma0Var7.e((int) (wrapEllipsisInfo2.m687getEllipsisSizeOO21N7I() & 4294967295L));
                ma0Var8.e(ma0Var8.c() + 1);
            }
        } else {
            na0Var = na0Var5;
        }
        int size = arrayList3.size();
        Placeable[] placeableArr = new Placeable[size];
        for (int i46 = 0; i46 < size; i46++) {
            placeableArr[i46] = na0Var.b(i46);
        }
        int i47 = ma0Var8.b;
        int[] iArr3 = new int[i47];
        int[] iArr4 = new int[i47];
        int[] iArr5 = ma0Var8.a;
        int i48 = i43;
        int i49 = 0;
        int i50 = 0;
        int i51 = 0;
        while (i50 < i47) {
            int i52 = iArr5[i50];
            int b = ma0Var7.b(i50);
            if (!oa0Var4.a(i50)) {
                i7 = Integer.MAX_VALUE;
                if (Constraints.m7563getMaxHeightimpl(m729constructorimpl) != Integer.MAX_VALUE) {
                    b = Constraints.m7563getMaxHeightimpl(m729constructorimpl) - i51;
                }
                ma0 ma0Var9 = ma0Var7;
                int i53 = i49;
                int m7565getMinHeightimpl = Constraints.m7565getMinHeightimpl(m729constructorimpl);
                int m7564getMaxWidthimpl2 = Constraints.m7564getMaxWidthimpl(m729constructorimpl);
                ArrayList arrayList4 = arrayList3;
                int[] iArr6 = iArr5;
                oa0 oa0Var5 = oa0Var4;
                int i54 = i19;
                int i55 = i48;
                MeasureResult measure = RowColumnMeasurePolicyKt.measure(flowLineMeasurePolicy3, i55, m7565getMinHeightimpl, m7564getMaxWidthimpl2, i7, i54, measureScope3, arrayList4, placeableArr, i53, i52, iArr3, i50);
                if (flowLineMeasurePolicy.isHorizontal()) {
                    height = measure.getHeight();
                    width = measure.getWidth();
                } else {
                    height = measure.getWidth();
                    width = measure.getHeight();
                }
                iArr4[i50] = width;
                i51 += width;
                i48 = Math.max(i55, height);
                mutableVector.add(measure);
                i50++;
                i49 = i52;
                iArr5 = iArr6;
                i19 = i54;
                oa0Var4 = oa0Var5;
                ma0Var7 = ma0Var9;
                measureScope3 = measureScope;
                arrayList3 = arrayList4;
                flowLineMeasurePolicy3 = flowLineMeasurePolicy;
            }
            i7 = b;
            ma0 ma0Var92 = ma0Var7;
            int i532 = i49;
            int m7565getMinHeightimpl2 = Constraints.m7565getMinHeightimpl(m729constructorimpl);
            int m7564getMaxWidthimpl22 = Constraints.m7564getMaxWidthimpl(m729constructorimpl);
            ArrayList arrayList42 = arrayList3;
            int[] iArr62 = iArr5;
            oa0 oa0Var52 = oa0Var4;
            int i542 = i19;
            int i552 = i48;
            MeasureResult measure2 = RowColumnMeasurePolicyKt.measure(flowLineMeasurePolicy3, i552, m7565getMinHeightimpl2, m7564getMaxWidthimpl22, i7, i542, measureScope3, arrayList42, placeableArr, i532, i52, iArr3, i50);
            if (flowLineMeasurePolicy.isHorizontal()) {
            }
            iArr4[i50] = width;
            i51 += width;
            i48 = Math.max(i552, height);
            mutableVector.add(measure2);
            i50++;
            i49 = i52;
            iArr5 = iArr62;
            i19 = i542;
            oa0Var4 = oa0Var52;
            ma0Var7 = ma0Var92;
            measureScope3 = measureScope;
            arrayList3 = arrayList42;
            flowLineMeasurePolicy3 = flowLineMeasurePolicy;
        }
        MutableVector mutableVector3 = mutableVector;
        int i56 = i48;
        if (mutableVector3.getSize() == 0) {
            i5 = 0;
            i6 = 0;
            measureScope2 = measureScope;
            flowLineMeasurePolicy2 = flowLineMeasurePolicy;
            j2 = j;
            iArr = iArr3;
            iArr2 = iArr4;
        } else {
            i5 = i56;
            i6 = i51;
            measureScope2 = measureScope;
            flowLineMeasurePolicy2 = flowLineMeasurePolicy;
            iArr = iArr3;
            iArr2 = iArr4;
            j2 = j;
        }
        return m690placeHelperBmaY500(measureScope2, j2, i5, i6, iArr2, mutableVector3, flowLineMeasurePolicy2, iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 breakDownItems_di9J0FM$lambda$0$0(ji0 ji0Var, Placeable placeable) {
        ji0Var.d = placeable;
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 breakDownItems_di9J0FM$lambda$2$0(ji0 ji0Var, Placeable placeable) {
        ji0Var.d = placeable;
        return w01.a;
    }

    public static final MeasurePolicy columnMeasurementHelper(Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, int i, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2013098357, i2, -1, "androidx.compose.foundation.layout.columnMeasurementHelper (FlowLayout.kt:500)");
        }
        boolean z = ((((i2 & 14) ^ 6) > 4 && composer.changed(vertical)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.changed(horizontal)) || (i2 & 48) == 32) | ((((i2 & 896) ^ 384) > 256 && composer.changed(i)) || (i2 & 384) == 256);
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            final FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(false, horizontal, vertical, vertical.mo653getSpacingD9Ej5fM(), CROSS_AXIS_ALIGNMENT_START, horizontal.mo653getSpacingD9Ej5fM(), i, Integer.MAX_VALUE, FlowRowOverflow.Companion.getVisible().createOverflowState$foundation_layout(), null);
            rememberedValue = new MeasurePolicy() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$columnMeasurementHelper$1$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                    return FlowMeasurePolicy.this.mo709measure3p2s80s(measureScope, y80.D(list), j);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return measurePolicy;
    }

    public static final MultiContentMeasurePolicy columnMeasurementMultiContentHelper(Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, Alignment.Horizontal horizontal2, int i, int i2, FlowLayoutOverflowState flowLayoutOverflowState, Composer composer, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-308635847, i3, -1, "androidx.compose.foundation.layout.columnMeasurementMultiContentHelper (FlowLayout.kt:528)");
        }
        boolean changed = ((((i3 & 14) ^ 6) > 4 && composer.changed(vertical)) || (i3 & 6) == 4) | ((((i3 & 112) ^ 48) > 32 && composer.changed(horizontal)) || (i3 & 48) == 32) | ((((i3 & 896) ^ 384) > 256 && composer.changed(horizontal2)) || (i3 & 384) == 256) | ((((i3 & 7168) ^ 3072) > 2048 && composer.changed(i)) || (i3 & 3072) == 2048) | ((((57344 & i3) ^ 24576) > 16384 && composer.changed(i2)) || (i3 & 24576) == 16384) | composer.changed(flowLayoutOverflowState);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(false, horizontal, vertical, vertical.mo653getSpacingD9Ej5fM(), CrossAxisAlignment.Companion.horizontal$foundation_layout(horizontal2), horizontal.mo653getSpacingD9Ej5fM(), i, i2, flowLayoutOverflowState, null);
            composer.updateRememberedValue(flowMeasurePolicy);
            rememberedValue = flowMeasurePolicy;
        }
        FlowMeasurePolicy flowMeasurePolicy2 = (FlowMeasurePolicy) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return flowMeasurePolicy2;
    }

    public static final int crossAxisMin(IntrinsicMeasurable intrinsicMeasurable, boolean z, int i) {
        return z ? intrinsicMeasurable.minIntrinsicHeight(i) : intrinsicMeasurable.minIntrinsicWidth(i);
    }

    public static final CrossAxisAlignment getCROSS_AXIS_ALIGNMENT_START() {
        return CROSS_AXIS_ALIGNMENT_START;
    }

    public static final CrossAxisAlignment getCROSS_AXIS_ALIGNMENT_TOP() {
        return CROSS_AXIS_ALIGNMENT_TOP;
    }

    private static final long intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, ny nyVar, ny nyVar2, int i, int i2, int i3, int i4, int i5, FlowLayoutOverflowState flowLayoutOverflowState) {
        int i6;
        long j;
        int i7;
        int i8;
        c10 c10Var;
        if (list.isEmpty()) {
            return c10.a(0, 0);
        }
        int i9 = Integer.MAX_VALUE;
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i4, flowLayoutOverflowState, OrientationIndependentConstraints.m729constructorimpl(0, i, 0, Integer.MAX_VALUE), i5, i2, i3, null);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) yi.r0(list, 0);
        int intValue = intrinsicMeasurable != null ? ((Number) nyVar2.invoke(intrinsicMeasurable, 0, Integer.valueOf(i))).intValue() : 0;
        int intValue2 = intrinsicMeasurable != null ? ((Number) nyVar.invoke(intrinsicMeasurable, 0, Integer.valueOf(intValue))).intValue() : 0;
        int i10 = 0;
        long j2 = 4294967295L;
        if (flowLayoutBuildingBlocks.m686getWrapInfoOpUlnko(list.size() > 1, 0, c10.a(i, Integer.MAX_VALUE), intrinsicMeasurable == null ? null : new c10(c10.a(intValue2, intValue)), 0, 0, 0, false, false).isLastItemInContainer()) {
            c10 m691ellipsisSizeF35zmw$foundation_layout = flowLayoutOverflowState.m691ellipsisSizeF35zmw$foundation_layout(intrinsicMeasurable != null, 0, 0);
            return c10.a(m691ellipsisSizeF35zmw$foundation_layout != null ? (int) (m691ellipsisSizeF35zmw$foundation_layout.a & 4294967295L) : 0, 0);
        }
        int size = list.size();
        int i11 = i;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (i12 >= size) {
                i6 = i13;
                break;
            }
            int i17 = i11 - intValue2;
            int i18 = i12 + 1;
            int max = Math.max(i16, intValue);
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) yi.r0(list, i18);
            int intValue3 = intrinsicMeasurable2 != null ? ((Number) nyVar2.invoke(intrinsicMeasurable2, Integer.valueOf(i18), Integer.valueOf(i))).intValue() : 0;
            if (intrinsicMeasurable2 != null) {
                j = j2;
                i7 = ((Number) nyVar.invoke(intrinsicMeasurable2, Integer.valueOf(i18), Integer.valueOf(intValue3))).intValue() + i2;
            } else {
                j = j2;
                i7 = 0;
            }
            boolean z = i12 + 2 < list.size();
            int i19 = i18 - i14;
            i6 = i18;
            int i20 = i15;
            long a = c10.a(i17, i9);
            if (intrinsicMeasurable2 == null) {
                i8 = size;
                c10Var = null;
            } else {
                i8 = size;
                c10Var = new c10(c10.a(i7, intValue3));
            }
            FlowLayoutBuildingBlocks.WrapInfo m686getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m686getWrapInfoOpUlnko(z, i19, a, c10Var, i20, i10, max, false, false);
            if (m686getWrapInfoOpUlnko.isLastItemInLine()) {
                int i21 = max + i3 + i10;
                FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(m686getWrapInfoOpUlnko, intrinsicMeasurable2 != null, i20, i21, i17, i19);
                int i22 = i7 - i2;
                i15 = i20 + 1;
                if (m686getWrapInfoOpUlnko.isLastItemInContainer()) {
                    if (wrapEllipsisInfo != null) {
                        long m687getEllipsisSizeOO21N7I = wrapEllipsisInfo.m687getEllipsisSizeOO21N7I();
                        if (!wrapEllipsisInfo.getPlaceEllipsisOnLastContentLine()) {
                            i21 = ((int) (m687getEllipsisSizeOO21N7I & j)) + i3 + i21;
                        }
                    }
                    i10 = i21;
                } else {
                    i11 = i;
                    intValue2 = i22;
                    i14 = i6;
                    i10 = i21;
                    i16 = 0;
                }
            } else {
                intValue2 = i7;
                i11 = i17;
                i15 = i20;
                i16 = max;
            }
            size = i8;
            intValue = intValue3;
            i12 = i6;
            i13 = i12;
            j2 = j;
            i9 = Integer.MAX_VALUE;
        }
        return c10.a(i10 - i3, i6);
    }

    public static final int mainAxisMin(IntrinsicMeasurable intrinsicMeasurable, boolean z, int i) {
        return z ? intrinsicMeasurable.minIntrinsicWidth(i) : intrinsicMeasurable.minIntrinsicHeight(i);
    }

    private static final int maxIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, ny nyVar, int i, int i2, int i3) {
        int size = list.size();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i4 < size) {
            int intValue = ((Number) nyVar.invoke(list.get(i4), Integer.valueOf(i4), Integer.valueOf(i))).intValue() + i2;
            int i8 = i4 + 1;
            if (i8 - i6 == i3 || i8 == list.size()) {
                i5 = Math.max(i5, (i7 + intValue) - i2);
                i7 = 0;
                i6 = i4;
            } else {
                i7 += intValue;
            }
            i4 = i8;
        }
        return i5;
    }

    /* renamed from: measureAndCache-rqJ1uqs, reason: not valid java name */
    public static final long m689measureAndCacherqJ1uqs(Measurable measurable, FlowLineMeasurePolicy flowLineMeasurePolicy, long j, ky kyVar) {
        FlowLayoutData flowLayoutData;
        if (RowColumnImplKt.getWeight(RowColumnImplKt.getRowColumnParentData(measurable)) == 0.0f) {
            RowColumnParentData rowColumnParentData = RowColumnImplKt.getRowColumnParentData(measurable);
            if (((rowColumnParentData == null || (flowLayoutData = rowColumnParentData.getFlowLayoutData()) == null) ? null : Float.valueOf(flowLayoutData.getFillCrossAxisFraction())) == null) {
                Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(j);
                kyVar.invoke(mo6234measureBRTryo0);
                return c10.a(flowLineMeasurePolicy.mainAxisSize(mo6234measureBRTryo0), flowLineMeasurePolicy.crossAxisSize(mo6234measureBRTryo0));
            }
        }
        int mainAxisMin = mainAxisMin(measurable, flowLineMeasurePolicy.isHorizontal(), Integer.MAX_VALUE);
        return c10.a(mainAxisMin, crossAxisMin(measurable, flowLineMeasurePolicy.isHorizontal(), mainAxisMin));
    }

    private static final int minIntrinsicMainAxisSize(List<? extends IntrinsicMeasurable> list, ny nyVar, ny nyVar2, int i, int i2, int i3, int i4, int i5, FlowLayoutOverflowState flowLayoutOverflowState) {
        int i6 = i4;
        int i7 = i5;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int[] iArr = new int[size];
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        int size3 = list.size();
        for (int i8 = 0; i8 < size3; i8++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i8);
            int intValue = ((Number) nyVar.invoke(intrinsicMeasurable, Integer.valueOf(i8), Integer.valueOf(i))).intValue();
            iArr[i8] = intValue;
            iArr2[i8] = ((Number) nyVar2.invoke(intrinsicMeasurable, Integer.valueOf(i8), Integer.valueOf(intValue))).intValue();
        }
        List<? extends IntrinsicMeasurable> list2 = list;
        int i9 = Integer.MAX_VALUE;
        if (i7 != Integer.MAX_VALUE && i6 != Integer.MAX_VALUE) {
            i9 = i6 * i7;
        }
        int i10 = 1;
        int min = Math.min(i9 - (((i9 >= list2.size() || !(flowLayoutOverflowState.getType$foundation_layout() == FlowLayoutOverflow.OverflowType.ExpandIndicator || flowLayoutOverflowState.getType$foundation_layout() == FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) && (i9 < list2.size() || i7 < flowLayoutOverflowState.getMinLinesToShowCollapse$foundation_layout() || flowLayoutOverflowState.getType$foundation_layout() != FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator)) ? 0 : 1), list2.size());
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += iArr[i12];
        }
        int size4 = ((list2.size() - 1) * i2) + i11;
        if (size2 == 0) {
            o.q();
            return 0;
        }
        int i13 = iArr2[0];
        int i14 = size2 - 1;
        if (1 <= i14) {
            int i15 = 1;
            while (true) {
                int i16 = iArr2[i15];
                if (i13 < i16) {
                    i13 = i16;
                }
                if (i15 == i14) {
                    break;
                }
                i15++;
            }
        }
        if (size == 0) {
            o.q();
            return 0;
        }
        int i17 = iArr[0];
        int i18 = size - 1;
        if (1 <= i18) {
            while (true) {
                int i19 = iArr[i10];
                if (i17 < i19) {
                    i17 = i19;
                }
                if (i10 == i18) {
                    break;
                }
                i10++;
            }
        }
        int i20 = i17;
        int i21 = size4;
        while (i20 <= i21 && i13 != i) {
            int i22 = (i20 + i21) / 2;
            long intrinsicCrossAxisSize = intrinsicCrossAxisSize(list2, iArr, iArr2, i22, i2, i3, i6, i7, flowLayoutOverflowState);
            i13 = (int) (intrinsicCrossAxisSize >> 32);
            int i23 = (int) (4294967295L & intrinsicCrossAxisSize);
            if (i13 > i || i23 < min) {
                i20 = i22 + 1;
                if (i20 > i21) {
                    return i20;
                }
            } else {
                if (i13 >= i) {
                    return i22;
                }
                i21 = i22 - 1;
            }
            list2 = list;
            i6 = i4;
            i7 = i5;
            size4 = i22;
        }
        return size4;
    }

    /* renamed from: placeHelper-BmaY500, reason: not valid java name */
    public static final MeasureResult m690placeHelperBmaY500(MeasureScope measureScope, long j, int i, int i2, int[] iArr, MutableVector<MeasureResult> mutableVector, FlowLineMeasurePolicy flowLineMeasurePolicy, int[] iArr2) {
        int i3;
        int i4;
        int i5;
        boolean isHorizontal = flowLineMeasurePolicy.isHorizontal();
        Arrangement.Vertical verticalArrangement = flowLineMeasurePolicy.getVerticalArrangement();
        Arrangement.Horizontal horizontalArrangement = flowLineMeasurePolicy.getHorizontalArrangement();
        if (isHorizontal) {
            int size = ((mutableVector.getSize() - 1) * measureScope.mo361roundToPx0680j_4(verticalArrangement.mo653getSpacingD9Ej5fM())) + i2;
            int m7565getMinHeightimpl = Constraints.m7565getMinHeightimpl(j);
            i3 = Constraints.m7563getMaxHeightimpl(j);
            if (size < m7565getMinHeightimpl) {
                size = m7565getMinHeightimpl;
            }
            if (size <= i3) {
                i3 = size;
            }
            verticalArrangement.arrange(measureScope, i3, iArr, iArr2);
        } else {
            int size2 = ((mutableVector.getSize() - 1) * measureScope.mo361roundToPx0680j_4(horizontalArrangement.mo653getSpacingD9Ej5fM())) + i2;
            int m7565getMinHeightimpl2 = Constraints.m7565getMinHeightimpl(j);
            int m7563getMaxHeightimpl = Constraints.m7563getMaxHeightimpl(j);
            if (size2 < m7565getMinHeightimpl2) {
                size2 = m7565getMinHeightimpl2;
            }
            int i6 = size2 > m7563getMaxHeightimpl ? m7563getMaxHeightimpl : size2;
            horizontalArrangement.arrange(measureScope, i6, iArr, measureScope.getLayoutDirection(), iArr2);
            i3 = i6;
        }
        int m7566getMinWidthimpl = Constraints.m7566getMinWidthimpl(j);
        int m7564getMaxWidthimpl = Constraints.m7564getMaxWidthimpl(j);
        if (i < m7566getMinWidthimpl) {
            i = m7566getMinWidthimpl;
        }
        if (i <= m7564getMaxWidthimpl) {
            m7564getMaxWidthimpl = i;
        }
        if (isHorizontal) {
            i5 = m7564getMaxWidthimpl;
            i4 = i3;
        } else {
            i4 = m7564getMaxWidthimpl;
            i5 = i3;
        }
        return MeasureScope.layout$default(measureScope, i5, i4, null, new defpackage.h(mutableVector, 18), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 placeHelper_BmaY500$lambda$2(MutableVector mutableVector, Placeable.PlacementScope placementScope) {
        Object[] objArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            ((MeasureResult) objArr[i]).placeChildren();
        }
        return w01.a;
    }

    public static final MeasurePolicy rowMeasurementHelper(Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, int i, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1479255111, i2, -1, "androidx.compose.foundation.layout.rowMeasurementHelper (FlowLayout.kt:439)");
        }
        boolean z = ((((i2 & 14) ^ 6) > 4 && composer.changed(horizontal)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.changed(vertical)) || (i2 & 48) == 32) | ((((i2 & 896) ^ 384) > 256 && composer.changed(i)) || (i2 & 384) == 256);
        Object rememberedValue = composer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            final FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(true, horizontal, vertical, horizontal.mo653getSpacingD9Ej5fM(), CROSS_AXIS_ALIGNMENT_TOP, vertical.mo653getSpacingD9Ej5fM(), i, Integer.MAX_VALUE, FlowRowOverflow.Companion.getVisible().createOverflowState$foundation_layout(), null);
            rememberedValue = new MeasurePolicy() { // from class: androidx.compose.foundation.layout.FlowLayoutKt$rowMeasurementHelper$1$1
                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo5measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                    return MultiContentMeasurePolicy.this.mo709measure3p2s80s(measureScope, y80.D(list), j);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return measurePolicy;
    }

    public static final MultiContentMeasurePolicy rowMeasurementMultiContentHelper(Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, int i, int i2, FlowLayoutOverflowState flowLayoutOverflowState, Composer composer, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2010142641, i3, -1, "androidx.compose.foundation.layout.rowMeasurementMultiContentHelper (FlowLayout.kt:470)");
        }
        boolean changed = ((((i3 & 14) ^ 6) > 4 && composer.changed(horizontal)) || (i3 & 6) == 4) | ((((i3 & 112) ^ 48) > 32 && composer.changed(vertical)) || (i3 & 48) == 32) | ((((i3 & 896) ^ 384) > 256 && composer.changed(vertical2)) || (i3 & 384) == 256) | ((((i3 & 7168) ^ 3072) > 2048 && composer.changed(i)) || (i3 & 3072) == 2048) | ((((57344 & i3) ^ 24576) > 16384 && composer.changed(i2)) || (i3 & 24576) == 16384) | composer.changed(flowLayoutOverflowState);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            FlowMeasurePolicy flowMeasurePolicy = new FlowMeasurePolicy(true, horizontal, vertical, horizontal.mo653getSpacingD9Ej5fM(), CrossAxisAlignment.Companion.vertical$foundation_layout(vertical2), vertical.mo653getSpacingD9Ej5fM(), i, i2, flowLayoutOverflowState, null);
            composer.updateRememberedValue(flowMeasurePolicy);
            rememberedValue = flowMeasurePolicy;
        }
        FlowMeasurePolicy flowMeasurePolicy2 = (FlowMeasurePolicy) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return flowMeasurePolicy2;
    }

    private static final Measurable safeNext(Iterator<? extends Measurable> it, FlowLineInfo flowLineInfo) {
        try {
            if (!(it instanceof ContextualFlowItemIterator)) {
                return it.next();
            }
            flowLineInfo.getClass();
            return ((ContextualFlowItemIterator) it).getNext$foundation_layout(flowLineInfo);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final long intrinsicCrossAxisSize(List<? extends IntrinsicMeasurable> list, int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5, FlowLayoutOverflowState flowLayoutOverflowState) {
        int i6 = 0;
        if (list.isEmpty()) {
            return c10.a(0, 0);
        }
        int i7 = Integer.MAX_VALUE;
        FlowLayoutBuildingBlocks flowLayoutBuildingBlocks = new FlowLayoutBuildingBlocks(i4, flowLayoutOverflowState, OrientationIndependentConstraints.m729constructorimpl(0, i, 0, Integer.MAX_VALUE), i5, i2, i3, null);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) yi.r0(list, 0);
        int i8 = intrinsicMeasurable != null ? iArr2[0] : 0;
        int i9 = intrinsicMeasurable != null ? iArr[0] : 0;
        int i10 = 0;
        if (flowLayoutBuildingBlocks.m686getWrapInfoOpUlnko(list.size() > 1, 0, c10.a(i, Integer.MAX_VALUE), intrinsicMeasurable == null ? null : new c10(c10.a(i9, i8)), 0, 0, 0, false, false).isLastItemInContainer()) {
            c10 m691ellipsisSizeF35zmw$foundation_layout = flowLayoutOverflowState.m691ellipsisSizeF35zmw$foundation_layout(intrinsicMeasurable != null, 0, 0);
            return c10.a(m691ellipsisSizeF35zmw$foundation_layout != null ? (int) (m691ellipsisSizeF35zmw$foundation_layout.a & 4294967295L) : 0, 0);
        }
        int size = list.size();
        int i11 = i;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (i12 >= size) {
                break;
            }
            int i17 = i11 - i9;
            int i18 = i12 + 1;
            int max = Math.max(i16, i8);
            IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) yi.r0(list, i18);
            int i19 = intrinsicMeasurable2 != null ? iArr2[i18] : i6;
            int i20 = intrinsicMeasurable2 != null ? iArr[i18] + i2 : i6;
            int i21 = i18 - i14;
            boolean z = i12 + 2 < list.size() ? 1 : i6;
            int i22 = i15;
            int i23 = i19;
            int i24 = i20;
            FlowLayoutBuildingBlocks.WrapInfo m686getWrapInfoOpUlnko = flowLayoutBuildingBlocks.m686getWrapInfoOpUlnko(z, i21, c10.a(i17, i7), intrinsicMeasurable2 == null ? null : new c10(c10.a(i20, i19)), i22, i10, max, false, false);
            if (m686getWrapInfoOpUlnko.isLastItemInLine()) {
                int i25 = max + i3 + i10;
                FlowLayoutBuildingBlocks.WrapEllipsisInfo wrapEllipsisInfo = flowLayoutBuildingBlocks.getWrapEllipsisInfo(m686getWrapInfoOpUlnko, intrinsicMeasurable2 != null, i22, i25, i17, i21);
                int i26 = i24 - i2;
                i15 = i22 + 1;
                if (m686getWrapInfoOpUlnko.isLastItemInContainer()) {
                    if (wrapEllipsisInfo != null) {
                        long m687getEllipsisSizeOO21N7I = wrapEllipsisInfo.m687getEllipsisSizeOO21N7I();
                        if (!wrapEllipsisInfo.getPlaceEllipsisOnLastContentLine()) {
                            i25 += ((int) (m687getEllipsisSizeOO21N7I & 4294967295L)) + i3;
                        }
                    }
                    i10 = i25;
                    i13 = i18;
                } else {
                    i14 = i18;
                    i10 = i25;
                    i9 = i26;
                    i16 = 0;
                    i11 = i;
                }
            } else {
                i9 = i24;
                i11 = i17;
                i15 = i22;
                i16 = max;
            }
            i12 = i18;
            i13 = i12;
            i8 = i23;
            i7 = Integer.MAX_VALUE;
            i6 = 0;
        }
        return c10.a(i10 - i3, i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FlowRow(Modifier modifier, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, int i, int i2, ny nyVar, Composer composer, int i3, int i4) {
        Modifier modifier2;
        int i5;
        Arrangement.Horizontal horizontal2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer composer2;
        Alignment.Vertical vertical3;
        Modifier modifier3;
        Arrangement.Horizontal horizontal3;
        int i12;
        Arrangement.Vertical vertical4;
        ScopeUpdateScope endRestartGroup;
        int i13;
        Arrangement.Horizontal horizontal4;
        int i14;
        Alignment.Vertical vertical5;
        Composer startRestartGroup = composer.startRestartGroup(-1303174015);
        int i15 = i4 & 1;
        if (i15 != 0) {
            i5 = i3 | 6;
            modifier2 = modifier;
        } else if ((i3 & 6) == 0) {
            modifier2 = modifier;
            i5 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i3;
        } else {
            modifier2 = modifier;
            i5 = i3;
        }
        int i16 = i4 & 2;
        if (i16 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            horizontal2 = horizontal;
            i5 |= startRestartGroup.changed(horizontal2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 384) == 0) {
                i5 |= startRestartGroup.changed(vertical) ? Fields.RotationX : Fields.SpotShadowColor;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    i5 |= startRestartGroup.changed(vertical2) ? Fields.CameraDistance : Fields.RotationZ;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i3 & 24576) == 0) {
                        i9 = i;
                        i5 |= startRestartGroup.changed(i9) ? Fields.Clip : 8192;
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= 196608;
                        } else if ((196608 & i3) == 0) {
                            i11 = i2;
                            i5 |= startRestartGroup.changed(i11) ? Fields.RenderEffect : 65536;
                            if ((i3 & 1572864) == 0) {
                                i5 |= startRestartGroup.changedInstance(nyVar) ? 1048576 : Fields.BlendMode;
                            }
                            if (!startRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
                                Modifier modifier4 = i15 != 0 ? Modifier.Companion : modifier2;
                                if (i16 != 0) {
                                    horizontal4 = Arrangement.INSTANCE.getStart();
                                    i13 = i7;
                                } else {
                                    i13 = i7;
                                    horizontal4 = horizontal2;
                                }
                                Arrangement.Vertical top = i6 != 0 ? Arrangement.INSTANCE.getTop() : vertical;
                                if (i13 != 0) {
                                    vertical5 = Alignment.Companion.getTop();
                                    i14 = i8;
                                } else {
                                    i14 = i8;
                                    vertical5 = vertical2;
                                }
                                if (i14 != 0) {
                                    i9 = Integer.MAX_VALUE;
                                }
                                int i17 = i10 != 0 ? Integer.MAX_VALUE : i11;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1303174015, i5, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                                }
                                composer2 = startRestartGroup;
                                FlowRow(modifier4, horizontal4, top, vertical5, i9, i17, FlowRowOverflow.Companion.getClip(), nyVar, composer2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                horizontal3 = horizontal4;
                                vertical4 = top;
                                vertical3 = vertical5;
                                i12 = i17;
                            } else {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                vertical3 = vertical2;
                                modifier3 = modifier2;
                                horizontal3 = horizontal2;
                                i12 = i11;
                                vertical4 = vertical;
                            }
                            int i18 = i9;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new jx(modifier3, horizontal3, vertical4, vertical3, i18, i12, nyVar, i3, i4));
                                return;
                            }
                            return;
                        }
                        i11 = i2;
                        if ((i3 & 1572864) == 0) {
                        }
                        if (!startRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
                        }
                        int i182 = i9;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i2;
                    if ((i3 & 1572864) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
                    }
                    int i1822 = i9;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                i11 = i2;
                if ((i3 & 1572864) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
                }
                int i18222 = i9;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
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
            i11 = i2;
            if ((i3 & 1572864) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
            }
            int i182222 = i9;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        horizontal2 = horizontal;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
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
        i11 = i2;
        if ((i3 & 1572864) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
        }
        int i1822222 = i9;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FlowColumn(Modifier modifier, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, Alignment.Horizontal horizontal2, int i, int i2, ny nyVar, Composer composer, int i3, int i4) {
        Modifier modifier2;
        int i5;
        Arrangement.Vertical vertical2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer composer2;
        Alignment.Horizontal horizontal3;
        Modifier modifier3;
        Arrangement.Vertical vertical3;
        int i12;
        Arrangement.Horizontal horizontal4;
        ScopeUpdateScope endRestartGroup;
        int i13;
        Arrangement.Vertical vertical4;
        int i14;
        Alignment.Horizontal horizontal5;
        Composer startRestartGroup = composer.startRestartGroup(1371845627);
        int i15 = i4 & 1;
        if (i15 != 0) {
            i5 = i3 | 6;
            modifier2 = modifier;
        } else if ((i3 & 6) == 0) {
            modifier2 = modifier;
            i5 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i3;
        } else {
            modifier2 = modifier;
            i5 = i3;
        }
        int i16 = i4 & 2;
        if (i16 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            vertical2 = vertical;
            i5 |= startRestartGroup.changed(vertical2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 384) == 0) {
                i5 |= startRestartGroup.changed(horizontal) ? Fields.RotationX : Fields.SpotShadowColor;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 3072) == 0) {
                    i5 |= startRestartGroup.changed(horizontal2) ? Fields.CameraDistance : Fields.RotationZ;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i3 & 24576) == 0) {
                        i9 = i;
                        i5 |= startRestartGroup.changed(i9) ? Fields.Clip : 8192;
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= 196608;
                        } else if ((196608 & i3) == 0) {
                            i11 = i2;
                            i5 |= startRestartGroup.changed(i11) ? Fields.RenderEffect : 65536;
                            if ((i3 & 1572864) == 0) {
                                i5 |= startRestartGroup.changedInstance(nyVar) ? 1048576 : Fields.BlendMode;
                            }
                            if (!startRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
                                Modifier modifier4 = i15 != 0 ? Modifier.Companion : modifier2;
                                if (i16 != 0) {
                                    vertical4 = Arrangement.INSTANCE.getTop();
                                    i13 = i7;
                                } else {
                                    i13 = i7;
                                    vertical4 = vertical2;
                                }
                                Arrangement.Horizontal start = i6 != 0 ? Arrangement.INSTANCE.getStart() : horizontal;
                                if (i13 != 0) {
                                    horizontal5 = Alignment.Companion.getStart();
                                    i14 = i8;
                                } else {
                                    i14 = i8;
                                    horizontal5 = horizontal2;
                                }
                                if (i14 != 0) {
                                    i9 = Integer.MAX_VALUE;
                                }
                                int i17 = i10 != 0 ? Integer.MAX_VALUE : i11;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1371845627, i5, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:271)");
                                }
                                composer2 = startRestartGroup;
                                FlowColumn(modifier4, vertical4, start, horizontal5, i9, i17, FlowColumnOverflow.Companion.getClip(), nyVar, composer2, (i5 & 14) | 1572864 | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier4;
                                vertical3 = vertical4;
                                horizontal4 = start;
                                horizontal3 = horizontal5;
                                i12 = i17;
                            } else {
                                composer2 = startRestartGroup;
                                composer2.skipToGroupEnd();
                                horizontal3 = horizontal2;
                                modifier3 = modifier2;
                                vertical3 = vertical2;
                                i12 = i11;
                                horizontal4 = horizontal;
                            }
                            int i18 = i9;
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new jx(modifier3, vertical3, horizontal4, horizontal3, i18, i12, nyVar, i3, i4));
                                return;
                            }
                            return;
                        }
                        i11 = i2;
                        if ((i3 & 1572864) == 0) {
                        }
                        if (!startRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
                        }
                        int i182 = i9;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    i11 = i2;
                    if ((i3 & 1572864) == 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
                    }
                    int i1822 = i9;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                i11 = i2;
                if ((i3 & 1572864) == 0) {
                }
                if (!startRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
                }
                int i18222 = i9;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
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
            i11 = i2;
            if ((i3 & 1572864) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
            }
            int i182222 = i9;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        vertical2 = vertical;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
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
        i11 = i2;
        if ((i3 & 1572864) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i5 & 599187) == 599186, i5 & 1)) {
        }
        int i1822222 = i9;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
