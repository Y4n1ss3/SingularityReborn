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
import defpackage.gy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PolylineKt {
    private static ImageVector _polyline;

    public static final ImageVector getPolyline(Icons.Rounded rounded) {
        ImageVector imageVector = _polyline;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Polyline", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = gy.p(10.04f, 6.85f, 7.3f, 10.0f, 4.5f);
        p.curveTo(3.67f, 10.0f, 3.0f, 10.67f, 3.0f, 11.5f);
        p.verticalLineToRelative(3.0f);
        p.curveTo(3.0f, 15.33f, 3.67f, 16.0f, 4.5f, 16.0f);
        p.horizontalLineToRelative(3.0f);
        p.curveToRelative(0.14f, 0.0f, 0.27f, -0.02f, 0.39f, -0.05f);
        p.lineTo(15.0f, 19.5f);
        p.verticalLineToRelative(1.0f);
        p.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        p.horizontalLineToRelative(3.0f);
        p.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        p.verticalLineToRelative(-3.0f);
        p.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        p.horizontalLineToRelative(-3.0f);
        p.curveToRelative(-0.75f, 0.0f, -1.37f, 0.55f, -1.48f, 1.27f);
        p.lineTo(9.0f, 14.26f);
        p.verticalLineTo(11.5f);
        p.curveToRelative(0.0f, -0.12f, -0.01f, -0.24f, -0.04f, -0.36f);
        p.lineTo(11.7f, 8.0f);
        p.horizontalLineToRelative(2.8f);
        p.curveTo(15.33f, 8.0f, 16.0f, 7.33f, 16.0f, 6.5f);
        p.verticalLineToRelative(-3.0f);
        p.curveTo(16.0f, 2.67f, 15.33f, 2.0f, 14.5f, 2.0f);
        p.horizontalLineToRelative(-3.0f);
        p.curveTo(10.67f, 2.0f, 10.0f, 2.67f, 10.0f, 3.5f);
        p.verticalLineToRelative(3.0f);
        p.curveTo(10.0f, 6.62f, 10.01f, 6.74f, 10.04f, 6.85f);
        p.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, p.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _polyline = build;
        build.getClass();
        return build;
    }
}
