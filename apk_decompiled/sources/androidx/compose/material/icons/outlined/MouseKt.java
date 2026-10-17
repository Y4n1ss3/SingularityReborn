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
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MouseKt {
    private static ImageVector _mouse;

    public static final ImageVector getMouse(Icons.Outlined outlined) {
        ImageVector imageVector = _mouse;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Mouse", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(20.0f, 9.0f);
        b.curveToRelative(-0.04f, -4.39f, -3.6f, -7.93f, -8.0f, -7.93f);
        b.reflectiveCurveTo(4.04f, 4.61f, 4.0f, 9.0f);
        b.verticalLineToRelative(6.0f);
        b.curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        b.reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f);
        uo.l(b, 20.0f, 9.0f, 18.0f, 9.0f);
        b.horizontalLineToRelative(-5.0f);
        b.lineTo(13.0f, 3.16f);
        b.curveToRelative(2.81f, 0.47f, 4.96f, 2.9f, 5.0f, 5.84f);
        k4.r(b, 11.0f, 3.16f, 11.0f, 9.0f);
        b.lineTo(6.0f, 9.0f);
        b.curveToRelative(0.04f, -2.94f, 2.19f, -5.37f, 5.0f, -5.84f);
        b.close();
        b.moveTo(18.0f, 15.0f);
        b.curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
        b.reflectiveCurveToRelative(-6.0f, -2.69f, -6.0f, -6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.r(b, -4.0f, 12.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mouse = build;
        build.getClass();
        return build;
    }
}
