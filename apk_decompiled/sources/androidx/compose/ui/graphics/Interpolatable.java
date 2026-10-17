package androidx.compose.ui.graphics;

import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface Interpolatable {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x0031 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0030 A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object lerp(Object obj, Object obj2, float f) {
            if (q10.b(obj, obj2)) {
                return f < 0.5f ? obj : obj2;
            }
            Object lerp = obj instanceof Interpolatable ? ((Interpolatable) obj).lerp(obj2, f) : null;
            if (lerp == null && (obj2 instanceof Interpolatable)) {
                lerp = ((Interpolatable) obj2).lerp(obj, 1.0f - f);
            }
            if (lerp != null) {
                return lerp;
            }
            if (f < 0.5f) {
            }
        }
    }

    Object lerp(Object obj, float f);
}
