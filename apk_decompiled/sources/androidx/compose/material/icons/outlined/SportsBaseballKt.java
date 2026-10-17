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
public final class SportsBaseballKt {
    private static ImageVector _sportsBaseball;

    public static final ImageVector getSportsBaseball(Icons.Outlined outlined) {
        ImageVector imageVector = _sportsBaseball;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SportsBaseball", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        b.close();
        b.moveTo(5.61f, 16.78f);
        b.curveTo(4.6f, 15.45f, 4.0f, 13.8f, 4.0f, 12.0f);
        b.reflectiveCurveToRelative(0.6f, -3.45f, 1.61f, -4.78f);
        b.curveTo(7.06f, 8.31f, 8.0f, 10.05f, 8.0f, 12.0f);
        b.reflectiveCurveTo(7.06f, 15.69f, 5.61f, 16.78f);
        b.close();
        b.moveTo(12.0f, 20.0f);
        b.curveToRelative(-1.89f, 0.0f, -3.63f, -0.66f, -5.0f, -1.76f);
        b.curveToRelative(1.83f, -1.47f, 3.0f, -3.71f, 3.0f, -6.24f);
        b.reflectiveCurveTo(8.83f, 7.23f, 7.0f, 5.76f);
        b.curveTo(8.37f, 4.66f, 10.11f, 4.0f, 12.0f, 4.0f);
        b.reflectiveCurveToRelative(3.63f, 0.66f, 5.0f, 1.76f);
        b.curveToRelative(-1.83f, 1.47f, -3.0f, 3.71f, -3.0f, 6.24f);
        b.reflectiveCurveToRelative(1.17f, 4.77f, 3.0f, 6.24f);
        b.curveTo(15.63f, 19.34f, 13.89f, 20.0f, 12.0f, 20.0f);
        b.close();
        b.moveTo(18.39f, 16.78f);
        b.curveTo(16.94f, 15.69f, 16.0f, 13.95f, 16.0f, 12.0f);
        b.reflectiveCurveToRelative(0.94f, -3.69f, 2.39f, -4.78f);
        b.curveTo(19.4f, 8.55f, 20.0f, 10.2f, 20.0f, 12.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 19.4f, 15.45f, 18.39f, 16.78f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsBaseball = build;
        build.getClass();
        return build;
    }
}
