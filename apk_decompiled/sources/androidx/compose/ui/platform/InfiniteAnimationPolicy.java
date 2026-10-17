package androidx.compose.ui.platform;

import defpackage.hm;
import defpackage.in;
import defpackage.jn;
import defpackage.kn;
import defpackage.ky;
import defpackage.my;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface InfiniteAnimationPolicy extends in {
    public static final Key Key = Key.$$INSTANCE;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        public static <R> R fold(InfiniteAnimationPolicy infiniteAnimationPolicy, R r, my myVar) {
            return (R) y80.q(infiniteAnimationPolicy, r, myVar);
        }

        public static <E extends in> E get(InfiniteAnimationPolicy infiniteAnimationPolicy, jn jnVar) {
            return (E) y80.s(infiniteAnimationPolicy, jnVar);
        }

        @Deprecated
        public static jn getKey(InfiniteAnimationPolicy infiniteAnimationPolicy) {
            return InfiniteAnimationPolicy.super.getKey();
        }

        public static kn minusKey(InfiniteAnimationPolicy infiniteAnimationPolicy, jn jnVar) {
            return y80.F(infiniteAnimationPolicy, jnVar);
        }

        public static kn plus(InfiniteAnimationPolicy infiniteAnimationPolicy, kn knVar) {
            return y80.I(infiniteAnimationPolicy, knVar);
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

    @Override // defpackage.kn
    /* synthetic */ kn minusKey(jn jnVar);

    <R> Object onInfiniteOperation(ky kyVar, hm hmVar);

    @Override // defpackage.kn
    /* synthetic */ kn plus(kn knVar);
}
