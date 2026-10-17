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
import defpackage.bv;
import defpackage.gy;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HtmlKt {
    private static ImageVector _html;

    public static final ImageVector getHtml(Icons.Rounded rounded) {
        ImageVector imageVector = _html;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Html", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(21.0f, 15.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.verticalLineTo(9.75f);
        b.curveTo(20.0f, 9.34f, 20.34f, 9.0f, 20.75f, 9.0f);
        b.reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f);
        b.verticalLineToRelative(3.75f);
        b.horizontalLineToRelative(1.75f);
        b.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        b.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        kp0.r(b, 21.0f, 16.0f, 10.49f, 1.0f);
        b.verticalLineToRelative(3.76f);
        b.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        b.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        b.verticalLineTo(10.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineTo(13.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(4.25f);
        b.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        b.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        kf0.r(b, 10.5f, 1.0f, 2.75f);
        b.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        b.reflectiveCurveTo(16.0f, 13.66f, 16.0f, 13.25f);
        bv.t(b, 10.49f, 5.0f, 9.75f);
        b.curveTo(5.0f, 9.34f, 4.66f, 9.0f, 4.25f, 9.0f);
        b.reflectiveCurveTo(3.5f, 9.34f, 3.5f, 9.75f);
        uf.z(b, 11.0f, -2.0f, 9.75f);
        b.curveTo(1.5f, 9.34f, 1.16f, 9.0f, 0.75f, 9.0f);
        b.reflectiveCurveTo(0.0f, 9.34f, 0.0f, 9.75f);
        b.verticalLineToRelative(4.5f);
        b.curveTo(0.0f, 14.66f, 0.34f, 15.0f, 0.75f, 15.0f);
        b.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        kf0.r(b, 12.5f, 2.0f, 1.75f);
        b.curveTo(3.5f, 14.66f, 3.84f, 15.0f, 4.25f, 15.0f);
        b.reflectiveCurveTo(5.0f, 14.66f, 5.0f, 14.25f);
        bv.t(b, 9.75f, 10.25f, 10.5f);
        b.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        b.curveTo(11.0f, 9.34f, 10.66f, 9.0f, 10.25f, 9.0f);
        b.horizontalLineToRelative(-3.5f);
        b.curveTo(6.34f, 9.0f, 6.0f, 9.34f, 6.0f, 9.75f);
        b.curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f);
        b.horizontalLineToRelative(1.0f);
        b.verticalLineToRelative(3.75f);
        b.curveTo(7.75f, 14.66f, 8.09f, 15.0f, 8.5f, 15.0f);
        b.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.e(b, 10.5f, 10.25f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _html = build;
        build.getClass();
        return build;
    }
}
