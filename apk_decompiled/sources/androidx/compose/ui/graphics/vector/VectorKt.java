package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import defpackage.ky;
import defpackage.ut;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VectorKt {
    public static final String DefaultGroupName = "";
    public static final String DefaultPathName = "";
    public static final float DefaultPivotX = 0.0f;
    public static final float DefaultPivotY = 0.0f;
    public static final float DefaultRotation = 0.0f;
    public static final float DefaultScaleX = 1.0f;
    public static final float DefaultScaleY = 1.0f;
    public static final float DefaultStrokeLineMiter = 4.0f;
    public static final float DefaultStrokeLineWidth = 0.0f;
    public static final float DefaultTranslationX = 0.0f;
    public static final float DefaultTranslationY = 0.0f;
    public static final float DefaultTrimPathEnd = 1.0f;
    public static final float DefaultTrimPathOffset = 0.0f;
    public static final float DefaultTrimPathStart = 0.0f;
    private static final List<PathNode> EmptyPath = ut.d;
    private static final int DefaultStrokeLineCap = StrokeCap.Companion.m5135getButtKaPHkGw();
    private static final int DefaultStrokeLineJoin = StrokeJoin.Companion.m5146getMiterLxFBmk8();
    private static final int DefaultTintBlendMode = BlendMode.Companion.m4699getSrcIn0nO6VwU();
    private static final long DefaultTintColor = Color.Companion.m4796getTransparent0d7_KjU();
    private static final int DefaultFillType = PathFillType.Companion.m5058getNonZeroRgk1Os();

    public static final List<PathNode> PathData(ky kyVar) {
        PathBuilder pathBuilder = new PathBuilder();
        kyVar.invoke(pathBuilder);
        return pathBuilder.getNodes();
    }

    public static final List<PathNode> addPathNodes(String str) {
        return str == null ? EmptyPath : new PathParser().parsePathString(str).toNodes();
    }

    public static final int getDefaultFillType() {
        return DefaultFillType;
    }

    public static final int getDefaultStrokeLineCap() {
        return DefaultStrokeLineCap;
    }

    public static final int getDefaultStrokeLineJoin() {
        return DefaultStrokeLineJoin;
    }

    public static final int getDefaultTintBlendMode() {
        return DefaultTintBlendMode;
    }

    public static final long getDefaultTintColor() {
        return DefaultTintColor;
    }

    public static final List<PathNode> getEmptyPath() {
        return EmptyPath;
    }

    /* renamed from: rgbEqual--OWjLjI, reason: not valid java name */
    public static final boolean m5510rgbEqualOWjLjI(long j, long j2) {
        return Color.m4767getRedimpl(j) == Color.m4767getRedimpl(j2) && Color.m4766getGreenimpl(j) == Color.m4766getGreenimpl(j2) && Color.m4764getBlueimpl(j) == Color.m4764getBlueimpl(j2);
    }

    public static final boolean tintableWithAlphaMask(ColorFilter colorFilter) {
        if (!(colorFilter instanceof BlendModeColorFilter)) {
            return colorFilter == null;
        }
        BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) colorFilter;
        int m4703getBlendMode0nO6VwU = blendModeColorFilter.m4703getBlendMode0nO6VwU();
        BlendMode.Companion companion = BlendMode.Companion;
        return BlendMode.m4670equalsimpl0(m4703getBlendMode0nO6VwU, companion.m4699getSrcIn0nO6VwU()) || BlendMode.m4670equalsimpl0(blendModeColorFilter.m4703getBlendMode0nO6VwU(), companion.m4701getSrcOver0nO6VwU());
    }

    /* renamed from: toOpaque-8_81llA, reason: not valid java name */
    public static final long m5511toOpaque8_81llA(long j) {
        return Color.m4763getAlphaimpl(j) == 1.0f ? j : Color.m4760copywmQWz5c$default(j, 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
    }
}
