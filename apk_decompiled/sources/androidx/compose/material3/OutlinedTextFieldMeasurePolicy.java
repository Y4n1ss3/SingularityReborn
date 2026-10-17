package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.TextFieldLabelPosition;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.internal.LayoutUtilKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import defpackage.dq;
import defpackage.ji0;
import defpackage.k4;
import defpackage.ky;
import defpackage.my;
import defpackage.p01;
import defpackage.q10;
import defpackage.w01;
import defpackage.y80;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class OutlinedTextFieldMeasurePolicy implements MeasurePolicy {
    private final float horizontalIconPadding;
    private final TextFieldLabelPosition labelPosition;
    private final FloatProducer labelProgress;
    private final ky onLabelMeasured;
    private final PaddingValues paddingValues;
    private final boolean singleLine;

    private OutlinedTextFieldMeasurePolicy(ky kyVar, boolean z, TextFieldLabelPosition textFieldLabelPosition, FloatProducer floatProducer, PaddingValues paddingValues, float f) {
        this.onLabelMeasured = kyVar;
        this.singleLine = z;
        this.labelPosition = textFieldLabelPosition;
        this.labelProgress = floatProducer;
        this.paddingValues = paddingValues;
        this.horizontalIconPadding = f;
    }

    /* renamed from: calculateHeight-mKXJcVc, reason: not valid java name */
    private final int m2249calculateHeightmKXJcVc(Density density, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, boolean z, float f) {
        int u = p01.u(i5, i7, i3, i4, z ? 0 : MathHelpersKt.lerp(i6, 0, f));
        float mo367toPx0680j_4 = density.mo367toPx0680j_4(this.paddingValues.mo714calculateTopPaddingD9Ej5fM());
        if (!z) {
            mo367toPx0680j_4 = MathHelpersKt.lerp(mo367toPx0680j_4, Math.max(mo367toPx0680j_4, i6 / 2.0f), f);
        }
        float mo367toPx0680j_42 = mo367toPx0680j_4 + u + density.mo367toPx0680j_4(this.paddingValues.mo711calculateBottomPaddingD9Ej5fM());
        if (!z) {
            i6 = 0;
        }
        return ConstraintsKt.m7580constrainHeightK40F9xA(j, Math.max(i, Math.max(i2, y80.P(mo367toPx0680j_42))) + i6 + i8);
    }

    /* renamed from: calculateWidth-IzADHW4, reason: not valid java name */
    private final int m2250calculateWidthIzADHW4(Density density, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, float f) {
        int i8 = i3 + i4;
        int max = Math.max(i5 + i8, Math.max(i7 + i8, MathHelpersKt.lerp(i6, 0, f))) + i + i2;
        PaddingValues paddingValues = this.paddingValues;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        return ConstraintsKt.m7581constrainWidthK40F9xA(j, Math.max(max, y80.P((i6 + density.mo367toPx0680j_4(Dp.m7611constructorimpl(this.paddingValues.mo713calculateRightPaddingu2uoSUM(layoutDirection) + paddingValues.mo712calculateLeftPaddingu2uoSUM(layoutDirection)))) * f)));
    }

    private final int intrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i, my myVar) {
        IntrinsicMeasurable intrinsicMeasurable;
        int i2;
        int i3;
        IntrinsicMeasurable intrinsicMeasurable2;
        int i4;
        Object obj;
        IntrinsicMeasurable intrinsicMeasurable3;
        int i5;
        IntrinsicMeasurable intrinsicMeasurable4;
        int i6;
        Object obj2;
        Object obj3;
        int i7;
        int i8;
        OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = this;
        float invoke = outlinedTextFieldMeasurePolicy.labelProgress.invoke();
        int size = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                intrinsicMeasurable = null;
                break;
            }
            intrinsicMeasurable = list.get(i9);
            if (q10.b(LayoutUtilKt.getLayoutId(intrinsicMeasurable), TextFieldImplKt.LeadingId)) {
                break;
            }
            i9++;
        }
        IntrinsicMeasurable intrinsicMeasurable5 = intrinsicMeasurable;
        if (intrinsicMeasurable5 != null) {
            i2 = LayoutUtilKt.subtractConstraintSafely(i, intrinsicMeasurable5.maxIntrinsicWidth(Integer.MAX_VALUE));
            i3 = ((Number) myVar.invoke(intrinsicMeasurable5, Integer.valueOf(i))).intValue();
        } else {
            i2 = i;
            i3 = 0;
        }
        int size2 = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size2) {
                intrinsicMeasurable2 = null;
                break;
            }
            intrinsicMeasurable2 = list.get(i10);
            if (q10.b(LayoutUtilKt.getLayoutId(intrinsicMeasurable2), TextFieldImplKt.TrailingId)) {
                break;
            }
            i10++;
        }
        IntrinsicMeasurable intrinsicMeasurable6 = intrinsicMeasurable2;
        if (intrinsicMeasurable6 != null) {
            i2 = LayoutUtilKt.subtractConstraintSafely(i2, intrinsicMeasurable6.maxIntrinsicWidth(Integer.MAX_VALUE));
            i4 = ((Number) myVar.invoke(intrinsicMeasurable6, Integer.valueOf(i))).intValue();
        } else {
            i4 = 0;
        }
        int size3 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size3) {
                obj = null;
                break;
            }
            obj = list.get(i11);
            if (q10.b(LayoutUtilKt.getLayoutId((IntrinsicMeasurable) obj), TextFieldImplKt.LabelId)) {
                break;
            }
            i11++;
        }
        Object obj4 = (IntrinsicMeasurable) obj;
        int intValue = obj4 != null ? ((Number) myVar.invoke(obj4, Integer.valueOf(MathHelpersKt.lerp(i2, i, invoke)))).intValue() : 0;
        int size4 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size4) {
                intrinsicMeasurable3 = null;
                break;
            }
            intrinsicMeasurable3 = list.get(i12);
            if (q10.b(LayoutUtilKt.getLayoutId(intrinsicMeasurable3), TextFieldImplKt.PrefixId)) {
                break;
            }
            i12++;
        }
        IntrinsicMeasurable intrinsicMeasurable7 = intrinsicMeasurable3;
        if (intrinsicMeasurable7 != null) {
            i5 = ((Number) myVar.invoke(intrinsicMeasurable7, Integer.valueOf(i2))).intValue();
            i2 = LayoutUtilKt.subtractConstraintSafely(i2, intrinsicMeasurable7.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            i5 = 0;
        }
        int size5 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size5) {
                intrinsicMeasurable4 = null;
                break;
            }
            intrinsicMeasurable4 = list.get(i13);
            if (q10.b(LayoutUtilKt.getLayoutId(intrinsicMeasurable4), TextFieldImplKt.SuffixId)) {
                break;
            }
            i13++;
        }
        IntrinsicMeasurable intrinsicMeasurable8 = intrinsicMeasurable4;
        if (intrinsicMeasurable8 != null) {
            i6 = ((Number) myVar.invoke(intrinsicMeasurable8, Integer.valueOf(i2))).intValue();
            i2 = LayoutUtilKt.subtractConstraintSafely(i2, intrinsicMeasurable8.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            i6 = 0;
        }
        int size6 = list.size();
        int i14 = 0;
        while (i14 < size6) {
            Object obj5 = list.get(i14);
            if (q10.b(LayoutUtilKt.getLayoutId((IntrinsicMeasurable) obj5), TextFieldImplKt.TextFieldId)) {
                int intValue2 = ((Number) myVar.invoke(obj5, Integer.valueOf(i2))).intValue();
                int size7 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size7) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i15);
                    if (q10.b(LayoutUtilKt.getLayoutId((IntrinsicMeasurable) obj2), TextFieldImplKt.PlaceholderId)) {
                        break;
                    }
                    i15++;
                }
                Object obj6 = (IntrinsicMeasurable) obj2;
                int intValue3 = obj6 != null ? ((Number) myVar.invoke(obj6, Integer.valueOf(i2))).intValue() : 0;
                int size8 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size8) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i16);
                    if (q10.b(LayoutUtilKt.getLayoutId((IntrinsicMeasurable) obj3), TextFieldImplKt.SupportingId)) {
                        break;
                    }
                    i16++;
                }
                Object obj7 = (IntrinsicMeasurable) obj3;
                if (obj7 != null) {
                    i7 = i4;
                    i8 = ((Number) myVar.invoke(obj7, Integer.valueOf(i))).intValue();
                } else {
                    i7 = i4;
                    i8 = 0;
                }
                return outlinedTextFieldMeasurePolicy.m2249calculateHeightmKXJcVc(intrinsicMeasureScope, i3, i7, i5, i6, intValue2, intValue, intValue3, i8, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), outlinedTextFieldMeasurePolicy.labelPosition instanceof TextFieldLabelPosition.Above, invoke);
            }
            i14++;
            i6 = i6;
            i5 = i5;
            i3 = i3;
            outlinedTextFieldMeasurePolicy = this;
        }
        throw k4.m("Collection contains no element matching the predicate.");
    }

    private final int intrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i, my myVar) {
        IntrinsicMeasurable intrinsicMeasurable;
        IntrinsicMeasurable intrinsicMeasurable2;
        IntrinsicMeasurable intrinsicMeasurable3;
        IntrinsicMeasurable intrinsicMeasurable4;
        IntrinsicMeasurable intrinsicMeasurable5;
        IntrinsicMeasurable intrinsicMeasurable6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            IntrinsicMeasurable intrinsicMeasurable7 = list.get(i2);
            if (q10.b(LayoutUtilKt.getLayoutId(intrinsicMeasurable7), TextFieldImplKt.TextFieldId)) {
                int intValue = ((Number) myVar.invoke(intrinsicMeasurable7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    intrinsicMeasurable = null;
                    if (i3 >= size2) {
                        intrinsicMeasurable2 = null;
                        break;
                    }
                    intrinsicMeasurable2 = list.get(i3);
                    if (q10.b(LayoutUtilKt.getLayoutId(intrinsicMeasurable2), TextFieldImplKt.LabelId)) {
                        break;
                    }
                    i3++;
                }
                IntrinsicMeasurable intrinsicMeasurable8 = intrinsicMeasurable2;
                int intValue2 = intrinsicMeasurable8 != null ? ((Number) myVar.invoke(intrinsicMeasurable8, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        intrinsicMeasurable3 = null;
                        break;
                    }
                    intrinsicMeasurable3 = list.get(i4);
                    if (q10.b(LayoutUtilKt.getLayoutId(intrinsicMeasurable3), TextFieldImplKt.TrailingId)) {
                        break;
                    }
                    i4++;
                }
                IntrinsicMeasurable intrinsicMeasurable9 = intrinsicMeasurable3;
                int intValue3 = intrinsicMeasurable9 != null ? ((Number) myVar.invoke(intrinsicMeasurable9, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        intrinsicMeasurable4 = null;
                        break;
                    }
                    intrinsicMeasurable4 = list.get(i5);
                    if (q10.b(LayoutUtilKt.getLayoutId(intrinsicMeasurable4), TextFieldImplKt.LeadingId)) {
                        break;
                    }
                    i5++;
                }
                IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable4;
                int intValue4 = intrinsicMeasurable10 != null ? ((Number) myVar.invoke(intrinsicMeasurable10, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        intrinsicMeasurable5 = null;
                        break;
                    }
                    intrinsicMeasurable5 = list.get(i6);
                    if (q10.b(LayoutUtilKt.getLayoutId(intrinsicMeasurable5), TextFieldImplKt.PrefixId)) {
                        break;
                    }
                    i6++;
                }
                IntrinsicMeasurable intrinsicMeasurable11 = intrinsicMeasurable5;
                int intValue5 = intrinsicMeasurable11 != null ? ((Number) myVar.invoke(intrinsicMeasurable11, Integer.valueOf(i))).intValue() : 0;
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        intrinsicMeasurable6 = null;
                        break;
                    }
                    intrinsicMeasurable6 = list.get(i7);
                    if (q10.b(LayoutUtilKt.getLayoutId(intrinsicMeasurable6), TextFieldImplKt.SuffixId)) {
                        break;
                    }
                    i7++;
                }
                IntrinsicMeasurable intrinsicMeasurable12 = intrinsicMeasurable6;
                int intValue6 = intrinsicMeasurable12 != null ? ((Number) myVar.invoke(intrinsicMeasurable12, Integer.valueOf(i))).intValue() : 0;
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        break;
                    }
                    IntrinsicMeasurable intrinsicMeasurable13 = list.get(i8);
                    if (q10.b(LayoutUtilKt.getLayoutId(intrinsicMeasurable13), TextFieldImplKt.PlaceholderId)) {
                        intrinsicMeasurable = intrinsicMeasurable13;
                        break;
                    }
                    i8++;
                }
                IntrinsicMeasurable intrinsicMeasurable14 = intrinsicMeasurable;
                return m2250calculateWidthIzADHW4(intrinsicMeasureScope, intValue4, intValue3, intValue5, intValue6, intValue, intValue2, intrinsicMeasurable14 != null ? ((Number) myVar.invoke(intrinsicMeasurable14, Integer.valueOf(i))).intValue() : 0, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), this.labelProgress.invoke());
            }
        }
        throw k4.m("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$11(OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, ji0 ji0Var, Placeable placeable6, Placeable placeable7, Placeable placeable8, MeasureScope measureScope, boolean z, float f, Placeable.PlacementScope placementScope) {
        outlinedTextFieldMeasurePolicy.place(placementScope, i, i2, placeable, placeable2, placeable3, placeable4, placeable5, (Placeable) ji0Var.d, placeable6, placeable7, placeable8, measureScope.getDensity(), measureScope.getLayoutDirection(), z, f, measureScope.mo367toPx0680j_4(outlinedTextFieldMeasurePolicy.horizontalIconPadding));
        return w01.a;
    }

    private final void place(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, float f, LayoutDirection layoutDirection, boolean z, float f2, float f3) {
        int i3;
        int i4;
        int i5;
        float f4;
        float width;
        int heightOrZero = z ? LayoutUtilKt.getHeightOrZero(placeable6) : 0;
        Placeable.PlacementScope.place$default(placementScope, placeable8, 0, heightOrZero, 0.0f, 4, null);
        int heightOrZero2 = (i - LayoutUtilKt.getHeightOrZero(placeable9)) - (z ? LayoutUtilKt.getHeightOrZero(placeable6) : 0);
        int P = y80.P(this.paddingValues.mo714calculateTopPaddingD9Ej5fM() * f);
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.Companion.getCenterVertically().align(placeable.getHeight(), heightOrZero2) + heightOrZero, 0.0f, 4, null);
        }
        if (placeable6 != null) {
            int lerp = MathHelpersKt.lerp(z ? 0 : this.singleLine ? Alignment.Companion.getCenterVertically().align(placeable6.getHeight(), heightOrZero2) : P, z ? 0 : -(placeable6.getHeight() / 2), f2);
            if (z) {
                Placeable.PlacementScope.place$default(placementScope, placeable6, TextFieldImplKt.getMinimizedAlignment(this.labelPosition).align(placeable6.getWidth(), i2, layoutDirection), lerp, 0.0f, 4, null);
            } else {
                float calculateStartPadding = PaddingKt.calculateStartPadding(this.paddingValues, layoutDirection) * f;
                float calculateEndPadding = PaddingKt.calculateEndPadding(this.paddingValues, layoutDirection) * f;
                if (placeable == null) {
                    f4 = calculateStartPadding;
                } else {
                    float width2 = placeable.getWidth();
                    float f5 = calculateStartPadding - f3;
                    if (f5 < 0.0f) {
                        f5 = 0.0f;
                    }
                    f4 = width2 + f5;
                }
                if (placeable2 == null) {
                    width = calculateEndPadding;
                } else {
                    float f6 = calculateEndPadding - f3;
                    width = placeable2.getWidth() + (f6 >= 0.0f ? f6 : 0.0f);
                }
                LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
                Placeable.PlacementScope.place$default(placementScope, placeable6, y80.P(MathHelpersKt.lerp(TextFieldImplKt.getExpandedAlignment(this.labelPosition).align(placeable6.getWidth(), i2 - y80.P(f4 + width), layoutDirection) + (layoutDirection == layoutDirection2 ? f4 : width), TextFieldImplKt.getMinimizedAlignment(this.labelPosition).align(placeable6.getWidth(), i2 - y80.P(calculateStartPadding + calculateEndPadding), layoutDirection) + (layoutDirection == layoutDirection2 ? calculateStartPadding : calculateEndPadding), f2)), lerp, 0.0f, 4, null);
            }
        }
        if (placeable3 != null) {
            i3 = heightOrZero2;
            i4 = P;
            i5 = heightOrZero;
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, LayoutUtilKt.getWidthOrZero(placeable), place$calculateVerticalPosition(i5, this, i3, i4, placeable6, placeable3), 0.0f, 4, null);
        } else {
            i3 = heightOrZero2;
            i4 = P;
            i5 = heightOrZero;
        }
        int widthOrZero = LayoutUtilKt.getWidthOrZero(placeable3) + LayoutUtilKt.getWidthOrZero(placeable);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, widthOrZero, place$calculateVerticalPosition(i5, this, i3, i4, placeable6, placeable5), 0.0f, 4, null);
        if (placeable7 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, widthOrZero, place$calculateVerticalPosition(i5, this, i3, i4, placeable6, placeable7), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, (i2 - LayoutUtilKt.getWidthOrZero(placeable2)) - placeable4.getWidth(), place$calculateVerticalPosition(i5, this, i3, i4, placeable6, placeable4), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i2 - placeable2.getWidth(), Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i3) + i5, 0.0f, 4, null);
        }
        if (placeable9 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable9, 0, i5 + i3, 0.0f, 4, null);
        }
    }

    private static final int place$calculateVerticalPosition(int i, OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy, int i2, int i3, Placeable placeable, Placeable placeable2) {
        if (outlinedTextFieldMeasurePolicy.singleLine) {
            i3 = Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i2);
        }
        int i4 = i + i3;
        return outlinedTextFieldMeasurePolicy.labelPosition instanceof TextFieldLabelPosition.Above ? i4 : Math.max(i4, LayoutUtilKt.getHeightOrZero(placeable) / 2);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicHeight(intrinsicMeasureScope, list, i, new c(6));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicWidth(intrinsicMeasureScope, list, i, new c(5));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo5measure3p2s80s(final MeasureScope measureScope, List<? extends Measurable> list, long j) {
        Measurable measurable;
        Measurable measurable2;
        long j2;
        Placeable placeable;
        Measurable measurable3;
        Measurable measurable4;
        long j3;
        Placeable placeable2;
        Measurable measurable5;
        int minIntrinsicHeight;
        List<? extends Measurable> list2;
        Measurable measurable6;
        Measurable measurable7;
        boolean z;
        long j4;
        int i;
        long m4594getZeroNHjbRc;
        long m4594getZeroNHjbRc2;
        final float invoke = this.labelProgress.invoke();
        int mo361roundToPx0680j_4 = measureScope.mo361roundToPx0680j_4(this.paddingValues.mo711calculateBottomPaddingD9Ej5fM());
        long m7554copyZbe2FdA$default = Constraints.m7554copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                measurable = null;
                break;
            }
            measurable = list.get(i2);
            if (q10.b(LayoutIdKt.getLayoutId(measurable), TextFieldImplKt.LeadingId)) {
                break;
            }
            i2++;
        }
        Measurable measurable8 = measurable;
        Placeable mo6234measureBRTryo0 = measurable8 != null ? measurable8.mo6234measureBRTryo0(m7554copyZbe2FdA$default) : null;
        int widthOrZero = LayoutUtilKt.getWidthOrZero(mo6234measureBRTryo0);
        int max = Math.max(0, LayoutUtilKt.getHeightOrZero(mo6234measureBRTryo0));
        int size2 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                measurable2 = null;
                break;
            }
            measurable2 = list.get(i3);
            if (q10.b(LayoutIdKt.getLayoutId(measurable2), TextFieldImplKt.TrailingId)) {
                break;
            }
            i3++;
        }
        Measurable measurable9 = measurable2;
        if (measurable9 != null) {
            j2 = m7554copyZbe2FdA$default;
            placeable = measurable9.mo6234measureBRTryo0(ConstraintsKt.m7584offsetNN6EwU$default(j2, -widthOrZero, 0, 2, null));
        } else {
            j2 = m7554copyZbe2FdA$default;
            placeable = null;
        }
        int widthOrZero2 = LayoutUtilKt.getWidthOrZero(placeable) + widthOrZero;
        int max2 = Math.max(max, LayoutUtilKt.getHeightOrZero(placeable));
        int size3 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                measurable3 = null;
                break;
            }
            measurable3 = list.get(i4);
            if (q10.b(LayoutIdKt.getLayoutId(measurable3), TextFieldImplKt.PrefixId)) {
                break;
            }
            i4++;
        }
        Measurable measurable10 = measurable3;
        Placeable mo6234measureBRTryo02 = measurable10 != null ? measurable10.mo6234measureBRTryo0(ConstraintsKt.m7584offsetNN6EwU$default(j2, -widthOrZero2, 0, 2, null)) : null;
        int widthOrZero3 = LayoutUtilKt.getWidthOrZero(mo6234measureBRTryo02) + widthOrZero2;
        int max3 = Math.max(max2, LayoutUtilKt.getHeightOrZero(mo6234measureBRTryo02));
        int size4 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size4) {
                measurable4 = null;
                break;
            }
            measurable4 = list.get(i5);
            if (q10.b(LayoutIdKt.getLayoutId(measurable4), TextFieldImplKt.SuffixId)) {
                break;
            }
            i5++;
        }
        Measurable measurable11 = measurable4;
        if (measurable11 != null) {
            j3 = j2;
            placeable2 = measurable11.mo6234measureBRTryo0(ConstraintsKt.m7584offsetNN6EwU$default(j2, -widthOrZero3, 0, 2, null));
        } else {
            j3 = j2;
            placeable2 = null;
        }
        int widthOrZero4 = LayoutUtilKt.getWidthOrZero(placeable2) + widthOrZero3;
        int max4 = Math.max(max3, LayoutUtilKt.getHeightOrZero(placeable2));
        boolean z2 = this.labelPosition instanceof TextFieldLabelPosition.Above;
        int size5 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size5) {
                measurable5 = null;
                break;
            }
            measurable5 = list.get(i6);
            if (q10.b(LayoutIdKt.getLayoutId(measurable5), TextFieldImplKt.LabelId)) {
                break;
            }
            i6++;
        }
        Measurable measurable12 = measurable5;
        ji0 ji0Var = new ji0();
        if (z2) {
            minIntrinsicHeight = measurable12 != null ? measurable12.minIntrinsicHeight(Constraints.m7566getMinWidthimpl(j)) : 0;
        } else {
            int mo361roundToPx0680j_42 = measureScope.mo361roundToPx0680j_4(this.paddingValues.mo713calculateRightPaddingu2uoSUM(measureScope.getLayoutDirection())) + measureScope.mo361roundToPx0680j_4(this.paddingValues.mo712calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection()));
            Placeable mo6234measureBRTryo03 = measurable12 != null ? measurable12.mo6234measureBRTryo0(ConstraintsKt.m7583offsetNN6EwU(j3, -MathHelpersKt.lerp(widthOrZero4 + mo361roundToPx0680j_42, mo361roundToPx0680j_42, invoke), -mo361roundToPx0680j_4)) : null;
            ji0Var.d = mo6234measureBRTryo03;
            if (mo6234measureBRTryo03 != null) {
                float width = mo6234measureBRTryo03.getWidth();
                m4594getZeroNHjbRc2 = Size.m4576constructorimpl((Float.floatToRawIntBits(mo6234measureBRTryo03.getHeight()) & 4294967295L) | (Float.floatToRawIntBits(width) << 32));
            } else {
                m4594getZeroNHjbRc2 = Size.Companion.m4594getZeroNHjbRc();
            }
            this.onLabelMeasured.invoke(Size.m4573boximpl(m4594getZeroNHjbRc2));
            minIntrinsicHeight = 0;
        }
        int size6 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size6) {
                list2 = list;
                measurable6 = null;
                break;
            }
            list2 = list;
            measurable6 = list2.get(i7);
            int i8 = size6;
            if (q10.b(LayoutIdKt.getLayoutId(measurable6), TextFieldImplKt.SupportingId)) {
                break;
            }
            i7++;
            size6 = i8;
        }
        Measurable measurable13 = measurable6;
        int minIntrinsicHeight2 = measurable13 != null ? measurable13.minIntrinsicHeight(Constraints.m7566getMinWidthimpl(j)) : 0;
        int mo361roundToPx0680j_43 = z2 ? measureScope.mo361roundToPx0680j_4(this.paddingValues.mo714calculateTopPaddingD9Ej5fM()) : Math.max(LayoutUtilKt.getHeightOrZero((Placeable) ji0Var.d) / 2, measureScope.mo361roundToPx0680j_4(this.paddingValues.mo714calculateTopPaddingD9Ej5fM()));
        long m7554copyZbe2FdA$default2 = Constraints.m7554copyZbe2FdA$default(ConstraintsKt.m7583offsetNN6EwU(j, -widthOrZero4, (((-mo361roundToPx0680j_4) - mo361roundToPx0680j_43) - minIntrinsicHeight) - minIntrinsicHeight2), 0, 0, 0, 0, 11, null);
        int size7 = list2.size();
        int i9 = 0;
        while (i9 < size7) {
            Measurable measurable14 = list2.get(i9);
            int i10 = i9;
            int i11 = mo361roundToPx0680j_4;
            if (q10.b(LayoutIdKt.getLayoutId(measurable14), TextFieldImplKt.TextFieldId)) {
                final Placeable mo6234measureBRTryo04 = measurable14.mo6234measureBRTryo0(m7554copyZbe2FdA$default2);
                long m7554copyZbe2FdA$default3 = Constraints.m7554copyZbe2FdA$default(m7554copyZbe2FdA$default2, 0, 0, 0, 0, 14, null);
                int size8 = list2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size8) {
                        measurable7 = null;
                        break;
                    }
                    measurable7 = list2.get(i12);
                    int i13 = size8;
                    if (q10.b(LayoutIdKt.getLayoutId(measurable7), TextFieldImplKt.PlaceholderId)) {
                        break;
                    }
                    i12++;
                    size8 = i13;
                }
                Measurable measurable15 = measurable7;
                Placeable mo6234measureBRTryo05 = measurable15 != null ? measurable15.mo6234measureBRTryo0(m7554copyZbe2FdA$default3) : null;
                int max5 = Math.max(max4, Math.max(LayoutUtilKt.getHeightOrZero(mo6234measureBRTryo04), LayoutUtilKt.getHeightOrZero(mo6234measureBRTryo05)) + mo361roundToPx0680j_43 + i11);
                long j5 = j3;
                ji0 ji0Var2 = ji0Var;
                Measurable measurable16 = measurable13;
                int m2250calculateWidthIzADHW4 = m2250calculateWidthIzADHW4(measureScope, LayoutUtilKt.getWidthOrZero(mo6234measureBRTryo0), LayoutUtilKt.getWidthOrZero(placeable), LayoutUtilKt.getWidthOrZero(mo6234measureBRTryo02), LayoutUtilKt.getWidthOrZero(placeable2), mo6234measureBRTryo04.getWidth(), LayoutUtilKt.getWidthOrZero((Placeable) ji0Var.d), LayoutUtilKt.getWidthOrZero(mo6234measureBRTryo05), j, invoke);
                if (z2) {
                    z = z2;
                    j4 = j5;
                    i = m2250calculateWidthIzADHW4;
                    Placeable mo6234measureBRTryo06 = measurable12 != null ? measurable12.mo6234measureBRTryo0(Constraints.m7554copyZbe2FdA$default(j4, 0, m2250calculateWidthIzADHW4, 0, minIntrinsicHeight, 5, null)) : null;
                    ji0Var2.d = mo6234measureBRTryo06;
                    if (mo6234measureBRTryo06 != null) {
                        m4594getZeroNHjbRc = Size.m4576constructorimpl((Float.floatToRawIntBits(mo6234measureBRTryo06.getWidth()) << 32) | (Float.floatToRawIntBits(mo6234measureBRTryo06.getHeight()) & 4294967295L));
                    } else {
                        m4594getZeroNHjbRc = Size.Companion.m4594getZeroNHjbRc();
                    }
                    this.onLabelMeasured.invoke(Size.m4573boximpl(m4594getZeroNHjbRc));
                } else {
                    z = z2;
                    j4 = j5;
                    i = m2250calculateWidthIzADHW4;
                }
                long m7554copyZbe2FdA$default4 = Constraints.m7554copyZbe2FdA$default(ConstraintsKt.m7584offsetNN6EwU$default(j4, 0, -max5, 1, null), 0, i, 0, 0, 9, null);
                final int i14 = i;
                Placeable mo6234measureBRTryo07 = measurable16 != null ? measurable16.mo6234measureBRTryo0(m7554copyZbe2FdA$default4) : null;
                int heightOrZero = LayoutUtilKt.getHeightOrZero(mo6234measureBRTryo07);
                boolean z3 = z;
                final int m2249calculateHeightmKXJcVc = m2249calculateHeightmKXJcVc(measureScope, LayoutUtilKt.getHeightOrZero(mo6234measureBRTryo0), LayoutUtilKt.getHeightOrZero(placeable), LayoutUtilKt.getHeightOrZero(mo6234measureBRTryo02), LayoutUtilKt.getHeightOrZero(placeable2), mo6234measureBRTryo04.getHeight(), LayoutUtilKt.getHeightOrZero((Placeable) ji0Var2.d), LayoutUtilKt.getHeightOrZero(mo6234measureBRTryo05), LayoutUtilKt.getHeightOrZero(mo6234measureBRTryo07), j, z3, invoke);
                int heightOrZero2 = (m2249calculateHeightmKXJcVc - heightOrZero) - (z3 ? LayoutUtilKt.getHeightOrZero((Placeable) ji0Var2.d) : 0);
                int size9 = list.size();
                int i15 = 0;
                while (i15 < size9) {
                    Measurable measurable17 = list.get(i15);
                    if (q10.b(LayoutIdKt.getLayoutId(measurable17), TextFieldImplKt.ContainerId)) {
                        final Placeable mo6234measureBRTryo08 = measurable17.mo6234measureBRTryo0(ConstraintsKt.Constraints(i14 != Integer.MAX_VALUE ? i14 : 0, i14, heightOrZero2 != Integer.MAX_VALUE ? heightOrZero2 : 0, heightOrZero2));
                        final ji0 ji0Var3 = ji0Var2;
                        final Placeable placeable3 = placeable;
                        final Placeable placeable4 = mo6234measureBRTryo02;
                        final Placeable placeable5 = placeable2;
                        final Placeable placeable6 = mo6234measureBRTryo05;
                        final boolean z4 = z3;
                        final Placeable placeable7 = mo6234measureBRTryo07;
                        final Placeable placeable8 = mo6234measureBRTryo0;
                        return MeasureScope.layout$default(measureScope, i14, m2249calculateHeightmKXJcVc, null, new ky() { // from class: androidx.compose.material3.w0
                            @Override // defpackage.ky
                            public final Object invoke(Object obj) {
                                w01 measure_3p2s80s$lambda$11;
                                measure_3p2s80s$lambda$11 = OutlinedTextFieldMeasurePolicy.measure_3p2s80s$lambda$11(OutlinedTextFieldMeasurePolicy.this, m2249calculateHeightmKXJcVc, i14, placeable8, placeable3, placeable4, placeable5, mo6234measureBRTryo04, ji0Var3, placeable6, mo6234measureBRTryo08, placeable7, measureScope, z4, invoke, (Placeable.PlacementScope) obj);
                                return measure_3p2s80s$lambda$11;
                            }
                        }, 4, null);
                    }
                    i15++;
                    m2249calculateHeightmKXJcVc = m2249calculateHeightmKXJcVc;
                    z3 = z3;
                    ji0Var2 = ji0Var2;
                }
                throw k4.m("Collection contains no element matching the predicate.");
            }
            mo361roundToPx0680j_4 = i11;
            measurable13 = measurable13;
            ji0Var = ji0Var;
            j3 = j3;
            i9 = i10 + 1;
            z2 = z2;
            list2 = list2;
            m7554copyZbe2FdA$default2 = m7554copyZbe2FdA$default2;
        }
        throw k4.m("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicHeight(intrinsicMeasureScope, list, i, new c(4));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicWidth(intrinsicMeasureScope, list, i, new c(7));
    }

    public /* synthetic */ OutlinedTextFieldMeasurePolicy(ky kyVar, boolean z, TextFieldLabelPosition textFieldLabelPosition, FloatProducer floatProducer, PaddingValues paddingValues, float f, dq dqVar) {
        this(kyVar, z, textFieldLabelPosition, floatProducer, paddingValues, f);
    }
}
