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
import defpackage.af0;
import defpackage.bv;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ZoomInKt {
    private static ImageVector _zoomIn;

    public static final ImageVector getZoomIn(Icons.Outlined outlined) {
        ImageVector imageVector = _zoomIn;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ZoomIn", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(15.5f, 14.0f, -0.79f, -0.28f, -0.27f);
        i.curveTo(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
        i.curveTo(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
        i.reflectiveCurveTo(3.0f, 5.91f, 3.0f, 9.5f);
        i.reflectiveCurveTo(5.91f, 16.0f, 9.5f, 16.0f);
        i.curveToRelative(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f);
        i.lineToRelative(0.27f, 0.28f);
        i.verticalLineToRelative(0.79f);
        i.lineToRelative(5.0f, 4.99f);
        bv.o(i, 20.49f, 19.0f, -4.99f, -5.0f);
        i.moveTo(9.5f, 14.0f);
        i.curveTo(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
        i.reflectiveCurveTo(7.01f, 5.0f, 9.5f, 5.0f);
        i.reflectiveCurveTo(14.0f, 7.01f, 14.0f, 9.5f);
        i.reflectiveCurveTo(11.99f, 14.0f, 9.5f, 14.0f);
        k4.r(i, 10.0f, 7.0f, 9.0f, 7.0f);
        bv.q(i, 2.0f, 7.0f, 9.0f, 1.0f);
        af0.v(i, 2.0f, 2.0f, 1.0f, -2.0f);
        i.horizontalLineToRelative(2.0f);
        i.lineTo(12.0f, 9.0f);
        i.horizontalLineToRelative(-2.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _zoomIn = build;
        build.getClass();
        return build;
    }
}
