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
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AnchorKt {
    private static ImageVector _anchor;

    public static final ImageVector getAnchor(Icons.Rounded rounded) {
        ImageVector imageVector = _anchor;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Anchor", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(13.0f, 9.0f, 7.82f);
        d.curveTo(14.16f, 7.4f, 15.0f, 6.3f, 15.0f, 5.0f);
        d.curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f);
        d.reflectiveCurveTo(9.0f, 3.35f, 9.0f, 5.0f);
        d.curveToRelative(0.0f, 1.3f, 0.84f, 2.4f, 2.0f, 2.82f);
        d.verticalLineTo(9.0f);
        d.horizontalLineTo(9.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        d.verticalLineToRelative(0.0f);
        d.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        d.horizontalLineToRelative(2.0f);
        d.verticalLineToRelative(8.92f);
        d.curveToRelative(-2.22f, -0.33f, -4.59f, -1.68f, -5.55f, -3.37f);
        d.lineToRelative(1.14f, -1.14f);
        d.curveToRelative(0.22f, -0.22f, 0.19f, -0.57f, -0.05f, -0.75f);
        d.lineTo(3.8f, 12.6f);
        d.curveTo(3.47f, 12.35f, 3.0f, 12.59f, 3.0f, 13.0f);
        d.verticalLineToRelative(2.0f);
        d.curveToRelative(0.0f, 3.88f, 4.92f, 7.0f, 9.0f, 7.0f);
        d.reflectiveCurveToRelative(9.0f, -3.12f, 9.0f, -7.0f);
        d.verticalLineToRelative(-2.0f);
        d.curveToRelative(0.0f, -0.41f, -0.47f, -0.65f, -0.8f, -0.4f);
        d.lineToRelative(-2.74f, 2.05f);
        d.curveToRelative(-0.24f, 0.18f, -0.27f, 0.54f, -0.05f, 0.75f);
        d.lineToRelative(1.14f, 1.14f);
        d.curveToRelative(-0.96f, 1.69f, -3.33f, 3.04f, -5.55f, 3.37f);
        d.verticalLineTo(11.0f);
        d.horizontalLineToRelative(2.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        d.verticalLineToRelative(0.0f);
        d.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        k4.w(d, 13.0f, 12.0f, 4.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        d.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        d.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(d, 11.45f, 4.0f, 12.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _anchor = build;
        build.getClass();
        return build;
    }
}
