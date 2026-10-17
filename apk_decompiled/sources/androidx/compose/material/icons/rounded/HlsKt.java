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
import defpackage.fc;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HlsKt {
    private static ImageVector _hls;

    public static final ImageVector getHls(Icons.Rounded rounded) {
        ImageVector imageVector = _hls;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Hls", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(10.75f, 9.0f);
        b.curveTo(10.34f, 9.0f, 10.0f, 9.34f, 10.0f, 9.75f);
        b.verticalLineTo(14.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(2.25f);
        b.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        b.reflectiveCurveToRelative(-0.34f, -0.75f, -0.75f, -0.75f);
        b.horizontalLineTo(11.5f);
        b.verticalLineTo(9.75f);
        b.curveTo(11.5f, 9.34f, 11.16f, 9.0f, 10.75f, 9.0f);
        b.close();
        b.moveTo(19.04f, 10.5f);
        b.curveToRelative(0.1f, 0.29f, 0.38f, 0.5f, 0.71f, 0.5f);
        b.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        b.verticalLineTo(10.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineToRelative(-3.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(1.5f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        uf.k(b, 19.0f, 1.0f, -2.04f, 0.0f);
        b.curveToRelative(-0.1f, -0.29f, -0.38f, -0.5f, -0.71f, -0.5f);
        b.curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f);
        b.verticalLineTo(14.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(3.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-1.5f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineTo(17.0f);
        b.verticalLineToRelative(-1.0f);
        b.lineTo(19.04f, 10.5f);
        b.close();
        b.moveTo(8.0f, 9.75f);
        b.curveTo(8.0f, 9.34f, 7.66f, 9.0f, 7.25f, 9.0f);
        b.reflectiveCurveTo(6.5f, 9.34f, 6.5f, 9.75f);
        uf.z(b, 11.0f, -2.0f, 9.75f);
        b.curveTo(4.5f, 9.34f, 4.16f, 9.0f, 3.75f, 9.0f);
        b.reflectiveCurveTo(3.0f, 9.34f, 3.0f, 9.75f);
        b.verticalLineToRelative(4.5f);
        b.curveTo(3.0f, 14.66f, 3.34f, 15.0f, 3.75f, 15.0f);
        b.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        kf0.r(b, 12.5f, 2.0f, 1.75f);
        b.curveTo(6.5f, 14.66f, 6.84f, 15.0f, 7.25f, 15.0f);
        b.reflectiveCurveTo(8.0f, 14.66f, 8.0f, 14.25f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(b, 9.75f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hls = build;
        build.getClass();
        return build;
    }
}
