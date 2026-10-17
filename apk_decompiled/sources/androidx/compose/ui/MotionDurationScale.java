package androidx.compose.ui;

import defpackage.in;
import defpackage.jn;
import defpackage.kn;
import defpackage.my;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface MotionDurationScale extends in {
    public static final Key Key = Key.$$INSTANCE;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        public static <R> R fold(MotionDurationScale motionDurationScale, R r, my myVar) {
            return (R) y80.q(motionDurationScale, r, myVar);
        }

        public static <E extends in> E get(MotionDurationScale motionDurationScale, jn jnVar) {
            return (E) y80.s(motionDurationScale, jnVar);
        }

        public static kn minusKey(MotionDurationScale motionDurationScale, jn jnVar) {
            return y80.F(motionDurationScale, jnVar);
        }

        public static kn plus(MotionDurationScale motionDurationScale, kn knVar) {
            return y80.I(motionDurationScale, knVar);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Key implements jn {
        static final /* synthetic */ Key $$INSTANCE = new Key();

        private Key() {
        }
    }

    @Override // defpackage.kn
    /* synthetic */ Object fold(Object obj, my myVar);

    @Override // defpackage.kn
    /* synthetic */ in get(jn jnVar);

    @Override // defpackage.in
    default jn getKey() {
        return Key;
    }

    float getScaleFactor();

    @Override // defpackage.kn
    /* synthetic */ kn minusKey(jn jnVar);

    @Override // defpackage.kn
    /* synthetic */ kn plus(kn knVar);
}
