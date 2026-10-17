package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import defpackage.hm;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface NestedScrollConnection {

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
        public static Object m5946onPostFlingRZ2iAVY(NestedScrollConnection nestedScrollConnection, long j, long j2, hm hmVar) {
            return NestedScrollConnection.super.mo533onPostFlingRZ2iAVY(j, j2, hmVar);
        }

        @Deprecated
        /* renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
        public static long m5947onPostScrollDzOQY0M(NestedScrollConnection nestedScrollConnection, long j, long j2, int i) {
            return NestedScrollConnection.super.mo534onPostScrollDzOQY0M(j, j2, i);
        }

        @Deprecated
        /* renamed from: onPreFling-QWom1Mo, reason: not valid java name */
        public static Object m5948onPreFlingQWom1Mo(NestedScrollConnection nestedScrollConnection, long j, hm hmVar) {
            return NestedScrollConnection.super.mo837onPreFlingQWom1Mo(j, hmVar);
        }

        @Deprecated
        /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
        public static long m5949onPreScrollOzD1aCk(NestedScrollConnection nestedScrollConnection, long j, int i) {
            return NestedScrollConnection.super.mo838onPreScrollOzD1aCk(j, i);
        }
    }

    /* renamed from: onPostFling-RZ2iAVY$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m5944onPostFlingRZ2iAVY$suspendImpl(NestedScrollConnection nestedScrollConnection, long j, long j2, hm hmVar) {
        return Velocity.m7840boximpl(Velocity.Companion.m7860getZero9UxMQ8M());
    }

    /* renamed from: onPreFling-QWom1Mo$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m5945onPreFlingQWom1Mo$suspendImpl(NestedScrollConnection nestedScrollConnection, long j, hm hmVar) {
        return Velocity.m7840boximpl(Velocity.Companion.m7860getZero9UxMQ8M());
    }

    /* renamed from: onPostFling-RZ2iAVY */
    default Object mo533onPostFlingRZ2iAVY(long j, long j2, hm hmVar) {
        return m5944onPostFlingRZ2iAVY$suspendImpl(this, j, j2, hmVar);
    }

    /* renamed from: onPostScroll-DzOQY0M */
    default long mo534onPostScrollDzOQY0M(long j, long j2, int i) {
        return Offset.Companion.m4532getZeroF1C5BW0();
    }

    /* renamed from: onPreFling-QWom1Mo */
    default Object mo837onPreFlingQWom1Mo(long j, hm hmVar) {
        return m5945onPreFlingQWom1Mo$suspendImpl(this, j, hmVar);
    }

    /* renamed from: onPreScroll-OzD1aCk */
    default long mo838onPreScrollOzD1aCk(long j, int i) {
        return Offset.Companion.m4532getZeroF1C5BW0();
    }
}
