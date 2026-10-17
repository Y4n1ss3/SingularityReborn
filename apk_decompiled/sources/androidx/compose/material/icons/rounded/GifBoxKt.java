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
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GifBoxKt {
    private static ImageVector _gifBox;

    public static final ImageVector getGifBox(Icons.Rounded rounded) {
        ImageVector imageVector = _gifBox;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.GifBox", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(19.0f, 3.0f, 5.0f);
        d.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        d.verticalLineToRelative(14.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(14.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(5.0f);
        d.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        d.close();
        d.moveTo(10.5f, 10.5f);
        d.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        uf.k(d, 8.5f, 2.0f, 1.0f, -0.5f);
        d.curveToRelative(0.0f, -0.29f, 0.25f, -0.53f, 0.55f, -0.5f);
        d.curveToRelative(0.26f, 0.02f, 0.45f, 0.26f, 0.45f, 0.52f);
        d.verticalLineTo(13.0f);
        d.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        d.horizontalLineToRelative(-1.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        d.verticalLineToRelative(-2.0f);
        d.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        d.horizontalLineTo(10.0f);
        d.curveTo(10.28f, 10.0f, 10.5f, 10.22f, 10.5f, 10.5f);
        d.close();
        d.moveTo(12.0f, 10.0f);
        d.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        d.verticalLineToRelative(3.0f);
        d.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        d.reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f);
        d.verticalLineToRelative(-3.0f);
        d.curveTo(11.5f, 10.22f, 11.72f, 10.0f, 12.0f, 10.0f);
        d.close();
        d.moveTo(14.0f, 14.0f);
        d.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        d.verticalLineToRelative(-3.0f);
        d.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        d.horizontalLineToRelative(2.0f);
        d.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        d.reflectiveCurveTo(16.28f, 11.0f, 16.0f, 11.0f);
        kf0.x(d, -1.5f, 0.5f, 1.0f);
        d.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        d.reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f);
        d.horizontalLineToRelative(-1.0f);
        d.verticalLineToRelative(1.0f);
        d.curveTo(14.5f, 13.78f, 14.28f, 14.0f, 14.0f, 14.0f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gifBox = build;
        build.getClass();
        return build;
    }
}
