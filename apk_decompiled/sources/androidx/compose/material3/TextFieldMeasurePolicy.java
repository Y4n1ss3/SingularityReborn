package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.TextFieldLabelPosition;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.internal.LayoutUtilKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.ui.Alignment;
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
import androidx.compose.ui.unit.IntOffset;
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
final class TextFieldMeasurePolicy implements MeasurePolicy {
    private final TextFieldLabelPosition labelPosition;
    private final FloatProducer labelProgress;
    private final float minimizedLabelHalfHeight;
    private final PaddingValues paddingValues;
    private final boolean singleLine;

    private TextFieldMeasurePolicy(boolean z, TextFieldLabelPosition textFieldLabelPosition, FloatProducer floatProducer, PaddingValues paddingValues, float f) {
        this.singleLine = z;
        this.labelPosition = textFieldLabelPosition;
        this.labelProgress = floatProducer;
        this.paddingValues = paddingValues;
        this.minimizedLabelHalfHeight = f;
    }

    /* renamed from: calculateHeight-mKXJcVc, reason: not valid java name */
    private final int m2602calculateHeightmKXJcVc(Density density, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, boolean z, float f) {
        int mo361roundToPx0680j_4 = density.mo361roundToPx0680j_4(Dp.m7611constructorimpl(this.paddingValues.mo711calculateBottomPaddingD9Ej5fM() + this.paddingValues.mo714calculateTopPaddingD9Ej5fM())) + ((i2 <= 0 || z) ? 0 : Math.max(density.mo361roundToPx0680j_4(Dp.m7611constructorimpl(this.minimizedLabelHalfHeight * 2.0f)), MathHelpersKt.lerp(0, i2, MotionTokens.INSTANCE.getEasingEmphasizedAccelerateCubicBezier().transform(f)))) + p01.u(i, i7, i5, i6, z ? 0 : MathHelpersKt.lerp(i2, 0, f));
        if (!z) {
            i2 = 0;
        }
        return ConstraintsKt.m7580constrainHeightK40F9xA(j, Math.max(i3, Math.max(i4, mo361roundToPx0680j_4)) + i2 + i8);
    }

    /* renamed from: calculateWidth-yeHjK3Y, reason: not valid java name */
    private final int m2603calculateWidthyeHjK3Y(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        int i8 = i3 + i4;
        return ConstraintsKt.m7581constrainWidthK40F9xA(j, Math.max(i5 + i8, Math.max(i7 + i8, i6)) + i + i2);
    }

    private final int intrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i, my myVar) {
        IntrinsicMeasurable intrinsicMeasurable;
        int i2;
        int i3;
        int i4;
        IntrinsicMeasurable intrinsicMeasurable2;
        int i5;
        Object obj;
        IntrinsicMeasurable intrinsicMeasurable3;
        int i6;
        IntrinsicMeasurable intrinsicMeasurable4;
        int i7;
        Object obj2;
        Object obj3;
        int i8;
        int i9;
        int i10;
        TextFieldMeasurePolicy textFieldMeasurePolicy = this;
        int size = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                intrinsicMeasurable = null;
                break;
            }
            intrinsicMeasurable = list.get(i11);
            if (q10.b(LayoutUtilKt.getLayoutId(intrinsicMeasurable), TextFieldImplKt.LeadingId)) {
                break;
            }
            i11++;
        }
        IntrinsicMeasurable intrinsicMeasurable5 = intrinsicMeasurable;
        if (intrinsicMeasurable5 != null) {
            i2 = i;
            i3 = LayoutUtilKt.subtractConstraintSafely(i2, intrinsicMeasurable5.maxIntrinsicWidth(Integer.MAX_VALUE));
            i4 = ((Number) myVar.invoke(intrinsicMeasurable5, Integer.valueOf(i2))).intValue();
        } else {
            i2 = i;
            i3 = i2;
            i4 = 0;
        }
        int size2 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size2) {
                intrinsicMeasurable2 = null;
                break;
            }
            intrinsicMeasurable2 = list.get(i12);
            if (q10.b(LayoutUtilKt.getLayoutId(intrinsicMeasurable2), TextFieldImplKt.TrailingId)) {
                break;
            }
            i12++;
        }
        IntrinsicMeasurable intrinsicMeasurable6 = intrinsicMeasurable2;
        if (intrinsicMeasurable6 != null) {
            i3 = LayoutUtilKt.subtractConstraintSafely(i3, intrinsicMeasurable6.maxIntrinsicWidth(Integer.MAX_VALUE));
            i5 = ((Number) myVar.invoke(intrinsicMeasurable6, Integer.valueOf(i2))).intValue();
        } else {
            i5 = 0;
        }
        int size3 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size3) {
                obj = null;
                break;
            }
            obj = list.get(i13);
            if (q10.b(LayoutUtilKt.getLayoutId((IntrinsicMeasurable) obj), TextFieldImplKt.LabelId)) {
                break;
            }
            i13++;
        }
        Object obj4 = (IntrinsicMeasurable) obj;
        int intValue = obj4 != null ? ((Number) myVar.invoke(obj4, Integer.valueOf(i3))).intValue() : 0;
        int size4 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size4) {
                intrinsicMeasurable3 = null;
                break;
            }
            intrinsicMeasurable3 = list.get(i14);
            if (q10.b(LayoutUtilKt.getLayoutId(intrinsicMeasurable3), TextFieldImplKt.PrefixId)) {
                break;
            }
            i14++;
        }
        IntrinsicMeasurable intrinsicMeasurable7 = intrinsicMeasurable3;
        if (intrinsicMeasurable7 != null) {
            i6 = ((Number) myVar.invoke(intrinsicMeasurable7, Integer.valueOf(i3))).intValue();
            i3 = LayoutUtilKt.subtractConstraintSafely(i3, intrinsicMeasurable7.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            i6 = 0;
        }
        int size5 = list.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size5) {
                intrinsicMeasurable4 = null;
                break;
            }
            intrinsicMeasurable4 = list.get(i15);
            if (q10.b(LayoutUtilKt.getLayoutId(intrinsicMeasurable4), TextFieldImplKt.SuffixId)) {
                break;
            }
            i15++;
        }
        IntrinsicMeasurable intrinsicMeasurable8 = intrinsicMeasurable4;
        if (intrinsicMeasurable8 != null) {
            i7 = ((Number) myVar.invoke(intrinsicMeasurable8, Integer.valueOf(i3))).intValue();
            i3 = LayoutUtilKt.subtractConstraintSafely(i3, intrinsicMeasurable8.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            i7 = 0;
        }
        int size6 = list.size();
        int i16 = 0;
        while (i16 < size6) {
            Object obj5 = list.get(i16);
            if (q10.b(LayoutUtilKt.getLayoutId((IntrinsicMeasurable) obj5), TextFieldImplKt.TextFieldId)) {
                int intValue2 = ((Number) myVar.invoke(obj5, Integer.valueOf(i3))).intValue();
                int size7 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size7) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i17);
                    if (q10.b(LayoutUtilKt.getLayoutId((IntrinsicMeasurable) obj2), TextFieldImplKt.PlaceholderId)) {
                        break;
                    }
                    i17++;
                }
                Object obj6 = (IntrinsicMeasurable) obj2;
                int intValue3 = obj6 != null ? ((Number) myVar.invoke(obj6, Integer.valueOf(i3))).intValue() : 0;
                int size8 = list.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size8) {
                        obj3 = null;
                        break;
                    }
                    Object obj7 = list.get(i18);
                    if (q10.b(LayoutUtilKt.getLayoutId((IntrinsicMeasurable) obj7), TextFieldImplKt.SupportingId)) {
                        obj3 = obj7;
                        break;
                    }
                    i18++;
                }
                Object obj8 = (IntrinsicMeasurable) obj3;
                if (obj8 != null) {
                    int intValue4 = ((Number) myVar.invoke(obj8, Integer.valueOf(i2))).intValue();
                    i8 = intValue3;
                    i9 = i5;
                    i10 = intValue4;
                } else {
                    i8 = intValue3;
                    i9 = i5;
                    i10 = 0;
                }
                return textFieldMeasurePolicy.m2602calculateHeightmKXJcVc(intrinsicMeasureScope, intValue2, intValue, i4, i9, i6, i7, i8, i10, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), textFieldMeasurePolicy.labelPosition instanceof TextFieldLabelPosition.Above, textFieldMeasurePolicy.labelProgress.invoke());
            }
            i16++;
            i4 = i4;
            i7 = i7;
            textFieldMeasurePolicy = this;
        }
        throw k4.m("Collection contains no element matching the predicate.");
    }

    private final int intrinsicWidth(List<? extends IntrinsicMeasurable> list, int i, my myVar) {
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
                    if (q10.b(LayoutUtilKt.getLayoutId(intrinsicMeasurable4), TextFieldImplKt.PrefixId)) {
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
                    if (q10.b(LayoutUtilKt.getLayoutId(intrinsicMeasurable5), TextFieldImplKt.SuffixId)) {
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
                    if (q10.b(LayoutUtilKt.getLayoutId(intrinsicMeasurable6), TextFieldImplKt.LeadingId)) {
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
                return m2603calculateWidthyeHjK3Y(intValue6, intValue3, intValue4, intValue5, intValue, intValue2, intrinsicMeasurable14 != null ? ((Number) myVar.invoke(intrinsicMeasurable14, Integer.valueOf(i))).intValue() : 0, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null));
            }
        }
        throw k4.m("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$9(ji0 ji0Var, boolean z, TextFieldMeasurePolicy textFieldMeasurePolicy, int i, int i2, MeasureScope measureScope, int i3, int i4, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, float f, Placeable.PlacementScope placementScope) {
        MeasureScope measureScope2;
        int mo361roundToPx0680j_4;
        int i5;
        if (ji0Var.d != null) {
            if (z) {
                measureScope2 = measureScope;
                i5 = 0;
            } else {
                if (textFieldMeasurePolicy.singleLine) {
                    mo361roundToPx0680j_4 = Alignment.Companion.getCenterVertically().align(((Placeable) ji0Var.d).getHeight(), i);
                    measureScope2 = measureScope;
                } else {
                    measureScope2 = measureScope;
                    mo361roundToPx0680j_4 = measureScope2.mo361roundToPx0680j_4(textFieldMeasurePolicy.minimizedLabelHalfHeight) + i2;
                }
                i5 = mo361roundToPx0680j_4;
            }
            int i6 = z ? 0 : i2;
            Object obj = ji0Var.d;
            textFieldMeasurePolicy.placeWithLabel(placementScope, i3, i4, placeable, (Placeable) obj, placeable2, placeable3, placeable4, placeable5, placeable6, placeable7, placeable8, i5, i6, z, f, i2 + (z ? 0 : ((Placeable) obj).getHeight()), measureScope2.getLayoutDirection());
        } else {
            textFieldMeasurePolicy.placeWithoutLabel(placementScope, i3, i4, placeable, placeable2, placeable3, placeable4, placeable5, placeable6, placeable7, placeable8, measureScope.getDensity());
        }
        return w01.a;
    }

    private final void placeWithLabel(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, int i3, int i4, boolean z, float f, int i5, LayoutDirection layoutDirection) {
        int height = z ? placeable2.getHeight() : 0;
        Placeable.PlacementScope.place$default(placementScope, placeable8, 0, height, 0.0f, 4, null);
        int heightOrZero = (i2 - LayoutUtilKt.getHeightOrZero(placeable9)) - (z ? placeable2.getHeight() : 0);
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, 0, Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), heightOrZero) + height, 0.0f, 4, null);
        }
        int lerp = MathHelpersKt.lerp(i3, i4, f);
        if (z) {
            Placeable.PlacementScope.place$default(placementScope, placeable2, TextFieldImplKt.getMinimizedAlignment(this.labelPosition).align(placeable2.getWidth(), i, layoutDirection), lerp, 0.0f, 4, null);
        } else {
            int widthOrZero = layoutDirection == LayoutDirection.Ltr ? LayoutUtilKt.getWidthOrZero(placeable4) : LayoutUtilKt.getWidthOrZero(placeable5);
            Placeable.PlacementScope.place$default(placementScope, placeable2, MathHelpersKt.lerp(TextFieldImplKt.getExpandedAlignment(this.labelPosition).align(placeable2.getWidth(), (i - LayoutUtilKt.getWidthOrZero(placeable4)) - LayoutUtilKt.getWidthOrZero(placeable5), layoutDirection) + widthOrZero, TextFieldImplKt.getMinimizedAlignment(this.labelPosition).align(placeable2.getWidth(), (i - LayoutUtilKt.getWidthOrZero(placeable4)) - LayoutUtilKt.getWidthOrZero(placeable5), layoutDirection) + widthOrZero, f), lerp, 0.0f, 4, null);
        }
        if (placeable6 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, LayoutUtilKt.getWidthOrZero(placeable4), height + i5, 0.0f, 4, null);
        }
        int widthOrZero2 = LayoutUtilKt.getWidthOrZero(placeable6) + LayoutUtilKt.getWidthOrZero(placeable4);
        int i6 = height + i5;
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, widthOrZero2, i6, 0.0f, 4, null);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, widthOrZero2, i6, 0.0f, 4, null);
        }
        if (placeable7 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, (i - LayoutUtilKt.getWidthOrZero(placeable5)) - placeable7.getWidth(), i6, 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, i - placeable5.getWidth(), Alignment.Companion.getCenterVertically().align(placeable5.getHeight(), heightOrZero) + height, 0.0f, 4, null);
        }
        if (placeable9 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable9, 0, height + heightOrZero, 0.0f, 4, null);
        }
    }

    private final void placeWithoutLabel(Placeable.PlacementScope placementScope, int i, int i2, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, float f) {
        Placeable.PlacementScope.m6303place70tqf50$default(placementScope, placeable7, IntOffset.Companion.m7750getZeronOccac(), 0.0f, 2, null);
        int heightOrZero = i2 - LayoutUtilKt.getHeightOrZero(placeable8);
        int P = y80.P(this.paddingValues.mo714calculateTopPaddingD9Ej5fM() * f);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, 0, Alignment.Companion.getCenterVertically().align(placeable3.getHeight(), heightOrZero), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, LayoutUtilKt.getWidthOrZero(placeable3), placeWithoutLabel$calculateVerticalPosition(this, heightOrZero, P, placeable5), 0.0f, 4, null);
        }
        int widthOrZero = LayoutUtilKt.getWidthOrZero(placeable5) + LayoutUtilKt.getWidthOrZero(placeable3);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, widthOrZero, placeWithoutLabel$calculateVerticalPosition(this, heightOrZero, P, placeable), 0.0f, 4, null);
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, widthOrZero, placeWithoutLabel$calculateVerticalPosition(this, heightOrZero, P, placeable2), 0.0f, 4, null);
        }
        if (placeable6 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, (i - LayoutUtilKt.getWidthOrZero(placeable4)) - placeable6.getWidth(), placeWithoutLabel$calculateVerticalPosition(this, heightOrZero, P, placeable6), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i - placeable4.getWidth(), Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), heightOrZero), 0.0f, 4, null);
        }
        if (placeable8 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable8, 0, heightOrZero, 0.0f, 4, null);
        }
    }

    private static final int placeWithoutLabel$calculateVerticalPosition(TextFieldMeasurePolicy textFieldMeasurePolicy, int i, int i2, Placeable placeable) {
        return textFieldMeasurePolicy.singleLine ? Alignment.Companion.getCenterVertically().align(placeable.getHeight(), i) : i2;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicHeight(intrinsicMeasureScope, list, i, new c(11));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicWidth(list, i, new c(9));
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
        int i;
        Measurable measurable6;
        Measurable measurable7;
        final float invoke = this.labelProgress.invoke();
        int mo361roundToPx0680j_4 = measureScope.mo361roundToPx0680j_4(this.paddingValues.mo714calculateTopPaddingD9Ej5fM());
        int mo361roundToPx0680j_42 = measureScope.mo361roundToPx0680j_4(this.paddingValues.mo711calculateBottomPaddingD9Ej5fM());
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
        final boolean z = this.labelPosition instanceof TextFieldLabelPosition.Above;
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
        if (z) {
            minIntrinsicHeight = measurable12 != null ? measurable12.minIntrinsicHeight(Constraints.m7566getMinWidthimpl(j)) : 0;
        } else {
            ji0Var.d = measurable12 != null ? measurable12.mo6234measureBRTryo0(ConstraintsKt.m7583offsetNN6EwU(j3, -widthOrZero4, -mo361roundToPx0680j_42)) : null;
            minIntrinsicHeight = 0;
        }
        int size6 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size6) {
                i = mo361roundToPx0680j_42;
                measurable6 = null;
                break;
            }
            measurable6 = list.get(i7);
            i = mo361roundToPx0680j_42;
            if (q10.b(LayoutIdKt.getLayoutId(measurable6), TextFieldImplKt.SupportingId)) {
                break;
            }
            i7++;
            mo361roundToPx0680j_42 = i;
        }
        Measurable measurable13 = measurable6;
        int minIntrinsicHeight2 = measurable13 != null ? measurable13.minIntrinsicHeight(Constraints.m7566getMinWidthimpl(j)) : 0;
        int heightOrZero = LayoutUtilKt.getHeightOrZero((Placeable) ji0Var.d) + minIntrinsicHeight + mo361roundToPx0680j_4;
        long m7583offsetNN6EwU = ConstraintsKt.m7583offsetNN6EwU(Constraints.m7554copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null), -widthOrZero4, ((-heightOrZero) - i) - minIntrinsicHeight2);
        int size7 = list.size();
        int i8 = 0;
        while (i8 < size7) {
            Measurable measurable14 = list.get(i8);
            int i9 = size7;
            int i10 = heightOrZero;
            if (q10.b(LayoutIdKt.getLayoutId(measurable14), TextFieldImplKt.TextFieldId)) {
                final Placeable mo6234measureBRTryo03 = measurable14.mo6234measureBRTryo0(m7583offsetNN6EwU);
                long m7554copyZbe2FdA$default2 = Constraints.m7554copyZbe2FdA$default(m7583offsetNN6EwU, 0, 0, 0, 0, 14, null);
                int size8 = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size8) {
                        measurable7 = null;
                        break;
                    }
                    measurable7 = list.get(i11);
                    int i12 = size8;
                    if (q10.b(LayoutIdKt.getLayoutId(measurable7), TextFieldImplKt.PlaceholderId)) {
                        break;
                    }
                    i11++;
                    size8 = i12;
                }
                Measurable measurable15 = measurable7;
                Placeable mo6234measureBRTryo04 = measurable15 != null ? measurable15.mo6234measureBRTryo0(m7554copyZbe2FdA$default2) : null;
                int max5 = Math.max(max4, Math.max(LayoutUtilKt.getHeightOrZero(mo6234measureBRTryo03), LayoutUtilKt.getHeightOrZero(mo6234measureBRTryo04)) + i10 + i);
                long j4 = j3;
                final int i13 = mo361roundToPx0680j_4;
                final ji0 ji0Var2 = ji0Var;
                final int m2603calculateWidthyeHjK3Y = m2603calculateWidthyeHjK3Y(LayoutUtilKt.getWidthOrZero(mo6234measureBRTryo0), LayoutUtilKt.getWidthOrZero(placeable), LayoutUtilKt.getWidthOrZero(mo6234measureBRTryo02), LayoutUtilKt.getWidthOrZero(placeable2), mo6234measureBRTryo03.getWidth(), LayoutUtilKt.getWidthOrZero((Placeable) ji0Var.d), LayoutUtilKt.getWidthOrZero(mo6234measureBRTryo04), j);
                if (z) {
                    ji0Var2.d = measurable12 != null ? measurable12.mo6234measureBRTryo0(Constraints.m7554copyZbe2FdA$default(j4, 0, m2603calculateWidthyeHjK3Y, 0, minIntrinsicHeight, 5, null)) : null;
                }
                final Placeable mo6234measureBRTryo05 = measurable13 != null ? measurable13.mo6234measureBRTryo0(Constraints.m7554copyZbe2FdA$default(ConstraintsKt.m7584offsetNN6EwU$default(j4, 0, -max5, 1, null), 0, m2603calculateWidthyeHjK3Y, 0, 0, 9, null)) : null;
                int heightOrZero2 = LayoutUtilKt.getHeightOrZero(mo6234measureBRTryo05);
                final int m2602calculateHeightmKXJcVc = m2602calculateHeightmKXJcVc(measureScope, mo6234measureBRTryo03.getHeight(), LayoutUtilKt.getHeightOrZero((Placeable) ji0Var2.d), LayoutUtilKt.getHeightOrZero(mo6234measureBRTryo0), LayoutUtilKt.getHeightOrZero(placeable), LayoutUtilKt.getHeightOrZero(mo6234measureBRTryo02), LayoutUtilKt.getHeightOrZero(placeable2), LayoutUtilKt.getHeightOrZero(mo6234measureBRTryo04), LayoutUtilKt.getHeightOrZero(mo6234measureBRTryo05), j, z, invoke);
                final int heightOrZero3 = (m2602calculateHeightmKXJcVc - heightOrZero2) - (z ? LayoutUtilKt.getHeightOrZero((Placeable) ji0Var2.d) : 0);
                int size9 = list.size();
                int i14 = 0;
                while (i14 < size9) {
                    Measurable measurable16 = list.get(i14);
                    if (q10.b(LayoutIdKt.getLayoutId(measurable16), TextFieldImplKt.ContainerId)) {
                        final Placeable mo6234measureBRTryo06 = measurable16.mo6234measureBRTryo0(ConstraintsKt.Constraints(m2603calculateWidthyeHjK3Y != Integer.MAX_VALUE ? m2603calculateWidthyeHjK3Y : 0, m2603calculateWidthyeHjK3Y, heightOrZero3 != Integer.MAX_VALUE ? heightOrZero3 : 0, heightOrZero3));
                        final Placeable placeable3 = mo6234measureBRTryo0;
                        final Placeable placeable4 = placeable;
                        final Placeable placeable5 = mo6234measureBRTryo02;
                        final Placeable placeable6 = placeable2;
                        final Placeable placeable7 = mo6234measureBRTryo04;
                        return MeasureScope.layout$default(measureScope, m2603calculateWidthyeHjK3Y, m2602calculateHeightmKXJcVc, null, new ky() { // from class: androidx.compose.material3.l1
                            @Override // defpackage.ky
                            public final Object invoke(Object obj) {
                                w01 measure_3p2s80s$lambda$9;
                                measure_3p2s80s$lambda$9 = TextFieldMeasurePolicy.measure_3p2s80s$lambda$9(ji0.this, z, this, heightOrZero3, i13, measureScope, m2603calculateWidthyeHjK3Y, m2602calculateHeightmKXJcVc, mo6234measureBRTryo03, placeable7, placeable3, placeable4, placeable5, placeable6, mo6234measureBRTryo06, mo6234measureBRTryo05, invoke, (Placeable.PlacementScope) obj);
                                return measure_3p2s80s$lambda$9;
                            }
                        }, 4, null);
                    }
                    i14++;
                    heightOrZero3 = heightOrZero3;
                }
                throw k4.m("Collection contains no element matching the predicate.");
            }
            i8++;
            ji0Var = ji0Var;
            size7 = i9;
            heightOrZero = i10;
            m7583offsetNN6EwU = m7583offsetNN6EwU;
            mo361roundToPx0680j_4 = mo361roundToPx0680j_4;
        }
        throw k4.m("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicHeight(intrinsicMeasureScope, list, i, new c(10));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
        return intrinsicWidth(list, i, new c(8));
    }

    public /* synthetic */ TextFieldMeasurePolicy(boolean z, TextFieldLabelPosition textFieldLabelPosition, FloatProducer floatProducer, PaddingValues paddingValues, float f, dq dqVar) {
        this(z, textFieldLabelPosition, floatProducer, paddingValues, f);
    }
}
