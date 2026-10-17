package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import defpackage.dq;
import defpackage.xe0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class Brush {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long intrinsicSize;

    private Brush() {
        this.intrinsicSize = Size.Companion.m4593getUnspecifiedNHjbRc();
    }

    /* renamed from: applyTo-Pq9zytI, reason: not valid java name */
    public abstract void mo4706applyToPq9zytI(long j, Paint paint, float f);

    /* renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public long mo4707getIntrinsicSizeNHjbRc() {
        return this.intrinsicSize;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: horizontalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m4708horizontalGradient8A3gB4$default(Companion companion, List list, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m5156getClamp3opZhB0();
            }
            return companion.m4719horizontalGradient8A3gB4((List<Color>) list, f, f2, i);
        }

        /* renamed from: linearGradient-mHitzGk$default, reason: not valid java name */
        public static /* synthetic */ Brush m4711linearGradientmHitzGk$default(Companion companion, xe0[] xe0VarArr, long j, long j2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j = Offset.Companion.m4532getZeroF1C5BW0();
            }
            long j3 = j;
            if ((i2 & 4) != 0) {
                j2 = Offset.Companion.m4530getInfiniteF1C5BW0();
            }
            long j4 = j2;
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m5156getClamp3opZhB0();
            }
            return companion.m4722linearGradientmHitzGk(xe0VarArr, j3, j4, i);
        }

        /* renamed from: radialGradient-P_Vx-Ks$default, reason: not valid java name */
        public static /* synthetic */ Brush m4713radialGradientP_VxKs$default(Companion companion, xe0[] xe0VarArr, long j, float f, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j = Offset.Companion.m4531getUnspecifiedF1C5BW0();
            }
            long j2 = j;
            if ((i2 & 4) != 0) {
                f = Float.POSITIVE_INFINITY;
            }
            float f2 = f;
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m5156getClamp3opZhB0();
            }
            return companion.m4724radialGradientP_VxKs(xe0VarArr, j2, f2, i);
        }

        /* renamed from: sweepGradient-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ Brush m4715sweepGradientUv8p0NA$default(Companion companion, xe0[] xe0VarArr, long j, int i, Object obj) {
            if ((i & 2) != 0) {
                j = Offset.Companion.m4531getUnspecifiedF1C5BW0();
            }
            return companion.m4726sweepGradientUv8p0NA(xe0VarArr, j);
        }

        /* renamed from: verticalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m4716verticalGradient8A3gB4$default(Companion companion, List list, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m5156getClamp3opZhB0();
            }
            return companion.m4727verticalGradient8A3gB4((List<Color>) list, f, f2, i);
        }

        /* renamed from: composite-7EN7VTw, reason: not valid java name */
        public final Brush m4718composite7EN7VTw(Brush brush, Brush brush2, int i) {
            return new CompositeShaderBrush(BrushKt.toShaderBrush(brush), BrushKt.toShaderBrush(brush2), i, null);
        }

        /* renamed from: horizontalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m4720horizontalGradient8A3gB4(xe0[] xe0VarArr, float f, float f2, int i) {
            return m4722linearGradientmHitzGk((xe0[]) Arrays.copyOf(xe0VarArr, xe0VarArr.length), Offset.m4508constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Offset.m4508constructorimpl((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), i);
        }

        /* renamed from: linearGradient-mHitzGk, reason: not valid java name */
        public final Brush m4722linearGradientmHitzGk(xe0[] xe0VarArr, long j, long j2, int i) {
            ArrayList arrayList = new ArrayList(xe0VarArr.length);
            for (xe0 xe0Var : xe0VarArr) {
                arrayList.add(Color.m4751boximpl(((Color) xe0Var.e).m4771unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(xe0VarArr.length);
            for (xe0 xe0Var2 : xe0VarArr) {
                arrayList2.add(Float.valueOf(((Number) xe0Var2.d).floatValue()));
            }
            return new LinearGradient(arrayList, arrayList2, j, j2, i, null);
        }

        /* renamed from: radialGradient-P_Vx-Ks, reason: not valid java name */
        public final Brush m4724radialGradientP_VxKs(xe0[] xe0VarArr, long j, float f, int i) {
            ArrayList arrayList = new ArrayList(xe0VarArr.length);
            for (xe0 xe0Var : xe0VarArr) {
                arrayList.add(Color.m4751boximpl(((Color) xe0Var.e).m4771unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(xe0VarArr.length);
            for (xe0 xe0Var2 : xe0VarArr) {
                arrayList2.add(Float.valueOf(((Number) xe0Var2.d).floatValue()));
            }
            return new RadialGradient(arrayList, arrayList2, j, f, i, null);
        }

        /* renamed from: sweepGradient-Uv8p0NA, reason: not valid java name */
        public final Brush m4726sweepGradientUv8p0NA(xe0[] xe0VarArr, long j) {
            ArrayList arrayList = new ArrayList(xe0VarArr.length);
            for (xe0 xe0Var : xe0VarArr) {
                arrayList.add(Color.m4751boximpl(((Color) xe0Var.e).m4771unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(xe0VarArr.length);
            for (xe0 xe0Var2 : xe0VarArr) {
                arrayList2.add(Float.valueOf(((Number) xe0Var2.d).floatValue()));
            }
            return new SweepGradient(j, arrayList, arrayList2, null);
        }

        /* renamed from: verticalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m4728verticalGradient8A3gB4(xe0[] xe0VarArr, float f, float f2, int i) {
            return m4722linearGradientmHitzGk((xe0[]) Arrays.copyOf(xe0VarArr, xe0VarArr.length), Offset.m4508constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L)), Offset.m4508constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L)), i);
        }

        private Companion() {
        }

        /* renamed from: sweepGradient-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ Brush m4714sweepGradientUv8p0NA$default(Companion companion, List list, long j, int i, Object obj) {
            if ((i & 2) != 0) {
                j = Offset.Companion.m4531getUnspecifiedF1C5BW0();
            }
            return companion.m4725sweepGradientUv8p0NA((List<Color>) list, j);
        }

        /* renamed from: horizontalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m4709horizontalGradient8A3gB4$default(Companion companion, xe0[] xe0VarArr, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m5156getClamp3opZhB0();
            }
            return companion.m4720horizontalGradient8A3gB4(xe0VarArr, f, f2, i);
        }

        /* renamed from: verticalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ Brush m4717verticalGradient8A3gB4$default(Companion companion, xe0[] xe0VarArr, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m5156getClamp3opZhB0();
            }
            return companion.m4728verticalGradient8A3gB4(xe0VarArr, f, f2, i);
        }

        /* renamed from: radialGradient-P_Vx-Ks$default, reason: not valid java name */
        public static /* synthetic */ Brush m4712radialGradientP_VxKs$default(Companion companion, List list, long j, float f, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j = Offset.Companion.m4531getUnspecifiedF1C5BW0();
            }
            long j2 = j;
            if ((i2 & 4) != 0) {
                f = Float.POSITIVE_INFINITY;
            }
            float f2 = f;
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m5156getClamp3opZhB0();
            }
            return companion.m4723radialGradientP_VxKs((List<Color>) list, j2, f2, i);
        }

        /* renamed from: linearGradient-mHitzGk$default, reason: not valid java name */
        public static /* synthetic */ Brush m4710linearGradientmHitzGk$default(Companion companion, List list, long j, long j2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                j = Offset.Companion.m4532getZeroF1C5BW0();
            }
            long j3 = j;
            if ((i2 & 4) != 0) {
                j2 = Offset.Companion.m4530getInfiniteF1C5BW0();
            }
            long j4 = j2;
            if ((i2 & 8) != 0) {
                i = TileMode.Companion.m5156getClamp3opZhB0();
            }
            return companion.m4721linearGradientmHitzGk((List<Color>) list, j3, j4, i);
        }

        /* renamed from: horizontalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m4719horizontalGradient8A3gB4(List<Color> list, float f, float f2, int i) {
            return m4721linearGradientmHitzGk(list, Offset.m4508constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Offset.m4508constructorimpl((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), i);
        }

        /* renamed from: verticalGradient-8A-3gB4, reason: not valid java name */
        public final Brush m4727verticalGradient8A3gB4(List<Color> list, float f, float f2, int i) {
            return m4721linearGradientmHitzGk(list, Offset.m4508constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L)), Offset.m4508constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L)), i);
        }

        /* renamed from: sweepGradient-Uv8p0NA, reason: not valid java name */
        public final Brush m4725sweepGradientUv8p0NA(List<Color> list, long j) {
            return new SweepGradient(j, list, null, null);
        }

        /* renamed from: linearGradient-mHitzGk, reason: not valid java name */
        public final Brush m4721linearGradientmHitzGk(List<Color> list, long j, long j2, int i) {
            return new LinearGradient(list, null, j, j2, i, null);
        }

        /* renamed from: radialGradient-P_Vx-Ks, reason: not valid java name */
        public final Brush m4723radialGradientP_VxKs(List<Color> list, long j, float f, int i) {
            return new RadialGradient(list, null, j, f, i, null);
        }
    }

    public /* synthetic */ Brush(dq dqVar) {
        this();
    }
}
