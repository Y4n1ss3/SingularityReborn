package androidx.compose.ui;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAbsoluteAlignment;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AbsoluteAlignment {
    public static final int $stable = 0;
    public static final AbsoluteAlignment INSTANCE = new AbsoluteAlignment();
    private static final Alignment TopLeft = new BiasAbsoluteAlignment(-1.0f, -1.0f);
    private static final Alignment TopRight = new BiasAbsoluteAlignment(1.0f, -1.0f);
    private static final Alignment CenterLeft = new BiasAbsoluteAlignment(-1.0f, 0.0f);
    private static final Alignment CenterRight = new BiasAbsoluteAlignment(1.0f, 0.0f);
    private static final Alignment BottomLeft = new BiasAbsoluteAlignment(-1.0f, 1.0f);
    private static final Alignment BottomRight = new BiasAbsoluteAlignment(1.0f, 1.0f);
    private static final Alignment.Horizontal Left = new BiasAbsoluteAlignment.Horizontal(-1.0f);
    private static final Alignment.Horizontal Right = new BiasAbsoluteAlignment.Horizontal(1.0f);

    private AbsoluteAlignment() {
    }

    public final Alignment getBottomLeft() {
        return BottomLeft;
    }

    public final Alignment getBottomRight() {
        return BottomRight;
    }

    public final Alignment getCenterLeft() {
        return CenterLeft;
    }

    public final Alignment getCenterRight() {
        return CenterRight;
    }

    public final Alignment.Horizontal getLeft() {
        return Left;
    }

    public final Alignment.Horizontal getRight() {
        return Right;
    }

    public final Alignment getTopLeft() {
        return TopLeft;
    }

    public final Alignment getTopRight() {
        return TopRight;
    }

    public static /* synthetic */ void getBottomLeft$annotations() {
    }

    public static /* synthetic */ void getBottomRight$annotations() {
    }

    public static /* synthetic */ void getCenterLeft$annotations() {
    }

    public static /* synthetic */ void getCenterRight$annotations() {
    }

    public static /* synthetic */ void getLeft$annotations() {
    }

    public static /* synthetic */ void getRight$annotations() {
    }

    public static /* synthetic */ void getTopLeft$annotations() {
    }

    public static /* synthetic */ void getTopRight$annotations() {
    }
}
