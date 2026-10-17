package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CachedKt {
    private static ImageVector _cached;

    public static final ImageVector getCached(Icons.Rounded rounded) {
        ImageVector imageVector = _cached;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Cached", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(18.65f, 8.35f, -2.79f, 2.79f);
        e.curveToRelative(-0.32f, 0.32f, -0.1f, 0.86f, 0.35f, 0.86f);
        e.horizontalLineTo(18.0f);
        e.curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
        e.curveToRelative(-0.79f, 0.0f, -1.56f, -0.15f, -2.25f, -0.44f);
        e.curveToRelative(-0.36f, -0.15f, -0.77f, -0.04f, -1.04f, 0.23f);
        e.curveToRelative(-0.51f, 0.51f, -0.33f, 1.37f, 0.34f, 1.64f);
        e.curveToRelative(0.91f, 0.37f, 1.91f, 0.57f, 2.95f, 0.57f);
        e.curveToRelative(4.42f, 0.0f, 8.0f, -3.58f, 8.0f, -8.0f);
        e.horizontalLineToRelative(1.79f);
        e.curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f);
        e.lineToRelative(-2.79f, -2.79f);
        e.curveToRelative(-0.19f, -0.2f, -0.51f, -0.2f, -0.7f, -0.01f);
        e.close();
        e.moveTo(6.0f, 12.0f);
        e.curveToRelative(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f);
        e.curveToRelative(0.79f, 0.0f, 1.56f, 0.15f, 2.25f, 0.44f);
        e.curveToRelative(0.36f, 0.15f, 0.77f, 0.04f, 1.04f, -0.23f);
        e.curveToRelative(0.51f, -0.51f, 0.33f, -1.37f, -0.34f, -1.64f);
        e.curveTo(14.04f, 4.2f, 13.04f, 4.0f, 12.0f, 4.0f);
        e.curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
        e.horizontalLineTo(2.21f);
        e.curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f);
        e.lineToRelative(2.79f, 2.79f);
        e.curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        e.lineToRelative(2.79f, -2.79f);
        e.curveToRelative(0.31f, -0.31f, 0.09f, -0.85f, -0.36f, -0.85f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(e, 6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cached = build;
        build.getClass();
        return build;
    }
}
