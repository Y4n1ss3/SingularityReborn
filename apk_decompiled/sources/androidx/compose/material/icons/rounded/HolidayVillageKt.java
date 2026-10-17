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
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HolidayVillageKt {
    private static ImageVector _holidayVillage;

    public static final ImageVector getHolidayVillage(Icons.Rounded rounded) {
        ImageVector imageVector = _holidayVillage;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.HolidayVillage", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(17.0f, 20.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineTo(8.76f);
        b.curveToRelative(0.0f, -0.27f, -0.11f, -0.52f, -0.29f, -0.71f);
        b.lineToRelative(-3.76f, -3.76f);
        b.curveTo(13.76f, 4.11f, 13.51f, 4.0f, 13.24f, 4.0f);
        b.curveToRelative(-0.89f, 0.0f, -1.34f, 1.08f, -0.71f, 1.71f);
        b.lineToRelative(3.32f, 3.32f);
        b.curveTo(15.95f, 9.12f, 16.0f, 9.25f, 16.0f, 9.38f);
        b.verticalLineTo(19.0f);
        b.curveTo(16.0f, 19.55f, 16.45f, 20.0f, 17.0f, 20.0f);
        b.close();
        b.moveTo(21.0f, 20.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineTo(7.11f);
        b.curveToRelative(0.0f, -0.26f, -0.11f, -0.52f, -0.29f, -0.71f);
        b.lineToRelative(-2.1f, -2.11f);
        b.curveTo(19.42f, 4.11f, 19.16f, 4.0f, 18.9f, 4.0f);
        b.curveTo(18.0f, 4.0f, 17.56f, 5.08f, 18.19f, 5.71f);
        b.lineToRelative(1.67f, 1.67f);
        b.curveTo(19.95f, 7.47f, 20.0f, 7.6f, 20.0f, 7.73f);
        b.verticalLineTo(19.0f);
        b.curveTo(20.0f, 19.55f, 20.45f, 20.0f, 21.0f, 20.0f);
        b.close();
        b.moveTo(8.0f, 15.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        b.verticalLineToRelative(4.0f);
        b.horizontalLineToRelative(4.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-8.59f);
        b.curveToRelative(0.0f, -0.27f, -0.11f, -0.52f, -0.29f, -0.71f);
        b.lineToRelative(-5.0f, -5.0f);
        b.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        b.lineToRelative(-5.0f, 5.0f);
        b.curveTo(2.11f, 9.89f, 2.0f, 10.15f, 2.0f, 10.41f);
        b.verticalLineTo(19.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(4.0f);
        b.verticalLineToRelative(-4.0f);
        b.curveTo(7.0f, 15.45f, 7.45f, 15.0f, 8.0f, 15.0f);
        b.close();
        b.moveTo(8.0f, 13.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 8.55f, 13.0f, 8.0f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _holidayVillage = build;
        build.getClass();
        return build;
    }
}
