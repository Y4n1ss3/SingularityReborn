package androidx.compose.animation.core;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ArcSplineKt {
    public static final int ArcSplineArcAbove = 5;
    public static final int ArcSplineArcBelow = 4;
    public static final int ArcSplineArcStartFlip = 3;
    public static final int ArcSplineArcStartHorizontal = 2;
    public static final int ArcSplineArcStartLinear = 0;
    public static final int ArcSplineArcStartVertical = 1;
    private static final int DownArc = 4;
    private static final float Epsilon = 0.001f;
    private static final float HalfPi = 1.5707964f;
    private static final int LutSize = 101;
    private static final float[] OurPercentCache = new float[91];
    private static final int StartHorizontal = 2;
    private static final int StartLinear = 3;
    private static final int StartVertical = 1;
    private static final int UpArc = 5;
}
