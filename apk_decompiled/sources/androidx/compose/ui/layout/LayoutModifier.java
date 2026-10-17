package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import defpackage.ky;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface LayoutModifier extends Modifier.Element {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(LayoutModifier layoutModifier, ky kyVar) {
            return LayoutModifier.super.all(kyVar);
        }

        @Deprecated
        public static boolean any(LayoutModifier layoutModifier, ky kyVar) {
            return LayoutModifier.super.any(kyVar);
        }

        @Deprecated
        public static <R> R foldIn(LayoutModifier layoutModifier, R r, my myVar) {
            return (R) LayoutModifier.super.foldIn(r, myVar);
        }

        @Deprecated
        public static <R> R foldOut(LayoutModifier layoutModifier, R r, my myVar) {
            return (R) LayoutModifier.super.foldOut(r, myVar);
        }

        @Deprecated
        public static int maxIntrinsicHeight(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
            return LayoutModifier.super.maxIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i);
        }

        @Deprecated
        public static int maxIntrinsicWidth(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
            return LayoutModifier.super.maxIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i);
        }

        @Deprecated
        public static int minIntrinsicHeight(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
            return LayoutModifier.super.minIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i);
        }

        @Deprecated
        public static int minIntrinsicWidth(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
            return LayoutModifier.super.minIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i);
        }

        @Deprecated
        public static Modifier then(LayoutModifier layoutModifier, Modifier modifier) {
            return LayoutModifier.super.then(modifier);
        }
    }

    default int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return MeasuringIntrinsics.INSTANCE.maxHeight(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    default int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return MeasuringIntrinsics.INSTANCE.maxWidth(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    /* renamed from: measure-3p2s80s */
    MeasureResult mo1114measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j);

    default int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return MeasuringIntrinsics.INSTANCE.minHeight(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    default int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return MeasuringIntrinsics.INSTANCE.minWidth(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }
}
