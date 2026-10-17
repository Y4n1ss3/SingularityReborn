package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import defpackage.ky;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface RemeasurementModifier extends Modifier.Element {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(RemeasurementModifier remeasurementModifier, ky kyVar) {
            return RemeasurementModifier.super.all(kyVar);
        }

        @Deprecated
        public static boolean any(RemeasurementModifier remeasurementModifier, ky kyVar) {
            return RemeasurementModifier.super.any(kyVar);
        }

        @Deprecated
        public static <R> R foldIn(RemeasurementModifier remeasurementModifier, R r, my myVar) {
            return (R) RemeasurementModifier.super.foldIn(r, myVar);
        }

        @Deprecated
        public static <R> R foldOut(RemeasurementModifier remeasurementModifier, R r, my myVar) {
            return (R) RemeasurementModifier.super.foldOut(r, myVar);
        }

        @Deprecated
        public static Modifier then(RemeasurementModifier remeasurementModifier, Modifier modifier) {
            return RemeasurementModifier.super.then(modifier);
        }
    }

    void onRemeasurementAvailable(Remeasurement remeasurement);
}
