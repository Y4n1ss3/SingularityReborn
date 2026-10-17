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
import defpackage.gy;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ImageSearchKt {
    private static ImageVector _imageSearch;

    public static final ImageVector getImageSearch(Icons.Outlined outlined) {
        ImageVector imageVector = _imageSearch;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ImageSearch", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder y = gy.y(18.0f, 13.0f, 7.0f, 4.0f, 20.0f);
        y.lineTo(4.0f, 6.0f);
        y.horizontalLineToRelative(5.02f);
        y.curveToRelative(0.05f, -0.71f, 0.22f, -1.38f, 0.48f, -2.0f);
        y.lineTo(4.0f, 4.0f);
        y.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        y.verticalLineToRelative(14.0f);
        y.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        y.horizontalLineToRelative(14.0f);
        y.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        uo.t(y, -5.0f, -2.0f, -2.0f);
        y.moveTo(16.5f, 18.0f);
        y.horizontalLineToRelative(-11.0f);
        y.lineToRelative(2.75f, -3.53f);
        y.lineToRelative(1.96f, 2.36f);
        gy.B(y, 2.75f, -3.54f, 16.5f, 18.0f);
        y.moveTo(19.3f, 8.89f);
        y.curveToRelative(0.44f, -0.7f, 0.7f, -1.51f, 0.7f, -2.39f);
        y.curveTo(20.0f, 4.01f, 17.99f, 2.0f, 15.5f, 2.0f);
        y.reflectiveCurveTo(11.0f, 4.01f, 11.0f, 6.5f);
        y.reflectiveCurveToRelative(2.01f, 4.5f, 4.49f, 4.5f);
        y.curveToRelative(0.88f, 0.0f, 1.7f, -0.26f, 2.39f, -0.7f);
        y.lineTo(21.0f, 13.42f);
        r6.C(y, 22.42f, 12.0f, 19.3f, 8.89f);
        y.moveTo(15.5f, 9.0f);
        y.curveTo(14.12f, 9.0f, 13.0f, 7.88f, 13.0f, 6.5f);
        y.reflectiveCurveTo(14.12f, 4.0f, 15.5f, 4.0f);
        y.reflectiveCurveTo(18.0f, 5.12f, 18.0f, 6.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(y, 16.88f, 9.0f, 15.5f, 9.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _imageSearch = build;
        build.getClass();
        return build;
    }
}
