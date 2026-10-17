package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VisibilityKt {
    private static ImageVector _visibility;

    public static final ImageVector getVisibility(Icons.Outlined outlined) {
        ImageVector imageVector = _visibility;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Visibility", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 6.0f);
        b.curveToRelative(3.79f, 0.0f, 7.17f, 2.13f, 8.82f, 5.5f);
        b.curveTo(19.17f, 14.87f, 15.79f, 17.0f, 12.0f, 17.0f);
        b.reflectiveCurveToRelative(-7.17f, -2.13f, -8.82f, -5.5f);
        b.curveTo(4.83f, 8.13f, 8.21f, 6.0f, 12.0f, 6.0f);
        b.moveToRelative(0.0f, -2.0f);
        b.curveTo(7.0f, 4.0f, 2.73f, 7.11f, 1.0f, 11.5f);
        b.curveTo(2.73f, 15.89f, 7.0f, 19.0f, 12.0f, 19.0f);
        b.reflectiveCurveToRelative(9.27f, -3.11f, 11.0f, -7.5f);
        b.curveTo(21.27f, 7.11f, 17.0f, 4.0f, 12.0f, 4.0f);
        b.close();
        b.moveTo(12.0f, 9.0f);
        b.curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        b.reflectiveCurveTo(13.38f, 14.0f, 12.0f, 14.0f);
        b.reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f);
        b.reflectiveCurveTo(10.62f, 9.0f, 12.0f, 9.0f);
        b.moveToRelative(0.0f, -2.0f);
        b.curveToRelative(-2.48f, 0.0f, -4.5f, 2.02f, -4.5f, 4.5f);
        b.reflectiveCurveTo(9.52f, 16.0f, 12.0f, 16.0f);
        b.reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 14.48f, 7.0f, 12.0f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _visibility = build;
        build.getClass();
        return build;
    }
}
