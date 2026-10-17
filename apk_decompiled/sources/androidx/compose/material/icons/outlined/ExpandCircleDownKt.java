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
import defpackage.gy;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ExpandCircleDownKt {
    private static ImageVector _expandCircleDown;

    public static final ImageVector getExpandCircleDown(Icons.Outlined outlined) {
        ImageVector imageVector = _expandCircleDown;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ExpandCircleDown", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(15.08f, 9.59f, 12.0f, 12.67f);
        i.lineTo(8.92f, 9.59f);
        i.lineTo(7.5f, 11.0f);
        i.lineToRelative(4.5f, 4.5f);
        gy.B(i, 4.5f, -4.5f, 15.08f, 9.59f);
        i.moveTo(12.0f, 2.0f);
        i.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        i.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        i.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        i.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        i.close();
        i.moveTo(12.0f, 20.0f);
        i.curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
        i.reflectiveCurveToRelative(3.58f, -8.0f, 8.0f, -8.0f);
        i.reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(i, 16.42f, 20.0f, 12.0f, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _expandCircleDown = build;
        build.getClass();
        return build;
    }
}
