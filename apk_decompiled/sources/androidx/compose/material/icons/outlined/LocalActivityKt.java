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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocalActivityKt {
    private static ImageVector _localActivity;

    public static final ImageVector getLocalActivity(Icons.Outlined outlined) {
        ImageVector imageVector = _localActivity;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.LocalActivity", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(22.0f, 10.0f, 22.0f, 6.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        i.lineTo(4.0f, 4.0f);
        i.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        i.verticalLineToRelative(4.0f);
        i.curveToRelative(1.1f, 0.0f, 1.99f, 0.9f, 1.99f, 2.0f);
        i.reflectiveCurveToRelative(-0.89f, 2.0f, -2.0f, 2.0f);
        i.verticalLineToRelative(4.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(16.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.verticalLineToRelative(-4.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        i.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        i.close();
        i.moveTo(20.0f, 8.54f);
        i.curveToRelative(-1.19f, 0.69f, -2.0f, 1.99f, -2.0f, 3.46f);
        i.reflectiveCurveToRelative(0.81f, 2.77f, 2.0f, 3.46f);
        i.lineTo(20.0f, 18.0f);
        i.lineTo(4.0f, 18.0f);
        i.verticalLineToRelative(-2.54f);
        i.curveToRelative(1.19f, -0.69f, 2.0f, -1.99f, 2.0f, -3.46f);
        i.curveToRelative(0.0f, -1.48f, -0.8f, -2.77f, -1.99f, -3.46f);
        r6.m(i, 4.0f, 6.0f, 16.0f, 2.54f);
        i.moveTo(9.07f, 16.0f);
        i.lineTo(12.0f, 14.12f);
        i.lineTo(14.93f, 16.0f);
        i.lineToRelative(-0.89f, -3.36f);
        i.lineToRelative(2.69f, -2.2f);
        i.lineToRelative(-3.47f, -0.21f);
        i.lineTo(12.0f, 7.0f);
        i.lineToRelative(-1.27f, 3.22f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(i, -3.47f, 0.21f, 2.69f, 2.2f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localActivity = build;
        build.getClass();
        return build;
    }
}
